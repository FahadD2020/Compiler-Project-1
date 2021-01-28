grammar Little;
r: ;

fragment EOL: '\r' '\n' | '\n' | '\r';

WS: [ \n\t\r]+ -> skip;


KEYWORD: 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE'
          | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT';

OPERATOR: ':=' | '+'| '-'| '*'| '/'| '='| '!='| '<'| '>'| '('| ')'| ';'| ','| '<='| '>=';

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_.-]*;
INTLITERAL: ('0'..'9')+;
FLOATLITERAL: (('0'..'9')*[.])?('0'..'9')+;
STRINGLITERAL:  '"' ( '\\"' | . )*? '"' ;
COMMENT: '--' ~[\r\n]* -> skip;