    grammar qwe;

    blockIf:;
    ifBody: (ID '.size') MoreLess (ID '.size' | NUMBER);
    program: 'begin' statement+ 'end';
    statement: assign | add | print | ifg ;
    assign: 'let' ID 'be' (NUMBER | ID | '{' NUMBER ( ',' NUMBER )+ '}');
    add: 'add' (NUMBER | ID | '{' NUMBER ( ',' NUMBER )+ '}') 'to' ID;
    print: 'print' (NUMBER | ID);
    ifg: 'if' ifBody '{'  statement+ blockIf'}' 'else {' statement+ '}';

    MoreLess: '<' | '>' | '==';
    ID: [a-z]+;
    NUMBER: [0-9]+;
    SPACES: [ \t\r\n] -> skip;
    L_WS : [ \t\n\r]+ -> skip;