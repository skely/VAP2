public class ProgramovaDokumentace {
    // Komentáře slouží k dokumentaci kódu.

    // Jednoradkovy komentar je uvozen dvema lomitky - "//"
    // Jedná se o komentář, který je určený pro programátora.
    // Tento komentář se nezobrazí ani nijak neprojeví při spuštění programu.

    int a = 5; // Jednoradkovy komentar může být i za kódem na stejném řádku.

    /* Víceřádkový komentář je uvozen lomítkem a hvězdičkou - "/*"
    a ukončen hvězdičkou a lomítkem - "* /"
    Víceřádkový komentář může obsahovat více řádků.
    Tento komentář se nezobrazí ani nijak neprojeví při spuštění programu.
    */

    // Docstrings jsou speciální komentáře, které se zobrazují v dokumentaci kódu.
    // Docstrings jsou uvozeny lomítkem a dvěma hvězdičkami - "/**"
    // a ukončeny hvězdičkou a lomítkem - "* /"
    // Docstrings mohou obsahovat speciální značky, které se používají pro generování dokumentace.
    // Například značka "@param" se používá pro popis parametrů metody.
    // Značka "@return" se používá pro popis návratové hodnoty metody.
    // Docstrings se zobrazují v dokumentaci kódu a jsou užitečné pro programátory, kteří čtou kód.
    // Příklad docstrings:
    /**
     * Metoda pro výpočet součtu dvou čísel.
     * @param a První číslo.
     * @param b Druhé číslo.
     * @return Součet dvou čísel.
     */
    public int soucet(int a, int b) {
        return a + b;
    }

    // Technická dokumentace je důležitá součást vývoje softwaru.
    // Dokumentace popisuje, jak kód funguje, jaké má vstupy a výstupy a jaké jsou jeho vlastnosti.
    // Dobrá dokumentace usnadňuje spolupráci mezi programátory a zvyšuje přehlednost a udržitelnost kódu.

    // Uživatelská dokumentace je důležitá pro uživatele softwaru.
    // Uživatelská dokumentace popisuje, jak softwaru používat, jaké má funkce a jak řeší uživatelské potřeby.
    // Dobrá uživatelská dokumentace zvyšuje uživatelskou spokojenost a snižuje náklady na podporu a školení uživatelů.
}
