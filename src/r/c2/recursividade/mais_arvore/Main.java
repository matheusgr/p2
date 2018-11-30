package r.c2.recursividade.mais_arvore;

public class Main {

	public static void main(String[] args) {
		No<Integer> arvore = new No<>(5);
		arvore.add(8);
		arvore.add(7);
		arvore.add(3);
		System.out.println(arvore);
	}
	
}
