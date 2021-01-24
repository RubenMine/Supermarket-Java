package View;

import java.util.Scanner;

public class Input {
    public static int getSceltaMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("V");
        int scelta = sc.nextInt();
        return scelta;
    }
    
        public static int quantitaScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantità: ");
        return sc.nextInt();
    }

    public static int idScanner(Inventario inv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        int id = sc.nextInt();
        if(inv.getInv().containsKey(id))
            return id;
        return 0;
    }
}
