package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing

		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing

		Boolean bRef = Boolean.FALSE; // autoboxing
		System.out.println(bRef.booleanValue()); // unboxing

		Number refNumero = Integer.valueOf(29);
		Number refNumero2 = Double.valueOf(29.9);
		Number refNumero3 = Float.valueOf(29.9f);

		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}
}
