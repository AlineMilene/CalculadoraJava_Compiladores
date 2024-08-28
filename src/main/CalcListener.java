package main;

import org.antlr.v4.runtime.tree.ParseTree;
import antlr4.GramaticaBaseListener;
import antlr4.GramaticaParser;

public class CalcListener extends GramaticaBaseListener {
    private double result;

    public CalcListener() {
        result = 0.0;
    }

    @Override
    public void exitPrintStmt(GramaticaParser.PrintStmtContext ctx) {
        result = evaluate(ctx.expr());
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
            // Removido: Não é mais necessário para variáveis
            return 0.0;
        } else if (ctx instanceof GramaticaParser.NumberContext) {
            return Double.parseDouble(ctx.getText());
        } else {
            throw new RuntimeException("Tipo de expressão inesperado: " + ctx.getClass().getSimpleName());
        }
    }
}
