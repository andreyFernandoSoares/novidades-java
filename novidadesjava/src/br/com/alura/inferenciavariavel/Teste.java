package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {
		//Java 10
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");

		System.out.println(cpfPorNomes);
	}
}
