public class Opakovani2 {
    public static void main(String[] args) {
        // Základní (primitivní) datové typy:
        // byte, short, int, long, float, double, char, boolean
        // příklady:

        byte b = 1;  // promenná typu byte obsahuje celé číslo v rozsahu -128 až 127
        short s = 2;  // promenná typu short obsahuje celé číslo v rozsahu -32 768 až 32 767
        int i = 3;  // promenná typu int obsahuje celé číslo v rozsahu -2 147 483 648 až 2 147 483 647
        long l = 4;  // promenná typu long obsahuje celé číslo v rozsahu -9 223 372 036 854 775 808 až 9 223 372 036 854 775 807
        float f = 5.5f;  // promenná typu float obsahuje desetinné číslo v rozsahu 1.4E-45 až 3.4028235E38
        double d = 6.6;  // promenná typu double obsahuje desetinné číslo v rozsahu 4.9E-324 až 1.7976931348623157E308
        char c = 'a';  // promenná typu char obsahuje jeden znak
        boolean bool = true;  // promenná typu boolean obsahuje hodnotu true nebo false

        // Základní operátory:
        // +, -, *, /, %, ++, --, +=, -=, *=, /=, ==, !=, >, <, >=, <=, &&, ||

        // Příklady operace s číselnými datovými typy:
        int a = 1 + 2;  // a = 3
        double x = 3.5 - 1;  // x = 2
        int y = 2 * 3;  // y = 6
        int z = 10 / 2;  // z = 5
        int w = 10 % 3;  // w = 1 (zbytek po dělení)

        int v = 1;  // v = 1
        v++;  // v = 2 (inkrementace - zvýšení o 1)
        v--;  // v = 1  (dekrementace - snížení o 1)

        int u = 1;  // u = 1
        u += 2;  // u = 3 (u = u + 2)
        u -= 1;  // u = 2 (u = u - 1)
        u *= 3;  // u = 6 (u = u * 3)
        u /= 2;  // u = 3 (u = u / 2)

        // Pole
        // Pole je datová struktura, která obsahuje více prvků stejného typu.
        // Prvky pole jsou indexovány od 0.
        // Přístup k prvku pole: pole[index]
        // Deklarace pole: typ[] nazevPole = new typ[delkaPole];
        // Příklady:
        int[] poleCisel = new int[5];  // pole s 5 prvky typu int
        poleCisel[0] = 1;  // první prvek pole
        poleCisel[1] = 2;  // druhý prvek pole
        poleCisel[2] = 3;  // třetí prvek pole
        poleCisel[3] = 4;  // čtvrtý prvek pole
        poleCisel[4] = 5;  // pátý prvek pole

        // Deklarace a inicializace pole:
        int[] poleCisel2 = {1, 2, 3, 4, 5};  // pole s 5 prvky typu int

        // Výpis prvků pole:
        for (int j = 0; j < poleCisel2.length; j++) {
            System.out.println(poleCisel2[j]);
        }


    }
}
