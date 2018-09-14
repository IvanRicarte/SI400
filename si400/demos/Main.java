/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan L M Ricarte
 */
public class Main {
    public static void main(String[] args) {
        List p = new ArrayList();
        p.add(new Pessoa("Lara"));
        p.add(new Aluno1("Pedro", 987654));
        p.add(new Professor("Ivan", 222810));
        for( Object quem : p ) {
            System.out.println(quem.toString());
        }
    }
}

class Xyz{
    public void xyz(){
    List pessoas;
    
    pessoas = new java.util.ArrayList();
    pessoas.add(new Pessoa("Lara"));
    
    pessoas = new java.util.LinkedList();
    pessoas.add(new Pessoa("Lara"));
    }
}
