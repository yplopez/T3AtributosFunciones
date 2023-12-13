package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo las variables para pedir los datos del radioBase, la altura
		// y variable opción para el menú
		double radioBase, altura;
		int opcion;
		//asigno a las variable radioBase, altura y opción del main los valores retornados por las funciones
		//pideRadioBase, altura y menú.
		radioBase = pideRadioBase();
		altura = altura();		
		opcion = menu();
		
		//Instancio la variable cilin de la clase Cilindro y muestro en consola en valor retornado 
		//según la opción seleccionada
		Cilindro cilin = new Cilindro(radioBase, altura);
		if(opcion == 1) {
			System.out.println("El volumen del cilindro es: " + cilin.volumen());
		} else if (opcion == 2) {
			System.out.println("El área del cilindro es: " + cilin.area());
		}
		//Cierro el Scanner
		sc.close();

	}// cierre main

	// Creo la función pideRadioBase después del método main.
	// Creo la variable radioBase para pedir el número dentro de la función.
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
	// Hago return del dato radioBase a la variable radioBase del main.

	public static double pideRadioBase() {
		double radioBase = 0;
		boolean esValido = false;

		while (!esValido) {

			try {
				System.out.println("Introduzca el radio de la base: ");
				radioBase = sc.nextDouble();

				if (radioBase < 0) {
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

		return radioBase;
	}// cierre pideRadioBase

	// Creo la función altura después del método main.
	// Creo la variable altura para pedir el número dentro de la función.
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
	// Hago el return del valor de altura a la variable altura del main.

	public static double altura() {
		double altura = 0;
		boolean esValido = false;

		while (!esValido) {
			try {
				System.out.println("Introduzca la altura del cilindro: ");
				altura = sc.nextDouble();

				if (altura < 0) {
					System.out.println("El número debe ser positivo.");
					esValido = false;
				} else {
					esValido = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("El número debe ser de tipo numérico.");
				esValido = false;
			} finally {
				sc.nextLine();
			}

		}

		return altura;
	}// cierre altura
	
	//Creo la función menú para seleccionar alguna opción.
	//Creo la variable opción para almacenar la opción elegida por el usuario
	//y la variable booleana esValido para retornar al ciclo o salir de el.
	//Creo un ciclo while para controlar que el valor digitado sea válido.
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
			System.out.println("1 = Volumen.");
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
