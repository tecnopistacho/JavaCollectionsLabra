Java Collections – Labraharjoitukset
Tämän labran aikana harjoittelet Java-kokoelmien käyttöä. Tehtävät alkavat pienistä harjoituksista ja etenevät kohti yhdistelmä- ja soveltavia tehtäviä. Tee ratkaisut VSCode-ympäristössä. Muista käyttää kokoelmatyyppien rajapintoja (List, Set, Map) muuttujien tyyppeinä, ei suoraan toteutusluokkia.

Osa 1: Listat
Tehtävä L1: Luo lista ja lisää alkio
Luo List<String>, lisää yksi alkio (esim. "Omena") ja tulosta lista. Vinkki: muista että listan indeksi alkaa nollasta.
Tehtävä L2: Lisää useita lukuja listaan
Luo List<Integer>, lisää luvut 10 ja 20, ja tulosta lista. Huom: autoboxing muuntaa int-tyypin automaattisesti Integer-olioksi.
Tehtävä L3: Hae alkio listasta
Luo List<String>, jossa arvot "Kissa" ja "Koira". Tulosta ensimmäinen alkio.
Tehtävä L4: Poista alkio listasta
Luo List<String>, jossa alkiot A, B, C. Poista B ja tulosta lista. Vinkki: ole tarkkana remove(Object) vs. remove(index).
Tehtävä L5: Listan koko
Luo List<String>, lisää kolme alkiota ja tulosta listan koko.
Tehtävä L6: Listan läpikäynti
Luo List<Integer>, jossa arvot 1, 2, 3. Tulosta jokainen arvo omalle rivilleen ensin perinteisellä for-silmukalla ja sen jälkeen for-each -silmukalla.

Osa 2: Setit
Tehtävä S1: Luo Set
Luo Set<String>, lisää kaksi alkiota (esim. "Aurinko" ja "Kuu") ja tulosta setti. Huom: Set ei takaa järjestystä.
Tehtävä S2: Duplikaatti Setissä
Luo Set<Integer>, lisää luku 4 kahdesti ja tulosta setti. Huom: duplikaatit hylätään.
Tehtävä S3: TreeSet ja järjestys
Luo TreeSet<Integer>, lisää luvut 3, 1, 2 ja tulosta setti. Huom: TreeSet pitää alkiot nousevassa järjestyksessä.

Osa 3: Mapit
Tehtävä M1: Perustoiminnot Mapilla
Luo Map<String,Integer>, lisää parit ("A",1) ja ("B",2). Tulosta arvo avaimella "A".
Tehtävä M2: Mapin läpikäynti
Luo Map<String,Integer> ja lisää muutama arvo. Käy läpi entrySet()-menetelmällä ja tulosta avain=arvo -tyyliin.
Tehtävä M3: Tulosta vain avaimet
Luo Map<Integer,String>, jossa (1, "Punainen"), (2, "Sininen"). Tulosta kaikki avaimet samalla rivillä välilyönnein eroteltuna.

Osa 4: Yhdistelmätehtävät
Tehtävä C1: Opiskelijalista
Tee ohjelma, joka käyttää List<String>-rakennetta opiskelijoiden nimien tallentamiseen. Lue nimet Scannerilla kunnes käyttäjä kirjoittaa "stop". Tulosta lopuksi kaikki nimet.
Tehtävä C2: Uniikit sanat
Kirjoita ohjelma, joka lukee Scannerilta sanoja kunnes käyttäjä kirjoittaa "stop". Tallenna sanat Set<String>-rakenteeseen ja tulosta lopuksi uniikkien sanojen lukumäärä.
Tehtävä C3: Puhelinluettelo Mapilla
Luo Map<String,String>, jossa avain on henkilön nimi ja arvo puhelinnumero. Lisää vähintään kolme merkintää. Toteuta haku, jossa käyttäjä antaa nimen ja saa numeron.
Tehtävä C4: Sanojen frekvenssilaskuri
Kirjoita ohjelma, joka lukee Scannerilta lauseen. Laske kuinka monta kertaa kukin sana esiintyy Map<String,Integer>-rakenteella. Tulosta lopuksi kaikki sanat ja niiden määrät. Vinkki: muunna sanat pieniksi kirjaimiksi ennen laskemista.

Osa 5: Lajittelu ja edistyneet tehtävät
Tehtävä A1: Listan lajittelu
Luo List<String>, jossa arvot ["b", "a", "c"]. Lajittele lista ja tulosta se nousevassa järjestyksessä. Vinkki: Collections.sort tai list.sort toimii.
Tehtävä A2: Mukautettu lajittelu
Luo List<String>, jossa on eri pituisia sanoja. Lajittele lista pituuden mukaan lyhimmästä alkaen. Best practice: käytä Comparator.comparingInt.
Tehtävä A3: TreeMap
Luo TreeMap<Integer,String>, lisää muutama pari ja tulosta map. Havainnoi, että avaimet tulostuvat järjestyksessä.

