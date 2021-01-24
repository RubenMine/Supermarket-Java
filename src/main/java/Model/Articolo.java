package Model;

public class Articolo {
    private String articolo;
    private double costo;
    private int id;
    
    public Articolo(String[] values){
        this.articolo = values[0];
        this.costo = Double.parseDouble(values[1]);
        this.id = Integer.parseInt(values[2]);
    }

    public String getArticolo() {
        return articolo;
    }

    public void setArticolo(String articolo) {
        this.articolo = articolo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toString(){
        String s;
        s = String.format("|%20s%20s%20s%15s|", this.articolo, this.costo+"$", this.id, "");
        return s;
    }
}
