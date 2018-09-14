/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class Aluno1 extends Pessoa {
    private int ra;

    public Aluno1(String n, int r) {
        super(n);
        ra = r;
    }

    @Override
    public String toString() {
        return "Aluno{" + getNome() + ", " + ra + '}';
    }

    public int getRa() {
        return ra;
    } 
       
    public void altera(String nome) {
        alteraNome(nome);
    }
}
