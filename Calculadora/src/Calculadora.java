import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = (int) scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        int num2 = (int) scanner.nextDouble();
        
        int resultadoSuma = sumar(num1,num2);
        System.out.println("La suma es: " + resultadoSuma);
        
        int resultadoResta = restar(num1,num2);
        System.out.println("La resta es: " + resultadoResta);
        
        int resultadoMulti = multiplicar(num1,num2);
        System.out.println("La multiplicación es: " + resultadoMulti);
        
        int resultadoDiv = dividir(num1,num2);
        System.out.println("La división es: " + resultadoDiv);
        
        scanner.close();
		
	}
	
	
	public static  int sumar(int unNumero, int otroNumero) {
		int resultado;
		resultado = unNumero + otroNumero;
		
		return resultado;
	}
	
	public static  int restar(int unNumero, int otroNumero) {
		int resultado;
		resultado = unNumero - otroNumero;
		
		return resultado;
	}
	
	public static int multiplicar(int unNumero, int otroNumero) {
		int resultado;
		resultado = unNumero * otroNumero;
		
		return resultado;
	}
	
	 public static  int dividir(int unNumero, int otroNumero) {
		 int resultado;
		 resultado = unNumero / otroNumero;
		 
		 return resultado;
	 }

}




