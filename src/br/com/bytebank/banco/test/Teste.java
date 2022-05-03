package br.com.bytebank.banco.test;

public class Teste {

	// Array[] - A primeira estrutura de dados a aprender;
	// É um objeto;
	// Na hora de criar, eu preciso informar qual o tamanho, caso contrário não
	// estancia.
	// Já inicializa o array com os valores padrões, nos caso de int, é zero.

	public static void main(String[] args) {

		int[] idades = new int[5];

		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade4 = idades[4];
		System.out.println(idade4);
		System.out.println(idades[4]);
		
		//Perguntar o tamanho para o array
		System.out.println(idades.length);
		
		
	}
}
