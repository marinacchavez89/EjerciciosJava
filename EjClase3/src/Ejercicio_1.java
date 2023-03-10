
public class Ejercicio_1 {

	public static void main(String[] args) {
//		1. Utilizando solo tipos primitivos, String (solo usar método length), vectores,
//		iteraciones simples y condicionales, genere una clase por ejercicio que posea los
//		siguientes métodos:
//		a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
//		el String
//		b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
//		mismos y los retorne en un vector de 3
//		c. dado un vector de números, y un número X, que sume todos los números > X y
//		retorne el resultado.
		
		String cadena = "Hola, cómo estás?";
        char letra = 'o';
        int cantidad = contarLetra(cadena, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en la cadena.");
	}
	
	public static int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

}
