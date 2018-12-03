package net.unit8.apistandard.resourcefilter;

import org.antlr.v4.runtime.tree.*;

import java.util.List;

import static net.unit8.apistandard.resourcefilter.parser.ResourceFilterParser.*;

public class ResourceFilterVisitor implements ParseTreeVisitor<Void> {
    private ResourceField root = new ResourceField("root");
    private ResourceField current = root;

    @Override
    public Void visit(ParseTree tree) {
        FieldsContext fields = (FieldsContext) tree;
        return fields.fields_expression().accept(this);
    }

    @Override
    public Void visitChildren(RuleNode node) {
        if (node instanceof FieldContext) {
            current.addChild(new ResourceField(node.getText()));
            return null;
        } else if (node instanceof Field_setContext) {
            ((Field_setContext) node).qualified_field().accept(this);
            Field_setContext fieldSet = ((Field_setContext) node).field_set();
            if (fieldSet != null) return fieldSet.accept(this);
        } else if (node instanceof Qualified_fieldContext) {
            Qualified_fieldContext qualifiedField = (Qualified_fieldContext) node;
            qualifiedField.field().accept(this);
            if (qualifiedField.fields_expression() != null) {
                current = current.lastChild();
                qualifiedField.fields_expression().accept(this);
            }
            return null;
        } else if (node instanceof Fields_expressionContext) {
            return ((Fields_expressionContext) node).field_set().accept(this);
        } else {
            for (int i=0; i < node.getChildCount(); i++) {
                node.getChild(i).accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Void visitErrorNode(ErrorNode node) {
        return null;
    }

    public List<ResourceField> getResourceFields() {
        return root.getChildren();
    }
}