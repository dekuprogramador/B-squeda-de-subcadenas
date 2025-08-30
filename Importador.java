import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Importador {
    public String importartxt(){
        try{
            String text = "a"; // = "a" Ya que si no, se toma como si no se hubiera declarado ni existido
            File textimportado = new File ("textocuento.txt");
            Scanner lector = new Scanner(textimportado);
    
            while(lector.hasNextLine()){
                text = lector.nextLine();
            }
            lector.close();
            return text;
        }
        catch (FileNotFoundException e){
            System.out.println("ERROR");
            e.printStackTrace();
            return "ERROR";
        }

    }
}
