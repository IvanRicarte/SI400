/*
(c) Ivan L M Ricarte
 */
package si400.demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class ParseCsv {
   public static void main(String[] args) {
        try {
            Path refArq = FileSystems.getDefault().getPath("Teste.csv");
            BufferedReader r = Files.newBufferedReader(refArq);
            StringTokenizer st;
            String line;
            while ((line = r.readLine()) != null) {
                st = new StringTokenizer(line, ";\n");
                while (st.hasMoreTokens()) {
                    String nome = st.nextToken();
                    double p1 = Double.parseDouble(st.nextToken());
                    double p2 = Double.parseDouble(st.nextToken());
                    double media = 0.4*p1 + 0.6*p2;
                    System.out.printf("%s:\tmedia %.1f\n", nome, media);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ParseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
