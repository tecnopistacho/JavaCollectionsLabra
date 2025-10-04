import java.util.List;
import java.util.ArrayList;

// Tehtävä L1: Luo lista ja lisää alkio
// Luo List<String>, lisää yksi alkio (esim. "Omena") ja tulosta lista. Vinkki: muista että listan indeksi alkaa nollasta.
public class ListTasks {
    public static void taskL1() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Omena");
        System.out.println(fruits);
    }

// Tehtävä L2: Lisää useita lukuja listaan
// Luo List<Integer>, lisää luvut 10 ja 20, ja tulosta lista. Huom: autoboxing muuntaa int-tyypin automaattisesti Integer-olioksi.
    public static void taskL2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
    }

// Tehtävä L3: Hae alkio listasta
// Luo List<String>, jossa arvot "Kissa" ja "Koira". Tulosta ensimmäinen alkio.
    public static void taskL3() {
        List<String> animals = new ArrayList<>();
        animals.add("Kissa");
        animals.add("Koira");
        System.out.println(animals.get(0));
    }

// Tehtävä L4: Poista alkio listasta
// Luo List<String>, jossa alkiot A, B, C. Poista B ja tulosta lista. Vinkki: ole tarkkana remove(Object) vs. remove(index).
    public static void taskL4() {
        List<String> Letters = new ArrayList<>();
        Letters.add("A");
        Letters.add("B");
        Letters.add("C");
        Letters.remove("B");
        System.out.println(Letters);
    }

// Tehtävä L5: Listan koko
// Luo List<String>, lisää kolme alkiota ja tulosta listan koko.
    public static void taskL5() {
        List<String> colors = new ArrayList<>();
        colors.add("Punainen");
        colors.add("Vihreä");
        colors.add("Sininen");
        System.out.println(colors.size());
    }

// TehtäväTehtävä L6: Listan läpikäynti
// Luo List<Integer>, jossa arvot 1, 2, 3. Tulosta jokainen arvo omalle rivilleen ensin perinteisellä for-silmukalla ja sen jälkeen for-each -silmukalla.*/
    public static void taskL6() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Perinteinen for-silmukka
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        // For-each -silmukka / Enhanced for-loop
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
