/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + nome + '}';
    } 

    public String getNome() {
        return nome;
    }
    
    protected void alteraNome(String novoNome) {
        nome = novoNome;
    }
}
