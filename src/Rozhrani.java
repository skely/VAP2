public class Rozhrani {
    public static void main(String[] args) {
        // Rozhraní
        // Rozhraní je v Javě způsob, jak definovat metody, které musí být implementovány v třídě.
        // Rozhraní je deklarováno pomocí klíčového slova "interface".
        // Třída může implementovat více rozhraní.
        // Rozhraní může obsahovat metody bez implementace (abstraktní metody).
        // Rozhraní může obsahovat konstanty.

        // Příklad rozhraní: (src/Tisknutelny)
        // Příklad rozhraní: (src/Volatelny)
        // Příklad implementace rozhraní: (src/Tiskarna)

        Tiskarna tiskarna = new Tiskarna();
        tiskarna.tiskni("Hello World!");
        tiskarna.zavolej();
    }
}
