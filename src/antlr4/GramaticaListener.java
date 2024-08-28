package antlr4;

// Generated from Gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prog}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterProg(GramaticaParser.ProgContext ctx);

	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prog}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitProg(GramaticaParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link GramaticaParser#stat}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(GramaticaParser.PrintExprContext ctx);

	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link GramaticaParser#stat}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(GramaticaParser.PrintExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link GramaticaParser#stat}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(GramaticaParser.PrintStmtContext ctx);

	/**
	 * Exit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link GramaticaParser#stat}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(GramaticaParser.PrintStmtContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterNumber(GramaticaParser.NumberContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitNumber(GramaticaParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterMulDiv(GramaticaParser.MulDivContext ctx);

	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitMulDiv(GramaticaParser.MulDivContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAddSub(GramaticaParser.AddSubContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAddSub(GramaticaParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParens(GramaticaParser.ParensContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GramaticaParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParens(GramaticaParser.ParensContext ctx);
}