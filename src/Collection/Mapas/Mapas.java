package Collection.Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Mapas {
    public static void main(String[] args) {
        Map <String, String> estados = new HashMap();
        estados.put("PI", "Piaui");
        estados.put("CE", "Ceará");
        estados.put("MG", "Minas Gerais");

        Iterator ufsIterator = estados.keySet().iterator();
        while(ufsIterator.hasNext()) {
            Object key = ufsIterator.next();

            Object value = estados.get(key);
            System.out.println("Sigla: " + key + " Valor: " + value);
        }
    }
}
