import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.TreeMap;

public class AdvancedTasks {
// Tehtävä A1: Listan lajittelu
// Luo List<String>, jossa arvot ["b", "a", "c"]. Lajittele lista ja tulosta se nousevassa järjestyksessä. Vinkki: Collections.sort tai list.sort toimii.
    public static void taskA1() {
        List<String> list = new ArrayList<>(List.of("b", "a", "c"));
        Collections.sort(list);
        System.out.println(list);   
    }

// Tehtävä A2: Mukautettu lajittelu
// Luo List<String>, jossa on eri pituisia sanoja. Lajittele lista pituuden mukaan lyhimmästä alkaen. Best practice: käytä Comparator.comparingInt.
    public static void taskA2() {
        List<String> words = new ArrayList<>(List.of("banana", "kiwi", "apple"));
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);
    }

// Tehtävä A3: TreeMap
// Luo TreeMap<Integer,String>, lisää muutama pari ja tulosta map. Havainnoi, että avaimet tulostuvat järjestyksessä.
    public static void taskA3() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "kolme");
        map.put(1, "yksi");
        map.put(2, "kaksi");
        System.out.println(map);
    }
}
