public class Opakovani3 {
    public static void main(String[] args) {
        // cykly

        // cyklus s předem známým počtem opakování
        for(int i=0; i<10; i++) {
            // cyklus "for": opakování kódu. "i" je proměnná, která se mění v každém průchodu cyklem.
            // int i=0: "i" je inicializována na hodnotu 0.
            // i<10: Cyklus se opakuje, dokud je "i" menší než 10.
            // i++: Po každém průchodu se "i" zvýší o 1.

            System.out.println(i);
        }

        //cyklus s neznámým počtem opakování
        int i = 0;  // "i" je proměnná, která se mění v každém průchodu cyklem.
        while(i < 10) {
            // cyklus "while": opakování kódu. Cyklus se opakuje, dokud je podmínka pravdivá.
            System.out.println(i);
            i++; // Po každém průchodu se "i" zvýší o 1.
        }


    }
}
