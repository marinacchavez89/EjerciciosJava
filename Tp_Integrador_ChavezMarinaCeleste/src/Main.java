import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
		    File file = new File("ruta/archivo.csv");
		    Scanner scanner = new Scanner(file);

		    while (scanner.hasNextLine()) {
		        String linea = scanner.nextLine();
		        // Procesar la línea
		    }
		} catch (FileNotFoundException e) {
		    // Manejar el caso en que no se encuentre el archivo
		}
		
		String rutaResultados = args[0];
	    String rutaPronosticos = args[1];

	    try {
	        // Leer archivo de resultados
	        File archivoResultados = new File(rutaResultados);
	        Scanner scannerResultados = new Scanner(archivoResultados);

	        // Procesar cada línea del archivo de resultados
	        while (scannerResultados.hasNextLine()) {
	            String lineaResultado = scannerResultados.nextLine();
	            // Crear objeto de la clase Resultado a partir de la línea leída
	            // Agregar el objeto a la lista de resultados de la ronda correspondiente
	        }

	        // Leer archivo de pronósticos
	        File archivoPronosticos = new File(rutaPronosticos);
	        Scanner scannerPronosticos = new Scanner(archivoPronosticos);

	        // Procesar cada línea del archivo de pronósticos
	        while (scannerPronosticos.hasNextLine()) {
	            String lineaPronostico = scannerPronosticos.nextLine();
	            // Crear objeto de la clase Pronostico a partir de la línea leída
	            // Agregar el objeto a la lista de pronósticos del participante correspondiente
	        }

	        // Calcular puntaje del participante y mostrar por pantalla
	        // ...
	    } catch (FileNotFoundException e) {
	        System.out.println("No se pudo abrir alguno de los archivos");
	    }

	}

}
