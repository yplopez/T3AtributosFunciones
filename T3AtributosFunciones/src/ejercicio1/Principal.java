package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Creo el Scanner para ingreso de datos en la clase principal (debe ser
	// estatico)
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo las variables para almacenar la opción elegida en el menú y
		// para almacenar los números ingresados por el usuario
		int opcion;
		double numero1, numero2;

		// Asigno a la variable opción de la clase principal el valor retornado por
		// la función menú
		opcion = menu();

		// Creo un if para evaluar si el usuario ingresó un cero y cerrar el programa
		if (opcion != 0) {

			// Asigno a las variables numero1 y numero2 el valor retornado por la función
			// pide número
			numero1 = pideNumero();
			numero2 = pideNumero();

			// Instacio una nueva variable de la clase operaciones y le paso los atributos
			// de numero1 y numero2
			Operaciones op = new Operaciones(numero1, numero2);

			// Creo un condicional de tipo switch-case para que de acuerdo a la opción
			// elegida
			// llame al método indicado de la clase Operaciones
			switch (opcion) {
			case 1:
				System.out.println("La suma es igual a " + op.suma());
				break;
			case 2:
				System.out.println("La resta es igual a " + op.resta());
				break;
			case 3:
				System.out.println("La multiplicación es igual a " + op.multiplicacion());
				break;
			case 4:
				System.out.println("La división es igual a " + op.division());
				break;
			case 5:
				System.out.println("El número máximo es " + op.maximo());
				break;
			case 6:
				System.out.println("La número mínimo es " + op.minimo());
				break;
			}// cierre Switch
		}
		// Cierro el Scanner
		sc.close();

	}// Cierre main

	// Creo la función menú para pedir que el usuario elija una opción, para ello debo:
	// Crear la variable opción para la función menú.
	// Creo la variable booleana esValido para repetir o no el ciclo.
	// Hago un ciclo do-while que evalua si debe o no volver a preguntar.
	// Hago un try-catch-finally con la excepción para enviar alerta por escribir
	// una opción que no sea integer.
	// Hago un if-else que condiciona a no recibir un integer diferente
	// de los de las opciones.
	// Hago el return de el valor de la función menú a la variable opción del metodo main.
	public static int menu() {
		int opcion = 7;
		boolean esValido = false;

		do {
			try {
				System.out.println("Elija una opción para la operacion que quiera realizar.");
				System.out.println("1: Suma");
				System.out.println("2: Resta");
				System.out.println("3: Multiplicación");
				System.out.println("4: División");
				System.out.println("5: Máximo");
				System.out.println("6: Mínimo");
				System.out.println("0: Salir");
				opcion = sc.nextInt();
				if (opcion < 0 || opcion > 6) {
					esValido = false;
				} else {
					esValido = true;
				}
			} catch (InputMismatchException e) {
				esValido = false;
				System.out.println("La opción debe ser de tipo numérica.");
			} finally {
				sc.nextLine();
			}
		} while (!esValido);
		
		// Retorno el valor de la variable opcion
		return opcion;
	}// cierre menú
	
	
	//Creo la función pideNumero para que el usuario ingrese dos valores numéricos de tipo double 
	//para que la función se lleve a cabo debo:
	//Declarar una variable número donde se almacenarán los valores que ingrese el usuario.
	//Declaro una variable de tipo booleano para evaluar que el valor sea válido (entero positivo)
	//Creo un ciclo do-while que permite repetir la función si el dato no es válido.
	//Creo un try-catch-finally donde se piden los números al usuario y si el valor no es de tipo numérico
	//lanzará una excepción y limpia los residuos en memoria.
	//Creo un if-else para condicionar que el número sea positivo.
	//Hago el return de los valores de la variable número de la función pideNumero a las variables numero1 y
	//numero2 de el metodo main.
	public static double pideNumero() {
		double numero = 0;
		boolean esValido = false;

		
		do {
			try {
				System.out.println("Introduzca un número");
				numero = sc.nextDouble();

				if (numero < 0) {
					System.out.println("El número debe ser positivo.");
					esValido = false;
				} else {
					esValido = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("El dato debe ser de tipo numérico.");
				esValido = false;

			} finally {
				sc.nextLine();
			}
		} while (!esValido);

		
		//Retorno el número ingresado
		return numero;

	}// Cierre pideNumero

}
