/*
(c) Ivan L M Ricarte
 */
package si400.demos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */

@XmlRootElement(name="alunos")
@XmlAccessorType(XmlAccessType.FIELD)
class Alunos {
    @XmlElement(name="aluno")
    private List<Aluno> alunos;

    public Alunos() {
        alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}

class Aluno {
    private String nome;
    private int p1;    
    private int p2;

    public String getNome() {
        return nome;
    }
    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getP1() {
        return p1;
    }
    @XmlElement  
    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }
    @XmlElement 
    public void setP2(int p2) {
        this.p2 = p2;
    }
}

public class ParseXML {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbC = JAXBContext.newInstance(Alunos.class);
            Unmarshaller jaxbU = jaxbC.createUnmarshaller();
            Alunos turma = (Alunos) jaxbU.unmarshal(new File("Teste.xml"));
            
            for (Aluno aluno : turma.getAlunos()) {
                System.out.println(aluno.getNome() + ": " + aluno.getP1() + ", " + aluno.getP2());
            }
        } catch (JAXBException ex) {
            Logger.getLogger(ParseXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
