package ejercicio2;

public class Rectangulo {
	
	double alto;
	double ancho;	
	
	//Creo  dos constructores: con atributos y sin atributos.
	
	public Rectangulo() {
	
	}

	
	public Rectangulo(double alto, double ancho) {
		
		this.alto = alto;
		this.ancho = ancho;
	}


	//Creo la función perímetro con la variable de tipo double para almacenar la fórmula para
	//hallar el perímetro del rectángulo y retorno el valor de la variable a donde sea llamada.
	public double perimetro() {
		double perimetro;
		
		perimetro = this.alto + this.alto + this.ancho + this.ancho;
		
		return perimetro;
	}
	
	//Creo la función área con la variable de tipo double para almacenar la fórmula para
	//hallar el área del rectángulo y retorno el valor de la variable a donde sea llamada.
	public double area() {
		double area;
		
		area = this.alto * this.ancho;
		
		return area;
	}

}
