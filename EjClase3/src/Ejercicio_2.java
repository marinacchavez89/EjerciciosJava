import java.util.HashMap;

public class Ejercicio_2 {

	public static void main(String[] args) {
//		2.Genere una clase que tenga los métodos para realizar la codificación y decodificación
//		de un string, dado un número de desplazamiento.
//		● Por ejemplo, con desplazo de 1:
//		“hola que tal” -> “ipmbarvfaubm”
//		h -> i
//		o -> p
//		● con desplazo de 2
//		“hola que tal” -> “jqncbswgbvcn”
//		h -> j
//		o -> q
//		En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
//		Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por
//		ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde
//		arr es un char[]. Tenga a mano los javadocs del mismo.
		
		 String texto = "hola que tal";
	        int desplazamiento = 1;

	        String textoCodificado = Codificacion.codificar(texto, desplazamiento);
	        System.out.println("Texto codificado: " + textoCodificado);
	        String textoDecodificado = Codificacion.decodificar(textoCodificado, desplazamiento);
	        System.out.println("Texto decodificado: " + textoDecodificado);
	}
	
	public class Codificacion {

		private static final String alfabeto = "abcdefghijklmnopqrstuvwxyz";

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
