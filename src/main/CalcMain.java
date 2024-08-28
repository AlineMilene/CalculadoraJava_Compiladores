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
                StringBuilder inputBuilder = new StringBuilder();
                String line;

                // Leitura de múltiplas linhas
                while ((line = reader.readLine()) != null && !line.trim().isEmpty()) {
                    inputBuilder.append(line).append("\n");
                }

                String inputText = inputBuilder.toString().trim();
                if (inputText.equalsIgnoreCase("sair")) {
                    break;
                }

                // Adiciona um comando print se a expressão não contiver um comando de impressão
                if (!inputText.matches(".*\\bprint\\(.*\\).*")) {
                    inputText = "print(" + inputText + ")";
                }

                // Adiciona uma quebra de linha no final
                if (!inputText.endsWith("\n")) {
                    inputText += "\n";
                }

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

                // Exibe o resultado da expressão processada
                if (!inputText.matches(".*\\bprint\\(.*\\).*")) {
                    System.out.println("Resultado da expressão: " + listener.getResult());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
