/*
 (c) Ivan L M Ricarte
 */
package si400.demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class MinhaClasse implements java.io.Serializable, Comparable {

    private String nome;
    private int ra;

    public String getNome() {
        String tel, email, hobbies, sexo;
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        Collection c = new LinkedList();
        File f = new File(nome);
        try {
            salvaCollection(c, f);
            c = recuperaCollection(f);
        } catch (Exception e) {
            if (nome.length() > 0) {
                System.out.print(e);
            }
        }
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void salvaCollection(Collection dados, File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(file));
        s.writeObject(dados);
    }

    private Collection recuperaCollection(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream s = new ObjectInputStream(new FileInputStream(file));
        return (Collection) s.readObject();
    }
}
