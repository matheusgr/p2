package r.c2.recursividade.lista_com_generics;

public class Main {

	public static void main(String[] args) {
		MinhaLista<String> nomes = new MinhaLista<>("Matheus");
		nomes.add("Sergio");
		nomes.add("Talita");
		System.out.println(nomes);
		MinhaLista<Integer> numeros = new MinhaLista<>(0);
		numeros.add(123);
		numeros.getPosicao(0);
	}
	
}
