import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Debe ingresar 4 parámetros: modo (codificación o decodificación), desplazamiento, archivo de entrada y archivo de salida.");
            return;
        }

        String modo = args[0];
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoEntrada = args[2];
        String archivoSalida = args[3];

        String texto = leerArchivo(archivoEntrada);
        String resultado = "";
        if (modo.equalsIgnoreCase("codificación")) {
            resultado = Codificacion.codificar(texto, desplazamiento);
        } else if (modo.equalsIgnoreCase("decodificación")) {
            resultado = Codificacion.decodificar(texto, desplazamiento);
        } else {
            System.out.println("El modo debe ser 'codificación' o 'decodificación'");
            return;
        }

        if (escribirArchivo(archivoSalida, resultado)) {
            System.out.println("Operación finalizada correctamente.");
        } else {
            System.out.println("Error al escribir en el archivo de salida.");
        }
    }

    public static String leerArchivo(String rutaArchivo) {
        String contenido = "";
        try {
            File archivo = new File(rutaArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                contenido += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo.");
        }
        return contenido;
    }

    public static boolean escribirArchivo(String rutaArchivo, String contenido) {
        try {
            FileWriter writer = new FileWriter(rutaArchivo);
            writer.write(contenido);
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static class Codificacion {

        private static final String alfabeto = "abcdefghijklmnopqrstuvwxyz ";

        public static String codificar(String texto, int desplazamiento) {
            HashMap<Character, Character> reemplazoCaracter = new HashMap<>();
            for (int i = 0; i < alfabeto.length(); i++) {
                char letraOriginal = alfabeto.charAt(i);
                char letraCodificada = alfabeto.charAt((i + desplazamiento) % alfabeto.length());
                reemplazoCaracter.put(letraOriginal, letraCodificada);
            }

            StringBuilder nuevaCadena = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char letra = texto.charAt(i);
                if (letra == ' ') {
                    nuevaCadena.append(' ');
                } else {
                    int indice = alfabeto.indexOf(letra);
                    if (indice != -1) {
                        char letraCodificada = reemplazoCaracter.get(letra);
                        nuevaCadena.append(letraCodificada);
                    } else {
                        nuevaCadena.append(letra);
                    }
                }
            }

            return nuevaCadena.toString();
        }

        public static String decodificar(String textoCodificado, int desplazamiento) {
            return codificar(textoCodificado, alfabeto.length() - desplazamiento);
        }
    }

}

