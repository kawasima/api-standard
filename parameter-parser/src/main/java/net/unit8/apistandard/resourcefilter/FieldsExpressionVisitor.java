package net.unit8.apistandard.resourcefilter;

import net.unit8.apistandard.resourcefilter.parser.ResourceFilterBaseVisitor;
import net.unit8.apistandard.resourcefilter.parser.ResourceFilterParser.*;

import java.util.ArrayList;
import java.util.List;

public class FieldsExpressionVisitor extends ResourceFilterBaseVisitor<List<ResourceField>> {
    @Override
    public List<ResourceField> visitFields_expression(Fields_expressionContext ctx) {
        return ctx.field_set().accept(this);
    }

    @Override
    public List<ResourceField> visitField_set(Field_setContext ctx) {
        Qualified_fieldContext qualified_field = ctx.qualified_field();
        FieldVisitor fieldVisitor = new FieldVisitor();
        ResourceField field = qualified_field.accept(fieldVisitor);

        List<ResourceField> fields = new ArrayList<>();
        fields.add(field);

        if (ctx.field_set() != null) {
            fields.addAll(ctx.field_set().accept(this));
        }
        return fields;
    }
}
