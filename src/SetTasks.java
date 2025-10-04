import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTasks {
// Tehtävä S1: Luo Set
// Luo Set<String>, lisää kaksi alkiota (esim. "Aurinko" ja "Kuu") ja tulosta setti. Huom: Set ei takaa järjestystä.
    public static void taskS1() {
        Set<String> taivas = new HashSet<>();
        taivas.add("Aurinko");
        taivas.add("Kuu");
        System.out.println(taivas);
    }

// Tehtävä S2: Duplikaatti Setissä
// Luo Set<Integer>, lisää luku 4 kahdesti ja tulosta setti. Huom: duplikaatit hylätään.
    public static void taskS2() {
        Set<Integer> numberot = new HashSet<>();
        numberot.add(4);
        numberot.add(4); // duplikaattit hylätään
        System.out.println(numberot);
    }

// Tehtävä S3: TreeSet ja järjestys
// Luo TreeSet<Integer>, lisää luvut 3, 1, 2 ja tulosta setti. Huom: TreeSet pitää alkiot nousevassa järjestyksessä.
    public static void taskS3() {
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);
    }
}
