
public class Ejercicios {

//	public static void main(String[] args) {
//		//a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
//		//y “b”. Su código puede arrancar (por ejemplo):
//		int numeroInicio = 5;
//		int numeroFin = 14;
//		
//		System.out.println(numeroInicio);
//		while(numeroInicio == 5 && numeroFin == 14 || numeroInicio > 5 && numeroInicio < 14) {			
//			numeroInicio++;
//			System.out.println(numeroInicio);
//		}
//	} 
//}

//public static void main(String[] args) {
////b. A lo anterior, que muestre los pares.
//int numeroInicio = 5;
//int numeroFin = 14;
//
//while(numeroInicio == 5 && numeroFin == 14 || numeroInicio > 5 && numeroInicio < 14) {			
//	numeroInicio++;
//	if(numeroInicio%2 == 0) {
//		System.out.println(numeroInicio);
//	}			
//}
//}
//}


public static void main(String[] args) {
		//c. A lo anterior, con variable extra que muestre pares o impares.
		int numeroInicio = 5;
		int numeroFin = 14;
		boolean numPar = false;
		
		while(numeroInicio == 5 && numeroFin == 14 || numeroInicio > 5 && numeroInicio < 14 && numPar == true) {
			numeroInicio++;
			if(numeroInicio%2 == 0){
				System.out.println(numeroInicio);
			}
		}
		
		while(numeroInicio == 5 && numeroFin == 14 || numeroInicio > 5 && numeroInicio < 14 && numPar == false) {
			numeroInicio++;
			if(numeroInicio%2 != 0) {
				System.out.println(numeroInicio);
			}
		}
	}
}
	
//	public static void main(String[] args) {
//		//Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
//		//persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en
//		//papel y lápiz y sólo implementar el cuarto.
//		//“Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
//		//todas y todos los convivientes:
//		//● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
//		//(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
//		//● Tener 3 o más vehículos con una antigüedad menor a 5 años.
//		//● Tener 3 o más inmuebles.
//		//● Poseer una embarcación, una aeronave de lujo o ser titular de activos
//		//societarios que demuestren capacidad económica plena.”
//		
//		float ingresosMensuales = 489083;
//		int cantVehiculos = 3;
//		int cantInmuebles = 3;
//		boolean embAeroLujoSoc = true;
//		
//		if((ingresosMensuales >= 489083) || (cantVehiculos >= 3) || cantInmuebles >= 3 || embAeroLujoSoc == true ) {
//			
//			System.out.println("La persona pertenece al segmento de ingresos altos.");
//		}else {
//			System.out.println("La persona NO Pertenece al segmento de ingresos altos.");
//		}
//	}
//}
