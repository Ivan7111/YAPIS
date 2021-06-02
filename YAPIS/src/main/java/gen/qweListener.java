package gen;// Generated from D:/JavaProjects/YAPIS/src\qwe.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link qweParser}.
 */
public interface qweListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link qweParser#blockIf}.
	 * @param ctx the parse tree
	 */
	void enterBlockIf(qweParser.BlockIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#blockIf}.
	 * @param ctx the parse tree
	 */
	void exitBlockIf(qweParser.BlockIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#blockElse}.
	 * @param ctx the parse tree
	 */
	void enterBlockElse(qweParser.BlockElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#blockElse}.
	 * @param ctx the parse tree
	 */
	void exitBlockElse(qweParser.BlockElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#startLoop}.
	 * @param ctx the parse tree
	 */
	void enterStartLoop(qweParser.StartLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#startLoop}.
	 * @param ctx the parse tree
	 */
	void exitStartLoop(qweParser.StartLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(qweParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(qweParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(qweParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(qweParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(qweParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(qweParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(qweParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(qweParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(qweParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(qweParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(qweParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(qweParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#ifg}.
	 * @param ctx the parse tree
	 */
	void enterIfg(qweParser.IfgContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#ifg}.
	 * @param ctx the parse tree
	 */
	void exitIfg(qweParser.IfgContext ctx);
	/**
	 * Enter a parse tree produced by {@link qweParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(qweParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link qweParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(qweParser.LoopContext ctx);
}