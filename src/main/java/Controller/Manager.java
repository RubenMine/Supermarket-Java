package Controller;

import Model.Articolo;
import Model.Inventario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Manager {
        public static void addCSVtoInventario(Inventario inv) throws IOException{
        String file = "src/Inventario.csv";
        BufferedReader reader = null;
        ArrayList<String[]> values = new ArrayList<>(); 
        
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = "";
            
            while((line = reader.readLine()) != null){
                values.add(line.split(","));
            }   
            for(String[] row : values){
                if(row[2].contains("ID"))
                    continue;
                else
                    inv.add(new Articolo(row));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        } 
    }
}
