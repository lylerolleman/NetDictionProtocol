// Generated from C:/Users/Lyle/IdeaProjects/NetDictionProtocol/src/protocol\NetDiction.g4 by ANTLR 4.5.3
package protocol.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NetDictionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, COMMAND=2, DISCONNECT=3, PING=4, SC=5, QUOTE=6, NUMBER=7, ID=8, 
		STRING=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TYPE", "COMMAND", "DISCONNECT", "PING", "SC", "QUOTE", "DIGIT", "NUMBER", 
		"ID", "STRING", "WS"
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


	public NetDictionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NetDiction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fV\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\6\t>\n\t\r\t\16\t?\3\n\3\n\3\n\7\nE\n\n\f\n\16\nH\13"+
		"\n\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\13\3\13\3\f\3\f\3\f\3\f\2"+
		"\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\n\25\13\27\f\3\2\4\5\2C\\a"+
		"ac|\5\2\13\f\17\17\"\"X\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\31\3\2\2\2\5\36\3\2\2\2\7&\3\2\2\2\t\61\3\2\2\2\13\66\3\2\2"+
		"\2\r8\3\2\2\2\17:\3\2\2\2\21=\3\2\2\2\23A\3\2\2\2\25I\3\2\2\2\27R\3\2"+
		"\2\2\31\32\7V\2\2\32\33\7[\2\2\33\34\7R\2\2\34\35\7G\2\2\35\4\3\2\2\2"+
		"\36\37\7E\2\2\37 \7Q\2\2 !\7O\2\2!\"\7O\2\2\"#\7C\2\2#$\7P\2\2$%\7F\2"+
		"\2%\6\3\2\2\2&\'\7F\2\2\'(\7K\2\2()\7U\2\2)*\7E\2\2*+\7Q\2\2+,\7P\2\2"+
		",-\7P\2\2-.\7G\2\2./\7E\2\2/\60\7V\2\2\60\b\3\2\2\2\61\62\7R\2\2\62\63"+
		"\7K\2\2\63\64\7P\2\2\64\65\7I\2\2\65\n\3\2\2\2\66\67\7=\2\2\67\f\3\2\2"+
		"\289\7$\2\29\16\3\2\2\2:;\4\62;\2;\20\3\2\2\2<>\5\17\b\2=<\3\2\2\2>?\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\22\3\2\2\2AF\t\2\2\2BE\t\2\2\2CE\5\17\b\2"+
		"DB\3\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\24\3\2\2\2HF\3\2\2"+
		"\2IM\5\r\7\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2"+
		"\2\2OM\3\2\2\2PQ\5\r\7\2Q\26\3\2\2\2RS\t\3\2\2ST\3\2\2\2TU\b\f\2\2U\30"+
		"\3\2\2\2\7\2?DFM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}