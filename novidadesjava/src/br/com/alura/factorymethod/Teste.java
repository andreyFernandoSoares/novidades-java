package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		//Java 9
		List<String> nomes = List.of("primeiroNome", "segundoNome", "terceiroNome");
		Set<String> nomesSet = Set.of("terceiroNome");
		Map<String, String> nomesMap = Map.of("nome", "João");
//		ArrayList<String> nomes = new ArrayList<>();
//		nomes.add("primeiroNome");
//		nomes.add("segundoNome");
//		nomes.add("terceiroNome");
//		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
//		System.out.println(nomes);
	}
}
