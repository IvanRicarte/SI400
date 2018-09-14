/*
(c) Ivan L M Ricarte
 */
package outropacote;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class MinhaClasse {

    @Override
    public String toString() {
        return "Objeto de MinhaClasse";
    }

    public static void main(String args[]) {
        MinhaClasse c = new MinhaClasse();
        Object o = new MinhaClasse();
        System.out.println(c.toString());
        System.out.println(o.toString());
        System.out.println(c == o);
        System.out.println(c.equals(o));
    }
}
