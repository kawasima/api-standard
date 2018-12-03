package net.unit8.apistandard.resourcefilter;

import net.unit8.apistandard.resourcefilter.parser.ResourceFilterLexer;
import net.unit8.apistandard.resourcefilter.parser.ResourceFilterParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class ResourceFilter {
    public List<ResourceField> parse(String bnfString) {
        ResourceFilterLexer lexer = new ResourceFilterLexer(CharStreams.fromString(bnfString));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ResourceFilterParser parser = new ResourceFilterParser(tokenStream);
        ResourceFilterVisitor visitor = new ResourceFilterVisitor();
        visitor.visit(parser.fields());
        return visitor.getResourceFields();
    }
}
