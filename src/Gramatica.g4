grammar Gramatica;

// Definindo a regra inicial
prog:   stat+ ; // Um programa é composto de uma ou mais declarações (stat)

// Declarações
stat:   expr NEWLINE                # printExpr  // expressão com nova linha
    |   ID '=' expr NEWLINE         # assign     // atribuição de variável
    |   'print' '(' expr ')' NEWLINE # printStmt // comando de impressão
    |   'input' '(' ID ')' NEWLINE   # inputStmt // comando de leitura
    ;

// Expressões
expr:   expr ('*' | '/') expr       # MulDiv    // multiplicação ou divisão
    |   expr ('+' | '-') expr       # AddSub    // adição ou subtração
    |   '(' expr ')'                # Parens    // parênteses
    |   ID                          # Id        // variável
    |   NUMBER                      # Number    // número
    ;

// Tokens
ID      : [a-zA-Z]+ ;               // Identificador (variável)
NUMBER  : [0-9]+ ('.' [0-9]+)? ;    // Números inteiros ou decimais
NEWLINE : [\r\n]+ ;                 // Quebra de linha
WS      : [ \t]+ -> skip ;          // Espaços em branco são ignorados
