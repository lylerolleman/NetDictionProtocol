// Generated from C:/Users/Lyle/IdeaProjects/NetDictionProtocol/src/protocol\NetDiction.g4 by ANTLR 4.5.3
package protocol.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NetDictionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, COMMAND=2, DISCONNECT=3, PING=4, SC=5, QUOTE=6, NUMBER=7, ID=8, 
		STRING=9, WS=10;
	public static final int
		RULE_commands = 0, RULE_command = 1, RULE_type = 2, RULE_commandMessage = 3, 
		RULE_disconnect = 4, RULE_ping = 5;
	public static final String[] ruleNames = {
		"commands", "command", "type", "commandMessage", "disconnect", "ping"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TYPE'", "'COMMAND'", "'DISCONNECT'", "'PING'", "';'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPE", "COMMAND", "DISCONNECT", "PING", "SC", "QUOTE", "NUMBER", 
		"ID", "STRING", "WS"
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
	public String getGrammarFileName() { return "NetDiction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NetDictionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << COMMAND) | (1L << DISCONNECT) | (1L << PING))) != 0)) {
				{
				{
				setState(12);
				command();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommandContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CommandMessageContext commandMessage() {
			return getRuleContext(CommandMessageContext.class,0);
		}
		public DisconnectContext disconnect() {
			return getRuleContext(DisconnectContext.class,0);
		}
		public PingContext ping() {
			return getRuleContext(PingContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				type();
				}
				break;
			case COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				commandMessage();
				}
				break;
			case DISCONNECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				disconnect();
				}
				break;
			case PING:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				ping();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(NetDictionParser.TYPE, 0); }
		public TerminalNode STRING() { return getToken(NetDictionParser.STRING, 0); }
		public TerminalNode SC() { return getToken(NetDictionParser.SC, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(TYPE);
			setState(25);
			match(STRING);
			setState(26);
			match(SC);
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

	public static class CommandMessageContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(NetDictionParser.COMMAND, 0); }
		public TerminalNode STRING() { return getToken(NetDictionParser.STRING, 0); }
		public TerminalNode SC() { return getToken(NetDictionParser.SC, 0); }
		public CommandMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).enterCommandMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).exitCommandMessage(this);
		}
	}

	public final CommandMessageContext commandMessage() throws RecognitionException {
		CommandMessageContext _localctx = new CommandMessageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commandMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(COMMAND);
			setState(29);
			match(STRING);
			setState(30);
			match(SC);
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

	public static class DisconnectContext extends ParserRuleContext {
		public TerminalNode DISCONNECT() { return getToken(NetDictionParser.DISCONNECT, 0); }
		public TerminalNode SC() { return getToken(NetDictionParser.SC, 0); }
		public DisconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).enterDisconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).exitDisconnect(this);
		}
	}

	public final DisconnectContext disconnect() throws RecognitionException {
		DisconnectContext _localctx = new DisconnectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DISCONNECT);
			setState(33);
			match(SC);
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

	public static class PingContext extends ParserRuleContext {
		public TerminalNode PING() { return getToken(NetDictionParser.PING, 0); }
		public TerminalNode SC() { return getToken(NetDictionParser.SC, 0); }
		public PingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).enterPing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetDictionListener ) ((NetDictionListener)listener).exitPing(this);
		}
	}

	public final PingContext ping() throws RecognitionException {
		PingContext _localctx = new PingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(PING);
			setState(36);
			match(SC);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2&\2\21\3\2\2\2\4\30\3\2\2\2\6\32\3"+
		"\2\2\2\b\36\3\2\2\2\n\"\3\2\2\2\f%\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2"+
		"\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2"+
		"\24\31\5\6\4\2\25\31\5\b\5\2\26\31\5\n\6\2\27\31\5\f\7\2\30\24\3\2\2\2"+
		"\30\25\3\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\7\3\2\2"+
		"\33\34\7\13\2\2\34\35\7\7\2\2\35\7\3\2\2\2\36\37\7\4\2\2\37 \7\13\2\2"+
		" !\7\7\2\2!\t\3\2\2\2\"#\7\5\2\2#$\7\7\2\2$\13\3\2\2\2%&\7\6\2\2&\'\7"+
		"\7\2\2\'\r\3\2\2\2\4\21\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}