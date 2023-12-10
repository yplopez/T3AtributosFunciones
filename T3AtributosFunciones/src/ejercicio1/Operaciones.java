package ejercicio1;

public class Operaciones {
	//Creo las variables num1 y num2 para hacer todas las operaciones de las diferentes funciones
	double num1, num2;
	
	//Creo la función operaciones con los atributos de las dos variables creadas
	public Operaciones(double num1, double num2) {
	//Creo el constructor con parámetros para poder utilizar los dos atributos de la clase en las funciones
		this.num1 = num1;
		this.num2 = num2;
	}
	//Creo el constructor sin parámetros para instanciar la función sin parámetros
	public Operaciones() {

	}
	//Creo una función para retornar el resultado de cada operación con los atributos (num1 y num2)
	//En el caso de máximo y mínimo hago un if-else para evaluar cual es el número mayor o menor
	//segun corresponda la operación y retorne el resultado.
	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicacion() {
		return num1 * num2;
	}

	public double division() {
		return num1 / num2;
	}

	public double maximo() {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public double minimo() {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
