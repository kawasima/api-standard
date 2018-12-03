// Generated from ResourceFilter.g4 by ANTLR 4.7.1

package net.unit8.apistandard.resourcefilter.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ResourceFilterParser}.
 */
public interface ResourceFilterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ResourceFilterParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(ResourceFilterParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResourceFilterParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(ResourceFilterParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResourceFilterParser#fields_expression}.
	 * @param ctx the parse tree
	 */
	void enterFields_expression(ResourceFilterParser.Fields_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResourceFilterParser#fields_expression}.
	 * @param ctx the parse tree
	 */
	void exitFields_expression(ResourceFilterParser.Fields_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResourceFilterParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(ResourceFilterParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResourceFilterParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(ResourceFilterParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResourceFilterParser#field_set}.
	 * @param ctx the parse tree
	 */
	void enterField_set(ResourceFilterParser.Field_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResourceFilterParser#field_set}.
	 * @param ctx the parse tree
	 */
	void exitField_set(ResourceFilterParser.Field_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResourceFilterParser#qualified_field}.
	 * @param ctx the parse tree
	 */
	void enterQualified_field(ResourceFilterParser.Qualified_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResourceFilterParser#qualified_field}.
	 * @param ctx the parse tree
	 */
	void exitQualified_field(ResourceFilterParser.Qualified_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ResourceFilterParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ResourceFilterParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ResourceFilterParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ResourceFilterParser.FieldContext ctx);
}