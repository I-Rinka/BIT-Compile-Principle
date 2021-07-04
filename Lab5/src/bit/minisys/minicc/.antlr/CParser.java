// Generated from c:\Users\I_Rin\Documents\Code\BIT-MiniCC\src\bit\minisys\minicc\C.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Auto=2, Break=3, Case=4, Char=5, Const=6, Continue=7, Default=8, 
		Do=9, Double=10, Else=11, Enum=12, Extern=13, Float=14, For=15, Goto=16, 
		If=17, Inline=18, Int=19, Long=20, Register=21, Restrict=22, Return=23, 
		Short=24, Signed=25, Sizeof=26, Static=27, Struct=28, Switch=29, Typedef=30, 
		Union=31, Unsigned=32, Void=33, While=34, LeftParen=35, RightParen=36, 
		LeftBracket=37, RightBracket=38, LeftBrace=39, RightBrace=40, Less=41, 
		LessEqual=42, Greater=43, GreaterEqual=44, LeftShift=45, RightShift=46, 
		Plus=47, PlusPlus=48, Minus=49, MinusMinus=50, Star=51, Div=52, Mod=53, 
		And=54, Or=55, AndAnd=56, OrOr=57, Caret=58, Not=59, Tilde=60, Question=61, 
		Colon=62, Semi=63, Comma=64, Assign=65, StarAssign=66, DivAssign=67, ModAssign=68, 
		PlusAssign=69, MinusAssign=70, LeftShiftAssign=71, RightShiftAssign=72, 
		AndAssign=73, XorAssign=74, OrAssign=75, Equal=76, NotEqual=77, Arrow=78, 
		Dot=79, Ellipsis=80, Identifier=81, Constant=82, DigitSequence=83, StringLiteral=84, 
		ComplexDefine=85, IncludeDirective=86, AsmBlock=87, LineAfterPreprocessing=88, 
		LineDirective=89, PragmaDirective=90, Whitespace=91, Newline=92, BlockComment=93, 
		LineComment=94;
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_argumentExpressionList = 5, 
		RULE_unaryExpression = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_logicalOrExpression = 9, RULE_op = 10, RULE_expr = 11, RULE_conditionalExpression = 12, 
		RULE_assignmentExpression = 13, RULE_assignmentOperator = 14, RULE_expression = 15, 
		RULE_constantExpression = 16, RULE_declaration = 17, RULE_declarationSpecifiers = 18, 
		RULE_declarationSpecifiers2 = 19, RULE_declarationSpecifier = 20, RULE_initDeclaratorList = 21, 
		RULE_initDeclarator = 22, RULE_typeSpecifier = 23, RULE_structOrUnionSpecifier = 24, 
		RULE_structOrUnion = 25, RULE_structDeclarationList = 26, RULE_structDeclaration = 27, 
		RULE_specifierQualifierList = 28, RULE_structDeclaratorList = 29, RULE_structDeclarator = 30, 
		RULE_enumSpecifier = 31, RULE_enumeratorList = 32, RULE_enumerator = 33, 
		RULE_enumerationConstant = 34, RULE_typeQualifier = 35, RULE_declarator = 36, 
		RULE_directDeclarator = 37, RULE_pointer = 38, RULE_typeQualifierList = 39, 
		RULE_parameterTypeList = 40, RULE_parameterList = 41, RULE_parameterDeclaration = 42, 
		RULE_identifierList = 43, RULE_typeName = 44, RULE_abstractDeclarator = 45, 
		RULE_directAbstractDeclarator = 46, RULE_typedefName = 47, RULE_initializer = 48, 
		RULE_initializerList = 49, RULE_designation = 50, RULE_designatorList = 51, 
		RULE_designator = 52, RULE_statement = 53, RULE_labeledStatement = 54, 
		RULE_compoundStatement = 55, RULE_blockItemList = 56, RULE_blockItem = 57, 
		RULE_expressionStatement = 58, RULE_selectionStatement = 59, RULE_iterationStatement = 60, 
		RULE_forCondition = 61, RULE_forDeclaration = 62, RULE_forExpression = 63, 
		RULE_jumpStatement = 64, RULE_compilationUnit = 65, RULE_translationUnit = 66, 
		RULE_externalDeclaration = 67, RULE_functionDefinition = 68, RULE_declarationList = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
			"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
			"castExpression", "logicalOrExpression", "op", "expr", "conditionalExpression", 
			"assignmentExpression", "assignmentOperator", "expression", "constantExpression", 
			"declaration", "declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "typeQualifier", "declarator", "directDeclarator", 
			"pointer", "typeQualifierList", "parameterTypeList", "parameterList", 
			"parameterDeclaration", "identifierList", "typeName", "abstractDeclarator", 
			"directAbstractDeclarator", "typedefName", "initializer", "initializerList", 
			"designation", "designatorList", "designator", "statement", "labeledStatement", 
			"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
			"externalDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_Generic'", "'auto'", "'break'", "'case'", "'char'", "'const'", 
			"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", 
			"'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", 
			"'register'", "'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", 
			"'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
			"'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
			"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", 
			"Inline", "Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", 
			"Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "ComplexDefine", "IncludeDirective", "AsmBlock", "LineAfterPreprocessing", 
			"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		try {
			int _alt;
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(LeftParen);
				setState(148);
				expression(0);
				setState(149);
				match(RightParen);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				genericSelection();
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__0);
			setState(155);
			match(LeftParen);
			setState(156);
			assignmentExpression();
			setState(157);
			match(Comma);
			setState(158);
			genericAssocList(0);
			setState(159);
			match(RightParen);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					match(Comma);
					setState(166);
					genericAssociation();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				typeName();
				setState(173);
				match(Colon);
				setState(174);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(Default);
				setState(177);
				match(Colon);
				setState(178);
				assignmentExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAccessContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public ArrayAccessContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression__Context extends PostfixExpressionContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(CParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(CParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(CParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CParser.MinusMinus, 0); }
		public PostfixExpression__Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCallContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExpression_elseContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpression_elseContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new PostfixExpression_elseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				primaryExpression();
				}
				break;
			case 2:
				{
				_localctx = new PostfixExpression__Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(LeftParen);
				setState(184);
				typeName();
				setState(185);
				match(RightParen);
				setState(186);
				match(LeftBrace);
				setState(187);
				initializerList(0);
				setState(188);
				match(RightBrace);
				}
				break;
			case 3:
				{
				_localctx = new PostfixExpression__Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(LeftParen);
				setState(191);
				typeName();
				setState(192);
				match(RightParen);
				setState(193);
				match(LeftBrace);
				setState(194);
				initializerList(0);
				setState(195);
				match(Comma);
				setState(196);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAccessContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(200);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(201);
						match(LeftBracket);
						setState(202);
						expression(0);
						setState(203);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(205);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(206);
						match(LeftParen);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
							{
							setState(207);
							argumentExpressionList(0);
							}
						}

						setState(210);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpression__Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						match(Dot);
						setState(213);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpression__Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(215);
						match(Arrow);
						setState(216);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpression__Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpression__Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(229);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(230);
					match(Comma);
					setState(231);
					assignmentExpression();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryTypeName_Context extends UnaryExpressionContext {
		public TerminalNode Sizeof() { return getToken(CParser.Sizeof, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public UnaryTypeName_Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpression_Context extends UnaryExpressionContext {
		public TerminalNode PlusPlus() { return getToken(CParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpression_Context(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpression_elseContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpression_elseContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryExpression);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new UnaryExpression_elseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				postfixExpression(0);
				}
				break;
			case 2:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(PlusPlus);
				setState(239);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(MinusMinus);
				setState(241);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new UnaryExpression_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				unaryOperator();
				setState(243);
				castExpression();
				}
				break;
			case 5:
				_localctx = new UnaryTypeName_Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(Sizeof);
				setState(246);
				unaryExpression();
				}
				break;
			case 6:
				_localctx = new UnaryTypeName_Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				match(Sizeof);
				setState(248);
				match(LeftParen);
				setState(249);
				typeName();
				setState(250);
				match(RightParen);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0)) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastExpression_elseContext extends CastExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public CastExpression_elseContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastExpression_Context extends CastExpressionContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpression_Context(CastExpressionContext ctx) { copyFrom(ctx); }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CastExpression_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(LeftParen);
				setState(257);
				typeName();
				setState(258);
				match(RightParen);
				setState(259);
				castExpression();
				}
				break;
			case 2:
				_localctx = new CastExpression_elseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new CastExpression_elseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(DigitSequence);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExpressionContext extends LogicalOrExpressionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public BinaryExpressionContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryExpression_elseContext extends LogicalOrExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public BinaryExpression_elseContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalOrExpression);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BinaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				expr();
				setState(266);
				op();
				setState(267);
				expr();
				}
				break;
			case 2:
				_localctx = new BinaryExpression_elseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				castExpression();
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CParser.Not, 0); }
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public TerminalNode Mod() { return getToken(CParser.Mod, 0); }
		public TerminalNode Greater() { return getToken(CParser.Greater, 0); }
		public TerminalNode Less() { return getToken(CParser.Less, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (Less - 41)) | (1L << (Greater - 41)) | (1L << (Plus - 41)) | (1L << (Minus - 41)) | (1L << (Star - 41)) | (1L << (Mod - 41)) | (1L << (And - 41)) | (1L << (Not - 41)) | (1L << (Tilde - 41)) | (1L << (Assign - 41)))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constant) ) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			logicalOrExpression();
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(277);
				match(Question);
				setState(278);
				expression(0);
				setState(279);
				match(Colon);
				setState(280);
				conditionalExpression();
				}
				break;
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExpression_digitContext extends AssignmentExpressionContext {
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public AssignmentExpression_digitContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpression1Context extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpression1Context(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpression2Context extends AssignmentExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpression2Context(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentExpression);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignmentExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new AssignmentExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				unaryExpression();
				setState(286);
				assignmentOperator();
				setState(287);
				assignmentExpression();
				}
				break;
			case 3:
				_localctx = new AssignmentExpression_digitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(DigitSequence);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Assign - 65)) | (1L << (StarAssign - 65)) | (1L << (DivAssign - 65)) | (1L << (ModAssign - 65)) | (1L << (PlusAssign - 65)) | (1L << (MinusAssign - 65)) | (1L << (LeftShiftAssign - 65)) | (1L << (RightShiftAssign - 65)) | (1L << (AndAssign - 65)) | (1L << (XorAssign - 65)) | (1L << (OrAssign - 65)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(298);
					match(Comma);
					setState(299);
					assignmentExpression();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			conditionalExpression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				declarationSpecifiers();
				setState(308);
				initDeclaratorList(0);
				setState(309);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				declarationSpecifiers();
				setState(312);
				match(Semi);
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(316);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(319); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(321);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(324); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declarationSpecifier);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				typeSpecifier(0);
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				typeQualifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(331);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(333);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(334);
					match(Comma);
					setState(335);
					initDeclarator();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initDeclarator);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				declarator();
				setState(343);
				match(Assign);
				setState(344);
				initializer();
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(CParser.Void, 0); }
		public TerminalNode Char() { return getToken(CParser.Char, 0); }
		public TerminalNode Short() { return getToken(CParser.Short, 0); }
		public TerminalNode Int() { return getToken(CParser.Int, 0); }
		public TerminalNode Long() { return getToken(CParser.Long, 0); }
		public TerminalNode Float() { return getToken(CParser.Float, 0); }
		public TerminalNode Double() { return getToken(CParser.Double, 0); }
		public TerminalNode Signed() { return getToken(CParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CParser.Unsigned, 0); }
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
				{
				setState(349);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Struct:
			case Union:
				{
				setState(350);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(351);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				setState(352);
				typedefName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(355);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(356);
					pointer();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				structOrUnion();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(363);
					match(Identifier);
					}
				}

				setState(366);
				match(LeftBrace);
				setState(367);
				structDeclarationList(0);
				setState(368);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				structOrUnion();
				setState(371);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(380);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(381);
					structDeclaration();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			specifierQualifierList();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Star - 35)) | (1L << (Colon - 35)) | (1L << (Identifier - 35)))) != 0)) {
				{
				setState(388);
				structDeclaratorList(0);
				}
			}

			setState(391);
			match(Semi);
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_specifierQualifierList);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				typeSpecifier(0);
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(394);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				typeQualifier();
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(398);
					specifierQualifierList();
					}
					break;
				}
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(407);
					match(Comma);
					setState(408);
					structDeclarator();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_structDeclarator);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (LeftParen - 35)) | (1L << (Star - 35)) | (1L << (Identifier - 35)))) != 0)) {
					{
					setState(415);
					declarator();
					}
				}

				setState(418);
				match(Colon);
				setState(419);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumSpecifier);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(Enum);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(423);
					match(Identifier);
					}
				}

				setState(426);
				match(LeftBrace);
				setState(427);
				enumeratorList(0);
				setState(428);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(Enum);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(431);
					match(Identifier);
					}
				}

				setState(434);
				match(LeftBrace);
				setState(435);
				enumeratorList(0);
				setState(436);
				match(Comma);
				setState(437);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(Enum);
				setState(440);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(446);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(447);
					match(Comma);
					setState(448);
					enumerator();
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumerator);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				enumerationConstant();
				setState(456);
				match(Assign);
				setState(457);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Identifier);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CParser.Const, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(Const);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(465);
				pointer();
				}
			}

			setState(468);
			directDeclarator(0);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	 
		public DirectDeclaratorContext() { }
		public void copyFrom(DirectDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclaratorContext extends DirectDeclaratorContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public VariableDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayDeclaratorContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ArrayDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionDeclaratorContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public FunctionDeclaratorContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				_localctx = new VariableDeclaratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(471);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				_localctx = new VariableDeclaratorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				match(LeftParen);
				setState(473);
				declarator();
				setState(474);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(478);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(479);
						match(LeftBracket);
						setState(481);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(480);
							typeQualifierList(0);
							}
						}

						setState(484);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
							{
							setState(483);
							assignmentExpression();
							}
						}

						setState(486);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(487);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(488);
						match(LeftBracket);
						setState(489);
						match(Static);
						setState(491);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(490);
							typeQualifierList(0);
							}
						}

						setState(493);
						assignmentExpression();
						setState(494);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(496);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(497);
						match(LeftBracket);
						setState(498);
						typeQualifierList(0);
						setState(499);
						match(Static);
						setState(500);
						assignmentExpression();
						setState(501);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new ArrayDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(503);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(504);
						match(LeftBracket);
						setState(506);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(505);
							typeQualifierList(0);
							}
						}

						setState(508);
						match(Star);
						setState(509);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new FunctionDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(510);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(511);
						match(LeftParen);
						setState(512);
						parameterTypeList();
						setState(513);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new FunctionDeclaratorContext(new DirectDeclaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(515);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(516);
						match(LeftParen);
						setState(518);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(517);
							identifierList(0);
							}
						}

						setState(520);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pointer);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(Star);
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(527);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(Star);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(531);
					typeQualifierList(0);
					}
				}

				setState(534);
				pointer();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(540);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(541);
					typeQualifier();
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameterTypeList);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				parameterList(0);
				setState(549);
				match(Comma);
				setState(550);
				match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(555);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(557);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(558);
					match(Comma);
					setState(559);
					parameterDeclaration();
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameterDeclaration);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				declarationSpecifiers();
				setState(566);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				declarationSpecifiers2();
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(569);
					abstractDeclarator();
					}
					break;
				}
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(575);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(577);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(578);
					match(Comma);
					setState(579);
					match(Identifier);
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			specifierQualifierList();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBracket) | (1L << Star))) != 0)) {
				{
				setState(586);
				abstractDeclarator();
				}
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_abstractDeclarator);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(590);
					pointer();
					}
				}

				setState(593);
				directAbstractDeclarator(0);
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(597);
				match(LeftBracket);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(598);
					typeQualifierList(0);
					}
				}

				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(601);
					assignmentExpression();
					}
				}

				setState(604);
				match(RightBracket);
				}
				break;
			case 2:
				{
				setState(605);
				match(LeftBracket);
				setState(606);
				match(Static);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(607);
					typeQualifierList(0);
					}
				}

				setState(610);
				assignmentExpression();
				setState(611);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(613);
				match(LeftBracket);
				setState(614);
				typeQualifierList(0);
				setState(615);
				match(Static);
				setState(616);
				assignmentExpression();
				setState(617);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(619);
				match(LeftBracket);
				setState(620);
				match(Star);
				setState(621);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(622);
				match(LeftParen);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || _la==Identifier) {
					{
					setState(623);
					parameterTypeList();
					}
				}

				setState(626);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(664);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(629);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(630);
						match(LeftBracket);
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(631);
							typeQualifierList(0);
							}
						}

						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
							{
							setState(634);
							assignmentExpression();
							}
						}

						setState(637);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(638);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(639);
						match(LeftBracket);
						setState(640);
						match(Static);
						setState(642);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(641);
							typeQualifierList(0);
							}
						}

						setState(644);
						assignmentExpression();
						setState(645);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(647);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(648);
						match(LeftBracket);
						setState(649);
						typeQualifierList(0);
						setState(650);
						match(Static);
						setState(651);
						assignmentExpression();
						setState(652);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(654);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(655);
						match(LeftBracket);
						setState(656);
						match(Star);
						setState(657);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(658);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(659);
						match(LeftParen);
						setState(661);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || _la==Identifier) {
							{
							setState(660);
							parameterTypeList();
							}
						}

						setState(663);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(Identifier);
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

	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	 
		public InitializerContext() { }
		public void copyFrom(InitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Initializer_directContext extends InitializerContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public Initializer_directContext(InitializerContext ctx) { copyFrom(ctx); }
	}
	public static class Initializer_direct_Context extends InitializerContext {
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public Initializer_direct_Context(InitializerContext ctx) { copyFrom(ctx); }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_initializer);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new Initializer_directContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				assignmentExpression();
				}
				break;
			case 2:
				_localctx = new Initializer_direct_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(LeftBrace);
				setState(673);
				initializerList(0);
				setState(674);
				match(RightBrace);
				}
				break;
			case 3:
				_localctx = new Initializer_direct_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				match(LeftBrace);
				setState(677);
				initializerList(0);
				setState(678);
				match(Comma);
				setState(679);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(684);
				designation();
				}
			}

			setState(687);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(690);
					match(Comma);
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(691);
						designation();
						}
					}

					setState(694);
					initializer();
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			designatorList(0);
			setState(701);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(704);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(706);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(707);
					designator();
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_designator);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(LeftBracket);
				setState(714);
				constantExpression();
				setState(715);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				match(Dot);
				setState(718);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statement);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(724);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(725);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(726);
				jumpStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_labeledStatement);
		try {
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(Identifier);
				setState(730);
				match(Colon);
				setState(731);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(Case);
				setState(733);
				constantExpression();
				setState(734);
				match(Colon);
				setState(735);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				match(Default);
				setState(738);
				match(Colon);
				setState(739);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(LeftBrace);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Struct) | (1L << Switch) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde) | (1L << Semi))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
				{
				setState(743);
				blockItemList(0);
				}
			}

			setState(746);
			match(RightBrace);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(749);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(752);
					blockItem();
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_blockItem);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				declaration();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
				{
				setState(762);
				expression(0);
				}
			}

			setState(765);
			match(Semi);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_selectionStatement);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(If);
				setState(768);
				match(LeftParen);
				setState(769);
				expression(0);
				setState(770);
				match(RightParen);
				setState(771);
				statement();
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(772);
					match(Else);
					setState(773);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(Switch);
				setState(777);
				match(LeftParen);
				setState(778);
				expression(0);
				setState(779);
				match(RightParen);
				setState(780);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CParser.Do, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode For() { return getToken(CParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_iterationStatement);
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				match(While);
				setState(785);
				match(LeftParen);
				setState(786);
				expression(0);
				setState(787);
				match(RightParen);
				setState(788);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				match(Do);
				setState(791);
				statement();
				setState(792);
				match(While);
				setState(793);
				match(LeftParen);
				setState(794);
				expression(0);
				setState(795);
				match(RightParen);
				setState(796);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				match(For);
				setState(799);
				match(LeftParen);
				setState(800);
				forCondition();
				setState(801);
				match(RightParen);
				setState(802);
				statement();
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

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_forCondition);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				forDeclaration();
				setState(807);
				match(Semi);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(808);
					forExpression(0);
					}
				}

				setState(811);
				match(Semi);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(812);
					forExpression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(815);
					expression(0);
					}
				}

				setState(818);
				match(Semi);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(819);
					forExpression(0);
					}
				}

				setState(822);
				match(Semi);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(823);
					forExpression(0);
					}
				}

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

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_forDeclaration);
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				declarationSpecifiers();
				setState(829);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				declarationSpecifiers();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(835);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(837);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(838);
					match(Comma);
					setState(839);
					assignmentExpression();
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpStatementContext {
		public TerminalNode Break() { return getToken(CParser.Break, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public BreakStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStatementContext extends JumpStatementContext {
		public TerminalNode Goto() { return getToken(CParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public GotoStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends JumpStatementContext {
		public TerminalNode Return() { return getToken(CParser.Return, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends JumpStatementContext {
		public TerminalNode Continue() { return getToken(CParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ContinueStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_jumpStatement);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Goto:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				match(Goto);
				setState(846);
				match(Identifier);
				setState(847);
				match(Semi);
				}
				break;
			case Continue:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(Continue);
				setState(849);
				match(Semi);
				}
				break;
			case Break:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				match(Break);
				setState(851);
				match(Semi);
				}
				break;
			case Return:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(852);
				match(Return);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Sizeof) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Star) | (1L << And) | (1L << Not) | (1L << Tilde))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Identifier - 81)) | (1L << (Constant - 81)) | (1L << (DigitSequence - 81)) | (1L << (StringLiteral - 81)))) != 0)) {
					{
					setState(853);
					expression(0);
					}
				}

				setState(856);
				match(Semi);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << LeftParen) | (1L << Star) | (1L << Semi))) != 0) || _la==Identifier) {
				{
				setState(859);
				translationUnit(0);
				}
			}

			setState(862);
			match(EOF);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(865);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(867);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(868);
					externalDeclaration();
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_externalDeclaration);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(879);
				declarationSpecifiers();
				}
				break;
			}
			setState(882);
			declarator();
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(883);
				declarationList(0);
				}
			}

			setState(886);
			compoundStatement();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(889);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(891);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(892);
					declaration();
					}
					} 
				}
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 4:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 5:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 21:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 23:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 26:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 29:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 32:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 37:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 39:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 41:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 43:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 46:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 49:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 51:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 56:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 63:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 66:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 69:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 5);
		case 24:
			return precpred(_ctx, 4);
		case 25:
			return precpred(_ctx, 3);
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u0385\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\6\2\u0092\n\2\r\2\16\2\u0093\3\2\3\2\3\2\3\2\3\2\5\2\u009b\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00aa\n\4\f\4\16"+
		"\4\u00ad\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b6\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c9\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d3\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00e0\n\6\f\6\16\6\u00e3\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u00eb\n\7\f\7\16\7\u00ee\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ff\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u010a\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0111\n\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011d\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0125\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u012f\n\21\f\21\16\21\u0132\13\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u013d\n\23\3\24\6\24\u0140\n\24\r\24\16\24\u0141"+
		"\3\25\6\25\u0145\n\25\r\25\16\25\u0146\3\26\3\26\5\26\u014b\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0153\n\27\f\27\16\27\u0156\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u015d\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0164"+
		"\n\31\3\31\3\31\7\31\u0168\n\31\f\31\16\31\u016b\13\31\3\32\3\32\5\32"+
		"\u016f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0178\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\7\34\u0181\n\34\f\34\16\34\u0184\13\34\3"+
		"\35\3\35\5\35\u0188\n\35\3\35\3\35\3\36\3\36\5\36\u018e\n\36\3\36\3\36"+
		"\5\36\u0192\n\36\5\36\u0194\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u019c"+
		"\n\37\f\37\16\37\u019f\13\37\3 \3 \5 \u01a3\n \3 \3 \5 \u01a7\n \3!\3"+
		"!\5!\u01ab\n!\3!\3!\3!\3!\3!\3!\5!\u01b3\n!\3!\3!\3!\3!\3!\3!\3!\5!\u01bc"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01c4\n\"\f\"\16\"\u01c7\13\"\3#\3#\3"+
		"#\3#\3#\5#\u01ce\n#\3$\3$\3%\3%\3&\5&\u01d5\n&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u01df\n\'\3\'\3\'\3\'\5\'\u01e4\n\'\3\'\5\'\u01e7\n\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u01ee\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u01fd\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0209"+
		"\n\'\3\'\7\'\u020c\n\'\f\'\16\'\u020f\13\'\3(\3(\5(\u0213\n(\3(\3(\5("+
		"\u0217\n(\3(\5(\u021a\n(\3)\3)\3)\3)\3)\7)\u0221\n)\f)\16)\u0224\13)\3"+
		"*\3*\3*\3*\3*\5*\u022b\n*\3+\3+\3+\3+\3+\3+\7+\u0233\n+\f+\16+\u0236\13"+
		"+\3,\3,\3,\3,\3,\5,\u023d\n,\5,\u023f\n,\3-\3-\3-\3-\3-\3-\7-\u0247\n"+
		"-\f-\16-\u024a\13-\3.\3.\5.\u024e\n.\3/\3/\5/\u0252\n/\3/\5/\u0255\n/"+
		"\3\60\3\60\3\60\5\60\u025a\n\60\3\60\5\60\u025d\n\60\3\60\3\60\3\60\3"+
		"\60\5\60\u0263\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0273\n\60\3\60\5\60\u0276\n\60\3\60\3\60\3"+
		"\60\5\60\u027b\n\60\3\60\5\60\u027e\n\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0285\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0298\n\60\3\60\7\60\u029b\n\60\f\60\16"+
		"\60\u029e\13\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u02ac\n\62\3\63\3\63\5\63\u02b0\n\63\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u02b7\n\63\3\63\7\63\u02ba\n\63\f\63\16\63\u02bd\13\63\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\65\3\65\7\65\u02c7\n\65\f\65\16\65\u02ca\13"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02d2\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u02da\n\67\38\38\38\38\38\38\38\38\38\38\38\58\u02e7\n"+
		"8\39\39\59\u02eb\n9\39\39\3:\3:\3:\3:\3:\7:\u02f4\n:\f:\16:\u02f7\13:"+
		"\3;\3;\5;\u02fb\n;\3<\5<\u02fe\n<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u0309"+
		"\n=\3=\3=\3=\3=\3=\3=\5=\u0311\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0327\n>\3?\3?\3?\5?\u032c\n?\3?\3?\5?\u0330"+
		"\n?\3?\5?\u0333\n?\3?\3?\5?\u0337\n?\3?\3?\5?\u033b\n?\5?\u033d\n?\3@"+
		"\3@\3@\3@\5@\u0343\n@\3A\3A\3A\3A\3A\3A\7A\u034b\nA\fA\16A\u034e\13A\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0359\nB\3B\5B\u035c\nB\3C\5C\u035f\nC\3"+
		"C\3C\3D\3D\3D\3D\3D\7D\u0368\nD\fD\16D\u036b\13D\3E\3E\3E\5E\u0370\nE"+
		"\3F\5F\u0373\nF\3F\3F\5F\u0377\nF\3F\3F\3G\3G\3G\3G\3G\7G\u0380\nG\fG"+
		"\16G\u0383\13G\3G\2\26\6\n\f ,\60\66<BLPTX^dhr\u0080\u0086\u008cH\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\b"+
		"\7\2\61\61\63\63\65\6588=>\n\2++--\61\61\63\63\65\65\678=>CC\3\2ST\3\2"+
		"CM\b\2\7\7\f\f\20\20\25\26\32\33\"#\4\2\36\36!!\2\u03c8\2\u009a\3\2\2"+
		"\2\4\u009c\3\2\2\2\6\u00a3\3\2\2\2\b\u00b5\3\2\2\2\n\u00c8\3\2\2\2\f\u00e4"+
		"\3\2\2\2\16\u00fe\3\2\2\2\20\u0100\3\2\2\2\22\u0109\3\2\2\2\24\u0110\3"+
		"\2\2\2\26\u0112\3\2\2\2\30\u0114\3\2\2\2\32\u0116\3\2\2\2\34\u0124\3\2"+
		"\2\2\36\u0126\3\2\2\2 \u0128\3\2\2\2\"\u0133\3\2\2\2$\u013c\3\2\2\2&\u013f"+
		"\3\2\2\2(\u0144\3\2\2\2*\u014a\3\2\2\2,\u014c\3\2\2\2.\u015c\3\2\2\2\60"+
		"\u0163\3\2\2\2\62\u0177\3\2\2\2\64\u0179\3\2\2\2\66\u017b\3\2\2\28\u0185"+
		"\3\2\2\2:\u0193\3\2\2\2<\u0195\3\2\2\2>\u01a6\3\2\2\2@\u01bb\3\2\2\2B"+
		"\u01bd\3\2\2\2D\u01cd\3\2\2\2F\u01cf\3\2\2\2H\u01d1\3\2\2\2J\u01d4\3\2"+
		"\2\2L\u01de\3\2\2\2N\u0219\3\2\2\2P\u021b\3\2\2\2R\u022a\3\2\2\2T\u022c"+
		"\3\2\2\2V\u023e\3\2\2\2X\u0240\3\2\2\2Z\u024b\3\2\2\2\\\u0254\3\2\2\2"+
		"^\u0275\3\2\2\2`\u029f\3\2\2\2b\u02ab\3\2\2\2d\u02ad\3\2\2\2f\u02be\3"+
		"\2\2\2h\u02c1\3\2\2\2j\u02d1\3\2\2\2l\u02d9\3\2\2\2n\u02e6\3\2\2\2p\u02e8"+
		"\3\2\2\2r\u02ee\3\2\2\2t\u02fa\3\2\2\2v\u02fd\3\2\2\2x\u0310\3\2\2\2z"+
		"\u0326\3\2\2\2|\u033c\3\2\2\2~\u0342\3\2\2\2\u0080\u0344\3\2\2\2\u0082"+
		"\u035b\3\2\2\2\u0084\u035e\3\2\2\2\u0086\u0362\3\2\2\2\u0088\u036f\3\2"+
		"\2\2\u008a\u0372\3\2\2\2\u008c\u037a\3\2\2\2\u008e\u009b\7S\2\2\u008f"+
		"\u009b\7T\2\2\u0090\u0092\7V\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\3\2\2\2\u0095\u0096"+
		"\7%\2\2\u0096\u0097\5 \21\2\u0097\u0098\7&\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009b\5\4\3\2\u009a\u008e\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0091\3\2"+
		"\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b\3\3\2\2\2\u009c\u009d"+
		"\7\3\2\2\u009d\u009e\7%\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\7B\2\2\u00a0"+
		"\u00a1\5\6\4\2\u00a1\u00a2\7&\2\2\u00a2\5\3\2\2\2\u00a3\u00a4\b\4\1\2"+
		"\u00a4\u00a5\5\b\5\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\f\3\2\2\u00a7\u00a8"+
		"\7B\2\2\u00a8\u00aa\5\b\5\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00af\5Z.\2\u00af\u00b0\7@\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00b6"+
		"\3\2\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\7@\2\2\u00b4\u00b6\5\34\17\2"+
		"\u00b5\u00ae\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\t\3\2\2\2\u00b7\u00b8\b"+
		"\6\1\2\u00b8\u00c9\5\2\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb\5Z.\2\u00bb"+
		"\u00bc\7&\2\2\u00bc\u00bd\7)\2\2\u00bd\u00be\5d\63\2\u00be\u00bf\7*\2"+
		"\2\u00bf\u00c9\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1\u00c2\5Z.\2\u00c2\u00c3"+
		"\7&\2\2\u00c3\u00c4\7)\2\2\u00c4\u00c5\5d\63\2\u00c5\u00c6\7B\2\2\u00c6"+
		"\u00c7\7*\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8\u00b9\3\2"+
		"\2\2\u00c8\u00c0\3\2\2\2\u00c9\u00e1\3\2\2\2\u00ca\u00cb\f\n\2\2\u00cb"+
		"\u00cc\7\'\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7(\2\2\u00ce\u00e0\3\2"+
		"\2\2\u00cf\u00d0\f\t\2\2\u00d0\u00d2\7%\2\2\u00d1\u00d3\5\f\7\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e0\7&"+
		"\2\2\u00d5\u00d6\f\b\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00e0\7S\2\2\u00d8\u00d9"+
		"\f\7\2\2\u00d9\u00da\7P\2\2\u00da\u00e0\7S\2\2\u00db\u00dc\f\6\2\2\u00dc"+
		"\u00e0\7\62\2\2\u00dd\u00de\f\5\2\2\u00de\u00e0\7\64\2\2\u00df\u00ca\3"+
		"\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d8\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\13\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\b\7\1\2\u00e5\u00e6\5\34\17\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\f\3\2\2"+
		"\u00e8\u00e9\7B\2\2\u00e9\u00eb\5\34\17\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\r\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00ff\5\n\6\2\u00f0\u00f1\7\62\2\2\u00f1\u00ff\5"+
		"\16\b\2\u00f2\u00f3\7\64\2\2\u00f3\u00ff\5\16\b\2\u00f4\u00f5\5\20\t\2"+
		"\u00f5\u00f6\5\22\n\2\u00f6\u00ff\3\2\2\2\u00f7\u00f8\7\34\2\2\u00f8\u00ff"+
		"\5\16\b\2\u00f9\u00fa\7\34\2\2\u00fa\u00fb\7%\2\2\u00fb\u00fc\5Z.\2\u00fc"+
		"\u00fd\7&\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f0\3\2"+
		"\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00ff\17\3\2\2\2\u0100\u0101\t\2\2\2\u0101\21\3\2\2\2\u0102"+
		"\u0103\7%\2\2\u0103\u0104\5Z.\2\u0104\u0105\7&\2\2\u0105\u0106\5\22\n"+
		"\2\u0106\u010a\3\2\2\2\u0107\u010a\5\16\b\2\u0108\u010a\7U\2\2\u0109\u0102"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\23\3\2\2\2\u010b"+
		"\u010c\5\30\r\2\u010c\u010d\5\26\f\2\u010d\u010e\5\30\r\2\u010e\u0111"+
		"\3\2\2\2\u010f\u0111\5\22\n\2\u0110\u010b\3\2\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\25\3\2\2\2\u0112\u0113\t\3\2\2\u0113\27\3\2\2\2\u0114\u0115\t\4"+
		"\2\2\u0115\31\3\2\2\2\u0116\u011c\5\24\13\2\u0117\u0118\7?\2\2\u0118\u0119"+
		"\5 \21\2\u0119\u011a\7@\2\2\u011a\u011b\5\32\16\2\u011b\u011d\3\2\2\2"+
		"\u011c\u0117\3\2\2\2\u011c\u011d\3\2\2\2\u011d\33\3\2\2\2\u011e\u0125"+
		"\5\32\16\2\u011f\u0120\5\16\b\2\u0120\u0121\5\36\20\2\u0121\u0122\5\34"+
		"\17\2\u0122\u0125\3\2\2\2\u0123\u0125\7U\2\2\u0124\u011e\3\2\2\2\u0124"+
		"\u011f\3\2\2\2\u0124\u0123\3\2\2\2\u0125\35\3\2\2\2\u0126\u0127\t\5\2"+
		"\2\u0127\37\3\2\2\2\u0128\u0129\b\21\1\2\u0129\u012a\5\34\17\2\u012a\u0130"+
		"\3\2\2\2\u012b\u012c\f\3\2\2\u012c\u012d\7B\2\2\u012d\u012f\5\34\17\2"+
		"\u012e\u012b\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131!\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5\32\16\2\u0134"+
		"#\3\2\2\2\u0135\u0136\5&\24\2\u0136\u0137\5,\27\2\u0137\u0138\7A\2\2\u0138"+
		"\u013d\3\2\2\2\u0139\u013a\5&\24\2\u013a\u013b\7A\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u0135\3\2\2\2\u013c\u0139\3\2\2\2\u013d%\3\2\2\2\u013e\u0140"+
		"\5*\26\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\'\3\2\2\2\u0143\u0145\5*\26\2\u0144\u0143\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147)\3"+
		"\2\2\2\u0148\u014b\5\60\31\2\u0149\u014b\5H%\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b+\3\2\2\2\u014c\u014d\b\27\1\2\u014d\u014e\5.\30\2"+
		"\u014e\u0154\3\2\2\2\u014f\u0150\f\3\2\2\u0150\u0151\7B\2\2\u0151\u0153"+
		"\5.\30\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155-\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015d\5J&\2\u0158"+
		"\u0159\5J&\2\u0159\u015a\7C\2\2\u015a\u015b\5b\62\2\u015b\u015d\3\2\2"+
		"\2\u015c\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015d/\3\2\2\2\u015e\u015f"+
		"\b\31\1\2\u015f\u0164\t\6\2\2\u0160\u0164\5\62\32\2\u0161\u0164\5@!\2"+
		"\u0162\u0164\5`\61\2\u0163\u015e\3\2\2\2\u0163\u0160\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0169\3\2\2\2\u0165\u0166\f\3\2\2\u0166"+
		"\u0168\5N(\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2"+
		"\2\u0169\u016a\3\2\2\2\u016a\61\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e"+
		"\5\64\33\2\u016d\u016f\7S\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u0171\7)\2\2\u0171\u0172\5\66\34\2\u0172\u0173"+
		"\7*\2\2\u0173\u0178\3\2\2\2\u0174\u0175\5\64\33\2\u0175\u0176\7S\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u016c\3\2\2\2\u0177\u0174\3\2\2\2\u0178\63\3\2\2"+
		"\2\u0179\u017a\t\7\2\2\u017a\65\3\2\2\2\u017b\u017c\b\34\1\2\u017c\u017d"+
		"\58\35\2\u017d\u0182\3\2\2\2\u017e\u017f\f\3\2\2\u017f\u0181\58\35\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\67\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\5:\36\2\u0186\u0188"+
		"\5<\37\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\7A\2\2\u018a9\3\2\2\2\u018b\u018d\5\60\31\2\u018c\u018e\5:\36\2"+
		"\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0194\3\2\2\2\u018f\u0191"+
		"\5H%\2\u0190\u0192\5:\36\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u018b\3\2\2\2\u0193\u018f\3\2\2\2\u0194;\3\2\2\2"+
		"\u0195\u0196\b\37\1\2\u0196\u0197\5> \2\u0197\u019d\3\2\2\2\u0198\u0199"+
		"\f\3\2\2\u0199\u019a\7B\2\2\u019a\u019c\5> \2\u019b\u0198\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e=\3\2\2\2"+
		"\u019f\u019d\3\2\2\2\u01a0\u01a7\5J&\2\u01a1\u01a3\5J&\2\u01a2\u01a1\3"+
		"\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7@\2\2\u01a5"+
		"\u01a7\5\"\22\2\u01a6\u01a0\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7?\3\2\2\2"+
		"\u01a8\u01aa\7\16\2\2\u01a9\u01ab\7S\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7)\2\2\u01ad\u01ae\5B\"\2\u01ae"+
		"\u01af\7*\2\2\u01af\u01bc\3\2\2\2\u01b0\u01b2\7\16\2\2\u01b1\u01b3\7S"+
		"\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\7)\2\2\u01b5\u01b6\5B\"\2\u01b6\u01b7\7B\2\2\u01b7\u01b8\7*\2\2"+
		"\u01b8\u01bc\3\2\2\2\u01b9\u01ba\7\16\2\2\u01ba\u01bc\7S\2\2\u01bb\u01a8"+
		"\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bcA\3\2\2\2\u01bd"+
		"\u01be\b\"\1\2\u01be\u01bf\5D#\2\u01bf\u01c5\3\2\2\2\u01c0\u01c1\f\3\2"+
		"\2\u01c1\u01c2\7B\2\2\u01c2\u01c4\5D#\2\u01c3\u01c0\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6C\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01ce\5F$\2\u01c9\u01ca\5F$\2\u01ca\u01cb\7C\2\2"+
		"\u01cb\u01cc\5\"\22\2\u01cc\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9"+
		"\3\2\2\2\u01ceE\3\2\2\2\u01cf\u01d0\7S\2\2\u01d0G\3\2\2\2\u01d1\u01d2"+
		"\7\b\2\2\u01d2I\3\2\2\2\u01d3\u01d5\5N(\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5L\'\2\u01d7K\3\2\2\2\u01d8\u01d9"+
		"\b\'\1\2\u01d9\u01df\7S\2\2\u01da\u01db\7%\2\2\u01db\u01dc\5J&\2\u01dc"+
		"\u01dd\7&\2\2\u01dd\u01df\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01da\3\2"+
		"\2\2\u01df\u020d\3\2\2\2\u01e0\u01e1\f\b\2\2\u01e1\u01e3\7\'\2\2\u01e2"+
		"\u01e4\5P)\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2"+
		"\2\u01e5\u01e7\5\34\17\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u020c\7(\2\2\u01e9\u01ea\f\7\2\2\u01ea\u01eb\7\'"+
		"\2\2\u01eb\u01ed\7\35\2\2\u01ec\u01ee\5P)\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\5\34\17\2\u01f0\u01f1\7"+
		"(\2\2\u01f1\u020c\3\2\2\2\u01f2\u01f3\f\6\2\2\u01f3\u01f4\7\'\2\2\u01f4"+
		"\u01f5\5P)\2\u01f5\u01f6\7\35\2\2\u01f6\u01f7\5\34\17\2\u01f7\u01f8\7"+
		"(\2\2\u01f8\u020c\3\2\2\2\u01f9\u01fa\f\5\2\2\u01fa\u01fc\7\'\2\2\u01fb"+
		"\u01fd\5P)\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2"+
		"\2\u01fe\u01ff\7\65\2\2\u01ff\u020c\7(\2\2\u0200\u0201\f\4\2\2\u0201\u0202"+
		"\7%\2\2\u0202\u0203\5R*\2\u0203\u0204\7&\2\2\u0204\u020c\3\2\2\2\u0205"+
		"\u0206\f\3\2\2\u0206\u0208\7%\2\2\u0207\u0209\5X-\2\u0208\u0207\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\7&\2\2\u020b\u01e0"+
		"\3\2\2\2\u020b\u01e9\3\2\2\2\u020b\u01f2\3\2\2\2\u020b\u01f9\3\2\2\2\u020b"+
		"\u0200\3\2\2\2\u020b\u0205\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020eM\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212"+
		"\7\65\2\2\u0211\u0213\5P)\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u021a\3\2\2\2\u0214\u0216\7\65\2\2\u0215\u0217\5P)\2\u0216\u0215\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\5N(\2\u0219\u0210"+
		"\3\2\2\2\u0219\u0214\3\2\2\2\u021aO\3\2\2\2\u021b\u021c\b)\1\2\u021c\u021d"+
		"\5H%\2\u021d\u0222\3\2\2\2\u021e\u021f\f\3\2\2\u021f\u0221\5H%\2\u0220"+
		"\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223Q\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u022b\5T+\2\u0226\u0227"+
		"\5T+\2\u0227\u0228\7B\2\2\u0228\u0229\7R\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0225\3\2\2\2\u022a\u0226\3\2\2\2\u022bS\3\2\2\2\u022c\u022d\b+\1\2\u022d"+
		"\u022e\5V,\2\u022e\u0234\3\2\2\2\u022f\u0230\f\3\2\2\u0230\u0231\7B\2"+
		"\2\u0231\u0233\5V,\2\u0232\u022f\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235U\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0238\5&\24\2\u0238\u0239\5J&\2\u0239\u023f\3\2\2\2\u023a\u023c\5(\25"+
		"\2\u023b\u023d\5\\/\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f"+
		"\3\2\2\2\u023e\u0237\3\2\2\2\u023e\u023a\3\2\2\2\u023fW\3\2\2\2\u0240"+
		"\u0241\b-\1\2\u0241\u0242\7S\2\2\u0242\u0248\3\2\2\2\u0243\u0244\f\3\2"+
		"\2\u0244\u0245\7B\2\2\u0245\u0247\7S\2\2\u0246\u0243\3\2\2\2\u0247\u024a"+
		"\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249Y\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024d\5:\36\2\u024c\u024e\5\\/\2\u024d\u024c\3\2"+
		"\2\2\u024d\u024e\3\2\2\2\u024e[\3\2\2\2\u024f\u0255\5N(\2\u0250\u0252"+
		"\5N(\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0255\5^\60\2\u0254\u024f\3\2\2\2\u0254\u0251\3\2\2\2\u0255]\3\2\2\2"+
		"\u0256\u0257\b\60\1\2\u0257\u0259\7\'\2\2\u0258\u025a\5P)\2\u0259\u0258"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\5\34\17\2"+
		"\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0276"+
		"\7(\2\2\u025f\u0260\7\'\2\2\u0260\u0262\7\35\2\2\u0261\u0263\5P)\2\u0262"+
		"\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5\34"+
		"\17\2\u0265\u0266\7(\2\2\u0266\u0276\3\2\2\2\u0267\u0268\7\'\2\2\u0268"+
		"\u0269\5P)\2\u0269\u026a\7\35\2\2\u026a\u026b\5\34\17\2\u026b\u026c\7"+
		"(\2\2\u026c\u0276\3\2\2\2\u026d\u026e\7\'\2\2\u026e\u026f\7\65\2\2\u026f"+
		"\u0276\7(\2\2\u0270\u0272\7%\2\2\u0271\u0273\5R*\2\u0272\u0271\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\7&\2\2\u0275\u0256"+
		"\3\2\2\2\u0275\u025f\3\2\2\2\u0275\u0267\3\2\2\2\u0275\u026d\3\2\2\2\u0275"+
		"\u0270\3\2\2\2\u0276\u029c\3\2\2\2\u0277\u0278\f\7\2\2\u0278\u027a\7\'"+
		"\2\2\u0279\u027b\5P)\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d"+
		"\3\2\2\2\u027c\u027e\5\34\17\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2"+
		"\u027e\u027f\3\2\2\2\u027f\u029b\7(\2\2\u0280\u0281\f\6\2\2\u0281\u0282"+
		"\7\'\2\2\u0282\u0284\7\35\2\2\u0283\u0285\5P)\2\u0284\u0283\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5\34\17\2\u0287\u0288\7"+
		"(\2\2\u0288\u029b\3\2\2\2\u0289\u028a\f\5\2\2\u028a\u028b\7\'\2\2\u028b"+
		"\u028c\5P)\2\u028c\u028d\7\35\2\2\u028d\u028e\5\34\17\2\u028e\u028f\7"+
		"(\2\2\u028f\u029b\3\2\2\2\u0290\u0291\f\4\2\2\u0291\u0292\7\'\2\2\u0292"+
		"\u0293\7\65\2\2\u0293\u029b\7(\2\2\u0294\u0295\f\3\2\2\u0295\u0297\7%"+
		"\2\2\u0296\u0298\5R*\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029b\7&\2\2\u029a\u0277\3\2\2\2\u029a\u0280\3\2\2\2\u029a"+
		"\u0289\3\2\2\2\u029a\u0290\3\2\2\2\u029a\u0294\3\2\2\2\u029b\u029e\3\2"+
		"\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d_\3\2\2\2\u029e\u029c"+
		"\3\2\2\2\u029f\u02a0\7S\2\2\u02a0a\3\2\2\2\u02a1\u02ac\5\34\17\2\u02a2"+
		"\u02a3\7)\2\2\u02a3\u02a4\5d\63\2\u02a4\u02a5\7*\2\2\u02a5\u02ac\3\2\2"+
		"\2\u02a6\u02a7\7)\2\2\u02a7\u02a8\5d\63\2\u02a8\u02a9\7B\2\2\u02a9\u02aa"+
		"\7*\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a1\3\2\2\2\u02ab\u02a2\3\2\2\2\u02ab"+
		"\u02a6\3\2\2\2\u02acc\3\2\2\2\u02ad\u02af\b\63\1\2\u02ae\u02b0\5f\64\2"+
		"\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2"+
		"\5b\62\2\u02b2\u02bb\3\2\2\2\u02b3\u02b4\f\3\2\2\u02b4\u02b6\7B\2\2\u02b5"+
		"\u02b7\5f\64\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02ba\5b\62\2\u02b9\u02b3\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bce\3\2\2\2\u02bd\u02bb\3\2\2\2"+
		"\u02be\u02bf\5h\65\2\u02bf\u02c0\7C\2\2\u02c0g\3\2\2\2\u02c1\u02c2\b\65"+
		"\1\2\u02c2\u02c3\5j\66\2\u02c3\u02c8\3\2\2\2\u02c4\u02c5\f\3\2\2\u02c5"+
		"\u02c7\5j\66\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9i\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc"+
		"\7\'\2\2\u02cc\u02cd\5\"\22\2\u02cd\u02ce\7(\2\2\u02ce\u02d2\3\2\2\2\u02cf"+
		"\u02d0\7Q\2\2\u02d0\u02d2\7S\2\2\u02d1\u02cb\3\2\2\2\u02d1\u02cf\3\2\2"+
		"\2\u02d2k\3\2\2\2\u02d3\u02da\5n8\2\u02d4\u02da\5p9\2\u02d5\u02da\5v<"+
		"\2\u02d6\u02da\5x=\2\u02d7\u02da\5z>\2\u02d8\u02da\5\u0082B\2\u02d9\u02d3"+
		"\3\2\2\2\u02d9\u02d4\3\2\2\2\u02d9\u02d5\3\2\2\2\u02d9\u02d6\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02dam\3\2\2\2\u02db\u02dc\7S\2\2\u02dc"+
		"\u02dd\7@\2\2\u02dd\u02e7\5l\67\2\u02de\u02df\7\6\2\2\u02df\u02e0\5\""+
		"\22\2\u02e0\u02e1\7@\2\2\u02e1\u02e2\5l\67\2\u02e2\u02e7\3\2\2\2\u02e3"+
		"\u02e4\7\n\2\2\u02e4\u02e5\7@\2\2\u02e5\u02e7\5l\67\2\u02e6\u02db\3\2"+
		"\2\2\u02e6\u02de\3\2\2\2\u02e6\u02e3\3\2\2\2\u02e7o\3\2\2\2\u02e8\u02ea"+
		"\7)\2\2\u02e9\u02eb\5r:\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ed\7*\2\2\u02edq\3\2\2\2\u02ee\u02ef\b:\1\2\u02ef"+
		"\u02f0\5t;\2\u02f0\u02f5\3\2\2\2\u02f1\u02f2\f\3\2\2\u02f2\u02f4\5t;\2"+
		"\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6s\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\5l\67\2\u02f9"+
		"\u02fb\5$\23\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fbu\3\2\2\2"+
		"\u02fc\u02fe\5 \21\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u0300\7A\2\2\u0300w\3\2\2\2\u0301\u0302\7\23\2\2\u0302"+
		"\u0303\7%\2\2\u0303\u0304\5 \21\2\u0304\u0305\7&\2\2\u0305\u0308\5l\67"+
		"\2\u0306\u0307\7\r\2\2\u0307\u0309\5l\67\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u0311\3\2\2\2\u030a\u030b\7\37\2\2\u030b\u030c\7%\2\2\u030c"+
		"\u030d\5 \21\2\u030d\u030e\7&\2\2\u030e\u030f\5l\67\2\u030f\u0311\3\2"+
		"\2\2\u0310\u0301\3\2\2\2\u0310\u030a\3\2\2\2\u0311y\3\2\2\2\u0312\u0313"+
		"\7$\2\2\u0313\u0314\7%\2\2\u0314\u0315\5 \21\2\u0315\u0316\7&\2\2\u0316"+
		"\u0317\5l\67\2\u0317\u0327\3\2\2\2\u0318\u0319\7\13\2\2\u0319\u031a\5"+
		"l\67\2\u031a\u031b\7$\2\2\u031b\u031c\7%\2\2\u031c\u031d\5 \21\2\u031d"+
		"\u031e\7&\2\2\u031e\u031f\7A\2\2\u031f\u0327\3\2\2\2\u0320\u0321\7\21"+
		"\2\2\u0321\u0322\7%\2\2\u0322\u0323\5|?\2\u0323\u0324\7&\2\2\u0324\u0325"+
		"\5l\67\2\u0325\u0327\3\2\2\2\u0326\u0312\3\2\2\2\u0326\u0318\3\2\2\2\u0326"+
		"\u0320\3\2\2\2\u0327{\3\2\2\2\u0328\u0329\5~@\2\u0329\u032b\7A\2\2\u032a"+
		"\u032c\5\u0080A\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d"+
		"\3\2\2\2\u032d\u032f\7A\2\2\u032e\u0330\5\u0080A\2\u032f\u032e\3\2\2\2"+
		"\u032f\u0330\3\2\2\2\u0330\u033d\3\2\2\2\u0331\u0333\5 \21\2\u0332\u0331"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\7A\2\2\u0335"+
		"\u0337\5\u0080A\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u033a\7A\2\2\u0339\u033b\5\u0080A\2\u033a\u0339\3\2\2\2"+
		"\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u0328\3\2\2\2\u033c\u0332"+
		"\3\2\2\2\u033d}\3\2\2\2\u033e\u033f\5&\24\2\u033f\u0340\5,\27\2\u0340"+
		"\u0343\3\2\2\2\u0341\u0343\5&\24\2\u0342\u033e\3\2\2\2\u0342\u0341\3\2"+
		"\2\2\u0343\177\3\2\2\2\u0344\u0345\bA\1\2\u0345\u0346\5\34\17\2\u0346"+
		"\u034c\3\2\2\2\u0347\u0348\f\3\2\2\u0348\u0349\7B\2\2\u0349\u034b\5\34"+
		"\17\2\u034a\u0347\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\u0081\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7\22"+
		"\2\2\u0350\u0351\7S\2\2\u0351\u035c\7A\2\2\u0352\u0353\7\t\2\2\u0353\u035c"+
		"\7A\2\2\u0354\u0355\7\5\2\2\u0355\u035c\7A\2\2\u0356\u0358\7\31\2\2\u0357"+
		"\u0359\5 \21\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u035c\7A\2\2\u035b\u034f\3\2\2\2\u035b\u0352\3\2\2\2\u035b"+
		"\u0354\3\2\2\2\u035b\u0356\3\2\2\2\u035c\u0083\3\2\2\2\u035d\u035f\5\u0086"+
		"D\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\7\2\2\3\u0361\u0085\3\2\2\2\u0362\u0363\bD\1\2\u0363\u0364\5\u0088"+
		"E\2\u0364\u0369\3\2\2\2\u0365\u0366\f\3\2\2\u0366\u0368\5\u0088E\2\u0367"+
		"\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u0087\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0370\5\u008aF\2\u036d"+
		"\u0370\5$\23\2\u036e\u0370\7A\2\2\u036f\u036c\3\2\2\2\u036f\u036d\3\2"+
		"\2\2\u036f\u036e\3\2\2\2\u0370\u0089\3\2\2\2\u0371\u0373\5&\24\2\u0372"+
		"\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\5J"+
		"&\2\u0375\u0377\5\u008cG\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0379\5p9\2\u0379\u008b\3\2\2\2\u037a\u037b\bG\1"+
		"\2\u037b\u037c\5$\23\2\u037c\u0381\3\2\2\2\u037d\u037e\f\3\2\2\u037e\u0380"+
		"\5$\23\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u008d\3\2\2\2\u0383\u0381\3\2\2\2g\u0093\u009a\u00ab"+
		"\u00b5\u00c8\u00d2\u00df\u00e1\u00ec\u00fe\u0109\u0110\u011c\u0124\u0130"+
		"\u013c\u0141\u0146\u014a\u0154\u015c\u0163\u0169\u016e\u0177\u0182\u0187"+
		"\u018d\u0191\u0193\u019d\u01a2\u01a6\u01aa\u01b2\u01bb\u01c5\u01cd\u01d4"+
		"\u01de\u01e3\u01e6\u01ed\u01fc\u0208\u020b\u020d\u0212\u0216\u0219\u0222"+
		"\u022a\u0234\u023c\u023e\u0248\u024d\u0251\u0254\u0259\u025c\u0262\u0272"+
		"\u0275\u027a\u027d\u0284\u0297\u029a\u029c\u02ab\u02af\u02b6\u02bb\u02c8"+
		"\u02d1\u02d9\u02e6\u02ea\u02f5\u02fa\u02fd\u0308\u0310\u0326\u032b\u032f"+
		"\u0332\u0336\u033a\u033c\u0342\u034c\u0358\u035b\u035e\u0369\u036f\u0372"+
		"\u0376\u0381";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}