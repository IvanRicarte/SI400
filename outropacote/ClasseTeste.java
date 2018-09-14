/*
(c) Ivan L M Ricarte
 */
package outropacote;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class ClasseTeste {
    Integer obj;
    
    public ClasseTeste() {
        try {
            int i = obj.parseInt("a1");
            System.out.println("Valor: " + i);
        }
        catch (Exception e1) {
            System.err.println("Problema do tipo 1");
        }
//        catch (NumberFormatException e2) {
//            System.err.println("Problema do tipo 2");
//        }
    }
}
