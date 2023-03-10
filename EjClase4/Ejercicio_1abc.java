import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1abc {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Ingrese el tercer número: ");
	        int num3 = scanner.nextInt();

	        System.out.print("Ingrese el criterio de ordenamiento (A o D): ");
	        char ordenamiento = scanner.next().charAt(0);

	        int[] numeros = {num1, num2, num3};

	        if (ordenamiento == 'A') {
	            Arrays.sort(numeros);
	            System.out.println("Orden ascendente: " + Arrays.toString(numeros));
	        } else if (ordenamiento == 'D') {
	            Arrays.sort(numeros);
	            int[] numerosDescendentes = new int[numeros.length];
	            for (int i = 0; i < numeros.length; i++) {
	                numerosDescendentes[i] = numeros[numeros.length - 1 - i];
	            }
	            System.out.println("Orden descendente: " + Arrays.toString(numerosDescendentes));
	        } else {
	            System.out.println("El cuarto parámetro debe ser una letra 'A' o 'D'");
	        }
	        
	        scanner.close();
	}
}
