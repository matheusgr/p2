package r.a3.classes_navio;

import r.a3.classes_navio.Navio;

public class Principal {
	
	public static void main(String[] args) {
		// Navio tem vida e poder de fogo
		Navio n1 = new Navio(400);
		Navio n2 = new Navio(600);

		int turno = 1;
		
		while (n1.estaVivo() && n2.estaVivo()) {
			System.out.println("Come�ando turno " + turno);
			turno += 1;
			n1.baleado(n2);
			n2.baleado(n1);
			System.out.println(n1.toString());
			System.out.println(n2.toString());
		}
		if (n1.estaVivo()) {
			System.out.println("N1 VIVEU!");
		}
		if (n2.estaVivo()) {
			System.out.println("N2 VIVEU!");
		}
		
		System.out.println("CABO GUERRA");
	}
	
}
