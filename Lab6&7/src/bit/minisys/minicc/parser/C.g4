grammar C;

primaryExpression:
	Identifier
	| Constant
	| StringLiteral+
	| '(' expression ')';

postfixExpression:
	primaryExpression									# postfixExpression_pass
	| postfixExpression '[' expression ']'				# arrayAceess_
	| postfixExpression '(' argumentExpressionList? ')'	# functionCall_
	| postfixExpression '.' Identifier					# postfixExpression_
	| postfixExpression '->' Identifier					# postfixExpression_
	| postfixExpression '++'							# postfixExpression_
	| postfixExpression '--'							# postfixExpression_;

argumentExpressionList:
	assignmentExpression
	| argumentExpressionList ',' assignmentExpression;

unaryExpression:
	postfixExpression				# unaryExpression_pass
	| '++' unaryExpression			# unaryExpression_
	| '--' unaryExpression			# unaryExpression_
	| unaryOperator castExpression	# unaryExpression_
	| 'sizeof' unaryExpression		# unaryTypename_
	| 'sizeof' '(' typeName ')'		# unaryTypename_;

unaryOperator: '&' | '*' | '+' | '-' | '~' | '!';

castExpression:
	'(' typeName ')' castExpression	# castExpression_
	| unaryExpression				# castExpression_pass;
//	| DigitSequence ; // for

multiplicativeExpression:
	castExpression									# multiplicativeExpression_pass
	| multiplicativeExpression '*' castExpression	# multiplicativeExpression_
	| multiplicativeExpression '/' castExpression	# multiplicativeExpression_
	| multiplicativeExpression '%' castExpression	# multiplicativeExpression_;

additiveExpression:
	multiplicativeExpression							# additiveExpression_pass
	| additiveExpression '+' multiplicativeExpression	# additiveExpression_
	| additiveExpression '-' multiplicativeExpression	# additiveExpression_;

shiftExpression:
	additiveExpression  # shiftExpression_pass
	| shiftExpression '<<' additiveExpression # shiftExpression_
	| shiftExpression '>>' additiveExpression # shiftExpression_;

relationalExpression:
	shiftExpression								# relationalExpression_pass
	| relationalExpression '<' shiftExpression	# relationalExpression_
	| relationalExpression '>' shiftExpression	# relationalExpression_
	| relationalExpression '<=' shiftExpression	# relationalExpression_
	| relationalExpression '>=' shiftExpression	# relationalExpression_;

equalityExpression:
	relationalExpression							# equalityExpression_pass
	| equalityExpression '==' relationalExpression	# equalityExpression_
	| equalityExpression '!=' relationalExpression	# equalityExpression_;

andExpression:
	equalityExpression
	| andExpression '&' equalityExpression;

exclusiveOrExpression:
	andExpression
	| exclusiveOrExpression '^' andExpression;

inclusiveOrExpression:
	exclusiveOrExpression
	| inclusiveOrExpression '|' exclusiveOrExpression;

logicalAndExpression:
	inclusiveOrExpression # logicalAndExpression_pass
	| logicalAndExpression '&&' inclusiveOrExpression # logicalAndExpression_;

logicalOrExpression:
	logicalAndExpression # logicalOrExpression_pass
	| logicalOrExpression '||' logicalAndExpression # logicalOrExpression_;

conditionalExpression:
	logicalOrExpression # conditionalExpression_pass
	| logicalOrExpression (
		'?' expression ':' conditionalExpression
	) # conditionalExpression_;

assignmentExpression:
	conditionalExpression										# assignmentExpression_pass
	| unaryExpression assignmentOperator assignmentExpression	# assignmentExpression_;

assignmentOperator:
	'='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|=';

expression:
	assignmentExpression
	| expression ',' assignmentExpression;

constantExpression: conditionalExpression;

declaration:
	declarationSpecifiers initDeclaratorList ';'
	| declarationSpecifiers ';';

declarationSpecifiers: declarationSpecifier+;

declarationSpecifiers2: declarationSpecifier+;

declarationSpecifier:
	storageClassSpecifier
	| typeSpecifier
	| typeQualifier;

