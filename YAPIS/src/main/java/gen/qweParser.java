package gen;// Generated from D:/JavaProjects/YAPIS/src\qwe.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qweParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, MoreLess=15, ID=16, NUMBER=17, 
		SPACES=18, L_WS=19;
	public static final int
		RULE_blockIf = 0, RULE_blockElse = 1, RULE_startLoop = 2, RULE_ifBody = 3, 
		RULE_program = 4, RULE_statement = 5, RULE_assign = 6, RULE_add = 7, RULE_print = 8, 
		RULE_ifg = 9, RULE_loop = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"blockIf", "blockElse", "startLoop", "ifBody", "program", "statement", 
			"assign", "add", "print", "ifg", "loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.size'", "'begin'", "'end'", "'let'", "'be'", "'{'", "','", "'}'", 
			"'add'", "'to'", "'print'", "'if'", "'else {'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "MoreLess", "ID", "NUMBER", "SPACES", "L_WS"
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
	public String getGrammarFileName() { return "qwe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qweParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BlockIfContext extends ParserRuleContext {
		public BlockIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockIfContext blockIf() throws RecognitionException {
		BlockIfContext _localctx = new BlockIfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_blockIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class BlockElseContext extends ParserRuleContext {
		public BlockElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterBlockElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitBlockElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitBlockElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockElseContext blockElse() throws RecognitionException {
		BlockElseContext _localctx = new BlockElseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StartLoopContext extends ParserRuleContext {
		public StartLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterStartLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitStartLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitStartLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartLoopContext startLoop() throws RecognitionException {
		StartLoopContext _localctx = new StartLoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class IfBodyContext extends ParserRuleContext {
		public TerminalNode MoreLess() { return getToken(qweParser.MoreLess, 0); }
		public List<TerminalNode> ID() { return getTokens(qweParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(qweParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(qweParser.NUMBER, 0); }
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(ID);
			setState(29);
			match(T__0);
			}
			setState(31);
			match(MoreLess);
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(32);
				match(ID);
				setState(33);
				match(T__0);
				}
				break;
			case NUMBER:
				{
				setState(34);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13))) != 0) );
			setState(43);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfgContext ifg() {
			return getRuleContext(IfgContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				assign();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				add();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				print();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				ifg();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				loop();
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(qweParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(qweParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(qweParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(qweParser.NUMBER, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
			match(ID);
			setState(54);
			match(T__4);
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(55);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(56);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(57);
				match(T__5);
				setState(58);
				match(NUMBER);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					match(T__6);
					setState(60);
					match(NUMBER);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(65);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AddContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(qweParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(qweParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(qweParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(qweParser.NUMBER, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__8);
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(69);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(70);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(71);
				match(T__5);
				setState(72);
				match(NUMBER);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(T__6);
					setState(74);
					match(NUMBER);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(79);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			match(T__9);
			setState(83);
			match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(qweParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(qweParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__10);
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class IfgContext extends ParserRuleContext {
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public BlockIfContext blockIf() {
			return getRuleContext(BlockIfContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterIfg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitIfg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitIfg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfgContext ifg() throws RecognitionException {
		IfgContext _localctx = new IfgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__11);
			setState(89);
			ifBody();
			setState(90);
			match(T__5);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				statement();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13))) != 0) );
			setState(96);
			blockIf();
			setState(97);
			match(T__7);
			setState(98);
			match(T__12);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13))) != 0) );
			setState(104);
			match(T__7);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(qweParser.NUMBER, 0); }
		public StartLoopContext startLoop() {
			return getRuleContext(StartLoopContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qweListener ) ((qweListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qweVisitor ) return ((qweVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__13);
			setState(107);
			match(NUMBER);
			setState(108);
			match(T__5);
			setState(109);
			startLoop();
			setState(110);
			add();
			setState(111);
			match(T__7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5&\n\5\3"+
		"\6\3\6\6\6*\n\6\r\6\16\6+\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\65\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b@\n\b\r\b\16\bA\3\b\5\bE\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\6\tN\n\t\r\t\16\tO\3\t\5\tS\n\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\6\13_\n\13\r\13\16\13`\3\13\3\13\3\13\3\13"+
		"\6\13g\n\13\r\13\16\13h\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\2\2"+
		"\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\22\23\2v\2\30\3\2\2\2\4\32\3\2\2"+
		"\2\6\34\3\2\2\2\b\36\3\2\2\2\n\'\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\20"+
		"F\3\2\2\2\22W\3\2\2\2\24Z\3\2\2\2\26l\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2"+
		"\2\32\33\3\2\2\2\33\5\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36\37\7\22\2"+
		"\2\37 \7\3\2\2 !\3\2\2\2!%\7\21\2\2\"#\7\22\2\2#&\7\3\2\2$&\7\23\2\2%"+
		"\"\3\2\2\2%$\3\2\2\2&\t\3\2\2\2\')\7\4\2\2(*\5\f\7\2)(\3\2\2\2*+\3\2\2"+
		"\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\5\2\2.\13\3\2\2\2/\65\5\16\b\2\60"+
		"\65\5\20\t\2\61\65\5\22\n\2\62\65\5\24\13\2\63\65\5\26\f\2\64/\3\2\2\2"+
		"\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\r\3\2\2\2"+
		"\66\67\7\6\2\2\678\7\22\2\28D\7\7\2\29E\7\23\2\2:E\7\22\2\2;<\7\b\2\2"+
		"<?\7\23\2\2=>\7\t\2\2>@\7\23\2\2?=\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2"+
		"\2BC\3\2\2\2CE\7\n\2\2D9\3\2\2\2D:\3\2\2\2D;\3\2\2\2E\17\3\2\2\2FR\7\13"+
		"\2\2GS\7\23\2\2HS\7\22\2\2IJ\7\b\2\2JM\7\23\2\2KL\7\t\2\2LN\7\23\2\2M"+
		"K\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7\n\2\2RG\3\2\2\2"+
		"RH\3\2\2\2RI\3\2\2\2ST\3\2\2\2TU\7\f\2\2UV\7\22\2\2V\21\3\2\2\2WX\7\r"+
		"\2\2XY\t\2\2\2Y\23\3\2\2\2Z[\7\16\2\2[\\\5\b\5\2\\^\7\b\2\2]_\5\f\7\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\2\2\2cd\7\n\2\2"+
		"df\7\17\2\2eg\5\f\7\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2"+
		"\2jk\7\n\2\2k\25\3\2\2\2lm\7\20\2\2mn\7\23\2\2no\7\b\2\2op\5\6\4\2pq\5"+
		"\20\t\2qr\7\n\2\2r\27\3\2\2\2\13%+\64ADOR`h";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}