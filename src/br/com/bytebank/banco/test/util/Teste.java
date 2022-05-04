package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
	
		int idade = 29;
		// Integer idadeRef = new Integer(29); esse m�todo para inicializar a vari�vel n�o � mais utilizado
		
		// M�todo para criar o objeto a partir do primitivo.
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		
		// M�todo para obter o primitivo a partir da refer�ncia:
		int valor = idadeRef.intValue(); //unboxing
		
		// M�todo que transforma o primitivo em double
		double numero3 = idadeRef.doubleValue();
				
		String s = "22";
		// A transforma��o de um String para um tipo mais espec�fico se chama parsing.
		// M�todo que transforma um String em um Integer:
		Integer numero = Integer.valueOf(s);
		
		// M�todo que transforma um String em um tipo primitivo int:
		int numero2 = Integer.parseInt(s);
		
		// M�todos para saber o valor m�ximo que um Integer pode guardar:
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// M�todos para saber quantos bits o Integer tem:
		System.out.println(Integer.SIZE);
		
		// M�todos para saber quantos bytes o Integer tem:
		System.out.println(Integer.BYTES);
		
		
		System.out.println(numero);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
	}
}
