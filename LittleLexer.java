// Generated from Little.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, KEYWORD=2, OPERATOR=3, IDENTIFIER=4, INTLITERAL=5, FLOATLITERAL=6, 
		STRINGLITERAL=7, COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "KEYWORD", "OPERATOR", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT"
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2"+
		"\3\2\3\2\5\2\31\n\2\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n"+
		"\5\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3\7\6\7\u0095\n\7\r\7\16"+
		"\7\u0096\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\5\b\u00a0\n\b\3\b\6"+
		"\b\u00a3\n\b\r\b\16\b\u00a4\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n\3\n\3"+
		"\n\3\u00ac\2\13\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\3\2\t\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\4\2C\\c|\7\2/\60"+
		"\62;C\\aac|\3\2\60\60\2\u00da\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\30\3\2\2"+
		"\2\5\33\3\2\2\2\7~\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u0094\3"+
		"\2\2\2\17\u009f\3\2\2\2\21\u00a6\3\2\2\2\23\u00b1\3\2\2\2\25\26\7\17\2"+
		"\2\26\31\7\f\2\2\27\31\t\2\2\2\30\25\3\2\2\2\30\27\3\2\2\2\31\4\3\2\2"+
		"\2\32\34\t\3\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36\37\3\2\2\2\37 \b\3\2\2 \6\3\2\2\2!\"\7R\2\2\"#\7T\2\2#$\7Q\2\2$"+
		"%\7I\2\2%&\7T\2\2&\'\7C\2\2\'\177\7O\2\2()\7D\2\2)*\7G\2\2*+\7I\2\2+,"+
		"\7K\2\2,\177\7P\2\2-.\7G\2\2./\7P\2\2/\177\7F\2\2\60\61\7H\2\2\61\62\7"+
		"W\2\2\62\63\7P\2\2\63\64\7E\2\2\64\65\7V\2\2\65\66\7K\2\2\66\67\7Q\2\2"+
		"\67\177\7P\2\289\7T\2\29:\7G\2\2:;\7C\2\2;\177\7F\2\2<=\7Y\2\2=>\7T\2"+
		"\2>?\7K\2\2?@\7V\2\2@\177\7G\2\2AB\7K\2\2B\177\7H\2\2CD\7G\2\2DE\7N\2"+
		"\2EF\7U\2\2F\177\7G\2\2GH\7G\2\2HI\7P\2\2IJ\7F\2\2JK\7K\2\2K\177\7H\2"+
		"\2LM\7Y\2\2MN\7J\2\2NO\7K\2\2OP\7N\2\2P\177\7G\2\2QR\7G\2\2RS\7P\2\2S"+
		"T\7F\2\2TU\7Y\2\2UV\7J\2\2VW\7K\2\2WX\7N\2\2X\177\7G\2\2YZ\7E\2\2Z[\7"+
		"Q\2\2[\\\7P\2\2\\]\7V\2\2]^\7K\2\2^_\7P\2\2_`\7W\2\2`\177\7G\2\2ab\7D"+
		"\2\2bc\7T\2\2cd\7G\2\2de\7C\2\2e\177\7M\2\2fg\7T\2\2gh\7G\2\2hi\7V\2\2"+
		"ij\7W\2\2jk\7T\2\2k\177\7P\2\2lm\7K\2\2mn\7P\2\2n\177\7V\2\2op\7X\2\2"+
		"pq\7Q\2\2qr\7K\2\2r\177\7F\2\2st\7U\2\2tu\7V\2\2uv\7T\2\2vw\7K\2\2wx\7"+
		"P\2\2x\177\7I\2\2yz\7H\2\2z{\7N\2\2{|\7Q\2\2|}\7C\2\2}\177\7V\2\2~!\3"+
		"\2\2\2~(\3\2\2\2~-\3\2\2\2~\60\3\2\2\2~8\3\2\2\2~<\3\2\2\2~A\3\2\2\2~"+
		"C\3\2\2\2~G\3\2\2\2~L\3\2\2\2~Q\3\2\2\2~Y\3\2\2\2~a\3\2\2\2~f\3\2\2\2"+
		"~l\3\2\2\2~o\3\2\2\2~s\3\2\2\2~y\3\2\2\2\177\b\3\2\2\2\u0080\u0081\7<"+
		"\2\2\u0081\u008b\7?\2\2\u0082\u008b\t\4\2\2\u0083\u0084\7#\2\2\u0084\u008b"+
		"\7?\2\2\u0085\u008b\t\5\2\2\u0086\u0087\7>\2\2\u0087\u008b\7?\2\2\u0088"+
		"\u0089\7@\2\2\u0089\u008b\7?\2\2\u008a\u0080\3\2\2\2\u008a\u0082\3\2\2"+
		"\2\u008a\u0083\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\n\3\2\2\2\u008c\u0090\t\6\2\2\u008d\u008f\t\7\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\f\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\4\62;\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\16\3\2\2\2\u0098\u009a\4\62;\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a0\t\b\2\2\u009f\u009b\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u00a3\4\62;\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\20\3\2\2\2\u00a6\u00ac"+
		"\7$\2\2\u00a7\u00a8\7^\2\2\u00a8\u00ab\7$\2\2\u00a9\u00ab\13\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7$\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7/\2\2\u00b3"+
		"\u00b7\3\2\2\2\u00b4\u00b6\n\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\b\n\2\2\u00bb\24\3\2\2\2\17\2\30\35~\u008a"+
		"\u0090\u0096\u009b\u009f\u00a4\u00aa\u00ac\u00b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}