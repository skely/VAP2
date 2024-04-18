public class Opakovani4 {
    public static void main(String[] args) {
        // podminky
        // příklady podmínek jsou v cyklech,
        // ale mohou být i mimo cykly,
        // např. pokud honota proměnné závisí na uživatelském vstupu nebo jiných faktorech

        for (int i = 0; i < 10; i++) {
            // if (podmínka) { kód, který se provede, pokud je podmínka pravdivá }
            if (i < 5) {
                System.out.println(i + " je mensi nez 5.");
            }
        }

        for (int i = 0; i < 10; i++) {
            // if (podmínka) { kód, který se provede, pokud je podmínka pravdivá }
            // else { kód, který se provede, pokud podmínka není pravdivá }

            if (i < 5) {
                System.out.println(i + " je mensi nez 5.");
            } else {
                System.out.println(i + " je vetsi nez 5.");
            }
        }

        for (int i = 0; i < 10; i++) {

            // if (podmínka) { kód, který se provede, pokud je podmínka pravdivá }
            // else if (další podmínka) { kód, který se provede, pokud je podmínka pravdivá }
            // else if (další podmínka) { kód, který se provede, pokud je podmínka pravdivá }
            // else { kód, který se provede, pokud žádná z předchozích podmínek není pravdivá }

            if (i < 5) {
                System.out.println(i + " je mensi nez 5.");
            } else if (i == 5) {
                System.out.println(i + " je rovno 5.");
            } else if (i==6) {
                System.out.println(i + " je rovno 6.");
            } else {
                System.out.println(i + " ostatní případy.");
            }
        }

        for (int i = 0; i < 10; i++) {
            // switch (hodnota) { case hodnota1: kód; break; case hodnota2: kód; break; default: kód; }
            switch (i) {
                case 0:
                    System.out.println("Nula");
                    break;
                case 1:
                    System.out.println("Jedna");
                    break;
                case 2:
                    System.out.println("Dva");
                    break;
                default:
                    System.out.println("Ostatní");
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // vnorene podminky
                if (i < 5) {
                    System.out.println("i:" + i + " je mensi nez 5.");
                    if (j < 5) {
                        System.out.println("j: " + j + " je mensi nez 5.");
                    } else {
                        System.out.println("j: " + j + " je vetsi nez 5.");
                    }
                }
            }
        }
    }
}
