package ejercicio3;

public class Circulo {
	double radio;
		
	
	//Creo  dos constructores: con atributos y sin atributos.
	
	public Circulo() {
	
	}

	
	public Circulo(double radio) {
		
		this.radio = radio;
		
	}


	//Creo la función circunferencia con la variable de tipo double para almacenar la fórmula para
	//hallar la circunferencia del círculo y retorno el valor de la variable a donde sea llamada.
	public double circunferencia() {
		double circunferencia;
		
		circunferencia = (2*Math.PI)*this.radio;
		
		return circunferencia;
	}
	
	//Creo la función área con la variable de tipo booleano para almacenar la fórmula para
	//hallar el área del círculo y retorno el valor de la variable a donde sea llamada.
	public double area() {
		double area;
		
		area = Math.PI*(this.radio*this.radio);
		
		return area;
	}

}
