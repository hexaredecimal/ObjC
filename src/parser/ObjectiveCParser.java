// Generated from ObjectiveCParser.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ObjectiveCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTO=1, BREAK=2, CASE=3, CHAR=4, CONST=5, CONTINUE=6, DEFAULT=7, DO=8, 
		DOUBLE=9, ELSE=10, ENUM=11, EXTERN=12, FLOAT=13, FOR=14, GOTO=15, IF=16, 
		INLINE=17, INT=18, LONG=19, REGISTER=20, RESTRICT=21, RETURN=22, SHORT=23, 
		SIGNED=24, SIZEOF=25, STATIC=26, STRUCT=27, SWITCH=28, TYPEDEF=29, UNION=30, 
		UNSIGNED=31, VOID=32, VOLATILE=33, WHILE=34, BOOL_=35, COMPLEX=36, IMAGINERY=37, 
		TRUE=38, FALSE=39, BOOL=40, Class=41, BYCOPY=42, BYREF=43, ID=44, IMP=45, 
		IN=46, INOUT=47, NIL=48, NO=49, NULL_=50, ONEWAY=51, OUT=52, PROTOCOL_=53, 
		SEL=54, SELF=55, SUPER=56, YES=57, AUTORELEASEPOOL=58, CATCH=59, CLASS=60, 
		DYNAMIC=61, ENCODE=62, END=63, FINALLY=64, IMPLEMENTATION=65, INTERFACE=66, 
		IMPORT=67, PACKAGE=68, PROTOCOL=69, OPTIONAL=70, PRIVATE=71, PROPERTY=72, 
		PROTECTED=73, PUBLIC=74, REQUIRED=75, SELECTOR=76, SYNCHRONIZED=77, SYNTHESIZE=78, 
		THROW=79, TRY=80, ATOMIC=81, NONATOMIC=82, RETAIN=83, ATTRIBUTE=84, AUTORELEASING_QUALIFIER=85, 
		BLOCK=86, BRIDGE=87, BRIDGE_RETAINED=88, BRIDGE_TRANSFER=89, COVARIANT=90, 
		CONTRAVARIANT=91, DEPRECATED=92, KINDOF=93, STRONG_QUALIFIER=94, TYPEOF=95, 
		UNSAFE_UNRETAINED_QUALIFIER=96, UNUSED=97, WEAK_QUALIFIER=98, NULL_UNSPECIFIED=99, 
		NULLABLE=100, NONNULL=101, NULL_RESETTABLE=102, NS_INLINE=103, NS_ENUM=104, 
		NS_OPTIONS=105, ASSIGN=106, COPY=107, GETTER=108, SETTER=109, STRONG=110, 
		READONLY=111, READWRITE=112, WEAK=113, UNSAFE_UNRETAINED=114, IB_OUTLET=115, 
		IB_OUTLET_COLLECTION=116, IB_INSPECTABLE=117, IB_DESIGNABLE=118, NS_ASSUME_NONNULL_BEGIN=119, 
		NS_ASSUME_NONNULL_END=120, EXTERN_SUFFIX=121, IOS_SUFFIX=122, MAC_SUFFIX=123, 
		TVOS_PROHIBITED=124, IDENTIFIER=125, LP=126, RP=127, LBRACE=128, RBRACE=129, 
		LBRACK=130, RBRACK=131, SEMI=132, COMMA=133, DOT=134, STRUCTACCESS=135, 
		AT=136, ASSIGNMENT=137, GT=138, LT=139, BANG=140, TILDE=141, QUESTION=142, 
		COLON=143, EQUAL=144, LE=145, GE=146, NOTEQUAL=147, AND=148, OR=149, INC=150, 
		DEC=151, ADD=152, SUB=153, MUL=154, DIV=155, BITAND=156, BITOR=157, BITXOR=158, 
		MOD=159, ADD_ASSIGN=160, SUB_ASSIGN=161, MUL_ASSIGN=162, DIV_ASSIGN=163, 
		AND_ASSIGN=164, OR_ASSIGN=165, XOR_ASSIGN=166, MOD_ASSIGN=167, LSHIFT_ASSIGN=168, 
		RSHIFT_ASSIGN=169, ELIPSIS=170, CHARACTER_LITERAL=171, STRING_START=172, 
		HEX_LITERAL=173, OCTAL_LITERAL=174, BINARY_LITERAL=175, DECIMAL_LITERAL=176, 
		FLOATING_POINT_LITERAL=177, WS=178, MULTI_COMMENT=179, SINGLE_COMMENT=180, 
		BACKSLASH=181, SHARP=182, STRING_NEWLINE=183, STRING_END=184, STRING_VALUE=185, 
		DIRECTIVE_IMPORT=186, DIRECTIVE_INCLUDE=187, DIRECTIVE_PRAGMA=188, DIRECTIVE_DEFINE=189, 
		DIRECTIVE_DEFINED=190, DIRECTIVE_IF=191, DIRECTIVE_ELIF=192, DIRECTIVE_ELSE=193, 
		DIRECTIVE_UNDEF=194, DIRECTIVE_IFDEF=195, DIRECTIVE_IFNDEF=196, DIRECTIVE_ENDIF=197, 
		DIRECTIVE_TRUE=198, DIRECTIVE_FALSE=199, DIRECTIVE_ERROR=200, DIRECTIVE_WARNING=201, 
		DIRECTIVE_BANG=202, DIRECTIVE_LP=203, DIRECTIVE_RP=204, DIRECTIVE_EQUAL=205, 
		DIRECTIVE_NOTEQUAL=206, DIRECTIVE_AND=207, DIRECTIVE_OR=208, DIRECTIVE_LT=209, 
		DIRECTIVE_GT=210, DIRECTIVE_LE=211, DIRECTIVE_GE=212, DIRECTIVE_STRING=213, 
		DIRECTIVE_ID=214, DIRECTIVE_DECIMAL_LITERAL=215, DIRECTIVE_FLOAT=216, 
		DIRECTIVE_NEWLINE=217, DIRECTIVE_MULTI_COMMENT=218, DIRECTIVE_SINGLE_COMMENT=219, 
		DIRECTIVE_BACKSLASH_NEWLINE=220, DIRECTIVE_TEXT_NEWLINE=221, DIRECTIVE_TEXT=222;
	public static final int
		RULE_translationUnit = 0, RULE_topLevelDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classInterface = 3, RULE_categoryInterface = 4, RULE_classImplementation = 5, 
		RULE_categoryImplementation = 6, RULE_genericTypeSpecifier = 7, RULE_protocolDeclaration = 8, 
		RULE_protocolDeclarationSection = 9, RULE_protocolDeclarationList = 10, 
		RULE_classDeclarationList = 11, RULE_protocolList = 12, RULE_propertyDeclaration = 13, 
		RULE_propertyAttributesList = 14, RULE_propertyAttribute = 15, RULE_protocolName = 16, 
		RULE_instanceVariables = 17, RULE_visibilitySection = 18, RULE_accessModifier = 19, 
		RULE_interfaceDeclarationList = 20, RULE_classMethodDeclaration = 21, 
		RULE_instanceMethodDeclaration = 22, RULE_methodDeclaration = 23, RULE_implementationDefinitionList = 24, 
		RULE_classMethodDefinition = 25, RULE_instanceMethodDefinition = 26, RULE_methodDefinition = 27, 
		RULE_methodSelector = 28, RULE_keywordDeclarator = 29, RULE_selector = 30, 
		RULE_methodType = 31, RULE_propertyImplementation = 32, RULE_propertySynthesizeList = 33, 
		RULE_propertySynthesizeItem = 34, RULE_blockType = 35, RULE_genericsSpecifier = 36, 
		RULE_typeSpecifierWithPrefixes = 37, RULE_dictionaryExpression = 38, RULE_dictionaryPair = 39, 
		RULE_arrayExpression = 40, RULE_boxExpression = 41, RULE_blockParameters = 42, 
		RULE_typeVariableDeclaratorOrName = 43, RULE_blockExpression = 44, RULE_messageExpression = 45, 
		RULE_receiver = 46, RULE_messageSelector = 47, RULE_keywordArgument = 48, 
		RULE_keywordArgumentType = 49, RULE_selectorExpression = 50, RULE_selectorName = 51, 
		RULE_protocolExpression = 52, RULE_encodeExpression = 53, RULE_typeVariableDeclarator = 54, 
		RULE_throwStatement = 55, RULE_tryBlock = 56, RULE_catchStatement = 57, 
		RULE_synchronizedStatement = 58, RULE_autoreleaseStatement = 59, RULE_functionDeclaration = 60, 
		RULE_functionDefinition = 61, RULE_functionSignature = 62, RULE_attribute = 63, 
		RULE_attributeName = 64, RULE_attributeParameters = 65, RULE_attributeParameterList = 66, 
		RULE_attributeParameter = 67, RULE_attributeParameterAssignment = 68, 
		RULE_declaration = 69, RULE_functionCallExpression = 70, RULE_enumDeclaration = 71, 
		RULE_varDeclaration = 72, RULE_typedefDeclaration = 73, RULE_typeDeclaratorList = 74, 
		RULE_typeDeclarator = 75, RULE_declarationSpecifiers = 76, RULE_attributeSpecifier = 77, 
		RULE_initDeclaratorList = 78, RULE_initDeclarator = 79, RULE_structOrUnionSpecifier = 80, 
		RULE_fieldDeclaration = 81, RULE_specifierQualifierList = 82, RULE_ibOutletQualifier = 83, 
		RULE_arcBehaviourSpecifier = 84, RULE_nullabilitySpecifier = 85, RULE_storageClassSpecifier = 86, 
		RULE_typePrefix = 87, RULE_typeQualifier = 88, RULE_protocolQualifier = 89, 
		RULE_typeSpecifier = 90, RULE_typeofExpression = 91, RULE_fieldDeclaratorList = 92, 
		RULE_fieldDeclarator = 93, RULE_enumSpecifier = 94, RULE_enumeratorList = 95, 
		RULE_enumerator = 96, RULE_enumeratorIdentifier = 97, RULE_directDeclarator = 98, 
		RULE_declaratorSuffix = 99, RULE_parameterList = 100, RULE_pointer = 101, 
		RULE_macro = 102, RULE_arrayInitializer = 103, RULE_structInitializer = 104, 
		RULE_initializerList = 105, RULE_typeName = 106, RULE_abstractDeclarator = 107, 
		RULE_abstractDeclaratorSuffix = 108, RULE_parameterDeclarationList = 109, 
		RULE_parameterDeclaration = 110, RULE_declarator = 111, RULE_statement = 112, 
		RULE_labeledStatement = 113, RULE_rangeExpression = 114, RULE_compoundStatement = 115, 
		RULE_selectionStatement = 116, RULE_switchStatement = 117, RULE_switchBlock = 118, 
		RULE_switchSection = 119, RULE_switchLabel = 120, RULE_iterationStatement = 121, 
		RULE_whileStatement = 122, RULE_doStatement = 123, RULE_forStatement = 124, 
		RULE_forLoopInitializer = 125, RULE_forInStatement = 126, RULE_jumpStatement = 127, 
		RULE_expressions = 128, RULE_expression = 129, RULE_assignmentOperator = 130, 
		RULE_castExpression = 131, RULE_initializer = 132, RULE_constantExpression = 133, 
		RULE_unaryExpression = 134, RULE_unaryOperator = 135, RULE_postfixExpression = 136, 
		RULE_postfix = 137, RULE_argumentExpressionList = 138, RULE_argumentExpression = 139, 
		RULE_primaryExpression = 140, RULE_constant = 141, RULE_stringLiteral = 142, 
		RULE_identifier = 143;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "topLevelDeclaration", "importDeclaration", "classInterface", 
			"categoryInterface", "classImplementation", "categoryImplementation", 
			"genericTypeSpecifier", "protocolDeclaration", "protocolDeclarationSection", 
			"protocolDeclarationList", "classDeclarationList", "protocolList", "propertyDeclaration", 
			"propertyAttributesList", "propertyAttribute", "protocolName", "instanceVariables", 
			"visibilitySection", "accessModifier", "interfaceDeclarationList", "classMethodDeclaration", 
			"instanceMethodDeclaration", "methodDeclaration", "implementationDefinitionList", 
			"classMethodDefinition", "instanceMethodDefinition", "methodDefinition", 
			"methodSelector", "keywordDeclarator", "selector", "methodType", "propertyImplementation", 
			"propertySynthesizeList", "propertySynthesizeItem", "blockType", "genericsSpecifier", 
			"typeSpecifierWithPrefixes", "dictionaryExpression", "dictionaryPair", 
			"arrayExpression", "boxExpression", "blockParameters", "typeVariableDeclaratorOrName", 
			"blockExpression", "messageExpression", "receiver", "messageSelector", 
			"keywordArgument", "keywordArgumentType", "selectorExpression", "selectorName", 
			"protocolExpression", "encodeExpression", "typeVariableDeclarator", "throwStatement", 
			"tryBlock", "catchStatement", "synchronizedStatement", "autoreleaseStatement", 
			"functionDeclaration", "functionDefinition", "functionSignature", "attribute", 
			"attributeName", "attributeParameters", "attributeParameterList", "attributeParameter", 
			"attributeParameterAssignment", "declaration", "functionCallExpression", 
			"enumDeclaration", "varDeclaration", "typedefDeclaration", "typeDeclaratorList", 
			"typeDeclarator", "declarationSpecifiers", "attributeSpecifier", "initDeclaratorList", 
			"initDeclarator", "structOrUnionSpecifier", "fieldDeclaration", "specifierQualifierList", 
			"ibOutletQualifier", "arcBehaviourSpecifier", "nullabilitySpecifier", 
			"storageClassSpecifier", "typePrefix", "typeQualifier", "protocolQualifier", 
			"typeSpecifier", "typeofExpression", "fieldDeclaratorList", "fieldDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumeratorIdentifier", 
			"directDeclarator", "declaratorSuffix", "parameterList", "pointer", "macro", 
			"arrayInitializer", "structInitializer", "initializerList", "typeName", 
			"abstractDeclarator", "abstractDeclaratorSuffix", "parameterDeclarationList", 
			"parameterDeclaration", "declarator", "statement", "labeledStatement", 
			"rangeExpression", "compoundStatement", "selectionStatement", "switchStatement", 
			"switchBlock", "switchSection", "switchLabel", "iterationStatement", 
			"whileStatement", "doStatement", "forStatement", "forLoopInitializer", 
			"forInStatement", "jumpStatement", "expressions", "expression", "assignmentOperator", 
			"castExpression", "initializer", "constantExpression", "unaryExpression", 
			"unaryOperator", "postfixExpression", "postfix", "argumentExpressionList", 
			"argumentExpression", "primaryExpression", "constant", "stringLiteral", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", null, "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", null, "'inline'", "'int'", "'long'", "'register'", 
			"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'while'", "'_Bool'", "'_Complex'", "'_Imaginery'", "'true'", 
			"'false'", "'BOOL'", "'Class'", "'bycopy'", "'byref'", "'id'", "'IMP'", 
			"'in'", "'inout'", "'nil'", "'NO'", "'NULL'", "'oneway'", "'out'", "'Protocol'", 
			"'SEL'", "'self'", "'super'", "'YES'", "'@autoreleasepool'", "'@catch'", 
			"'@class'", "'@dynamic'", "'@encode'", "'@end'", "'@finally'", "'@implementation'", 
			"'@interface'", "'@import'", "'@package'", "'@protocol'", "'@optional'", 
			"'@private'", "'@property'", "'@protected'", "'@public'", "'@required'", 
			"'@selector'", "'@synchronized'", "'@synthesize'", "'@throw'", "'@try'", 
			"'atomic'", "'nonatomic'", "'retain'", "'__attribute__'", "'__autoreleasing'", 
			"'__block'", "'__bridge'", "'__bridge_retained'", "'__bridge_transfer'", 
			"'__covariant'", "'__contravariant'", "'__deprecated'", "'__kindof'", 
			"'__strong'", null, "'__unsafe_unretained'", "'__unused'", "'__weak'", 
			null, null, null, "'null_resettable'", "'NS_INLINE'", "'NS_ENUM'", "'NS_OPTIONS'", 
			"'assign'", "'copy'", "'getter'", "'setter'", "'strong'", "'readonly'", 
			"'readwrite'", "'weak'", "'unsafe_unretained'", "'IBOutlet'", "'IBOutletCollection'", 
			"'IBInspectable'", "'IB_DESIGNABLE'", null, null, null, null, null, "'__TVOS_PROHIBITED'", 
			null, null, null, "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", 
			"'@'", "'='", null, null, null, "'~'", "'?'", "':'", null, null, null, 
			null, null, null, "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'...'", null, null, null, null, null, 
			null, null, null, null, null, "'\\'", null, null, null, null, null, null, 
			null, null, "'defined'", null, "'elif'", null, "'undef'", "'ifdef'", 
			"'ifndef'", "'endif'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", "GOTO", "IF", 
			"INLINE", "INT", "LONG", "REGISTER", "RESTRICT", "RETURN", "SHORT", "SIGNED", 
			"SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", "UNION", "UNSIGNED", 
			"VOID", "VOLATILE", "WHILE", "BOOL_", "COMPLEX", "IMAGINERY", "TRUE", 
			"FALSE", "BOOL", "Class", "BYCOPY", "BYREF", "ID", "IMP", "IN", "INOUT", 
			"NIL", "NO", "NULL_", "ONEWAY", "OUT", "PROTOCOL_", "SEL", "SELF", "SUPER", 
			"YES", "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", "END", 
			"FINALLY", "IMPLEMENTATION", "INTERFACE", "IMPORT", "PACKAGE", "PROTOCOL", 
			"OPTIONAL", "PRIVATE", "PROPERTY", "PROTECTED", "PUBLIC", "REQUIRED", 
			"SELECTOR", "SYNCHRONIZED", "SYNTHESIZE", "THROW", "TRY", "ATOMIC", "NONATOMIC", 
			"RETAIN", "ATTRIBUTE", "AUTORELEASING_QUALIFIER", "BLOCK", "BRIDGE", 
			"BRIDGE_RETAINED", "BRIDGE_TRANSFER", "COVARIANT", "CONTRAVARIANT", "DEPRECATED", 
			"KINDOF", "STRONG_QUALIFIER", "TYPEOF", "UNSAFE_UNRETAINED_QUALIFIER", 
			"UNUSED", "WEAK_QUALIFIER", "NULL_UNSPECIFIED", "NULLABLE", "NONNULL", 
			"NULL_RESETTABLE", "NS_INLINE", "NS_ENUM", "NS_OPTIONS", "ASSIGN", "COPY", 
			"GETTER", "SETTER", "STRONG", "READONLY", "READWRITE", "WEAK", "UNSAFE_UNRETAINED", 
			"IB_OUTLET", "IB_OUTLET_COLLECTION", "IB_INSPECTABLE", "IB_DESIGNABLE", 
			"NS_ASSUME_NONNULL_BEGIN", "NS_ASSUME_NONNULL_END", "EXTERN_SUFFIX", 
			"IOS_SUFFIX", "MAC_SUFFIX", "TVOS_PROHIBITED", "IDENTIFIER", "LP", "RP", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "STRUCTACCESS", 
			"AT", "ASSIGNMENT", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "DIV", "BITAND", "BITOR", "BITXOR", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "ELIPSIS", "CHARACTER_LITERAL", 
			"STRING_START", "HEX_LITERAL", "OCTAL_LITERAL", "BINARY_LITERAL", "DECIMAL_LITERAL", 
			"FLOATING_POINT_LITERAL", "WS", "MULTI_COMMENT", "SINGLE_COMMENT", "BACKSLASH", 
			"SHARP", "STRING_NEWLINE", "STRING_END", "STRING_VALUE", "DIRECTIVE_IMPORT", 
			"DIRECTIVE_INCLUDE", "DIRECTIVE_PRAGMA", "DIRECTIVE_DEFINE", "DIRECTIVE_DEFINED", 
			"DIRECTIVE_IF", "DIRECTIVE_ELIF", "DIRECTIVE_ELSE", "DIRECTIVE_UNDEF", 
			"DIRECTIVE_IFDEF", "DIRECTIVE_IFNDEF", "DIRECTIVE_ENDIF", "DIRECTIVE_TRUE", 
			"DIRECTIVE_FALSE", "DIRECTIVE_ERROR", "DIRECTIVE_WARNING", "DIRECTIVE_BANG", 
			"DIRECTIVE_LP", "DIRECTIVE_RP", "DIRECTIVE_EQUAL", "DIRECTIVE_NOTEQUAL", 
			"DIRECTIVE_AND", "DIRECTIVE_OR", "DIRECTIVE_LT", "DIRECTIVE_GT", "DIRECTIVE_LE", 
			"DIRECTIVE_GE", "DIRECTIVE_STRING", "DIRECTIVE_ID", "DIRECTIVE_DECIMAL_LITERAL", 
			"DIRECTIVE_FLOAT", "DIRECTIVE_NEWLINE", "DIRECTIVE_MULTI_COMMENT", "DIRECTIVE_SINGLE_COMMENT", 
			"DIRECTIVE_BACKSLASH_NEWLINE", "DIRECTIVE_TEXT_NEWLINE", "DIRECTIVE_TEXT"
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
	public String getGrammarFileName() { return "ObjectiveCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjectiveCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjectiveCParser.EOF, 0); }
		public List<TopLevelDeclarationContext> topLevelDeclaration() {
			return getRuleContexts(TopLevelDeclarationContext.class);
		}
		public TopLevelDeclarationContext topLevelDeclaration(int i) {
			return getRuleContext(TopLevelDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1295065285207669298L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1170935903116263447L) != 0)) {
				{
				{
				setState(288);
				topLevelDeclaration();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ClassInterfaceContext classInterface() {
			return getRuleContext(ClassInterfaceContext.class,0);
		}
		public ClassImplementationContext classImplementation() {
			return getRuleContext(ClassImplementationContext.class,0);
		}
		public CategoryInterfaceContext categoryInterface() {
			return getRuleContext(CategoryInterfaceContext.class,0);
		}
		public CategoryImplementationContext categoryImplementation() {
			return getRuleContext(CategoryImplementationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public ProtocolDeclarationListContext protocolDeclarationList() {
			return getRuleContext(ProtocolDeclarationListContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public TopLevelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclaration; }
	}

	public final TopLevelDeclarationContext topLevelDeclaration() throws RecognitionException {
		TopLevelDeclarationContext _localctx = new TopLevelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelDeclaration);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				classInterface();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				classImplementation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				categoryInterface();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				categoryImplementation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				protocolDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(304);
				protocolDeclarationList();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				classDeclarationList();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				functionDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ObjectiveCParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IMPORT);
			setState(310);
			identifier();
			setState(311);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInterfaceContext extends ParserRuleContext {
		public GenericTypeSpecifierContext className;
		public IdentifierContext superclassName;
		public TerminalNode INTERFACE() { return getToken(ObjectiveCParser.INTERFACE, 0); }
		public TerminalNode END() { return getToken(ObjectiveCParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public TerminalNode IB_DESIGNABLE() { return getToken(ObjectiveCParser.IB_DESIGNABLE, 0); }
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInterface; }
	}

	public final ClassInterfaceContext classInterface() throws RecognitionException {
		ClassInterfaceContext _localctx = new ClassInterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IB_DESIGNABLE) {
				{
				setState(313);
				match(IB_DESIGNABLE);
				}
			}

			setState(316);
			match(INTERFACE);
			setState(317);
			((ClassInterfaceContext)_localctx).className = genericTypeSpecifier();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(318);
				match(COLON);
				setState(319);
				((ClassInterfaceContext)_localctx).superclassName = identifier();
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(322);
				match(LT);
				setState(323);
				protocolList();
				setState(324);
				match(GT);
				}
			}

			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(328);
				instanceVariables();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143780600822322L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 9147936743095809L) != 0) || _la==ADD || _la==SUB) {
				{
				setState(331);
				interfaceDeclarationList();
				}
			}

			setState(334);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CategoryInterfaceContext extends ParserRuleContext {
		public GenericTypeSpecifierContext className;
		public IdentifierContext categoryName;
		public TerminalNode INTERFACE() { return getToken(ObjectiveCParser.INTERFACE, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode END() { return getToken(ObjectiveCParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CategoryInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryInterface; }
	}

	public final CategoryInterfaceContext categoryInterface() throws RecognitionException {
		CategoryInterfaceContext _localctx = new CategoryInterfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_categoryInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(INTERFACE);
			setState(337);
			((CategoryInterfaceContext)_localctx).className = genericTypeSpecifier();
			setState(338);
			match(LP);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
				{
				setState(339);
				((CategoryInterfaceContext)_localctx).categoryName = identifier();
				}
			}

			setState(342);
			match(RP);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(343);
				match(LT);
				setState(344);
				protocolList();
				setState(345);
				match(GT);
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(349);
				instanceVariables();
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143780600822322L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 9147936743095809L) != 0) || _la==ADD || _la==SUB) {
				{
				setState(352);
				interfaceDeclarationList();
				}
			}

			setState(355);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassImplementationContext extends ParserRuleContext {
		public GenericTypeSpecifierContext className;
		public IdentifierContext superclassName;
		public TerminalNode IMPLEMENTATION() { return getToken(ObjectiveCParser.IMPLEMENTATION, 0); }
		public TerminalNode END() { return getToken(ObjectiveCParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplementation; }
	}

	public final ClassImplementationContext classImplementation() throws RecognitionException {
		ClassImplementationContext _localctx = new ClassImplementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IMPLEMENTATION);
			setState(358);
			((ClassImplementationContext)_localctx).className = genericTypeSpecifier();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(359);
				match(COLON);
				setState(360);
				((ClassImplementationContext)_localctx).superclassName = identifier();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(363);
				instanceVariables();
				}
			}

			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2447986789814516274L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 142936511610873L) != 0) || _la==ADD || _la==SUB) {
				{
				setState(366);
				implementationDefinitionList();
				}
			}

			setState(369);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CategoryImplementationContext extends ParserRuleContext {
		public GenericTypeSpecifierContext className;
		public IdentifierContext categoryName;
		public TerminalNode IMPLEMENTATION() { return getToken(ObjectiveCParser.IMPLEMENTATION, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode END() { return getToken(ObjectiveCParser.END, 0); }
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public CategoryImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryImplementation; }
	}

	public final CategoryImplementationContext categoryImplementation() throws RecognitionException {
		CategoryImplementationContext _localctx = new CategoryImplementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_categoryImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(IMPLEMENTATION);
			setState(372);
			((CategoryImplementationContext)_localctx).className = genericTypeSpecifier();
			setState(373);
			match(LP);
			setState(374);
			((CategoryImplementationContext)_localctx).categoryName = identifier();
			setState(375);
			match(RP);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2447986789814516274L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 142936511610873L) != 0) || _la==ADD || _la==SUB) {
				{
				setState(376);
				implementationDefinitionList();
				}
			}

			setState(379);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericsSpecifierContext genericsSpecifier() {
			return getRuleContext(GenericsSpecifierContext.class,0);
		}
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public GenericTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeSpecifier; }
	}

	public final GenericTypeSpecifierContext genericTypeSpecifier() throws RecognitionException {
		GenericTypeSpecifierContext _localctx = new GenericTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_genericTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			identifier();
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(382);
				match(LT);
				setState(383);
				protocolList();
				setState(384);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(386);
				genericsSpecifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(ObjectiveCParser.PROTOCOL, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode END() { return getToken(ObjectiveCParser.END, 0); }
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public List<ProtocolDeclarationSectionContext> protocolDeclarationSection() {
			return getRuleContexts(ProtocolDeclarationSectionContext.class);
		}
		public ProtocolDeclarationSectionContext protocolDeclarationSection(int i) {
			return getRuleContext(ProtocolDeclarationSectionContext.class,i);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(PROTOCOL);
			setState(390);
			protocolName();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(391);
				match(LT);
				setState(392);
				protocolList();
				setState(393);
				match(GT);
				}
			}

			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143780600822322L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 36591746972383269L) != 0) || _la==ADD || _la==SUB) {
				{
				{
				setState(397);
				protocolDeclarationSection();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolDeclarationSectionContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode REQUIRED() { return getToken(ObjectiveCParser.REQUIRED, 0); }
		public TerminalNode OPTIONAL() { return getToken(ObjectiveCParser.OPTIONAL, 0); }
		public List<InterfaceDeclarationListContext> interfaceDeclarationList() {
			return getRuleContexts(InterfaceDeclarationListContext.class);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList(int i) {
			return getRuleContext(InterfaceDeclarationListContext.class,i);
		}
		public ProtocolDeclarationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclarationSection; }
	}

	public final ProtocolDeclarationSectionContext protocolDeclarationSection() throws RecognitionException {
		ProtocolDeclarationSectionContext _localctx = new ProtocolDeclarationSectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_protocolDeclarationSection);
		int _la;
		try {
			int _alt;
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL:
			case REQUIRED:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				((ProtocolDeclarationSectionContext)_localctx).modifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPTIONAL || _la==REQUIRED) ) {
					((ProtocolDeclarationSectionContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(406);
						interfaceDeclarationList();
						}
						} 
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case AUTO:
			case CHAR:
			case CONST:
			case DOUBLE:
			case ENUM:
			case EXTERN:
			case FLOAT:
			case INLINE:
			case INT:
			case LONG:
			case REGISTER:
			case RESTRICT:
			case SHORT:
			case SIGNED:
			case STATIC:
			case STRUCT:
			case TYPEDEF:
			case UNION:
			case UNSIGNED:
			case VOID:
			case VOLATILE:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case PROPERTY:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case ATTRIBUTE:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case STRONG_QUALIFIER:
			case TYPEOF:
			case UNSAFE_UNRETAINED_QUALIFIER:
			case UNUSED:
			case WEAK_QUALIFIER:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(413); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(412);
						interfaceDeclarationList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(415); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolDeclarationListContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(ObjectiveCParser.PROTOCOL, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public ProtocolDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclarationList; }
	}

	public final ProtocolDeclarationListContext protocolDeclarationList() throws RecognitionException {
		ProtocolDeclarationListContext _localctx = new ProtocolDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_protocolDeclarationList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(PROTOCOL);
			setState(420);
			protocolList();
			setState(421);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationListContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ObjectiveCParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(CLASS);
			setState(424);
			identifier();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(425);
				match(COMMA);
				setState(426);
				identifier();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolListContext extends ParserRuleContext {
		public List<ProtocolNameContext> protocolName() {
			return getRuleContexts(ProtocolNameContext.class);
		}
		public ProtocolNameContext protocolName(int i) {
			return getRuleContext(ProtocolNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public ProtocolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolList; }
	}

	public final ProtocolListContext protocolList() throws RecognitionException {
		ProtocolListContext _localctx = new ProtocolListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			protocolName();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(435);
				match(COMMA);
				setState(436);
				protocolName();
				}
				}
				setState(441);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(ObjectiveCParser.PROPERTY, 0); }
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public PropertyAttributesListContext propertyAttributesList() {
			return getRuleContext(PropertyAttributesListContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public IbOutletQualifierContext ibOutletQualifier() {
			return getRuleContext(IbOutletQualifierContext.class,0);
		}
		public TerminalNode IB_INSPECTABLE() { return getToken(ObjectiveCParser.IB_INSPECTABLE, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(PROPERTY);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(443);
				match(LP);
				setState(444);
				propertyAttributesList();
				setState(445);
				match(RP);
				}
			}

			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(449);
				ibOutletQualifier();
				}
				break;
			}
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(452);
				match(IB_INSPECTABLE);
				}
				break;
			}
			setState(455);
			fieldDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAttributesListContext extends ParserRuleContext {
		public List<PropertyAttributeContext> propertyAttribute() {
			return getRuleContexts(PropertyAttributeContext.class);
		}
		public PropertyAttributeContext propertyAttribute(int i) {
			return getRuleContext(PropertyAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public PropertyAttributesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttributesList; }
	}

	public final PropertyAttributesListContext propertyAttributesList() throws RecognitionException {
		PropertyAttributesListContext _localctx = new PropertyAttributesListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyAttributesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			propertyAttribute();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(458);
				match(COMMA);
				setState(459);
				propertyAttribute();
				}
				}
				setState(464);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAttributeContext extends ParserRuleContext {
		public TerminalNode ATOMIC() { return getToken(ObjectiveCParser.ATOMIC, 0); }
		public TerminalNode NONATOMIC() { return getToken(ObjectiveCParser.NONATOMIC, 0); }
		public TerminalNode STRONG() { return getToken(ObjectiveCParser.STRONG, 0); }
		public TerminalNode WEAK() { return getToken(ObjectiveCParser.WEAK, 0); }
		public TerminalNode RETAIN() { return getToken(ObjectiveCParser.RETAIN, 0); }
		public TerminalNode ASSIGN() { return getToken(ObjectiveCParser.ASSIGN, 0); }
		public TerminalNode UNSAFE_UNRETAINED() { return getToken(ObjectiveCParser.UNSAFE_UNRETAINED, 0); }
		public TerminalNode COPY() { return getToken(ObjectiveCParser.COPY, 0); }
		public TerminalNode READONLY() { return getToken(ObjectiveCParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(ObjectiveCParser.READWRITE, 0); }
		public TerminalNode GETTER() { return getToken(ObjectiveCParser.GETTER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ObjectiveCParser.ASSIGNMENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SETTER() { return getToken(ObjectiveCParser.SETTER, 0); }
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public PropertyAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttribute; }
	}

	public final PropertyAttributeContext propertyAttribute() throws RecognitionException {
		PropertyAttributeContext _localctx = new PropertyAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyAttribute);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(ATOMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(NONATOMIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(STRONG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(WEAK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				match(RETAIN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				match(ASSIGN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				match(UNSAFE_UNRETAINED);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(472);
				match(COPY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(473);
				match(READONLY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(474);
				match(READWRITE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(475);
				match(GETTER);
				setState(476);
				match(ASSIGNMENT);
				setState(477);
				identifier();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(478);
				match(SETTER);
				setState(479);
				match(ASSIGNMENT);
				setState(480);
				identifier();
				setState(481);
				match(COLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(483);
				nullabilitySpecifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(484);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolNameContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COVARIANT() { return getToken(ObjectiveCParser.COVARIANT, 0); }
		public TerminalNode CONTRAVARIANT() { return getToken(ObjectiveCParser.CONTRAVARIANT, 0); }
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_protocolName);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(LT);
				setState(488);
				protocolList();
				setState(489);
				match(GT);
				}
				break;
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(491);
					_la = _input.LA(1);
					if ( !(_la==COVARIANT || _la==CONTRAVARIANT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(494);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceVariablesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public List<VisibilitySectionContext> visibilitySection() {
			return getRuleContexts(VisibilitySectionContext.class);
		}
		public VisibilitySectionContext visibilitySection(int i) {
			return getRuleContext(VisibilitySectionContext.class,i);
		}
		public InstanceVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVariables; }
	}

	public final InstanceVariablesContext instanceVariables() throws RecognitionException {
		InstanceVariablesContext _localctx = new InstanceVariablesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instanceVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(LBRACE);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143779995789872L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 146366987889467497L) != 0)) {
				{
				{
				setState(498);
				visibilitySection();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VisibilitySectionContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public VisibilitySectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilitySection; }
	}

	public final VisibilitySectionContext visibilitySection() throws RecognitionException {
		VisibilitySectionContext _localctx = new VisibilitySectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_visibilitySection);
		try {
			int _alt;
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKAGE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				accessModifier();
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(507);
						fieldDeclaration();
						}
						} 
					}
					setState(512);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case CHAR:
			case CONST:
			case DOUBLE:
			case ENUM:
			case FLOAT:
			case INLINE:
			case INT:
			case LONG:
			case RESTRICT:
			case SHORT:
			case SIGNED:
			case STRUCT:
			case UNION:
			case UNSIGNED:
			case VOID:
			case VOLATILE:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case STRONG_QUALIFIER:
			case TYPEOF:
			case UNSAFE_UNRETAINED_QUALIFIER:
			case UNUSED:
			case WEAK_QUALIFIER:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(514); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(513);
						fieldDeclaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(516); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(ObjectiveCParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ObjectiveCParser.PROTECTED, 0); }
		public TerminalNode PACKAGE() { return getToken(ObjectiveCParser.PACKAGE, 0); }
		public TerminalNode PUBLIC() { return getToken(ObjectiveCParser.PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 105L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDeclarationContext> classMethodDeclaration() {
			return getRuleContexts(ClassMethodDeclarationContext.class);
		}
		public ClassMethodDeclarationContext classMethodDeclaration(int i) {
			return getRuleContext(ClassMethodDeclarationContext.class,i);
		}
		public List<InstanceMethodDeclarationContext> instanceMethodDeclaration() {
			return getRuleContexts(InstanceMethodDeclarationContext.class);
		}
		public InstanceMethodDeclarationContext instanceMethodDeclaration(int i) {
			return getRuleContext(InstanceMethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public InterfaceDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclarationList; }
	}

	public final InterfaceDeclarationListContext interfaceDeclarationList() throws RecognitionException {
		InterfaceDeclarationListContext _localctx = new InterfaceDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(527); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(522);
						declaration();
						}
						break;
					case 2:
						{
						setState(523);
						classMethodDeclaration();
						}
						break;
					case 3:
						{
						setState(524);
						instanceMethodDeclaration();
						}
						break;
					case 4:
						{
						setState(525);
						propertyDeclaration();
						}
						break;
					case 5:
						{
						setState(526);
						functionDeclaration();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(529); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ObjectiveCParser.ADD, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDeclaration; }
	}

	public final ClassMethodDeclarationContext classMethodDeclaration() throws RecognitionException {
		ClassMethodDeclarationContext _localctx = new ClassMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(ADD);
			setState(532);
			methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(ObjectiveCParser.SUB, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InstanceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDeclaration; }
	}

	public final InstanceMethodDeclarationContext instanceMethodDeclaration() throws RecognitionException {
		InstanceMethodDeclarationContext _localctx = new InstanceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instanceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(SUB);
			setState(535);
			methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(537);
				methodType();
				}
			}

			setState(540);
			methodSelector();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
				{
				setState(541);
				macro();
				}
			}

			setState(544);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementationDefinitionListContext extends ParserRuleContext {
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDefinitionContext> classMethodDefinition() {
			return getRuleContexts(ClassMethodDefinitionContext.class);
		}
		public ClassMethodDefinitionContext classMethodDefinition(int i) {
			return getRuleContext(ClassMethodDefinitionContext.class,i);
		}
		public List<InstanceMethodDefinitionContext> instanceMethodDefinition() {
			return getRuleContexts(InstanceMethodDefinitionContext.class);
		}
		public InstanceMethodDefinitionContext instanceMethodDefinition(int i) {
			return getRuleContext(InstanceMethodDefinitionContext.class,i);
		}
		public List<PropertyImplementationContext> propertyImplementation() {
			return getRuleContexts(PropertyImplementationContext.class);
		}
		public PropertyImplementationContext propertyImplementation(int i) {
			return getRuleContext(PropertyImplementationContext.class,i);
		}
		public ImplementationDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementationDefinitionList; }
	}

	public final ImplementationDefinitionListContext implementationDefinitionList() throws RecognitionException {
		ImplementationDefinitionListContext _localctx = new ImplementationDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_implementationDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(546);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(547);
					declaration();
					}
					break;
				case 3:
					{
					setState(548);
					classMethodDefinition();
					}
					break;
				case 4:
					{
					setState(549);
					instanceMethodDefinition();
					}
					break;
				case 5:
					{
					setState(550);
					propertyImplementation();
					}
					break;
				}
				}
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2447986789814516274L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 142936511610873L) != 0) || _la==ADD || _la==SUB );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ObjectiveCParser.ADD, 0); }
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ClassMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDefinition; }
	}

	public final ClassMethodDefinitionContext classMethodDefinition() throws RecognitionException {
		ClassMethodDefinitionContext _localctx = new ClassMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(ADD);
			setState(556);
			methodDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceMethodDefinitionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(ObjectiveCParser.SUB, 0); }
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public InstanceMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDefinition; }
	}

	public final InstanceMethodDefinitionContext instanceMethodDefinition() throws RecognitionException {
		InstanceMethodDefinitionContext _localctx = new InstanceMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instanceMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(SUB);
			setState(559);
			methodDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDefinitionContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(561);
				methodType();
				}
			}

			setState(564);
			methodSelector();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & -414491694415611649L) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 1125899913166847L) != 0)) {
				{
				setState(565);
				initDeclaratorList();
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(568);
				match(SEMI);
				}
			}

			setState(571);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordDeclaratorContext> keywordDeclarator() {
			return getRuleContexts(KeywordDeclaratorContext.class);
		}
		public KeywordDeclaratorContext keywordDeclarator(int i) {
			return getRuleContext(KeywordDeclaratorContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ObjectiveCParser.COMMA, 0); }
		public TerminalNode ELIPSIS() { return getToken(ObjectiveCParser.ELIPSIS, 0); }
		public MethodSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSelector; }
	}

	public final MethodSelectorContext methodSelector() throws RecognitionException {
		MethodSelectorContext _localctx = new MethodSelectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodSelector);
		int _la;
		try {
			int _alt;
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(574);
						keywordDeclarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(577); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(579);
					match(COMMA);
					setState(580);
					match(ELIPSIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordDeclaratorContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<MethodTypeContext> methodType() {
			return getRuleContexts(MethodTypeContext.class);
		}
		public MethodTypeContext methodType(int i) {
			return getRuleContext(MethodTypeContext.class,i);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier() {
			return getRuleContext(ArcBehaviourSpecifierContext.class,0);
		}
		public KeywordDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordDeclarator; }
	}

	public final KeywordDeclaratorContext keywordDeclarator() throws RecognitionException {
		KeywordDeclaratorContext _localctx = new KeywordDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_keywordDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763731447808L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
				{
				setState(585);
				selector();
				}
			}

			setState(588);
			match(COLON);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LP) {
				{
				{
				setState(589);
				methodType();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(595);
				arcBehaviourSpecifier();
				}
				break;
			}
			setState(598);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ObjectiveCParser.RETURN, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selector);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(RETURN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(LP);
			setState(605);
			typeName();
			setState(606);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyImplementationContext extends ParserRuleContext {
		public TerminalNode SYNTHESIZE() { return getToken(ObjectiveCParser.SYNTHESIZE, 0); }
		public PropertySynthesizeListContext propertySynthesizeList() {
			return getRuleContext(PropertySynthesizeListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public TerminalNode DYNAMIC() { return getToken(ObjectiveCParser.DYNAMIC, 0); }
		public PropertyImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyImplementation; }
	}

	public final PropertyImplementationContext propertyImplementation() throws RecognitionException {
		PropertyImplementationContext _localctx = new PropertyImplementationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_propertyImplementation);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(SYNTHESIZE);
				setState(609);
				propertySynthesizeList();
				setState(610);
				match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(DYNAMIC);
				setState(613);
				propertySynthesizeList();
				setState(614);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertySynthesizeListContext extends ParserRuleContext {
		public List<PropertySynthesizeItemContext> propertySynthesizeItem() {
			return getRuleContexts(PropertySynthesizeItemContext.class);
		}
		public PropertySynthesizeItemContext propertySynthesizeItem(int i) {
			return getRuleContext(PropertySynthesizeItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public PropertySynthesizeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeList; }
	}

	public final PropertySynthesizeListContext propertySynthesizeList() throws RecognitionException {
		PropertySynthesizeListContext _localctx = new PropertySynthesizeListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertySynthesizeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			propertySynthesizeItem();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(619);
				match(COMMA);
				setState(620);
				propertySynthesizeItem();
				}
				}
				setState(625);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertySynthesizeItemContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ObjectiveCParser.ASSIGNMENT, 0); }
		public PropertySynthesizeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeItem; }
	}

	public final PropertySynthesizeItemContext propertySynthesizeItem() throws RecognitionException {
		PropertySynthesizeItemContext _localctx = new PropertySynthesizeItemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertySynthesizeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			identifier();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(627);
				match(ASSIGNMENT);
				setState(628);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockTypeContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode BITXOR() { return getToken(ObjectiveCParser.BITXOR, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockType; }
	}

	public final BlockTypeContext blockType() throws RecognitionException {
		BlockTypeContext _localctx = new BlockTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blockType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(631);
				nullabilitySpecifier();
				}
				break;
			}
			setState(634);
			typeSpecifier(0);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) {
				{
				setState(635);
				nullabilitySpecifier();
				}
			}

			setState(638);
			match(LP);
			setState(639);
			match(BITXOR);
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(640);
				nullabilitySpecifier();
				}
				break;
			case 2:
				{
				setState(641);
				typeSpecifier(0);
				}
				break;
			}
			setState(644);
			match(RP);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(645);
				blockParameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericsSpecifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public List<TypeSpecifierWithPrefixesContext> typeSpecifierWithPrefixes() {
			return getRuleContexts(TypeSpecifierWithPrefixesContext.class);
		}
		public TypeSpecifierWithPrefixesContext typeSpecifierWithPrefixes(int i) {
			return getRuleContext(TypeSpecifierWithPrefixesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public GenericsSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsSpecifier; }
	}

	public final GenericsSpecifierContext genericsSpecifier() throws RecognitionException {
		GenericsSpecifierContext _localctx = new GenericsSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_genericsSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(LT);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143779995789872L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063951351L) != 0)) {
				{
				setState(649);
				typeSpecifierWithPrefixes();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(650);
					match(COMMA);
					setState(651);
					typeSpecifierWithPrefixes();
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(659);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierWithPrefixesContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeSpecifierWithPrefixesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierWithPrefixes; }
	}

	public final TypeSpecifierWithPrefixesContext typeSpecifierWithPrefixes() throws RecognitionException {
		TypeSpecifierWithPrefixesContext _localctx = new TypeSpecifierWithPrefixesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeSpecifierWithPrefixes);
		try {
			int _alt;
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(661);
						typePrefix();
						}
						} 
					}
					setState(666);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(667);
				typeSpecifier(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryExpressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ObjectiveCParser.AT, 0); }
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public List<DictionaryPairContext> dictionaryPair() {
			return getRuleContexts(DictionaryPairContext.class);
		}
		public DictionaryPairContext dictionaryPair(int i) {
			return getRuleContext(DictionaryPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public DictionaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryExpression; }
	}

	public final DictionaryExpressionContext dictionaryExpression() throws RecognitionException {
		DictionaryExpressionContext _localctx = new DictionaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dictionaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(AT);
			setState(672);
			match(LBRACE);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(673);
				dictionaryPair();
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(674);
						match(COMMA);
						setState(675);
						dictionaryPair();
						}
						} 
					}
					setState(680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(681);
					match(COMMA);
					}
				}

				}
			}

			setState(686);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryPairContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DictionaryPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPair; }
	}

	public final DictionaryPairContext dictionaryPair() throws RecognitionException {
		DictionaryPairContext _localctx = new DictionaryPairContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dictionaryPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			castExpression();
			setState(689);
			match(COLON);
			setState(690);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ObjectiveCParser.AT, 0); }
		public TerminalNode LBRACK() { return getToken(ObjectiveCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjectiveCParser.RBRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ObjectiveCParser.COMMA, 0); }
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(AT);
			setState(693);
			match(LBRACK);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(694);
				expressions();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(695);
					match(COMMA);
					}
				}

				}
			}

			setState(700);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoxExpressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ObjectiveCParser.AT, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxExpression; }
	}

	public final BoxExpressionContext boxExpression() throws RecognitionException {
		BoxExpressionContext _localctx = new BoxExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_boxExpression);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(AT);
				setState(703);
				match(LP);
				setState(704);
				expression(0);
				setState(705);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(AT);
				setState(710);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NIL:
				case NO:
				case NULL_:
				case YES:
				case ADD:
				case SUB:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(708);
					constant();
					}
					break;
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(709);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<TypeVariableDeclaratorOrNameContext> typeVariableDeclaratorOrName() {
			return getRuleContexts(TypeVariableDeclaratorOrNameContext.class);
		}
		public TypeVariableDeclaratorOrNameContext typeVariableDeclaratorOrName(int i) {
			return getRuleContext(TypeVariableDeclaratorOrNameContext.class,i);
		}
		public TerminalNode VOID() { return getToken(ObjectiveCParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public BlockParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParameters; }
	}

	public final BlockParametersContext blockParameters() throws RecognitionException {
		BlockParametersContext _localctx = new BlockParametersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_blockParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LP);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143780063951410L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063951359L) != 0)) {
				{
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(715);
					typeVariableDeclaratorOrName();
					}
					break;
				case 2:
					{
					setState(716);
					match(VOID);
					}
					break;
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(719);
					match(COMMA);
					setState(720);
					typeVariableDeclaratorOrName();
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(728);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVariableDeclaratorOrNameContext extends ParserRuleContext {
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeVariableDeclaratorOrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclaratorOrName; }
	}

	public final TypeVariableDeclaratorOrNameContext typeVariableDeclaratorOrName() throws RecognitionException {
		TypeVariableDeclaratorOrNameContext _localctx = new TypeVariableDeclaratorOrNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeVariableDeclaratorOrName);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				typeVariableDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockExpressionContext extends ParserRuleContext {
		public TerminalNode BITXOR() { return getToken(ObjectiveCParser.BITXOR, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(BITXOR);
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(735);
				typeSpecifier(0);
				}
				break;
			}
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) {
				{
				setState(738);
				nullabilitySpecifier();
				}
			}

			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(741);
				blockParameters();
				}
			}

			setState(744);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MessageExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ObjectiveCParser.LBRACK, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ObjectiveCParser.RBRACK, 0); }
		public MessageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpression; }
	}

	public final MessageExpressionContext messageExpression() throws RecognitionException {
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_messageExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(LBRACK);
			setState(747);
			receiver();
			setState(748);
			messageSelector();
			setState(749);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_receiver);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				typeSpecifier(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MessageSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordArgumentContext> keywordArgument() {
			return getRuleContexts(KeywordArgumentContext.class);
		}
		public KeywordArgumentContext keywordArgument(int i) {
			return getRuleContext(KeywordArgumentContext.class,i);
		}
		public MessageSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelector; }
	}

	public final MessageSelectorContext messageSelector() throws RecognitionException {
		MessageSelectorContext _localctx = new MessageSelectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_messageSelector);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(756);
					keywordArgument();
					}
					}
					setState(759); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763731447808L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4611703885491150775L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgumentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public List<KeywordArgumentTypeContext> keywordArgumentType() {
			return getRuleContexts(KeywordArgumentTypeContext.class);
		}
		public KeywordArgumentTypeContext keywordArgumentType(int i) {
			return getRuleContext(KeywordArgumentTypeContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public KeywordArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgument; }
	}

	public final KeywordArgumentContext keywordArgument() throws RecognitionException {
		KeywordArgumentContext _localctx = new KeywordArgumentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_keywordArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763731447808L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
				{
				setState(763);
				selector();
				}
			}

			setState(766);
			match(COLON);
			setState(767);
			keywordArgumentType();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(768);
				match(COMMA);
				setState(769);
				keywordArgumentType();
				}
				}
				setState(774);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgumentTypeContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public KeywordArgumentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgumentType; }
	}

	public final KeywordArgumentTypeContext keywordArgumentType() throws RecognitionException {
		KeywordArgumentTypeContext _localctx = new KeywordArgumentTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_keywordArgumentType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			expressions();
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(776);
				nullabilitySpecifier();
				}
				break;
			}
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(779);
				match(LBRACE);
				setState(780);
				initializerList();
				setState(781);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorExpressionContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(ObjectiveCParser.SELECTOR, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(SELECTOR);
			setState(786);
			match(LP);
			setState(787);
			selectorName();
			setState(788);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorNameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(ObjectiveCParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ObjectiveCParser.COLON, i);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectorName);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763731447808L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
						{
						setState(791);
						selector();
						}
					}

					setState(794);
					match(COLON);
					}
					}
					setState(797); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763731447808L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 4611703885491150775L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolExpressionContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(ObjectiveCParser.PROTOCOL, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ProtocolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolExpression; }
	}

	public final ProtocolExpressionContext protocolExpression() throws RecognitionException {
		ProtocolExpressionContext _localctx = new ProtocolExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_protocolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(PROTOCOL);
			setState(802);
			match(LP);
			setState(803);
			protocolName();
			setState(804);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EncodeExpressionContext extends ParserRuleContext {
		public TerminalNode ENCODE() { return getToken(ObjectiveCParser.ENCODE, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public EncodeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodeExpression; }
	}

	public final EncodeExpressionContext encodeExpression() throws RecognitionException {
		EncodeExpressionContext _localctx = new EncodeExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_encodeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(ENCODE);
			setState(807);
			match(LP);
			setState(808);
			typeName();
			setState(809);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVariableDeclaratorContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypeVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarator; }
	}

	public final TypeVariableDeclaratorContext typeVariableDeclarator() throws RecognitionException {
		TypeVariableDeclaratorContext _localctx = new TypeVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			declarationSpecifiers();
			setState(812);
			declarator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ObjectiveCParser.THROW, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_throwStatement);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(THROW);
				setState(815);
				match(LP);
				setState(816);
				identifier();
				setState(817);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(THROW);
				setState(820);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryBlockContext extends ParserRuleContext {
		public CompoundStatementContext tryStatement;
		public CompoundStatementContext finallyStatement;
		public TerminalNode TRY() { return getToken(ObjectiveCParser.TRY, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<CatchStatementContext> catchStatement() {
			return getRuleContexts(CatchStatementContext.class);
		}
		public CatchStatementContext catchStatement(int i) {
			return getRuleContext(CatchStatementContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(ObjectiveCParser.FINALLY, 0); }
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(TRY);
			setState(824);
			((TryBlockContext)_localctx).tryStatement = compoundStatement();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(825);
				catchStatement();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(831);
				match(FINALLY);
				setState(832);
				((TryBlockContext)_localctx).finallyStatement = compoundStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchStatementContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ObjectiveCParser.CATCH, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(CATCH);
			setState(836);
			match(LP);
			setState(837);
			typeVariableDeclarator();
			setState(838);
			match(RP);
			setState(839);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(ObjectiveCParser.SYNCHRONIZED, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(SYNCHRONIZED);
			setState(842);
			match(LP);
			setState(843);
			expression(0);
			setState(844);
			match(RP);
			setState(845);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AutoreleaseStatementContext extends ParserRuleContext {
		public TerminalNode AUTORELEASEPOOL() { return getToken(ObjectiveCParser.AUTORELEASEPOOL, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AutoreleaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoreleaseStatement; }
	}

	public final AutoreleaseStatementContext autoreleaseStatement() throws RecognitionException {
		AutoreleaseStatementContext _localctx = new AutoreleaseStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_autoreleaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(AUTORELEASEPOOL);
			setState(848);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			functionSignature();
			setState(851);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			functionSignature();
			setState(854);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSignatureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(856);
				declarationSpecifiers();
				}
				break;
			}
			setState(859);
			identifier();
			{
			setState(860);
			match(LP);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143780063951410L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063951359L) != 0)) {
				{
				setState(861);
				parameterList();
				}
			}

			setState(864);
			match(RP);
			}
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(866);
				attributeSpecifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeParametersContext attributeParameters() {
			return getRuleContext(AttributeParametersContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			attributeName();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(870);
				attributeParameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ObjectiveCParser.CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attributeName);
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(CONST);
				}
				break;
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public AttributeParameterListContext attributeParameterList() {
			return getRuleContext(AttributeParameterListContext.class,0);
		}
		public AttributeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameters; }
	}

	public final AttributeParametersContext attributeParameters() throws RecognitionException {
		AttributeParametersContext _localctx = new AttributeParametersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_attributeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(LP);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230101273804832L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 66584579L) != 0)) {
				{
				setState(878);
				attributeParameterList();
				}
			}

			setState(881);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeParameterListContext extends ParserRuleContext {
		public List<AttributeParameterContext> attributeParameter() {
			return getRuleContexts(AttributeParameterContext.class);
		}
		public AttributeParameterContext attributeParameter(int i) {
			return getRuleContext(AttributeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public AttributeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterList; }
	}

	public final AttributeParameterListContext attributeParameterList() throws RecognitionException {
		AttributeParameterListContext _localctx = new AttributeParameterListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attributeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			attributeParameter();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(884);
				match(COMMA);
				setState(885);
				attributeParameter();
				}
				}
				setState(890);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeParameterContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext attributeParameterAssignment() {
			return getRuleContext(AttributeParameterAssignmentContext.class,0);
		}
		public AttributeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameter; }
	}

	public final AttributeParameterContext attributeParameter() throws RecognitionException {
		AttributeParameterContext _localctx = new AttributeParameterContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeParameter);
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(894);
				attributeParameterAssignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeParameterAssignmentContext extends ParserRuleContext {
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ObjectiveCParser.ASSIGNMENT, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterAssignment; }
	}

	public final AttributeParameterAssignmentContext attributeParameterAssignment() throws RecognitionException {
		AttributeParameterAssignmentContext _localctx = new AttributeParameterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_attributeParameterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			attributeName();
			setState(898);
			match(ASSIGNMENT);
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NIL:
			case NO:
			case NULL_:
			case YES:
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				{
				setState(899);
				constant();
				}
				break;
			case CONST:
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				{
				setState(900);
				attributeName();
				}
				break;
			case STRING_START:
				{
				setState(901);
				stringLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TypedefDeclarationContext typedefDeclaration() {
			return getRuleContext(TypedefDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declaration);
		try {
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				functionCallExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(906);
				varDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				typedefDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(910);
				attributeSpecifier();
				}
			}

			setState(913);
			identifier();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(914);
				attributeSpecifier();
				}
			}

			setState(917);
			match(LP);
			setState(918);
			directDeclarator();
			setState(919);
			match(RP);
			setState(920);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ObjectiveCParser.TYPEDEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(922);
				attributeSpecifier();
				}
			}

			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(925);
				match(TYPEDEF);
				}
			}

			setState(928);
			enumSpecifier();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
				{
				setState(929);
				identifier();
				}
			}

			setState(932);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(934);
				declarationSpecifiers();
				setState(935);
				initDeclaratorList();
				}
				break;
			case 2:
				{
				setState(937);
				declarationSpecifiers();
				}
				break;
			}
			setState(940);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypedefDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(ObjectiveCParser.TYPEDEF, 0); }
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TypeDeclaratorListContext typeDeclaratorList() {
			return getRuleContext(TypeDeclaratorListContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public TypedefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDeclaration; }
	}

	public final TypedefDeclarationContext typedefDeclaration() throws RecognitionException {
		TypedefDeclarationContext _localctx = new TypedefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typedefDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(942);
				attributeSpecifier();
				}
			}

			setState(945);
			match(TYPEDEF);
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(946);
				declarationSpecifiers();
				setState(947);
				typeDeclaratorList();
				}
				break;
			case 2:
				{
				setState(949);
				declarationSpecifiers();
				}
				break;
			}
			setState(952);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclaratorListContext extends ParserRuleContext {
		public List<TypeDeclaratorContext> typeDeclarator() {
			return getRuleContexts(TypeDeclaratorContext.class);
		}
		public TypeDeclaratorContext typeDeclarator(int i) {
			return getRuleContext(TypeDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public TypeDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaratorList; }
	}

	public final TypeDeclaratorListContext typeDeclaratorList() throws RecognitionException {
		TypeDeclaratorListContext _localctx = new TypeDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			typeDeclarator();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(955);
				match(COMMA);
				setState(956);
				typeDeclarator();
				}
				}
				setState(961);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarator; }
	}

	public final TypeDeclaratorContext typeDeclarator() throws RecognitionException {
		TypeDeclaratorContext _localctx = new TypeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(962);
				pointer();
				}
			}

			setState(965);
			directDeclarator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<StorageClassSpecifierContext> storageClassSpecifier() {
			return getRuleContexts(StorageClassSpecifierContext.class);
		}
		public StorageClassSpecifierContext storageClassSpecifier(int i) {
			return getRuleContext(StorageClassSpecifierContext.class,i);
		}
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<IbOutletQualifierContext> ibOutletQualifier() {
			return getRuleContexts(IbOutletQualifierContext.class);
		}
		public IbOutletQualifierContext ibOutletQualifier(int i) {
			return getRuleContext(IbOutletQualifierContext.class,i);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(975);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(967);
						storageClassSpecifier();
						}
						break;
					case 2:
						{
						setState(968);
						attributeSpecifier();
						}
						break;
					case 3:
						{
						setState(969);
						arcBehaviourSpecifier();
						}
						break;
					case 4:
						{
						setState(970);
						nullabilitySpecifier();
						}
						break;
					case 5:
						{
						setState(971);
						ibOutletQualifier();
						}
						break;
					case 6:
						{
						setState(972);
						typePrefix();
						}
						break;
					case 7:
						{
						setState(973);
						typeQualifier();
						}
						break;
					case 8:
						{
						setState(974);
						typeSpecifier(0);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(977); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSpecifierContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(ObjectiveCParser.ATTRIBUTE, 0); }
		public List<TerminalNode> LP() { return getTokens(ObjectiveCParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(ObjectiveCParser.LP, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(ObjectiveCParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(ObjectiveCParser.RP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_attributeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(ATTRIBUTE);
			setState(980);
			match(LP);
			setState(981);
			match(LP);
			setState(982);
			attribute();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(983);
				match(COMMA);
				setState(984);
				attribute();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(RP);
			setState(991);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			initDeclarator();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(994);
				match(COMMA);
				setState(995);
				initDeclarator();
				}
				}
				setState(1000);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ObjectiveCParser.ASSIGNMENT, 0); }
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
		enterRule(_localctx, 158, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			declarator();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1002);
				match(ASSIGNMENT);
				setState(1003);
				initializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(ObjectiveCParser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(ObjectiveCParser.UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_structOrUnionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1007);
				identifier();
				}
				break;
			case 2:
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
					{
					setState(1008);
					identifier();
					}
				}

				setState(1011);
				match(LBRACE);
				setState(1013); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1012);
					fieldDeclaration();
					}
					}
					setState(1015); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 142143779995789872L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063951351L) != 0) );
				setState(1017);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public FieldDeclaratorListContext fieldDeclaratorList() {
			return getRuleContext(FieldDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			specifierQualifierList();
			setState(1022);
			fieldDeclaratorList();
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
				{
				setState(1023);
				macro();
				}
			}

			setState(1026);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<IbOutletQualifierContext> ibOutletQualifier() {
			return getRuleContexts(IbOutletQualifierContext.class);
		}
		public IbOutletQualifierContext ibOutletQualifier(int i) {
			return getRuleContext(IbOutletQualifierContext.class,i);
		}
		public List<TypePrefixContext> typePrefix() {
			return getRuleContexts(TypePrefixContext.class);
		}
		public TypePrefixContext typePrefix(int i) {
			return getRuleContext(TypePrefixContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_specifierQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1034); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1034);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(1028);
						arcBehaviourSpecifier();
						}
						break;
					case 2:
						{
						setState(1029);
						nullabilitySpecifier();
						}
						break;
					case 3:
						{
						setState(1030);
						ibOutletQualifier();
						}
						break;
					case 4:
						{
						setState(1031);
						typePrefix();
						}
						break;
					case 5:
						{
						setState(1032);
						typeQualifier();
						}
						break;
					case 6:
						{
						setState(1033);
						typeSpecifier(0);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1036); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IbOutletQualifierContext extends ParserRuleContext {
		public TerminalNode IB_OUTLET_COLLECTION() { return getToken(ObjectiveCParser.IB_OUTLET_COLLECTION, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode IB_OUTLET() { return getToken(ObjectiveCParser.IB_OUTLET, 0); }
		public IbOutletQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ibOutletQualifier; }
	}

	public final IbOutletQualifierContext ibOutletQualifier() throws RecognitionException {
		IbOutletQualifierContext _localctx = new IbOutletQualifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ibOutletQualifier);
		try {
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IB_OUTLET_COLLECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				match(IB_OUTLET_COLLECTION);
				setState(1039);
				match(LP);
				setState(1040);
				identifier();
				setState(1041);
				match(RP);
				}
				break;
			case IB_OUTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				match(IB_OUTLET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArcBehaviourSpecifierContext extends ParserRuleContext {
		public TerminalNode WEAK_QUALIFIER() { return getToken(ObjectiveCParser.WEAK_QUALIFIER, 0); }
		public TerminalNode STRONG_QUALIFIER() { return getToken(ObjectiveCParser.STRONG_QUALIFIER, 0); }
		public TerminalNode AUTORELEASING_QUALIFIER() { return getToken(ObjectiveCParser.AUTORELEASING_QUALIFIER, 0); }
		public TerminalNode UNSAFE_UNRETAINED_QUALIFIER() { return getToken(ObjectiveCParser.UNSAFE_UNRETAINED_QUALIFIER, 0); }
		public ArcBehaviourSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcBehaviourSpecifier; }
	}

	public final ArcBehaviourSpecifierContext arcBehaviourSpecifier() throws RecognitionException {
		ArcBehaviourSpecifierContext _localctx = new ArcBehaviourSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_arcBehaviourSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 10753L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullabilitySpecifierContext extends ParserRuleContext {
		public TerminalNode NULL_UNSPECIFIED() { return getToken(ObjectiveCParser.NULL_UNSPECIFIED, 0); }
		public TerminalNode NULLABLE() { return getToken(ObjectiveCParser.NULLABLE, 0); }
		public TerminalNode NONNULL() { return getToken(ObjectiveCParser.NONNULL, 0); }
		public TerminalNode NULL_RESETTABLE() { return getToken(ObjectiveCParser.NULL_RESETTABLE, 0); }
		public NullabilitySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullabilitySpecifier; }
	}

	public final NullabilitySpecifierContext nullabilitySpecifier() throws RecognitionException {
		NullabilitySpecifierContext _localctx = new NullabilitySpecifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_nullabilitySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(ObjectiveCParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ObjectiveCParser.REGISTER, 0); }
		public TerminalNode STATIC() { return getToken(ObjectiveCParser.STATIC, 0); }
		public TerminalNode EXTERN() { return getToken(ObjectiveCParser.EXTERN, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68161538L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePrefixContext extends ParserRuleContext {
		public TerminalNode BRIDGE() { return getToken(ObjectiveCParser.BRIDGE, 0); }
		public TerminalNode BRIDGE_TRANSFER() { return getToken(ObjectiveCParser.BRIDGE_TRANSFER, 0); }
		public TerminalNode BRIDGE_RETAINED() { return getToken(ObjectiveCParser.BRIDGE_RETAINED, 0); }
		public TerminalNode BLOCK() { return getToken(ObjectiveCParser.BLOCK, 0); }
		public TerminalNode INLINE() { return getToken(ObjectiveCParser.INLINE, 0); }
		public TerminalNode NS_INLINE() { return getToken(ObjectiveCParser.NS_INLINE, 0); }
		public TerminalNode KINDOF() { return getToken(ObjectiveCParser.KINDOF, 0); }
		public TypePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePrefix; }
	}

	public final TypePrefixContext typePrefix() throws RecognitionException {
		TypePrefixContext _localctx = new TypePrefixContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==INLINE || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 131215L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ObjectiveCParser.CONST, 0); }
		public TerminalNode VOLATILE() { return getToken(ObjectiveCParser.VOLATILE, 0); }
		public TerminalNode RESTRICT() { return getToken(ObjectiveCParser.RESTRICT, 0); }
		public ProtocolQualifierContext protocolQualifier() {
			return getRuleContext(ProtocolQualifierContext.class,0);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typeQualifier);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				match(VOLATILE);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				match(RESTRICT);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				protocolQualifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProtocolQualifierContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(ObjectiveCParser.IN, 0); }
		public TerminalNode OUT() { return getToken(ObjectiveCParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(ObjectiveCParser.INOUT, 0); }
		public TerminalNode BYCOPY() { return getToken(ObjectiveCParser.BYCOPY, 0); }
		public TerminalNode BYREF() { return getToken(ObjectiveCParser.BYREF, 0); }
		public TerminalNode ONEWAY() { return getToken(ObjectiveCParser.ONEWAY, 0); }
		public ProtocolQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolQualifier; }
	}

	public final ProtocolQualifierContext protocolQualifier() throws RecognitionException {
		ProtocolQualifierContext _localctx = new ProtocolQualifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_protocolQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6979699813122048L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ObjectiveCParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(ObjectiveCParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(ObjectiveCParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ObjectiveCParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ObjectiveCParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ObjectiveCParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ObjectiveCParser.DOUBLE, 0); }
		public TerminalNode SIGNED() { return getToken(ObjectiveCParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(ObjectiveCParser.UNSIGNED, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeofExpressionContext typeofExpression() {
			return getRuleContext(TypeofExpressionContext.class,0);
		}
		public GenericTypeSpecifierContext genericTypeSpecifier() {
			return getRuleContext(GenericTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public List<TerminalNode> MUL() { return getTokens(ObjectiveCParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ObjectiveCParser.MUL, i);
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_typeSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1063);
				match(VOID);
				}
				break;
			case 2:
				{
				setState(1064);
				match(CHAR);
				}
				break;
			case 3:
				{
				setState(1065);
				match(SHORT);
				}
				break;
			case 4:
				{
				setState(1066);
				match(INT);
				}
				break;
			case 5:
				{
				setState(1067);
				match(LONG);
				}
				break;
			case 6:
				{
				setState(1068);
				match(FLOAT);
				}
				break;
			case 7:
				{
				setState(1069);
				match(DOUBLE);
				}
				break;
			case 8:
				{
				setState(1070);
				match(SIGNED);
				}
				break;
			case 9:
				{
				setState(1071);
				match(UNSIGNED);
				}
				break;
			case 10:
				{
				setState(1072);
				identifier();
				}
				break;
			case 11:
				{
				setState(1073);
				typeofExpression();
				}
				break;
			case 12:
				{
				setState(1074);
				genericTypeSpecifier();
				}
				break;
			case 13:
				{
				setState(1075);
				structOrUnionSpecifier();
				}
				break;
			case 14:
				{
				setState(1076);
				enumSpecifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(1079);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1081); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1080);
							match(MUL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1083); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeofExpressionContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(ObjectiveCParser.TYPEOF, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TypeofExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofExpression; }
	}

	public final TypeofExpressionContext typeofExpression() throws RecognitionException {
		TypeofExpressionContext _localctx = new TypeofExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_typeofExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(TYPEOF);
			{
			setState(1091);
			match(LP);
			setState(1092);
			expression(0);
			setState(1093);
			match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclaratorListContext extends ParserRuleContext {
		public List<FieldDeclaratorContext> fieldDeclarator() {
			return getRuleContexts(FieldDeclaratorContext.class);
		}
		public FieldDeclaratorContext fieldDeclarator(int i) {
			return getRuleContext(FieldDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public FieldDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaratorList; }
	}

	public final FieldDeclaratorListContext fieldDeclaratorList() throws RecognitionException {
		FieldDeclaratorListContext _localctx = new FieldDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_fieldDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			fieldDeclarator();
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1096);
				match(COMMA);
				setState(1097);
				fieldDeclarator();
				}
				}
				setState(1102);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FieldDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclarator; }
	}

	public final FieldDeclaratorContext fieldDeclarator() throws RecognitionException {
		FieldDeclaratorContext _localctx = new FieldDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fieldDeclarator);
		int _la;
		try {
			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & -414491694415611649L) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 1125899913166847L) != 0)) {
					{
					setState(1104);
					declarator();
					}
				}

				setState(1107);
				match(COLON);
				setState(1108);
				constant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ObjectiveCParser.ENUM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode COMMA() { return getToken(ObjectiveCParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode NS_OPTIONS() { return getToken(ObjectiveCParser.NS_OPTIONS, 0); }
		public TerminalNode NS_ENUM() { return getToken(ObjectiveCParser.NS_ENUM, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumSpecifier);
		int _la;
		try {
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				match(ENUM);
				setState(1117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
						{
						setState(1112);
						identifier();
						}
					}

					setState(1115);
					match(COLON);
					setState(1116);
					typeName();
					}
					break;
				}
				setState(1130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(1119);
					identifier();
					setState(1124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(1120);
						match(LBRACE);
						setState(1121);
						enumeratorList();
						setState(1122);
						match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(1126);
					match(LBRACE);
					setState(1127);
					enumeratorList();
					setState(1128);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_ENUM:
			case NS_OPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				_la = _input.LA(1);
				if ( !(_la==NS_ENUM || _la==NS_OPTIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1133);
				match(LP);
				setState(1134);
				typeName();
				setState(1135);
				match(COMMA);
				setState(1136);
				identifier();
				setState(1137);
				match(RP);
				setState(1138);
				match(LBRACE);
				setState(1139);
				enumeratorList();
				setState(1140);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumeratorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			enumerator();
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1145);
					match(COMMA);
					setState(1146);
					enumerator();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1152);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorContext extends ParserRuleContext {
		public EnumeratorIdentifierContext enumeratorIdentifier() {
			return getRuleContext(EnumeratorIdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ObjectiveCParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			enumeratorIdentifier();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1156);
				match(ASSIGNMENT);
				setState(1157);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ObjectiveCParser.DEFAULT, 0); }
		public EnumeratorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorIdentifier; }
	}

	public final EnumeratorIdentifierContext enumeratorIdentifier() throws RecognitionException {
		EnumeratorIdentifierContext _localctx = new EnumeratorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumeratorIdentifier);
		try {
			setState(1162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				identifier();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(DEFAULT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<DeclaratorSuffixContext> declaratorSuffix() {
			return getRuleContexts(DeclaratorSuffixContext.class);
		}
		public DeclaratorSuffixContext declaratorSuffix(int i) {
			return getRuleContext(DeclaratorSuffixContext.class,i);
		}
		public TerminalNode BITXOR() { return getToken(ObjectiveCParser.BITXOR, 0); }
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_directDeclarator);
		int _la;
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
					{
					setState(1164);
					identifier();
					}
					break;
				case LP:
					{
					setState(1165);
					match(LP);
					setState(1166);
					declarator();
					setState(1167);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1171);
					declaratorSuffix();
					}
					}
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				match(LP);
				setState(1178);
				match(BITXOR);
				setState(1180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1179);
					nullabilitySpecifier();
					}
					break;
				}
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) {
					{
					setState(1182);
					identifier();
					}
				}

				setState(1185);
				match(RP);
				setState(1186);
				blockParameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorSuffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ObjectiveCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjectiveCParser.RBRACK, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorSuffix; }
	}

	public final DeclaratorSuffixContext declaratorSuffix() throws RecognitionException {
		DeclaratorSuffixContext _localctx = new DeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_declaratorSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(LBRACK);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230101273804800L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 65536003L) != 0)) {
				{
				setState(1190);
				constantExpression();
				}
			}

			setState(1193);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ObjectiveCParser.COMMA, 0); }
		public TerminalNode ELIPSIS() { return getToken(ObjectiveCParser.ELIPSIS, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			parameterDeclarationList();
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1196);
				match(COMMA);
				setState(1197);
				match(ELIPSIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ObjectiveCParser.MUL, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
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
		enterRule(_localctx, 202, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(MUL);
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1201);
				declarationSpecifiers();
				}
				break;
			}
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1204);
				pointer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			identifier();
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1208);
				match(LP);
				setState(1209);
				primaryExpression();
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1210);
					match(COMMA);
					setState(1211);
					primaryExpression();
					}
					}
					setState(1216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1217);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ObjectiveCParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(LBRACE);
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(1222);
				expressions();
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1223);
					match(COMMA);
					}
				}

				}
			}

			setState(1228);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public List<TerminalNode> DOT() { return getTokens(ObjectiveCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ObjectiveCParser.DOT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public StructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInitializer; }
	}

	public final StructInitializerContext structInitializer() throws RecognitionException {
		StructInitializerContext _localctx = new StructInitializerContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_structInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(LBRACE);
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1231);
				match(DOT);
				setState(1232);
				expression(0);
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1233);
						match(COMMA);
						setState(1234);
						match(DOT);
						setState(1235);
						expression(0);
						}
						} 
					}
					setState(1240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1241);
					match(COMMA);
					}
				}

				}
			}

			setState(1246);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			initializer();
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					match(COMMA);
					setState(1250);
					initializer();
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1256);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_typeName);
		int _la;
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				specifierQualifierList();
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 268435473L) != 0)) {
					{
					setState(1260);
					abstractDeclarator();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				blockType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<AbstractDeclaratorSuffixContext> abstractDeclaratorSuffix() {
			return getRuleContexts(AbstractDeclaratorSuffixContext.class);
		}
		public AbstractDeclaratorSuffixContext abstractDeclaratorSuffix(int i) {
			return getRuleContext(AbstractDeclaratorSuffixContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjectiveCParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectiveCParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectiveCParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectiveCParser.RBRACK, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_abstractDeclarator);
		int _la;
		try {
			setState(1289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				pointer();
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 268435473L) != 0)) {
					{
					setState(1267);
					abstractDeclarator();
					}
				}

				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				match(LP);
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 268435473L) != 0)) {
					{
					setState(1271);
					abstractDeclarator();
					}
				}

				setState(1274);
				match(RP);
				setState(1276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1275);
					abstractDeclaratorSuffix();
					}
					}
					setState(1278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LP || _la==LBRACK );
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1280);
					match(LBRACK);
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230101273804800L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 65536003L) != 0)) {
						{
						setState(1281);
						constantExpression();
						}
					}

					setState(1284);
					match(RBRACK);
					}
					}
					setState(1287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorSuffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ObjectiveCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjectiveCParser.RBRACK, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public AbstractDeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaratorSuffix; }
	}

	public final AbstractDeclaratorSuffixContext abstractDeclaratorSuffix() throws RecognitionException {
		AbstractDeclaratorSuffixContext _localctx = new AbstractDeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_abstractDeclaratorSuffix);
		int _la;
		try {
			setState(1301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				match(LBRACK);
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230101273804800L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & 65536003L) != 0)) {
					{
					setState(1292);
					constantExpression();
					}
				}

				setState(1295);
				match(RBRACK);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(LP);
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143780063951410L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063951359L) != 0)) {
					{
					setState(1297);
					parameterDeclarationList();
					}
				}

				setState(1300);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			parameterDeclaration();
			setState(1308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1304);
					match(COMMA);
					setState(1305);
					parameterDeclaration();
					}
					} 
				}
				setState(1310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ObjectiveCParser.VOID, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_parameterDeclaration);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				declarationSpecifiers();
				setState(1312);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				match(VOID);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 222, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1317);
				pointer();
				}
			}

			setState(1320);
			directDeclarator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
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
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AutoreleaseStatementContext autoreleaseStatement() {
			return getRuleContext(AutoreleaseStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_statement);
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				labeledStatement();
				setState(1324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1323);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326);
				compoundStatement();
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1327);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330);
				selectionStatement();
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1331);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1334);
				iterationStatement();
				setState(1336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1335);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1338);
				jumpStatement();
				setState(1340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1339);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1342);
				synchronizedStatement();
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1343);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1346);
				autoreleaseStatement();
				setState(1348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1347);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1350);
				throwStatement();
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1351);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1354);
				tryBlock();
				setState(1356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1355);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1358);
				expressions();
				setState(1360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1359);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1362);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			identifier();
			setState(1366);
			match(COLON);
			setState(1367);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeExpressionContext extends ParserRuleContext {
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public TerminalNode ELIPSIS() { return getToken(ObjectiveCParser.ELIPSIS, 0); }
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			constantExpression();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELIPSIS) {
				{
				setState(1370);
				match(ELIPSIS);
				setState(1371);
				constantExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(LBRACE);
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5188146530212641654L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -6123769593317032575L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1375);
					declaration();
					}
					break;
				case 2:
					{
					setState(1376);
					statement();
					}
					break;
				}
				}
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1382);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public StatementContext ifBody;
		public StatementContext elseBody;
		public TerminalNode IF() { return getToken(ObjectiveCParser.IF, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ObjectiveCParser.ELSE, 0); }
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_selectionStatement);
		try {
			setState(1394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				match(IF);
				setState(1385);
				match(LP);
				setState(1386);
				expression(0);
				setState(1387);
				match(RP);
				setState(1388);
				((SelectionStatementContext)_localctx).ifBody = statement();
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1389);
					match(ELSE);
					setState(1390);
					((SelectionStatementContext)_localctx).elseBody = statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				switchStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ObjectiveCParser.SWITCH, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(SWITCH);
			setState(1397);
			match(LP);
			setState(1398);
			expression(0);
			setState(1399);
			match(RP);
			setState(1400);
			switchBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectiveCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectiveCParser.RBRACE, 0); }
		public List<SwitchSectionContext> switchSection() {
			return getRuleContexts(SwitchSectionContext.class);
		}
		public SwitchSectionContext switchSection(int i) {
			return getRuleContext(SwitchSectionContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(LBRACE);
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1403);
				switchSection();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1409);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchSectionContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSection; }
	}

	public final SwitchSectionContext switchSection() throws RecognitionException {
		SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_switchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1411);
				switchLabel();
				}
				}
				setState(1414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1416);
				statement();
				}
				}
				setState(1419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 5188146513339072836L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & -6123769594089079423L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ObjectiveCParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode DEFAULT() { return getToken(ObjectiveCParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_switchLabel);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				match(CASE);
				setState(1427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case BOOL:
				case Class:
				case BYCOPY:
				case BYREF:
				case ID:
				case IMP:
				case IN:
				case INOUT:
				case NIL:
				case NO:
				case NULL_:
				case ONEWAY:
				case OUT:
				case PROTOCOL_:
				case SEL:
				case SELF:
				case SUPER:
				case YES:
				case ATOMIC:
				case NONATOMIC:
				case RETAIN:
				case AUTORELEASING_QUALIFIER:
				case BLOCK:
				case BRIDGE_RETAINED:
				case BRIDGE_TRANSFER:
				case COVARIANT:
				case CONTRAVARIANT:
				case DEPRECATED:
				case KINDOF:
				case UNUSED:
				case NULL_UNSPECIFIED:
				case NULLABLE:
				case NONNULL:
				case NULL_RESETTABLE:
				case NS_INLINE:
				case NS_ENUM:
				case NS_OPTIONS:
				case ASSIGN:
				case COPY:
				case GETTER:
				case SETTER:
				case STRONG:
				case READONLY:
				case READWRITE:
				case WEAK:
				case UNSAFE_UNRETAINED:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IB_INSPECTABLE:
				case IB_DESIGNABLE:
				case IDENTIFIER:
				case ADD:
				case SUB:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(1422);
					rangeExpression();
					}
					break;
				case LP:
					{
					setState(1423);
					match(LP);
					setState(1424);
					rangeExpression();
					setState(1425);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1429);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				match(DEFAULT);
				setState(1432);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_iterationStatement);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				whileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				doStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1438);
				forInStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ObjectiveCParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(WHILE);
			setState(1442);
			match(LP);
			setState(1443);
			expression(0);
			setState(1444);
			match(RP);
			setState(1445);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ObjectiveCParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ObjectiveCParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode SEMI() { return getToken(ObjectiveCParser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			match(DO);
			setState(1448);
			statement();
			setState(1449);
			match(WHILE);
			setState(1450);
			match(LP);
			setState(1451);
			expression(0);
			setState(1452);
			match(RP);
			setState(1453);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ObjectiveCParser.FOR, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ObjectiveCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ObjectiveCParser.SEMI, i);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopInitializerContext forLoopInitializer() {
			return getRuleContext(ForLoopInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(FOR);
			setState(1456);
			match(LP);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916136071445042L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141691234316417L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(1457);
				forLoopInitializer();
				}
			}

			setState(1460);
			match(SEMI);
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(1461);
				expression(0);
				}
			}

			setState(1464);
			match(SEMI);
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(1465);
				expressions();
				}
			}

			setState(1468);
			match(RP);
			setState(1469);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopInitializerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForLoopInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInitializer; }
	}

	public final ForLoopInitializerContext forLoopInitializer() throws RecognitionException {
		ForLoopInitializerContext _localctx = new ForLoopInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_forLoopInitializer);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				declarationSpecifiers();
				setState(1472);
				initDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				expressions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ObjectiveCParser.FOR, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode IN() { return getToken(ObjectiveCParser.IN, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(FOR);
			setState(1478);
			match(LP);
			setState(1479);
			typeVariableDeclarator();
			setState(1480);
			match(IN);
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
				{
				setState(1481);
				expression(0);
				}
			}

			setState(1484);
			match(RP);
			setState(1485);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(ObjectiveCParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(ObjectiveCParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(ObjectiveCParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(ObjectiveCParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_jumpStatement);
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(GOTO);
				setState(1488);
				identifier();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				match(CONTINUE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(BREAK);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1491);
				match(RETURN);
				setState(1493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1492);
					expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			expression(0);
			setState(1502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1498);
					match(COMMA);
					setState(1499);
					expression(0);
					}
					} 
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext assignmentExpression;
		public Token op;
		public ExpressionContext trueExpression;
		public ExpressionContext falseExpression;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ObjectiveCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ObjectiveCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ObjectiveCParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(ObjectiveCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ObjectiveCParser.SUB, 0); }
		public List<TerminalNode> LT() { return getTokens(ObjectiveCParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ObjectiveCParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ObjectiveCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ObjectiveCParser.GT, i);
		}
		public TerminalNode LE() { return getToken(ObjectiveCParser.LE, 0); }
		public TerminalNode GE() { return getToken(ObjectiveCParser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ObjectiveCParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ObjectiveCParser.EQUAL, 0); }
		public TerminalNode BITAND() { return getToken(ObjectiveCParser.BITAND, 0); }
		public TerminalNode BITXOR() { return getToken(ObjectiveCParser.BITXOR, 0); }
		public TerminalNode BITOR() { return getToken(ObjectiveCParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(ObjectiveCParser.AND, 0); }
		public TerminalNode OR() { return getToken(ObjectiveCParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(ObjectiveCParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(ObjectiveCParser.COLON, 0); }
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
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1506);
				castExpression();
				}
				break;
			case 2:
				{
				setState(1507);
				match(LP);
				setState(1508);
				compoundStatement();
				setState(1509);
				match(RP);
				}
				break;
			case 3:
				{
				setState(1511);
				unaryExpression();
				setState(1512);
				assignmentOperator();
				setState(1513);
				((ExpressionContext)_localctx).assignmentExpression = expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1559);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1517);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1518);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & 35L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1519);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1520);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1521);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1522);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1523);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1528);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1524);
							match(LT);
							setState(1525);
							match(LT);
							}
							break;
						case GT:
							{
							setState(1526);
							match(GT);
							setState(1527);
							match(GT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1530);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1531);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1532);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 387L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1533);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1534);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1535);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1536);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1537);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1538);
						((ExpressionContext)_localctx).op = match(BITAND);
						setState(1539);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1540);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1541);
						((ExpressionContext)_localctx).op = match(BITXOR);
						setState(1542);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1543);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1544);
						((ExpressionContext)_localctx).op = match(BITOR);
						setState(1545);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1546);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1547);
						((ExpressionContext)_localctx).op = match(AND);
						setState(1548);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1549);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1550);
						((ExpressionContext)_localctx).op = match(OR);
						setState(1551);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1552);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1553);
						match(QUESTION);
						setState(1555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916119734747136L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690462269569L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
							{
							setState(1554);
							((ExpressionContext)_localctx).trueExpression = expression(0);
							}
						}

						setState(1557);
						match(COLON);
						setState(1558);
						((ExpressionContext)_localctx).falseExpression = expression(4);
						}
						break;
					}
					} 
				}
				setState(1563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(ObjectiveCParser.ASSIGNMENT, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ObjectiveCParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ObjectiveCParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ObjectiveCParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ObjectiveCParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ObjectiveCParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ObjectiveCParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ObjectiveCParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ObjectiveCParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ObjectiveCParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ObjectiveCParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 8581545985L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_castExpression);
		try {
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1567);
				match(LP);
				setState(1568);
				typeName();
				setState(1569);
				match(RP);
				}
				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1571);
					castExpression();
					}
					break;
				case 2:
					{
					setState(1572);
					initializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public StructInitializerContext structInitializer() {
			return getRuleContext(StructInitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_initializer);
		try {
			setState(1580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
				arrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1579);
				structInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_constantExpression);
		try {
			setState(1584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case Class:
			case BYCOPY:
			case BYREF:
			case ID:
			case IMP:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
			case PROTOCOL_:
			case SEL:
			case SELF:
			case SUPER:
			case ATOMIC:
			case NONATOMIC:
			case RETAIN:
			case AUTORELEASING_QUALIFIER:
			case BLOCK:
			case BRIDGE_RETAINED:
			case BRIDGE_TRANSFER:
			case COVARIANT:
			case CONTRAVARIANT:
			case DEPRECATED:
			case KINDOF:
			case UNUSED:
			case NULL_UNSPECIFIED:
			case NULLABLE:
			case NONNULL:
			case NULL_RESETTABLE:
			case NS_INLINE:
			case NS_ENUM:
			case NS_OPTIONS:
			case ASSIGN:
			case COPY:
			case GETTER:
			case SETTER:
			case STRONG:
			case READONLY:
			case READWRITE:
			case WEAK:
			case UNSAFE_UNRETAINED:
			case IB_OUTLET:
			case IB_OUTLET_COLLECTION:
			case IB_INSPECTABLE:
			case IB_DESIGNABLE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				identifier();
				}
				break;
			case TRUE:
			case FALSE:
			case NIL:
			case NO:
			case NULL_:
			case YES:
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1583);
				constant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token op;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(ObjectiveCParser.SIZEOF, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TerminalNode INC() { return getToken(ObjectiveCParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ObjectiveCParser.DEC, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_unaryExpression);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1587);
				match(SIZEOF);
				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1588);
					unaryExpression();
					}
					break;
				case 2:
					{
					setState(1589);
					match(LP);
					setState(1590);
					typeSpecifier(0);
					setState(1591);
					match(RP);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1595);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1596);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1597);
				unaryOperator();
				setState(1598);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(ObjectiveCParser.BITAND, 0); }
		public TerminalNode MUL() { return getToken(ObjectiveCParser.MUL, 0); }
		public TerminalNode ADD() { return getToken(ObjectiveCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ObjectiveCParser.SUB, 0); }
		public TerminalNode TILDE() { return getToken(ObjectiveCParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ObjectiveCParser.BANG, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_la = _input.LA(1);
			if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 94211L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ObjectiveCParser.DOT, 0); }
		public TerminalNode STRUCTACCESS() { return getToken(ObjectiveCParser.STRUCTACCESS, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1605);
			primaryExpression();
			setState(1609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1606);
					postfix();
					}
					} 
				}
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
					setState(1612);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1613);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==STRUCTACCESS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1614);
					identifier();
					setState(1618);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1615);
							postfix();
							}
							} 
						}
						setState(1620);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
					}
					}
					} 
				}
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public Token RP;
		public List<Token> macroArguments = new ArrayList<Token>();
		public Token _tset3194;
		public Token op;
		public TerminalNode LBRACK() { return getToken(ObjectiveCParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ObjectiveCParser.RBRACK, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public List<TerminalNode> RP() { return getTokens(ObjectiveCParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(ObjectiveCParser.RP, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public TerminalNode INC() { return getToken(ObjectiveCParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ObjectiveCParser.DEC, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_postfix);
		int _la;
		try {
			setState(1644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				match(LBRACK);
				setState(1627);
				expression(0);
				setState(1628);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				match(LP);
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4899916127411120656L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2523141690529378433L) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 4363692523569L) != 0)) {
					{
					setState(1631);
					argumentExpressionList();
					}
				}

				setState(1634);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1635);
				match(LP);
				setState(1638); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1636);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(1637);
						((PostfixContext)_localctx)._tset3194 = _input.LT(1);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==RP) ) {
							((PostfixContext)_localctx)._tset3194 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((PostfixContext)_localctx).macroArguments.add(((PostfixContext)_localctx)._tset3194);
						}
						break;
					}
					}
					setState(1640); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 2147483647L) != 0) );
				setState(1642);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1643);
				((PostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<ArgumentExpressionContext> argumentExpression() {
			return getRuleContexts(ArgumentExpressionContext.class);
		}
		public ArgumentExpressionContext argumentExpression(int i) {
			return getRuleContext(ArgumentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectiveCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectiveCParser.COMMA, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			argumentExpression();
			setState(1651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1647);
				match(COMMA);
				setState(1648);
				argumentExpression();
				}
				}
				setState(1653);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_argumentExpression);
		try {
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				typeSpecifier(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MessageExpressionContext messageExpression() {
			return getRuleContext(MessageExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public ProtocolExpressionContext protocolExpression() {
			return getRuleContext(ProtocolExpressionContext.class,0);
		}
		public EncodeExpressionContext encodeExpression() {
			return getRuleContext(EncodeExpressionContext.class,0);
		}
		public DictionaryExpressionContext dictionaryExpression() {
			return getRuleContext(DictionaryExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public BoxExpressionContext boxExpression() {
			return getRuleContext(BoxExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_primaryExpression);
		try {
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1660);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1661);
				match(LP);
				setState(1662);
				expression(0);
				setState(1663);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1665);
				messageExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1666);
				selectorExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1667);
				protocolExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1668);
				encodeExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1669);
				dictionaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1670);
				arrayExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1671);
				boxExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1672);
				blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ObjectiveCParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjectiveCParser.OCTAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ObjectiveCParser.BINARY_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjectiveCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode ADD() { return getToken(ObjectiveCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ObjectiveCParser.SUB, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjectiveCParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjectiveCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NIL() { return getToken(ObjectiveCParser.NIL, 0); }
		public TerminalNode NULL_() { return getToken(ObjectiveCParser.NULL_, 0); }
		public TerminalNode YES() { return getToken(ObjectiveCParser.YES, 0); }
		public TerminalNode NO() { return getToken(ObjectiveCParser.NO, 0); }
		public TerminalNode TRUE() { return getToken(ObjectiveCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ObjectiveCParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_constant);
		int _la;
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1675);
				match(HEX_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1677);
				match(BINARY_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(1678);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1681);
				match(DECIMAL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(1682);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1685);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1686);
				match(CHARACTER_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1687);
				match(NIL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1688);
				match(NULL_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1689);
				match(YES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1690);
				match(NO);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1691);
				match(TRUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1692);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_START() { return getTokens(ObjectiveCParser.STRING_START); }
		public TerminalNode STRING_START(int i) {
			return getToken(ObjectiveCParser.STRING_START, i);
		}
		public List<TerminalNode> STRING_END() { return getTokens(ObjectiveCParser.STRING_END); }
		public TerminalNode STRING_END(int i) {
			return getToken(ObjectiveCParser.STRING_END, i);
		}
		public List<TerminalNode> STRING_VALUE() { return getTokens(ObjectiveCParser.STRING_VALUE); }
		public TerminalNode STRING_VALUE(int i) {
			return getToken(ObjectiveCParser.STRING_VALUE, i);
		}
		public List<TerminalNode> STRING_NEWLINE() { return getTokens(ObjectiveCParser.STRING_NEWLINE); }
		public TerminalNode STRING_NEWLINE(int i) {
			return getToken(ObjectiveCParser.STRING_NEWLINE, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1703); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1695);
					match(STRING_START);
					setState(1699);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRING_NEWLINE || _la==STRING_VALUE) {
						{
						{
						setState(1696);
						_la = _input.LA(1);
						if ( !(_la==STRING_NEWLINE || _la==STRING_VALUE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1701);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1702);
					match(STRING_END);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1705); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectiveCParser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(ObjectiveCParser.BOOL, 0); }
		public TerminalNode Class() { return getToken(ObjectiveCParser.Class, 0); }
		public TerminalNode BYCOPY() { return getToken(ObjectiveCParser.BYCOPY, 0); }
		public TerminalNode BYREF() { return getToken(ObjectiveCParser.BYREF, 0); }
		public TerminalNode ID() { return getToken(ObjectiveCParser.ID, 0); }
		public TerminalNode IMP() { return getToken(ObjectiveCParser.IMP, 0); }
		public TerminalNode IN() { return getToken(ObjectiveCParser.IN, 0); }
		public TerminalNode INOUT() { return getToken(ObjectiveCParser.INOUT, 0); }
		public TerminalNode ONEWAY() { return getToken(ObjectiveCParser.ONEWAY, 0); }
		public TerminalNode OUT() { return getToken(ObjectiveCParser.OUT, 0); }
		public TerminalNode PROTOCOL_() { return getToken(ObjectiveCParser.PROTOCOL_, 0); }
		public TerminalNode SEL() { return getToken(ObjectiveCParser.SEL, 0); }
		public TerminalNode SELF() { return getToken(ObjectiveCParser.SELF, 0); }
		public TerminalNode SUPER() { return getToken(ObjectiveCParser.SUPER, 0); }
		public TerminalNode ATOMIC() { return getToken(ObjectiveCParser.ATOMIC, 0); }
		public TerminalNode NONATOMIC() { return getToken(ObjectiveCParser.NONATOMIC, 0); }
		public TerminalNode RETAIN() { return getToken(ObjectiveCParser.RETAIN, 0); }
		public TerminalNode AUTORELEASING_QUALIFIER() { return getToken(ObjectiveCParser.AUTORELEASING_QUALIFIER, 0); }
		public TerminalNode BLOCK() { return getToken(ObjectiveCParser.BLOCK, 0); }
		public TerminalNode BRIDGE_RETAINED() { return getToken(ObjectiveCParser.BRIDGE_RETAINED, 0); }
		public TerminalNode BRIDGE_TRANSFER() { return getToken(ObjectiveCParser.BRIDGE_TRANSFER, 0); }
		public TerminalNode COVARIANT() { return getToken(ObjectiveCParser.COVARIANT, 0); }
		public TerminalNode CONTRAVARIANT() { return getToken(ObjectiveCParser.CONTRAVARIANT, 0); }
		public TerminalNode DEPRECATED() { return getToken(ObjectiveCParser.DEPRECATED, 0); }
		public TerminalNode KINDOF() { return getToken(ObjectiveCParser.KINDOF, 0); }
		public TerminalNode UNUSED() { return getToken(ObjectiveCParser.UNUSED, 0); }
		public TerminalNode NS_INLINE() { return getToken(ObjectiveCParser.NS_INLINE, 0); }
		public TerminalNode NS_ENUM() { return getToken(ObjectiveCParser.NS_ENUM, 0); }
		public TerminalNode NS_OPTIONS() { return getToken(ObjectiveCParser.NS_OPTIONS, 0); }
		public TerminalNode NULL_UNSPECIFIED() { return getToken(ObjectiveCParser.NULL_UNSPECIFIED, 0); }
		public TerminalNode NULLABLE() { return getToken(ObjectiveCParser.NULLABLE, 0); }
		public TerminalNode NONNULL() { return getToken(ObjectiveCParser.NONNULL, 0); }
		public TerminalNode NULL_RESETTABLE() { return getToken(ObjectiveCParser.NULL_RESETTABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(ObjectiveCParser.ASSIGN, 0); }
		public TerminalNode COPY() { return getToken(ObjectiveCParser.COPY, 0); }
		public TerminalNode GETTER() { return getToken(ObjectiveCParser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(ObjectiveCParser.SETTER, 0); }
		public TerminalNode STRONG() { return getToken(ObjectiveCParser.STRONG, 0); }
		public TerminalNode READONLY() { return getToken(ObjectiveCParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(ObjectiveCParser.READWRITE, 0); }
		public TerminalNode WEAK() { return getToken(ObjectiveCParser.WEAK, 0); }
		public TerminalNode UNSAFE_UNRETAINED() { return getToken(ObjectiveCParser.UNSAFE_UNRETAINED, 0); }
		public TerminalNode IB_OUTLET() { return getToken(ObjectiveCParser.IB_OUTLET, 0); }
		public TerminalNode IB_OUTLET_COLLECTION() { return getToken(ObjectiveCParser.IB_OUTLET_COLLECTION, 0); }
		public TerminalNode IB_INSPECTABLE() { return getToken(ObjectiveCParser.IB_INSPECTABLE, 0); }
		public TerminalNode IB_DESIGNABLE() { return getToken(ObjectiveCParser.IB_DESIGNABLE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 142143763727253504L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 17867063762871L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 90:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 129:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 136:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00de\u06ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0001\u0000\u0005\u0000\u0122\b\u0000\n\u0000\f\u0000\u0125\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0134\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0003\u0003\u013b\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0141\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0147\b\u0003\u0001\u0003\u0003\u0003"+
		"\u014a\b\u0003\u0001\u0003\u0003\u0003\u014d\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0155"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u015c\b\u0004\u0001\u0004\u0003\u0004\u015f\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0162\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u016a\b\u0005\u0001\u0005\u0003\u0005"+
		"\u016d\b\u0005\u0001\u0005\u0003\u0005\u0170\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u017a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0184"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u018c"+
		"\b\b\u0001\b\u0005\b\u018f\b\b\n\b\f\b\u0192\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u0198\b\t\n\t\f\t\u019b\t\t\u0001\t\u0004\t\u019e\b"+
		"\t\u000b\t\f\t\u019f\u0003\t\u01a2\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01ac\b\u000b"+
		"\n\u000b\f\u000b\u01af\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u01b6\b\f\n\f\f\f\u01b9\t\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u01c0\b\r\u0001\r\u0003\r\u01c3\b\r\u0001\r\u0003\r"+
		"\u01c6\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u01cd\b\u000e\n\u000e\f\u000e\u01d0\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01e6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01ed\b\u0010\u0001\u0010\u0003\u0010\u01f0\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u01f4\b\u0011\n\u0011\f\u0011\u01f7"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u01fd"+
		"\b\u0012\n\u0012\f\u0012\u0200\t\u0012\u0001\u0012\u0004\u0012\u0203\b"+
		"\u0012\u000b\u0012\f\u0012\u0204\u0003\u0012\u0207\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u0210\b\u0014\u000b\u0014\f\u0014\u0211\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0003"+
		"\u0017\u021b\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u021f\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0004\u0018\u0228\b\u0018\u000b\u0018\f\u0018\u0229\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0003\u001b\u0233\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0237"+
		"\b\u001b\u0001\u001b\u0003\u001b\u023a\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0004\u001c\u0240\b\u001c\u000b\u001c\f\u001c"+
		"\u0241\u0001\u001c\u0001\u001c\u0003\u001c\u0246\b\u001c\u0003\u001c\u0248"+
		"\b\u001c\u0001\u001d\u0003\u001d\u024b\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u024f\b\u001d\n\u001d\f\u001d\u0252\t\u001d\u0001\u001d\u0003"+
		"\u001d\u0255\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u025b\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0269\b \u0001"+
		"!\u0001!\u0001!\u0005!\u026e\b!\n!\f!\u0271\t!\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u0276\b\"\u0001#\u0003#\u0279\b#\u0001#\u0001#\u0003#\u027d\b"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u0283\b#\u0001#\u0001#\u0003#\u0287"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u028d\b$\n$\f$\u0290\t$\u0003$"+
		"\u0292\b$\u0001$\u0001$\u0001%\u0005%\u0297\b%\n%\f%\u029a\t%\u0001%\u0001"+
		"%\u0003%\u029e\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u02a5\b&\n"+
		"&\f&\u02a8\t&\u0001&\u0003&\u02ab\b&\u0003&\u02ad\b&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0003(\u02b9\b"+
		"(\u0003(\u02bb\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u02c7\b)\u0003)\u02c9\b)\u0001*\u0001*\u0001*\u0003"+
		"*\u02ce\b*\u0001*\u0001*\u0005*\u02d2\b*\n*\f*\u02d5\t*\u0003*\u02d7\b"+
		"*\u0001*\u0001*\u0001+\u0001+\u0003+\u02dd\b+\u0001,\u0001,\u0003,\u02e1"+
		"\b,\u0001,\u0003,\u02e4\b,\u0001,\u0003,\u02e7\b,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u02f2\b.\u0001/\u0001"+
		"/\u0004/\u02f6\b/\u000b/\f/\u02f7\u0003/\u02fa\b/\u00010\u00030\u02fd"+
		"\b0\u00010\u00010\u00010\u00010\u00050\u0303\b0\n0\f0\u0306\t0\u00011"+
		"\u00011\u00031\u030a\b1\u00011\u00011\u00011\u00011\u00031\u0310\b1\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00033\u0319\b3\u00013\u0004"+
		"3\u031c\b3\u000b3\f3\u031d\u00033\u0320\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0336\b7\u00018\u0001"+
		"8\u00018\u00058\u033b\b8\n8\f8\u033e\t8\u00018\u00018\u00038\u0342\b8"+
		"\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001>\u0003>\u035a\b>\u0001>\u0001>\u0001>\u0003>\u035f\b>\u0001"+
		">\u0001>\u0001>\u0003>\u0364\b>\u0001?\u0001?\u0003?\u0368\b?\u0001@\u0001"+
		"@\u0003@\u036c\b@\u0001A\u0001A\u0003A\u0370\bA\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0005B\u0377\bB\nB\fB\u037a\tB\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u0380\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0387\bD\u0001E\u0001"+
		"E\u0001E\u0001E\u0003E\u038d\bE\u0001F\u0003F\u0390\bF\u0001F\u0001F\u0003"+
		"F\u0394\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0003G\u039c\bG\u0001"+
		"G\u0003G\u039f\bG\u0001G\u0001G\u0003G\u03a3\bG\u0001G\u0001G\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u03ab\bH\u0001H\u0001H\u0001I\u0003I\u03b0\bI\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0003I\u03b7\bI\u0001I\u0001I\u0001J\u0001"+
		"J\u0001J\u0005J\u03be\bJ\nJ\fJ\u03c1\tJ\u0001K\u0003K\u03c4\bK\u0001K"+
		"\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0004"+
		"L\u03d0\bL\u000bL\fL\u03d1\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0005"+
		"M\u03da\bM\nM\fM\u03dd\tM\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0005"+
		"N\u03e5\bN\nN\fN\u03e8\tN\u0001O\u0001O\u0001O\u0003O\u03ed\bO\u0001P"+
		"\u0001P\u0001P\u0003P\u03f2\bP\u0001P\u0001P\u0004P\u03f6\bP\u000bP\f"+
		"P\u03f7\u0001P\u0001P\u0003P\u03fc\bP\u0001Q\u0001Q\u0001Q\u0003Q\u0401"+
		"\bQ\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0004R\u040b"+
		"\bR\u000bR\fR\u040c\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0415"+
		"\bS\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001W\u0001W\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u0423\bX\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0003Z\u0436\bZ\u0001Z\u0001Z\u0004Z\u043a\bZ\u000bZ\fZ\u043b"+
		"\u0005Z\u043e\bZ\nZ\fZ\u0441\tZ\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0001\\\u0005\\\u044b\b\\\n\\\f\\\u044e\t\\\u0001]\u0001]\u0003"+
		"]\u0452\b]\u0001]\u0001]\u0003]\u0456\b]\u0001^\u0001^\u0003^\u045a\b"+
		"^\u0001^\u0001^\u0003^\u045e\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003"+
		"^\u0465\b^\u0001^\u0001^\u0001^\u0001^\u0003^\u046b\b^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0477\b^\u0001"+
		"_\u0001_\u0001_\u0005_\u047c\b_\n_\f_\u047f\t_\u0001_\u0003_\u0482\b_"+
		"\u0001`\u0001`\u0001`\u0003`\u0487\b`\u0001a\u0001a\u0003a\u048b\ba\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0003b\u0492\bb\u0001b\u0005b\u0495\bb\n"+
		"b\fb\u0498\tb\u0001b\u0001b\u0001b\u0003b\u049d\bb\u0001b\u0003b\u04a0"+
		"\bb\u0001b\u0001b\u0003b\u04a4\bb\u0001c\u0001c\u0003c\u04a8\bc\u0001"+
		"c\u0001c\u0001d\u0001d\u0001d\u0003d\u04af\bd\u0001e\u0001e\u0003e\u04b3"+
		"\be\u0001e\u0003e\u04b6\be\u0001f\u0001f\u0001f\u0001f\u0001f\u0005f\u04bd"+
		"\bf\nf\ff\u04c0\tf\u0001f\u0001f\u0003f\u04c4\bf\u0001g\u0001g\u0001g"+
		"\u0003g\u04c9\bg\u0003g\u04cb\bg\u0001g\u0001g\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0005h\u04d5\bh\nh\fh\u04d8\th\u0001h\u0003h\u04db\bh"+
		"\u0003h\u04dd\bh\u0001h\u0001h\u0001i\u0001i\u0001i\u0005i\u04e4\bi\n"+
		"i\fi\u04e7\ti\u0001i\u0003i\u04ea\bi\u0001j\u0001j\u0003j\u04ee\bj\u0001"+
		"j\u0003j\u04f1\bj\u0001k\u0001k\u0003k\u04f5\bk\u0001k\u0001k\u0003k\u04f9"+
		"\bk\u0001k\u0001k\u0004k\u04fd\bk\u000bk\fk\u04fe\u0001k\u0001k\u0003"+
		"k\u0503\bk\u0001k\u0004k\u0506\bk\u000bk\fk\u0507\u0003k\u050a\bk\u0001"+
		"l\u0001l\u0003l\u050e\bl\u0001l\u0001l\u0001l\u0003l\u0513\bl\u0001l\u0003"+
		"l\u0516\bl\u0001m\u0001m\u0001m\u0005m\u051b\bm\nm\fm\u051e\tm\u0001n"+
		"\u0001n\u0001n\u0001n\u0003n\u0524\bn\u0001o\u0003o\u0527\bo\u0001o\u0001"+
		"o\u0001p\u0001p\u0003p\u052d\bp\u0001p\u0001p\u0003p\u0531\bp\u0001p\u0001"+
		"p\u0003p\u0535\bp\u0001p\u0001p\u0003p\u0539\bp\u0001p\u0001p\u0003p\u053d"+
		"\bp\u0001p\u0001p\u0003p\u0541\bp\u0001p\u0001p\u0003p\u0545\bp\u0001"+
		"p\u0001p\u0003p\u0549\bp\u0001p\u0001p\u0003p\u054d\bp\u0001p\u0001p\u0003"+
		"p\u0551\bp\u0001p\u0003p\u0554\bp\u0001q\u0001q\u0001q\u0001q\u0001r\u0001"+
		"r\u0001r\u0003r\u055d\br\u0001s\u0001s\u0001s\u0005s\u0562\bs\ns\fs\u0565"+
		"\ts\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0001t\u0003"+
		"t\u0570\bt\u0001t\u0003t\u0573\bt\u0001u\u0001u\u0001u\u0001u\u0001u\u0001"+
		"u\u0001v\u0001v\u0005v\u057d\bv\nv\fv\u0580\tv\u0001v\u0001v\u0001w\u0004"+
		"w\u0585\bw\u000bw\fw\u0586\u0001w\u0004w\u058a\bw\u000bw\fw\u058b\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u0594\bx\u0001x\u0001x\u0001"+
		"x\u0001x\u0003x\u059a\bx\u0001y\u0001y\u0001y\u0001y\u0003y\u05a0\by\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001|\u0001|\u0001|\u0003|\u05b3\b|\u0001|\u0001"+
		"|\u0003|\u05b7\b|\u0001|\u0001|\u0003|\u05bb\b|\u0001|\u0001|\u0001|\u0001"+
		"}\u0001}\u0001}\u0001}\u0003}\u05c4\b}\u0001~\u0001~\u0001~\u0001~\u0001"+
		"~\u0003~\u05cb\b~\u0001~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u05d6\b\u007f\u0003\u007f"+
		"\u05d8\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u05dd\b"+
		"\u0080\n\u0080\f\u0080\u05e0\t\u0080\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0003\u0081\u05ec\b\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0003\u0081\u05f9\b\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0003\u0081"+
		"\u0614\b\u0081\u0001\u0081\u0001\u0081\u0005\u0081\u0618\b\u0081\n\u0081"+
		"\f\u0081\u061b\t\u0081\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083"+
		"\u0626\b\u0083\u0003\u0083\u0628\b\u0083\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0003\u0084\u062d\b\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u0631"+
		"\b\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0003\u0086\u063a\b\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0641\b\u0086\u0001\u0087\u0001"+
		"\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u0648\b\u0088\n"+
		"\u0088\f\u0088\u064b\t\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0005\u0088\u0651\b\u0088\n\u0088\f\u0088\u0654\t\u0088\u0005\u0088"+
		"\u0656\b\u0088\n\u0088\f\u0088\u0659\t\u0088\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u0661\b\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0004\u0089\u0667\b\u0089\u000b"+
		"\u0089\f\u0089\u0668\u0001\u0089\u0001\u0089\u0003\u0089\u066d\b\u0089"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0005\u008a\u0672\b\u008a\n\u008a"+
		"\f\u008a\u0675\t\u008a\u0001\u008b\u0001\u008b\u0003\u008b\u0679\b\u008b"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u068a\b\u008c\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0690\b\u008d\u0001\u008d"+
		"\u0001\u008d\u0003\u008d\u0694\b\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d"+
		"\u069e\b\u008d\u0001\u008e\u0001\u008e\u0005\u008e\u06a2\b\u008e\n\u008e"+
		"\f\u008e\u06a5\t\u008e\u0001\u008e\u0004\u008e\u06a8\b\u008e\u000b\u008e"+
		"\f\u008e\u06a9\u0001\u008f\u0001\u008f\u0001\u008f\u0000\u0003\u00b4\u0102"+
		"\u0110\u0090\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0000\u0015\u0002"+
		"\u0000FFKK\u0001\u0000Z[\u0003\u0000DDGGIJ\u0002\u0000\u001b\u001b\u001e"+
		"\u001e\u0004\u0000UU^^``bb\u0001\u0000cf\u0004\u0000\u0001\u0001\f\f\u0014"+
		"\u0014\u001a\u001a\u0004\u0000\u0011\u0011VY]]gg\u0003\u0000*+./34\u0001"+
		"\u0000hi\u0002\u0000\u009a\u009b\u009f\u009f\u0001\u0000\u0098\u0099\u0002"+
		"\u0000\u008a\u008b\u0091\u0092\u0002\u0000\u0090\u0090\u0093\u0093\u0002"+
		"\u0000\u0089\u0089\u00a0\u00a9\u0001\u0000\u0096\u0097\u0003\u0000\u008c"+
		"\u008d\u0098\u009a\u009c\u009c\u0001\u0000\u0086\u0087\u0001\u0000\u007f"+
		"\u007f\u0002\u0000\u00b7\u00b7\u00b9\u00b9\b\u0000(/38QSUVX]aacv}}\u0768"+
		"\u0000\u0123\u0001\u0000\u0000\u0000\u0002\u0133\u0001\u0000\u0000\u0000"+
		"\u0004\u0135\u0001\u0000\u0000\u0000\u0006\u013a\u0001\u0000\u0000\u0000"+
		"\b\u0150\u0001\u0000\u0000\u0000\n\u0165\u0001\u0000\u0000\u0000\f\u0173"+
		"\u0001\u0000\u0000\u0000\u000e\u017d\u0001\u0000\u0000\u0000\u0010\u0185"+
		"\u0001\u0000\u0000\u0000\u0012\u01a1\u0001\u0000\u0000\u0000\u0014\u01a3"+
		"\u0001\u0000\u0000\u0000\u0016\u01a7\u0001\u0000\u0000\u0000\u0018\u01b2"+
		"\u0001\u0000\u0000\u0000\u001a\u01ba\u0001\u0000\u0000\u0000\u001c\u01c9"+
		"\u0001\u0000\u0000\u0000\u001e\u01e5\u0001\u0000\u0000\u0000 \u01ef\u0001"+
		"\u0000\u0000\u0000\"\u01f1\u0001\u0000\u0000\u0000$\u0206\u0001\u0000"+
		"\u0000\u0000&\u0208\u0001\u0000\u0000\u0000(\u020f\u0001\u0000\u0000\u0000"+
		"*\u0213\u0001\u0000\u0000\u0000,\u0216\u0001\u0000\u0000\u0000.\u021a"+
		"\u0001\u0000\u0000\u00000\u0227\u0001\u0000\u0000\u00002\u022b\u0001\u0000"+
		"\u0000\u00004\u022e\u0001\u0000\u0000\u00006\u0232\u0001\u0000\u0000\u0000"+
		"8\u0247\u0001\u0000\u0000\u0000:\u024a\u0001\u0000\u0000\u0000<\u025a"+
		"\u0001\u0000\u0000\u0000>\u025c\u0001\u0000\u0000\u0000@\u0268\u0001\u0000"+
		"\u0000\u0000B\u026a\u0001\u0000\u0000\u0000D\u0272\u0001\u0000\u0000\u0000"+
		"F\u0278\u0001\u0000\u0000\u0000H\u0288\u0001\u0000\u0000\u0000J\u029d"+
		"\u0001\u0000\u0000\u0000L\u029f\u0001\u0000\u0000\u0000N\u02b0\u0001\u0000"+
		"\u0000\u0000P\u02b4\u0001\u0000\u0000\u0000R\u02c8\u0001\u0000\u0000\u0000"+
		"T\u02ca\u0001\u0000\u0000\u0000V\u02dc\u0001\u0000\u0000\u0000X\u02de"+
		"\u0001\u0000\u0000\u0000Z\u02ea\u0001\u0000\u0000\u0000\\\u02f1\u0001"+
		"\u0000\u0000\u0000^\u02f9\u0001\u0000\u0000\u0000`\u02fc\u0001\u0000\u0000"+
		"\u0000b\u0307\u0001\u0000\u0000\u0000d\u0311\u0001\u0000\u0000\u0000f"+
		"\u031f\u0001\u0000\u0000\u0000h\u0321\u0001\u0000\u0000\u0000j\u0326\u0001"+
		"\u0000\u0000\u0000l\u032b\u0001\u0000\u0000\u0000n\u0335\u0001\u0000\u0000"+
		"\u0000p\u0337\u0001\u0000\u0000\u0000r\u0343\u0001\u0000\u0000\u0000t"+
		"\u0349\u0001\u0000\u0000\u0000v\u034f\u0001\u0000\u0000\u0000x\u0352\u0001"+
		"\u0000\u0000\u0000z\u0355\u0001\u0000\u0000\u0000|\u0359\u0001\u0000\u0000"+
		"\u0000~\u0365\u0001\u0000\u0000\u0000\u0080\u036b\u0001\u0000\u0000\u0000"+
		"\u0082\u036d\u0001\u0000\u0000\u0000\u0084\u0373\u0001\u0000\u0000\u0000"+
		"\u0086\u037f\u0001\u0000\u0000\u0000\u0088\u0381\u0001\u0000\u0000\u0000"+
		"\u008a\u038c\u0001\u0000\u0000\u0000\u008c\u038f\u0001\u0000\u0000\u0000"+
		"\u008e\u039b\u0001\u0000\u0000\u0000\u0090\u03aa\u0001\u0000\u0000\u0000"+
		"\u0092\u03af\u0001\u0000\u0000\u0000\u0094\u03ba\u0001\u0000\u0000\u0000"+
		"\u0096\u03c3\u0001\u0000\u0000\u0000\u0098\u03cf\u0001\u0000\u0000\u0000"+
		"\u009a\u03d3\u0001\u0000\u0000\u0000\u009c\u03e1\u0001\u0000\u0000\u0000"+
		"\u009e\u03e9\u0001\u0000\u0000\u0000\u00a0\u03ee\u0001\u0000\u0000\u0000"+
		"\u00a2\u03fd\u0001\u0000\u0000\u0000\u00a4\u040a\u0001\u0000\u0000\u0000"+
		"\u00a6\u0414\u0001\u0000\u0000\u0000\u00a8\u0416\u0001\u0000\u0000\u0000"+
		"\u00aa\u0418\u0001\u0000\u0000\u0000\u00ac\u041a\u0001\u0000\u0000\u0000"+
		"\u00ae\u041c\u0001\u0000\u0000\u0000\u00b0\u0422\u0001\u0000\u0000\u0000"+
		"\u00b2\u0424\u0001\u0000\u0000\u0000\u00b4\u0435\u0001\u0000\u0000\u0000"+
		"\u00b6\u0442\u0001\u0000\u0000\u0000\u00b8\u0447\u0001\u0000\u0000\u0000"+
		"\u00ba\u0455\u0001\u0000\u0000\u0000\u00bc\u0476\u0001\u0000\u0000\u0000"+
		"\u00be\u0478\u0001\u0000\u0000\u0000\u00c0\u0483\u0001\u0000\u0000\u0000"+
		"\u00c2\u048a\u0001\u0000\u0000\u0000\u00c4\u04a3\u0001\u0000\u0000\u0000"+
		"\u00c6\u04a5\u0001\u0000\u0000\u0000\u00c8\u04ab\u0001\u0000\u0000\u0000"+
		"\u00ca\u04b0\u0001\u0000\u0000\u0000\u00cc\u04b7\u0001\u0000\u0000\u0000"+
		"\u00ce\u04c5\u0001\u0000\u0000\u0000\u00d0\u04ce\u0001\u0000\u0000\u0000"+
		"\u00d2\u04e0\u0001\u0000\u0000\u0000\u00d4\u04f0\u0001\u0000\u0000\u0000"+
		"\u00d6\u0509\u0001\u0000\u0000\u0000\u00d8\u0515\u0001\u0000\u0000\u0000"+
		"\u00da\u0517\u0001\u0000\u0000\u0000\u00dc\u0523\u0001\u0000\u0000\u0000"+
		"\u00de\u0526\u0001\u0000\u0000\u0000\u00e0\u0553\u0001\u0000\u0000\u0000"+
		"\u00e2\u0555\u0001\u0000\u0000\u0000\u00e4\u0559\u0001\u0000\u0000\u0000"+
		"\u00e6\u055e\u0001\u0000\u0000\u0000\u00e8\u0572\u0001\u0000\u0000\u0000"+
		"\u00ea\u0574\u0001\u0000\u0000\u0000\u00ec\u057a\u0001\u0000\u0000\u0000"+
		"\u00ee\u0584\u0001\u0000\u0000\u0000\u00f0\u0599\u0001\u0000\u0000\u0000"+
		"\u00f2\u059f\u0001\u0000\u0000\u0000\u00f4\u05a1\u0001\u0000\u0000\u0000"+
		"\u00f6\u05a7\u0001\u0000\u0000\u0000\u00f8\u05af\u0001\u0000\u0000\u0000"+
		"\u00fa\u05c3\u0001\u0000\u0000\u0000\u00fc\u05c5\u0001\u0000\u0000\u0000"+
		"\u00fe\u05d7\u0001\u0000\u0000\u0000\u0100\u05d9\u0001\u0000\u0000\u0000"+
		"\u0102\u05eb\u0001\u0000\u0000\u0000\u0104\u061c\u0001\u0000\u0000\u0000"+
		"\u0106\u0627\u0001\u0000\u0000\u0000\u0108\u062c\u0001\u0000\u0000\u0000"+
		"\u010a\u0630\u0001\u0000\u0000\u0000\u010c\u0640\u0001\u0000\u0000\u0000"+
		"\u010e\u0642\u0001\u0000\u0000\u0000\u0110\u0644\u0001\u0000\u0000\u0000"+
		"\u0112\u066c\u0001\u0000\u0000\u0000\u0114\u066e\u0001\u0000\u0000\u0000"+
		"\u0116\u0678\u0001\u0000\u0000\u0000\u0118\u0689\u0001\u0000\u0000\u0000"+
		"\u011a\u069d\u0001\u0000\u0000\u0000\u011c\u06a7\u0001\u0000\u0000\u0000"+
		"\u011e\u06ab\u0001\u0000\u0000\u0000\u0120\u0122\u0003\u0002\u0001\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u0000\u0000\u0001\u0127\u0001\u0001\u0000\u0000\u0000"+
		"\u0128\u0134\u0003\u0004\u0002\u0000\u0129\u0134\u0003x<\u0000\u012a\u0134"+
		"\u0003\u008aE\u0000\u012b\u0134\u0003\u0006\u0003\u0000\u012c\u0134\u0003"+
		"\n\u0005\u0000\u012d\u0134\u0003\b\u0004\u0000\u012e\u0134\u0003\f\u0006"+
		"\u0000\u012f\u0134\u0003\u0010\b\u0000\u0130\u0134\u0003\u0014\n\u0000"+
		"\u0131\u0134\u0003\u0016\u000b\u0000\u0132\u0134\u0003z=\u0000\u0133\u0128"+
		"\u0001\u0000\u0000\u0000\u0133\u0129\u0001\u0000\u0000\u0000\u0133\u012a"+
		"\u0001\u0000\u0000\u0000\u0133\u012b\u0001\u0000\u0000\u0000\u0133\u012c"+
		"\u0001\u0000\u0000\u0000\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u012e"+
		"\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130"+
		"\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0003\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005C\u0000\u0000\u0136\u0137\u0003\u011e\u008f\u0000\u0137\u0138\u0005"+
		"\u0084\u0000\u0000\u0138\u0005\u0001\u0000\u0000\u0000\u0139\u013b\u0005"+
		"v\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005B\u0000"+
		"\u0000\u013d\u0140\u0003\u000e\u0007\u0000\u013e\u013f\u0005\u008f\u0000"+
		"\u0000\u013f\u0141\u0003\u011e\u008f\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0146\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005\u008b\u0000\u0000\u0143\u0144\u0003\u0018\f\u0000"+
		"\u0144\u0145\u0005\u008a\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000"+
		"\u0146\u0142\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u014a\u0003\"\u0011\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u0001\u0000\u0000\u0000\u014b\u014d\u0003(\u0014\u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005?\u0000\u0000\u014f\u0007\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005B\u0000\u0000\u0151\u0152\u0003\u000e"+
		"\u0007\u0000\u0152\u0154\u0005~\u0000\u0000\u0153\u0155\u0003\u011e\u008f"+
		"\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u015b\u0005\u007f\u0000"+
		"\u0000\u0157\u0158\u0005\u008b\u0000\u0000\u0158\u0159\u0003\u0018\f\u0000"+
		"\u0159\u015a\u0005\u008a\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000"+
		"\u015b\u0157\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015f\u0003\"\u0011\u0000\u015e"+
		"\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0161\u0001\u0000\u0000\u0000\u0160\u0162\u0003(\u0014\u0000\u0161\u0160"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0005?\u0000\u0000\u0164\t\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005A\u0000\u0000\u0166\u0169\u0003\u000e"+
		"\u0007\u0000\u0167\u0168\u0005\u008f\u0000\u0000\u0168\u016a\u0003\u011e"+
		"\u008f\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u016d\u0003\"\u0011"+
		"\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0170\u00030\u0018\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005?\u0000\u0000\u0172"+
		"\u000b\u0001\u0000\u0000\u0000\u0173\u0174\u0005A\u0000\u0000\u0174\u0175"+
		"\u0003\u000e\u0007\u0000\u0175\u0176\u0005~\u0000\u0000\u0176\u0177\u0003"+
		"\u011e\u008f\u0000\u0177\u0179\u0005\u007f\u0000\u0000\u0178\u017a\u0003"+
		"0\u0018\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0005?\u0000"+
		"\u0000\u017c\r\u0001\u0000\u0000\u0000\u017d\u0183\u0003\u011e\u008f\u0000"+
		"\u017e\u017f\u0005\u008b\u0000\u0000\u017f\u0180\u0003\u0018\f\u0000\u0180"+
		"\u0181\u0005\u008a\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182"+
		"\u0184\u0003H$\u0000\u0183\u017e\u0001\u0000\u0000\u0000\u0183\u0182\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u000f\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0005E\u0000\u0000\u0186\u018b\u0003 \u0010"+
		"\u0000\u0187\u0188\u0005\u008b\u0000\u0000\u0188\u0189\u0003\u0018\f\u0000"+
		"\u0189\u018a\u0005\u008a\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000"+
		"\u018b\u0187\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000"+
		"\u018c\u0190\u0001\u0000\u0000\u0000\u018d\u018f\u0003\u0012\t\u0000\u018e"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190"+
		"\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191"+
		"\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0005?\u0000\u0000\u0194\u0011\u0001\u0000\u0000\u0000\u0195\u0199"+
		"\u0007\u0000\u0000\u0000\u0196\u0198\u0003(\u0014\u0000\u0197\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u01a2\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e\u0003"+
		"(\u0014\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u0195\u0001\u0000"+
		"\u0000\u0000\u01a1\u019d\u0001\u0000\u0000\u0000\u01a2\u0013\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0005E\u0000\u0000\u01a4\u01a5\u0003\u0018\f"+
		"\u0000\u01a5\u01a6\u0005\u0084\u0000\u0000\u01a6\u0015\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005<\u0000\u0000\u01a8\u01ad\u0003\u011e\u008f\u0000"+
		"\u01a9\u01aa\u0005\u0085\u0000\u0000\u01aa\u01ac\u0003\u011e\u008f\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0005\u0084\u0000\u0000\u01b1\u0017\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b7\u0003 \u0010\u0000\u01b3\u01b4\u0005\u0085\u0000\u0000\u01b4"+
		"\u01b6\u0003 \u0010\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u0019\u0001\u0000\u0000\u0000\u01b9\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bf\u0005H\u0000\u0000\u01bb\u01bc\u0005"+
		"~\u0000\u0000\u01bc\u01bd\u0003\u001c\u000e\u0000\u01bd\u01be\u0005\u007f"+
		"\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c3\u0003\u00a6S\u0000\u01c2\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0005u\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0003\u00a2Q\u0000\u01c8\u001b\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ce\u0003\u001e\u000f\u0000\u01ca\u01cb\u0005\u0085\u0000\u0000\u01cb"+
		"\u01cd\u0003\u001e\u000f\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd"+
		"\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u001d\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d1\u01e6\u0005Q\u0000\u0000\u01d2\u01e6"+
		"\u0005R\u0000\u0000\u01d3\u01e6\u0005n\u0000\u0000\u01d4\u01e6\u0005q"+
		"\u0000\u0000\u01d5\u01e6\u0005S\u0000\u0000\u01d6\u01e6\u0005j\u0000\u0000"+
		"\u01d7\u01e6\u0005r\u0000\u0000\u01d8\u01e6\u0005k\u0000\u0000\u01d9\u01e6"+
		"\u0005o\u0000\u0000\u01da\u01e6\u0005p\u0000\u0000\u01db\u01dc\u0005l"+
		"\u0000\u0000\u01dc\u01dd\u0005\u0089\u0000\u0000\u01dd\u01e6\u0003\u011e"+
		"\u008f\u0000\u01de\u01df\u0005m\u0000\u0000\u01df\u01e0\u0005\u0089\u0000"+
		"\u0000\u01e0\u01e1\u0003\u011e\u008f\u0000\u01e1\u01e2\u0005\u008f\u0000"+
		"\u0000\u01e2\u01e6\u0001\u0000\u0000\u0000\u01e3\u01e6\u0003\u00aaU\u0000"+
		"\u01e4\u01e6\u0003\u011e\u008f\u0000\u01e5\u01d1\u0001\u0000\u0000\u0000"+
		"\u01e5\u01d2\u0001\u0000\u0000\u0000\u01e5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01d4\u0001\u0000\u0000\u0000\u01e5\u01d5\u0001\u0000\u0000\u0000"+
		"\u01e5\u01d6\u0001\u0000\u0000\u0000\u01e5\u01d7\u0001\u0000\u0000\u0000"+
		"\u01e5\u01d8\u0001\u0000\u0000\u0000\u01e5\u01d9\u0001\u0000\u0000\u0000"+
		"\u01e5\u01da\u0001\u0000\u0000\u0000\u01e5\u01db\u0001\u0000\u0000\u0000"+
		"\u01e5\u01de\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\u001f\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0005\u008b\u0000\u0000\u01e8\u01e9\u0003\u0018\f\u0000\u01e9"+
		"\u01ea\u0005\u008a\u0000\u0000\u01ea\u01f0\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ed\u0007\u0001\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f0\u0003\u011e\u008f\u0000\u01ef\u01e7\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ec\u0001\u0000\u0000\u0000\u01f0!\u0001\u0000\u0000\u0000\u01f1\u01f5"+
		"\u0005\u0080\u0000\u0000\u01f2\u01f4\u0003$\u0012\u0000\u01f3\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005"+
		"\u0081\u0000\u0000\u01f9#\u0001\u0000\u0000\u0000\u01fa\u01fe\u0003&\u0013"+
		"\u0000\u01fb\u01fd\u0003\u00a2Q\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0207\u0001\u0000\u0000\u0000"+
		"\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0203\u0003\u00a2Q\u0000\u0202"+
		"\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205"+
		"\u0207\u0001\u0000\u0000\u0000\u0206\u01fa\u0001\u0000\u0000\u0000\u0206"+
		"\u0202\u0001\u0000\u0000\u0000\u0207%\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0007\u0002\u0000\u0000\u0209\'\u0001\u0000\u0000\u0000\u020a\u0210\u0003"+
		"\u008aE\u0000\u020b\u0210\u0003*\u0015\u0000\u020c\u0210\u0003,\u0016"+
		"\u0000\u020d\u0210\u0003\u001a\r\u0000\u020e\u0210\u0003x<\u0000\u020f"+
		"\u020a\u0001\u0000\u0000\u0000\u020f\u020b\u0001\u0000\u0000\u0000\u020f"+
		"\u020c\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f"+
		"\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211"+
		"\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
		")\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0098\u0000\u0000\u0214\u0215"+
		"\u0003.\u0017\u0000\u0215+\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0099"+
		"\u0000\u0000\u0217\u0218\u0003.\u0017\u0000\u0218-\u0001\u0000\u0000\u0000"+
		"\u0219\u021b\u0003>\u001f\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"\u021e\u00038\u001c\u0000\u021d\u021f\u0003\u00ccf\u0000\u021e\u021d\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0005\u0084\u0000\u0000\u0221/\u0001\u0000"+
		"\u0000\u0000\u0222\u0228\u0003z=\u0000\u0223\u0228\u0003\u008aE\u0000"+
		"\u0224\u0228\u00032\u0019\u0000\u0225\u0228\u00034\u001a\u0000\u0226\u0228"+
		"\u0003@ \u0000\u0227\u0222\u0001\u0000\u0000\u0000\u0227\u0223\u0001\u0000"+
		"\u0000\u0000\u0227\u0224\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a1\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0098\u0000"+
		"\u0000\u022c\u022d\u00036\u001b\u0000\u022d3\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0005\u0099\u0000\u0000\u022f\u0230\u00036\u001b\u0000\u02305\u0001"+
		"\u0000\u0000\u0000\u0231\u0233\u0003>\u001f\u0000\u0232\u0231\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0236\u00038\u001c\u0000\u0235\u0237\u0003\u009cN\u0000"+
		"\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000"+
		"\u0237\u0239\u0001\u0000\u0000\u0000\u0238\u023a\u0005\u0084\u0000\u0000"+
		"\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0003\u00e6s\u0000\u023c"+
		"7\u0001\u0000\u0000\u0000\u023d\u0248\u0003<\u001e\u0000\u023e\u0240\u0003"+
		":\u001d\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000"+
		"\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0244\u0005\u0085"+
		"\u0000\u0000\u0244\u0246\u0005\u00aa\u0000\u0000\u0245\u0243\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0248\u0001\u0000"+
		"\u0000\u0000\u0247\u023d\u0001\u0000\u0000\u0000\u0247\u023f\u0001\u0000"+
		"\u0000\u0000\u02489\u0001\u0000\u0000\u0000\u0249\u024b\u0003<\u001e\u0000"+
		"\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000"+
		"\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u0250\u0005\u008f\u0000\u0000"+
		"\u024d\u024f\u0003>\u001f\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024f"+
		"\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252"+
		"\u0250\u0001\u0000\u0000\u0000\u0253\u0255\u0003\u00a8T\u0000\u0254\u0253"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0003\u011e\u008f\u0000\u0257;\u0001"+
		"\u0000\u0000\u0000\u0258\u025b\u0003\u011e\u008f\u0000\u0259\u025b\u0005"+
		"\u0016\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u0259\u0001"+
		"\u0000\u0000\u0000\u025b=\u0001\u0000\u0000\u0000\u025c\u025d\u0005~\u0000"+
		"\u0000\u025d\u025e\u0003\u00d4j\u0000\u025e\u025f\u0005\u007f\u0000\u0000"+
		"\u025f?\u0001\u0000\u0000\u0000\u0260\u0261\u0005N\u0000\u0000\u0261\u0262"+
		"\u0003B!\u0000\u0262\u0263\u0005\u0084\u0000\u0000\u0263\u0269\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0005=\u0000\u0000\u0265\u0266\u0003B!\u0000"+
		"\u0266\u0267\u0005\u0084\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000"+
		"\u0268\u0260\u0001\u0000\u0000\u0000\u0268\u0264\u0001\u0000\u0000\u0000"+
		"\u0269A\u0001\u0000\u0000\u0000\u026a\u026f\u0003D\"\u0000\u026b\u026c"+
		"\u0005\u0085\u0000\u0000\u026c\u026e\u0003D\"\u0000\u026d\u026b\u0001"+
		"\u0000\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u026d\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270C\u0001\u0000"+
		"\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0275\u0003\u011e"+
		"\u008f\u0000\u0273\u0274\u0005\u0089\u0000\u0000\u0274\u0276\u0003\u011e"+
		"\u008f\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276E\u0001\u0000\u0000\u0000\u0277\u0279\u0003\u00aaU\u0000"+
		"\u0278\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027c\u0003\u00b4Z\u0000\u027b"+
		"\u027d\u0003\u00aaU\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0005~\u0000\u0000\u027f\u0282\u0005\u009e\u0000\u0000\u0280\u0283\u0003"+
		"\u00aaU\u0000\u0281\u0283\u0003\u00b4Z\u0000\u0282\u0280\u0001\u0000\u0000"+
		"\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0005\u007f\u0000"+
		"\u0000\u0285\u0287\u0003T*\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287G\u0001\u0000\u0000\u0000\u0288\u0291"+
		"\u0005\u008b\u0000\u0000\u0289\u028e\u0003J%\u0000\u028a\u028b\u0005\u0085"+
		"\u0000\u0000\u028b\u028d\u0003J%\u0000\u028c\u028a\u0001\u0000\u0000\u0000"+
		"\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000"+
		"\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0289\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0005\u008a\u0000\u0000\u0294I\u0001\u0000\u0000\u0000\u0295"+
		"\u0297\u0003\u00aeW\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297\u029a"+
		"\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299"+
		"\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a\u0298"+
		"\u0001\u0000\u0000\u0000\u029b\u029e\u0003\u00b4Z\u0000\u029c\u029e\u0003"+
		"\u00d4j\u0000\u029d\u0298\u0001\u0000\u0000\u0000\u029d\u029c\u0001\u0000"+
		"\u0000\u0000\u029eK\u0001\u0000\u0000\u0000\u029f\u02a0\u0005\u0088\u0000"+
		"\u0000\u02a0\u02ac\u0005\u0080\u0000\u0000\u02a1\u02a6\u0003N\'\u0000"+
		"\u02a2\u02a3\u0005\u0085\u0000\u0000\u02a3\u02a5\u0003N\'\u0000\u02a4"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9"+
		"\u02ab\u0005\u0085\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac"+
		"\u02a1\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\u0081\u0000\u0000\u02af"+
		"M\u0001\u0000\u0000\u0000\u02b0\u02b1\u0003\u0106\u0083\u0000\u02b1\u02b2"+
		"\u0005\u008f\u0000\u0000\u02b2\u02b3\u0003\u0102\u0081\u0000\u02b3O\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0005\u0088\u0000\u0000\u02b5\u02ba\u0005"+
		"\u0082\u0000\u0000\u02b6\u02b8\u0003\u0100\u0080\u0000\u02b7\u02b9\u0005"+
		"\u0085\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02b6\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0005\u0083\u0000\u0000\u02bdQ\u0001\u0000"+
		"\u0000\u0000\u02be\u02bf\u0005\u0088\u0000\u0000\u02bf\u02c0\u0005~\u0000"+
		"\u0000\u02c0\u02c1\u0003\u0102\u0081\u0000\u02c1\u02c2\u0005\u007f\u0000"+
		"\u0000\u02c2\u02c9\u0001\u0000\u0000\u0000\u02c3\u02c6\u0005\u0088\u0000"+
		"\u0000\u02c4\u02c7\u0003\u011a\u008d\u0000\u02c5\u02c7\u0003\u011e\u008f"+
		"\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c9\u0001\u0000\u0000\u0000\u02c8\u02be\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c3\u0001\u0000\u0000\u0000\u02c9S\u0001\u0000\u0000\u0000"+
		"\u02ca\u02d6\u0005~\u0000\u0000\u02cb\u02ce\u0003V+\u0000\u02cc\u02ce"+
		"\u0005 \u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001"+
		"\u0000\u0000\u0000\u02ce\u02d3\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005"+
		"\u0085\u0000\u0000\u02d0\u02d2\u0003V+\u0000\u02d1\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0005\u007f\u0000\u0000\u02d9U\u0001\u0000\u0000\u0000"+
		"\u02da\u02dd\u0003l6\u0000\u02db\u02dd\u0003\u00d4j\u0000\u02dc\u02da"+
		"\u0001\u0000\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02ddW\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0005\u009e\u0000\u0000\u02df\u02e1\u0003"+
		"\u00b4Z\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02e4\u0003\u00aa"+
		"U\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e7\u0003T*\u0000\u02e6"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9\u0003\u00e6s\u0000\u02e9Y\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0005\u0082\u0000\u0000\u02eb\u02ec\u0003"+
		"\\.\u0000\u02ec\u02ed\u0003^/\u0000\u02ed\u02ee\u0005\u0083\u0000\u0000"+
		"\u02ee[\u0001\u0000\u0000\u0000\u02ef\u02f2\u0003\u0102\u0081\u0000\u02f0"+
		"\u02f2\u0003\u00b4Z\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f2]\u0001\u0000\u0000\u0000\u02f3\u02fa\u0003"+
		"<\u001e\u0000\u02f4\u02f6\u0003`0\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f3\u0001\u0000\u0000\u0000\u02f9\u02f5\u0001\u0000\u0000"+
		"\u0000\u02fa_\u0001\u0000\u0000\u0000\u02fb\u02fd\u0003<\u001e\u0000\u02fc"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005\u008f\u0000\u0000\u02ff"+
		"\u0304\u0003b1\u0000\u0300\u0301\u0005\u0085\u0000\u0000\u0301\u0303\u0003"+
		"b1\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000"+
		"\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000"+
		"\u0000\u0305a\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0309\u0003\u0100\u0080\u0000\u0308\u030a\u0003\u00aaU\u0000\u0309"+
		"\u0308\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a"+
		"\u030f\u0001\u0000\u0000\u0000\u030b\u030c\u0005\u0080\u0000\u0000\u030c"+
		"\u030d\u0003\u00d2i\u0000\u030d\u030e\u0005\u0081\u0000\u0000\u030e\u0310"+
		"\u0001\u0000\u0000\u0000\u030f\u030b\u0001\u0000\u0000\u0000\u030f\u0310"+
		"\u0001\u0000\u0000\u0000\u0310c\u0001\u0000\u0000\u0000\u0311\u0312\u0005"+
		"L\u0000\u0000\u0312\u0313\u0005~\u0000\u0000\u0313\u0314\u0003f3\u0000"+
		"\u0314\u0315\u0005\u007f\u0000\u0000\u0315e\u0001\u0000\u0000\u0000\u0316"+
		"\u0320\u0003<\u001e\u0000\u0317\u0319\u0003<\u001e\u0000\u0318\u0317\u0001"+
		"\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0001"+
		"\u0000\u0000\u0000\u031a\u031c\u0005\u008f\u0000\u0000\u031b\u0318\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031b\u0001"+
		"\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0001"+
		"\u0000\u0000\u0000\u031f\u0316\u0001\u0000\u0000\u0000\u031f\u031b\u0001"+
		"\u0000\u0000\u0000\u0320g\u0001\u0000\u0000\u0000\u0321\u0322\u0005E\u0000"+
		"\u0000\u0322\u0323\u0005~\u0000\u0000\u0323\u0324\u0003 \u0010\u0000\u0324"+
		"\u0325\u0005\u007f\u0000\u0000\u0325i\u0001\u0000\u0000\u0000\u0326\u0327"+
		"\u0005>\u0000\u0000\u0327\u0328\u0005~\u0000\u0000\u0328\u0329\u0003\u00d4"+
		"j\u0000\u0329\u032a\u0005\u007f\u0000\u0000\u032ak\u0001\u0000\u0000\u0000"+
		"\u032b\u032c\u0003\u0098L\u0000\u032c\u032d\u0003\u00deo\u0000\u032dm"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0005O\u0000\u0000\u032f\u0330\u0005"+
		"~\u0000\u0000\u0330\u0331\u0003\u011e\u008f\u0000\u0331\u0332\u0005\u007f"+
		"\u0000\u0000\u0332\u0336\u0001\u0000\u0000\u0000\u0333\u0334\u0005O\u0000"+
		"\u0000\u0334\u0336\u0003\u0102\u0081\u0000\u0335\u032e\u0001\u0000\u0000"+
		"\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0336o\u0001\u0000\u0000\u0000"+
		"\u0337\u0338\u0005P\u0000\u0000\u0338\u033c\u0003\u00e6s\u0000\u0339\u033b"+
		"\u0003r9\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033b\u033e\u0001\u0000"+
		"\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u0341\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0005@\u0000\u0000\u0340\u0342\u0003\u00e6s\u0000"+
		"\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000"+
		"\u0342q\u0001\u0000\u0000\u0000\u0343\u0344\u0005;\u0000\u0000\u0344\u0345"+
		"\u0005~\u0000\u0000\u0345\u0346\u0003l6\u0000\u0346\u0347\u0005\u007f"+
		"\u0000\u0000\u0347\u0348\u0003\u00e6s\u0000\u0348s\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0005M\u0000\u0000\u034a\u034b\u0005~\u0000\u0000\u034b\u034c"+
		"\u0003\u0102\u0081\u0000\u034c\u034d\u0005\u007f\u0000\u0000\u034d\u034e"+
		"\u0003\u00e6s\u0000\u034eu\u0001\u0000\u0000\u0000\u034f\u0350\u0005:"+
		"\u0000\u0000\u0350\u0351\u0003\u00e6s\u0000\u0351w\u0001\u0000\u0000\u0000"+
		"\u0352\u0353\u0003|>\u0000\u0353\u0354\u0005\u0084\u0000\u0000\u0354y"+
		"\u0001\u0000\u0000\u0000\u0355\u0356\u0003|>\u0000\u0356\u0357\u0003\u00e6"+
		"s\u0000\u0357{\u0001\u0000\u0000\u0000\u0358\u035a\u0003\u0098L\u0000"+
		"\u0359\u0358\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035c\u0003\u011e\u008f\u0000"+
		"\u035c\u035e\u0005~\u0000\u0000\u035d\u035f\u0003\u00c8d\u0000\u035e\u035d"+
		"\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0001\u0000\u0000\u0000\u0360\u0361\u0005\u007f\u0000\u0000\u0361\u0363"+
		"\u0001\u0000\u0000\u0000\u0362\u0364\u0003\u009aM\u0000\u0363\u0362\u0001"+
		"\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364}\u0001\u0000"+
		"\u0000\u0000\u0365\u0367\u0003\u0080@\u0000\u0366\u0368\u0003\u0082A\u0000"+
		"\u0367\u0366\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000"+
		"\u0368\u007f\u0001\u0000\u0000\u0000\u0369\u036c\u0005\u0005\u0000\u0000"+
		"\u036a\u036c\u0003\u011e\u008f\u0000\u036b\u0369\u0001\u0000\u0000\u0000"+
		"\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u0081\u0001\u0000\u0000\u0000"+
		"\u036d\u036f\u0005~\u0000\u0000\u036e\u0370\u0003\u0084B\u0000\u036f\u036e"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0001\u0000\u0000\u0000\u0371\u0372\u0005\u007f\u0000\u0000\u0372\u0083"+
		"\u0001\u0000\u0000\u0000\u0373\u0378\u0003\u0086C\u0000\u0374\u0375\u0005"+
		"\u0085\u0000\u0000\u0375\u0377\u0003\u0086C\u0000\u0376\u0374\u0001\u0000"+
		"\u0000\u0000\u0377\u037a\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000"+
		"\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u0085\u0001\u0000"+
		"\u0000\u0000\u037a\u0378\u0001\u0000\u0000\u0000\u037b\u0380\u0003~?\u0000"+
		"\u037c\u0380\u0003\u011a\u008d\u0000\u037d\u0380\u0003\u011c\u008e\u0000"+
		"\u037e\u0380\u0003\u0088D\u0000\u037f\u037b\u0001\u0000\u0000\u0000\u037f"+
		"\u037c\u0001\u0000\u0000\u0000\u037f\u037d\u0001\u0000\u0000\u0000\u037f"+
		"\u037e\u0001\u0000\u0000\u0000\u0380\u0087\u0001\u0000\u0000\u0000\u0381"+
		"\u0382\u0003\u0080@\u0000\u0382\u0386\u0005\u0089\u0000\u0000\u0383\u0387"+
		"\u0003\u011a\u008d\u0000\u0384\u0387\u0003\u0080@\u0000\u0385\u0387\u0003"+
		"\u011c\u008e\u0000\u0386\u0383\u0001\u0000\u0000\u0000\u0386\u0384\u0001"+
		"\u0000\u0000\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387\u0089\u0001"+
		"\u0000\u0000\u0000\u0388\u038d\u0003\u008cF\u0000\u0389\u038d\u0003\u008e"+
		"G\u0000\u038a\u038d\u0003\u0090H\u0000\u038b\u038d\u0003\u0092I\u0000"+
		"\u038c\u0388\u0001\u0000\u0000\u0000\u038c\u0389\u0001\u0000\u0000\u0000"+
		"\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038b\u0001\u0000\u0000\u0000"+
		"\u038d\u008b\u0001\u0000\u0000\u0000\u038e\u0390\u0003\u009aM\u0000\u038f"+
		"\u038e\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390"+
		"\u0391\u0001\u0000\u0000\u0000\u0391\u0393\u0003\u011e\u008f\u0000\u0392"+
		"\u0394\u0003\u009aM\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394"+
		"\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0396"+
		"\u0005~\u0000\u0000\u0396\u0397\u0003\u00c4b\u0000\u0397\u0398\u0005\u007f"+
		"\u0000\u0000\u0398\u0399\u0005\u0084\u0000\u0000\u0399\u008d\u0001\u0000"+
		"\u0000\u0000\u039a\u039c\u0003\u009aM\u0000\u039b\u039a\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039e\u0001\u0000\u0000"+
		"\u0000\u039d\u039f\u0005\u001d\u0000\u0000\u039e\u039d\u0001\u0000\u0000"+
		"\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000"+
		"\u0000\u03a0\u03a2\u0003\u00bc^\u0000\u03a1\u03a3\u0003\u011e\u008f\u0000"+
		"\u03a2\u03a1\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005\u0084\u0000\u0000"+
		"\u03a5\u008f\u0001\u0000\u0000\u0000\u03a6\u03a7\u0003\u0098L\u0000\u03a7"+
		"\u03a8\u0003\u009cN\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03ab"+
		"\u0003\u0098L\u0000\u03aa\u03a6\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001"+
		"\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005"+
		"\u0084\u0000\u0000\u03ad\u0091\u0001\u0000\u0000\u0000\u03ae\u03b0\u0003"+
		"\u009aM\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b6\u0005\u001d"+
		"\u0000\u0000\u03b2\u03b3\u0003\u0098L\u0000\u03b3\u03b4\u0003\u0094J\u0000"+
		"\u03b4\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b7\u0003\u0098L\u0000\u03b6"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005\u0084\u0000\u0000\u03b9"+
		"\u0093\u0001\u0000\u0000\u0000\u03ba\u03bf\u0003\u0096K\u0000\u03bb\u03bc"+
		"\u0005\u0085\u0000\u0000\u03bc\u03be\u0003\u0096K\u0000\u03bd\u03bb\u0001"+
		"\u0000\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001"+
		"\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u0095\u0001"+
		"\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2\u03c4\u0003"+
		"\u00cae\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u0003\u00c4"+
		"b\u0000\u03c6\u0097\u0001\u0000\u0000\u0000\u03c7\u03d0\u0003\u00acV\u0000"+
		"\u03c8\u03d0\u0003\u009aM\u0000\u03c9\u03d0\u0003\u00a8T\u0000\u03ca\u03d0"+
		"\u0003\u00aaU\u0000\u03cb\u03d0\u0003\u00a6S\u0000\u03cc\u03d0\u0003\u00ae"+
		"W\u0000\u03cd\u03d0\u0003\u00b0X\u0000\u03ce\u03d0\u0003\u00b4Z\u0000"+
		"\u03cf\u03c7\u0001\u0000\u0000\u0000\u03cf\u03c8\u0001\u0000\u0000\u0000"+
		"\u03cf\u03c9\u0001\u0000\u0000\u0000\u03cf\u03ca\u0001\u0000\u0000\u0000"+
		"\u03cf\u03cb\u0001\u0000\u0000\u0000\u03cf\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cf\u03cd\u0001\u0000\u0000\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000"+
		"\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u0099\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d4\u0005T\u0000\u0000\u03d4\u03d5\u0005~\u0000\u0000\u03d5\u03d6"+
		"\u0005~\u0000\u0000\u03d6\u03db\u0003~?\u0000\u03d7\u03d8\u0005\u0085"+
		"\u0000\u0000\u03d8\u03da\u0003~?\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000"+
		"\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000"+
		"\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de\u0001\u0000\u0000\u0000"+
		"\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03df\u0005\u007f\u0000\u0000"+
		"\u03df\u03e0\u0005\u007f\u0000\u0000\u03e0\u009b\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e6\u0003\u009eO\u0000\u03e2\u03e3\u0005\u0085\u0000\u0000\u03e3"+
		"\u03e5\u0003\u009eO\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e5\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e7"+
		"\u0001\u0000\u0000\u0000\u03e7\u009d\u0001\u0000\u0000\u0000\u03e8\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e9\u03ec\u0003\u00deo\u0000\u03ea\u03eb\u0005"+
		"\u0089\u0000\u0000\u03eb\u03ed\u0003\u0108\u0084\u0000\u03ec\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u009f\u0001"+
		"\u0000\u0000\u0000\u03ee\u03fb\u0007\u0003\u0000\u0000\u03ef\u03fc\u0003"+
		"\u011e\u008f\u0000\u03f0\u03f2\u0003\u011e\u008f\u0000\u03f1\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f5\u0005\u0080\u0000\u0000\u03f4\u03f6\u0003"+
		"\u00a2Q\u0000\u03f5\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0005\u0081"+
		"\u0000\u0000\u03fa\u03fc\u0001\u0000\u0000\u0000\u03fb\u03ef\u0001\u0000"+
		"\u0000\u0000\u03fb\u03f1\u0001\u0000\u0000\u0000\u03fc\u00a1\u0001\u0000"+
		"\u0000\u0000\u03fd\u03fe\u0003\u00a4R\u0000\u03fe\u0400\u0003\u00b8\\"+
		"\u0000\u03ff\u0401\u0003\u00ccf\u0000\u0400\u03ff\u0001\u0000\u0000\u0000"+
		"\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000"+
		"\u0402\u0403\u0005\u0084\u0000\u0000\u0403\u00a3\u0001\u0000\u0000\u0000"+
		"\u0404\u040b\u0003\u00a8T\u0000\u0405\u040b\u0003\u00aaU\u0000\u0406\u040b"+
		"\u0003\u00a6S\u0000\u0407\u040b\u0003\u00aeW\u0000\u0408\u040b\u0003\u00b0"+
		"X\u0000\u0409\u040b\u0003\u00b4Z\u0000\u040a\u0404\u0001\u0000\u0000\u0000"+
		"\u040a\u0405\u0001\u0000\u0000\u0000\u040a\u0406\u0001\u0000\u0000\u0000"+
		"\u040a\u0407\u0001\u0000\u0000\u0000\u040a\u0408\u0001\u0000\u0000\u0000"+
		"\u040a\u0409\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000"+
		"\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000"+
		"\u040d\u00a5\u0001\u0000\u0000\u0000\u040e\u040f\u0005t\u0000\u0000\u040f"+
		"\u0410\u0005~\u0000\u0000\u0410\u0411\u0003\u011e\u008f\u0000\u0411\u0412"+
		"\u0005\u007f\u0000\u0000\u0412\u0415\u0001\u0000\u0000\u0000\u0413\u0415"+
		"\u0005s\u0000\u0000\u0414\u040e\u0001\u0000\u0000\u0000\u0414\u0413\u0001"+
		"\u0000\u0000\u0000\u0415\u00a7\u0001\u0000\u0000\u0000\u0416\u0417\u0007"+
		"\u0004\u0000\u0000\u0417\u00a9\u0001\u0000\u0000\u0000\u0418\u0419\u0007"+
		"\u0005\u0000\u0000\u0419\u00ab\u0001\u0000\u0000\u0000\u041a\u041b\u0007"+
		"\u0006\u0000\u0000\u041b\u00ad\u0001\u0000\u0000\u0000\u041c\u041d\u0007"+
		"\u0007\u0000\u0000\u041d\u00af\u0001\u0000\u0000\u0000\u041e\u0423\u0005"+
		"\u0005\u0000\u0000\u041f\u0423\u0005!\u0000\u0000\u0420\u0423\u0005\u0015"+
		"\u0000\u0000\u0421\u0423\u0003\u00b2Y\u0000\u0422\u041e\u0001\u0000\u0000"+
		"\u0000\u0422\u041f\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000"+
		"\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0423\u00b1\u0001\u0000\u0000"+
		"\u0000\u0424\u0425\u0007\b\u0000\u0000\u0425\u00b3\u0001\u0000\u0000\u0000"+
		"\u0426\u0427\u0006Z\uffff\uffff\u0000\u0427\u0436\u0005 \u0000\u0000\u0428"+
		"\u0436\u0005\u0004\u0000\u0000\u0429\u0436\u0005\u0017\u0000\u0000\u042a"+
		"\u0436\u0005\u0012\u0000\u0000\u042b\u0436\u0005\u0013\u0000\u0000\u042c"+
		"\u0436\u0005\r\u0000\u0000\u042d\u0436\u0005\t\u0000\u0000\u042e\u0436"+
		"\u0005\u0018\u0000\u0000\u042f\u0436\u0005\u001f\u0000\u0000\u0430\u0436"+
		"\u0003\u011e\u008f\u0000\u0431\u0436\u0003\u00b6[\u0000\u0432\u0436\u0003"+
		"\u000e\u0007\u0000\u0433\u0436\u0003\u00a0P\u0000\u0434\u0436\u0003\u00bc"+
		"^\u0000\u0435\u0426\u0001\u0000\u0000\u0000\u0435\u0428\u0001\u0000\u0000"+
		"\u0000\u0435\u0429\u0001\u0000\u0000\u0000\u0435\u042a\u0001\u0000\u0000"+
		"\u0000\u0435\u042b\u0001\u0000\u0000\u0000\u0435\u042c\u0001\u0000\u0000"+
		"\u0000\u0435\u042d\u0001\u0000\u0000\u0000\u0435\u042e\u0001\u0000\u0000"+
		"\u0000\u0435\u042f\u0001\u0000\u0000\u0000\u0435\u0430\u0001\u0000\u0000"+
		"\u0000\u0435\u0431\u0001\u0000\u0000\u0000\u0435\u0432\u0001\u0000\u0000"+
		"\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0435\u0434\u0001\u0000\u0000"+
		"\u0000\u0436\u043f\u0001\u0000\u0000\u0000\u0437\u0439\n\u0001\u0000\u0000"+
		"\u0438\u043a\u0005\u009a\u0000\u0000\u0439\u0438\u0001\u0000\u0000\u0000"+
		"\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u0439\u0001\u0000\u0000\u0000"+
		"\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u043e\u0001\u0000\u0000\u0000"+
		"\u043d\u0437\u0001\u0000\u0000\u0000\u043e\u0441\u0001\u0000\u0000\u0000"+
		"\u043f\u043d\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000"+
		"\u0440\u00b5\u0001\u0000\u0000\u0000\u0441\u043f\u0001\u0000\u0000\u0000"+
		"\u0442\u0443\u0005_\u0000\u0000\u0443\u0444\u0005~\u0000\u0000\u0444\u0445"+
		"\u0003\u0102\u0081\u0000\u0445\u0446\u0005\u007f\u0000\u0000\u0446\u00b7"+
		"\u0001\u0000\u0000\u0000\u0447\u044c\u0003\u00ba]\u0000\u0448\u0449\u0005"+
		"\u0085\u0000\u0000\u0449\u044b\u0003\u00ba]\u0000\u044a\u0448\u0001\u0000"+
		"\u0000\u0000\u044b\u044e\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000"+
		"\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u00b9\u0001\u0000"+
		"\u0000\u0000\u044e\u044c\u0001\u0000\u0000\u0000\u044f\u0456\u0003\u00de"+
		"o\u0000\u0450\u0452\u0003\u00deo\u0000\u0451\u0450\u0001\u0000\u0000\u0000"+
		"\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000"+
		"\u0453\u0454\u0005\u008f\u0000\u0000\u0454\u0456\u0003\u011a\u008d\u0000"+
		"\u0455\u044f\u0001\u0000\u0000\u0000\u0455\u0451\u0001\u0000\u0000\u0000"+
		"\u0456\u00bb\u0001\u0000\u0000\u0000\u0457\u045d\u0005\u000b\u0000\u0000"+
		"\u0458\u045a\u0003\u011e\u008f\u0000\u0459\u0458\u0001\u0000\u0000\u0000"+
		"\u0459\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0005\u008f\u0000\u0000\u045c\u045e\u0003\u00d4j\u0000\u045d"+
		"\u0459\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000\u0000\u045e"+
		"\u046a\u0001\u0000\u0000\u0000\u045f\u0464\u0003\u011e\u008f\u0000\u0460"+
		"\u0461\u0005\u0080\u0000\u0000\u0461\u0462\u0003\u00be_\u0000\u0462\u0463"+
		"\u0005\u0081\u0000\u0000\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u0460"+
		"\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000\u0465\u046b"+
		"\u0001\u0000\u0000\u0000\u0466\u0467\u0005\u0080\u0000\u0000\u0467\u0468"+
		"\u0003\u00be_\u0000\u0468\u0469\u0005\u0081\u0000\u0000\u0469\u046b\u0001"+
		"\u0000\u0000\u0000\u046a\u045f\u0001\u0000\u0000\u0000\u046a\u0466\u0001"+
		"\u0000\u0000\u0000\u046b\u0477\u0001\u0000\u0000\u0000\u046c\u046d\u0007"+
		"\t\u0000\u0000\u046d\u046e\u0005~\u0000\u0000\u046e\u046f\u0003\u00d4"+
		"j\u0000\u046f\u0470\u0005\u0085\u0000\u0000\u0470\u0471\u0003\u011e\u008f"+
		"\u0000\u0471\u0472\u0005\u007f\u0000\u0000\u0472\u0473\u0005\u0080\u0000"+
		"\u0000\u0473\u0474\u0003\u00be_\u0000\u0474\u0475\u0005\u0081\u0000\u0000"+
		"\u0475\u0477\u0001\u0000\u0000\u0000\u0476\u0457\u0001\u0000\u0000\u0000"+
		"\u0476\u046c\u0001\u0000\u0000\u0000\u0477\u00bd\u0001\u0000\u0000\u0000"+
		"\u0478\u047d\u0003\u00c0`\u0000\u0479\u047a\u0005\u0085\u0000\u0000\u047a"+
		"\u047c\u0003\u00c0`\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047c\u047f"+
		"\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047e"+
		"\u0001\u0000\u0000\u0000\u047e\u0481\u0001\u0000\u0000\u0000\u047f\u047d"+
		"\u0001\u0000\u0000\u0000\u0480\u0482\u0005\u0085\u0000\u0000\u0481\u0480"+
		"\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u00bf"+
		"\u0001\u0000\u0000\u0000\u0483\u0486\u0003\u00c2a\u0000\u0484\u0485\u0005"+
		"\u0089\u0000\u0000\u0485\u0487\u0003\u0102\u0081\u0000\u0486\u0484\u0001"+
		"\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u00c1\u0001"+
		"\u0000\u0000\u0000\u0488\u048b\u0003\u011e\u008f\u0000\u0489\u048b\u0005"+
		"\u0007\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u0489\u0001"+
		"\u0000\u0000\u0000\u048b\u00c3\u0001\u0000\u0000\u0000\u048c\u0492\u0003"+
		"\u011e\u008f\u0000\u048d\u048e\u0005~\u0000\u0000\u048e\u048f\u0003\u00de"+
		"o\u0000\u048f\u0490\u0005\u007f\u0000\u0000\u0490\u0492\u0001\u0000\u0000"+
		"\u0000\u0491\u048c\u0001\u0000\u0000\u0000\u0491\u048d\u0001\u0000\u0000"+
		"\u0000\u0492\u0496\u0001\u0000\u0000\u0000\u0493\u0495\u0003\u00c6c\u0000"+
		"\u0494\u0493\u0001\u0000\u0000\u0000\u0495\u0498\u0001\u0000\u0000\u0000"+
		"\u0496\u0494\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000"+
		"\u0497\u04a4\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000\u0000"+
		"\u0499\u049a\u0005~\u0000\u0000\u049a\u049c\u0005\u009e\u0000\u0000\u049b"+
		"\u049d\u0003\u00aaU\u0000\u049c\u049b\u0001\u0000\u0000\u0000\u049c\u049d"+
		"\u0001\u0000\u0000\u0000\u049d\u049f\u0001\u0000\u0000\u0000\u049e\u04a0"+
		"\u0003\u011e\u008f\u0000\u049f\u049e\u0001\u0000\u0000\u0000\u049f\u04a0"+
		"\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000\u0000\u04a1\u04a2"+
		"\u0005\u007f\u0000\u0000\u04a2\u04a4\u0003T*\u0000\u04a3\u0491\u0001\u0000"+
		"\u0000\u0000\u04a3\u0499\u0001\u0000\u0000\u0000\u04a4\u00c5\u0001\u0000"+
		"\u0000\u0000\u04a5\u04a7\u0005\u0082\u0000\u0000\u04a6\u04a8\u0003\u010a"+
		"\u0085\u0000\u04a7\u04a6\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000"+
		"\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9\u04aa\u0005\u0083"+
		"\u0000\u0000\u04aa\u00c7\u0001\u0000\u0000\u0000\u04ab\u04ae\u0003\u00da"+
		"m\u0000\u04ac\u04ad\u0005\u0085\u0000\u0000\u04ad\u04af\u0005\u00aa\u0000"+
		"\u0000\u04ae\u04ac\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000"+
		"\u0000\u04af\u00c9\u0001\u0000\u0000\u0000\u04b0\u04b2\u0005\u009a\u0000"+
		"\u0000\u04b1\u04b3\u0003\u0098L\u0000\u04b2\u04b1\u0001\u0000\u0000\u0000"+
		"\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b4\u04b6\u0003\u00cae\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b5"+
		"\u04b6\u0001\u0000\u0000\u0000\u04b6\u00cb\u0001\u0000\u0000\u0000\u04b7"+
		"\u04c3\u0003\u011e\u008f\u0000\u04b8\u04b9\u0005~\u0000\u0000\u04b9\u04be"+
		"\u0003\u0118\u008c\u0000\u04ba\u04bb\u0005\u0085\u0000\u0000\u04bb\u04bd"+
		"\u0003\u0118\u008c\u0000\u04bc\u04ba\u0001\u0000\u0000\u0000\u04bd\u04c0"+
		"\u0001\u0000\u0000\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04be\u04bf"+
		"\u0001\u0000\u0000\u0000\u04bf\u04c1\u0001\u0000\u0000\u0000\u04c0\u04be"+
		"\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005\u007f\u0000\u0000\u04c2\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c3\u04b8\u0001\u0000\u0000\u0000\u04c3\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c4\u00cd\u0001\u0000\u0000\u0000\u04c5\u04ca"+
		"\u0005\u0080\u0000\u0000\u04c6\u04c8\u0003\u0100\u0080\u0000\u04c7\u04c9"+
		"\u0005\u0085\u0000\u0000\u04c8\u04c7\u0001\u0000\u0000\u0000\u04c8\u04c9"+
		"\u0001\u0000\u0000\u0000\u04c9\u04cb\u0001\u0000\u0000\u0000\u04ca\u04c6"+
		"\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cc"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0005\u0081\u0000\u0000\u04cd\u00cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u04dc\u0005\u0080\u0000\u0000\u04cf\u04d0"+
		"\u0005\u0086\u0000\u0000\u04d0\u04d6\u0003\u0102\u0081\u0000\u04d1\u04d2"+
		"\u0005\u0085\u0000\u0000\u04d2\u04d3\u0005\u0086\u0000\u0000\u04d3\u04d5"+
		"\u0003\u0102\u0081\u0000\u04d4\u04d1\u0001\u0000\u0000\u0000\u04d5\u04d8"+
		"\u0001\u0000\u0000\u0000\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d6\u04d7"+
		"\u0001\u0000\u0000\u0000\u04d7\u04da\u0001\u0000\u0000\u0000\u04d8\u04d6"+
		"\u0001\u0000\u0000\u0000\u04d9\u04db\u0005\u0085\u0000\u0000\u04da\u04d9"+
		"\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04dd"+
		"\u0001\u0000\u0000\u0000\u04dc\u04cf\u0001\u0000\u0000\u0000\u04dc\u04dd"+
		"\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04df"+
		"\u0005\u0081\u0000\u0000\u04df\u00d1\u0001\u0000\u0000\u0000\u04e0\u04e5"+
		"\u0003\u0108\u0084\u0000\u04e1\u04e2\u0005\u0085\u0000\u0000\u04e2\u04e4"+
		"\u0003\u0108\u0084\u0000\u04e3\u04e1\u0001\u0000\u0000\u0000\u04e4\u04e7"+
		"\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000\u04e7\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e8\u04ea\u0005\u0085\u0000\u0000\u04e9\u04e8"+
		"\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u00d3"+
		"\u0001\u0000\u0000\u0000\u04eb\u04ed\u0003\u00a4R\u0000\u04ec\u04ee\u0003"+
		"\u00d6k\u0000\u04ed\u04ec\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000"+
		"\u0000\u0000\u04ee\u04f1\u0001\u0000\u0000\u0000\u04ef\u04f1\u0003F#\u0000"+
		"\u04f0\u04eb\u0001\u0000\u0000\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000"+
		"\u04f1\u00d5\u0001\u0000\u0000\u0000\u04f2\u04f4\u0003\u00cae\u0000\u04f3"+
		"\u04f5\u0003\u00d6k\u0000\u04f4\u04f3\u0001\u0000\u0000\u0000\u04f4\u04f5"+
		"\u0001\u0000\u0000\u0000\u04f5\u050a\u0001\u0000\u0000\u0000\u04f6\u04f8"+
		"\u0005~\u0000\u0000\u04f7\u04f9\u0003\u00d6k\u0000\u04f8\u04f7\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000"+
		"\u0000\u0000\u04fa\u04fc\u0005\u007f\u0000\u0000\u04fb\u04fd\u0003\u00d8"+
		"l\u0000\u04fc\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000"+
		"\u0000\u04fe\u04fc\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000"+
		"\u0000\u04ff\u050a\u0001\u0000\u0000\u0000\u0500\u0502\u0005\u0082\u0000"+
		"\u0000\u0501\u0503\u0003\u010a\u0085\u0000\u0502\u0501\u0001\u0000\u0000"+
		"\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000"+
		"\u0000\u0504\u0506\u0005\u0083\u0000\u0000\u0505\u0500\u0001\u0000\u0000"+
		"\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u0505\u0001\u0000\u0000"+
		"\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508\u050a\u0001\u0000\u0000"+
		"\u0000\u0509\u04f2\u0001\u0000\u0000\u0000\u0509\u04f6\u0001\u0000\u0000"+
		"\u0000\u0509\u0505\u0001\u0000\u0000\u0000\u050a\u00d7\u0001\u0000\u0000"+
		"\u0000\u050b\u050d\u0005\u0082\u0000\u0000\u050c\u050e\u0003\u010a\u0085"+
		"\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000"+
		"\u0000\u050e\u050f\u0001\u0000\u0000\u0000\u050f\u0516\u0005\u0083\u0000"+
		"\u0000\u0510\u0512\u0005~\u0000\u0000\u0511\u0513\u0003\u00dam\u0000\u0512"+
		"\u0511\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513"+
		"\u0514\u0001\u0000\u0000\u0000\u0514\u0516\u0005\u007f\u0000\u0000\u0515"+
		"\u050b\u0001\u0000\u0000\u0000\u0515\u0510\u0001\u0000\u0000\u0000\u0516"+
		"\u00d9\u0001\u0000\u0000\u0000\u0517\u051c\u0003\u00dcn\u0000\u0518\u0519"+
		"\u0005\u0085\u0000\u0000\u0519\u051b\u0003\u00dcn\u0000\u051a\u0518\u0001"+
		"\u0000\u0000\u0000\u051b\u051e\u0001\u0000\u0000\u0000\u051c\u051a\u0001"+
		"\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u00db\u0001"+
		"\u0000\u0000\u0000\u051e\u051c\u0001\u0000\u0000\u0000\u051f\u0520\u0003"+
		"\u0098L\u0000\u0520\u0521\u0003\u00deo\u0000\u0521\u0524\u0001\u0000\u0000"+
		"\u0000\u0522\u0524\u0005 \u0000\u0000\u0523\u051f\u0001\u0000\u0000\u0000"+
		"\u0523\u0522\u0001\u0000\u0000\u0000\u0524\u00dd\u0001\u0000\u0000\u0000"+
		"\u0525\u0527\u0003\u00cae\u0000\u0526\u0525\u0001\u0000\u0000\u0000\u0526"+
		"\u0527\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000\u0528"+
		"\u0529\u0003\u00c4b\u0000\u0529\u00df\u0001\u0000\u0000\u0000\u052a\u052c"+
		"\u0003\u00e2q\u0000\u052b\u052d\u0005\u0084\u0000\u0000\u052c\u052b\u0001"+
		"\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u0554\u0001"+
		"\u0000\u0000\u0000\u052e\u0530\u0003\u00e6s\u0000\u052f\u0531\u0005\u0084"+
		"\u0000\u0000\u0530\u052f\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000"+
		"\u0000\u0000\u0531\u0554\u0001\u0000\u0000\u0000\u0532\u0534\u0003\u00e8"+
		"t\u0000\u0533\u0535\u0005\u0084\u0000\u0000\u0534\u0533\u0001\u0000\u0000"+
		"\u0000\u0534\u0535\u0001\u0000\u0000\u0000\u0535\u0554\u0001\u0000\u0000"+
		"\u0000\u0536\u0538\u0003\u00f2y\u0000\u0537\u0539\u0005\u0084\u0000\u0000"+
		"\u0538\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000"+
		"\u0539\u0554\u0001\u0000\u0000\u0000\u053a\u053c\u0003\u00fe\u007f\u0000"+
		"\u053b\u053d\u0005\u0084\u0000\u0000\u053c\u053b\u0001\u0000\u0000\u0000"+
		"\u053c\u053d\u0001\u0000\u0000\u0000\u053d\u0554\u0001\u0000\u0000\u0000"+
		"\u053e\u0540\u0003t:\u0000\u053f\u0541\u0005\u0084\u0000\u0000\u0540\u053f"+
		"\u0001\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541\u0554"+
		"\u0001\u0000\u0000\u0000\u0542\u0544\u0003v;\u0000\u0543\u0545\u0005\u0084"+
		"\u0000\u0000\u0544\u0543\u0001\u0000\u0000\u0000\u0544\u0545\u0001\u0000"+
		"\u0000\u0000\u0545\u0554\u0001\u0000\u0000\u0000\u0546\u0548\u0003n7\u0000"+
		"\u0547\u0549\u0005\u0084\u0000\u0000\u0548\u0547\u0001\u0000\u0000\u0000"+
		"\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u0554\u0001\u0000\u0000\u0000"+
		"\u054a\u054c\u0003p8\u0000\u054b\u054d\u0005\u0084\u0000\u0000\u054c\u054b"+
		"\u0001\u0000\u0000\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054d\u0554"+
		"\u0001\u0000\u0000\u0000\u054e\u0550\u0003\u0100\u0080\u0000\u054f\u0551"+
		"\u0005\u0084\u0000\u0000\u0550\u054f\u0001\u0000\u0000\u0000\u0550\u0551"+
		"\u0001\u0000\u0000\u0000\u0551\u0554\u0001\u0000\u0000\u0000\u0552\u0554"+
		"\u0005\u0084\u0000\u0000\u0553\u052a\u0001\u0000\u0000\u0000\u0553\u052e"+
		"\u0001\u0000\u0000\u0000\u0553\u0532\u0001\u0000\u0000\u0000\u0553\u0536"+
		"\u0001\u0000\u0000\u0000\u0553\u053a\u0001\u0000\u0000\u0000\u0553\u053e"+
		"\u0001\u0000\u0000\u0000\u0553\u0542\u0001\u0000\u0000\u0000\u0553\u0546"+
		"\u0001\u0000\u0000\u0000\u0553\u054a\u0001\u0000\u0000\u0000\u0553\u054e"+
		"\u0001\u0000\u0000\u0000\u0553\u0552\u0001\u0000\u0000\u0000\u0554\u00e1"+
		"\u0001\u0000\u0000\u0000\u0555\u0556\u0003\u011e\u008f\u0000\u0556\u0557"+
		"\u0005\u008f\u0000\u0000\u0557\u0558\u0003\u00e0p\u0000\u0558\u00e3\u0001"+
		"\u0000\u0000\u0000\u0559\u055c\u0003\u010a\u0085\u0000\u055a\u055b\u0005"+
		"\u00aa\u0000\u0000\u055b\u055d\u0003\u010a\u0085\u0000\u055c\u055a\u0001"+
		"\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u00e5\u0001"+
		"\u0000\u0000\u0000\u055e\u0563\u0005\u0080\u0000\u0000\u055f\u0562\u0003"+
		"\u008aE\u0000\u0560\u0562\u0003\u00e0p\u0000\u0561\u055f\u0001\u0000\u0000"+
		"\u0000\u0561\u0560\u0001\u0000\u0000\u0000\u0562\u0565\u0001\u0000\u0000"+
		"\u0000\u0563\u0561\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000"+
		"\u0000\u0564\u0566\u0001\u0000\u0000\u0000\u0565\u0563\u0001\u0000\u0000"+
		"\u0000\u0566\u0567\u0005\u0081\u0000\u0000\u0567\u00e7\u0001\u0000\u0000"+
		"\u0000\u0568\u0569\u0005\u0010\u0000\u0000\u0569\u056a\u0005~\u0000\u0000"+
		"\u056a\u056b\u0003\u0102\u0081\u0000\u056b\u056c\u0005\u007f\u0000\u0000"+
		"\u056c\u056f\u0003\u00e0p\u0000\u056d\u056e\u0005\n\u0000\u0000\u056e"+
		"\u0570\u0003\u00e0p\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u056f\u0570"+
		"\u0001\u0000\u0000\u0000\u0570\u0573\u0001\u0000\u0000\u0000\u0571\u0573"+
		"\u0003\u00eau\u0000\u0572\u0568\u0001\u0000\u0000\u0000\u0572\u0571\u0001"+
		"\u0000\u0000\u0000\u0573\u00e9\u0001\u0000\u0000\u0000\u0574\u0575\u0005"+
		"\u001c\u0000\u0000\u0575\u0576\u0005~\u0000\u0000\u0576\u0577\u0003\u0102"+
		"\u0081\u0000\u0577\u0578\u0005\u007f\u0000\u0000\u0578\u0579\u0003\u00ec"+
		"v\u0000\u0579\u00eb\u0001\u0000\u0000\u0000\u057a\u057e\u0005\u0080\u0000"+
		"\u0000\u057b\u057d\u0003\u00eew\u0000\u057c\u057b\u0001\u0000\u0000\u0000"+
		"\u057d\u0580\u0001\u0000\u0000\u0000\u057e\u057c\u0001\u0000\u0000\u0000"+
		"\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0581\u0001\u0000\u0000\u0000"+
		"\u0580\u057e\u0001\u0000\u0000\u0000\u0581\u0582\u0005\u0081\u0000\u0000"+
		"\u0582\u00ed\u0001\u0000\u0000\u0000\u0583\u0585\u0003\u00f0x\u0000\u0584"+
		"\u0583\u0001\u0000\u0000\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586"+
		"\u0584\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000\u0587"+
		"\u0589\u0001\u0000\u0000\u0000\u0588\u058a\u0003\u00e0p\u0000\u0589\u0588"+
		"\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u0589"+
		"\u0001\u0000\u0000\u0000\u058b\u058c\u0001\u0000\u0000\u0000\u058c\u00ef"+
		"\u0001\u0000\u0000\u0000\u058d\u0593\u0005\u0003\u0000\u0000\u058e\u0594"+
		"\u0003\u00e4r\u0000\u058f\u0590\u0005~\u0000\u0000\u0590\u0591\u0003\u00e4"+
		"r\u0000\u0591\u0592\u0005\u007f\u0000\u0000\u0592\u0594\u0001\u0000\u0000"+
		"\u0000\u0593\u058e\u0001\u0000\u0000\u0000\u0593\u058f\u0001\u0000\u0000"+
		"\u0000\u0594\u0595\u0001\u0000\u0000\u0000\u0595\u0596\u0005\u008f\u0000"+
		"\u0000\u0596\u059a\u0001\u0000\u0000\u0000\u0597\u0598\u0005\u0007\u0000"+
		"\u0000\u0598\u059a\u0005\u008f\u0000\u0000\u0599\u058d\u0001\u0000\u0000"+
		"\u0000\u0599\u0597\u0001\u0000\u0000\u0000\u059a\u00f1\u0001\u0000\u0000"+
		"\u0000\u059b\u05a0\u0003\u00f4z\u0000\u059c\u05a0\u0003\u00f6{\u0000\u059d"+
		"\u05a0\u0003\u00f8|\u0000\u059e\u05a0\u0003\u00fc~\u0000\u059f\u059b\u0001"+
		"\u0000\u0000\u0000\u059f\u059c\u0001\u0000\u0000\u0000\u059f\u059d\u0001"+
		"\u0000\u0000\u0000\u059f\u059e\u0001\u0000\u0000\u0000\u05a0\u00f3\u0001"+
		"\u0000\u0000\u0000\u05a1\u05a2\u0005\"\u0000\u0000\u05a2\u05a3\u0005~"+
		"\u0000\u0000\u05a3\u05a4\u0003\u0102\u0081\u0000\u05a4\u05a5\u0005\u007f"+
		"\u0000\u0000\u05a5\u05a6\u0003\u00e0p\u0000\u05a6\u00f5\u0001\u0000\u0000"+
		"\u0000\u05a7\u05a8\u0005\b\u0000\u0000\u05a8\u05a9\u0003\u00e0p\u0000"+
		"\u05a9\u05aa\u0005\"\u0000\u0000\u05aa\u05ab\u0005~\u0000\u0000\u05ab"+
		"\u05ac\u0003\u0102\u0081\u0000\u05ac\u05ad\u0005\u007f\u0000\u0000\u05ad"+
		"\u05ae\u0005\u0084\u0000\u0000\u05ae\u00f7\u0001\u0000\u0000\u0000\u05af"+
		"\u05b0\u0005\u000e\u0000\u0000\u05b0\u05b2\u0005~\u0000\u0000\u05b1\u05b3"+
		"\u0003\u00fa}\u0000\u05b2\u05b1\u0001\u0000\u0000\u0000\u05b2\u05b3\u0001"+
		"\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000\u0000\u0000\u05b4\u05b6\u0005"+
		"\u0084\u0000\u0000\u05b5\u05b7\u0003\u0102\u0081\u0000\u05b6\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b8\u0001"+
		"\u0000\u0000\u0000\u05b8\u05ba\u0005\u0084\u0000\u0000\u05b9\u05bb\u0003"+
		"\u0100\u0080\u0000\u05ba\u05b9\u0001\u0000\u0000\u0000\u05ba\u05bb\u0001"+
		"\u0000\u0000\u0000\u05bb\u05bc\u0001\u0000\u0000\u0000\u05bc\u05bd\u0005"+
		"\u007f\u0000\u0000\u05bd\u05be\u0003\u00e0p\u0000\u05be\u00f9\u0001\u0000"+
		"\u0000\u0000\u05bf\u05c0\u0003\u0098L\u0000\u05c0\u05c1\u0003\u009cN\u0000"+
		"\u05c1\u05c4\u0001\u0000\u0000\u0000\u05c2\u05c4\u0003\u0100\u0080\u0000"+
		"\u05c3\u05bf\u0001\u0000\u0000\u0000\u05c3\u05c2\u0001\u0000\u0000\u0000"+
		"\u05c4\u00fb\u0001\u0000\u0000\u0000\u05c5\u05c6\u0005\u000e\u0000\u0000"+
		"\u05c6\u05c7\u0005~\u0000\u0000\u05c7\u05c8\u0003l6\u0000\u05c8\u05ca"+
		"\u0005.\u0000\u0000\u05c9\u05cb\u0003\u0102\u0081\u0000\u05ca\u05c9\u0001"+
		"\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb\u05cc\u0001"+
		"\u0000\u0000\u0000\u05cc\u05cd\u0005\u007f\u0000\u0000\u05cd\u05ce\u0003"+
		"\u00e0p\u0000\u05ce\u00fd\u0001\u0000\u0000\u0000\u05cf\u05d0\u0005\u000f"+
		"\u0000\u0000\u05d0\u05d8\u0003\u011e\u008f\u0000\u05d1\u05d8\u0005\u0006"+
		"\u0000\u0000\u05d2\u05d8\u0005\u0002\u0000\u0000\u05d3\u05d5\u0005\u0016"+
		"\u0000\u0000\u05d4\u05d6\u0003\u0102\u0081\u0000\u05d5\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d8\u0001\u0000"+
		"\u0000\u0000\u05d7\u05cf\u0001\u0000\u0000\u0000\u05d7\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d7\u05d2\u0001\u0000\u0000\u0000\u05d7\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d8\u00ff\u0001\u0000\u0000\u0000\u05d9\u05de\u0003\u0102"+
		"\u0081\u0000\u05da\u05db\u0005\u0085\u0000\u0000\u05db\u05dd\u0003\u0102"+
		"\u0081\u0000\u05dc\u05da\u0001\u0000\u0000\u0000\u05dd\u05e0\u0001\u0000"+
		"\u0000\u0000\u05de\u05dc\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000"+
		"\u0000\u0000\u05df\u0101\u0001\u0000\u0000\u0000\u05e0\u05de\u0001\u0000"+
		"\u0000\u0000\u05e1\u05e2\u0006\u0081\uffff\uffff\u0000\u05e2\u05ec\u0003"+
		"\u0106\u0083\u0000\u05e3\u05e4\u0005~\u0000\u0000\u05e4\u05e5\u0003\u00e6"+
		"s\u0000\u05e5\u05e6\u0005\u007f\u0000\u0000\u05e6\u05ec\u0001\u0000\u0000"+
		"\u0000\u05e7\u05e8\u0003\u010c\u0086\u0000\u05e8\u05e9\u0003\u0104\u0082"+
		"\u0000\u05e9\u05ea\u0003\u0102\u0081\u0001\u05ea\u05ec\u0001\u0000\u0000"+
		"\u0000\u05eb\u05e1\u0001\u0000\u0000\u0000\u05eb\u05e3\u0001\u0000\u0000"+
		"\u0000\u05eb\u05e7\u0001\u0000\u0000\u0000\u05ec\u0619\u0001\u0000\u0000"+
		"\u0000\u05ed\u05ee\n\r\u0000\u0000\u05ee\u05ef\u0007\n\u0000\u0000\u05ef"+
		"\u0618\u0003\u0102\u0081\u000e\u05f0\u05f1\n\f\u0000\u0000\u05f1\u05f2"+
		"\u0007\u000b\u0000\u0000\u05f2\u0618\u0003\u0102\u0081\r\u05f3\u05f8\n"+
		"\u000b\u0000\u0000\u05f4\u05f5\u0005\u008b\u0000\u0000\u05f5\u05f9\u0005"+
		"\u008b\u0000\u0000\u05f6\u05f7\u0005\u008a\u0000\u0000\u05f7\u05f9\u0005"+
		"\u008a\u0000\u0000\u05f8\u05f4\u0001\u0000\u0000\u0000\u05f8\u05f6\u0001"+
		"\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000\u0000\u05fa\u0618\u0003"+
		"\u0102\u0081\f\u05fb\u05fc\n\n\u0000\u0000\u05fc\u05fd\u0007\f\u0000\u0000"+
		"\u05fd\u0618\u0003\u0102\u0081\u000b\u05fe\u05ff\n\t\u0000\u0000\u05ff"+
		"\u0600\u0007\r\u0000\u0000\u0600\u0618\u0003\u0102\u0081\n\u0601\u0602"+
		"\n\b\u0000\u0000\u0602\u0603\u0005\u009c\u0000\u0000\u0603\u0618\u0003"+
		"\u0102\u0081\t\u0604\u0605\n\u0007\u0000\u0000\u0605\u0606\u0005\u009e"+
		"\u0000\u0000\u0606\u0618\u0003\u0102\u0081\b\u0607\u0608\n\u0006\u0000"+
		"\u0000\u0608\u0609\u0005\u009d\u0000\u0000\u0609\u0618\u0003\u0102\u0081"+
		"\u0007\u060a\u060b\n\u0005\u0000\u0000\u060b\u060c\u0005\u0094\u0000\u0000"+
		"\u060c\u0618\u0003\u0102\u0081\u0006\u060d\u060e\n\u0004\u0000\u0000\u060e"+
		"\u060f\u0005\u0095\u0000\u0000\u060f\u0618\u0003\u0102\u0081\u0005\u0610"+
		"\u0611\n\u0003\u0000\u0000\u0611\u0613\u0005\u008e\u0000\u0000\u0612\u0614"+
		"\u0003\u0102\u0081\u0000\u0613\u0612\u0001\u0000\u0000\u0000\u0613\u0614"+
		"\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000\u0000\u0615\u0616"+
		"\u0005\u008f\u0000\u0000\u0616\u0618\u0003\u0102\u0081\u0004\u0617\u05ed"+
		"\u0001\u0000\u0000\u0000\u0617\u05f0\u0001\u0000\u0000\u0000\u0617\u05f3"+
		"\u0001\u0000\u0000\u0000\u0617\u05fb\u0001\u0000\u0000\u0000\u0617\u05fe"+
		"\u0001\u0000\u0000\u0000\u0617\u0601\u0001\u0000\u0000\u0000\u0617\u0604"+
		"\u0001\u0000\u0000\u0000\u0617\u0607\u0001\u0000\u0000\u0000\u0617\u060a"+
		"\u0001\u0000\u0000\u0000\u0617\u060d\u0001\u0000\u0000\u0000\u0617\u0610"+
		"\u0001\u0000\u0000\u0000\u0618\u061b\u0001\u0000\u0000\u0000\u0619\u0617"+
		"\u0001\u0000\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a\u0103"+
		"\u0001\u0000\u0000\u0000\u061b\u0619\u0001\u0000\u0000\u0000\u061c\u061d"+
		"\u0007\u000e\u0000\u0000\u061d\u0105\u0001\u0000\u0000\u0000\u061e\u0628"+
		"\u0003\u010c\u0086\u0000\u061f\u0620\u0005~\u0000\u0000\u0620\u0621\u0003"+
		"\u00d4j\u0000\u0621\u0622\u0005\u007f\u0000\u0000\u0622\u0625\u0001\u0000"+
		"\u0000\u0000\u0623\u0626\u0003\u0106\u0083\u0000\u0624\u0626\u0003\u0108"+
		"\u0084\u0000\u0625\u0623\u0001\u0000\u0000\u0000\u0625\u0624\u0001\u0000"+
		"\u0000\u0000\u0626\u0628\u0001\u0000\u0000\u0000\u0627\u061e\u0001\u0000"+
		"\u0000\u0000\u0627\u061f\u0001\u0000\u0000\u0000\u0628\u0107\u0001\u0000"+
		"\u0000\u0000\u0629\u062d\u0003\u0102\u0081\u0000\u062a\u062d\u0003\u00ce"+
		"g\u0000\u062b\u062d\u0003\u00d0h\u0000\u062c\u0629\u0001\u0000\u0000\u0000"+
		"\u062c\u062a\u0001\u0000\u0000\u0000\u062c\u062b\u0001\u0000\u0000\u0000"+
		"\u062d\u0109\u0001\u0000\u0000\u0000\u062e\u0631\u0003\u011e\u008f\u0000"+
		"\u062f\u0631\u0003\u011a\u008d\u0000\u0630\u062e\u0001\u0000\u0000\u0000"+
		"\u0630\u062f\u0001\u0000\u0000\u0000\u0631\u010b\u0001\u0000\u0000\u0000"+
		"\u0632\u0641\u0003\u0110\u0088\u0000\u0633\u0639\u0005\u0019\u0000\u0000"+
		"\u0634\u063a\u0003\u010c\u0086\u0000\u0635\u0636\u0005~\u0000\u0000\u0636"+
		"\u0637\u0003\u00b4Z\u0000\u0637\u0638\u0005\u007f\u0000\u0000\u0638\u063a"+
		"\u0001\u0000\u0000\u0000\u0639\u0634\u0001\u0000\u0000\u0000\u0639\u0635"+
		"\u0001\u0000\u0000\u0000\u063a\u0641\u0001\u0000\u0000\u0000\u063b\u063c"+
		"\u0007\u000f\u0000\u0000\u063c\u0641\u0003\u010c\u0086\u0000\u063d\u063e"+
		"\u0003\u010e\u0087\u0000\u063e\u063f\u0003\u0106\u0083\u0000\u063f\u0641"+
		"\u0001\u0000\u0000\u0000\u0640\u0632\u0001\u0000\u0000\u0000\u0640\u0633"+
		"\u0001\u0000\u0000\u0000\u0640\u063b\u0001\u0000\u0000\u0000\u0640\u063d"+
		"\u0001\u0000\u0000\u0000\u0641\u010d\u0001\u0000\u0000\u0000\u0642\u0643"+
		"\u0007\u0010\u0000\u0000\u0643\u010f\u0001\u0000\u0000\u0000\u0644\u0645"+
		"\u0006\u0088\uffff\uffff\u0000\u0645\u0649\u0003\u0118\u008c\u0000\u0646"+
		"\u0648\u0003\u0112\u0089\u0000\u0647\u0646\u0001\u0000\u0000\u0000\u0648"+
		"\u064b\u0001\u0000\u0000\u0000\u0649\u0647\u0001\u0000\u0000\u0000\u0649"+
		"\u064a\u0001\u0000\u0000\u0000\u064a\u0657\u0001\u0000\u0000\u0000\u064b"+
		"\u0649\u0001\u0000\u0000\u0000\u064c\u064d\n\u0001\u0000\u0000\u064d\u064e"+
		"\u0007\u0011\u0000\u0000\u064e\u0652\u0003\u011e\u008f\u0000\u064f\u0651"+
		"\u0003\u0112\u0089\u0000\u0650\u064f\u0001\u0000\u0000\u0000\u0651\u0654"+
		"\u0001\u0000\u0000\u0000\u0652\u0650\u0001\u0000\u0000\u0000\u0652\u0653"+
		"\u0001\u0000\u0000\u0000\u0653\u0656\u0001\u0000\u0000\u0000\u0654\u0652"+
		"\u0001\u0000\u0000\u0000\u0655\u064c\u0001\u0000\u0000\u0000\u0656\u0659"+
		"\u0001\u0000\u0000\u0000\u0657\u0655\u0001\u0000\u0000\u0000\u0657\u0658"+
		"\u0001\u0000\u0000\u0000\u0658\u0111\u0001\u0000\u0000\u0000\u0659\u0657"+
		"\u0001\u0000\u0000\u0000\u065a\u065b\u0005\u0082\u0000\u0000\u065b\u065c"+
		"\u0003\u0102\u0081\u0000\u065c\u065d\u0005\u0083\u0000\u0000\u065d\u066d"+
		"\u0001\u0000\u0000\u0000\u065e\u0660\u0005~\u0000\u0000\u065f\u0661\u0003"+
		"\u0114\u008a\u0000\u0660\u065f\u0001\u0000\u0000\u0000\u0660\u0661\u0001"+
		"\u0000\u0000\u0000\u0661\u0662\u0001\u0000\u0000\u0000\u0662\u066d\u0005"+
		"\u007f\u0000\u0000\u0663\u0666\u0005~\u0000\u0000\u0664\u0667\u0005\u0085"+
		"\u0000\u0000\u0665\u0667\b\u0012\u0000\u0000\u0666\u0664\u0001\u0000\u0000"+
		"\u0000\u0666\u0665\u0001\u0000\u0000\u0000\u0667\u0668\u0001\u0000\u0000"+
		"\u0000\u0668\u0666\u0001\u0000\u0000\u0000\u0668\u0669\u0001\u0000\u0000"+
		"\u0000\u0669\u066a\u0001\u0000\u0000\u0000\u066a\u066d\u0005\u007f\u0000"+
		"\u0000\u066b\u066d\u0007\u000f\u0000\u0000\u066c\u065a\u0001\u0000\u0000"+
		"\u0000\u066c\u065e\u0001\u0000\u0000\u0000\u066c\u0663\u0001\u0000\u0000"+
		"\u0000\u066c\u066b\u0001\u0000\u0000\u0000\u066d\u0113\u0001\u0000\u0000"+
		"\u0000\u066e\u0673\u0003\u0116\u008b\u0000\u066f\u0670\u0005\u0085\u0000"+
		"\u0000\u0670\u0672\u0003\u0116\u008b\u0000\u0671\u066f\u0001\u0000\u0000"+
		"\u0000\u0672\u0675\u0001\u0000\u0000\u0000\u0673\u0671\u0001\u0000\u0000"+
		"\u0000\u0673\u0674\u0001\u0000\u0000\u0000\u0674\u0115\u0001\u0000\u0000"+
		"\u0000\u0675\u0673\u0001\u0000\u0000\u0000\u0676\u0679\u0003\u0102\u0081"+
		"\u0000\u0677\u0679\u0003\u00b4Z\u0000\u0678\u0676\u0001\u0000\u0000\u0000"+
		"\u0678\u0677\u0001\u0000\u0000\u0000\u0679\u0117\u0001\u0000\u0000\u0000"+
		"\u067a\u068a\u0003\u011e\u008f\u0000\u067b\u068a\u0003\u011a\u008d\u0000"+
		"\u067c\u068a\u0003\u011c\u008e\u0000\u067d\u067e\u0005~\u0000\u0000\u067e"+
		"\u067f\u0003\u0102\u0081\u0000\u067f\u0680\u0005\u007f\u0000\u0000\u0680"+
		"\u068a\u0001\u0000\u0000\u0000\u0681\u068a\u0003Z-\u0000\u0682\u068a\u0003"+
		"d2\u0000\u0683\u068a\u0003h4\u0000\u0684\u068a\u0003j5\u0000\u0685\u068a"+
		"\u0003L&\u0000\u0686\u068a\u0003P(\u0000\u0687\u068a\u0003R)\u0000\u0688"+
		"\u068a\u0003X,\u0000\u0689\u067a\u0001\u0000\u0000\u0000\u0689\u067b\u0001"+
		"\u0000\u0000\u0000\u0689\u067c\u0001\u0000\u0000\u0000\u0689\u067d\u0001"+
		"\u0000\u0000\u0000\u0689\u0681\u0001\u0000\u0000\u0000\u0689\u0682\u0001"+
		"\u0000\u0000\u0000\u0689\u0683\u0001\u0000\u0000\u0000\u0689\u0684\u0001"+
		"\u0000\u0000\u0000\u0689\u0685\u0001\u0000\u0000\u0000\u0689\u0686\u0001"+
		"\u0000\u0000\u0000\u0689\u0687\u0001\u0000\u0000\u0000\u0689\u0688\u0001"+
		"\u0000\u0000\u0000\u068a\u0119\u0001\u0000\u0000\u0000\u068b\u069e\u0005"+
		"\u00ad\u0000\u0000\u068c\u069e\u0005\u00ae\u0000\u0000\u068d\u069e\u0005"+
		"\u00af\u0000\u0000\u068e\u0690\u0007\u000b\u0000\u0000\u068f\u068e\u0001"+
		"\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000\u0000\u0690\u0691\u0001"+
		"\u0000\u0000\u0000\u0691\u069e\u0005\u00b0\u0000\u0000\u0692\u0694\u0007"+
		"\u000b\u0000\u0000\u0693\u0692\u0001\u0000\u0000\u0000\u0693\u0694\u0001"+
		"\u0000\u0000\u0000\u0694\u0695\u0001\u0000\u0000\u0000\u0695\u069e\u0005"+
		"\u00b1\u0000\u0000\u0696\u069e\u0005\u00ab\u0000\u0000\u0697\u069e\u0005"+
		"0\u0000\u0000\u0698\u069e\u00052\u0000\u0000\u0699\u069e\u00059\u0000"+
		"\u0000\u069a\u069e\u00051\u0000\u0000\u069b\u069e\u0005&\u0000\u0000\u069c"+
		"\u069e\u0005\'\u0000\u0000\u069d\u068b\u0001\u0000\u0000\u0000\u069d\u068c"+
		"\u0001\u0000\u0000\u0000\u069d\u068d\u0001\u0000\u0000\u0000\u069d\u068f"+
		"\u0001\u0000\u0000\u0000\u069d\u0693\u0001\u0000\u0000\u0000\u069d\u0696"+
		"\u0001\u0000\u0000\u0000\u069d\u0697\u0001\u0000\u0000\u0000\u069d\u0698"+
		"\u0001\u0000\u0000\u0000\u069d\u0699\u0001\u0000\u0000\u0000\u069d\u069a"+
		"\u0001\u0000\u0000\u0000\u069d\u069b\u0001\u0000\u0000\u0000\u069d\u069c"+
		"\u0001\u0000\u0000\u0000\u069e\u011b\u0001\u0000\u0000\u0000\u069f\u06a3"+
		"\u0005\u00ac\u0000\u0000\u06a0\u06a2\u0007\u0013\u0000\u0000\u06a1\u06a0"+
		"\u0001\u0000\u0000\u0000\u06a2\u06a5\u0001\u0000\u0000\u0000\u06a3\u06a1"+
		"\u0001\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4\u06a6"+
		"\u0001\u0000\u0000\u0000\u06a5\u06a3\u0001\u0000\u0000\u0000\u06a6\u06a8"+
		"\u0005\u00b8\u0000\u0000\u06a7\u069f\u0001\u0000\u0000\u0000\u06a8\u06a9"+
		"\u0001\u0000\u0000\u0000\u06a9\u06a7\u0001\u0000\u0000\u0000\u06a9\u06aa"+
		"\u0001\u0000\u0000\u0000\u06aa\u011d\u0001\u0000\u0000\u0000\u06ab\u06ac"+
		"\u0007\u0014\u0000\u0000\u06ac\u011f\u0001\u0000\u0000\u0000\u00e0\u0123"+
		"\u0133\u013a\u0140\u0146\u0149\u014c\u0154\u015b\u015e\u0161\u0169\u016c"+
		"\u016f\u0179\u0183\u018b\u0190\u0199\u019f\u01a1\u01ad\u01b7\u01bf\u01c2"+
		"\u01c5\u01ce\u01e5\u01ec\u01ef\u01f5\u01fe\u0204\u0206\u020f\u0211\u021a"+
		"\u021e\u0227\u0229\u0232\u0236\u0239\u0241\u0245\u0247\u024a\u0250\u0254"+
		"\u025a\u0268\u026f\u0275\u0278\u027c\u0282\u0286\u028e\u0291\u0298\u029d"+
		"\u02a6\u02aa\u02ac\u02b8\u02ba\u02c6\u02c8\u02cd\u02d3\u02d6\u02dc\u02e0"+
		"\u02e3\u02e6\u02f1\u02f7\u02f9\u02fc\u0304\u0309\u030f\u0318\u031d\u031f"+
		"\u0335\u033c\u0341\u0359\u035e\u0363\u0367\u036b\u036f\u0378\u037f\u0386"+
		"\u038c\u038f\u0393\u039b\u039e\u03a2\u03aa\u03af\u03b6\u03bf\u03c3\u03cf"+
		"\u03d1\u03db\u03e6\u03ec\u03f1\u03f7\u03fb\u0400\u040a\u040c\u0414\u0422"+
		"\u0435\u043b\u043f\u044c\u0451\u0455\u0459\u045d\u0464\u046a\u0476\u047d"+
		"\u0481\u0486\u048a\u0491\u0496\u049c\u049f\u04a3\u04a7\u04ae\u04b2\u04b5"+
		"\u04be\u04c3\u04c8\u04ca\u04d6\u04da\u04dc\u04e5\u04e9\u04ed\u04f0\u04f4"+
		"\u04f8\u04fe\u0502\u0507\u0509\u050d\u0512\u0515\u051c\u0523\u0526\u052c"+
		"\u0530\u0534\u0538\u053c\u0540\u0544\u0548\u054c\u0550\u0553\u055c\u0561"+
		"\u0563\u056f\u0572\u057e\u0586\u058b\u0593\u0599\u059f\u05b2\u05b6\u05ba"+
		"\u05c3\u05ca\u05d5\u05d7\u05de\u05eb\u05f8\u0613\u0617\u0619\u0625\u0627"+
		"\u062c\u0630\u0639\u0640\u0649\u0652\u0657\u0660\u0666\u0668\u066c\u0673"+
		"\u0678\u0689\u068f\u0693\u069d\u06a3\u06a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}