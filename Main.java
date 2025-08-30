import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Importador importador = new Importador();
        Buscador buscador  = new Buscador();
        Scanner scanner = new Scanner(System.in);

        String textosupremo = importador.importartxt();

        System.out.println("Ingrese el patron a encontrar: ");
        String patron = scanner.nextLine();

        long inicio = System.nanoTime(); //Inicia el temporizador
        buscador.buscarcadena(patron, textosupremo);
        long fin = System.nanoTime(); //Termina el temporizador
        long duracion = fin - inicio; //Calcula el tiempo de ejecucion

        System.out.println("Tiempo de ejecución: " + duracion / 1_000_000 + " ms"); //Muestra el tiempo conviertiendolo a milisegundos
        scanner.close();
    }
}
