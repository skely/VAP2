public class AbstraktniTridy {
    public static void main(String[] args) {
        // Abstraktní třídy jsou třídy, které nemohou být instancovány.
        // Slouží jako základ pro odvozené třídy.
        // Abstraktní třída je deklarována pomocí klíčového slova "abstract".
        // Abstraktní třída může obsahovat implementované metody.
        // Abstraktní třída může obsahovat abstraktní metody, které musí být implementovány v odvozených třídách.
        // Abstraktní metoda je metoda, která nemá implementaci.
        // Abstraktní metoda je deklarována pomocí klíčového slova "abstract".
        // Abstraktní metoda nemá složené závorky "{}".

        // Příklad abstraktní třídy: (src/GeometrickyUtvar)
        // Příklad odvozené třídy: (src/Kruh)
        // Příklad odvozené třídy: (src/Ctverec)

        GeometrickyUtvar[] tvary = new GeometrickyUtvar[2];
        tvary[0] = new Kruh(5);
        tvary[1] = new Ctverec(4);

        for (GeometrickyUtvar tvar : tvary) {
            System.out.println("Obvod: " + tvar.spoctiObvod());
            System.out.println("Obsah: " + tvar.spoctiObsah());
            System.out.println("Pomer obvodu a obsahu: " + tvar.spoctiDeleniObvoduAObsahu());
        }


    }
}
