public class Tridy2 {
    public static void main(String[] args) {
        // Dedičnost
        // Třida může dědit od jiné třídy pomocí klíčového slova "extends".
        // Třída může dědit pouze od jedné třídy.
        // Třída může dědit od jiné třídy, která dědí od jiné třídy, atd.
        // Příklad děičnosti viz. src/Zak

        Zak zak = new Zak("Novak", "A", 1);
        zak.zobrazInfo();
        zak.setVek(15); // metoda setVek je zděděná z třídy Osoba
        zak.zobrazInfo();

        // Polymorfismus
        // Polymorfismus znamená, že objekt může být použit jako instance jeho rodičovské třídy.
        // Polymorfismus umožňuje používat objekty různých tříd, které mají společného předka.
        // Příklad polymorfismu:
        Osoba[] osoby = new Osoba[2];
        osoby[0] = new Osoba("Petr");
        osoby[1] = new Zak("Jana", "B", 2);

        for (Osoba osoba : osoby) {
            osoba.zobrazInfo();
        }


    }
}
