import java.util.ArrayList;

public class Buscador {
    public void buscarcadena(String patronusuario, String textoSupremo){
        int numcomparaciones = 0;
        int m=0;
        ArrayList<Integer> indexsubcadena = new ArrayList<>();

        for (int i = 0; i<textoSupremo.length(); i++){

            if(textoSupremo.charAt(i)==(patronusuario.charAt(0))){
                String subcadena = textoSupremo.substring(i, i+patronusuario.length());
                m=0;

                while (m<patronusuario.length() && m<subcadena.length() && subcadena.charAt(m) == patronusuario.charAt(m)){
                    m++;
                }

                if(m==patronusuario.length()){
                    numcomparaciones ++;
                    indexsubcadena.add(i);
                }
                
            }
        }
        
        for(int i=0; i<indexsubcadena.size(); i++){
            System.out.print(""+indexsubcadena.get(i)+" a "+(indexsubcadena.get(i)+(patronusuario.length()-1))+", ");
        }

        System.out.println("\n'"+patronusuario+"' se encontro "+numcomparaciones+" veces");
    }
}
