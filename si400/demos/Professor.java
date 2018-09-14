/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class Professor extends Pessoa {
    private int matricula;

    public Professor(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor{" + getNome() + ", " + matricula + '}';
    }
}
