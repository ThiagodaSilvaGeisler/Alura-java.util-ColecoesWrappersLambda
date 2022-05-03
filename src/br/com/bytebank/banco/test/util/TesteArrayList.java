package br.com.bytebank.banco.test.util;

import java.util.Collection;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics
		Collection<Conta> lista = new Vector<Conta>(); //thread safe

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = (Conta) lista.get(0);// Com o novo tipo de referência Collection, passou a não funcionar, porque o método
										//	faz uso de um índice. 
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		
		for( int i = 0; i < lista.size(); i++) {
			
			Object oRef = lista.get(i); // Com o novo tipo de referência Collection, passou a não funcionar
			System.out.println(oRef);
		}
		
		System.out.println("------------------");
		
		// Há uma forma mais moderna de fazer a iteração sobre a lista (hoje em dia, é mais usado):
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
