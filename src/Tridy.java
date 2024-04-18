public class Tridy {
    public static void main(String[] args) {
        // Tridy jsou zakladni stavebni jednotkou programu v Jave.
        // Trida obsahuje data a metody, ktere s daty pracuji.
        // Trida muze byt pouzita k vytvoreni objektu.
        // Objekt je konkretni instance tridy.
        // Objekt obsahuje data a metody, ktere s daty pracuji.
        // Trida muze byt pouzita k vytvoreni vice objektu.

        // Trida se deklaruje klicovym slovem "class" nasledovane nazvem tridy.
        // Nazev tridy by mel zacinat velkym pismenem.
        // Příklad třídy: v souboru Osoba.java
        // zde se pouze vytvori objekt tridy Osoba

        Osoba osoba = new Osoba("Jan", 30, 180, 80);
        Osoba osoba2 = new Osoba("Petr");

        // Objekt osoba a osoba2 jsou instance tridy Osoba.
        // Pokud chceme pristoupit k datum objektu, pouzijeme tecku ".".
        // Příklad:
        osoba.zobrazInfo();

        String jmeno = osoba.getJmeno();
        System.out.println(jmeno);

        // Pokud chceme nastavit data objektu, pouzijeme metody objektu.
        // Příklad:
        osoba2.zobrazInfo();
        // Nastaveni dat objektu osoba2
        osoba2.setVek(35);
        osoba2.setVyska(175);
        osoba2.setVaha(75);
        osoba2.zobrazInfo();

        // Trida muze byt pouzita k vytvoreni vice objektu.
        // Objekty mohou obsahovat stejna data, ale data v objektech mohou byt ruzna.
        // Obejkty stejne tridy mohou byt ulozeny v poli.
        // Příklad:
        Osoba[] osoby = new Osoba[3];
        osoby[0] = new Osoba("Karel", 25, 170, 70);
        osoby[1] = new Osoba("Jana", 40, 160, 60);
        osoby[2] = new Osoba("Eva", 20, 165, 55);

        // Pristup k objektum v poli
        osoby[0].zobrazInfo();

        // Lze pouzit cyklus pro praci s objekty v poli
        for(int i=0; i<osoby.length; i++) {
            osoby[i].zobrazInfo();
            System.out.println("BMI: " + osoby[i].bmi());
        }
    }
}
