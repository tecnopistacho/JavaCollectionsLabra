import java.util.HashMap;
import java.util.Map;

public class MapTasks {
// Tehtävä M1: Perustoiminnot Mapilla
// Luo Map<String,Integer>, lisää parit ("A",1) ja ("B",2). Tulosta arvo avaimella "A".
    public static void taskM1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.get("A"));
    }

// Tehtävä M2: Mapin läpikäynti
// Luo Map<String,Integer> ja lisää muutama arvo. Käy läpi entrySet()-menetelmällä ja tulosta avain=arvo -tyyliin.
    public static void taskM2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 100);
        map.put("Y", 200);
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

// Tehtävä M3: Tulosta vain avaimet
// Luo Map<Integer,String>, jossa (1, "Punainen"), (2, "Sininen"). Tulosta kaikki avaimet samalla rivillä välilyönnein eroteltuna.  */
    public static void taskM3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Punainen");
        map.put(2, "Sininen");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }
}
