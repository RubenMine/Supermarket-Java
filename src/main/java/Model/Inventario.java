package Model;

import java.util.HashMap;

public class Inventario {
    private HashMap<Integer, Articolo> inventario = new HashMap<>();

    public Inventario() {
    }
    
    public HashMap getInv(){
        return this.inventario;
    }
    
    public void add(Articolo p) {
        inventario.put(p.getId(), p);
    }
    
    public String toString() {
        String s1 = String.format("|%20s%20s%20s%15s|", "ARTICOLO", "COSTO", "ID", "");
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println(s1);
        System.out.println("+---------------------------------------------------------------------------+");
        for(Integer art : inventario.keySet())
            System.out.println(inventario.get(art));
        return "";
    }
}