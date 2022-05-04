package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
	
		int idade = 29;
		// Integer idadeRef = new Integer(29); esse método para inicializar a variável não é mais utilizado
		
		// Método para criar o objeto a partir do primitivo.
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		
		// Método para obter o primitivo a partir da referência:
		int valor = idadeRef.intValue(); //unboxing
		
		// Método que transforma o primitivo em double
		double numero3 = idadeRef.doubleValue();
				
		String s = "22";
		// A transformação de um String para um tipo mais específico se chama parsing.
		// Método que transforma um String em um Integer:
		Integer numero = Integer.valueOf(s);
		
		// Método que transforma um String em um tipo primitivo int:
		int numero2 = Integer.parseInt(s);
		
		// Métodos para saber o valor máximo que um Integer pode guardar:
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Métodos para saber quantos bits o Integer tem:
		System.out.println(Integer.SIZE);
		
		// Métodos para saber quantos bytes o Integer tem:
		System.out.println(Integer.BYTES);
		
		
		System.out.println(numero);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
	}
}
