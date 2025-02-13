package Collection.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List everything = new ArrayList();
        everything.add("Hello world");
        everything.add(150);
        everything.add(true);

        List<String> onlyCarNames = new ArrayList();
        onlyCarNames.add("Fox");
        onlyCarNames.add("Voyage");
        onlyCarNames.add("Gol");
        onlyCarNames.add("Ferrari");
        onlyCarNames.add("EcoSport");

        Collections.shuffle(onlyCarNames);
        System.out.println(onlyCarNames.toString());

        Collections.sort(onlyCarNames);

        for(String carName: onlyCarNames){
            System.out.println(carName);
        }
    }


}
