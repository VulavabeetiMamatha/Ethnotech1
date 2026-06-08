package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        LinkedHashSet<String> ls=new LinkedHashSet<>();


        hs.add("Mammu");
        hs.add("ram");
        hs.add("sita");
        hs.add("ram");

        System.out.println(hs);

        hs.remove("ram");
        System.out.println(hs);

        System.out.println(hs.contains("Mammu"));

        ls.add("raju");
        ls.add("ramu");
        ls.add("Alice");
        ls.add("bob");
        ls.add("Alice");

        System.out.println(ls);
    }
}
