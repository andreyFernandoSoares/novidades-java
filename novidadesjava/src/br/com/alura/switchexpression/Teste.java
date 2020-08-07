package br.com.alura.switchexpression;

public class Teste {

	public static void main(String[] args) {
		String nome = "João";
		//Java 14
		switch (nome) {
			case "Renata" -> System.out.println("Acertou: " + nome);
			case "João" -> System.out.println("Acertou: " + nome);
			default -> System.out.println("Nenhum nome encontrado!!");
		}
		
		switch (nome) {
			case "Renata": {
				System.out.println("Acertou: " + nome);
				break;
			}
			case "João": {
				System.out.println("Acertou: " + nome);
				break;
			}
			default: {
				System.out.println("Nenhum nome encontrado!!");
			}
		}
		
		
	}
}
