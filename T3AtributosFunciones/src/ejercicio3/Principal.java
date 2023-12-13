package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo la variable para pedir el dato del radio
		// y variable opción para el menú
		double radio;
		int opcion;
		//asigno a las variable radio y opción del main los valores retornados por las funciones
		//pideRadio y menú.
		radio = pideRadio();
				
		opcion = menu();
		
		//Instancio la variable rect de la clase rectángulo y muestro en consola en valor retornado 
		//según la opción seleccionada
		Circulo circ = new Circulo(radio);
		if(opcion == 1) {
			System.out.println("La circunferencia del círculo es: " + circ.circunferencia());
		} else if (opcion == 2) {
			System.out.println("El área del círculo es: " + circ.area());
		}
		//Cierro el Scanner
		sc.close();

	}// cierre main

	// Creo la función pideRadio después del método main.
	// Creo la variable radio para pedir el número dentro de la función.
	// Creo la variable booleana para validar o no los datos introducidos y
	// permitir la ejecución del programa.
	// Creo un ciclo while para poner la condición que permite o no que se
	// ejecute la función.
	// Creo un try-catch-finally que permite preguntar y almacenar el valor, seguido
	// de un if-else
	// para condicionar que el número introducido sea positivo, si no lo es
	// envia un mensaje y vuelve a preguntar, si es valido permite que pase al catch
	// que evaluará que sea un dato numérico, si no, lanza una excepción y
	// con finally se limpian los /n generados.
	// Hago return del dato radio a la variable radio del main.

	public static double pideRadio() {
		double radio = 0;
		boolean esValido = false;

		while (!esValido) {

			try {
				System.out.println("Introduzca el radio: ");
				radio = sc.nextDouble();

				if (radio < 0) {
					System.out.println("El número debe ser un entero positivo.");
					esValido = false;
				} else {
					esValido = true;
				}

			} catch (InputMismatchException e) {
				System.out.println("El valor es de tipo numérico");
				esValido = false;
			} finally {
				sc.nextLine();
			}

		} // cierre while

		return radio;
	}// cierre pideRadio

	
	//Creo la función menú para seleccionar alguna opción.
	//Creo la variable opción para almacenar la opción elegida por el usuario
	//y la variable booleana esValido para retornar al ciclo o salir de el.
	//Creo un ciclo while para controlarue el valor digitado sea válido.
	//Creo un try-catch-finally para lanzar la excepción de alerta por digitar un 
	//valor que no es numérico y limpio la consola de residuos /n.
	//Creo un if-else para evaluar que no se ingresen valores numéricos diferentes
	//a las opciones dadas.
	//Y hago return de la opción a la variable opción del main.
	
	public static int menu() {
		
		int opcion = 3;
		boolean esValido = false;		
		
		while(!esValido) {
			try {
			System.out.println("Introduzca una opción:");
			System.out.println("1 = Circunferencia.");
			System.out.println("2 = Área.");
			System.out.println("0 = Salir");
			
			opcion = sc.nextInt();
			
		if(opcion <0 || opcion >=3) {
			esValido = false;			
		}else {
			esValido = true;
		}
			}catch(InputMismatchException e) {
				System.out.println("La opción es de tipo numérico.");
				esValido = false;
			}finally {
				sc.nextLine();
				
			}
		
		}//cierre While
		
		return opcion;
	}

}
