package Collection.Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List linguagens = new ArrayList();
        linguagens.add("C#");
        linguagens.add("Java");
        System.out.println("Elemento na posição 1: " + linguagens.get(1));
        System.out.println("A linguagem java está na posição: " + linguagens.indexOf("Java"));

    }
}
