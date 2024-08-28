package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr4.GramaticaParser;
import antlr4.GramaticaLexer;

public class CalcMain {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite suas expressões. Para sair, digite 'sair'.");

            while (true) {
                String inputText;

                // Leitura da expressão do usuário
                System.out.print("> ");
                inputText = reader.readLine().trim();

                if (inputText.equalsIgnoreCase("sair")) {
                    break;
                }

                // Adiciona um comando print se a expressão não contiver um comando de impressão
                if (!inputText.matches(".*\\bprint\\(.*\\).*")) {
                    inputText = "print(" + inputText + ")";
                }

                // Adiciona uma quebra de linha no final da expressão
                inputText = inputText + "\n";

                CharStream input = CharStreams.fromString(inputText);
                GramaticaLexer lexer = new GramaticaLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                GramaticaParser parser = new GramaticaParser(tokens);

                parser.removeErrorListeners();
                parser.addErrorListener(new BaseErrorListener() {
                    @Override
                    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
                        System.err.println("Erro de sintaxe na linha " + line + ":" + charPositionInLine + " " + msg);
                    }
                });

                ParseTree tree = parser.prog();
                ParseTreeWalker walker = new ParseTreeWalker();
                CalcListener listener = new CalcListener();
                walker.walk(listener, tree);

                // Sempre exibe o resultado da expressão processada
                System.out.println("Resultado da expressão: " + listener.getResult());

                System.out.println(); // Linha em branco para separar a saída
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
