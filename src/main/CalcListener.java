package main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;
import antlr4.GramaticaBaseListener;
import antlr4.GramaticaParser;

public class CalcListener extends GramaticaBaseListener {
    private HashMap<String, Double> variables = new HashMap<>();
    private DecimalFormat df;
    private double result;

    public CalcListener() {
        // Configura DecimalFormat para usar o ponto como separador decimal
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        df = new DecimalFormat("0.0", symbols);
        result = 0.0;
    }

    @Override
    public void exitPrintStmt(GramaticaParser.PrintStmtContext ctx) {
        result = evaluate(ctx.expr());
        System.out.println("Resultado da expressão de impressão: " + df.format(result));
    }

    @Override
    public void exitAssign(GramaticaParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        double value = evaluate(ctx.expr());
        variables.put(id, value);
        System.out.println("Atribuição: " + id + " = " + df.format(value));
    }

    public double getResult() {
        return result;
    }

    private double evaluate(ParseTree ctx) {
        if (ctx instanceof GramaticaParser.MulDivContext) {
            double left = evaluate(ctx.getChild(0));
            double right = evaluate(ctx.getChild(2));
            String op = ctx.getChild(1).getText();
            if (op.equals("*")) {
                return left * right;
            } else { // op.equals("/")
                return left / right;
            }
        } else if (ctx instanceof GramaticaParser.AddSubContext) {
            double left = evaluate(ctx.getChild(0));
            double right = evaluate(ctx.getChild(2));
            String op = ctx.getChild(1).getText();
            if (op.equals("+")) {
                return left + right;
            } else { // op.equals("-")
                return left - right;
            }
        } else if (ctx instanceof GramaticaParser.ParensContext) {
            return evaluate(ctx.getChild(1));
        } else if (ctx instanceof GramaticaParser.IdContext) {
            String id = ctx.getText();
            Double value = variables.get(id);
            if (value == null) {
                System.err.println("Erro: Variável '" + id + "' não declarada.");
                return 0.0; // Valor padrão para variáveis não declaradas
            }
            return value;
        } else if (ctx instanceof GramaticaParser.NumberContext) {
            return Double.parseDouble(ctx.getText());
        } else {
            throw new RuntimeException("Tipo de expressão inesperado: " + ctx.getClass().getSimpleName());
        }
    }
}
