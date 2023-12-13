package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo las variables para pedir los datos de ancho y alto
		// y variable opción para el menú
		double ancho, alto;
		int opcion;
		//asigno a las variable ancho, alto y opción del main los valores retornados por las funciones
		//pideAncho, pideAlto y menú.
		ancho = pideAncho();
		alto = pideAlto();		
		opcion = menu();
		
		//Instancio la variable rect de la clase rectángulo y muestro en consola en valor retornado 
		//según la opción seleccionada
		Rectangulo rect = new Rectangulo(ancho, alto);
		if(opcion == 1) {
			System.out.println("El perimetro del rectángulo es: " + rect.perimetro());
		} else if (opcion == 2) {
			System.out.println("El área del rectángulo es: " + rect.area());
		}
		//Cierro el Scanner
		sc.close();

	}// cierre main

	// Creo la función pideAncho después del método main.
	// Creo la variable ancho para pedir el número dentro de la función.
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
	// Hago return del dato ancho a la variable ancho del main.

	public static double pideAncho() {
		double ancho = 0;
		boolean esValido = false;

		while (!esValido) {

			try {
				System.out.println("Introduzca el ancho: ");
				ancho = sc.nextDouble();

				if (ancho < 0) {
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

		return ancho;
	}// cierre pideAncho

	// Creo la función pideAlto después del método main.
	// Creo la variable alto para pedir el número dentro de la función.
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
	// Hago el return del valor del alto a la variable alto del main.

	public static double pideAlto() {
		double alto = 0;
		boolean esValido = false;

		while (!esValido) {
			try {
				System.out.println("Introduzca el alto: ");
				alto = sc.nextDouble();

				if (alto < 0) {
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

		return alto;
	}// cierre pideAlto
	
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
			System.out.println("1 = Perímetro.");
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
