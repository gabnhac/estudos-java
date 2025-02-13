package Collection.Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        Set linguagens = new HashSet();
        Set linguagens1 = new LinkedHashSet();
        Set linguagens2 = new TreeSet();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C#");

        linguagens.add("C#");
        System.out.println(linguagens.toString());

    }
}
