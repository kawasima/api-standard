// Generated from ResourceFilter.g4 by ANTLR 4.7.1

package net.unit8.apistandard.resourcefilter.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ResourceFilterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, DASH_LETTER_DIGIT=5, DASH=6, LETTER=7, 
		DIGIT=8, WS=9;
	public static final int
		RULE_fields = 0, RULE_fields_expression = 1, RULE_negation = 2, RULE_field_set = 3, 
		RULE_qualified_field = 4, RULE_field = 5;
	public static final String[] ruleNames = {
		"fields", "fields_expression", "negation", "field_set", "qualified_field", 
		"field"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'!'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "DASH_LETTER_DIGIT", "DASH", "LETTER", "DIGIT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ResourceFilter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ResourceFilterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FieldsContext extends ParserRuleContext {
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Fields_expressionContext fields_expression() {
			return getRuleContext(Fields_expressionContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResourceFilterVisitor ) return ((ResourceFilterVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fields);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				negation();
				setState(13);
				fields_expression();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				fields_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fields_expressionContext extends ParserRuleContext {
		public Field_setContext field_set() {
			return getRuleContext(Field_setContext.class,0);
		}
		public Fields_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).enterFields_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).exitFields_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResourceFilterVisitor ) return ((ResourceFilterVisitor<? extends T>)visitor).visitFields_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fields_expressionContext fields_expression() throws RecognitionException {
		Fields_expressionContext _localctx = new Fields_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fields_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			field_set();
			setState(20);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationContext extends ParserRuleContext {
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResourceFilterVisitor ) return ((ResourceFilterVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_setContext extends ParserRuleContext {
		public Qualified_fieldContext qualified_field() {
			return getRuleContext(Qualified_fieldContext.class,0);
		}
		public Field_setContext field_set() {
			return getRuleContext(Field_setContext.class,0);
		}
		public Field_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).enterField_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).exitField_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResourceFilterVisitor ) return ((ResourceFilterVisitor<? extends T>)visitor).visitField_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_setContext field_set() throws RecognitionException {
		Field_setContext _localctx = new Field_setContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_set);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				qualified_field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				qualified_field();
				setState(26);
				match(T__3);
				setState(27);
				field_set();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_fieldContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Fields_expressionContext fields_expression() {
			return getRuleContext(Fields_expressionContext.class,0);
		}
		public Qualified_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).enterQualified_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).exitQualified_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResourceFilterVisitor ) return ((ResourceFilterVisitor<? extends T>)visitor).visitQualified_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_fieldContext qualified_field() throws RecognitionException {
		Qualified_fieldContext _localctx = new Qualified_fieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualified_field);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				field();
				setState(33);
				fields_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public List<TerminalNode> DASH_LETTER_DIGIT() { return getTokens(ResourceFilterParser.DASH_LETTER_DIGIT); }
		public TerminalNode DASH_LETTER_DIGIT(int i) {
			return getToken(ResourceFilterParser.DASH_LETTER_DIGIT, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResourceFilterListener ) ((ResourceFilterListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResourceFilterVisitor ) return ((ResourceFilterVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==DASH_LETTER_DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DASH_LETTER_DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\6\3\6\5\6&\n\6"+
		"\3\7\6\7)\n\7\r\7\16\7*\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\7\7\2*\2\22\3\2"+
		"\2\2\4\24\3\2\2\2\6\30\3\2\2\2\b\37\3\2\2\2\n%\3\2\2\2\f(\3\2\2\2\16\17"+
		"\5\6\4\2\17\20\5\4\3\2\20\23\3\2\2\2\21\23\5\4\3\2\22\16\3\2\2\2\22\21"+
		"\3\2\2\2\23\3\3\2\2\2\24\25\7\3\2\2\25\26\5\b\5\2\26\27\7\4\2\2\27\5\3"+
		"\2\2\2\30\31\7\5\2\2\31\7\3\2\2\2\32 \5\n\6\2\33\34\5\n\6\2\34\35\7\6"+
		"\2\2\35\36\5\b\5\2\36 \3\2\2\2\37\32\3\2\2\2\37\33\3\2\2\2 \t\3\2\2\2"+
		"!&\5\f\7\2\"#\5\f\7\2#$\5\4\3\2$&\3\2\2\2%!\3\2\2\2%\"\3\2\2\2&\13\3\2"+
		"\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\r\3\2\2\2\6"+
		"\22\37%*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}