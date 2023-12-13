package ejercicio4;

public class Cilindro {
	double radioBase;
	double altura;	
	
	//Creo  dos constructores: con atributos y sin atributos.
	
	public Cilindro() {
	
	}

	
	public Cilindro(double radioBase, double altura) {
		
		this.radioBase = radioBase;
		this.altura = altura;
	}


	//Creo la función volumen con la variable de tipo double para almacenar la fórmula para
	//hallar el volumen del cilindro y retorno el valor de la variable a donde sea llamada.
	public double volumen() {
		double volumen;
		
		volumen = Math.PI*(this.radioBase*this.radioBase)*this.altura;
		
		return volumen;
	}
	
	//Creo la función área con la variable de tipo double para almacenar la fórmula para
	//hallar el área del cilindro y retorno el valor de la variable a donde sea llamada.
	public double area() {
		double area;
		
		area = ((2*Math.PI)*this.radioBase)*(this.altura+this.radioBase);
		
		return area;
	}

}
