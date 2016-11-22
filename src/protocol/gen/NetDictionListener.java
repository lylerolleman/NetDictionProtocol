// Generated from C:/Users/Lyle/IdeaProjects/NetDictionProtocol/src/protocol\NetDiction.g4 by ANTLR 4.5.3
package protocol.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NetDictionParser}.
 */
public interface NetDictionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NetDictionParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(NetDictionParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetDictionParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(NetDictionParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NetDictionParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(NetDictionParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetDictionParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(NetDictionParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link NetDictionParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NetDictionParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetDictionParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NetDictionParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NetDictionParser#commandMessage}.
	 * @param ctx the parse tree
	 */
	void enterCommandMessage(NetDictionParser.CommandMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetDictionParser#commandMessage}.
	 * @param ctx the parse tree
	 */
	void exitCommandMessage(NetDictionParser.CommandMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link NetDictionParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect(NetDictionParser.DisconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetDictionParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect(NetDictionParser.DisconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link NetDictionParser#ping}.
	 * @param ctx the parse tree
	 */
	void enterPing(NetDictionParser.PingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetDictionParser#ping}.
	 * @param ctx the parse tree
	 */
	void exitPing(NetDictionParser.PingContext ctx);
}