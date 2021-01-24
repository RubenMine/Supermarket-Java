package View;

import java.util.Scanner;

public class Input {
    public static int getSceltaMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("V");
        int scelta = sc.nextInt();
        return scelta;
    }
}
