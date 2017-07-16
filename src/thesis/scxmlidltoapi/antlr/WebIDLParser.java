package thesis.scxmlidltoapi.antlr;
// Generated from WebIDL.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebIDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, INTEGER_WEBIDL=80, 
		FLOAT_WEBIDL=81, IDENTIFIER_WEBIDL=82, STRING_WEBIDL=83, WHITESPACE_WEBIDL=84, 
		COMMENT_WEBIDL=85, OTHER_WEBIDL=86;
	public static final int
		RULE_webIDL = 0, RULE_definitions = 1, RULE_definition = 2, RULE_callbackOrInterface = 3, 
		RULE_callbackRestOrInterface = 4, RULE_interface_ = 5, RULE_class_ = 6, 
		RULE_partial = 7, RULE_partialDefinition = 8, RULE_partialInterface = 9, 
		RULE_interfaceMembers = 10, RULE_interfaceMember = 11, RULE_dictionary = 12, 
		RULE_dictionaryMembers = 13, RULE_dictionaryMember = 14, RULE_required = 15, 
		RULE_partialDictionary = 16, RULE_default_ = 17, RULE_defaultValue = 18, 
		RULE_inheritance = 19, RULE_extension = 20, RULE_enum_ = 21, RULE_enumValueList = 22, 
		RULE_enumValueListComma = 23, RULE_enumValueListString = 24, RULE_callbackRest = 25, 
		RULE_typedef = 26, RULE_implementsStatement = 27, RULE_const_ = 28, RULE_constValue = 29, 
		RULE_booleanLiteral = 30, RULE_floatLiteral = 31, RULE_serializer = 32, 
		RULE_serializerRest = 33, RULE_serializationPattern = 34, RULE_serializationPatternMap = 35, 
		RULE_serializationPatternList = 36, RULE_stringifier = 37, RULE_stringifierRest = 38, 
		RULE_staticMember = 39, RULE_staticMemberRest = 40, RULE_readonlyMember = 41, 
		RULE_readonlyMemberRest = 42, RULE_readWriteAttribute = 43, RULE_attributeRest = 44, 
		RULE_attributeName = 45, RULE_attributeNameKeyword = 46, RULE_inherit = 47, 
		RULE_readOnly = 48, RULE_operation = 49, RULE_specialOperation = 50, RULE_specials = 51, 
		RULE_special = 52, RULE_operationRest = 53, RULE_optionalIdentifier = 54, 
		RULE_argumentList = 55, RULE_arguments = 56, RULE_argument = 57, RULE_optionalOrRequiredArgument = 58, 
		RULE_argumentName = 59, RULE_ellipsis = 60, RULE_iterable = 61, RULE_optionalType = 62, 
		RULE_readWriteMaplike = 63, RULE_readWriteSetlike = 64, RULE_maplikeRest = 65, 
		RULE_setlikeRest = 66, RULE_extendedAttributeList = 67, RULE_extendedAttributes = 68, 
		RULE_extendedAttribute = 69, RULE_extendedAttributeRest = 70, RULE_extendedAttributeInner = 71, 
		RULE_other = 72, RULE_argumentNameKeyword = 73, RULE_otherOrComma = 74, 
		RULE_type = 75, RULE_singleType = 76, RULE_unionType = 77, RULE_unionMemberType = 78, 
		RULE_unionMemberTypes = 79, RULE_nonAnyType = 80, RULE_bufferRelatedType = 81, 
		RULE_constType = 82, RULE_primitiveType = 83, RULE_unrestrictedFloatType = 84, 
		RULE_floatType = 85, RULE_unsignedIntegerType = 86, RULE_integerType = 87, 
		RULE_optionalLong = 88, RULE_promiseType = 89, RULE_null_ = 90, RULE_returnType = 91, 
		RULE_identifierList = 92, RULE_identifiers = 93, RULE_extendedAttributeNoArgs = 94, 
		RULE_extendedAttributeArgList = 95, RULE_extendedAttributeIdent = 96, 
		RULE_extendedAttributeIdentList = 97, RULE_extendedAttributeNamedArgList = 98;
	public static final String[] ruleNames = {
		"webIDL", "definitions", "definition", "callbackOrInterface", "callbackRestOrInterface", 
		"interface_", "class_", "partial", "partialDefinition", "partialInterface", 
		"interfaceMembers", "interfaceMember", "dictionary", "dictionaryMembers", 
		"dictionaryMember", "required", "partialDictionary", "default_", "defaultValue", 
		"inheritance", "extension", "enum_", "enumValueList", "enumValueListComma", 
		"enumValueListString", "callbackRest", "typedef", "implementsStatement", 
		"const_", "constValue", "booleanLiteral", "floatLiteral", "serializer", 
		"serializerRest", "serializationPattern", "serializationPatternMap", "serializationPatternList", 
		"stringifier", "stringifierRest", "staticMember", "staticMemberRest", 
		"readonlyMember", "readonlyMemberRest", "readWriteAttribute", "attributeRest", 
		"attributeName", "attributeNameKeyword", "inherit", "readOnly", "operation", 
		"specialOperation", "specials", "special", "operationRest", "optionalIdentifier", 
		"argumentList", "arguments", "argument", "optionalOrRequiredArgument", 
		"argumentName", "ellipsis", "iterable", "optionalType", "readWriteMaplike", 
		"readWriteSetlike", "maplikeRest", "setlikeRest", "extendedAttributeList", 
		"extendedAttributes", "extendedAttribute", "extendedAttributeRest", "extendedAttributeInner", 
		"other", "argumentNameKeyword", "otherOrComma", "type", "singleType", 
		"unionType", "unionMemberType", "unionMemberTypes", "nonAnyType", "bufferRelatedType", 
		"constType", "primitiveType", "unrestrictedFloatType", "floatType", "unsignedIntegerType", 
		"integerType", "optionalLong", "promiseType", "null_", "returnType", "identifierList", 
		"identifiers", "extendedAttributeNoArgs", "extendedAttributeArgList", 
		"extendedAttributeIdent", "extendedAttributeIdentList", "extendedAttributeNamedArgList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'callback'", "'interface'", "'{'", "'}'", "';'", "'class'", "'partial'", 
		"'dictionary'", "'required'", "'='", "'['", "']'", "':'", "'extends'", 
		"'enum'", "','", "'('", "')'", "'typedef'", "'implements'", "'const'", 
		"'null'", "'true'", "'false'", "'-Infinity'", "'Infinity'", "'NaN'", "'serializer'", 
		"'getter'", "'inherit'", "'stringifier'", "'static'", "'readonly'", "'attribute'", 
		"'setter'", "'deleter'", "'legacycaller'", "'optional'", "'...'", "'iterable'", 
		"'<'", "'>'", "'maplike'", "'setlike'", "'-'", "'.'", "'?'", "'ByteString'", 
		"'DOMString'", "'FrozenArray'", "'RegExp'", "'USVString'", "'any'", "'boolean'", 
		"'byte'", "'double'", "'float'", "'long'", "'object'", "'octet'", "'or'", 
		"'sequence'", "'short'", "'unsigned'", "'void'", "'unrestricted'", "'DOMException'", 
		"'ArrayBuffer'", "'DataView'", "'Int8Array'", "'Int16Array'", "'Int32Array'", 
		"'Uint8Array'", "'Uint16Array'", "'Uint32Array'", "'Uint8ClampedArray'", 
		"'Float32Array'", "'Float64Array'", "'Promise'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INTEGER_WEBIDL", "FLOAT_WEBIDL", 
		"IDENTIFIER_WEBIDL", "STRING_WEBIDL", "WHITESPACE_WEBIDL", "COMMENT_WEBIDL", 
		"OTHER_WEBIDL"
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
	public String getGrammarFileName() { return "WebIDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebIDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WebIDLContext extends ParserRuleContext {
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WebIDLParser.EOF, 0); }
		public WebIDLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webIDL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterWebIDL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitWebIDL(this);
		}
	}

	public final WebIDLContext webIDL() throws RecognitionException {
		WebIDLContext _localctx = new WebIDLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_webIDL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			definitions();
			setState(199);
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

	public static class DefinitionsContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefinitions(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__10:
			case T__14:
			case T__18:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				extendedAttributeList();
				setState(202);
				definition();
				setState(203);
				definitions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefinitionContext extends ParserRuleContext {
		public CallbackOrInterfaceContext callbackOrInterface() {
			return getRuleContext(CallbackOrInterfaceContext.class,0);
		}
		public PartialContext partial() {
			return getRuleContext(PartialContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public Enum_Context enum_() {
			return getRuleContext(Enum_Context.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ImplementsStatementContext implementsStatement() {
			return getRuleContext(ImplementsStatementContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				callbackOrInterface();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				partial();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				dictionary();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				enum_();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				typedef();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				implementsStatement();
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

	public static class CallbackOrInterfaceContext extends ParserRuleContext {
		public CallbackRestOrInterfaceContext callbackRestOrInterface() {
			return getRuleContext(CallbackRestOrInterfaceContext.class,0);
		}
		public Interface_Context interface_() {
			return getRuleContext(Interface_Context.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public CallbackOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackOrInterface(this);
		}
	}

	public final CallbackOrInterfaceContext callbackOrInterface() throws RecognitionException {
		CallbackOrInterfaceContext _localctx = new CallbackOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_callbackOrInterface);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(T__0);
				setState(217);
				callbackRestOrInterface();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				interface_();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				class_();
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

	public static class CallbackRestOrInterfaceContext extends ParserRuleContext {
		public CallbackRestContext callbackRest() {
			return getRuleContext(CallbackRestContext.class,0);
		}
		public Interface_Context interface_() {
			return getRuleContext(Interface_Context.class,0);
		}
		public CallbackRestOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRestOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackRestOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackRestOrInterface(this);
		}
	}

	public final CallbackRestOrInterfaceContext callbackRestOrInterface() throws RecognitionException {
		CallbackRestOrInterfaceContext _localctx = new CallbackRestOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callbackRestOrInterface);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				callbackRest();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				interface_();
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

	public static class Interface_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public Interface_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterface_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterface_(this);
		}
	}

	public final Interface_Context interface_() throws RecognitionException {
		Interface_Context _localctx = new Interface_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_interface_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__1);
			setState(227);
			match(IDENTIFIER_WEBIDL);
			setState(228);
			inheritance();
			setState(229);
			match(T__2);
			setState(230);
			interfaceMembers();
			setState(231);
			match(T__3);
			setState(232);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterClass_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitClass_(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__5);
			setState(235);
			match(IDENTIFIER_WEBIDL);
			setState(236);
			extension();
			setState(237);
			match(T__2);
			setState(238);
			interfaceMembers();
			setState(239);
			match(T__3);
			setState(240);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialContext extends ParserRuleContext {
		public PartialDefinitionContext partialDefinition() {
			return getRuleContext(PartialDefinitionContext.class,0);
		}
		public PartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartial(this);
		}
	}

	public final PartialContext partial() throws RecognitionException {
		PartialContext _localctx = new PartialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__6);
			setState(243);
			partialDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialDefinitionContext extends ParserRuleContext {
		public PartialInterfaceContext partialInterface() {
			return getRuleContext(PartialInterfaceContext.class,0);
		}
		public PartialDictionaryContext partialDictionary() {
			return getRuleContext(PartialDictionaryContext.class,0);
		}
		public PartialDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialDefinition(this);
		}
	}

	public final PartialDefinitionContext partialDefinition() throws RecognitionException {
		PartialDefinitionContext _localctx = new PartialDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_partialDefinition);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				partialInterface();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				partialDictionary();
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

	public static class PartialInterfaceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public PartialInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialInterface(this);
		}
	}

	public final PartialInterfaceContext partialInterface() throws RecognitionException {
		PartialInterfaceContext _localctx = new PartialInterfaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_partialInterface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__1);
			setState(250);
			match(IDENTIFIER_WEBIDL);
			setState(251);
			match(T__2);
			setState(252);
			interfaceMembers();
			setState(253);
			match(T__3);
			setState(254);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMembersContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public InterfaceMemberContext interfaceMember() {
			return getRuleContext(InterfaceMemberContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public InterfaceMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterfaceMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterfaceMembers(this);
		}
	}

	public final InterfaceMembersContext interfaceMembers() throws RecognitionException {
		InterfaceMembersContext _localctx = new InterfaceMembersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceMembers);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case T__10:
			case T__16:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__42:
			case T__43:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				extendedAttributeList();
				setState(257);
				interfaceMember();
				setState(258);
				interfaceMembers();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InterfaceMemberContext extends ParserRuleContext {
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public SerializerContext serializer() {
			return getRuleContext(SerializerContext.class,0);
		}
		public StringifierContext stringifier() {
			return getRuleContext(StringifierContext.class,0);
		}
		public StaticMemberContext staticMember() {
			return getRuleContext(StaticMemberContext.class,0);
		}
		public IterableContext iterable() {
			return getRuleContext(IterableContext.class,0);
		}
		public ReadonlyMemberContext readonlyMember() {
			return getRuleContext(ReadonlyMemberContext.class,0);
		}
		public ReadWriteAttributeContext readWriteAttribute() {
			return getRuleContext(ReadWriteAttributeContext.class,0);
		}
		public ReadWriteMaplikeContext readWriteMaplike() {
			return getRuleContext(ReadWriteMaplikeContext.class,0);
		}
		public ReadWriteSetlikeContext readWriteSetlike() {
			return getRuleContext(ReadWriteSetlikeContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterfaceMember(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceMember);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				const_();
				}
				break;
			case T__16:
			case T__28:
			case T__34:
			case T__35:
			case T__36:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				operation();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				serializer();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				stringifier();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				staticMember();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				iterable();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				readonlyMember();
				}
				break;
			case T__29:
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(270);
				readWriteAttribute();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 9);
				{
				setState(271);
				readWriteMaplike();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 10);
				{
				setState(272);
				readWriteSetlike();
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

	public static class DictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionary(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__7);
			setState(276);
			match(IDENTIFIER_WEBIDL);
			setState(277);
			inheritance();
			setState(278);
			match(T__2);
			setState(279);
			dictionaryMembers();
			setState(280);
			match(T__3);
			setState(281);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryMembersContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public DictionaryMemberContext dictionaryMember() {
			return getRuleContext(DictionaryMemberContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionaryMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionaryMembers(this);
		}
	}

	public final DictionaryMembersContext dictionaryMembers() throws RecognitionException {
		DictionaryMembersContext _localctx = new DictionaryMembersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryMembers);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				extendedAttributeList();
				setState(284);
				dictionaryMember();
				setState(285);
				dictionaryMembers();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DictionaryMemberContext extends ParserRuleContext {
		public RequiredContext required() {
			return getRuleContext(RequiredContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public DictionaryMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionaryMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionaryMember(this);
		}
	}

	public final DictionaryMemberContext dictionaryMember() throws RecognitionException {
		DictionaryMemberContext _localctx = new DictionaryMemberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dictionaryMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			required();
			setState(291);
			type();
			setState(292);
			match(IDENTIFIER_WEBIDL);
			setState(293);
			default_();
			setState(294);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredContext extends ParserRuleContext {
		public RequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterRequired(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitRequired(this);
		}
	}

	public final RequiredContext required() throws RecognitionException {
		RequiredContext _localctx = new RequiredContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_required);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__8);
				}
				break;
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PartialDictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public PartialDictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialDictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialDictionary(this);
		}
	}

	public final PartialDictionaryContext partialDictionary() throws RecognitionException {
		PartialDictionaryContext _localctx = new PartialDictionaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partialDictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__7);
			setState(301);
			match(IDENTIFIER_WEBIDL);
			setState(302);
			match(T__2);
			setState(303);
			dictionaryMembers();
			setState(304);
			match(T__3);
			setState(305);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_Context extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public Default_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefault_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefault_(this);
		}
	}

	public final Default_Context default_() throws RecognitionException {
		Default_Context _localctx = new Default_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_default_);
		try {
			setState(310);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__9);
				setState(308);
				defaultValue();
				}
				break;
			case T__4:
			case T__15:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defaultValue);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				constValue();
				}
				break;
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(STRING_WEBIDL);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(T__10);
				setState(315);
				match(T__11);
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

	public static class InheritanceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInheritance(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inheritance);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__12);
				setState(319);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtension(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extension);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(T__13);
				setState(324);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Enum_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public EnumValueListContext enumValueList() {
			return getRuleContext(EnumValueListContext.class,0);
		}
		public Enum_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnum_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnum_(this);
		}
	}

	public final Enum_Context enum_() throws RecognitionException {
		Enum_Context _localctx = new Enum_Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_enum_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__14);
			setState(329);
			match(IDENTIFIER_WEBIDL);
			setState(330);
			match(T__2);
			setState(331);
			enumValueList();
			setState(332);
			match(T__3);
			setState(333);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueListContext extends ParserRuleContext {
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public EnumValueListCommaContext enumValueListComma() {
			return getRuleContext(EnumValueListCommaContext.class,0);
		}
		public EnumValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueList(this);
		}
	}

	public final EnumValueListContext enumValueList() throws RecognitionException {
		EnumValueListContext _localctx = new EnumValueListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumValueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(STRING_WEBIDL);
			setState(336);
			enumValueListComma();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueListCommaContext extends ParserRuleContext {
		public EnumValueListStringContext enumValueListString() {
			return getRuleContext(EnumValueListStringContext.class,0);
		}
		public EnumValueListCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueListComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueListComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueListComma(this);
		}
	}

	public final EnumValueListCommaContext enumValueListComma() throws RecognitionException {
		EnumValueListCommaContext _localctx = new EnumValueListCommaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumValueListComma);
		try {
			setState(341);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(T__15);
				setState(339);
				enumValueListString();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EnumValueListStringContext extends ParserRuleContext {
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public EnumValueListCommaContext enumValueListComma() {
			return getRuleContext(EnumValueListCommaContext.class,0);
		}
		public EnumValueListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueListString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueListString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueListString(this);
		}
	}

	public final EnumValueListStringContext enumValueListString() throws RecognitionException {
		EnumValueListStringContext _localctx = new EnumValueListStringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumValueListString);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(STRING_WEBIDL);
				setState(344);
				enumValueListComma();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CallbackRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallbackRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackRest(this);
		}
	}

	public final CallbackRestContext callbackRest() throws RecognitionException {
		CallbackRestContext _localctx = new CallbackRestContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_callbackRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(IDENTIFIER_WEBIDL);
			setState(349);
			match(T__9);
			setState(350);
			returnType();
			setState(351);
			match(T__16);
			setState(352);
			argumentList();
			setState(353);
			match(T__17);
			setState(354);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__18);
			setState(357);
			type();
			setState(358);
			match(IDENTIFIER_WEBIDL);
			setState(359);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ImplementsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterImplementsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitImplementsStatement(this);
		}
	}

	public final ImplementsStatementContext implementsStatement() throws RecognitionException {
		ImplementsStatementContext _localctx = new ImplementsStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_implementsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(IDENTIFIER_WEBIDL);
			setState(362);
			match(T__19);
			setState(363);
			match(IDENTIFIER_WEBIDL);
			setState(364);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_Context extends ParserRuleContext {
		public ConstTypeContext constType() {
			return getRuleContext(ConstTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConst_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConst_(this);
		}
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__20);
			setState(367);
			constType();
			setState(368);
			match(IDENTIFIER_WEBIDL);
			setState(369);
			match(T__9);
			setState(370);
			constValue();
			setState(371);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstValueContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode INTEGER_WEBIDL() { return getToken(WebIDLParser.INTEGER_WEBIDL, 0); }
		public ConstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConstValue(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constValue);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				booleanLiteral();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				floatLiteral();
				}
				break;
			case INTEGER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(INTEGER_WEBIDL);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(T__21);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_WEBIDL() { return getToken(WebIDLParser.FLOAT_WEBIDL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (T__24 - 25)) | (1L << (T__25 - 25)) | (1L << (T__26 - 25)) | (1L << (FLOAT_WEBIDL - 25)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SerializerContext extends ParserRuleContext {
		public SerializerRestContext serializerRest() {
			return getRuleContext(SerializerRestContext.class,0);
		}
		public SerializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializer(this);
		}
	}

	public final SerializerContext serializer() throws RecognitionException {
		SerializerContext _localctx = new SerializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_serializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__27);
			setState(384);
			serializerRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializerRestContext extends ParserRuleContext {
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SerializationPatternContext serializationPattern() {
			return getRuleContext(SerializationPatternContext.class,0);
		}
		public SerializerRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializerRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializerRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializerRest(this);
		}
	}

	public final SerializerRestContext serializerRest() throws RecognitionException {
		SerializerRestContext _localctx = new SerializerRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_serializerRest);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case T__16:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				operationRest();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__9);
				setState(388);
				serializationPattern();
				setState(389);
				match(T__4);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(T__4);
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

	public static class SerializationPatternContext extends ParserRuleContext {
		public SerializationPatternMapContext serializationPatternMap() {
			return getRuleContext(SerializationPatternMapContext.class,0);
		}
		public SerializationPatternListContext serializationPatternList() {
			return getRuleContext(SerializationPatternListContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public SerializationPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPattern(this);
		}
	}

	public final SerializationPatternContext serializationPattern() throws RecognitionException {
		SerializationPatternContext _localctx = new SerializationPatternContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_serializationPattern);
		try {
			setState(403);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__2);
				setState(395);
				serializationPatternMap();
				setState(396);
				match(T__3);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(T__10);
				setState(399);
				serializationPatternList();
				setState(400);
				match(T__11);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(IDENTIFIER_WEBIDL);
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

	public static class SerializationPatternMapContext extends ParserRuleContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public SerializationPatternMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPatternMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPatternMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPatternMap(this);
		}
	}

	public final SerializationPatternMapContext serializationPatternMap() throws RecognitionException {
		SerializationPatternMapContext _localctx = new SerializationPatternMapContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_serializationPatternMap);
		try {
			setState(411);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(T__29);
				setState(407);
				identifiers();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(IDENTIFIER_WEBIDL);
				setState(409);
				identifiers();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class SerializationPatternListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public SerializationPatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPatternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPatternList(this);
		}
	}

	public final SerializationPatternListContext serializationPatternList() throws RecognitionException {
		SerializationPatternListContext _localctx = new SerializationPatternListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_serializationPatternList);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__28);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(IDENTIFIER_WEBIDL);
				setState(415);
				identifiers();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class StringifierContext extends ParserRuleContext {
		public StringifierRestContext stringifierRest() {
			return getRuleContext(StringifierRestContext.class,0);
		}
		public StringifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStringifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStringifier(this);
		}
	}

	public final StringifierContext stringifier() throws RecognitionException {
		StringifierContext _localctx = new StringifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stringifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__30);
			setState(420);
			stringifierRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringifierRestContext extends ParserRuleContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StringifierRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifierRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStringifierRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStringifierRest(this);
		}
	}

	public final StringifierRestContext stringifierRest() throws RecognitionException {
		StringifierRestContext _localctx = new StringifierRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_stringifierRest);
		try {
			setState(429);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				readOnly();
				setState(423);
				attributeRest();
				}
				break;
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				returnType();
				setState(426);
				operationRest();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(T__4);
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

	public static class StaticMemberContext extends ParserRuleContext {
		public StaticMemberRestContext staticMemberRest() {
			return getRuleContext(StaticMemberRestContext.class,0);
		}
		public StaticMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStaticMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStaticMember(this);
		}
	}

	public final StaticMemberContext staticMember() throws RecognitionException {
		StaticMemberContext _localctx = new StaticMemberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__31);
			setState(432);
			staticMemberRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticMemberRestContext extends ParserRuleContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StaticMemberRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMemberRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStaticMemberRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStaticMemberRest(this);
		}
	}

	public final StaticMemberRestContext staticMemberRest() throws RecognitionException {
		StaticMemberRestContext _localctx = new StaticMemberRestContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_staticMemberRest);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				readOnly();
				setState(435);
				attributeRest();
				}
				break;
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				returnType();
				setState(438);
				operationRest();
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

	public static class ReadonlyMemberContext extends ParserRuleContext {
		public ReadonlyMemberRestContext readonlyMemberRest() {
			return getRuleContext(ReadonlyMemberRestContext.class,0);
		}
		public ReadonlyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadonlyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadonlyMember(this);
		}
	}

	public final ReadonlyMemberContext readonlyMember() throws RecognitionException {
		ReadonlyMemberContext _localctx = new ReadonlyMemberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_readonlyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__32);
			setState(443);
			readonlyMemberRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadonlyMemberRestContext extends ParserRuleContext {
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReadWriteMaplikeContext readWriteMaplike() {
			return getRuleContext(ReadWriteMaplikeContext.class,0);
		}
		public ReadWriteSetlikeContext readWriteSetlike() {
			return getRuleContext(ReadWriteSetlikeContext.class,0);
		}
		public ReadonlyMemberRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyMemberRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadonlyMemberRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadonlyMemberRest(this);
		}
	}

	public final ReadonlyMemberRestContext readonlyMemberRest() throws RecognitionException {
		ReadonlyMemberRestContext _localctx = new ReadonlyMemberRestContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_readonlyMemberRest);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				attributeRest();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				readWriteMaplike();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				readWriteSetlike();
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

	public static class ReadWriteAttributeContext extends ParserRuleContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReadWriteAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadWriteAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadWriteAttribute(this);
		}
	}

	public final ReadWriteAttributeContext readWriteAttribute() throws RecognitionException {
		ReadWriteAttributeContext _localctx = new ReadWriteAttributeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_readWriteAttribute);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__29);
				setState(451);
				readOnly();
				setState(452);
				attributeRest();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				attributeRest();
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

	public static class AttributeRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeRest(this);
		}
	}

	public final AttributeRestContext attributeRest() throws RecognitionException {
		AttributeRestContext _localctx = new AttributeRestContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_attributeRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__33);
			setState(458);
			type();
			setState(459);
			attributeName();
			setState(460);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public AttributeNameKeywordContext attributeNameKeyword() {
			return getRuleContext(AttributeNameKeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_attributeName);
		try {
			setState(464);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				attributeNameKeyword();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(IDENTIFIER_WEBIDL);
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

	public static class AttributeNameKeywordContext extends ParserRuleContext {
		public AttributeNameKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNameKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeNameKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeNameKeyword(this);
		}
	}

	public final AttributeNameKeywordContext attributeNameKeyword() throws RecognitionException {
		AttributeNameKeywordContext _localctx = new AttributeNameKeywordContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_attributeNameKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritContext extends ParserRuleContext {
		public InheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInherit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInherit(this);
		}
	}

	public final InheritContext inherit() throws RecognitionException {
		InheritContext _localctx = new InheritContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_inherit);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(T__29);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ReadOnlyContext extends ParserRuleContext {
		public ReadOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadOnly(this);
		}
	}

	public final ReadOnlyContext readOnly() throws RecognitionException {
		ReadOnlyContext _localctx = new ReadOnlyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_readOnly);
		try {
			setState(474);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OperationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SpecialOperationContext specialOperation() {
			return getRuleContext(SpecialOperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_operation);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				returnType();
				setState(477);
				operationRest();
				}
				break;
			case T__28:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				specialOperation();
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

	public static class SpecialOperationContext extends ParserRuleContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SpecialOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecialOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecialOperation(this);
		}
	}

	public final SpecialOperationContext specialOperation() throws RecognitionException {
		SpecialOperationContext _localctx = new SpecialOperationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_specialOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			special();
			setState(483);
			specials();
			setState(484);
			returnType();
			setState(485);
			operationRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialsContext extends ParserRuleContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public SpecialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecials(this);
		}
	}

	public final SpecialsContext specials() throws RecognitionException {
		SpecialsContext _localctx = new SpecialsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_specials);
		try {
			setState(491);
			switch (_input.LA(1)) {
			case T__28:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				special();
				setState(488);
				specials();
				}
				break;
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecial(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OperationRestContext extends ParserRuleContext {
		public OptionalIdentifierContext optionalIdentifier() {
			return getRuleContext(OptionalIdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public OperationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperationRest(this);
		}
	}

	public final OperationRestContext operationRest() throws RecognitionException {
		OperationRestContext _localctx = new OperationRestContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_operationRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			optionalIdentifier();
			setState(496);
			match(T__16);
			setState(497);
			argumentList();
			setState(498);
			match(T__17);
			setState(499);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public OptionalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalIdentifier(this);
		}
	}

	public final OptionalIdentifierContext optionalIdentifier() throws RecognitionException {
		OptionalIdentifierContext _localctx = new OptionalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_optionalIdentifier);
		try {
			setState(503);
			switch (_input.LA(1)) {
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_argumentList);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case T__10:
			case T__16:
			case T__37:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				argument();
				setState(506);
				arguments();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arguments);
		try {
			setState(516);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(T__15);
				setState(512);
				argument();
				setState(513);
				arguments();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public OptionalOrRequiredArgumentContext optionalOrRequiredArgument() {
			return getRuleContext(OptionalOrRequiredArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			extendedAttributeList();
			setState(519);
			optionalOrRequiredArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalOrRequiredArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public OptionalOrRequiredArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalOrRequiredArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalOrRequiredArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalOrRequiredArgument(this);
		}
	}

	public final OptionalOrRequiredArgumentContext optionalOrRequiredArgument() throws RecognitionException {
		OptionalOrRequiredArgumentContext _localctx = new OptionalOrRequiredArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_optionalOrRequiredArgument);
		try {
			setState(530);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(T__37);
				setState(522);
				type();
				setState(523);
				argumentName();
				setState(524);
				default_();
				}
				break;
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				type();
				setState(527);
				ellipsis();
				setState(528);
				argumentName();
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

	public static class ArgumentNameContext extends ParserRuleContext {
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentName(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_argumentName);
		try {
			setState(534);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__42:
			case T__43:
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				argumentNameKeyword();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(IDENTIFIER_WEBIDL);
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

	public static class EllipsisContext extends ParserRuleContext {
		public EllipsisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEllipsis(this);
		}
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ellipsis);
		try {
			setState(538);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(T__38);
				}
				break;
			case T__0:
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__42:
			case T__43:
			case T__65:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IterableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypeContext optionalType() {
			return getRuleContext(OptionalTypeContext.class,0);
		}
		public IterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIterable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIterable(this);
		}
	}

	public final IterableContext iterable() throws RecognitionException {
		IterableContext _localctx = new IterableContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_iterable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__39);
			setState(541);
			match(T__40);
			setState(542);
			type();
			setState(543);
			optionalType();
			setState(544);
			match(T__41);
			setState(545);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalType(this);
		}
	}

	public final OptionalTypeContext optionalType() throws RecognitionException {
		OptionalTypeContext _localctx = new OptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_optionalType);
		try {
			setState(550);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(T__15);
				setState(548);
				type();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ReadWriteMaplikeContext extends ParserRuleContext {
		public MaplikeRestContext maplikeRest() {
			return getRuleContext(MaplikeRestContext.class,0);
		}
		public ReadWriteMaplikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteMaplike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadWriteMaplike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadWriteMaplike(this);
		}
	}

	public final ReadWriteMaplikeContext readWriteMaplike() throws RecognitionException {
		ReadWriteMaplikeContext _localctx = new ReadWriteMaplikeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_readWriteMaplike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			maplikeRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWriteSetlikeContext extends ParserRuleContext {
		public SetlikeRestContext setlikeRest() {
			return getRuleContext(SetlikeRestContext.class,0);
		}
		public ReadWriteSetlikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteSetlike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadWriteSetlike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadWriteSetlike(this);
		}
	}

	public final ReadWriteSetlikeContext readWriteSetlike() throws RecognitionException {
		ReadWriteSetlikeContext _localctx = new ReadWriteSetlikeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_readWriteSetlike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			setlikeRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaplikeRestContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public MaplikeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maplikeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterMaplikeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitMaplikeRest(this);
		}
	}

	public final MaplikeRestContext maplikeRest() throws RecognitionException {
		MaplikeRestContext _localctx = new MaplikeRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_maplikeRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(T__42);
			setState(557);
			match(T__40);
			setState(558);
			type();
			setState(559);
			match(T__15);
			setState(560);
			type();
			setState(561);
			match(T__41);
			setState(562);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetlikeRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SetlikeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setlikeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSetlikeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSetlikeRest(this);
		}
	}

	public final SetlikeRestContext setlikeRest() throws RecognitionException {
		SetlikeRestContext _localctx = new SetlikeRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_setlikeRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__43);
			setState(565);
			match(T__40);
			setState(566);
			type();
			setState(567);
			match(T__41);
			setState(568);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeListContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributesContext extendedAttributes() {
			return getRuleContext(ExtendedAttributesContext.class,0);
		}
		public ExtendedAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeList(this);
		}
	}

	public final ExtendedAttributeListContext extendedAttributeList() throws RecognitionException {
		ExtendedAttributeListContext _localctx = new ExtendedAttributeListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_extendedAttributeList);
		try {
			setState(576);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(T__10);
				setState(571);
				extendedAttribute();
				setState(572);
				extendedAttributes();
				setState(573);
				match(T__11);
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case T__16:
			case T__18:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__39:
			case T__42:
			case T__43:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributesContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributesContext extendedAttributes() {
			return getRuleContext(ExtendedAttributesContext.class,0);
		}
		public ExtendedAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributes(this);
		}
	}

	public final ExtendedAttributesContext extendedAttributes() throws RecognitionException {
		ExtendedAttributesContext _localctx = new ExtendedAttributesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_extendedAttributes);
		try {
			setState(583);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(T__15);
				setState(579);
				extendedAttribute();
				setState(580);
				extendedAttributes();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributeContext extends ParserRuleContext {
		public ExtendedAttributeInnerContext extendedAttributeInner() {
			return getRuleContext(ExtendedAttributeInnerContext.class,0);
		}
		public ExtendedAttributeRestContext extendedAttributeRest() {
			return getRuleContext(ExtendedAttributeRestContext.class,0);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public ExtendedAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttribute(this);
		}
	}

	public final ExtendedAttributeContext extendedAttribute() throws RecognitionException {
		ExtendedAttributeContext _localctx = new ExtendedAttributeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_extendedAttribute);
		try {
			setState(603);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(T__16);
				setState(586);
				extendedAttributeInner();
				setState(587);
				match(T__17);
				setState(588);
				extendedAttributeRest();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(T__10);
				setState(591);
				extendedAttributeInner();
				setState(592);
				match(T__11);
				setState(593);
				extendedAttributeRest();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(T__2);
				setState(596);
				extendedAttributeInner();
				setState(597);
				match(T__3);
				setState(598);
				extendedAttributeRest();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__12:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				other();
				setState(601);
				extendedAttributeRest();
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

	public static class ExtendedAttributeRestContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeRest(this);
		}
	}

	public final ExtendedAttributeRestContext extendedAttributeRest() throws RecognitionException {
		ExtendedAttributeRestContext _localctx = new ExtendedAttributeRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_extendedAttributeRest);
		try {
			setState(607);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__14:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				extendedAttribute();
				}
				break;
			case T__11:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributeInnerContext extends ParserRuleContext {
		public List<ExtendedAttributeInnerContext> extendedAttributeInner() {
			return getRuleContexts(ExtendedAttributeInnerContext.class);
		}
		public ExtendedAttributeInnerContext extendedAttributeInner(int i) {
			return getRuleContext(ExtendedAttributeInnerContext.class,i);
		}
		public OtherOrCommaContext otherOrComma() {
			return getRuleContext(OtherOrCommaContext.class,0);
		}
		public ExtendedAttributeInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeInner(this);
		}
	}

	public final ExtendedAttributeInnerContext extendedAttributeInner() throws RecognitionException {
		ExtendedAttributeInnerContext _localctx = new ExtendedAttributeInnerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_extendedAttributeInner);
		try {
			setState(628);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(T__16);
				setState(610);
				extendedAttributeInner();
				setState(611);
				match(T__17);
				setState(612);
				extendedAttributeInner();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(T__10);
				setState(615);
				extendedAttributeInner();
				setState(616);
				match(T__11);
				setState(617);
				extendedAttributeInner();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(T__2);
				setState(620);
				extendedAttributeInner();
				setState(621);
				match(T__3);
				setState(622);
				extendedAttributeInner();
				}
				break;
			case T__0:
			case T__1:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__12:
			case T__14:
			case T__15:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				otherOrComma();
				setState(625);
				extendedAttributeInner();
				}
				break;
			case T__3:
			case T__11:
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode INTEGER_WEBIDL() { return getToken(WebIDLParser.INTEGER_WEBIDL, 0); }
		public TerminalNode FLOAT_WEBIDL() { return getToken(WebIDLParser.FLOAT_WEBIDL, 0); }
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public TerminalNode OTHER_WEBIDL() { return getToken(WebIDLParser.OTHER_WEBIDL, 0); }
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public BufferRelatedTypeContext bufferRelatedType() {
			return getRuleContext(BufferRelatedTypeContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOther(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_other);
		try {
			setState(671);
			switch (_input.LA(1)) {
			case INTEGER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(INTEGER_WEBIDL);
				}
				break;
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(FLOAT_WEBIDL);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				match(STRING_WEBIDL);
				}
				break;
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				match(OTHER_WEBIDL);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(635);
				match(T__44);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(636);
				match(T__24);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 8);
				{
				setState(637);
				match(T__45);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 9);
				{
				setState(638);
				match(T__38);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(639);
				match(T__12);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 11);
				{
				setState(640);
				match(T__4);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 12);
				{
				setState(641);
				match(T__40);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 13);
				{
				setState(642);
				match(T__9);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 14);
				{
				setState(643);
				match(T__41);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 15);
				{
				setState(644);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 16);
				{
				setState(645);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 17);
				{
				setState(646);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 18);
				{
				setState(647);
				match(T__49);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 19);
				{
				setState(648);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 20);
				{
				setState(649);
				match(T__26);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 21);
				{
				setState(650);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 22);
				{
				setState(651);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 23);
				{
				setState(652);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 24);
				{
				setState(653);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 25);
				{
				setState(654);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 26);
				{
				setState(655);
				match(T__55);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 27);
				{
				setState(656);
				match(T__23);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 28);
				{
				setState(657);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 29);
				{
				setState(658);
				match(T__57);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 30);
				{
				setState(659);
				match(T__21);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 31);
				{
				setState(660);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 32);
				{
				setState(661);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 33);
				{
				setState(662);
				match(T__60);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 34);
				{
				setState(663);
				match(T__37);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 35);
				{
				setState(664);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 36);
				{
				setState(665);
				match(T__62);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 37);
				{
				setState(666);
				match(T__22);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 38);
				{
				setState(667);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 39);
				{
				setState(668);
				match(T__64);
				}
				break;
			case T__0:
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__42:
			case T__43:
			case T__65:
				enterOuterAlt(_localctx, 40);
				{
				setState(669);
				argumentNameKeyword();
				}
				break;
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
				enterOuterAlt(_localctx, 41);
				{
				setState(670);
				bufferRelatedType();
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

	public static class ArgumentNameKeywordContext extends ParserRuleContext {
		public ArgumentNameKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNameKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentNameKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentNameKeyword(this);
		}
	}

	public final ArgumentNameKeywordContext argumentNameKeyword() throws RecognitionException {
		ArgumentNameKeywordContext _localctx = new ArgumentNameKeywordContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_argumentNameKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__42) | (1L << T__43))) != 0) || _la==T__65) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OtherOrCommaContext extends ParserRuleContext {
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public OtherOrCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherOrComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOtherOrComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOtherOrComma(this);
		}
	}

	public final OtherOrCommaContext otherOrComma() throws RecognitionException {
		OtherOrCommaContext _localctx = new OtherOrCommaContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_otherOrComma);
		try {
			setState(677);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__12:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
			case IDENTIFIER_WEBIDL:
			case STRING_WEBIDL:
			case OTHER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				other();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(T__15);
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
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_type);
		try {
			setState(683);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				singleType();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				unionType();
				setState(681);
				null_();
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

	public static class SingleTypeContext extends ParserRuleContext {
		public NonAnyTypeContext nonAnyType() {
			return getRuleContext(NonAnyTypeContext.class,0);
		}
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSingleType(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_singleType);
		try {
			setState(687);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				nonAnyType();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(T__52);
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

	public static class UnionTypeContext extends ParserRuleContext {
		public List<UnionMemberTypeContext> unionMemberType() {
			return getRuleContexts(UnionMemberTypeContext.class);
		}
		public UnionMemberTypeContext unionMemberType(int i) {
			return getRuleContext(UnionMemberTypeContext.class,i);
		}
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionType(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_unionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(T__16);
			setState(690);
			unionMemberType();
			setState(691);
			match(T__60);
			setState(692);
			unionMemberType();
			setState(693);
			unionMemberTypes();
			setState(694);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionMemberTypeContext extends ParserRuleContext {
		public NonAnyTypeContext nonAnyType() {
			return getRuleContext(NonAnyTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public UnionMemberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionMemberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionMemberType(this);
		}
	}

	public final UnionMemberTypeContext unionMemberType() throws RecognitionException {
		UnionMemberTypeContext _localctx = new UnionMemberTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unionMemberType);
		try {
			setState(700);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				nonAnyType();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				unionType();
				setState(698);
				null_();
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

	public static class UnionMemberTypesContext extends ParserRuleContext {
		public UnionMemberTypeContext unionMemberType() {
			return getRuleContext(UnionMemberTypeContext.class,0);
		}
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public UnionMemberTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionMemberTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionMemberTypes(this);
		}
	}

	public final UnionMemberTypesContext unionMemberTypes() throws RecognitionException {
		UnionMemberTypesContext _localctx = new UnionMemberTypesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_unionMemberTypes);
		try {
			setState(707);
			switch (_input.LA(1)) {
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(T__60);
				setState(703);
				unionMemberType();
				setState(704);
				unionMemberTypes();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class NonAnyTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public PromiseTypeContext promiseType() {
			return getRuleContext(PromiseTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BufferRelatedTypeContext bufferRelatedType() {
			return getRuleContext(BufferRelatedTypeContext.class,0);
		}
		public NonAnyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAnyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNonAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNonAnyType(this);
		}
	}

	public final NonAnyTypeContext nonAnyType() throws RecognitionException {
		NonAnyTypeContext _localctx = new NonAnyTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nonAnyType);
		try {
			setState(744);
			switch (_input.LA(1)) {
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__59:
			case T__62:
			case T__63:
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				primitiveType();
				setState(710);
				null_();
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				promiseType();
				setState(713);
				null_();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				match(T__47);
				setState(716);
				null_();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				match(T__48);
				setState(718);
				null_();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 5);
				{
				setState(719);
				match(T__51);
				setState(720);
				null_();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 6);
				{
				setState(721);
				match(IDENTIFIER_WEBIDL);
				setState(722);
				null_();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 7);
				{
				setState(723);
				match(T__61);
				setState(724);
				match(T__40);
				setState(725);
				type();
				setState(726);
				match(T__41);
				setState(727);
				null_();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 8);
				{
				setState(729);
				match(T__58);
				setState(730);
				null_();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 9);
				{
				setState(731);
				match(T__50);
				setState(732);
				null_();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 10);
				{
				setState(733);
				match(T__66);
				setState(734);
				null_();
				}
				break;
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
				enterOuterAlt(_localctx, 11);
				{
				setState(735);
				bufferRelatedType();
				setState(736);
				null_();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 12);
				{
				setState(738);
				match(T__49);
				setState(739);
				match(T__40);
				setState(740);
				type();
				setState(741);
				match(T__41);
				setState(742);
				null_();
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

	public static class BufferRelatedTypeContext extends ParserRuleContext {
		public BufferRelatedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bufferRelatedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterBufferRelatedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitBufferRelatedType(this);
		}
	}

	public final BufferRelatedTypeContext bufferRelatedType() throws RecognitionException {
		BufferRelatedTypeContext _localctx = new BufferRelatedTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_bufferRelatedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (T__72 - 68)) | (1L << (T__73 - 68)) | (1L << (T__74 - 68)) | (1L << (T__75 - 68)) | (1L << (T__76 - 68)) | (1L << (T__77 - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConstTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ConstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConstType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConstType(this);
		}
	}

	public final ConstTypeContext constType() throws RecognitionException {
		ConstTypeContext _localctx = new ConstTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_constType);
		try {
			setState(753);
			switch (_input.LA(1)) {
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__59:
			case T__62:
			case T__63:
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				primitiveType();
				setState(749);
				null_();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				match(IDENTIFIER_WEBIDL);
				setState(752);
				null_();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public UnsignedIntegerTypeContext unsignedIntegerType() {
			return getRuleContext(UnsignedIntegerTypeContext.class,0);
		}
		public UnrestrictedFloatTypeContext unrestrictedFloatType() {
			return getRuleContext(UnrestrictedFloatTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_primitiveType);
		try {
			setState(760);
			switch (_input.LA(1)) {
			case T__57:
			case T__62:
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				unsignedIntegerType();
				}
				break;
			case T__55:
			case T__56:
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				unrestrictedFloatType();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				match(T__54);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 5);
				{
				setState(759);
				match(T__59);
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

	public static class UnrestrictedFloatTypeContext extends ParserRuleContext {
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public UnrestrictedFloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedFloatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnrestrictedFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnrestrictedFloatType(this);
		}
	}

	public final UnrestrictedFloatTypeContext unrestrictedFloatType() throws RecognitionException {
		UnrestrictedFloatTypeContext _localctx = new UnrestrictedFloatTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unrestrictedFloatType);
		try {
			setState(765);
			switch (_input.LA(1)) {
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(T__65);
				setState(763);
				floatType();
				}
				break;
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				floatType();
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

	public static class FloatTypeContext extends ParserRuleContext {
		public FloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitFloatType(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_la = _input.LA(1);
			if ( !(_la==T__55 || _la==T__56) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class UnsignedIntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public UnsignedIntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedIntegerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnsignedIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnsignedIntegerType(this);
		}
	}

	public final UnsignedIntegerTypeContext unsignedIntegerType() throws RecognitionException {
		UnsignedIntegerTypeContext _localctx = new UnsignedIntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_unsignedIntegerType);
		try {
			setState(772);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(T__63);
				setState(770);
				integerType();
				}
				break;
			case T__57:
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				integerType();
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public OptionalLongContext optionalLong() {
			return getRuleContext(OptionalLongContext.class,0);
		}
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIntegerType(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_integerType);
		try {
			setState(777);
			switch (_input.LA(1)) {
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(T__62);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(T__57);
				setState(776);
				optionalLong();
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

	public static class OptionalLongContext extends ParserRuleContext {
		public OptionalLongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalLong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalLong(this);
		}
	}

	public final OptionalLongContext optionalLong() throws RecognitionException {
		OptionalLongContext _localctx = new OptionalLongContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_optionalLong);
		try {
			setState(781);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(T__57);
				}
				break;
			case T__0:
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__38:
			case T__39:
			case T__41:
			case T__42:
			case T__43:
			case T__46:
			case T__60:
			case T__65:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PromiseTypeContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public PromiseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promiseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPromiseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPromiseType(this);
		}
	}

	public final PromiseTypeContext promiseType() throws RecognitionException {
		PromiseTypeContext _localctx = new PromiseTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_promiseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(T__78);
			setState(784);
			match(T__40);
			setState(785);
			returnType();
			setState(786);
			match(T__41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_Context extends ParserRuleContext {
		public Null_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNull_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNull_(this);
		}
	}

	public final Null_Context null_() throws RecognitionException {
		Null_Context _localctx = new Null_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_null_);
		try {
			setState(790);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(T__46);
				}
				break;
			case T__0:
			case T__1:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__38:
			case T__39:
			case T__41:
			case T__42:
			case T__43:
			case T__60:
			case T__65:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_returnType);
		try {
			setState(794);
			switch (_input.LA(1)) {
			case T__16:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				type();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(T__64);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(IDENTIFIER_WEBIDL);
			setState(797);
			identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIdentifiers(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifiers);
		try {
			setState(803);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(T__15);
				setState(800);
				match(IDENTIFIER_WEBIDL);
				setState(801);
				identifiers();
				}
				break;
			case T__3:
			case T__11:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExtendedAttributeNoArgsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeNoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNoArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNoArgs(this);
		}
	}

	public final ExtendedAttributeNoArgsContext extendedAttributeNoArgs() throws RecognitionException {
		ExtendedAttributeNoArgsContext _localctx = new ExtendedAttributeNoArgsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_extendedAttributeNoArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(IDENTIFIER_WEBIDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeArgListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExtendedAttributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeArgList(this);
		}
	}

	public final ExtendedAttributeArgListContext extendedAttributeArgList() throws RecognitionException {
		ExtendedAttributeArgListContext _localctx = new ExtendedAttributeArgListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_extendedAttributeArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(IDENTIFIER_WEBIDL);
			setState(808);
			match(T__16);
			setState(809);
			argumentList();
			setState(810);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ExtendedAttributeIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeIdent(this);
		}
	}

	public final ExtendedAttributeIdentContext extendedAttributeIdent() throws RecognitionException {
		ExtendedAttributeIdentContext _localctx = new ExtendedAttributeIdentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_extendedAttributeIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(IDENTIFIER_WEBIDL);
			setState(813);
			match(T__9);
			setState(814);
			match(IDENTIFIER_WEBIDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeIdentListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExtendedAttributeIdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeIdentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeIdentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeIdentList(this);
		}
	}

	public final ExtendedAttributeIdentListContext extendedAttributeIdentList() throws RecognitionException {
		ExtendedAttributeIdentListContext _localctx = new ExtendedAttributeIdentListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_extendedAttributeIdentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(IDENTIFIER_WEBIDL);
			setState(817);
			match(T__9);
			setState(818);
			match(T__16);
			setState(819);
			identifierList();
			setState(820);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeNamedArgListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExtendedAttributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNamedArgList(this);
		}
	}

	public final ExtendedAttributeNamedArgListContext extendedAttributeNamedArgList() throws RecognitionException {
		ExtendedAttributeNamedArgListContext _localctx = new ExtendedAttributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_extendedAttributeNamedArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(IDENTIFIER_WEBIDL);
			setState(823);
			match(T__9);
			setState(824);
			match(IDENTIFIER_WEBIDL);
			setState(825);
			match(T__16);
			setState(826);
			argumentList();
			setState(827);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u0340\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00d1"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d9\n\4\3\5\3\5\3\5\3\5\5\5\u00df\n"+
		"\5\3\6\3\6\5\6\u00e3\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u00fa\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0108\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0114\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\5\21\u012d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u0139\n\23\3\24\3\24\3\24\3\24\5\24\u013f\n\24\3\25\3"+
		"\25\3\25\5\25\u0144\n\25\3\26\3\26\3\26\5\26\u0149\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u0158\n\31\3\32"+
		"\3\32\3\32\5\32\u015d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u017c\n\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\5#\u018b\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0196\n$"+
		"\3%\3%\3%\3%\3%\3%\5%\u019e\n%\3&\3&\3&\3&\5&\u01a4\n&\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\5(\u01b0\n(\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u01bb\n*"+
		"\3+\3+\3+\3,\3,\3,\5,\u01c3\n,\3-\3-\3-\3-\3-\5-\u01ca\n-\3.\3.\3.\3."+
		"\3.\3/\3/\5/\u01d3\n/\3\60\3\60\3\61\3\61\5\61\u01d9\n\61\3\62\3\62\5"+
		"\62\u01dd\n\62\3\63\3\63\3\63\3\63\5\63\u01e3\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\5\65\u01ee\n\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\58\u01fa\n8\39\39\39\39\59\u0200\n9\3:\3:\3:\3:\3:\5"+
		":\u0207\n:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0215\n<\3=\3=\5=\u0219"+
		"\n=\3>\3>\5>\u021d\n>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\5@\u0229\n@\3A\3A"+
		"\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\5E"+
		"\u0243\nE\3F\3F\3F\3F\3F\5F\u024a\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\5G\u025e\nG\3H\3H\5H\u0262\nH\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0277\nI\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u02a2\nJ\3K\3K\3L\3L\5L\u02a8"+
		"\nL\3M\3M\3M\3M\5M\u02ae\nM\3N\3N\5N\u02b2\nN\3O\3O\3O\3O\3O\3O\3O\3P"+
		"\3P\3P\3P\5P\u02bf\nP\3Q\3Q\3Q\3Q\3Q\5Q\u02c6\nQ\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\5R\u02eb\nR\3S\3S\3T\3T\3T\3T\3T\5T\u02f4\nT\3U\3U\3U"+
		"\3U\3U\5U\u02fb\nU\3V\3V\3V\5V\u0300\nV\3W\3W\3X\3X\3X\5X\u0307\nX\3Y"+
		"\3Y\3Y\5Y\u030c\nY\3Z\3Z\5Z\u0310\nZ\3[\3[\3[\3[\3[\3\\\3\\\5\\\u0319"+
		"\n\\\3]\3]\5]\u031d\n]\3^\3^\3^\3_\3_\3_\3_\5_\u0326\n_\3`\3`\3a\3a\3"+
		"a\3a\3a\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\2\2e\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\2\b\3\2\31\32\4\2\33\35SS\4\2\37\37%\'\13\2\3"+
		"\4\t\13\21\21\25\27\36\"$\'**-.DD\3\2FP\3\2:;\u0365\2\u00c8\3\2\2\2\4"+
		"\u00d0\3\2\2\2\6\u00d8\3\2\2\2\b\u00de\3\2\2\2\n\u00e2\3\2\2\2\f\u00e4"+
		"\3\2\2\2\16\u00ec\3\2\2\2\20\u00f4\3\2\2\2\22\u00f9\3\2\2\2\24\u00fb\3"+
		"\2\2\2\26\u0107\3\2\2\2\30\u0113\3\2\2\2\32\u0115\3\2\2\2\34\u0122\3\2"+
		"\2\2\36\u0124\3\2\2\2 \u012c\3\2\2\2\"\u012e\3\2\2\2$\u0138\3\2\2\2&\u013e"+
		"\3\2\2\2(\u0143\3\2\2\2*\u0148\3\2\2\2,\u014a\3\2\2\2.\u0151\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u015c\3\2\2\2\64\u015e\3\2\2\2\66\u0166\3\2\2\28\u016b"+
		"\3\2\2\2:\u0170\3\2\2\2<\u017b\3\2\2\2>\u017d\3\2\2\2@\u017f\3\2\2\2B"+
		"\u0181\3\2\2\2D\u018a\3\2\2\2F\u0195\3\2\2\2H\u019d\3\2\2\2J\u01a3\3\2"+
		"\2\2L\u01a5\3\2\2\2N\u01af\3\2\2\2P\u01b1\3\2\2\2R\u01ba\3\2\2\2T\u01bc"+
		"\3\2\2\2V\u01c2\3\2\2\2X\u01c9\3\2\2\2Z\u01cb\3\2\2\2\\\u01d2\3\2\2\2"+
		"^\u01d4\3\2\2\2`\u01d8\3\2\2\2b\u01dc\3\2\2\2d\u01e2\3\2\2\2f\u01e4\3"+
		"\2\2\2h\u01ed\3\2\2\2j\u01ef\3\2\2\2l\u01f1\3\2\2\2n\u01f9\3\2\2\2p\u01ff"+
		"\3\2\2\2r\u0206\3\2\2\2t\u0208\3\2\2\2v\u0214\3\2\2\2x\u0218\3\2\2\2z"+
		"\u021c\3\2\2\2|\u021e\3\2\2\2~\u0228\3\2\2\2\u0080\u022a\3\2\2\2\u0082"+
		"\u022c\3\2\2\2\u0084\u022e\3\2\2\2\u0086\u0236\3\2\2\2\u0088\u0242\3\2"+
		"\2\2\u008a\u0249\3\2\2\2\u008c\u025d\3\2\2\2\u008e\u0261\3\2\2\2\u0090"+
		"\u0276\3\2\2\2\u0092\u02a1\3\2\2\2\u0094\u02a3\3\2\2\2\u0096\u02a7\3\2"+
		"\2\2\u0098\u02ad\3\2\2\2\u009a\u02b1\3\2\2\2\u009c\u02b3\3\2\2\2\u009e"+
		"\u02be\3\2\2\2\u00a0\u02c5\3\2\2\2\u00a2\u02ea\3\2\2\2\u00a4\u02ec\3\2"+
		"\2\2\u00a6\u02f3\3\2\2\2\u00a8\u02fa\3\2\2\2\u00aa\u02ff\3\2\2\2\u00ac"+
		"\u0301\3\2\2\2\u00ae\u0306\3\2\2\2\u00b0\u030b\3\2\2\2\u00b2\u030f\3\2"+
		"\2\2\u00b4\u0311\3\2\2\2\u00b6\u0318\3\2\2\2\u00b8\u031c\3\2\2\2\u00ba"+
		"\u031e\3\2\2\2\u00bc\u0325\3\2\2\2\u00be\u0327\3\2\2\2\u00c0\u0329\3\2"+
		"\2\2\u00c2\u032e\3\2\2\2\u00c4\u0332\3\2\2\2\u00c6\u0338\3\2\2\2\u00c8"+
		"\u00c9\5\4\3\2\u00c9\u00ca\7\2\2\3\u00ca\3\3\2\2\2\u00cb\u00cc\5\u0088"+
		"E\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\5\4\3\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\5\3\2\2\2"+
		"\u00d2\u00d9\5\b\5\2\u00d3\u00d9\5\20\t\2\u00d4\u00d9\5\32\16\2\u00d5"+
		"\u00d9\5,\27\2\u00d6\u00d9\5\66\34\2\u00d7\u00d9\58\35\2\u00d8\u00d2\3"+
		"\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\7\3\2\2\2\u00da\u00db\7\3\2\2"+
		"\u00db\u00df\5\n\6\2\u00dc\u00df\5\f\7\2\u00dd\u00df\5\16\b\2\u00de\u00da"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\t\3\2\2\2\u00e0"+
		"\u00e3\5\64\33\2\u00e1\u00e3\5\f\7\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\13\3\2\2\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7"+
		"\5(\25\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\7\6\2\2"+
		"\u00ea\u00eb\7\7\2\2\u00eb\r\3\2\2\2\u00ec\u00ed\7\b\2\2\u00ed\u00ee\7"+
		"T\2\2\u00ee\u00ef\5*\26\2\u00ef\u00f0\7\5\2\2\u00f0\u00f1\5\26\f\2\u00f1"+
		"\u00f2\7\6\2\2\u00f2\u00f3\7\7\2\2\u00f3\17\3\2\2\2\u00f4\u00f5\7\t\2"+
		"\2\u00f5\u00f6\5\22\n\2\u00f6\21\3\2\2\2\u00f7\u00fa\5\24\13\2\u00f8\u00fa"+
		"\5\"\22\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\23\3\2\2\2\u00fb"+
		"\u00fc\7\4\2\2\u00fc\u00fd\7T\2\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\5\26"+
		"\f\2\u00ff\u0100\7\6\2\2\u0100\u0101\7\7\2\2\u0101\25\3\2\2\2\u0102\u0103"+
		"\5\u0088E\2\u0103\u0104\5\30\r\2\u0104\u0105\5\26\f\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\27\3\2\2\2\u0109\u0114\5:\36\2\u010a\u0114\5d\63\2\u010b\u0114\5B\"\2"+
		"\u010c\u0114\5L\'\2\u010d\u0114\5P)\2\u010e\u0114\5|?\2\u010f\u0114\5"+
		"T+\2\u0110\u0114\5X-\2\u0111\u0114\5\u0080A\2\u0112\u0114\5\u0082B\2\u0113"+
		"\u0109\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2"+
		"\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\31\3\2\2"+
		"\2\u0115\u0116\7\n\2\2\u0116\u0117\7T\2\2\u0117\u0118\5(\25\2\u0118\u0119"+
		"\7\5\2\2\u0119\u011a\5\34\17\2\u011a\u011b\7\6\2\2\u011b\u011c\7\7\2\2"+
		"\u011c\33\3\2\2\2\u011d\u011e\5\u0088E\2\u011e\u011f\5\36\20\2\u011f\u0120"+
		"\5\34\17\2\u0120\u0123\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\35\3\2\2\2\u0124\u0125\5 \21\2\u0125\u0126"+
		"\5\u0098M\2\u0126\u0127\7T\2\2\u0127\u0128\5$\23\2\u0128\u0129\7\7\2\2"+
		"\u0129\37\3\2\2\2\u012a\u012d\7\13\2\2\u012b\u012d\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012b\3\2\2\2\u012d!\3\2\2\2\u012e\u012f\7\n\2\2\u012f"+
		"\u0130\7T\2\2\u0130\u0131\7\5\2\2\u0131\u0132\5\34\17\2\u0132\u0133\7"+
		"\6\2\2\u0133\u0134\7\7\2\2\u0134#\3\2\2\2\u0135\u0136\7\f\2\2\u0136\u0139"+
		"\5&\24\2\u0137\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"%\3\2\2\2\u013a\u013f\5<\37\2\u013b\u013f\7U\2\2\u013c\u013d\7\r\2\2\u013d"+
		"\u013f\7\16\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3"+
		"\2\2\2\u013f\'\3\2\2\2\u0140\u0141\7\17\2\2\u0141\u0144\7T\2\2\u0142\u0144"+
		"\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0142\3\2\2\2\u0144)\3\2\2\2\u0145"+
		"\u0146\7\20\2\2\u0146\u0149\7T\2\2\u0147\u0149\3\2\2\2\u0148\u0145\3\2"+
		"\2\2\u0148\u0147\3\2\2\2\u0149+\3\2\2\2\u014a\u014b\7\21\2\2\u014b\u014c"+
		"\7T\2\2\u014c\u014d\7\5\2\2\u014d\u014e\5.\30\2\u014e\u014f\7\6\2\2\u014f"+
		"\u0150\7\7\2\2\u0150-\3\2\2\2\u0151\u0152\7U\2\2\u0152\u0153\5\60\31\2"+
		"\u0153/\3\2\2\2\u0154\u0155\7\22\2\2\u0155\u0158\5\62\32\2\u0156\u0158"+
		"\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0156\3\2\2\2\u0158\61\3\2\2\2\u0159"+
		"\u015a\7U\2\2\u015a\u015d\5\60\31\2\u015b\u015d\3\2\2\2\u015c\u0159\3"+
		"\2\2\2\u015c\u015b\3\2\2\2\u015d\63\3\2\2\2\u015e\u015f\7T\2\2\u015f\u0160"+
		"\7\f\2\2\u0160\u0161\5\u00b8]\2\u0161\u0162\7\23\2\2\u0162\u0163\5p9\2"+
		"\u0163\u0164\7\24\2\2\u0164\u0165\7\7\2\2\u0165\65\3\2\2\2\u0166\u0167"+
		"\7\25\2\2\u0167\u0168\5\u0098M\2\u0168\u0169\7T\2\2\u0169\u016a\7\7\2"+
		"\2\u016a\67\3\2\2\2\u016b\u016c\7T\2\2\u016c\u016d\7\26\2\2\u016d\u016e"+
		"\7T\2\2\u016e\u016f\7\7\2\2\u016f9\3\2\2\2\u0170\u0171\7\27\2\2\u0171"+
		"\u0172\5\u00a6T\2\u0172\u0173\7T\2\2\u0173\u0174\7\f\2\2\u0174\u0175\5"+
		"<\37\2\u0175\u0176\7\7\2\2\u0176;\3\2\2\2\u0177\u017c\5> \2\u0178\u017c"+
		"\5@!\2\u0179\u017c\7R\2\2\u017a\u017c\7\30\2\2\u017b\u0177\3\2\2\2\u017b"+
		"\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c=\3\2\2\2"+
		"\u017d\u017e\t\2\2\2\u017e?\3\2\2\2\u017f\u0180\t\3\2\2\u0180A\3\2\2\2"+
		"\u0181\u0182\7\36\2\2\u0182\u0183\5D#\2\u0183C\3\2\2\2\u0184\u018b\5l"+
		"\67\2\u0185\u0186\7\f\2\2\u0186\u0187\5F$\2\u0187\u0188\7\7\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u018b\7\7\2\2\u018a\u0184\3\2\2\2\u018a\u0185\3\2"+
		"\2\2\u018a\u0189\3\2\2\2\u018bE\3\2\2\2\u018c\u018d\7\5\2\2\u018d\u018e"+
		"\5H%\2\u018e\u018f\7\6\2\2\u018f\u0196\3\2\2\2\u0190\u0191\7\r\2\2\u0191"+
		"\u0192\5J&\2\u0192\u0193\7\16\2\2\u0193\u0196\3\2\2\2\u0194\u0196\7T\2"+
		"\2\u0195\u018c\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0194\3\2\2\2\u0196G"+
		"\3\2\2\2\u0197\u019e\7\37\2\2\u0198\u0199\7 \2\2\u0199\u019e\5\u00bc_"+
		"\2\u019a\u019b\7T\2\2\u019b\u019e\5\u00bc_\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u019a\3\2\2\2\u019d\u019c\3\2"+
		"\2\2\u019eI\3\2\2\2\u019f\u01a4\7\37\2\2\u01a0\u01a1\7T\2\2\u01a1\u01a4"+
		"\5\u00bc_\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2"+
		"\2\u01a3\u01a2\3\2\2\2\u01a4K\3\2\2\2\u01a5\u01a6\7!\2\2\u01a6\u01a7\5"+
		"N(\2\u01a7M\3\2\2\2\u01a8\u01a9\5b\62\2\u01a9\u01aa\5Z.\2\u01aa\u01b0"+
		"\3\2\2\2\u01ab\u01ac\5\u00b8]\2\u01ac\u01ad\5l\67\2\u01ad\u01b0\3\2\2"+
		"\2\u01ae\u01b0\7\7\2\2\u01af\u01a8\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ae"+
		"\3\2\2\2\u01b0O\3\2\2\2\u01b1\u01b2\7\"\2\2\u01b2\u01b3\5R*\2\u01b3Q\3"+
		"\2\2\2\u01b4\u01b5\5b\62\2\u01b5\u01b6\5Z.\2\u01b6\u01bb\3\2\2\2\u01b7"+
		"\u01b8\5\u00b8]\2\u01b8\u01b9\5l\67\2\u01b9\u01bb\3\2\2\2\u01ba\u01b4"+
		"\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bbS\3\2\2\2\u01bc\u01bd\7#\2\2\u01bd\u01be"+
		"\5V,\2\u01beU\3\2\2\2\u01bf\u01c3\5Z.\2\u01c0\u01c3\5\u0080A\2\u01c1\u01c3"+
		"\5\u0082B\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2"+
		"\2\u01c3W\3\2\2\2\u01c4\u01c5\7 \2\2\u01c5\u01c6\5b\62\2\u01c6\u01c7\5"+
		"Z.\2\u01c7\u01ca\3\2\2\2\u01c8\u01ca\5Z.\2\u01c9\u01c4\3\2\2\2\u01c9\u01c8"+
		"\3\2\2\2\u01caY\3\2\2\2\u01cb\u01cc\7$\2\2\u01cc\u01cd\5\u0098M\2\u01cd"+
		"\u01ce\5\\/\2\u01ce\u01cf\7\7\2\2\u01cf[\3\2\2\2\u01d0\u01d3\5^\60\2\u01d1"+
		"\u01d3\7T\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3]\3\2\2\2\u01d4"+
		"\u01d5\7\13\2\2\u01d5_\3\2\2\2\u01d6\u01d9\7 \2\2\u01d7\u01d9\3\2\2\2"+
		"\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9a\3\2\2\2\u01da\u01dd\7"+
		"#\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"c\3\2\2\2\u01de\u01df\5\u00b8]\2\u01df\u01e0\5l\67\2\u01e0\u01e3\3\2\2"+
		"\2\u01e1\u01e3\5f\64\2\u01e2\u01de\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3e"+
		"\3\2\2\2\u01e4\u01e5\5j\66\2\u01e5\u01e6\5h\65\2\u01e6\u01e7\5\u00b8]"+
		"\2\u01e7\u01e8\5l\67\2\u01e8g\3\2\2\2\u01e9\u01ea\5j\66\2\u01ea\u01eb"+
		"\5h\65\2\u01eb\u01ee\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01eei\3\2\2\2\u01ef\u01f0\t\4\2\2\u01f0k\3\2\2\2\u01f1"+
		"\u01f2\5n8\2\u01f2\u01f3\7\23\2\2\u01f3\u01f4\5p9\2\u01f4\u01f5\7\24\2"+
		"\2\u01f5\u01f6\7\7\2\2\u01f6m\3\2\2\2\u01f7\u01fa\7T\2\2\u01f8\u01fa\3"+
		"\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fao\3\2\2\2\u01fb\u01fc"+
		"\5t;\2\u01fc\u01fd\5r:\2\u01fd\u0200\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fb\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200q\3\2\2\2\u0201\u0202\7\22\2\2"+
		"\u0202\u0203\5t;\2\u0203\u0204\5r:\2\u0204\u0207\3\2\2\2\u0205\u0207\3"+
		"\2\2\2\u0206\u0201\3\2\2\2\u0206\u0205\3\2\2\2\u0207s\3\2\2\2\u0208\u0209"+
		"\5\u0088E\2\u0209\u020a\5v<\2\u020au\3\2\2\2\u020b\u020c\7(\2\2\u020c"+
		"\u020d\5\u0098M\2\u020d\u020e\5x=\2\u020e\u020f\5$\23\2\u020f\u0215\3"+
		"\2\2\2\u0210\u0211\5\u0098M\2\u0211\u0212\5z>\2\u0212\u0213\5x=\2\u0213"+
		"\u0215\3\2\2\2\u0214\u020b\3\2\2\2\u0214\u0210\3\2\2\2\u0215w\3\2\2\2"+
		"\u0216\u0219\5\u0094K\2\u0217\u0219\7T\2\2\u0218\u0216\3\2\2\2\u0218\u0217"+
		"\3\2\2\2\u0219y\3\2\2\2\u021a\u021d\7)\2\2\u021b\u021d\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021b\3\2\2\2\u021d{\3\2\2\2\u021e\u021f\7*\2\2\u021f\u0220"+
		"\7+\2\2\u0220\u0221\5\u0098M\2\u0221\u0222\5~@\2\u0222\u0223\7,\2\2\u0223"+
		"\u0224\7\7\2\2\u0224}\3\2\2\2\u0225\u0226\7\22\2\2\u0226\u0229\5\u0098"+
		"M\2\u0227\u0229\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0227\3\2\2\2\u0229"+
		"\177\3\2\2\2\u022a\u022b\5\u0084C\2\u022b\u0081\3\2\2\2\u022c\u022d\5"+
		"\u0086D\2\u022d\u0083\3\2\2\2\u022e\u022f\7-\2\2\u022f\u0230\7+\2\2\u0230"+
		"\u0231\5\u0098M\2\u0231\u0232\7\22\2\2\u0232\u0233\5\u0098M\2\u0233\u0234"+
		"\7,\2\2\u0234\u0235\7\7\2\2\u0235\u0085\3\2\2\2\u0236\u0237\7.\2\2\u0237"+
		"\u0238\7+\2\2\u0238\u0239\5\u0098M\2\u0239\u023a\7,\2\2\u023a\u023b\7"+
		"\7\2\2\u023b\u0087\3\2\2\2\u023c\u023d\7\r\2\2\u023d\u023e\5\u008cG\2"+
		"\u023e\u023f\5\u008aF\2\u023f\u0240\7\16\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u023c\3\2\2\2\u0242\u0241\3\2\2\2\u0243\u0089\3\2"+
		"\2\2\u0244\u0245\7\22\2\2\u0245\u0246\5\u008cG\2\u0246\u0247\5\u008aF"+
		"\2\u0247\u024a\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0244\3\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u008b\3\2\2\2\u024b\u024c\7\23\2\2\u024c\u024d\5\u0090"+
		"I\2\u024d\u024e\7\24\2\2\u024e\u024f\5\u008eH\2\u024f\u025e\3\2\2\2\u0250"+
		"\u0251\7\r\2\2\u0251\u0252\5\u0090I\2\u0252\u0253\7\16\2\2\u0253\u0254"+
		"\5\u008eH\2\u0254\u025e\3\2\2\2\u0255\u0256\7\5\2\2\u0256\u0257\5\u0090"+
		"I\2\u0257\u0258\7\6\2\2\u0258\u0259\5\u008eH\2\u0259\u025e\3\2\2\2\u025a"+
		"\u025b\5\u0092J\2\u025b\u025c\5\u008eH\2\u025c\u025e\3\2\2\2\u025d\u024b"+
		"\3\2\2\2\u025d\u0250\3\2\2\2\u025d\u0255\3\2\2\2\u025d\u025a\3\2\2\2\u025e"+
		"\u008d\3\2\2\2\u025f\u0262\5\u008cG\2\u0260\u0262\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u008f\3\2\2\2\u0263\u0264\7\23\2\2"+
		"\u0264\u0265\5\u0090I\2\u0265\u0266\7\24\2\2\u0266\u0267\5\u0090I\2\u0267"+
		"\u0277\3\2\2\2\u0268\u0269\7\r\2\2\u0269\u026a\5\u0090I\2\u026a\u026b"+
		"\7\16\2\2\u026b\u026c\5\u0090I\2\u026c\u0277\3\2\2\2\u026d\u026e\7\5\2"+
		"\2\u026e\u026f\5\u0090I\2\u026f\u0270\7\6\2\2\u0270\u0271\5\u0090I\2\u0271"+
		"\u0277\3\2\2\2\u0272\u0273\5\u0096L\2\u0273\u0274\5\u0090I\2\u0274\u0277"+
		"\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0263\3\2\2\2\u0276\u0268\3\2\2\2\u0276"+
		"\u026d\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0275\3\2\2\2\u0277\u0091\3\2"+
		"\2\2\u0278\u02a2\7R\2\2\u0279\u02a2\7S\2\2\u027a\u02a2\7T\2\2\u027b\u02a2"+
		"\7U\2\2\u027c\u02a2\7X\2\2\u027d\u02a2\7/\2\2\u027e\u02a2\7\33\2\2\u027f"+
		"\u02a2\7\60\2\2\u0280\u02a2\7)\2\2\u0281\u02a2\7\17\2\2\u0282\u02a2\7"+
		"\7\2\2\u0283\u02a2\7+\2\2\u0284\u02a2\7\f\2\2\u0285\u02a2\7,\2\2\u0286"+
		"\u02a2\7\61\2\2\u0287\u02a2\7\62\2\2\u0288\u02a2\7\63\2\2\u0289\u02a2"+
		"\7\64\2\2\u028a\u02a2\7\34\2\2\u028b\u02a2\7\35\2\2\u028c\u02a2\7\65\2"+
		"\2\u028d\u02a2\7\66\2\2\u028e\u02a2\7\67\2\2\u028f\u02a2\78\2\2\u0290"+
		"\u02a2\79\2\2\u0291\u02a2\7:\2\2\u0292\u02a2\7\32\2\2\u0293\u02a2\7;\2"+
		"\2\u0294\u02a2\7<\2\2\u0295\u02a2\7\30\2\2\u0296\u02a2\7=\2\2\u0297\u02a2"+
		"\7>\2\2\u0298\u02a2\7?\2\2\u0299\u02a2\7(\2\2\u029a\u02a2\7@\2\2\u029b"+
		"\u02a2\7A\2\2\u029c\u02a2\7\31\2\2\u029d\u02a2\7B\2\2\u029e\u02a2\7C\2"+
		"\2\u029f\u02a2\5\u0094K\2\u02a0\u02a2\5\u00a4S\2\u02a1\u0278\3\2\2\2\u02a1"+
		"\u0279\3\2\2\2\u02a1\u027a\3\2\2\2\u02a1\u027b\3\2\2\2\u02a1\u027c\3\2"+
		"\2\2\u02a1\u027d\3\2\2\2\u02a1\u027e\3\2\2\2\u02a1\u027f\3\2\2\2\u02a1"+
		"\u0280\3\2\2\2\u02a1\u0281\3\2\2\2\u02a1\u0282\3\2\2\2\u02a1\u0283\3\2"+
		"\2\2\u02a1\u0284\3\2\2\2\u02a1\u0285\3\2\2\2\u02a1\u0286\3\2\2\2\u02a1"+
		"\u0287\3\2\2\2\u02a1\u0288\3\2\2\2\u02a1\u0289\3\2\2\2\u02a1\u028a\3\2"+
		"\2\2\u02a1\u028b\3\2\2\2\u02a1\u028c\3\2\2\2\u02a1\u028d\3\2\2\2\u02a1"+
		"\u028e\3\2\2\2\u02a1\u028f\3\2\2\2\u02a1\u0290\3\2\2\2\u02a1\u0291\3\2"+
		"\2\2\u02a1\u0292\3\2\2\2\u02a1\u0293\3\2\2\2\u02a1\u0294\3\2\2\2\u02a1"+
		"\u0295\3\2\2\2\u02a1\u0296\3\2\2\2\u02a1\u0297\3\2\2\2\u02a1\u0298\3\2"+
		"\2\2\u02a1\u0299\3\2\2\2\u02a1\u029a\3\2\2\2\u02a1\u029b\3\2\2\2\u02a1"+
		"\u029c\3\2\2\2\u02a1\u029d\3\2\2\2\u02a1\u029e\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a1\u02a0\3\2\2\2\u02a2\u0093\3\2\2\2\u02a3\u02a4\t\5\2\2\u02a4"+
		"\u0095\3\2\2\2\u02a5\u02a8\5\u0092J\2\u02a6\u02a8\7\22\2\2\u02a7\u02a5"+
		"\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u0097\3\2\2\2\u02a9\u02ae\5\u009aN"+
		"\2\u02aa\u02ab\5\u009cO\2\u02ab\u02ac\5\u00b6\\\2\u02ac\u02ae\3\2\2\2"+
		"\u02ad\u02a9\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ae\u0099\3\2\2\2\u02af\u02b2"+
		"\5\u00a2R\2\u02b0\u02b2\7\67\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2"+
		"\2\u02b2\u009b\3\2\2\2\u02b3\u02b4\7\23\2\2\u02b4\u02b5\5\u009eP\2\u02b5"+
		"\u02b6\7?\2\2\u02b6\u02b7\5\u009eP\2\u02b7\u02b8\5\u00a0Q\2\u02b8\u02b9"+
		"\7\24\2\2\u02b9\u009d\3\2\2\2\u02ba\u02bf\5\u00a2R\2\u02bb\u02bc\5\u009c"+
		"O\2\u02bc\u02bd\5\u00b6\\\2\u02bd\u02bf\3\2\2\2\u02be\u02ba\3\2\2\2\u02be"+
		"\u02bb\3\2\2\2\u02bf\u009f\3\2\2\2\u02c0\u02c1\7?\2\2\u02c1\u02c2\5\u009e"+
		"P\2\u02c2\u02c3\5\u00a0Q\2\u02c3\u02c6\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5"+
		"\u02c0\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6\u00a1\3\2\2\2\u02c7\u02c8\5\u00a8"+
		"U\2\u02c8\u02c9\5\u00b6\\\2\u02c9\u02eb\3\2\2\2\u02ca\u02cb\5\u00b4[\2"+
		"\u02cb\u02cc\5\u00b6\\\2\u02cc\u02eb\3\2\2\2\u02cd\u02ce\7\62\2\2\u02ce"+
		"\u02eb\5\u00b6\\\2\u02cf\u02d0\7\63\2\2\u02d0\u02eb\5\u00b6\\\2\u02d1"+
		"\u02d2\7\66\2\2\u02d2\u02eb\5\u00b6\\\2\u02d3\u02d4\7T\2\2\u02d4\u02eb"+
		"\5\u00b6\\\2\u02d5\u02d6\7@\2\2\u02d6\u02d7\7+\2\2\u02d7\u02d8\5\u0098"+
		"M\2\u02d8\u02d9\7,\2\2\u02d9\u02da\5\u00b6\\\2\u02da\u02eb\3\2\2\2\u02db"+
		"\u02dc\7=\2\2\u02dc\u02eb\5\u00b6\\\2\u02dd\u02de\7\65\2\2\u02de\u02eb"+
		"\5\u00b6\\\2\u02df\u02e0\7E\2\2\u02e0\u02eb\5\u00b6\\\2\u02e1\u02e2\5"+
		"\u00a4S\2\u02e2\u02e3\5\u00b6\\\2\u02e3\u02eb\3\2\2\2\u02e4\u02e5\7\64"+
		"\2\2\u02e5\u02e6\7+\2\2\u02e6\u02e7\5\u0098M\2\u02e7\u02e8\7,\2\2\u02e8"+
		"\u02e9\5\u00b6\\\2\u02e9\u02eb\3\2\2\2\u02ea\u02c7\3\2\2\2\u02ea\u02ca"+
		"\3\2\2\2\u02ea\u02cd\3\2\2\2\u02ea\u02cf\3\2\2\2\u02ea\u02d1\3\2\2\2\u02ea"+
		"\u02d3\3\2\2\2\u02ea\u02d5\3\2\2\2\u02ea\u02db\3\2\2\2\u02ea\u02dd\3\2"+
		"\2\2\u02ea\u02df\3\2\2\2\u02ea\u02e1\3\2\2\2\u02ea\u02e4\3\2\2\2\u02eb"+
		"\u00a3\3\2\2\2\u02ec\u02ed\t\6\2\2\u02ed\u00a5\3\2\2\2\u02ee\u02ef\5\u00a8"+
		"U\2\u02ef\u02f0\5\u00b6\\\2\u02f0\u02f4\3\2\2\2\u02f1\u02f2\7T\2\2\u02f2"+
		"\u02f4\5\u00b6\\\2\u02f3\u02ee\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u00a7"+
		"\3\2\2\2\u02f5\u02fb\5\u00aeX\2\u02f6\u02fb\5\u00aaV\2\u02f7\u02fb\78"+
		"\2\2\u02f8\u02fb\79\2\2\u02f9\u02fb\7>\2\2\u02fa\u02f5\3\2\2\2\u02fa\u02f6"+
		"\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fb"+
		"\u00a9\3\2\2\2\u02fc\u02fd\7D\2\2\u02fd\u0300\5\u00acW\2\u02fe\u0300\5"+
		"\u00acW\2\u02ff\u02fc\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u00ab\3\2\2\2"+
		"\u0301\u0302\t\7\2\2\u0302\u00ad\3\2\2\2\u0303\u0304\7B\2\2\u0304\u0307"+
		"\5\u00b0Y\2\u0305\u0307\5\u00b0Y\2\u0306\u0303\3\2\2\2\u0306\u0305\3\2"+
		"\2\2\u0307\u00af\3\2\2\2\u0308\u030c\7A\2\2\u0309\u030a\7<\2\2\u030a\u030c"+
		"\5\u00b2Z\2\u030b\u0308\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u00b1\3\2\2"+
		"\2\u030d\u0310\7<\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e"+
		"\3\2\2\2\u0310\u00b3\3\2\2\2\u0311\u0312\7Q\2\2\u0312\u0313\7+\2\2\u0313"+
		"\u0314\5\u00b8]\2\u0314\u0315\7,\2\2\u0315\u00b5\3\2\2\2\u0316\u0319\7"+
		"\61\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2\u0319"+
		"\u00b7\3\2\2\2\u031a\u031d\5\u0098M\2\u031b\u031d\7C\2\2\u031c\u031a\3"+
		"\2\2\2\u031c\u031b\3\2\2\2\u031d\u00b9\3\2\2\2\u031e\u031f\7T\2\2\u031f"+
		"\u0320\5\u00bc_\2\u0320\u00bb\3\2\2\2\u0321\u0322\7\22\2\2\u0322\u0323"+
		"\7T\2\2\u0323\u0326\5\u00bc_\2\u0324\u0326\3\2\2\2\u0325\u0321\3\2\2\2"+
		"\u0325\u0324\3\2\2\2\u0326\u00bd\3\2\2\2\u0327\u0328\7T\2\2\u0328\u00bf"+
		"\3\2\2\2\u0329\u032a\7T\2\2\u032a\u032b\7\23\2\2\u032b\u032c\5p9\2\u032c"+
		"\u032d\7\24\2\2\u032d\u00c1\3\2\2\2\u032e\u032f\7T\2\2\u032f\u0330\7\f"+
		"\2\2\u0330\u0331\7T\2\2\u0331\u00c3\3\2\2\2\u0332\u0333\7T\2\2\u0333\u0334"+
		"\7\f\2\2\u0334\u0335\7\23\2\2\u0335\u0336\5\u00ba^\2\u0336\u0337\7\24"+
		"\2\2\u0337\u00c5\3\2\2\2\u0338\u0339\7T\2\2\u0339\u033a\7\f\2\2\u033a"+
		"\u033b\7T\2\2\u033b\u033c\7\23\2\2\u033c\u033d\5p9\2\u033d\u033e\7\24"+
		"\2\2\u033e\u00c7\3\2\2\2;\u00d0\u00d8\u00de\u00e2\u00f9\u0107\u0113\u0122"+
		"\u012c\u0138\u013e\u0143\u0148\u0157\u015c\u017b\u018a\u0195\u019d\u01a3"+
		"\u01af\u01ba\u01c2\u01c9\u01d2\u01d8\u01dc\u01e2\u01ed\u01f9\u01ff\u0206"+
		"\u0214\u0218\u021c\u0228\u0242\u0249\u025d\u0261\u0276\u02a1\u02a7\u02ad"+
		"\u02b1\u02be\u02c5\u02ea\u02f3\u02fa\u02ff\u0306\u030b\u030f\u0318\u031c"+
		"\u0325";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}