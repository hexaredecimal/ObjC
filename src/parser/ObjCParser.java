// Generated from ObjC.g4 by ANTLR 4.13.1
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
public class ObjCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTORELEASEPOOL=1, CATCH=2, CLASS=3, DYNAMIC=4, ENCODE=5, END=6, FINALLY=7, 
		IMPLEMENTATION=8, INTERFACE=9, PACKAGE=10, PROTOCOL=11, OPTIONAL=12, PRIVATE=13, 
		PROPERTY=14, PROTECTED=15, PUBLIC=16, SELECTOR=17, SYNCHRONIZED=18, SYNTHESIZE=19, 
		THROW=20, TRY=21, SUPER=22, SELF=23, ABSTRACT=24, AUTO=25, BOOLEAN=26, 
		BREAK=27, BYCOPY=28, BYREF=29, CASE=30, CHAR=31, CONST=32, CONTINUE=33, 
		DEFAULT=34, DO=35, DOUBLE=36, ELSE=37, ENUM=38, EXTERN=39, FLOAT=40, FOR=41, 
		ID=42, IF=43, IN=44, INOUT=45, GOTO=46, INT=47, LONG=48, ONEWAY=49, OUT=50, 
		REGISTER=51, RETURN=52, SHORT=53, SIGNED=54, SIZEOF=55, STATIC=56, STRUCT=57, 
		SWITCH=58, TYPEDEF=59, UNION=60, UNSIGNED=61, VOID=62, VOLATILE=63, WHILE=64, 
		NS_OPTIONS=65, NS_ENUM=66, WWEAK=67, WUNSAFE_UNRETAINED=68, LPAREN=69, 
		RPAREN=70, LBRACE=71, RBRACE=72, LBRACK=73, RBRACK=74, SEMI=75, COMMA=76, 
		DOT=77, STRUCTACCESS=78, AT=79, ASSIGN=80, GT=81, LT=82, BANG=83, TILDE=84, 
		QUESTION=85, COLON=86, EQUAL=87, LE=88, GE=89, NOTEQUAL=90, AND=91, OR=92, 
		INC=93, DEC=94, ADD=95, SUB=96, MUL=97, DIV=98, BITAND=99, BITOR=100, 
		CARET=101, MOD=102, SHIFT_R=103, SHIFT_L=104, ADD_ASSIGN=105, SUB_ASSIGN=106, 
		MUL_ASSIGN=107, DIV_ASSIGN=108, AND_ASSIGN=109, OR_ASSIGN=110, XOR_ASSIGN=111, 
		MOD_ASSIGN=112, LSHIFT_ASSIGN=113, RSHIFT_ASSIGN=114, ELIPSIS=115, ASSIGNPA=116, 
		GETTER=117, NONATOMIC=118, SETTER=119, STRONG=120, RETAIN=121, READONLY=122, 
		READWRITE=123, WEAK=124, IDENTIFIER=125, CHARACTER_LITERAL=126, STRING_LITERAL=127, 
		HEX_LITERAL=128, DECIMAL_LITERAL=129, OCTAL_LITERAL=130, FLOATING_POINT_LITERAL=131, 
		IMPORT=132, INCLUDE=133, PRAGMA=134, WS=135, COMMENT=136, LINE_COMMENT=137, 
		HDEFINE=138, HIF=139, HELSE=140, HUNDEF=141, HIFNDEF=142, HENDIF=143;
	public static final int
		RULE_program = 0, RULE_external_declaration = 1, RULE_preprocessor_declaration = 2, 
		RULE_class_interface = 3, RULE_category_interface = 4, RULE_class_implementation = 5, 
		RULE_category_implementation = 6, RULE_protocol_declaration = 7, RULE_protocol_declaration_list = 8, 
		RULE_class_declaration_list = 9, RULE_class_list = 10, RULE_protocol_reference_list = 11, 
		RULE_protocol_list = 12, RULE_property_declaration = 13, RULE_property_attributes_declaration = 14, 
		RULE_property_attributes_list = 15, RULE_property_attribute = 16, RULE_class_name = 17, 
		RULE_superclass_name = 18, RULE_category_name = 19, RULE_protocol_name = 20, 
		RULE_instance_variables = 21, RULE_visibility_specification = 22, RULE_interface_declaration_list = 23, 
		RULE_class_method_declaration = 24, RULE_instance_method_declaration = 25, 
		RULE_method_declaration = 26, RULE_implementation_definition_list = 27, 
		RULE_class_method_definition = 28, RULE_instance_method_definition = 29, 
		RULE_method_definition = 30, RULE_method_selector = 31, RULE_keyword_declarator = 32, 
		RULE_selector = 33, RULE_method_type = 34, RULE_property_implementation = 35, 
		RULE_property_synthesize_list = 36, RULE_property_synthesize_item = 37, 
		RULE_block_type = 38, RULE_type_specifier = 39, RULE_system_types = 40, 
		RULE_type_qualifier = 41, RULE_protocol_qualifier = 42, RULE_primary_expression = 43, 
		RULE_dictionary_pair = 44, RULE_dictionary_expression = 45, RULE_array_expression = 46, 
		RULE_box_expression = 47, RULE_block_parameters = 48, RULE_block_expression = 49, 
		RULE_message_expression = 50, RULE_receiver = 51, RULE_message_selector = 52, 
		RULE_keyword_argument = 53, RULE_selector_expression = 54, RULE_selector_name = 55, 
		RULE_protocol_expression = 56, RULE_encode_expression = 57, RULE_type_variable_declarator = 58, 
		RULE_try_statement = 59, RULE_catch_statement = 60, RULE_finally_statement = 61, 
		RULE_throw_statement = 62, RULE_try_block = 63, RULE_synchronized_statement = 64, 
		RULE_autorelease_statement = 65, RULE_function_definition = 66, RULE_declaration = 67, 
		RULE_declaration_specifiers = 68, RULE_arc_behaviour_specifier = 69, RULE_storage_class_specifier = 70, 
		RULE_init_declarator_list = 71, RULE_init_declarator = 72, RULE_struct_or_union_specifier = 73, 
		RULE_struct_declaration = 74, RULE_specifier_qualifier_list = 75, RULE_struct_declarator_list = 76, 
		RULE_struct_declarator = 77, RULE_enum_specifier = 78, RULE_enumerator_list = 79, 
		RULE_enumerator = 80, RULE_pointer = 81, RULE_declarator = 82, RULE_direct_declarator = 83, 
		RULE_declarator_suffix = 84, RULE_parameter_list = 85, RULE_parameter_declaration = 86, 
		RULE_initializer = 87, RULE_type_name = 88, RULE_abstract_declarator = 89, 
		RULE_abstract_declarator_suffix = 90, RULE_parameter_declaration_list = 91, 
		RULE_statement_list = 92, RULE_statement = 93, RULE_labeled_statement = 94, 
		RULE_compound_statement = 95, RULE_selection_statement = 96, RULE_for_in_statement = 97, 
		RULE_for_statement = 98, RULE_while_statement = 99, RULE_do_statement = 100, 
		RULE_iteration_statement = 101, RULE_jump_statement = 102, RULE_expression = 103, 
		RULE_assignment_expression = 104, RULE_assignment_operator = 105, RULE_conditional_expression = 106, 
		RULE_constant_expression = 107, RULE_logical_or_expression = 108, RULE_logical_and_expression = 109, 
		RULE_inclusive_or_expression = 110, RULE_exclusive_or_expression = 111, 
		RULE_and_expression = 112, RULE_equality_expression = 113, RULE_relational_expression = 114, 
		RULE_shift_expression = 115, RULE_additive_expression = 116, RULE_multiplicative_expression = 117, 
		RULE_cast_expression = 118, RULE_unary_expression = 119, RULE_unary_operator = 120, 
		RULE_postfix_expression = 121, RULE_argument_expression_list = 122, RULE_identifier = 123, 
		RULE_constant = 124;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "external_declaration", "preprocessor_declaration", "class_interface", 
			"category_interface", "class_implementation", "category_implementation", 
			"protocol_declaration", "protocol_declaration_list", "class_declaration_list", 
			"class_list", "protocol_reference_list", "protocol_list", "property_declaration", 
			"property_attributes_declaration", "property_attributes_list", "property_attribute", 
			"class_name", "superclass_name", "category_name", "protocol_name", "instance_variables", 
			"visibility_specification", "interface_declaration_list", "class_method_declaration", 
			"instance_method_declaration", "method_declaration", "implementation_definition_list", 
			"class_method_definition", "instance_method_definition", "method_definition", 
			"method_selector", "keyword_declarator", "selector", "method_type", "property_implementation", 
			"property_synthesize_list", "property_synthesize_item", "block_type", 
			"type_specifier", "system_types", "type_qualifier", "protocol_qualifier", 
			"primary_expression", "dictionary_pair", "dictionary_expression", "array_expression", 
			"box_expression", "block_parameters", "block_expression", "message_expression", 
			"receiver", "message_selector", "keyword_argument", "selector_expression", 
			"selector_name", "protocol_expression", "encode_expression", "type_variable_declarator", 
			"try_statement", "catch_statement", "finally_statement", "throw_statement", 
			"try_block", "synchronized_statement", "autorelease_statement", "function_definition", 
			"declaration", "declaration_specifiers", "arc_behaviour_specifier", "storage_class_specifier", 
			"init_declarator_list", "init_declarator", "struct_or_union_specifier", 
			"struct_declaration", "specifier_qualifier_list", "struct_declarator_list", 
			"struct_declarator", "enum_specifier", "enumerator_list", "enumerator", 
			"pointer", "declarator", "direct_declarator", "declarator_suffix", "parameter_list", 
			"parameter_declaration", "initializer", "type_name", "abstract_declarator", 
			"abstract_declarator_suffix", "parameter_declaration_list", "statement_list", 
			"statement", "labeled_statement", "compound_statement", "selection_statement", 
			"for_in_statement", "for_statement", "while_statement", "do_statement", 
			"iteration_statement", "jump_statement", "expression", "assignment_expression", 
			"assignment_operator", "conditional_expression", "constant_expression", 
			"logical_or_expression", "logical_and_expression", "inclusive_or_expression", 
			"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "additive_expression", "multiplicative_expression", 
			"cast_expression", "unary_expression", "unary_operator", "postfix_expression", 
			"argument_expression_list", "identifier", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@autoreleasepool'", "'@catch'", "'@class'", "'@dynamic'", "'@encode'", 
			"'@end'", "'@finally'", "'@implementation'", "'@interface'", "'@package'", 
			"'@protocol'", "'@optional'", "'@private'", "'@property'", "'@protected'", 
			"'@public'", "'@selector'", "'@synchronized'", "'@synthesize'", "'@throw'", 
			"'@try'", "'super'", "'self'", "'abstract'", "'auto'", "'boolean'", "'break'", 
			"'bycopy'", "'byref'", "'case'", "'char'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", "'for'", 
			"'id'", "'if'", "'in'", "'inout'", "'goto'", "'int'", "'long'", "'oneway'", 
			"'out'", "'register'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", 
			"'void'", "'volatile'", "'while'", "'NS_OPTIONS'", "'NS_ENUM'", "'__weak'", 
			"'__unsafe_unretained'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'->'", "'@'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'>>'", "'<<'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'...'", "'assign'", "'getter'", "'nonatomic'", "'setter'", 
			"'strong'", "'retain'", "'readonly'", "'readwrite'", "'weak'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", "END", 
			"FINALLY", "IMPLEMENTATION", "INTERFACE", "PACKAGE", "PROTOCOL", "OPTIONAL", 
			"PRIVATE", "PROPERTY", "PROTECTED", "PUBLIC", "SELECTOR", "SYNCHRONIZED", 
			"SYNTHESIZE", "THROW", "TRY", "SUPER", "SELF", "ABSTRACT", "AUTO", "BOOLEAN", 
			"BREAK", "BYCOPY", "BYREF", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", "ID", "IF", 
			"IN", "INOUT", "GOTO", "INT", "LONG", "ONEWAY", "OUT", "REGISTER", "RETURN", 
			"SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", 
			"UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "NS_OPTIONS", "NS_ENUM", 
			"WWEAK", "WUNSAFE_UNRETAINED", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "STRUCTACCESS", "AT", "ASSIGN", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "CARET", "MOD", "SHIFT_R", "SHIFT_L", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "ELIPSIS", "ASSIGNPA", 
			"GETTER", "NONATOMIC", "SETTER", "STRONG", "RETAIN", "READONLY", "READWRITE", 
			"WEAK", "IDENTIFIER", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_LITERAL", 
			"DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "IMPORT", 
			"INCLUDE", "PRAGMA", "WS", "COMMENT", "LINE_COMMENT", "HDEFINE", "HIF", 
			"HELSE", "HUNDEF", "HIFNDEF", "HENDIF"
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
	public String getGrammarFileName() { return "ObjC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjCParser.EOF, 0); }
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				external_declaration();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535617272L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921508901814303L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 51L) != 0) );
			setState(255);
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
	public static class External_declarationContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ObjCParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(ObjCParser.LINE_COMMENT, 0); }
		public Preprocessor_declarationContext preprocessor_declaration() {
			return getRuleContext(Preprocessor_declarationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Class_interfaceContext class_interface() {
			return getRuleContext(Class_interfaceContext.class,0);
		}
		public Class_implementationContext class_implementation() {
			return getRuleContext(Class_implementationContext.class,0);
		}
		public Category_interfaceContext category_interface() {
			return getRuleContext(Category_interfaceContext.class,0);
		}
		public Category_implementationContext category_implementation() {
			return getRuleContext(Category_implementationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Protocol_declaration_listContext protocol_declaration_list() {
			return getRuleContext(Protocol_declaration_listContext.class,0);
		}
		public Class_declaration_listContext class_declaration_list() {
			return getRuleContext(Class_declaration_listContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(LINE_COMMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				preprocessor_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				function_definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				class_interface();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				class_implementation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				category_interface();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				category_implementation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				protocol_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(267);
				protocol_declaration_list();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(268);
				class_declaration_list();
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
	public static class Preprocessor_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ObjCParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(ObjCParser.INCLUDE, 0); }
		public Preprocessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_declaration; }
	}

	public final Preprocessor_declarationContext preprocessor_declaration() throws RecognitionException {
		Preprocessor_declarationContext _localctx = new Preprocessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==IMPORT || _la==INCLUDE) ) {
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
	public static class Class_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ObjCParser.INTERFACE, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode END() { return getToken(ObjCParser.END, 0); }
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Class_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_interface; }
	}

	public final Class_interfaceContext class_interface() throws RecognitionException {
		Class_interfaceContext _localctx = new Class_interfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(INTERFACE);
			setState(274);
			class_name();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(275);
				match(COLON);
				setState(276);
				superclass_name();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(279);
				protocol_reference_list();
				}
			}

			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(282);
				instance_variables();
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535603712L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921507828072463L) != 0)) {
				{
				setState(285);
				interface_declaration_list();
				}
			}

			setState(288);
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
	public static class Category_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ObjCParser.INTERFACE, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(ObjCParser.END, 0); }
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Category_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_interface; }
	}

	public final Category_interfaceContext category_interface() throws RecognitionException {
		Category_interfaceContext _localctx = new Category_interfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_category_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(INTERFACE);
			setState(291);
			class_name();
			setState(292);
			match(LPAREN);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(293);
				category_name();
				}
			}

			setState(296);
			match(RPAREN);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(297);
				protocol_reference_list();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(300);
				instance_variables();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535603712L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921507828072463L) != 0)) {
				{
				setState(303);
				interface_declaration_list();
				}
			}

			setState(306);
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
	public static class Class_implementationContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTATION() { return getToken(ObjCParser.IMPLEMENTATION, 0); }
		public TerminalNode END() { return getToken(ObjCParser.END, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Class_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_implementation; }
	}

	public final Class_implementationContext class_implementation() throws RecognitionException {
		Class_implementationContext _localctx = new Class_implementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IMPLEMENTATION);
			{
			setState(309);
			class_name();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(310);
				match(COLON);
				setState(311);
				superclass_name();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(314);
				instance_variables();
				}
			}

			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535095792L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921512123039775L) != 0)) {
				{
				setState(317);
				implementation_definition_list();
				}
			}

			}
			setState(320);
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
	public static class Category_implementationContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTATION() { return getToken(ObjCParser.IMPLEMENTATION, 0); }
		public TerminalNode END() { return getToken(ObjCParser.END, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Category_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_implementation; }
	}

	public final Category_implementationContext category_implementation() throws RecognitionException {
		Category_implementationContext _localctx = new Category_implementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_category_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(IMPLEMENTATION);
			{
			setState(323);
			class_name();
			setState(324);
			match(LPAREN);
			setState(325);
			category_name();
			setState(326);
			match(RPAREN);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535095792L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921512123039775L) != 0)) {
				{
				setState(327);
				implementation_definition_list();
				}
			}

			}
			setState(330);
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
	public static class Protocol_declarationContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(ObjCParser.PROTOCOL, 0); }
		public TerminalNode END() { return getToken(ObjCParser.END, 0); }
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public List<Interface_declaration_listContext> interface_declaration_list() {
			return getRuleContexts(Interface_declaration_listContext.class);
		}
		public Interface_declaration_listContext interface_declaration_list(int i) {
			return getRuleContext(Interface_declaration_listContext.class,i);
		}
		public TerminalNode OPTIONAL() { return getToken(ObjCParser.OPTIONAL, 0); }
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(PROTOCOL);
			{
			setState(333);
			protocol_name();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(334);
				protocol_reference_list();
				}
			}

			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(337);
				interface_declaration_list();
				}
				break;
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(340);
				match(OPTIONAL);
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535603712L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921507828072463L) != 0)) {
				{
				setState(343);
				interface_declaration_list();
				}
			}

			}
			setState(346);
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
	public static class Protocol_declaration_listContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(ObjCParser.PROTOCOL, 0); }
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Protocol_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration_list; }
	}

	public final Protocol_declaration_listContext protocol_declaration_list() throws RecognitionException {
		Protocol_declaration_listContext _localctx = new Protocol_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocol_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			match(PROTOCOL);
			setState(349);
			protocol_list();
			setState(350);
			match(SEMI);
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
	public static class Class_declaration_listContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ObjCParser.CLASS, 0); }
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Class_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration_list; }
	}

	public final Class_declaration_listContext class_declaration_list() throws RecognitionException {
		Class_declaration_listContext _localctx = new Class_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(352);
			match(CLASS);
			setState(353);
			class_list();
			setState(354);
			match(SEMI);
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
	public static class Class_listContext extends ParserRuleContext {
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			class_name();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357);
				match(COMMA);
				setState(358);
				class_name();
				}
				}
				setState(363);
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
	public static class Protocol_reference_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjCParser.LT, 0); }
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjCParser.GT, 0); }
		public Protocol_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_reference_list; }
	}

	public final Protocol_reference_listContext protocol_reference_list() throws RecognitionException {
		Protocol_reference_listContext _localctx = new Protocol_reference_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocol_reference_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(364);
			match(LT);
			setState(365);
			protocol_list();
			setState(366);
			match(GT);
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
	public static class Protocol_listContext extends ParserRuleContext {
		public List<Protocol_nameContext> protocol_name() {
			return getRuleContexts(Protocol_nameContext.class);
		}
		public Protocol_nameContext protocol_name(int i) {
			return getRuleContext(Protocol_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Protocol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_list; }
	}

	public final Protocol_listContext protocol_list() throws RecognitionException {
		Protocol_listContext _localctx = new Protocol_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			protocol_name();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(369);
				match(COMMA);
				setState(370);
				protocol_name();
				}
				}
				setState(375);
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
	public static class Property_declarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(ObjCParser.PROPERTY, 0); }
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Property_attributes_declarationContext property_attributes_declaration() {
			return getRuleContext(Property_attributes_declarationContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(PROPERTY);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(377);
				property_attributes_declaration();
				}
			}

			setState(380);
			struct_declaration();
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
	public static class Property_attributes_declarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Property_attributes_listContext property_attributes_list() {
			return getRuleContext(Property_attributes_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Property_attributes_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_declaration; }
	}

	public final Property_attributes_declarationContext property_attributes_declaration() throws RecognitionException {
		Property_attributes_declarationContext _localctx = new Property_attributes_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_property_attributes_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(LPAREN);
			setState(383);
			property_attributes_list();
			setState(384);
			match(RPAREN);
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
	public static class Property_attributes_listContext extends ParserRuleContext {
		public List<Property_attributeContext> property_attribute() {
			return getRuleContexts(Property_attributeContext.class);
		}
		public Property_attributeContext property_attribute(int i) {
			return getRuleContext(Property_attributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Property_attributes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_list; }
	}

	public final Property_attributes_listContext property_attributes_list() throws RecognitionException {
		Property_attributes_listContext _localctx = new Property_attributes_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property_attributes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			property_attribute();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(388);
				property_attribute();
				}
				}
				setState(393);
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
	public static class Property_attributeContext extends ParserRuleContext {
		public TerminalNode NONATOMIC() { return getToken(ObjCParser.NONATOMIC, 0); }
		public TerminalNode ASSIGNPA() { return getToken(ObjCParser.ASSIGNPA, 0); }
		public TerminalNode WEAK() { return getToken(ObjCParser.WEAK, 0); }
		public TerminalNode STRONG() { return getToken(ObjCParser.STRONG, 0); }
		public TerminalNode RETAIN() { return getToken(ObjCParser.RETAIN, 0); }
		public TerminalNode READONLY() { return getToken(ObjCParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(ObjCParser.READWRITE, 0); }
		public TerminalNode GETTER() { return getToken(ObjCParser.GETTER, 0); }
		public TerminalNode ASSIGN() { return getToken(ObjCParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public TerminalNode SETTER() { return getToken(ObjCParser.SETTER, 0); }
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public Property_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attribute; }
	}

	public final Property_attributeContext property_attribute() throws RecognitionException {
		Property_attributeContext _localctx = new Property_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_attribute);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONATOMIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(NONATOMIC);
				}
				break;
			case ASSIGNPA:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(ASSIGNPA);
				}
				break;
			case WEAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(WEAK);
				}
				break;
			case STRONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(STRONG);
				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(RETAIN);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				match(READONLY);
				}
				break;
			case READWRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				match(READWRITE);
				}
				break;
			case RPAREN:
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case GETTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(402);
				match(GETTER);
				setState(403);
				match(ASSIGN);
				setState(404);
				match(IDENTIFIER);
				}
				break;
			case SETTER:
				enterOuterAlt(_localctx, 10);
				{
				setState(405);
				match(SETTER);
				setState(406);
				match(ASSIGN);
				setState(407);
				match(IDENTIFIER);
				setState(408);
				match(COLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(409);
				match(IDENTIFIER);
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
	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(IDENTIFIER);
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
	public static class Superclass_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_name; }
	}

	public final Superclass_nameContext superclass_name() throws RecognitionException {
		Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_superclass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(IDENTIFIER);
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
	public static class Category_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Category_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_name; }
	}

	public final Category_nameContext category_name() throws RecognitionException {
		Category_nameContext _localctx = new Category_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_category_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(IDENTIFIER);
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
	public static class Protocol_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
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
	public static class Instance_variablesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjCParser.RBRACE, 0); }
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Visibility_specificationContext visibility_specification() {
			return getRuleContext(Visibility_specificationContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Instance_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_variables; }
	}

	public final Instance_variablesContext instance_variables() throws RecognitionException {
		Instance_variablesContext _localctx = new Instance_variablesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instance_variables);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(LBRACE);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -979615031480025088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0)) {
					{
					{
					setState(421);
					struct_declaration();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(LBRACE);
				setState(429);
				visibility_specification();
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(430);
					struct_declaration();
					}
					}
					setState(433); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -979615031480025088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0) );
				setState(435);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(LBRACE);
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(438);
					struct_declaration();
					}
					}
					setState(441); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -979615031480025088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0) );
				setState(443);
				instance_variables();
				setState(444);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(LBRACE);
				setState(447);
				visibility_specification();
				setState(449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(448);
					struct_declaration();
					}
					}
					setState(451); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -979615031480025088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0) );
				setState(453);
				instance_variables();
				setState(454);
				match(RBRACE);
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
	public static class Visibility_specificationContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(ObjCParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ObjCParser.PROTECTED, 0); }
		public TerminalNode PACKAGE() { return getToken(ObjCParser.PACKAGE, 0); }
		public TerminalNode PUBLIC() { return getToken(ObjCParser.PUBLIC, 0); }
		public Visibility_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_specification; }
	}

	public final Visibility_specificationContext visibility_specification() throws RecognitionException {
		Visibility_specificationContext _localctx = new Visibility_specificationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_visibility_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 107520L) != 0)) ) {
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
	public static class Interface_declaration_listContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Class_method_declarationContext> class_method_declaration() {
			return getRuleContexts(Class_method_declarationContext.class);
		}
		public Class_method_declarationContext class_method_declaration(int i) {
			return getRuleContext(Class_method_declarationContext.class,i);
		}
		public List<Instance_method_declarationContext> instance_method_declaration() {
			return getRuleContexts(Instance_method_declarationContext.class);
		}
		public Instance_method_declarationContext instance_method_declaration(int i) {
			return getRuleContext(Instance_method_declarationContext.class,i);
		}
		public List<Property_declarationContext> property_declaration() {
			return getRuleContexts(Property_declarationContext.class);
		}
		public Property_declarationContext property_declaration(int i) {
			return getRuleContext(Property_declarationContext.class,i);
		}
		public Interface_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration_list; }
	}

	public final Interface_declaration_listContext interface_declaration_list() throws RecognitionException {
		Interface_declaration_listContext _localctx = new Interface_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interface_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(464);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AUTO:
					case BYCOPY:
					case BYREF:
					case CHAR:
					case CONST:
					case DOUBLE:
					case ENUM:
					case EXTERN:
					case FLOAT:
					case ID:
					case IN:
					case INOUT:
					case INT:
					case LONG:
					case ONEWAY:
					case OUT:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case STATIC:
					case STRUCT:
					case TYPEDEF:
					case UNION:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case NS_OPTIONS:
					case NS_ENUM:
					case WWEAK:
					case WUNSAFE_UNRETAINED:
					case IDENTIFIER:
						{
						setState(460);
						declaration();
						}
						break;
					case ADD:
						{
						setState(461);
						class_method_declaration();
						}
						break;
					case SUB:
						{
						setState(462);
						instance_method_declaration();
						}
						break;
					case PROPERTY:
						{
						setState(463);
						property_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(466); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class Class_method_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ObjCParser.ADD, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_declaration; }
	}

	public final Class_method_declarationContext class_method_declaration() throws RecognitionException {
		Class_method_declarationContext _localctx = new Class_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_class_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			match(ADD);
			setState(469);
			method_declaration();
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
	public static class Instance_method_declarationContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(ObjCParser.SUB, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Instance_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_declaration; }
	}

	public final Instance_method_declarationContext instance_method_declaration() throws RecognitionException {
		Instance_method_declarationContext _localctx = new Instance_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instance_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471);
			match(SUB);
			setState(472);
			method_declaration();
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
	public static class Method_declarationContext extends ParserRuleContext {
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(474);
				method_type();
				}
			}

			setState(477);
			method_selector();
			setState(478);
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
	public static class Implementation_definition_listContext extends ParserRuleContext {
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Class_method_definitionContext> class_method_definition() {
			return getRuleContexts(Class_method_definitionContext.class);
		}
		public Class_method_definitionContext class_method_definition(int i) {
			return getRuleContext(Class_method_definitionContext.class,i);
		}
		public List<Instance_method_definitionContext> instance_method_definition() {
			return getRuleContexts(Instance_method_definitionContext.class);
		}
		public Instance_method_definitionContext instance_method_definition(int i) {
			return getRuleContext(Instance_method_definitionContext.class,i);
		}
		public List<Property_implementationContext> property_implementation() {
			return getRuleContexts(Property_implementationContext.class);
		}
		public Property_implementationContext property_implementation(int i) {
			return getRuleContext(Property_implementationContext.class,i);
		}
		public Implementation_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition_list; }
	}

	public final Implementation_definition_listContext implementation_definition_list() throws RecognitionException {
		Implementation_definition_listContext _localctx = new Implementation_definition_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_implementation_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(480);
					function_definition();
					}
					break;
				case 2:
					{
					setState(481);
					declaration();
					}
					break;
				case 3:
					{
					setState(482);
					class_method_definition();
					}
					break;
				case 4:
					{
					setState(483);
					instance_method_definition();
					}
					break;
				case 5:
					{
					setState(484);
					property_implementation();
					}
					break;
				}
				}
				setState(487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535095792L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921512123039775L) != 0) );
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
	public static class Class_method_definitionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ObjCParser.ADD, 0); }
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Class_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_definition; }
	}

	public final Class_method_definitionContext class_method_definition() throws RecognitionException {
		Class_method_definitionContext _localctx = new Class_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_class_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			match(ADD);
			setState(490);
			method_definition();
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
	public static class Instance_method_definitionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(ObjCParser.SUB, 0); }
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Instance_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_definition; }
	}

	public final Instance_method_definitionContext instance_method_definition() throws RecognitionException {
		Instance_method_definitionContext _localctx = new Instance_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_instance_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(492);
			match(SUB);
			setState(493);
			method_definition();
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
	public static class Method_definitionContext extends ParserRuleContext {
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(495);
				method_type();
				}
			}

			setState(498);
			method_selector();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 72057594306363393L) != 0)) {
				{
				setState(499);
				init_declarator_list();
				}
			}

			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(502);
				match(SEMI);
				}
			}

			setState(505);
			compound_statement();
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
	public static class Method_selectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<Keyword_declaratorContext> keyword_declarator() {
			return getRuleContexts(Keyword_declaratorContext.class);
		}
		public Keyword_declaratorContext keyword_declarator(int i) {
			return getRuleContext(Keyword_declaratorContext.class,i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_method_selector);
		try {
			int _alt;
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(509); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(508);
						keyword_declarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(511); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(513);
					parameter_list();
					}
					break;
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
	public static class Keyword_declaratorContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<Method_typeContext> method_type() {
			return getRuleContexts(Method_typeContext.class);
		}
		public Method_typeContext method_type(int i) {
			return getRuleContext(Method_typeContext.class,i);
		}
		public Keyword_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_declarator; }
	}

	public final Keyword_declaratorContext keyword_declarator() throws RecognitionException {
		Keyword_declaratorContext _localctx = new Keyword_declaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keyword_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(518);
				selector();
				}
			}

			setState(521);
			match(COLON);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(522);
				method_type();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(IDENTIFIER);
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
	public static class Method_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(LPAREN);
			setState(533);
			type_name();
			setState(534);
			match(RPAREN);
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
	public static class Property_implementationContext extends ParserRuleContext {
		public TerminalNode SYNTHESIZE() { return getToken(ObjCParser.SYNTHESIZE, 0); }
		public Property_synthesize_listContext property_synthesize_list() {
			return getRuleContext(Property_synthesize_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public TerminalNode DYNAMIC() { return getToken(ObjCParser.DYNAMIC, 0); }
		public Property_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_implementation; }
	}

	public final Property_implementationContext property_implementation() throws RecognitionException {
		Property_implementationContext _localctx = new Property_implementationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_property_implementation);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(SYNTHESIZE);
				setState(537);
				property_synthesize_list();
				setState(538);
				match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(DYNAMIC);
				setState(541);
				property_synthesize_list();
				setState(542);
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
	public static class Property_synthesize_listContext extends ParserRuleContext {
		public List<Property_synthesize_itemContext> property_synthesize_item() {
			return getRuleContexts(Property_synthesize_itemContext.class);
		}
		public Property_synthesize_itemContext property_synthesize_item(int i) {
			return getRuleContext(Property_synthesize_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Property_synthesize_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_list; }
	}

	public final Property_synthesize_listContext property_synthesize_list() throws RecognitionException {
		Property_synthesize_listContext _localctx = new Property_synthesize_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_property_synthesize_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			property_synthesize_item();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(547);
				match(COMMA);
				setState(548);
				property_synthesize_item();
				}
				}
				setState(553);
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
	public static class Property_synthesize_itemContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjCParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(ObjCParser.ASSIGN, 0); }
		public Property_synthesize_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_item; }
	}

	public final Property_synthesize_itemContext property_synthesize_item() throws RecognitionException {
		Property_synthesize_itemContext _localctx = new Property_synthesize_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_property_synthesize_item);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(IDENTIFIER);
				setState(556);
				match(ASSIGN);
				setState(557);
				match(IDENTIFIER);
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
	public static class Block_typeContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode CARET() { return getToken(ObjCParser.CARET, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_type; }
	}

	public final Block_typeContext block_type() throws RecognitionException {
		Block_typeContext _localctx = new Block_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			type_specifier();
			setState(561);
			match(LPAREN);
			setState(562);
			match(CARET);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5918157966132903936L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846979L) != 0)) {
				{
				setState(563);
				type_specifier();
				}
			}

			setState(566);
			match(RPAREN);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(567);
				block_parameters();
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
	public static class Type_specifierContext extends ParserRuleContext {
		public System_typesContext system_types() {
			return getRuleContext(System_typesContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TerminalNode ID() { return getToken(ObjCParser.ID, 0); }
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_specifier);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				system_types();
				setState(571);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				system_types();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(574);
				match(ID);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(575);
					protocol_reference_list();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(578);
				class_name();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(579);
					protocol_reference_list();
					}
				}

				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				struct_or_union_specifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(583);
				enum_specifier();
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
	public static class System_typesContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ObjCParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(ObjCParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(ObjCParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ObjCParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ObjCParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ObjCParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ObjCParser.DOUBLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public System_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_types; }
	}

	public final System_typesContext system_types() throws RecognitionException {
		System_typesContext _localctx = new System_typesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_system_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4621116600525783040L) != 0) || _la==IDENTIFIER) ) {
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
	public static class Type_qualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ObjCParser.CONST, 0); }
		public TerminalNode VOLATILE() { return getToken(ObjCParser.VOLATILE, 0); }
		public TerminalNode SIGNED() { return getToken(ObjCParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(ObjCParser.UNSIGNED, 0); }
		public Protocol_qualifierContext protocol_qualifier() {
			return getRuleContext(Protocol_qualifierContext.class,0);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_qualifier);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(VOLATILE);
				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(SIGNED);
				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(UNSIGNED);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				protocol_qualifier();
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
	public static class Protocol_qualifierContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(ObjCParser.IN, 0); }
		public TerminalNode OUT() { return getToken(ObjCParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(ObjCParser.INOUT, 0); }
		public TerminalNode BYCOPY() { return getToken(ObjCParser.BYCOPY, 0); }
		public TerminalNode BYREF() { return getToken(ObjCParser.BYREF, 0); }
		public TerminalNode ONEWAY() { return getToken(ObjCParser.ONEWAY, 0); }
		public Protocol_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_qualifier; }
	}

	public final Protocol_qualifierContext protocol_qualifier() throws RecognitionException {
		Protocol_qualifierContext _localctx = new Protocol_qualifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_protocol_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1741627223703552L) != 0)) ) {
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
	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ObjCParser.STRING_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public TerminalNode SELF() { return getToken(ObjCParser.SELF, 0); }
		public TerminalNode SUPER() { return getToken(ObjCParser.SUPER, 0); }
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Protocol_expressionContext protocol_expression() {
			return getRuleContext(Protocol_expressionContext.class,0);
		}
		public Encode_expressionContext encode_expression() {
			return getRuleContext(Encode_expressionContext.class,0);
		}
		public Dictionary_expressionContext dictionary_expression() {
			return getRuleContext(Dictionary_expressionContext.class,0);
		}
		public Array_expressionContext array_expression() {
			return getRuleContext(Array_expressionContext.class,0);
		}
		public Box_expressionContext box_expression() {
			return getRuleContext(Box_expressionContext.class,0);
		}
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primary_expression);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(600);
				match(LPAREN);
				setState(601);
				expression();
				setState(602);
				match(RPAREN);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(604);
				match(SELF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(605);
				match(SUPER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(606);
				message_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(607);
				selector_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(608);
				protocol_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(609);
				encode_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(610);
				dictionary_expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(611);
				array_expression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(612);
				box_expression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(613);
				block_expression();
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
	public static class Dictionary_pairContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public Dictionary_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_pair; }
	}

	public final Dictionary_pairContext dictionary_pair() throws RecognitionException {
		Dictionary_pairContext _localctx = new Dictionary_pairContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dictionary_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			postfix_expression();
			setState(617);
			match(COLON);
			setState(618);
			postfix_expression();
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
	public static class Dictionary_expressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ObjCParser.AT, 0); }
		public TerminalNode LBRACE() { return getToken(ObjCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjCParser.RBRACE, 0); }
		public List<Dictionary_pairContext> dictionary_pair() {
			return getRuleContexts(Dictionary_pairContext.class);
		}
		public Dictionary_pairContext dictionary_pair(int i) {
			return getRuleContext(Dictionary_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Dictionary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_expression; }
	}

	public final Dictionary_expressionContext dictionary_expression() throws RecognitionException {
		Dictionary_expressionContext _localctx = new Dictionary_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dictionary_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(AT);
			setState(621);
			match(LBRACE);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12716064L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314447111816209L) != 0)) {
				{
				setState(622);
				dictionary_pair();
				}
			}

			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					match(COMMA);
					setState(626);
					dictionary_pair();
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(632);
				match(COMMA);
				}
			}

			setState(635);
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
	public static class Array_expressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ObjCParser.AT, 0); }
		public TerminalNode LBRACK() { return getToken(ObjCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjCParser.RBRACK, 0); }
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expression; }
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_array_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(AT);
			setState(638);
			match(LBRACK);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12716064L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314447111816209L) != 0)) {
				{
				setState(639);
				postfix_expression();
				}
			}

			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					match(COMMA);
					setState(643);
					postfix_expression();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(649);
				match(COMMA);
				}
			}

			setState(652);
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
	public static class Box_expressionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ObjCParser.AT, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Box_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_expression; }
	}

	public final Box_expressionContext box_expression() throws RecognitionException {
		Box_expressionContext _localctx = new Box_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_box_expression);
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(AT);
				setState(655);
				match(LPAREN);
				setState(656);
				postfix_expression();
				setState(657);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(AT);
				setState(660);
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
	public static class Block_parametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public List<Type_variable_declaratorContext> type_variable_declarator() {
			return getRuleContexts(Type_variable_declaratorContext.class);
		}
		public Type_variable_declaratorContext type_variable_declarator(int i) {
			return getRuleContext(Type_variable_declaratorContext.class,i);
		}
		public TerminalNode VOID() { return getToken(ObjCParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Block_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_parameters; }
	}

	public final Block_parametersContext block_parameters() throws RecognitionException {
		Block_parametersContext _localctx = new Block_parametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LPAREN);
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(664);
				type_variable_declarator();
				}
				break;
			case 2:
				{
				setState(665);
				match(VOID);
				}
				break;
			}
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(668);
				match(COMMA);
				setState(669);
				type_variable_declarator();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(RPAREN);
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
	public static class Block_expressionContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(ObjCParser.CARET, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_expression; }
	}

	public final Block_expressionContext block_expression() throws RecognitionException {
		Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_block_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(CARET);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5918157966132903936L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846979L) != 0)) {
				{
				setState(678);
				type_specifier();
				}
			}

			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(681);
				block_parameters();
				}
			}

			setState(684);
			compound_statement();
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
	public static class Message_expressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ObjCParser.LBRACK, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public Message_selectorContext message_selector() {
			return getRuleContext(Message_selectorContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ObjCParser.RBRACK, 0); }
		public Message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expression; }
	}

	public final Message_expressionContext message_expression() throws RecognitionException {
		Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_message_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LBRACK);
			setState(687);
			receiver();
			setState(688);
			message_selector();
			setState(689);
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
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(ObjCParser.SUPER, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_receiver);
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				class_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				match(SUPER);
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
	public static class Message_selectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<Keyword_argumentContext> keyword_argument() {
			return getRuleContexts(Keyword_argumentContext.class);
		}
		public Keyword_argumentContext keyword_argument(int i) {
			return getRuleContext(Keyword_argumentContext.class,i);
		}
		public Message_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_selector; }
	}

	public final Message_selectorContext message_selector() throws RecognitionException {
		Message_selectorContext _localctx = new Message_selectorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_message_selector);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(697);
					keyword_argument();
					}
					}
					setState(700); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
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
	public static class Keyword_argumentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_argument; }
	}

	public final Keyword_argumentContext keyword_argument() throws RecognitionException {
		Keyword_argumentContext _localctx = new Keyword_argumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_keyword_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(704);
				selector();
				}
			}

			setState(707);
			match(COLON);
			setState(708);
			expression();
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
	public static class Selector_expressionContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(ObjCParser.SELECTOR, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Selector_nameContext selector_name() {
			return getRuleContext(Selector_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(SELECTOR);
			setState(711);
			match(LPAREN);
			setState(712);
			selector_name();
			setState(713);
			match(RPAREN);
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
	public static class Selector_nameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(ObjCParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ObjCParser.COLON, i);
		}
		public Selector_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_name; }
	}

	public final Selector_nameContext selector_name() throws RecognitionException {
		Selector_nameContext _localctx = new Selector_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_selector_name);
		int _la;
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(716);
						selector();
						}
					}

					setState(719);
					match(COLON);
					}
					}
					setState(722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
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
	public static class Protocol_expressionContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(ObjCParser.PROTOCOL, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Protocol_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_expression; }
	}

	public final Protocol_expressionContext protocol_expression() throws RecognitionException {
		Protocol_expressionContext _localctx = new Protocol_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_protocol_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(PROTOCOL);
			setState(727);
			match(LPAREN);
			setState(728);
			protocol_name();
			setState(729);
			match(RPAREN);
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
	public static class Encode_expressionContext extends ParserRuleContext {
		public TerminalNode ENCODE() { return getToken(ObjCParser.ENCODE, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Encode_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode_expression; }
	}

	public final Encode_expressionContext encode_expression() throws RecognitionException {
		Encode_expressionContext _localctx = new Encode_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_encode_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(ENCODE);
			setState(732);
			match(LPAREN);
			setState(733);
			type_name();
			setState(734);
			match(RPAREN);
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
	public static class Type_variable_declaratorContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Type_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_variable_declarator; }
	}

	public final Type_variable_declaratorContext type_variable_declarator() throws RecognitionException {
		Type_variable_declaratorContext _localctx = new Type_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type_variable_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			declaration_specifiers();
			setState(737);
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
	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(ObjCParser.TRY, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(TRY);
			setState(740);
			compound_statement();
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
	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ObjCParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(CATCH);
			setState(743);
			match(LPAREN);
			setState(744);
			type_variable_declarator();
			setState(745);
			match(RPAREN);
			setState(746);
			compound_statement();
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
	public static class Finally_statementContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ObjCParser.FINALLY, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(FINALLY);
			setState(749);
			compound_statement();
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
	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ObjCParser.THROW, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(THROW);
			setState(752);
			match(LPAREN);
			setState(753);
			match(IDENTIFIER);
			setState(754);
			match(RPAREN);
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
	public static class Try_blockContext extends ParserRuleContext {
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public List<Catch_statementContext> catch_statement() {
			return getRuleContexts(Catch_statementContext.class);
		}
		public Catch_statementContext catch_statement(int i) {
			return getRuleContext(Catch_statementContext.class,i);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			try_statement();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(757);
				catch_statement();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(763);
				finally_statement();
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
	public static class Synchronized_statementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(ObjCParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Synchronized_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronized_statement; }
	}

	public final Synchronized_statementContext synchronized_statement() throws RecognitionException {
		Synchronized_statementContext _localctx = new Synchronized_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_synchronized_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(SYNCHRONIZED);
			setState(767);
			match(LPAREN);
			setState(768);
			primary_expression();
			setState(769);
			match(RPAREN);
			setState(770);
			compound_statement();
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
	public static class Autorelease_statementContext extends ParserRuleContext {
		public TerminalNode AUTORELEASEPOOL() { return getToken(ObjCParser.AUTORELEASEPOOL, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Autorelease_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autorelease_statement; }
	}

	public final Autorelease_statementContext autorelease_statement() throws RecognitionException {
		Autorelease_statementContext _localctx = new Autorelease_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_autorelease_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(AUTORELEASEPOOL);
			setState(773);
			compound_statement();
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
	public static class Function_definitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(775);
				declaration_specifiers();
				}
				break;
			}
			setState(778);
			declarator();
			setState(779);
			compound_statement();
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
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			declaration_specifiers();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 72057594306363393L) != 0)) {
				{
				setState(782);
				init_declarator_list();
				}
			}

			setState(785);
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
	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(791);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(787);
						arc_behaviour_specifier();
						}
						break;
					case AUTO:
					case EXTERN:
					case REGISTER:
					case STATIC:
					case TYPEDEF:
						{
						setState(788);
						storage_class_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INT:
					case LONG:
					case SHORT:
					case STRUCT:
					case UNION:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(789);
						type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case SIGNED:
					case UNSIGNED:
					case VOLATILE:
						{
						setState(790);
						type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(793); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
	public static class Arc_behaviour_specifierContext extends ParserRuleContext {
		public TerminalNode WUNSAFE_UNRETAINED() { return getToken(ObjCParser.WUNSAFE_UNRETAINED, 0); }
		public TerminalNode WWEAK() { return getToken(ObjCParser.WWEAK, 0); }
		public Arc_behaviour_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arc_behaviour_specifier; }
	}

	public final Arc_behaviour_specifierContext arc_behaviour_specifier() throws RecognitionException {
		Arc_behaviour_specifierContext _localctx = new Arc_behaviour_specifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arc_behaviour_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !(_la==WWEAK || _la==WUNSAFE_UNRETAINED) ) {
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
	public static class Storage_class_specifierContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(ObjCParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ObjCParser.REGISTER, 0); }
		public TerminalNode STATIC() { return getToken(ObjCParser.STATIC, 0); }
		public TerminalNode EXTERN() { return getToken(ObjCParser.EXTERN, 0); }
		public TerminalNode TYPEDEF() { return getToken(ObjCParser.TYPEDEF, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 650770695944404992L) != 0)) ) {
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
	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			init_declarator();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800);
				match(COMMA);
				setState(801);
				init_declarator();
				}
				}
				setState(806);
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
	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ObjCParser.ASSIGN, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			declarator();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(808);
				match(ASSIGN);
				setState(809);
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
	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(ObjCParser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(ObjCParser.UNION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ObjCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjCParser.RBRACE, 0); }
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_struct_or_union_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(813);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(814);
					match(IDENTIFIER);
					}
				}

				setState(817);
				match(LBRACE);
				setState(819); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(818);
					struct_declaration();
					}
					}
					setState(821); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -979615031480025088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0) );
				setState(823);
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
	public static class Struct_declarationContext extends ParserRuleContext {
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			specifier_qualifier_list();
			setState(828);
			struct_declarator_list();
			setState(829);
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
	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_specifier_qualifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(834);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(831);
						arc_behaviour_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INT:
					case LONG:
					case SHORT:
					case STRUCT:
					case UNION:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(832);
						type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case SIGNED:
					case UNSIGNED:
					case VOLATILE:
						{
						setState(833);
						type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(836); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			struct_declarator();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(839);
				match(COMMA);
				setState(840);
				struct_declarator();
				}
				}
				setState(845);
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
	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_struct_declarator);
		int _la;
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 72057594306363393L) != 0)) {
					{
					setState(847);
					declarator();
					}
				}

				setState(850);
				match(COLON);
				setState(851);
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
	public static class Enum_specifierContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ObjCParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ObjCParser.LBRACE, 0); }
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ObjCParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode NS_OPTIONS() { return getToken(ObjCParser.NS_OPTIONS, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(ObjCParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public TerminalNode NS_ENUM() { return getToken(ObjCParser.NS_ENUM, 0); }
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enum_specifier);
		int _la;
		try {
			setState(892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(ENUM);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(855);
					match(COLON);
					setState(856);
					type_name();
					}
				}

				setState(870);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(859);
					identifier();
					setState(864);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(860);
						match(LBRACE);
						setState(861);
						enumerator_list();
						setState(862);
						match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(866);
					match(LBRACE);
					setState(867);
					enumerator_list();
					setState(868);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_OPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(NS_OPTIONS);
				setState(873);
				match(LPAREN);
				setState(874);
				type_name();
				setState(875);
				match(COMMA);
				setState(876);
				identifier();
				setState(877);
				match(RPAREN);
				setState(878);
				match(LBRACE);
				setState(879);
				enumerator_list();
				setState(880);
				match(RBRACE);
				}
				break;
			case NS_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				match(NS_ENUM);
				setState(883);
				match(LPAREN);
				setState(884);
				type_name();
				setState(885);
				match(COMMA);
				setState(886);
				identifier();
				setState(887);
				match(RPAREN);
				setState(888);
				match(LBRACE);
				setState(889);
				enumerator_list();
				setState(890);
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
	public static class Enumerator_listContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enumerator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			enumerator();
			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					match(COMMA);
					setState(896);
					enumerator();
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(902);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ObjCParser.ASSIGN, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			identifier();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(906);
				match(ASSIGN);
				setState(907);
				constant_expression();
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
		public TerminalNode MUL() { return getToken(ObjCParser.MUL, 0); }
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
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
		enterRule(_localctx, 162, RULE_pointer);
		int _la;
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				match(MUL);
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(911);
					declaration_specifiers();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				match(MUL);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535620096L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0)) {
					{
					setState(915);
					declaration_specifiers();
					}
				}

				setState(918);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
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
		enterRule(_localctx, 164, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(921);
				pointer();
				}
			}

			setState(924);
			direct_declarator();
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
	public static class Direct_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Declarator_suffixContext> declarator_suffix() {
			return getRuleContexts(Declarator_suffixContext.class);
		}
		public Declarator_suffixContext declarator_suffix(int i) {
			return getRuleContext(Declarator_suffixContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public TerminalNode CARET() { return getToken(ObjCParser.CARET, 0); }
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_direct_declarator);
		int _la;
		try {
			int _alt;
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				identifier();
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(927);
						declarator_suffix();
						}
						} 
					}
					setState(932);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				match(LPAREN);
				setState(934);
				declarator();
				setState(935);
				match(RPAREN);
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						declarator_suffix();
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				match(LPAREN);
				setState(943);
				match(CARET);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(944);
					identifier();
					}
				}

				setState(947);
				match(RPAREN);
				setState(948);
				block_parameters();
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
	public static class Declarator_suffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ObjCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjCParser.RBRACK, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_declarator_suffix);
		int _la;
		try {
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				match(LBRACK);
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
					{
					setState(952);
					constant_expression();
					}
				}

				setState(955);
				match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(LPAREN);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535620096L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0)) {
					{
					setState(957);
					parameter_list();
					}
				}

				setState(960);
				match(RPAREN);
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
	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ObjCParser.COMMA, 0); }
		public TerminalNode ELIPSIS() { return getToken(ObjCParser.ELIPSIS, 0); }
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			parameter_declaration_list();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(964);
				match(COMMA);
				setState(965);
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
	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			declaration_specifiers();
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(969);
					declarator();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(972);
				abstract_declarator();
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
	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ObjCParser.LBRACE, 0); }
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ObjCParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_initializer);
		int _la;
		try {
			int _alt;
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case SIZEOF:
			case LPAREN:
			case LBRACK:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case SUB:
			case MUL:
			case BITAND:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				assignment_expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(LBRACE);
				setState(977);
				initializer();
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(978);
						match(COMMA);
						setState(979);
						initializer();
						}
						} 
					}
					setState(984);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(985);
					match(COMMA);
					}
				}

				setState(988);
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
	public static class Type_nameContext extends ParserRuleContext {
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Block_typeContext block_type() {
			return getRuleContext(Block_typeContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_type_name);
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				specifier_qualifier_list();
				setState(993);
				abstract_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				block_type();
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
	public static class Abstract_declaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjCParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjCParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjCParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjCParser.RBRACK, i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_abstract_declarator);
		int _la;
		try {
			int _alt;
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				pointer();
				setState(999);
				abstract_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(LPAREN);
				setState(1002);
				abstract_declarator();
				setState(1003);
				match(RPAREN);
				setState(1005); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1004);
						abstract_declarator_suffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1007); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1009);
					match(LBRACK);
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
						{
						setState(1010);
						constant_expression();
						}
					}

					setState(1013);
					match(RBRACK);
					}
					}
					setState(1016); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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
	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ObjCParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjCParser.RBRACK, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_abstract_declarator_suffix);
		int _la;
		try {
			setState(1031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				match(LBRACK);
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
					{
					setState(1022);
					constant_expression();
					}
				}

				setState(1025);
				match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				match(LPAREN);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -328844335535620096L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1152921504606846991L) != 0)) {
					{
					setState(1027);
					parameter_declaration_list();
					}
				}

				setState(1030);
				match(RPAREN);
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
	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
	}

	public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_parameter_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			parameter_declaration();
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1034);
					match(COMMA);
					setState(1035);
					parameter_declaration();
					}
					} 
				}
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1041);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1044); 
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
	public static class StatementContext extends ParserRuleContext {
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Synchronized_statementContext synchronized_statement() {
			return getRuleContext(Synchronized_statementContext.class,0);
		}
		public Autorelease_statementContext autorelease_statement() {
			return getRuleContext(Autorelease_statementContext.class,0);
		}
		public Try_blockContext try_block() {
			return getRuleContext(Try_blockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_statement);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				labeled_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				expression();
				setState(1048);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050);
				compound_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				selection_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1052);
				iteration_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1053);
				jump_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1054);
				synchronized_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1055);
				autorelease_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1056);
				try_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1057);
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
	public static class Labeled_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CASE() { return getToken(ObjCParser.CASE, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ObjCParser.DEFAULT, 0); }
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_labeled_statement);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				identifier();
				setState(1061);
				match(COLON);
				setState(1062);
				statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				match(CASE);
				setState(1065);
				constant_expression();
				setState(1066);
				match(COLON);
				setState(1067);
				statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				match(DEFAULT);
				setState(1070);
				match(COLON);
				setState(1071);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjCParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(LBRACE);
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -137524541406L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -2305842822917879105L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 15L) != 0)) {
				{
				setState(1077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1075);
					declaration();
					}
					break;
				case 2:
					{
					setState(1076);
					statement_list();
					}
					break;
				}
				}
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1082);
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
	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ObjCParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ObjCParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(ObjCParser.SWITCH, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_selection_statement);
		try {
			setState(1099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				match(IF);
				setState(1085);
				match(LPAREN);
				setState(1086);
				expression();
				setState(1087);
				match(RPAREN);
				setState(1088);
				statement();
				setState(1091);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1089);
					match(ELSE);
					setState(1090);
					statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				match(SWITCH);
				setState(1094);
				match(LPAREN);
				setState(1095);
				expression();
				setState(1096);
				match(RPAREN);
				setState(1097);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_in_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ObjCParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public TerminalNode IN() { return getToken(ObjCParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(FOR);
			setState(1102);
			match(LPAREN);
			setState(1103);
			type_variable_declarator();
			setState(1104);
			match(IN);
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
				{
				setState(1105);
				expression();
				}
			}

			setState(1108);
			match(RPAREN);
			setState(1109);
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
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ObjCParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ObjCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ObjCParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(FOR);
			setState(1112);
			match(LPAREN);
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				{
				setState(1113);
				declaration_specifiers();
				setState(1114);
				init_declarator_list();
				}
				}
				break;
			case 2:
				{
				setState(1116);
				expression();
				}
				break;
			}
			setState(1119);
			match(SEMI);
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
				{
				setState(1120);
				expression();
				}
			}

			setState(1123);
			match(SEMI);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
				{
				setState(1124);
				expression();
				}
			}

			setState(1127);
			match(RPAREN);
			setState(1128);
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ObjCParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(WHILE);
			setState(1131);
			match(LPAREN);
			setState(1132);
			expression();
			setState(1133);
			match(RPAREN);
			setState(1134);
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
	public static class Do_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ObjCParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ObjCParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(DO);
			setState(1137);
			statement();
			setState(1138);
			match(WHILE);
			setState(1139);
			match(LPAREN);
			setState(1140);
			expression();
			setState(1141);
			match(RPAREN);
			setState(1142);
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
	public static class Iteration_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_iteration_statement);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				while_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				do_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				for_in_statement();
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
	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(ObjCParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjCParser.SEMI, 0); }
		public TerminalNode CONTINUE() { return getToken(ObjCParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(ObjCParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(ObjCParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_jump_statement);
		int _la;
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				match(GOTO);
				setState(1151);
				identifier();
				setState(1152);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				match(CONTINUE);
				setState(1155);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
				match(BREAK);
				setState(1157);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1158);
				match(RETURN);
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
					{
					setState(1159);
					expression();
					}
				}

				setState(1162);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			assignment_expression();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1166);
				match(COMMA);
				setState(1167);
				assignment_expression();
				}
				}
				setState(1172);
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
	public static class Assignment_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assignment_expression);
		try {
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				conditional_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				unary_expression();
				setState(1175);
				assignment_operator();
				setState(1176);
				assignment_expression();
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
	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ObjCParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ObjCParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ObjCParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ObjCParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ObjCParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ObjCParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ObjCParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ObjCParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ObjCParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ObjCParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ObjCParser.OR_ASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 34326183937L) != 0)) ) {
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
	public static class Conditional_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ObjCParser.QUESTION, 0); }
		public List<Conditional_expressionContext> conditional_expression() {
			return getRuleContexts(Conditional_expressionContext.class);
		}
		public Conditional_expressionContext conditional_expression(int i) {
			return getRuleContext(Conditional_expressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ObjCParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			logical_or_expression();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1183);
				match(QUESTION);
				setState(1184);
				conditional_expression();
				setState(1185);
				match(COLON);
				setState(1186);
				conditional_expression();
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
	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			conditional_expression();
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
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ObjCParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ObjCParser.OR, i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			logical_and_expression();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1193);
				match(OR);
				setState(1194);
				logical_and_expression();
				}
				}
				setState(1199);
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
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ObjCParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ObjCParser.AND, i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			inclusive_or_expression();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1201);
				match(AND);
				setState(1202);
				inclusive_or_expression();
				}
				}
				setState(1207);
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
	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ObjCParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ObjCParser.BITOR, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			exclusive_or_expression();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1209);
				match(BITOR);
				setState(1210);
				exclusive_or_expression();
				}
				}
				setState(1215);
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
	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(ObjCParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(ObjCParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			and_expression();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1217);
				match(CARET);
				setState(1218);
				and_expression();
				}
				}
				setState(1223);
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
	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ObjCParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ObjCParser.BITAND, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			equality_expression();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1225);
				match(BITAND);
				setState(1226);
				equality_expression();
				}
				}
				setState(1231);
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(ObjCParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(ObjCParser.NOTEQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ObjCParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ObjCParser.EQUAL, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			relational_expression();
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1233);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1234);
				relational_expression();
				}
				}
				setState(1239);
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ObjCParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ObjCParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ObjCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ObjCParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(ObjCParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(ObjCParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(ObjCParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(ObjCParser.GE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			shift_expression();
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 387L) != 0)) {
				{
				{
				setState(1241);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 387L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1242);
				shift_expression();
				}
				}
				setState(1247);
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
	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> SHIFT_L() { return getTokens(ObjCParser.SHIFT_L); }
		public TerminalNode SHIFT_L(int i) {
			return getToken(ObjCParser.SHIFT_L, i);
		}
		public List<TerminalNode> SHIFT_R() { return getTokens(ObjCParser.SHIFT_R); }
		public TerminalNode SHIFT_R(int i) {
			return getToken(ObjCParser.SHIFT_R, i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			additive_expression();
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHIFT_R || _la==SHIFT_L) {
				{
				{
				setState(1249);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_R || _la==SHIFT_L) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1250);
				additive_expression();
				}
				}
				setState(1255);
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
	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ObjCParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ObjCParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ObjCParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ObjCParser.SUB, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			multiplicative_expression();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1257);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1258);
				multiplicative_expression();
				}
				}
				setState(1263);
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
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ObjCParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ObjCParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ObjCParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ObjCParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ObjCParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ObjCParser.MOD, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			cast_expression();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 35L) != 0)) {
				{
				{
				setState(1265);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1266);
				cast_expression();
				}
				}
				setState(1271);
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
	public static class Cast_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cast_expression);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				match(LPAREN);
				setState(1273);
				type_name();
				setState(1274);
				match(RPAREN);
				setState(1275);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				unary_expression();
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
	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(ObjCParser.INC, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(ObjCParser.DEC, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public TerminalNode SIZEOF() { return getToken(ObjCParser.SIZEOF, 0); }
		public TerminalNode LPAREN() { return getToken(ObjCParser.LPAREN, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjCParser.RPAREN, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unary_expression);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case LPAREN:
			case LBRACK:
			case AT:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				postfix_expression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				match(INC);
				setState(1282);
				unary_expression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1283);
				match(DEC);
				setState(1284);
				unary_expression();
				}
				break;
			case BANG:
			case TILDE:
			case SUB:
			case MUL:
			case BITAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(1285);
				unary_operator();
				setState(1286);
				cast_expression();
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(1288);
				match(SIZEOF);
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1289);
					match(LPAREN);
					setState(1290);
					type_name();
					setState(1291);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(1293);
					unary_expression();
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
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(ObjCParser.BITAND, 0); }
		public TerminalNode MUL() { return getToken(ObjCParser.MUL, 0); }
		public TerminalNode SUB() { return getToken(ObjCParser.SUB, 0); }
		public TerminalNode TILDE() { return getToken(ObjCParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(ObjCParser.BANG, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 90115L) != 0)) ) {
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
	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjCParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjCParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjCParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjCParser.RBRACK, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ObjCParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ObjCParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ObjCParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ObjCParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ObjCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ObjCParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRUCTACCESS() { return getTokens(ObjCParser.STRUCTACCESS); }
		public TerminalNode STRUCTACCESS(int i) {
			return getToken(ObjCParser.STRUCTACCESS, i);
		}
		public List<TerminalNode> INC() { return getTokens(ObjCParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(ObjCParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(ObjCParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(ObjCParser.DEC, i);
		}
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			primary_expression();
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 50332433L) != 0)) {
				{
				setState(1316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1301);
					match(LBRACK);
					setState(1302);
					expression();
					setState(1303);
					match(RBRACK);
					}
					break;
				case LPAREN:
					{
					setState(1305);
					match(LPAREN);
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797031680032L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9151314448638592017L) != 0)) {
						{
						setState(1306);
						argument_expression_list();
						}
					}

					setState(1309);
					match(RPAREN);
					}
					break;
				case DOT:
					{
					setState(1310);
					match(DOT);
					setState(1311);
					identifier();
					}
					break;
				case STRUCTACCESS:
					{
					setState(1312);
					match(STRUCTACCESS);
					setState(1313);
					identifier();
					}
					break;
				case INC:
					{
					setState(1314);
					match(INC);
					}
					break;
				case DEC:
					{
					setState(1315);
					match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1320);
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
	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjCParser.COMMA, i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			assignment_expression();
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1322);
				match(COMMA);
				setState(1323);
				assignment_expression();
				}
				}
				setState(1328);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(IDENTIFIER);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ObjCParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjCParser.OCTAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjCParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 61L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u008f\u0536\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"|\u0001\u0000\u0004\u0000\u00fc\b\u0000\u000b\u0000\f\u0000\u00fd\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u010e\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0116\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0119\b\u0003\u0001\u0003\u0003\u0003\u011c\b\u0003"+
		"\u0001\u0003\u0003\u0003\u011f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0127\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u012b\b\u0004\u0001\u0004\u0003\u0004\u012e\b"+
		"\u0004\u0001\u0004\u0003\u0004\u0131\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0139\b\u0005\u0001"+
		"\u0005\u0003\u0005\u013c\b\u0005\u0001\u0005\u0003\u0005\u013f\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0149\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0150\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0153\b\u0007\u0001\u0007\u0003\u0007\u0156\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0159\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0168\b\n\n\n\f\n\u016b\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0174\b\f\n\f\f\f\u0177\t"+
		"\f\u0001\r\u0001\r\u0003\r\u017b\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0186\b\u000f\n\u000f\f\u000f\u0189\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u019b\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01a7\b\u0015\n\u0015\f\u0015\u01aa"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u01b0"+
		"\b\u0015\u000b\u0015\f\u0015\u01b1\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u01b8\b\u0015\u000b\u0015\f\u0015\u01b9\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u01c2\b\u0015\u000b\u0015\f\u0015\u01c3\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01c9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u01d1\b\u0017\u000b\u0017"+
		"\f\u0017\u01d2\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0003\u001a\u01dc\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0004\u001b\u01e6\b\u001b\u000b\u001b\f\u001b\u01e7\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003"+
		"\u001e\u01f1\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01f5\b\u001e"+
		"\u0001\u001e\u0003\u001e\u01f8\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0004\u001f\u01fe\b\u001f\u000b\u001f\f\u001f\u01ff\u0001"+
		"\u001f\u0003\u001f\u0203\b\u001f\u0003\u001f\u0205\b\u001f\u0001 \u0003"+
		" \u0208\b \u0001 \u0001 \u0005 \u020c\b \n \f \u020f\t \u0001 \u0001 "+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u0221\b#\u0001$\u0001$\u0001$\u0005"+
		"$\u0226\b$\n$\f$\u0229\t$\u0001%\u0001%\u0001%\u0001%\u0003%\u022f\b%"+
		"\u0001&\u0001&\u0001&\u0001&\u0003&\u0235\b&\u0001&\u0001&\u0003&\u0239"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0241\b\'"+
		"\u0001\'\u0001\'\u0003\'\u0245\b\'\u0001\'\u0001\'\u0003\'\u0249\b\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0252\b)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0267\b+\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u0270\b-\u0001-\u0001"+
		"-\u0005-\u0274\b-\n-\f-\u0277\t-\u0001-\u0003-\u027a\b-\u0001-\u0001-"+
		"\u0001.\u0001.\u0001.\u0003.\u0281\b.\u0001.\u0001.\u0005.\u0285\b.\n"+
		".\f.\u0288\t.\u0001.\u0003.\u028b\b.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0296\b/\u00010\u00010\u00010\u0003"+
		"0\u029b\b0\u00010\u00010\u00050\u029f\b0\n0\f0\u02a2\t0\u00010\u00010"+
		"\u00011\u00011\u00031\u02a8\b1\u00011\u00031\u02ab\b1\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00033\u02b7\b3\u0001"+
		"4\u00014\u00044\u02bb\b4\u000b4\f4\u02bc\u00034\u02bf\b4\u00015\u0003"+
		"5\u02c2\b5\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00037\u02ce\b7\u00017\u00047\u02d1\b7\u000b7\f7\u02d2\u0003"+
		"7\u02d5\b7\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001?\u0001?\u0005?\u02f7\b?\n?\f?\u02fa\t?\u0001?\u0003?\u02fd"+
		"\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001"+
		"B\u0003B\u0309\bB\u0001B\u0001B\u0001B\u0001C\u0001C\u0003C\u0310\bC\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001D\u0004D\u0318\bD\u000bD\fD\u0319\u0001"+
		"E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0005G\u0323\bG\nG\fG\u0326"+
		"\tG\u0001H\u0001H\u0001H\u0003H\u032b\bH\u0001I\u0001I\u0001I\u0003I\u0330"+
		"\bI\u0001I\u0001I\u0004I\u0334\bI\u000bI\fI\u0335\u0001I\u0001I\u0003"+
		"I\u033a\bI\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0004K\u0343"+
		"\bK\u000bK\fK\u0344\u0001L\u0001L\u0001L\u0005L\u034a\bL\nL\fL\u034d\t"+
		"L\u0001M\u0001M\u0003M\u0351\bM\u0001M\u0001M\u0003M\u0355\bM\u0001N\u0001"+
		"N\u0001N\u0003N\u035a\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u0361"+
		"\bN\u0001N\u0001N\u0001N\u0001N\u0003N\u0367\bN\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u037d\bN\u0001O\u0001"+
		"O\u0001O\u0005O\u0382\bO\nO\fO\u0385\tO\u0001O\u0003O\u0388\bO\u0001P"+
		"\u0001P\u0001P\u0003P\u038d\bP\u0001Q\u0001Q\u0003Q\u0391\bQ\u0001Q\u0001"+
		"Q\u0003Q\u0395\bQ\u0001Q\u0003Q\u0398\bQ\u0001R\u0003R\u039b\bR\u0001"+
		"R\u0001R\u0001S\u0001S\u0005S\u03a1\bS\nS\fS\u03a4\tS\u0001S\u0001S\u0001"+
		"S\u0001S\u0005S\u03aa\bS\nS\fS\u03ad\tS\u0001S\u0001S\u0001S\u0003S\u03b2"+
		"\bS\u0001S\u0001S\u0003S\u03b6\bS\u0001T\u0001T\u0003T\u03ba\bT\u0001"+
		"T\u0001T\u0001T\u0003T\u03bf\bT\u0001T\u0003T\u03c2\bT\u0001U\u0001U\u0001"+
		"U\u0003U\u03c7\bU\u0001V\u0001V\u0003V\u03cb\bV\u0001V\u0003V\u03ce\b"+
		"V\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u03d5\bW\nW\fW\u03d8\tW\u0001"+
		"W\u0003W\u03db\bW\u0001W\u0001W\u0003W\u03df\bW\u0001X\u0001X\u0001X\u0001"+
		"X\u0003X\u03e5\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0004"+
		"Y\u03ee\bY\u000bY\fY\u03ef\u0001Y\u0001Y\u0003Y\u03f4\bY\u0001Y\u0004"+
		"Y\u03f7\bY\u000bY\fY\u03f8\u0001Y\u0003Y\u03fc\bY\u0001Z\u0001Z\u0003"+
		"Z\u0400\bZ\u0001Z\u0001Z\u0001Z\u0003Z\u0405\bZ\u0001Z\u0003Z\u0408\b"+
		"Z\u0001[\u0001[\u0001[\u0005[\u040d\b[\n[\f[\u0410\t[\u0001\\\u0004\\"+
		"\u0413\b\\\u000b\\\f\\\u0414\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u0423\b]\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u0431\b^\u0001_\u0001_\u0001_\u0005_\u0436\b_\n_\f_\u0439\t_"+
		"\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003"+
		"`\u0444\b`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u044c\b`\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0003a\u0453\ba\u0001a\u0001a\u0001a\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u045e\bb\u0001b\u0001b\u0003"+
		"b\u0462\bb\u0001b\u0001b\u0003b\u0466\bb\u0001b\u0001b\u0001b\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0003e\u047d\be\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u0489"+
		"\bf\u0001f\u0003f\u048c\bf\u0001g\u0001g\u0001g\u0005g\u0491\bg\ng\fg"+
		"\u0494\tg\u0001h\u0001h\u0001h\u0001h\u0001h\u0003h\u049b\bh\u0001i\u0001"+
		"i\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0003j\u04a5\bj\u0001k\u0001"+
		"k\u0001l\u0001l\u0001l\u0005l\u04ac\bl\nl\fl\u04af\tl\u0001m\u0001m\u0001"+
		"m\u0005m\u04b4\bm\nm\fm\u04b7\tm\u0001n\u0001n\u0001n\u0005n\u04bc\bn"+
		"\nn\fn\u04bf\tn\u0001o\u0001o\u0001o\u0005o\u04c4\bo\no\fo\u04c7\to\u0001"+
		"p\u0001p\u0001p\u0005p\u04cc\bp\np\fp\u04cf\tp\u0001q\u0001q\u0001q\u0005"+
		"q\u04d4\bq\nq\fq\u04d7\tq\u0001r\u0001r\u0001r\u0005r\u04dc\br\nr\fr\u04df"+
		"\tr\u0001s\u0001s\u0001s\u0005s\u04e4\bs\ns\fs\u04e7\ts\u0001t\u0001t"+
		"\u0001t\u0005t\u04ec\bt\nt\ft\u04ef\tt\u0001u\u0001u\u0001u\u0005u\u04f4"+
		"\bu\nu\fu\u04f7\tu\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0003v\u04ff"+
		"\bv\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0003w\u050f\bw\u0003w\u0511\bw\u0001x\u0001"+
		"x\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u051c\by\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0005y\u0525\by\ny\fy\u0528"+
		"\ty\u0001z\u0001z\u0001z\u0005z\u052d\bz\nz\fz\u0530\tz\u0001{\u0001{"+
		"\u0001|\u0001|\u0001|\u0000\u0000}\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u0000\u000f\u0001\u0000\u0084\u0085"+
		"\u0003\u0000\n\n\r\r\u000f\u0010\u0007\u0000\u001f\u001f$$((/055>>}}\u0003"+
		"\u0000\u001c\u001d,-12\u0001\u0000CD\u0005\u0000\u0019\u0019\'\'3388;"+
		";\u0002\u000099<<\u0002\u0000PPir\u0002\u0000WWZZ\u0002\u0000QRXY\u0001"+
		"\u0000gh\u0001\u0000_`\u0002\u0000abff\u0003\u0000ST`acc\u0002\u0000~"+
		"~\u0080\u0083\u059b\u0000\u00fb\u0001\u0000\u0000\u0000\u0002\u010d\u0001"+
		"\u0000\u0000\u0000\u0004\u010f\u0001\u0000\u0000\u0000\u0006\u0111\u0001"+
		"\u0000\u0000\u0000\b\u0122\u0001\u0000\u0000\u0000\n\u0134\u0001\u0000"+
		"\u0000\u0000\f\u0142\u0001\u0000\u0000\u0000\u000e\u014c\u0001\u0000\u0000"+
		"\u0000\u0010\u015c\u0001\u0000\u0000\u0000\u0012\u0160\u0001\u0000\u0000"+
		"\u0000\u0014\u0164\u0001\u0000\u0000\u0000\u0016\u016c\u0001\u0000\u0000"+
		"\u0000\u0018\u0170\u0001\u0000\u0000\u0000\u001a\u0178\u0001\u0000\u0000"+
		"\u0000\u001c\u017e\u0001\u0000\u0000\u0000\u001e\u0182\u0001\u0000\u0000"+
		"\u0000 \u019a\u0001\u0000\u0000\u0000\"\u019c\u0001\u0000\u0000\u0000"+
		"$\u019e\u0001\u0000\u0000\u0000&\u01a0\u0001\u0000\u0000\u0000(\u01a2"+
		"\u0001\u0000\u0000\u0000*\u01c8\u0001\u0000\u0000\u0000,\u01ca\u0001\u0000"+
		"\u0000\u0000.\u01d0\u0001\u0000\u0000\u00000\u01d4\u0001\u0000\u0000\u0000"+
		"2\u01d7\u0001\u0000\u0000\u00004\u01db\u0001\u0000\u0000\u00006\u01e5"+
		"\u0001\u0000\u0000\u00008\u01e9\u0001\u0000\u0000\u0000:\u01ec\u0001\u0000"+
		"\u0000\u0000<\u01f0\u0001\u0000\u0000\u0000>\u0204\u0001\u0000\u0000\u0000"+
		"@\u0207\u0001\u0000\u0000\u0000B\u0212\u0001\u0000\u0000\u0000D\u0214"+
		"\u0001\u0000\u0000\u0000F\u0220\u0001\u0000\u0000\u0000H\u0222\u0001\u0000"+
		"\u0000\u0000J\u022e\u0001\u0000\u0000\u0000L\u0230\u0001\u0000\u0000\u0000"+
		"N\u0248\u0001\u0000\u0000\u0000P\u024a\u0001\u0000\u0000\u0000R\u0251"+
		"\u0001\u0000\u0000\u0000T\u0253\u0001\u0000\u0000\u0000V\u0266\u0001\u0000"+
		"\u0000\u0000X\u0268\u0001\u0000\u0000\u0000Z\u026c\u0001\u0000\u0000\u0000"+
		"\\\u027d\u0001\u0000\u0000\u0000^\u0295\u0001\u0000\u0000\u0000`\u0297"+
		"\u0001\u0000\u0000\u0000b\u02a5\u0001\u0000\u0000\u0000d\u02ae\u0001\u0000"+
		"\u0000\u0000f\u02b6\u0001\u0000\u0000\u0000h\u02be\u0001\u0000\u0000\u0000"+
		"j\u02c1\u0001\u0000\u0000\u0000l\u02c6\u0001\u0000\u0000\u0000n\u02d4"+
		"\u0001\u0000\u0000\u0000p\u02d6\u0001\u0000\u0000\u0000r\u02db\u0001\u0000"+
		"\u0000\u0000t\u02e0\u0001\u0000\u0000\u0000v\u02e3\u0001\u0000\u0000\u0000"+
		"x\u02e6\u0001\u0000\u0000\u0000z\u02ec\u0001\u0000\u0000\u0000|\u02ef"+
		"\u0001\u0000\u0000\u0000~\u02f4\u0001\u0000\u0000\u0000\u0080\u02fe\u0001"+
		"\u0000\u0000\u0000\u0082\u0304\u0001\u0000\u0000\u0000\u0084\u0308\u0001"+
		"\u0000\u0000\u0000\u0086\u030d\u0001\u0000\u0000\u0000\u0088\u0317\u0001"+
		"\u0000\u0000\u0000\u008a\u031b\u0001\u0000\u0000\u0000\u008c\u031d\u0001"+
		"\u0000\u0000\u0000\u008e\u031f\u0001\u0000\u0000\u0000\u0090\u0327\u0001"+
		"\u0000\u0000\u0000\u0092\u032c\u0001\u0000\u0000\u0000\u0094\u033b\u0001"+
		"\u0000\u0000\u0000\u0096\u0342\u0001\u0000\u0000\u0000\u0098\u0346\u0001"+
		"\u0000\u0000\u0000\u009a\u0354\u0001\u0000\u0000\u0000\u009c\u037c\u0001"+
		"\u0000\u0000\u0000\u009e\u037e\u0001\u0000\u0000\u0000\u00a0\u0389\u0001"+
		"\u0000\u0000\u0000\u00a2\u0397\u0001\u0000\u0000\u0000\u00a4\u039a\u0001"+
		"\u0000\u0000\u0000\u00a6\u03b5\u0001\u0000\u0000\u0000\u00a8\u03c1\u0001"+
		"\u0000\u0000\u0000\u00aa\u03c3\u0001\u0000\u0000\u0000\u00ac\u03c8\u0001"+
		"\u0000\u0000\u0000\u00ae\u03de\u0001\u0000\u0000\u0000\u00b0\u03e4\u0001"+
		"\u0000\u0000\u0000\u00b2\u03fb\u0001\u0000\u0000\u0000\u00b4\u0407\u0001"+
		"\u0000\u0000\u0000\u00b6\u0409\u0001\u0000\u0000\u0000\u00b8\u0412\u0001"+
		"\u0000\u0000\u0000\u00ba\u0422\u0001\u0000\u0000\u0000\u00bc\u0430\u0001"+
		"\u0000\u0000\u0000\u00be\u0432\u0001\u0000\u0000\u0000\u00c0\u044b\u0001"+
		"\u0000\u0000\u0000\u00c2\u044d\u0001\u0000\u0000\u0000\u00c4\u0457\u0001"+
		"\u0000\u0000\u0000\u00c6\u046a\u0001\u0000\u0000\u0000\u00c8\u0470\u0001"+
		"\u0000\u0000\u0000\u00ca\u047c\u0001\u0000\u0000\u0000\u00cc\u048b\u0001"+
		"\u0000\u0000\u0000\u00ce\u048d\u0001\u0000\u0000\u0000\u00d0\u049a\u0001"+
		"\u0000\u0000\u0000\u00d2\u049c\u0001\u0000\u0000\u0000\u00d4\u049e\u0001"+
		"\u0000\u0000\u0000\u00d6\u04a6\u0001\u0000\u0000\u0000\u00d8\u04a8\u0001"+
		"\u0000\u0000\u0000\u00da\u04b0\u0001\u0000\u0000\u0000\u00dc\u04b8\u0001"+
		"\u0000\u0000\u0000\u00de\u04c0\u0001\u0000\u0000\u0000\u00e0\u04c8\u0001"+
		"\u0000\u0000\u0000\u00e2\u04d0\u0001\u0000\u0000\u0000\u00e4\u04d8\u0001"+
		"\u0000\u0000\u0000\u00e6\u04e0\u0001\u0000\u0000\u0000\u00e8\u04e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u04f0\u0001\u0000\u0000\u0000\u00ec\u04fe\u0001"+
		"\u0000\u0000\u0000\u00ee\u0510\u0001\u0000\u0000\u0000\u00f0\u0512\u0001"+
		"\u0000\u0000\u0000\u00f2\u0514\u0001\u0000\u0000\u0000\u00f4\u0529\u0001"+
		"\u0000\u0000\u0000\u00f6\u0531\u0001\u0000\u0000\u0000\u00f8\u0533\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0003\u0002\u0001\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0000\u0000\u0001\u0100\u0001\u0001"+
		"\u0000\u0000\u0000\u0101\u010e\u0005\u0088\u0000\u0000\u0102\u010e\u0005"+
		"\u0089\u0000\u0000\u0103\u010e\u0003\u0004\u0002\u0000\u0104\u010e\u0003"+
		"\u0084B\u0000\u0105\u010e\u0003\u0086C\u0000\u0106\u010e\u0003\u0006\u0003"+
		"\u0000\u0107\u010e\u0003\n\u0005\u0000\u0108\u010e\u0003\b\u0004\u0000"+
		"\u0109\u010e\u0003\f\u0006\u0000\u010a\u010e\u0003\u000e\u0007\u0000\u010b"+
		"\u010e\u0003\u0010\b\u0000\u010c\u010e\u0003\u0012\t\u0000\u010d\u0101"+
		"\u0001\u0000\u0000\u0000\u010d\u0102\u0001\u0000\u0000\u0000\u010d\u0103"+
		"\u0001\u0000\u0000\u0000\u010d\u0104\u0001\u0000\u0000\u0000\u010d\u0105"+
		"\u0001\u0000\u0000\u0000\u010d\u0106\u0001\u0000\u0000\u0000\u010d\u0107"+
		"\u0001\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010d\u0109"+
		"\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0003"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0007\u0000\u0000\u0000\u0110\u0005"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\t\u0000\u0000\u0112\u0115\u0003"+
		"\"\u0011\u0000\u0113\u0114\u0005V\u0000\u0000\u0114\u0116\u0003$\u0012"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0119\u0003\u0016\u000b"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c\u0003*\u0015\u0000"+
		"\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f\u0003.\u0017\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0006\u0000\u0000\u0121"+
		"\u0007\u0001\u0000\u0000\u0000\u0122\u0123\u0005\t\u0000\u0000\u0123\u0124"+
		"\u0003\"\u0011\u0000\u0124\u0126\u0005E\u0000\u0000\u0125\u0127\u0003"+
		"&\u0013\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0005F\u0000"+
		"\u0000\u0129\u012b\u0003\u0016\u000b\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000"+
		"\u0000\u012c\u012e\u0003*\u0015\u0000\u012d\u012c\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0003.\u0017\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005\u0006\u0000\u0000\u0133\t\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005\b\u0000\u0000\u0135\u0138\u0003\"\u0011\u0000\u0136\u0137\u0005"+
		"V\u0000\u0000\u0137\u0139\u0003$\u0012\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u013c\u0003*\u0015\u0000\u013b\u013a\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000"+
		"\u013d\u013f\u00036\u001b\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005\u0006\u0000\u0000\u0141\u000b\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0005\b\u0000\u0000\u0143\u0144\u0003\"\u0011\u0000\u0144\u0145"+
		"\u0005E\u0000\u0000\u0145\u0146\u0003&\u0013\u0000\u0146\u0148\u0005F"+
		"\u0000\u0000\u0147\u0149\u00036\u001b\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005\u0006\u0000\u0000\u014b\r\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005\u000b\u0000\u0000\u014d\u014f\u0003(\u0014\u0000\u014e"+
		"\u0150\u0003\u0016\u000b\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151"+
		"\u0153\u0003.\u0017\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0156"+
		"\u0005\f\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001"+
		"\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0159\u0003"+
		".\u0017\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0006"+
		"\u0000\u0000\u015b\u000f\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u000b"+
		"\u0000\u0000\u015d\u015e\u0003\u0018\f\u0000\u015e\u015f\u0005K\u0000"+
		"\u0000\u015f\u0011\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0003\u0000"+
		"\u0000\u0161\u0162\u0003\u0014\n\u0000\u0162\u0163\u0005K\u0000\u0000"+
		"\u0163\u0013\u0001\u0000\u0000\u0000\u0164\u0169\u0003\"\u0011\u0000\u0165"+
		"\u0166\u0005L\u0000\u0000\u0166\u0168\u0003\"\u0011\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0015"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0005R\u0000\u0000\u016d\u016e\u0003\u0018\f\u0000\u016e\u016f\u0005"+
		"Q\u0000\u0000\u016f\u0017\u0001\u0000\u0000\u0000\u0170\u0175\u0003(\u0014"+
		"\u0000\u0171\u0172\u0005L\u0000\u0000\u0172\u0174\u0003(\u0014\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0019\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178"+
		"\u017a\u0005\u000e\u0000\u0000\u0179\u017b\u0003\u001c\u000e\u0000\u017a"+
		"\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0003\u0094J\u0000\u017d\u001b"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0005E\u0000\u0000\u017f\u0180\u0003"+
		"\u001e\u000f\u0000\u0180\u0181\u0005F\u0000\u0000\u0181\u001d\u0001\u0000"+
		"\u0000\u0000\u0182\u0187\u0003 \u0010\u0000\u0183\u0184\u0005L\u0000\u0000"+
		"\u0184\u0186\u0003 \u0010\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186"+
		"\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188\u001f\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u018a\u019b\u0005v\u0000\u0000\u018b\u019b"+
		"\u0005t\u0000\u0000\u018c\u019b\u0005|\u0000\u0000\u018d\u019b\u0005x"+
		"\u0000\u0000\u018e\u019b\u0005y\u0000\u0000\u018f\u019b\u0005z\u0000\u0000"+
		"\u0190\u019b\u0005{\u0000\u0000\u0191\u019b\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0005u\u0000\u0000\u0193\u0194\u0005P\u0000\u0000\u0194\u019b\u0005"+
		"}\u0000\u0000\u0195\u0196\u0005w\u0000\u0000\u0196\u0197\u0005P\u0000"+
		"\u0000\u0197\u0198\u0005}\u0000\u0000\u0198\u019b\u0005V\u0000\u0000\u0199"+
		"\u019b\u0005}\u0000\u0000\u019a\u018a\u0001\u0000\u0000\u0000\u019a\u018b"+
		"\u0001\u0000\u0000\u0000\u019a\u018c\u0001\u0000\u0000\u0000\u019a\u018d"+
		"\u0001\u0000\u0000\u0000\u019a\u018e\u0001\u0000\u0000\u0000\u019a\u018f"+
		"\u0001\u0000\u0000\u0000\u019a\u0190\u0001\u0000\u0000\u0000\u019a\u0191"+
		"\u0001\u0000\u0000\u0000\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u0195"+
		"\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b!\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0005}\u0000\u0000\u019d#\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0005}\u0000\u0000\u019f%\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005}\u0000\u0000\u01a1\'\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005}\u0000\u0000\u01a3)\u0001\u0000\u0000\u0000\u01a4\u01a8\u0005G"+
		"\u0000\u0000\u01a5\u01a7\u0003\u0094J\u0000\u01a6\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01c9\u0005H\u0000\u0000"+
		"\u01ac\u01ad\u0005G\u0000\u0000\u01ad\u01af\u0003,\u0016\u0000\u01ae\u01b0"+
		"\u0003\u0094J\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"H\u0000\u0000\u01b4\u01c9\u0001\u0000\u0000\u0000\u01b5\u01b7\u0005G\u0000"+
		"\u0000\u01b6\u01b8\u0003\u0094J\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0003*\u0015\u0000\u01bc\u01bd\u0005H\u0000\u0000\u01bd\u01c9"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0005G\u0000\u0000\u01bf\u01c1\u0003"+
		",\u0016\u0000\u01c0\u01c2\u0003\u0094J\u0000\u01c1\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0003*\u0015\u0000\u01c6\u01c7\u0005H\u0000\u0000\u01c7"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c8\u01a4\u0001\u0000\u0000\u0000\u01c8"+
		"\u01ac\u0001\u0000\u0000\u0000\u01c8\u01b5\u0001\u0000\u0000\u0000\u01c8"+
		"\u01be\u0001\u0000\u0000\u0000\u01c9+\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0007\u0001\u0000\u0000\u01cb-\u0001\u0000\u0000\u0000\u01cc\u01d1\u0003"+
		"\u0086C\u0000\u01cd\u01d1\u00030\u0018\u0000\u01ce\u01d1\u00032\u0019"+
		"\u0000\u01cf\u01d1\u0003\u001a\r\u0000\u01d0\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d3/\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005_\u0000\u0000\u01d5\u01d6"+
		"\u00034\u001a\u0000\u01d61\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005`"+
		"\u0000\u0000\u01d8\u01d9\u00034\u001a\u0000\u01d93\u0001\u0000\u0000\u0000"+
		"\u01da\u01dc\u0003D\"\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0003>\u001f\u0000\u01de\u01df\u0005K\u0000\u0000\u01df5\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e6\u0003\u0084B\u0000\u01e1\u01e6\u0003\u0086"+
		"C\u0000\u01e2\u01e6\u00038\u001c\u0000\u01e3\u01e6\u0003:\u001d\u0000"+
		"\u01e4\u01e6\u0003F#\u0000\u01e5\u01e0\u0001\u0000\u0000\u0000\u01e5\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e87\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005"+
		"_\u0000\u0000\u01ea\u01eb\u0003<\u001e\u0000\u01eb9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0005`\u0000\u0000\u01ed\u01ee\u0003<\u001e\u0000\u01ee"+
		";\u0001\u0000\u0000\u0000\u01ef\u01f1\u0003D\"\u0000\u01f0\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f4\u0003>\u001f\u0000\u01f3\u01f5\u0003\u008e"+
		"G\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005K\u0000\u0000"+
		"\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003\u00be_\u0000\u01fa"+
		"=\u0001\u0000\u0000\u0000\u01fb\u0205\u0003B!\u0000\u01fc\u01fe\u0003"+
		"@ \u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u0203\u0003\u00aaU\u0000"+
		"\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01fb\u0001\u0000\u0000\u0000"+
		"\u0204\u01fd\u0001\u0000\u0000\u0000\u0205?\u0001\u0000\u0000\u0000\u0206"+
		"\u0208\u0003B!\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020d\u0005"+
		"V\u0000\u0000\u020a\u020c\u0003D\"\u0000\u020b\u020a\u0001\u0000\u0000"+
		"\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0210\u0001\u0000\u0000"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0211\u0005}\u0000\u0000"+
		"\u0211A\u0001\u0000\u0000\u0000\u0212\u0213\u0005}\u0000\u0000\u0213C"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0005E\u0000\u0000\u0215\u0216\u0003"+
		"\u00b0X\u0000\u0216\u0217\u0005F\u0000\u0000\u0217E\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0005\u0013\u0000\u0000\u0219\u021a\u0003H$\u0000\u021a"+
		"\u021b\u0005K\u0000\u0000\u021b\u0221\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0005\u0004\u0000\u0000\u021d\u021e\u0003H$\u0000\u021e\u021f\u0005K"+
		"\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u0218\u0001\u0000"+
		"\u0000\u0000\u0220\u021c\u0001\u0000\u0000\u0000\u0221G\u0001\u0000\u0000"+
		"\u0000\u0222\u0227\u0003J%\u0000\u0223\u0224\u0005L\u0000\u0000\u0224"+
		"\u0226\u0003J%\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0229\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228I\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000"+
		"\u0000\u0000\u022a\u022f\u0005}\u0000\u0000\u022b\u022c\u0005}\u0000\u0000"+
		"\u022c\u022d\u0005P\u0000\u0000\u022d\u022f\u0005}\u0000\u0000\u022e\u022a"+
		"\u0001\u0000\u0000\u0000\u022e\u022b\u0001\u0000\u0000\u0000\u022fK\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0003N\'\u0000\u0231\u0232\u0005E\u0000"+
		"\u0000\u0232\u0234\u0005e\u0000\u0000\u0233\u0235\u0003N\'\u0000\u0234"+
		"\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235"+
		"\u0236\u0001\u0000\u0000\u0000\u0236\u0238\u0005F\u0000\u0000\u0237\u0239"+
		"\u0003`0\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239M\u0001\u0000\u0000\u0000\u023a\u023b\u0003P(\u0000"+
		"\u023b\u023c\u0003\u00a2Q\u0000\u023c\u0249\u0001\u0000\u0000\u0000\u023d"+
		"\u0249\u0003P(\u0000\u023e\u0240\u0005*\u0000\u0000\u023f\u0241\u0003"+
		"\u0016\u000b\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0249\u0001\u0000\u0000\u0000\u0242\u0244\u0003"+
		"\"\u0011\u0000\u0243\u0245\u0003\u0016\u000b\u0000\u0244\u0243\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0249\u0001\u0000"+
		"\u0000\u0000\u0246\u0249\u0003\u0092I\u0000\u0247\u0249\u0003\u009cN\u0000"+
		"\u0248\u023a\u0001\u0000\u0000\u0000\u0248\u023d\u0001\u0000\u0000\u0000"+
		"\u0248\u023e\u0001\u0000\u0000\u0000\u0248\u0242\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000"+
		"\u0249O\u0001\u0000\u0000\u0000\u024a\u024b\u0007\u0002\u0000\u0000\u024b"+
		"Q\u0001\u0000\u0000\u0000\u024c\u0252\u0005 \u0000\u0000\u024d\u0252\u0005"+
		"?\u0000\u0000\u024e\u0252\u00056\u0000\u0000\u024f\u0252\u0005=\u0000"+
		"\u0000\u0250\u0252\u0003T*\u0000\u0251\u024c\u0001\u0000\u0000\u0000\u0251"+
		"\u024d\u0001\u0000\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0251"+
		"\u024f\u0001\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252"+
		"S\u0001\u0000\u0000\u0000\u0253\u0254\u0007\u0003\u0000\u0000\u0254U\u0001"+
		"\u0000\u0000\u0000\u0255\u0267\u0005}\u0000\u0000\u0256\u0267\u0003\u00f8"+
		"|\u0000\u0257\u0267\u0005\u007f\u0000\u0000\u0258\u0259\u0005E\u0000\u0000"+
		"\u0259\u025a\u0003\u00ceg\u0000\u025a\u025b\u0005F\u0000\u0000\u025b\u0267"+
		"\u0001\u0000\u0000\u0000\u025c\u0267\u0005\u0017\u0000\u0000\u025d\u0267"+
		"\u0005\u0016\u0000\u0000\u025e\u0267\u0003d2\u0000\u025f\u0267\u0003l"+
		"6\u0000\u0260\u0267\u0003p8\u0000\u0261\u0267\u0003r9\u0000\u0262\u0267"+
		"\u0003Z-\u0000\u0263\u0267\u0003\\.\u0000\u0264\u0267\u0003^/\u0000\u0265"+
		"\u0267\u0003b1\u0000\u0266\u0255\u0001\u0000\u0000\u0000\u0266\u0256\u0001"+
		"\u0000\u0000\u0000\u0266\u0257\u0001\u0000\u0000\u0000\u0266\u0258\u0001"+
		"\u0000\u0000\u0000\u0266\u025c\u0001\u0000\u0000\u0000\u0266\u025d\u0001"+
		"\u0000\u0000\u0000\u0266\u025e\u0001\u0000\u0000\u0000\u0266\u025f\u0001"+
		"\u0000\u0000\u0000\u0266\u0260\u0001\u0000\u0000\u0000\u0266\u0261\u0001"+
		"\u0000\u0000\u0000\u0266\u0262\u0001\u0000\u0000\u0000\u0266\u0263\u0001"+
		"\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0265\u0001"+
		"\u0000\u0000\u0000\u0267W\u0001\u0000\u0000\u0000\u0268\u0269\u0003\u00f2"+
		"y\u0000\u0269\u026a\u0005V\u0000\u0000\u026a\u026b\u0003\u00f2y\u0000"+
		"\u026bY\u0001\u0000\u0000\u0000\u026c\u026d\u0005O\u0000\u0000\u026d\u026f"+
		"\u0005G\u0000\u0000\u026e\u0270\u0003X,\u0000\u026f\u026e\u0001\u0000"+
		"\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0275\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0005L\u0000\u0000\u0272\u0274\u0003X,\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000"+
		"\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000"+
		"\u0278\u027a\u0005L\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0005H\u0000\u0000\u027c[\u0001\u0000\u0000\u0000\u027d\u027e\u0005"+
		"O\u0000\u0000\u027e\u0280\u0005I\u0000\u0000\u027f\u0281\u0003\u00f2y"+
		"\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000"+
		"\u0000\u0281\u0286\u0001\u0000\u0000\u0000\u0282\u0283\u0005L\u0000\u0000"+
		"\u0283\u0285\u0003\u00f2y\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285"+
		"\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0289\u028b\u0005L\u0000\u0000\u028a\u0289"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0005J\u0000\u0000\u028d]\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0005O\u0000\u0000\u028f\u0290\u0005E\u0000\u0000"+
		"\u0290\u0291\u0003\u00f2y\u0000\u0291\u0292\u0005F\u0000\u0000\u0292\u0296"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0005O\u0000\u0000\u0294\u0296\u0003"+
		"\u00f8|\u0000\u0295\u028e\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000"+
		"\u0000\u0000\u0296_\u0001\u0000\u0000\u0000\u0297\u029a\u0005E\u0000\u0000"+
		"\u0298\u029b\u0003t:\u0000\u0299\u029b\u0005>\u0000\u0000\u029a\u0298"+
		"\u0001\u0000\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029b\u02a0\u0001\u0000\u0000\u0000\u029c\u029d"+
		"\u0005L\u0000\u0000\u029d\u029f\u0003t:\u0000\u029e\u029c\u0001\u0000"+
		"\u0000\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005F\u0000"+
		"\u0000\u02a4a\u0001\u0000\u0000\u0000\u02a5\u02a7\u0005e\u0000\u0000\u02a6"+
		"\u02a8\u0003N\'\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u02ab"+
		"\u0003`0\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003\u00be"+
		"_\u0000\u02adc\u0001\u0000\u0000\u0000\u02ae\u02af\u0005I\u0000\u0000"+
		"\u02af\u02b0\u0003f3\u0000\u02b0\u02b1\u0003h4\u0000\u02b1\u02b2\u0005"+
		"J\u0000\u0000\u02b2e\u0001\u0000\u0000\u0000\u02b3\u02b7\u0003\u00ceg"+
		"\u0000\u02b4\u02b7\u0003\"\u0011\u0000\u02b5\u02b7\u0005\u0016\u0000\u0000"+
		"\u02b6\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b7g\u0001\u0000\u0000\u0000\u02b8"+
		"\u02bf\u0003B!\u0000\u02b9\u02bb\u0003j5\u0000\u02ba\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02bf\u0001\u0000"+
		"\u0000\u0000\u02be\u02b8\u0001\u0000\u0000\u0000\u02be\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bfi\u0001\u0000\u0000\u0000\u02c0\u02c2\u0003B!\u0000"+
		"\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005V\u0000\u0000\u02c4"+
		"\u02c5\u0003\u00ceg\u0000\u02c5k\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005"+
		"\u0011\u0000\u0000\u02c7\u02c8\u0005E\u0000\u0000\u02c8\u02c9\u0003n7"+
		"\u0000\u02c9\u02ca\u0005F\u0000\u0000\u02cam\u0001\u0000\u0000\u0000\u02cb"+
		"\u02d5\u0003B!\u0000\u02cc\u02ce\u0003B!\u0000\u02cd\u02cc\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d1\u0005V\u0000\u0000\u02d0\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d4\u02cb\u0001\u0000\u0000\u0000\u02d4\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d5o\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005\u000b\u0000\u0000"+
		"\u02d7\u02d8\u0005E\u0000\u0000\u02d8\u02d9\u0003(\u0014\u0000\u02d9\u02da"+
		"\u0005F\u0000\u0000\u02daq\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\u0005"+
		"\u0000\u0000\u02dc\u02dd\u0005E\u0000\u0000\u02dd\u02de\u0003\u00b0X\u0000"+
		"\u02de\u02df\u0005F\u0000\u0000\u02dfs\u0001\u0000\u0000\u0000\u02e0\u02e1"+
		"\u0003\u0088D\u0000\u02e1\u02e2\u0003\u00a4R\u0000\u02e2u\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e4\u0005\u0015\u0000\u0000\u02e4\u02e5\u0003\u00be"+
		"_\u0000\u02e5w\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005\u0002\u0000\u0000"+
		"\u02e7\u02e8\u0005E\u0000\u0000\u02e8\u02e9\u0003t:\u0000\u02e9\u02ea"+
		"\u0005F\u0000\u0000\u02ea\u02eb\u0003\u00be_\u0000\u02eby\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0005\u0007\u0000\u0000\u02ed\u02ee\u0003\u00be"+
		"_\u0000\u02ee{\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u0014\u0000\u0000"+
		"\u02f0\u02f1\u0005E\u0000\u0000\u02f1\u02f2\u0005}\u0000\u0000\u02f2\u02f3"+
		"\u0005F\u0000\u0000\u02f3}\u0001\u0000\u0000\u0000\u02f4\u02f8\u0003v"+
		";\u0000\u02f5\u02f7\u0003x<\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb\u02fd\u0003z=\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u007f"+
		"\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005\u0012\u0000\u0000\u02ff\u0300"+
		"\u0005E\u0000\u0000\u0300\u0301\u0003V+\u0000\u0301\u0302\u0005F\u0000"+
		"\u0000\u0302\u0303\u0003\u00be_\u0000\u0303\u0081\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0005\u0001\u0000\u0000\u0305\u0306\u0003\u00be_\u0000\u0306"+
		"\u0083\u0001\u0000\u0000\u0000\u0307\u0309\u0003\u0088D\u0000\u0308\u0307"+
		"\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0001\u0000\u0000\u0000\u030a\u030b\u0003\u00a4R\u0000\u030b\u030c\u0003"+
		"\u00be_\u0000\u030c\u0085\u0001\u0000\u0000\u0000\u030d\u030f\u0003\u0088"+
		"D\u0000\u030e\u0310\u0003\u008eG\u0000\u030f\u030e\u0001\u0000\u0000\u0000"+
		"\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0005K\u0000\u0000\u0312\u0087\u0001\u0000\u0000\u0000\u0313"+
		"\u0318\u0003\u008aE\u0000\u0314\u0318\u0003\u008cF\u0000\u0315\u0318\u0003"+
		"N\'\u0000\u0316\u0318\u0003R)\u0000\u0317\u0313\u0001\u0000\u0000\u0000"+
		"\u0317\u0314\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000"+
		"\u0317\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000"+
		"\u0319\u0317\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000"+
		"\u031a\u0089\u0001\u0000\u0000\u0000\u031b\u031c\u0007\u0004\u0000\u0000"+
		"\u031c\u008b\u0001\u0000\u0000\u0000\u031d\u031e\u0007\u0005\u0000\u0000"+
		"\u031e\u008d\u0001\u0000\u0000\u0000\u031f\u0324\u0003\u0090H\u0000\u0320"+
		"\u0321\u0005L\u0000\u0000\u0321\u0323\u0003\u0090H\u0000\u0322\u0320\u0001"+
		"\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u008f\u0001"+
		"\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u032a\u0003"+
		"\u00a4R\u0000\u0328\u0329\u0005P\u0000\u0000\u0329\u032b\u0003\u00aeW"+
		"\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000"+
		"\u0000\u032b\u0091\u0001\u0000\u0000\u0000\u032c\u0339\u0007\u0006\u0000"+
		"\u0000\u032d\u033a\u0005}\u0000\u0000\u032e\u0330\u0005}\u0000\u0000\u032f"+
		"\u032e\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\u0001\u0000\u0000\u0000\u0331\u0333\u0005G\u0000\u0000\u0332\u0334"+
		"\u0003\u0094J\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001"+
		"\u0000\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0335\u0336\u0001"+
		"\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0005"+
		"H\u0000\u0000\u0338\u033a\u0001\u0000\u0000\u0000\u0339\u032d\u0001\u0000"+
		"\u0000\u0000\u0339\u032f\u0001\u0000\u0000\u0000\u033a\u0093\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0003\u0096K\u0000\u033c\u033d\u0003\u0098L\u0000"+
		"\u033d\u033e\u0005K\u0000\u0000\u033e\u0095\u0001\u0000\u0000\u0000\u033f"+
		"\u0343\u0003\u008aE\u0000\u0340\u0343\u0003N\'\u0000\u0341\u0343\u0003"+
		"R)\u0000\u0342\u033f\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000"+
		"\u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u0097\u0001\u0000\u0000\u0000\u0346\u034b\u0003\u009aM\u0000"+
		"\u0347\u0348\u0005L\u0000\u0000\u0348\u034a\u0003\u009aM\u0000\u0349\u0347"+
		"\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u0349"+
		"\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u0099"+
		"\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u0355"+
		"\u0003\u00a4R\u0000\u034f\u0351\u0003\u00a4R\u0000\u0350\u034f\u0001\u0000"+
		"\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0005V\u0000\u0000\u0353\u0355\u0003\u00f8|\u0000"+
		"\u0354\u034e\u0001\u0000\u0000\u0000\u0354\u0350\u0001\u0000\u0000\u0000"+
		"\u0355\u009b\u0001\u0000\u0000\u0000\u0356\u0359\u0005&\u0000\u0000\u0357"+
		"\u0358\u0005V\u0000\u0000\u0358\u035a\u0003\u00b0X\u0000\u0359\u0357\u0001"+
		"\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u0366\u0001"+
		"\u0000\u0000\u0000\u035b\u0360\u0003\u00f6{\u0000\u035c\u035d\u0005G\u0000"+
		"\u0000\u035d\u035e\u0003\u009eO\u0000\u035e\u035f\u0005H\u0000\u0000\u035f"+
		"\u0361\u0001\u0000\u0000\u0000\u0360\u035c\u0001\u0000\u0000\u0000\u0360"+
		"\u0361\u0001\u0000\u0000\u0000\u0361\u0367\u0001\u0000\u0000\u0000\u0362"+
		"\u0363\u0005G\u0000\u0000\u0363\u0364\u0003\u009eO\u0000\u0364\u0365\u0005"+
		"H\u0000\u0000\u0365\u0367\u0001\u0000\u0000\u0000\u0366\u035b\u0001\u0000"+
		"\u0000\u0000\u0366\u0362\u0001\u0000\u0000\u0000\u0367\u037d\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0005A\u0000\u0000\u0369\u036a\u0005E\u0000\u0000"+
		"\u036a\u036b\u0003\u00b0X\u0000\u036b\u036c\u0005L\u0000\u0000\u036c\u036d"+
		"\u0003\u00f6{\u0000\u036d\u036e\u0005F\u0000\u0000\u036e\u036f\u0005G"+
		"\u0000\u0000\u036f\u0370\u0003\u009eO\u0000\u0370\u0371\u0005H\u0000\u0000"+
		"\u0371\u037d\u0001\u0000\u0000\u0000\u0372\u0373\u0005B\u0000\u0000\u0373"+
		"\u0374\u0005E\u0000\u0000\u0374\u0375\u0003\u00b0X\u0000\u0375\u0376\u0005"+
		"L\u0000\u0000\u0376\u0377\u0003\u00f6{\u0000\u0377\u0378\u0005F\u0000"+
		"\u0000\u0378\u0379\u0005G\u0000\u0000\u0379\u037a\u0003\u009eO\u0000\u037a"+
		"\u037b\u0005H\u0000\u0000\u037b\u037d\u0001\u0000\u0000\u0000\u037c\u0356"+
		"\u0001\u0000\u0000\u0000\u037c\u0368\u0001\u0000\u0000\u0000\u037c\u0372"+
		"\u0001\u0000\u0000\u0000\u037d\u009d\u0001\u0000\u0000\u0000\u037e\u0383"+
		"\u0003\u00a0P\u0000\u037f\u0380\u0005L\u0000\u0000\u0380\u0382\u0003\u00a0"+
		"P\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0382\u0385\u0001\u0000\u0000"+
		"\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000"+
		"\u0000\u0384\u0387\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000"+
		"\u0000\u0386\u0388\u0005L\u0000\u0000\u0387\u0386\u0001\u0000\u0000\u0000"+
		"\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u009f\u0001\u0000\u0000\u0000"+
		"\u0389\u038c\u0003\u00f6{\u0000\u038a\u038b\u0005P\u0000\u0000\u038b\u038d"+
		"\u0003\u00d6k\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038d\u0001"+
		"\u0000\u0000\u0000\u038d\u00a1\u0001\u0000\u0000\u0000\u038e\u0390\u0005"+
		"a\u0000\u0000\u038f\u0391\u0003\u0088D\u0000\u0390\u038f\u0001\u0000\u0000"+
		"\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0398\u0001\u0000\u0000"+
		"\u0000\u0392\u0394\u0005a\u0000\u0000\u0393\u0395\u0003\u0088D\u0000\u0394"+
		"\u0393\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0001\u0000\u0000\u0000\u0396\u0398\u0003\u00a2Q\u0000\u0397\u038e"+
		"\u0001\u0000\u0000\u0000\u0397\u0392\u0001\u0000\u0000\u0000\u0398\u00a3"+
		"\u0001\u0000\u0000\u0000\u0399\u039b\u0003\u00a2Q\u0000\u039a\u0399\u0001"+
		"\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039c\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0003\u00a6S\u0000\u039d\u00a5\u0001\u0000"+
		"\u0000\u0000\u039e\u03a2\u0003\u00f6{\u0000\u039f\u03a1\u0003\u00a8T\u0000"+
		"\u03a0\u039f\u0001\u0000\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a3\u03b6\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a6\u0005E\u0000\u0000\u03a6\u03a7\u0003\u00a4R\u0000\u03a7\u03ab"+
		"\u0005F\u0000\u0000\u03a8\u03aa\u0003\u00a8T\u0000\u03a9\u03a8\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000\u0000\u03ab\u03a9\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03b6\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ae\u03af\u0005E\u0000"+
		"\u0000\u03af\u03b1\u0005e\u0000\u0000\u03b0\u03b2\u0003\u00f6{\u0000\u03b1"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005F\u0000\u0000\u03b4\u03b6"+
		"\u0003`0\u0000\u03b5\u039e\u0001\u0000\u0000\u0000\u03b5\u03a5\u0001\u0000"+
		"\u0000\u0000\u03b5\u03ae\u0001\u0000\u0000\u0000\u03b6\u00a7\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b9\u0005I\u0000\u0000\u03b8\u03ba\u0003\u00d6k\u0000"+
		"\u03b9\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03c2\u0005J\u0000\u0000\u03bc"+
		"\u03be\u0005E\u0000\u0000\u03bd\u03bf\u0003\u00aaU\u0000\u03be\u03bd\u0001"+
		"\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c2\u0005F\u0000\u0000\u03c1\u03b7\u0001\u0000"+
		"\u0000\u0000\u03c1\u03bc\u0001\u0000\u0000\u0000\u03c2\u00a9\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c6\u0003\u00b6[\u0000\u03c4\u03c5\u0005L\u0000\u0000"+
		"\u03c5\u03c7\u0005s\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c7\u00ab\u0001\u0000\u0000\u0000\u03c8"+
		"\u03cd\u0003\u0088D\u0000\u03c9\u03cb\u0003\u00a4R\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u03ce\u0001"+
		"\u0000\u0000\u0000\u03cc\u03ce\u0003\u00b2Y\u0000\u03cd\u03ca\u0001\u0000"+
		"\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000\u03ce\u00ad\u0001\u0000"+
		"\u0000\u0000\u03cf\u03df\u0003\u00d0h\u0000\u03d0\u03d1\u0005G\u0000\u0000"+
		"\u03d1\u03d6\u0003\u00aeW\u0000\u03d2\u03d3\u0005L\u0000\u0000\u03d3\u03d5"+
		"\u0003\u00aeW\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d5\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d7\u03da\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001"+
		"\u0000\u0000\u0000\u03d9\u03db\u0005L\u0000\u0000\u03da\u03d9\u0001\u0000"+
		"\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000"+
		"\u0000\u0000\u03dc\u03dd\u0005H\u0000\u0000\u03dd\u03df\u0001\u0000\u0000"+
		"\u0000\u03de\u03cf\u0001\u0000\u0000\u0000\u03de\u03d0\u0001\u0000\u0000"+
		"\u0000\u03df\u00af\u0001\u0000\u0000\u0000\u03e0\u03e1\u0003\u0096K\u0000"+
		"\u03e1\u03e2\u0003\u00b2Y\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3"+
		"\u03e5\u0003L&\u0000\u03e4\u03e0\u0001\u0000\u0000\u0000\u03e4\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e5\u00b1\u0001\u0000\u0000\u0000\u03e6\u03e7\u0003"+
		"\u00a2Q\u0000\u03e7\u03e8\u0003\u00b2Y\u0000\u03e8\u03fc\u0001\u0000\u0000"+
		"\u0000\u03e9\u03ea\u0005E\u0000\u0000\u03ea\u03eb\u0003\u00b2Y\u0000\u03eb"+
		"\u03ed\u0005F\u0000\u0000\u03ec\u03ee\u0003\u00b4Z\u0000\u03ed\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03fc\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f3\u0005I\u0000\u0000\u03f2\u03f4\u0003\u00d6"+
		"k\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f7\u0005J\u0000\u0000"+
		"\u03f6\u03f1\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000"+
		"\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000"+
		"\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fb\u03e6\u0001\u0000\u0000\u0000\u03fb\u03e9\u0001\u0000\u0000\u0000"+
		"\u03fb\u03f6\u0001\u0000\u0000\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000"+
		"\u03fc\u00b3\u0001\u0000\u0000\u0000\u03fd\u03ff\u0005I\u0000\u0000\u03fe"+
		"\u0400\u0003\u00d6k\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u03ff\u0400"+
		"\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u0408"+
		"\u0005J\u0000\u0000\u0402\u0404\u0005E\u0000\u0000\u0403\u0405\u0003\u00b6"+
		"[\u0000\u0404\u0403\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000"+
		"\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0408\u0005F\u0000\u0000"+
		"\u0407\u03fd\u0001\u0000\u0000\u0000\u0407\u0402\u0001\u0000\u0000\u0000"+
		"\u0408\u00b5\u0001\u0000\u0000\u0000\u0409\u040e\u0003\u00acV\u0000\u040a"+
		"\u040b\u0005L\u0000\u0000\u040b\u040d\u0003\u00acV\u0000\u040c\u040a\u0001"+
		"\u0000\u0000\u0000\u040d\u0410\u0001\u0000\u0000\u0000\u040e\u040c\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u00b7\u0001"+
		"\u0000\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0411\u0413\u0003"+
		"\u00ba]\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000"+
		"\u0000\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000"+
		"\u0000\u0000\u0415\u00b9\u0001\u0000\u0000\u0000\u0416\u0423\u0003\u00bc"+
		"^\u0000\u0417\u0418\u0003\u00ceg\u0000\u0418\u0419\u0005K\u0000\u0000"+
		"\u0419\u0423\u0001\u0000\u0000\u0000\u041a\u0423\u0003\u00be_\u0000\u041b"+
		"\u0423\u0003\u00c0`\u0000\u041c\u0423\u0003\u00cae\u0000\u041d\u0423\u0003"+
		"\u00ccf\u0000\u041e\u0423\u0003\u0080@\u0000\u041f\u0423\u0003\u0082A"+
		"\u0000\u0420\u0423\u0003~?\u0000\u0421\u0423\u0005K\u0000\u0000\u0422"+
		"\u0416\u0001\u0000\u0000\u0000\u0422\u0417\u0001\u0000\u0000\u0000\u0422"+
		"\u041a\u0001\u0000\u0000\u0000\u0422\u041b\u0001\u0000\u0000\u0000\u0422"+
		"\u041c\u0001\u0000\u0000\u0000\u0422\u041d\u0001\u0000\u0000\u0000\u0422"+
		"\u041e\u0001\u0000\u0000\u0000\u0422\u041f\u0001\u0000\u0000\u0000\u0422"+
		"\u0420\u0001\u0000\u0000\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0423"+
		"\u00bb\u0001\u0000\u0000\u0000\u0424\u0425\u0003\u00f6{\u0000\u0425\u0426"+
		"\u0005V\u0000\u0000\u0426\u0427\u0003\u00ba]\u0000\u0427\u0431\u0001\u0000"+
		"\u0000\u0000\u0428\u0429\u0005\u001e\u0000\u0000\u0429\u042a\u0003\u00d6"+
		"k\u0000\u042a\u042b\u0005V\u0000\u0000\u042b\u042c\u0003\u00ba]\u0000"+
		"\u042c\u0431\u0001\u0000\u0000\u0000\u042d\u042e\u0005\"\u0000\u0000\u042e"+
		"\u042f\u0005V\u0000\u0000\u042f\u0431\u0003\u00ba]\u0000\u0430\u0424\u0001"+
		"\u0000\u0000\u0000\u0430\u0428\u0001\u0000\u0000\u0000\u0430\u042d\u0001"+
		"\u0000\u0000\u0000\u0431\u00bd\u0001\u0000\u0000\u0000\u0432\u0437\u0005"+
		"G\u0000\u0000\u0433\u0436\u0003\u0086C\u0000\u0434\u0436\u0003\u00b8\\"+
		"\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0435\u0434\u0001\u0000\u0000"+
		"\u0000\u0436\u0439\u0001\u0000\u0000\u0000\u0437\u0435\u0001\u0000\u0000"+
		"\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u043a\u0001\u0000\u0000"+
		"\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a\u043b\u0005H\u0000\u0000"+
		"\u043b\u00bf\u0001\u0000\u0000\u0000\u043c\u043d\u0005+\u0000\u0000\u043d"+
		"\u043e\u0005E\u0000\u0000\u043e\u043f\u0003\u00ceg\u0000\u043f\u0440\u0005"+
		"F\u0000\u0000\u0440\u0443\u0003\u00ba]\u0000\u0441\u0442\u0005%\u0000"+
		"\u0000\u0442\u0444\u0003\u00ba]\u0000\u0443\u0441\u0001\u0000\u0000\u0000"+
		"\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u044c\u0001\u0000\u0000\u0000"+
		"\u0445\u0446\u0005:\u0000\u0000\u0446\u0447\u0005E\u0000\u0000\u0447\u0448"+
		"\u0003\u00ceg\u0000\u0448\u0449\u0005F\u0000\u0000\u0449\u044a\u0003\u00ba"+
		"]\u0000\u044a\u044c\u0001\u0000\u0000\u0000\u044b\u043c\u0001\u0000\u0000"+
		"\u0000\u044b\u0445\u0001\u0000\u0000\u0000\u044c\u00c1\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0005)\u0000\u0000\u044e\u044f\u0005E\u0000\u0000\u044f"+
		"\u0450\u0003t:\u0000\u0450\u0452\u0005,\u0000\u0000\u0451\u0453\u0003"+
		"\u00ceg\u0000\u0452\u0451\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000"+
		"\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0455\u0005F\u0000"+
		"\u0000\u0455\u0456\u0003\u00ba]\u0000\u0456\u00c3\u0001\u0000\u0000\u0000"+
		"\u0457\u0458\u0005)\u0000\u0000\u0458\u045d\u0005E\u0000\u0000\u0459\u045a"+
		"\u0003\u0088D\u0000\u045a\u045b\u0003\u008eG\u0000\u045b\u045e\u0001\u0000"+
		"\u0000\u0000\u045c\u045e\u0003\u00ceg\u0000\u045d\u0459\u0001\u0000\u0000"+
		"\u0000\u045d\u045c\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000"+
		"\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u0461\u0005K\u0000\u0000"+
		"\u0460\u0462\u0003\u00ceg\u0000\u0461\u0460\u0001\u0000\u0000\u0000\u0461"+
		"\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000\u0000\u0463"+
		"\u0465\u0005K\u0000\u0000\u0464\u0466\u0003\u00ceg\u0000\u0465\u0464\u0001"+
		"\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u0467\u0001"+
		"\u0000\u0000\u0000\u0467\u0468\u0005F\u0000\u0000\u0468\u0469\u0003\u00ba"+
		"]\u0000\u0469\u00c5\u0001\u0000\u0000\u0000\u046a\u046b\u0005@\u0000\u0000"+
		"\u046b\u046c\u0005E\u0000\u0000\u046c\u046d\u0003\u00ceg\u0000\u046d\u046e"+
		"\u0005F\u0000\u0000\u046e\u046f\u0003\u00ba]\u0000\u046f\u00c7\u0001\u0000"+
		"\u0000\u0000\u0470\u0471\u0005#\u0000\u0000\u0471\u0472\u0003\u00ba]\u0000"+
		"\u0472\u0473\u0005@\u0000\u0000\u0473\u0474\u0005E\u0000\u0000\u0474\u0475"+
		"\u0003\u00ceg\u0000\u0475\u0476\u0005F\u0000\u0000\u0476\u0477\u0005K"+
		"\u0000\u0000\u0477\u00c9\u0001\u0000\u0000\u0000\u0478\u047d\u0003\u00c6"+
		"c\u0000\u0479\u047d\u0003\u00c8d\u0000\u047a\u047d\u0003\u00c4b\u0000"+
		"\u047b\u047d\u0003\u00c2a\u0000\u047c\u0478\u0001\u0000\u0000\u0000\u047c"+
		"\u0479\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047c"+
		"\u047b\u0001\u0000\u0000\u0000\u047d\u00cb\u0001\u0000\u0000\u0000\u047e"+
		"\u047f\u0005.\u0000\u0000\u047f\u0480\u0003\u00f6{\u0000\u0480\u0481\u0005"+
		"K\u0000\u0000\u0481\u048c\u0001\u0000\u0000\u0000\u0482\u0483\u0005!\u0000"+
		"\u0000\u0483\u048c\u0005K\u0000\u0000\u0484\u0485\u0005\u001b\u0000\u0000"+
		"\u0485\u048c\u0005K\u0000\u0000\u0486\u0488\u00054\u0000\u0000\u0487\u0489"+
		"\u0003\u00ceg\u0000\u0488\u0487\u0001\u0000\u0000\u0000\u0488\u0489\u0001"+
		"\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u048c\u0005"+
		"K\u0000\u0000\u048b\u047e\u0001\u0000\u0000\u0000\u048b\u0482\u0001\u0000"+
		"\u0000\u0000\u048b\u0484\u0001\u0000\u0000\u0000\u048b\u0486\u0001\u0000"+
		"\u0000\u0000\u048c\u00cd\u0001\u0000\u0000\u0000\u048d\u0492\u0003\u00d0"+
		"h\u0000\u048e\u048f\u0005L\u0000\u0000\u048f\u0491\u0003\u00d0h\u0000"+
		"\u0490\u048e\u0001\u0000\u0000\u0000\u0491\u0494\u0001\u0000\u0000\u0000"+
		"\u0492\u0490\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000\u0000\u0000"+
		"\u0493\u00cf\u0001\u0000\u0000\u0000\u0494\u0492\u0001\u0000\u0000\u0000"+
		"\u0495\u049b\u0003\u00d4j\u0000\u0496\u0497\u0003\u00eew\u0000\u0497\u0498"+
		"\u0003\u00d2i\u0000\u0498\u0499\u0003\u00d0h\u0000\u0499\u049b\u0001\u0000"+
		"\u0000\u0000\u049a\u0495\u0001\u0000\u0000\u0000\u049a\u0496\u0001\u0000"+
		"\u0000\u0000\u049b\u00d1\u0001\u0000\u0000\u0000\u049c\u049d\u0007\u0007"+
		"\u0000\u0000\u049d\u00d3\u0001\u0000\u0000\u0000\u049e\u04a4\u0003\u00d8"+
		"l\u0000\u049f\u04a0\u0005U\u0000\u0000\u04a0\u04a1\u0003\u00d4j\u0000"+
		"\u04a1\u04a2\u0005V\u0000\u0000\u04a2\u04a3\u0003\u00d4j\u0000\u04a3\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a4\u049f\u0001\u0000\u0000\u0000\u04a4\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a5\u00d5\u0001\u0000\u0000\u0000\u04a6\u04a7"+
		"\u0003\u00d4j\u0000\u04a7\u00d7\u0001\u0000\u0000\u0000\u04a8\u04ad\u0003"+
		"\u00dam\u0000\u04a9\u04aa\u0005\\\u0000\u0000\u04aa\u04ac\u0003\u00da"+
		"m\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ac\u04af\u0001\u0000\u0000"+
		"\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000"+
		"\u0000\u04ae\u00d9\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b5\u0003\u00dcn\u0000\u04b1\u04b2\u0005[\u0000\u0000\u04b2"+
		"\u04b4\u0003\u00dcn\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b4\u04b7"+
		"\u0001\u0000\u0000\u0000\u04b5\u04b3\u0001\u0000\u0000\u0000\u04b5\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b6\u00db\u0001\u0000\u0000\u0000\u04b7\u04b5"+
		"\u0001\u0000\u0000\u0000\u04b8\u04bd\u0003\u00deo\u0000\u04b9\u04ba\u0005"+
		"d\u0000\u0000\u04ba\u04bc\u0003\u00deo\u0000\u04bb\u04b9\u0001\u0000\u0000"+
		"\u0000\u04bc\u04bf\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000"+
		"\u0000\u04bd\u04be\u0001\u0000\u0000\u0000\u04be\u00dd\u0001\u0000\u0000"+
		"\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04c0\u04c5\u0003\u00e0p\u0000"+
		"\u04c1\u04c2\u0005e\u0000\u0000\u04c2\u04c4\u0003\u00e0p\u0000\u04c3\u04c1"+
		"\u0001\u0000\u0000\u0000\u04c4\u04c7\u0001\u0000\u0000\u0000\u04c5\u04c3"+
		"\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u00df"+
		"\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u04cd"+
		"\u0003\u00e2q\u0000\u04c9\u04ca\u0005c\u0000\u0000\u04ca\u04cc\u0003\u00e2"+
		"q\u0000\u04cb\u04c9\u0001\u0000\u0000\u0000\u04cc\u04cf\u0001\u0000\u0000"+
		"\u0000\u04cd\u04cb\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000"+
		"\u0000\u04ce\u00e1\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001\u0000\u0000"+
		"\u0000\u04d0\u04d5\u0003\u00e4r\u0000\u04d1\u04d2\u0007\b\u0000\u0000"+
		"\u04d2\u04d4\u0003\u00e4r\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d4"+
		"\u04d7\u0001\u0000\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d5"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d6\u00e3\u0001\u0000\u0000\u0000\u04d7"+
		"\u04d5\u0001\u0000\u0000\u0000\u04d8\u04dd\u0003\u00e6s\u0000\u04d9\u04da"+
		"\u0007\t\u0000\u0000\u04da\u04dc\u0003\u00e6s\u0000\u04db\u04d9\u0001"+
		"\u0000\u0000\u0000\u04dc\u04df\u0001\u0000\u0000\u0000\u04dd\u04db\u0001"+
		"\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u00e5\u0001"+
		"\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04e0\u04e5\u0003"+
		"\u00e8t\u0000\u04e1\u04e2\u0007\n\u0000\u0000\u04e2\u04e4\u0003\u00e8"+
		"t\u0000\u04e3\u04e1\u0001\u0000\u0000\u0000\u04e4\u04e7\u0001\u0000\u0000"+
		"\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e6\u00e7\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e8\u04ed\u0003\u00eau\u0000\u04e9\u04ea\u0007\u000b\u0000\u0000"+
		"\u04ea\u04ec\u0003\u00eau\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04ec"+
		"\u04ef\u0001\u0000\u0000\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed"+
		"\u04ee\u0001\u0000\u0000\u0000\u04ee\u00e9\u0001\u0000\u0000\u0000\u04ef"+
		"\u04ed\u0001\u0000\u0000\u0000\u04f0\u04f5\u0003\u00ecv\u0000\u04f1\u04f2"+
		"\u0007\f\u0000\u0000\u04f2\u04f4\u0003\u00ecv\u0000\u04f3\u04f1\u0001"+
		"\u0000\u0000\u0000\u04f4\u04f7\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000\u0000\u04f6\u00eb\u0001"+
		"\u0000\u0000\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000\u04f8\u04f9\u0005"+
		"E\u0000\u0000\u04f9\u04fa\u0003\u00b0X\u0000\u04fa\u04fb\u0005F\u0000"+
		"\u0000\u04fb\u04fc\u0003\u00ecv\u0000\u04fc\u04ff\u0001\u0000\u0000\u0000"+
		"\u04fd\u04ff\u0003\u00eew\u0000\u04fe\u04f8\u0001\u0000\u0000\u0000\u04fe"+
		"\u04fd\u0001\u0000\u0000\u0000\u04ff\u00ed\u0001\u0000\u0000\u0000\u0500"+
		"\u0511\u0003\u00f2y\u0000\u0501\u0502\u0005]\u0000\u0000\u0502\u0511\u0003"+
		"\u00eew\u0000\u0503\u0504\u0005^\u0000\u0000\u0504\u0511\u0003\u00eew"+
		"\u0000\u0505\u0506\u0003\u00f0x\u0000\u0506\u0507\u0003\u00ecv\u0000\u0507"+
		"\u0511\u0001\u0000\u0000\u0000\u0508\u050e\u00057\u0000\u0000\u0509\u050a"+
		"\u0005E\u0000\u0000\u050a\u050b\u0003\u00b0X\u0000\u050b\u050c\u0005F"+
		"\u0000\u0000\u050c\u050f\u0001\u0000\u0000\u0000\u050d\u050f\u0003\u00ee"+
		"w\u0000\u050e\u0509\u0001\u0000\u0000\u0000\u050e\u050d\u0001\u0000\u0000"+
		"\u0000\u050f\u0511\u0001\u0000\u0000\u0000\u0510\u0500\u0001\u0000\u0000"+
		"\u0000\u0510\u0501\u0001\u0000\u0000\u0000\u0510\u0503\u0001\u0000\u0000"+
		"\u0000\u0510\u0505\u0001\u0000\u0000\u0000\u0510\u0508\u0001\u0000\u0000"+
		"\u0000\u0511\u00ef\u0001\u0000\u0000\u0000\u0512\u0513\u0007\r\u0000\u0000"+
		"\u0513\u00f1\u0001\u0000\u0000\u0000\u0514\u0526\u0003V+\u0000\u0515\u0516"+
		"\u0005I\u0000\u0000\u0516\u0517\u0003\u00ceg\u0000\u0517\u0518\u0005J"+
		"\u0000\u0000\u0518\u0525\u0001\u0000\u0000\u0000\u0519\u051b\u0005E\u0000"+
		"\u0000\u051a\u051c\u0003\u00f4z\u0000\u051b\u051a\u0001\u0000\u0000\u0000"+
		"\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000"+
		"\u051d\u0525\u0005F\u0000\u0000\u051e\u051f\u0005M\u0000\u0000\u051f\u0525"+
		"\u0003\u00f6{\u0000\u0520\u0521\u0005N\u0000\u0000\u0521\u0525\u0003\u00f6"+
		"{\u0000\u0522\u0525\u0005]\u0000\u0000\u0523\u0525\u0005^\u0000\u0000"+
		"\u0524\u0515\u0001\u0000\u0000\u0000\u0524\u0519\u0001\u0000\u0000\u0000"+
		"\u0524\u051e\u0001\u0000\u0000\u0000\u0524\u0520\u0001\u0000\u0000\u0000"+
		"\u0524\u0522\u0001\u0000\u0000\u0000\u0524\u0523\u0001\u0000\u0000\u0000"+
		"\u0525\u0528\u0001\u0000\u0000\u0000\u0526\u0524\u0001\u0000\u0000\u0000"+
		"\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u00f3\u0001\u0000\u0000\u0000"+
		"\u0528\u0526\u0001\u0000\u0000\u0000\u0529\u052e\u0003\u00d0h\u0000\u052a"+
		"\u052b\u0005L\u0000\u0000\u052b\u052d\u0003\u00d0h\u0000\u052c\u052a\u0001"+
		"\u0000\u0000\u0000\u052d\u0530\u0001\u0000\u0000\u0000\u052e\u052c\u0001"+
		"\u0000\u0000\u0000\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u00f5\u0001"+
		"\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000\u0000\u0531\u0532\u0005"+
		"}\u0000\u0000\u0532\u00f7\u0001\u0000\u0000\u0000\u0533\u0534\u0007\u000e"+
		"\u0000\u0000\u0534\u00f9\u0001\u0000\u0000\u0000\u0098\u00fd\u010d\u0115"+
		"\u0118\u011b\u011e\u0126\u012a\u012d\u0130\u0138\u013b\u013e\u0148\u014f"+
		"\u0152\u0155\u0158\u0169\u0175\u017a\u0187\u019a\u01a8\u01b1\u01b9\u01c3"+
		"\u01c8\u01d0\u01d2\u01db\u01e5\u01e7\u01f0\u01f4\u01f7\u01ff\u0202\u0204"+
		"\u0207\u020d\u0220\u0227\u022e\u0234\u0238\u0240\u0244\u0248\u0251\u0266"+
		"\u026f\u0275\u0279\u0280\u0286\u028a\u0295\u029a\u02a0\u02a7\u02aa\u02b6"+
		"\u02bc\u02be\u02c1\u02cd\u02d2\u02d4\u02f8\u02fc\u0308\u030f\u0317\u0319"+
		"\u0324\u032a\u032f\u0335\u0339\u0342\u0344\u034b\u0350\u0354\u0359\u0360"+
		"\u0366\u037c\u0383\u0387\u038c\u0390\u0394\u0397\u039a\u03a2\u03ab\u03b1"+
		"\u03b5\u03b9\u03be\u03c1\u03c6\u03ca\u03cd\u03d6\u03da\u03de\u03e4\u03ef"+
		"\u03f3\u03f8\u03fb\u03ff\u0404\u0407\u040e\u0414\u0422\u0430\u0435\u0437"+
		"\u0443\u044b\u0452\u045d\u0461\u0465\u047c\u0488\u048b\u0492\u049a\u04a4"+
		"\u04ad\u04b5\u04bd\u04c5\u04cd\u04d5\u04dd\u04e5\u04ed\u04f5\u04fe\u050e"+
		"\u0510\u051b\u0524\u0526\u052e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}