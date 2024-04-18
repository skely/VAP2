public class Retezce {
    public static void main(String[] args) {
        String s1 = "Ahoj";
        String s2 = "Nazdar";

        // vypsani obsahu retezcu
        System.out.println(s1);

        // konkatenace retezcu (spojeni retezcu)
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // zjisteni delky retezce
        int delka = s3.length();
        System.out.println("Delka retezce: " + delka);

        // zjisteni znaku na urcite pozici
        char znak = s3.charAt(3);
        System.out.println("Znak na pozici 3: " + znak);

        // porovnani retezcu
        boolean jeStejny = s1.equals(s2);
        System.out.println("Retezce jsou stejne: " + jeStejny);

        // porovnani retezcu bez ohledu na velikost pismen
        boolean jeStejnyIgnoreCase = s1.equalsIgnoreCase(s2);
        System.out.println("Retezce jsou stejne bez ohledu na velikost pismen: " + jeStejnyIgnoreCase);

        // zjisteni pozice podretezce v retezci
        int pozice = s3.indexOf("dar");
        System.out.println("Pozice podretezce 'dar': " + pozice);

        // zjisteni pozice podretezce v retezci od urcite pozice
        int pozice2 = s3.indexOf("dar", 5);
        System.out.println("Pozice podretezce 'dar' od pozice 5: " + pozice2);

        // kopirovani casti retezce
        String s4 = s3.substring(5, 10);
        System.out.println("Podretezec od pozice 5 do 10: " + s4);

        // dalsi metody: startsWith, endsWith, toLowerCase, toUpperCase, trim, replace, split, ...
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        // plati obecne moznost nahlizeni do dokumentace k Java API

    }
}
