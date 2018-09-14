/*
(c) Ivan L M Ricarte
 */
package si400.demos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class TesteIO {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("dados.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesteIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
