package br.com.bytebank.banco.test;

public class Teste {

	// Array[] - A primeira estrutura de dados a aprender;
	// � um objeto;
	// Na hora de criar, eu preciso informar qual o tamanho, caso contr�rio n�o
	// estancia.
	// J� inicializa o array com os valores padr�es, nos caso de int, � zero.

	public static void main(String[] args) {

		int[] idades = new int[5];

		for(int i = 0; i< idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
		
		for(int i= 0; i< idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
	}
}
