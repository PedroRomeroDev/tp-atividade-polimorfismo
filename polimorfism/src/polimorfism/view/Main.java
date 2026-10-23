package polimorfism.view;
import polimorfism.model.*;

public class Main {
	public static void main(String[] args) {
		// Atividade 1;
		Carro carro = new Carro();
		Bicicleta bicicleta = new Bicicleta();
		
		carro.mover();
		bicicleta.mover();
		
		// Explicação: Quando Definimos Uma Classe e Ela é extendida, podemos alterar os métodos
		// a partir da classe filha, utilizando o mesmo metodos com ações diferentes.
		
		// O professor Ale deu o exemplo do voto, a classe abstrata pessoa pode votar, Ale herda de pessoa
		// logo ele pode votar, mas o voto dele pode ser diferente de outras pessoas mesmo possuindo o mesmo
		// método
		
		// Podemos Fazer as mesmas coisas, mas fazemos de formas diferentes. Isso é polimorfismo! :)
		
		// Atividade 2;
		Calculadora calc = new Calculadora();
		System.out.println(" ");
		calc.somar();
		calc.somar(10.5, 0.5);
		calc.somar("Ale", 10.5, 0.5);
		
		// A Sobrecarga acontece quando você não modifica somente o conteudo interno de um método
		// a sobrecarga ela modifica tambem os parametros, e isso faz com que o mesmo metodo possa
		// ser replicado com diferentes ações dentro da própria classe, como no exemplo acima
		
		// No exemplo acima eu chamei o metodo somar 3 vezes, é o mesmo método (somar) com ações diferentes
		// decorrente da quantidade de parametros que a funcao recebe. a primeira nao recebe, a segunda recebe 2 
		// e assim por diante;
	}

}
