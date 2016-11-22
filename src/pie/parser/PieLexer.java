// Generated from Pie.g4 by ANTLR 4.5

  package pie.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PieLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NL=23, ID=24, CHAR=25, 
		STRING=26, INT=27, FLOAT=28, WS=29, SL_COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "NL", "ID", "LETTER", "CHAR", 
		"STRING", "INT", "FLOAT", "WS", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'struct'", "'{'", "','", "'}'", "'def'", "'('", "')'", "':'", "'.'", 
		"'='", "'return'", "'print'", "'if'", "'else'", "'while'", "'new'", "'*'", 
		"'/'", "'+'", "'-'", "'=='", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "NL", 
		"ID", "CHAR", "STRING", "INT", "FLOAT", "WS", "SL_COMMENT"
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


	public PieLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\5\30\u008a\n\30\3\30\3\30\3\31"+
		"\3\31\3\31\7\31\u0091\n\31\f\31\16\31\u0094\13\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\7\34\u009e\n\34\f\34\16\34\u00a1\13\34\3\34\3\34"+
		"\3\35\6\35\u00a6\n\35\r\35\16\35\u00a7\3\36\3\36\3\36\7\36\u00ad\n\36"+
		"\f\36\16\36\u00b0\13\36\3\36\3\36\6\36\u00b4\n\36\r\36\16\36\u00b5\5\36"+
		"\u00b8\n\36\3\37\3\37\3\37\3\37\3 \3 \7 \u00c0\n \f \16 \u00c3\13 \3 "+
		"\3 \3\u009f\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\33\67"+
		"\349\35;\36=\37? \3\2\5\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\u00cd\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\3A\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\r"+
		"R\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2"+
		"\31c\3\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37q\3\2\2\2!w\3\2\2\2#{\3\2\2\2%"+
		"}\3\2\2\2\'\177\3\2\2\2)\u0081\3\2\2\2+\u0083\3\2\2\2-\u0086\3\2\2\2/"+
		"\u0089\3\2\2\2\61\u008d\3\2\2\2\63\u0095\3\2\2\2\65\u0097\3\2\2\2\67\u009b"+
		"\3\2\2\29\u00a5\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bd\3\2\2\2A"+
		"B\7u\2\2BC\7v\2\2CD\7t\2\2DE\7w\2\2EF\7e\2\2FG\7v\2\2G\4\3\2\2\2HI\7}"+
		"\2\2I\6\3\2\2\2JK\7.\2\2K\b\3\2\2\2LM\7\177\2\2M\n\3\2\2\2NO\7f\2\2OP"+
		"\7g\2\2PQ\7h\2\2Q\f\3\2\2\2RS\7*\2\2S\16\3\2\2\2TU\7+\2\2U\20\3\2\2\2"+
		"VW\7<\2\2W\22\3\2\2\2XY\7\60\2\2Y\24\3\2\2\2Z[\7?\2\2[\26\3\2\2\2\\]\7"+
		"t\2\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2\2b\30\3\2\2\2cd\7r\2"+
		"\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h\32\3\2\2\2ij\7k\2\2jk\7h\2\2k"+
		"\34\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2\2op\7g\2\2p\36\3\2\2\2qr\7y\2\2r"+
		"s\7j\2\2st\7k\2\2tu\7n\2\2uv\7g\2\2v \3\2\2\2wx\7p\2\2xy\7g\2\2yz\7y\2"+
		"\2z\"\3\2\2\2{|\7,\2\2|$\3\2\2\2}~\7\61\2\2~&\3\2\2\2\177\u0080\7-\2\2"+
		"\u0080(\3\2\2\2\u0081\u0082\7/\2\2\u0082*\3\2\2\2\u0083\u0084\7?\2\2\u0084"+
		"\u0085\7?\2\2\u0085,\3\2\2\2\u0086\u0087\7>\2\2\u0087.\3\2\2\2\u0088\u008a"+
		"\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\7\f\2\2\u008c\60\3\2\2\2\u008d\u0092\5\63\32\2\u008e\u0091"+
		"\5\63\32\2\u008f\u0091\4\62;\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\62"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\t\2\2\2\u0096\64\3\2\2\2\u0097"+
		"\u0098\7)\2\2\u0098\u0099\13\2\2\2\u0099\u009a\7)\2\2\u009a\66\3\2\2\2"+
		"\u009b\u009f\7$\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7$\2\2\u00a38\3\2\2\2\u00a4\u00a6\4\62;\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8:\3\2\2\2\u00a9\u00aa\59\35\2\u00aa\u00ae\7\60\2\2\u00ab\u00ad"+
		"\59\35\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b8\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7\60"+
		"\2\2\u00b2\u00b4\59\35\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a9\3\2"+
		"\2\2\u00b7\u00b1\3\2\2\2\u00b8<\3\2\2\2\u00b9\u00ba\t\3\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\b\37\2\2\u00bc>\3\2\2\2\u00bd\u00c1\7%\2\2\u00be"+
		"\u00c0\n\4\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\b \2\2\u00c5@\3\2\2\2\f\2\u0089\u0090\u0092\u009f\u00a7\u00ae\u00b5"+
		"\u00b7\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}