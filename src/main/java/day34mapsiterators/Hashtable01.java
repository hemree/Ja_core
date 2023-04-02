package main.java.day34mapsiterators;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {

        /*
        1) Hashtable "thread-safe" ve "synchronized" dir.
        2) HashTable elemanları rastgele siralar.
        3) HashTable'lar "key" lerde ve "value" larda "null" kullanılmasına musaade etmezler.
        4) HashTable'lar "HashMap" lere göre daha yavastırlar.

         Note : i) "multi thread"  ve "synchornization" kullanılmanız gerekirse,
                ii) "key" lerde ve "value" larda "null"kullanmak yasak ise; HashTable kullanmak gerekir.

         */

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(1,2);
        ht.put(2,4);
        ht.put(6,8);
        System.out.println(ht);


    }
}
