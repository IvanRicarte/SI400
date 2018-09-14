/*
(c) Ivan L M Ricarte
 */
package si400.demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class ParseFile {

    public static void main(String[] args) {
        try {
            Path refArq = FileSystems.getDefault().getPath("Teste.txt");
            BufferedReader r = Files.newBufferedReader(refArq);
            StreamTokenizer st = new StreamTokenizer(r);
            st.eolIsSignificant(true);
            boolean eof = false;
            do {
                int token = st.nextToken();
                switch (token) {
                    case StreamTokenizer.TT_EOF:
                        System.out.println("End of File encountered.");
                        eof = true;
                        break;
                    case StreamTokenizer.TT_EOL:
                        System.out.println("End of Line encountered.");
                        break;
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word: " + st.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Number: " + st.nval);
                        break;
                    default:
                        System.out.println((char) token + " encountered.");
                }
            } while (!eof);

        } catch (IOException ex) {
            Logger.getLogger(ParseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
