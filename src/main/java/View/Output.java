package View;

import Model.Inventario;

public class Output {
    public static void printMenu1() {
        String s1 = String.format("|%25s%-25s%25s|", "", "BENVENUTO AL SUPERMERCATO", "");
        String s2 = String.format("|%25s%-25s%25s|", "", "1 - Aggiungi al Carrello", "");
        String s3 = String.format("|%25s%-25s%25s|", "", "2 - Elimina dal Carrello", "");
        String s4 = String.format("|%25s%-25s%25s|", "", "3 - Mostra Carrello", "");
        String s5 = String.format("|%25s%-25s%25s|", "", "0 - ESCI", "");
        
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println("+---------------------------------------------------------------------------+");
    }
}
