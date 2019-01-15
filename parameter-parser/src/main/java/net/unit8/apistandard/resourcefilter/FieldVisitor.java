package net.unit8.apistandard.resourcefilter;

import net.unit8.apistandard.resourcefilter.parser.ResourceFilterBaseVisitor;
import net.unit8.apistandard.resourcefilter.parser.ResourceFilterParser.*;

import java.util.List;

public class FieldVisitor extends ResourceFilterBaseVisitor<ResourceField> {
    private FieldsExpressionVisitor fieldsExpressionVisitor = new FieldsExpressionVisitor();

    @Override public ResourceField visitField(FieldContext ctx) {
        return new ResourceField(ctx.getText());
    }

    @Override
    public ResourceField visitQualified_field(Qualified_fieldContext ctx) {
        ResourceField field = ctx.field().accept(this);
        if (ctx.fields_expression() != null) {
            List<ResourceField> resourceFields = ctx.fields_expression().accept(fieldsExpressionVisitor);
            resourceFields.forEach(field::addChild);
        }
        return field;
    }
}
