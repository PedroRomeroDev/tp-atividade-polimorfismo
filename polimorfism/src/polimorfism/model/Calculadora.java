package polimorfism.model;

public class Calculadora {
	public void somar () {
		System.out.println("Somar Sem Parametros.");
	}
	
	public void somar (double n1, double n2) {
		System.out.println("Soma: " + (n1 + n2));
	}

	public void somar (String palavra, double n1, double n2) {
		System.out.println(palavra + " esta Realizando uma soma: " + (n1 + n2));
	}
}
