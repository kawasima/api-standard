package net.unit8.apistandard.resourcefilter;

import net.unit8.apistandard.resourcefilter.parser.ResourceFilterLexer;
import net.unit8.apistandard.resourcefilter.parser.ResourceFilterParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ResourceFilter {
    public List<ResourceField> parse(String bnfString) {
        if (bnfString == null) return Collections.emptyList();

        ResourceFilterLexer lexer = new ResourceFilterLexer(CharStreams.fromString(bnfString));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ResourceFilterParser parser = new ResourceFilterParser(tokenStream);
        FieldsExpressionVisitor fieldsExpressionVisitor = new FieldsExpressionVisitor();
        return Optional.ofNullable(fieldsExpressionVisitor.visitFields(parser.fields()))
                .orElse(Collections.emptyList());
    }
}
