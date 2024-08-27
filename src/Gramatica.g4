grammar Gramatica;

// Definindo a regra inicial
prog:   stat+ ; // Um programa � composto de uma ou mais declara��es (stat)

// Declara��es
stat:   expr NEWLINE                # printExpr  // express�o com nova linha
    |   ID '=' expr NEWLINE         # assign     // atribui��o de vari�vel
    |   'print' '(' expr ')' NEWLINE # printStmt // comando de impress�o
    |   'input' '(' ID ')' NEWLINE   # inputStmt // comando de leitura
    ;

// Express�es
expr:   expr ('*' | '/') expr       # MulDiv    // multiplica��o ou divis�o
    |   expr ('+' | '-') expr       # AddSub    // adi��o ou subtra��o
    |   '(' expr ')'                # Parens    // par�nteses
    |   ID                          # Id        // vari�vel
    |   NUMBER                      # Number    // n�mero
    ;

// Tokens
ID      : [a-zA-Z]+ ;               // Identificador (vari�vel)
NUMBER  : [0-9]+ ('.' [0-9]+)? ;    // N�meros inteiros ou decimais
NEWLINE : [\r\n]+ ;                 // Quebra de linha
WS      : [ \t]+ -> skip ;          // Espa�os em branco s�o ignorados
