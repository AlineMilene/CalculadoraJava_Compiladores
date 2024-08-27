package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr4.GramaticaParser;
import antlr4.GramaticaLexer;

public class CalcMain {
    public static void main(String[] args) {
        try {
            // Cria um input stream a partir de um arquivo
            CharStream input = CharStreams.fromFileName("input.txt");
            System.out.println("Lexer criado.");
            // Cria um lexer
            GramaticaLexer lexer = new GramaticaLexer(input);
            // Cria um token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            System.out.println("Token stream criado.");
            // Cria um parser
            GramaticaParser parser = new GramaticaParser(tokens);
            // Remove regras de escuta desnecessárias
            parser.removeErrorListeners();
            // Adiciona um listener personalizado para tratar os eventos do parser
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("Erro de sintaxe na linha " + line + ":" + charPositionInLine + " " + msg);
                }
            });
            System.out.println("Parser criado.");
            // Inicia a análise sintática
            ParseTree tree = parser.prog();
            System.out.println("Análise sintática iniciada.");
            // Percorre a árvore sintática
            ParseTreeWalker walker = new ParseTreeWalker();
            System.out.println("Walker criado.");
            CalcListener listener = new CalcListener();
            System.out.println("Listener criado.");
            walker.walk(listener, tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
