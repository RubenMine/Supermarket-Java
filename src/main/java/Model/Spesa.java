package Model;

import java.util.ArrayList;

public class Spesa {
    private ArrayList<String> articoli;
    private ArrayList<Double> costi;
    private double costoIva;
    
    public Spesa(){
        articoli = new ArrayList<>();
        costi = new ArrayList<>();
        this.costoIva = 0;
    }
    
    public void aggiungi(int id, Inventario inv){
        Articolo obj;
        if(inv.getInv().containsKey(id)){
            obj = (Articolo) inv.getInv().get(id);
            articoli.add(obj.getArticolo());
            costi.add(obj.getCosto());
            aggiornaCosto();
        }
        else {
            System.out.println("ID " + id + " NON VALIDO!");
        }
    }

    private void aggiornaCosto() {
        this.costoIva = 0;
        for(double costo : costi)
            this.costoIva += costo;
    }
    
    public int numeroArticoli() {
        return this.articoli.size();
    }
    
    public double getCostoNoIva() {
        return this.costoIva - costoIva*22/100; 
    }
    
    public double getCosto() {
        return costoIva;
    }
    
    public void aggiungiAlCarrello(Inventario inv) {
        int id;
        int quantita;
        do{
            System.out.println();
            System.out.println("ID non valido = exit");
            id = Input.idScanner(inv);
            if(id != 0){
                quantita = Input.quantitaScanner();
                for(int i = 1; i <= quantita; i++)
                    this.aggiungi(id, inv);
            }
        }while(id != 0);       
    }
}
