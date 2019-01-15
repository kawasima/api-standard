// Generated from ResourceFilter.g4 by ANTLR 4.7.1

package net.unit8.apistandard.resourcefilter.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ResourceFilterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ResourceFilterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ResourceFilterParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(ResourceFilterParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResourceFilterParser#fields_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields_expression(ResourceFilterParser.Fields_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResourceFilterParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(ResourceFilterParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResourceFilterParser#field_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_set(ResourceFilterParser.Field_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResourceFilterParser#qualified_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_field(ResourceFilterParser.Qualified_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ResourceFilterParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ResourceFilterParser.FieldContext ctx);
}