package gen;// Generated from D:/JavaProjects/YAPIS/src\qwe.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link qweParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface qweVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link qweParser#blockIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIf(qweParser.BlockIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#blockElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockElse(qweParser.BlockElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#startLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartLoop(qweParser.StartLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(qweParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(qweParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(qweParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(qweParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(qweParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(qweParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#ifg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfg(qweParser.IfgContext ctx);
	/**
	 * Visit a parse tree produced by {@link qweParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(qweParser.LoopContext ctx);
}