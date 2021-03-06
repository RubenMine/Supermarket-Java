package Controller;

import Model.Inventario;
import Model.Spesa;
import static View.Input.getSceltaMenu;
import static View.Output.printMenu1;
import java.io.IOException;

public class Pgm {
    public static void main(String[] args) throws IOException {
        Inventario inv = new Inventario();
        Spesa spesa = new Spesa();
        int scelta;
        
        Manager.addCSVtoInventario(inv);
        System.out.print(inv);
        
        do{
            printMenu1();
            scelta = getSceltaMenu(); 

            if(scelta >= 1 && scelta <= 3){
                switch(scelta) {
                    case 1:
                        spesa.aggiungiAlCarrello(inv);
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("Numero Articoli nel carrello: " + spesa.numeroArticoli());
                        System.out.println("Costo Iva: " + spesa.getCosto());
                        System.out.println("Costo No Iva: " + spesa.getCostoNoIva());
                        break;
                }
            }
            else if(scelta != 0) {
                
            }
        }while(scelta != 0);
    }
}
