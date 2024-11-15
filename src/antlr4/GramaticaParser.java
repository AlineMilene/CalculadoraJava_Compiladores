package antlr4;

// Generated from Gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape" })
public class GramaticaParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, NUMBER = 8,
			NEWLINE = 9,
			WS = 10;
	public static final int RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;

	private static String[] makeRuleNames() {
		return new String[] {
				"prog", "stat", "expr"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'print'", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, "NUMBER", "NEWLINE",
				"WS"
		};
	}

	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() {
		return "Gramatica.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}

		public StatContext stat(int i) {
			return getRuleContext(StatContext.class, i);
		}

		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterProg(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(6);
							stat();
						}
					}
					setState(9);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 262L) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stat;
		}

		public StatContext() {
		}

		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(GramaticaParser.NEWLINE, 0);
		}

		public PrintStmtContext(StatContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterPrintStmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitPrintStmt(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode NEWLINE() {
			return getToken(GramaticaParser.NEWLINE, 0);
		}

		public PrintExprContext(StatContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterPrintExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitPrintExpr(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__1:
				case NUMBER:
					_localctx = new PrintExprContext(_localctx);
					enterOuterAlt(_localctx, 1); {
					setState(11);
					expr(0);
					setState(12);
					match(NEWLINE);
				}
					break;
				case T__0:
					_localctx = new PrintStmtContext(_localctx);
					enterOuterAlt(_localctx, 2); {
					setState(14);
					match(T__0);
					setState(15);
					match(T__1);
					setState(16);
					expr(0);
					setState(17);
					match(T__2);
					setState(18);
					match(NEWLINE);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		public ExprContext() {
		}

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() {
			return getToken(GramaticaParser.NUMBER, 0);
		}

		public NumberContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterNumber(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitNumber(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public MulDivContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterMulDiv(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitMulDiv(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public AddSubContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterAddSub(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitAddSub(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ParensContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).enterParens(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof GramaticaListener)
				((GramaticaListener) listener).exitParens(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case T__1: {
						_localctx = new ParensContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(23);
						match(T__1);
						setState(24);
						expr(0);
						setState(25);
						match(T__2);
					}
						break;
					case NUMBER: {
						_localctx = new NumberContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(27);
						match(NUMBER);
					}
						break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(36);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
								case 1: {
									_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(30);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(31);
									_la = _input.LA(1);
									if (!(_la == T__3 || _la == T__4)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(32);
									expr(5);
								}
									break;
								case 2: {
									_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(33);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(34);
									_la = _input.LA(1);
									if (!(_la == T__5 || _la == T__6)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF)
											matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(35);
									expr(4);
								}
									break;
							}
						}
					}
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 2:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 4);
			case 1:
				return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u0001\n*\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
			+
			"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000" +
			"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001\u0002" +
			"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002" +
			"\u001d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
			"\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001\u0002" +
			"\u0000\u0001\u0004\u0003\u0000\u0002\u0004\u0000\u0002\u0001\u0000\u0004" +
			"\u0005\u0001\u0000\u0006\u0007+\u0000\u0007\u0001\u0000\u0000\u0000\u0002" +
			"\u0014\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u0006" +
			"\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\t\u0001" +
			"\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000" +
			"\u0000\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0003\u0004\u0002\u0000" +
			"\f\r\u0005\t\u0000\u0000\r\u0015\u0001\u0000\u0000\u0000\u000e\u000f\u0005" +
			"\u0001\u0000\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0003" +
			"\u0004\u0002\u0000\u0011\u0012\u0005\u0003\u0000\u0000\u0012\u0013\u0005" +
			"\t\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u000b\u0001\u0000" +
			"\u0000\u0000\u0014\u000e\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000" +
			"\u0000\u0000\u0016\u0017\u0006\u0002\uffff\uffff\u0000\u0017\u0018\u0005" +
			"\u0002\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005" +
			"\u0003\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u001d\u0005" +
			"\b\u0000\u0000\u001c\u0016\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000" +
			"\u0000\u0000\u001d&\u0001\u0000\u0000\u0000\u001e\u001f\n\u0004\u0000" +
			"\u0000\u001f \u0007\u0000\u0000\u0000 %\u0003\u0004\u0002\u0005!\"\n\u0003" +
			"\u0000\u0000\"#\u0007\u0001\u0000\u0000#%\u0003\u0004\u0002\u0004$\u001e" +
			"\u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000" +
			"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0005\u0001" +
			"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000\u0005\t\u0014\u001c$&";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}