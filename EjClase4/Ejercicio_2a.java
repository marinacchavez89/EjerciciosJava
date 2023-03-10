import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio_2a {

	public static void main(String[] args) {
		if (args.length != 2) {
            System.out.println("Debe ingresar la ruta del archivo y la operación a realizar (suma o multiplicacion)");
        } else {
            String rutaArchivo = args[0];
            String operacion = args[1];

            File archivo = new File(rutaArchivo);
            try {
                Scanner scanner = new Scanner(archivo);

                int resultado = 0;

                if (operacion.equalsIgnoreCase("suma")) {
                    while (scanner.hasNextInt()) {
                        resultado += scanner.nextInt();
                    }
                } else if (operacion.equalsIgnoreCase("multiplicacion")) {
                    resultado = 1;
                    while (scanner.hasNextInt()) {
                        resultado *= scanner.nextInt();
                    }
                } else {
                    System.out.println("La operación debe ser suma o multiplicacion");
                }

                System.out.println("El resultado de la " + operacion + " es: " + resultado);

                scanner.close();

            } catch (FileNotFoundException e) {
                System.out.println("El archivo no se encuentra en la ruta especificada");
            }
        }

	}

}