initDeclaratorList:
	initDeclarator
	| initDeclaratorList ',' initDeclarator;

initDeclarator: declarator | declarator '=' initializer;

storageClassSpecifier:
	'typedef'
	| 'extern'
	| 'static'
	| 'auto'
	| 'register';

typeSpecifier: (
		'void'
		| 'char'
		| 'short'
		| 'int'
		| 'long'
		| 'float'
		| 'double'
		| 'signed'
		| 'unsigned'
		| '_Bool'
		| '_Complex'
	)
	| structOrUnionSpecifier
	| enumSpecifier
	| typedefName
	| typeSpecifier pointer;

structOrUnionSpecifier:
	structOrUnion Identifier? '{' structDeclarationList '}'
	| structOrUnion Identifier;

structOrUnion: 'struct' | 'union';

structDeclarationList:
	structDeclaration
	| structDeclarationList structDeclaration;

structDeclaration:
	specifierQualifierList structDeclaratorList? ';';

specifierQualifierList:
	typeSpecifier specifierQualifierList?
	| typeQualifier specifierQualifierList?;

structDeclaratorList:
	structDeclarator
	| structDeclaratorList ',' structDeclarator;

structDeclarator:
	declarator
	| declarator? ':' constantExpression;

enumSpecifier:
	'enum' Identifier? '{' enumeratorList '}'
	| 'enum' Identifier? '{' enumeratorList ',' '}'
	| 'enum' Identifier;

enumeratorList: enumerator | enumeratorList ',' enumerator;

enumerator:
	enumerationConstant
	| enumerationConstant '=' constantExpression;

enumerationConstant: Identifier;

typeQualifier: 'const' | 'restrict' | 'volatile' | '_Atomic';

declarator: pointer? directDeclarator;

directDeclarator:
	Identifier																	# variableDeclarator
	| '(' declarator ')'														# variableDeclarator
	| directDeclarator '[' typeQualifierList? assignmentExpression? ']'			# arrayDeclarator
	| directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'	# arrayDeclarator
	| directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'	# arrayDeclarator
	| directDeclarator '[' typeQualifierList? '*' ']'							# arrayDeclarator
	| directDeclarator '(' parameterTypeList ')'								# functionDeclarator
	| directDeclarator '(' identifierList? ')'									# functionDeclarator;


pointer:
	'*' typeQualifierList?
	| '*' typeQualifierList? pointer
	| '^' typeQualifierList? 
	| '^' typeQualifierList? pointer; 

typeQualifierList:
	typeQualifier
	| typeQualifierList typeQualifier;

parameterTypeList: parameterList | parameterList ',' '...';

parameterList:
	parameterDeclaration
	| parameterList ',' parameterDeclaration;

parameterDeclaration:
	declarationSpecifiers declarator
	| declarationSpecifiers2 abstractDeclarator?;

identifierList: Identifier | identifierList ',' Identifier;

typeName: specifierQualifierList abstractDeclarator?;

abstractDeclarator: pointer | pointer? directAbstractDeclarator;

directAbstractDeclarator:
	'(' abstractDeclarator ')'
	| '[' typeQualifierList? assignmentExpression? ']'
	| '[' 'static' typeQualifierList? assignmentExpression ']'
	| '[' typeQualifierList 'static' assignmentExpression ']'
	| '[' '*' ']'
	| '(' parameterTypeList? ')'
	| directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
	| directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
	| directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
	| directAbstractDeclarator '[' '*' ']'
	| directAbstractDeclarator '(' parameterTypeList? ')';

typedefName: Identifier;

initializer:
	assignmentExpression
	| '{' initializerList '}'
	| '{' initializerList ',' '}';

initializerList:
	designation? initializer
	| initializerList ',' designation? initializer;

designation: designatorList '=';

designatorList: designator | designatorList designator;

designator: '[' constantExpression ']' | '.' Identifier;

statement:
	labeledStatement
	| compoundStatement
	| expressionStatement
	| selectionStatement
	| iterationStatement
	| jumpStatement;

labeledStatement:
	Identifier ':' statement
	| 'case' constantExpression ':' statement
	| 'default' ':' statement;

