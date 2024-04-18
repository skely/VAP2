public class Osoba {
    // deklarace atributů třídy
    // atributy třídy jsou proměnné, které jsou společné pro všechny instance třídy
    // atributy třídy se deklarují jako proměnné mimo metody
    // atributy třídy by měly být deklarovány jako private (soukromé) a přístup k nim by měl být zajištěn pomocí getterů a setterů - princip "zapouzdření".
    private String jmeno;
    private int vek;
    private double vyska;
    private double vaha;

    // konstruktor třídy
    // konstruktor je metoda, která se volá při vytváření nové instance třídy
    // konstruktor má stejný název jako třída
    // konstruktor nemá návratový typ
    // konstruktor může mít parametry
    // konstruktor může být přetížen (mít více verzí s různými parametry)
    public Osoba(String jmeno) {
        this.jmeno = jmeno;
        this.vek = 0;  // výchozí hodnota pro věk je 0
        this.vyska = 0;  // výchozí hodnota pro výšku je 0
        this.vaha = 0;  // výchozí hodnota pro váhu je 0
    }
    public Osoba(String jmeno, int vek, double vyska, double vaha) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.vyska = vyska;
        this.vaha = vaha;
    }

    // metody třídy
    // metody třídy jsou funkce, které mohou pracovat s atributy třídy
    // metody třídy mohou být veřejné (public), pokud mají být přístupné zvenčí
    // metody třídy mohou být soukromé (private), pokud mají být použity pouze uvnitř třídy
    // metody třídy mohou být statické (static), pokud mají pracovat s atributy třídy a ne s instancemi třídy

    // metoda pro získání jména osoby
    // modifikátor přístupu "public" znamená, že metoda je přístupná zvenčí
    // návratový typ "String" znamená, že metoda vrací řetězec
    // název metody je "getJmeno"
    // metoda nemá parametry "()"
    // metoda vrací hodnotu atributu "jmeno"
    public String getJmeno() {
        return jmeno;
    }
    // metoda pro nastavení jména osoby
    // modifikátor přístupu "public" znamená, že metoda je přístupná zvenčí
    // návratový typ "void" znamená, že metoda nevrací žádnou hodnotu
    // název metody je "setJmeno"
    // metoda má jeden parametr "jmeno" typu "String"
    // metoda nastaví hodnotu atributu "jmeno" na hodnotu parametru "jmeno"
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    // metoda pro získání věku osoby
    public int getVek() {
        return vek;
    }
    // metoda pro nastavení věku osoby
    public void setVek(int vek) {
        this.vek = vek;
    }
    // metoda pro získání výšky osoby
    public double getVyska() {
        return vyska;
    }
    // metoda pro nastavení výšky osoby
    public void setVyska(double vyska) {
        this.vyska = vyska;
    }
    // metoda pro získání váhy osoby
    public double getVaha() {
        return vaha;
    }
    // metoda pro nastavení váhy osoby
    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    // metoda pro výpis informací o osobě
    public void zobrazInfo() {
        System.out.println("Jméno: " + jmeno);
        System.out.println("Věk: " + vek);
        System.out.println("Výška: " + vyska + " cm");
        System.out.println("Váha: " + vaha + " kg");
    }

    // metoda pro výpočet BMI (Body Mass Index)
    // metoda vrací hodnotu typu "double"
    // metoda pracuje s atributy třídy "vyska" a "vaha", tyto atributy jsou soukromé, ale jsou přístupné uvnitř třídy
    public double bmi() {
        // BMI = váha (kg) / (výška (m) * výška (m))
        double vyskaM = vyska / 100; // převod výšky z cm na m
        return vaha / (vyskaM * vyskaM);
    }


}
