public class Zak extends Osoba{
    // Třída Zak dědí od třídy Osoba
    // Třída Zak má všechny atributy rodičovské třídy, ale má navíc atributy trida a rocnik

    private String trida;
    private int rocnik;

    // konstruktor má stejný název jako třída
    public Zak(String jmeno, String trida, int rocnik) {
        super(jmeno);  // volání konstruktoru rodičovské třídy
        this.trida = trida;
        this.rocnik = rocnik;
    }

    // metoda pro získání třídy žáka
    public String getTrida() {
        return trida;
    }
    // metoda pro nastavení třídy žáka
    public void setTrida(String trida) {
        this.trida = trida;
    }
    // metoda pro získání ročníku žáka
    public int getRocnik() {
        return rocnik;
    }
    // metoda pro nastavení ročníku žáka
    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }
    // metoda pro zobrazení informací o žákovi
    public void zobrazInfo() {
        super.zobrazInfo();  // volání metody rodičovské třídy
        System.out.println("Třída: " + trida);
        System.out.println("Ročník: " + rocnik);
    }
}