compoundStatement: '{' blockItemList? '}';

blockItemList: blockItem | blockItemList blockItem;

blockItem: statement | declaration;

expressionStatement: expression? ';';

selectionStatement:
	'if' '(' expression ')' statement ('else' statement)?
	| 'switch' '(' expression ')' statement;

iterationStatement:
	While '(' expression ')' statement												# iterationWhileStatement_
	| Do statement While '(' expression ')' ';'										# iterationDoStatement_
	| For '(' forDeclaration ';' forExpression? ';' forExpression? ')' statement	#
		iterationDeclaredStatement_
	| For '(' expression? ';' forExpression? ';' forExpression? ')' statement # iterationStatement_;


forDeclaration:
	declarationSpecifiers initDeclaratorList
	| declarationSpecifiers;

forExpression:
	assignmentExpression
	| forExpression ',' assignmentExpression;

jumpStatement:
	'goto' Identifier ';'		# GotoStatement
	| 'continue' ';'			# ContinueStatement
	| 'break' ';'				# BreakStatement
	| 'return' expression? ';'	# ReturnStatement;

compilationUnit: translationUnit? EOF;

translationUnit:
	externalDeclaration
	| translationUnit externalDeclaration;

externalDeclaration:
	functionDefinition
	| declaration
	| ';';

functionDefinition:
	declarationSpecifiers? declarator declarationList? compoundStatement;

declarationList: declaration | declarationList declaration;

Auto: 'auto';
Break: 'break';
Case: 'case';
Char: 'char';
Const: 'const';
Continue: 'continue';
Default: 'default';
Do: 'do';
Double: 'double';
Else: 'else';
Enum: 'enum';
Extern: 'extern';
Float: 'float';
For: 'for';
Goto: 'goto';
If: 'if';
Inline: 'inline';
Int: 'int';
Long: 'long';
Register: 'register';
Restrict: 'restrict';
Return: 'return';
Short: 'short';
Signed: 'signed';
Sizeof: 'sizeof';
Static: 'static';
Struct: 'struct';
Switch: 'switch';
Typedef: 'typedef';
Union: 'union';
Unsigned: 'unsigned';
Void: 'void';
Volatile: 'volatile';
While: 'while';

Alignas: '_Alignas';
Alignof: '_Alignof';
Atomic: '_Atomic';
Bool: '_Bool';
Complex: '_Complex';

LeftParen: '(';
RightParen: ')';
LeftBracket: '[';
RightBracket: ']';
LeftBrace: '{';
RightBrace: '}';

Less: '<';
LessEqual: '<=';
Greater: '>';
GreaterEqual: '>=';
LeftShift: '<<';
RightShift: '>>';

Plus: '+';
PlusPlus: '++';
Minus: '-';
MinusMinus: '--';
Star: '*';
Div: '/';
Mod: '%';

And: '&';
Or: '|';
AndAnd: '&&';
OrOr: '||';
Caret: '^';
Not: '!';
Tilde: '~';

Question: '?';
Colon: ':';
Semi: ';';
Comma: ',';

Assign: '=';
StarAssign: '*=';
DivAssign: '/=';
ModAssign: '%=';
PlusAssign: '+=';
MinusAssign: '-=';
LeftShiftAssign: '<<=';
RightShiftAssign: '>>=';
AndAssign: '&=';
XorAssign: '^=';
OrAssign: '|=';

Equal: '==';
NotEqual: '!=';

Arrow: '->';
Dot: '.';
Ellipsis: '...';

Identifier: IdentifierNondigit ( IdentifierNondigit | Digit)*;

fragment IdentifierNondigit:
	Nondigit
	| UniversalCharacterName; 

fragment Nondigit: [a-zA-Z_];

fragment Digit: [0-9];

fragment UniversalCharacterName:
	'\\u' HexQuad
	| '\\U' HexQuad HexQuad;

fragment HexQuad:
	HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit;

Constant:
	IntegerConstant
	| FloatingConstant
	//|   EnumerationConstant
	| CharacterConstant;

