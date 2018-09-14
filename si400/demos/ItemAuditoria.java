/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class ItemAuditoria {
    private AgentId quem;
    private ActionId oque;
    private TimeStamp quando;
    private SourceLocation onde;
    
    //...

    public ItemAuditoria(AgentId quem, ActionId oque, TimeStamp quando, SourceLocation onde) {
        this.quem = quem;
        this.oque = oque;
        this.quando = quando;
        this.onde = onde;
    }
    
}
