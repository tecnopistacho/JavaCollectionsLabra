 import java.util.*;

public class ComboTasks {
// Tehtävä C1: Opiskelijalista
// Tee ohjelma, joka käyttää List<String>-rakennetta opiskelijoiden nimien tallentamiseen. Lue nimet Scannerilla kunnes käyttäjä kirjoittaa "stop". Tulosta lopuksi kaikki nimet.
    public static void taskC1(Scanner scanner) {
        List<String> students = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            students.add(input);
        }
        System.out.println("Opiskelijat: " + students);
    }

// Tehtävä C2: Uniikit sanat
// Kirjoita ohjelma, joka lukee Scannerilta sanoja kunnes käyttäjä kirjoittaa "stop". Tallenna sanat Set<String>-rakenteeseen ja tulosta lopuksi uniikkien sanojen lukumäärä.
    public static void taskC2(Scanner scanner) {
        Set<String> words = new HashSet<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            words.add(input);
        }
        System.out.println("Uniikit sanat: " + words.size());
    }

// Tehtävä C3: Puhelinluettelo Mapilla
//Luo Map<String,String>, jossa avain on henkilön nimi ja arvo puhelinnumero. Lisää vähintään kolme merkintää. Toteuta haku, jossa käyttäjä antaa nimen ja saa numeron.
    public static void taskC3(Scanner scanner) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Marilda", "0401234567");
        phoneBook.put("Angela", "0509876543");
        phoneBook.put("Ann", "0412345678");

        System.out.print("Anna nimi: ");
        String name = scanner.nextLine();

        String number = phoneBook.get(name);
        if (number != null) {
            System.out.println("Numbero: " + number);
        }
        else {
            System.out.println("Nimeä ei löytynyt.");
        }
    }

// Tehtävä C4: Sanojen frekvenssilaskuri
// Kirjoita ohjelma, joka lukee Scannerilta lauseen. Laske kuinka monta kertaa kukin sana esiintyy Map<String,Integer>-rakenteella. Tulosta lopuksi kaikki sanat ja niiden määrät. Vinkki: muunna sanat pieniksi kirjaimiksi ennen laskemista. */
    public static void taskC4(Scanner scanner) {
        System.out.print("Kirjoita lause: ");
        String line = scanner.nextLine();

        String[] words = line.split("\\s+");
        Map<String, Integer> frequencies = new HashMap<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            frequencies.put(lower, frequencies.getOrDefault(lower, 0) + 1);
        }

        System.out.println("Sanat ja määrät:");
        for (Map.Entry<String, Integer> entry : frequencies.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }  
    }
}