fragment IntegerConstant:
	DecimalConstant IntegerSuffix?
	| OctalConstant IntegerSuffix?
	| HexadecimalConstant IntegerSuffix?
	| BinaryConstant;

fragment BinaryConstant: '0' [bB] [0-1]+;

fragment DecimalConstant: NonzeroDigit Digit*;

fragment OctalConstant: '0' OctalDigit*;

fragment HexadecimalConstant:
	HexadecimalPrefix HexadecimalDigit+;

fragment HexadecimalPrefix: '0' [xX];

fragment NonzeroDigit: [1-9];

fragment OctalDigit: [0-7];

fragment HexadecimalDigit: [0-9a-fA-F];

fragment IntegerSuffix:
	UnsignedSuffix LongSuffix?
	| UnsignedSuffix LongLongSuffix
	| LongSuffix UnsignedSuffix?
	| LongLongSuffix UnsignedSuffix?;

fragment UnsignedSuffix: [uU];

fragment LongSuffix: [lL];

fragment LongLongSuffix: 'll' | 'LL';

fragment FloatingConstant:
	DecimalFloatingConstant
	| HexadecimalFloatingConstant;

fragment DecimalFloatingConstant:
	FractionalConstant ExponentPart? FloatingSuffix?
	| DigitSequence ExponentPart FloatingSuffix?;

fragment HexadecimalFloatingConstant:
	HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
	| HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?;

fragment FractionalConstant:
	DigitSequence? '.' DigitSequence
	| DigitSequence '.';

fragment ExponentPart:
	'e' Sign? DigitSequence
	| 'E' Sign? DigitSequence;

fragment Sign: '+' | '-';

DigitSequence: Digit+;

fragment HexadecimalFractionalConstant:
	HexadecimalDigitSequence? '.' HexadecimalDigitSequence
	| HexadecimalDigitSequence '.';

fragment BinaryExponentPart:
	'p' Sign? DigitSequence
	| 'P' Sign? DigitSequence;

fragment HexadecimalDigitSequence: HexadecimalDigit+;

fragment FloatingSuffix: 'f' | 'l' | 'F' | 'L';

fragment CharacterConstant:
	'\'' CCharSequence '\''
	| 'L\'' CCharSequence '\''
	| 'u\'' CCharSequence '\''
	| 'U\'' CCharSequence '\'';

fragment CCharSequence: CChar+;

fragment CChar: ~['\\\r\n] | EscapeSequence;
fragment EscapeSequence:
	SimpleEscapeSequence
	| OctalEscapeSequence
	| HexadecimalEscapeSequence
	| UniversalCharacterName;
fragment SimpleEscapeSequence: '\\' ['"?abfnrtv\\];
fragment OctalEscapeSequence:
	'\\' OctalDigit
	| '\\' OctalDigit OctalDigit
	| '\\' OctalDigit OctalDigit OctalDigit;
fragment HexadecimalEscapeSequence: '\\x' HexadecimalDigit+;
StringLiteral: EncodingPrefix? '"' SCharSequence? '"';
fragment EncodingPrefix: 'u8' | 'u' | 'U' | 'L';
fragment SCharSequence: SChar+;
fragment SChar:
	~["\\\r\n]
	| EscapeSequence
	| '\\\n' // Added line
	| '\\\r\n'; // Added line

ComplexDefine: '#' Whitespace? 'define' ~[#\r\n]* -> skip;

IncludeDirective:
	'#' Whitespace? 'include' Whitespace? (
		('"' ~[\r\n]* '"')
		| ('<' ~[\r\n]* '>')
	) Whitespace? Newline -> skip;

AsmBlock: 'asm' ~'{'* '{' ~'}'* '}' -> skip;

LineAfterPreprocessing: '#line' Whitespace* ~[\r\n]* -> skip;

LineDirective:
	'#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]* -> skip;

PragmaDirective:
	'#' Whitespace? 'pragma' Whitespace ~[\r\n]* -> skip;

Whitespace: [ \t\n]+ -> skip;

Newline: ( '\r' '\n'? | '\n') -> skip;

BlockComment: '/*' .*? '*/' -> skip;

LineComment: '//' ~[\r\n]* -> skip;