/*
(c) Ivan L M Ricarte
 */
package si400.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ivan L M Ricarte <ricarte@ft.unicamp.br>
 */
public class MyCollection {
    List<Integer> myColl;
    
    public MyCollection() {
        myColl = new ArrayList<>();
        myColl.add(10);
        myColl.add(5);
        myColl.add(2);
    }
    
    public int search(int n) {
        return Collections.binarySearch(myColl, n);
    }
    
    public static void main(String[] args) {
        MyCollection m = new MyCollection();
        System.out.println(m.search(1));
        System.out.println(m.search(5));
        System.out.println(m.search(2));
    }
}
