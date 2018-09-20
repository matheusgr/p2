package r.a5.jogos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comando = sc.nextLine();
		Loja loja = new Loja();
		while (!"sair".equals(comando)) {
			if (comando.startsWith("cadastrar")) {
				Scanner sc2 = new Scanner(comando);
				sc2.next();
				int cod = sc2.nextInt();
				String nome = sc2.next();
				if ("".equals(nome.trim())) {
					System.out.println("nome invalido.. tente outra vez");
					
				}
				String desc = sc2.nextLine();
				loja.cadastrarJogo(cod, nome, desc);
			} else if (comando.startsWith("alugar")) {
				Scanner sc2 = new Scanner(comando);
				sc2.next();
				int cod = sc2.nextInt();
				loja.alugarJogo(cod);
			} else if (comando.startsWith("devolver")) {
				Scanner sc2 = new Scanner(comando);
				sc2.next();
				int cod = sc2.nextInt();
				loja.devolverJogo(cod);
			} else if (comando.startsWith("quantidade")) {
				Scanner sc2 = new Scanner(comando);
				sc2.next();
				int cod = sc2.nextInt();
				System.out.println(loja.getQtdAlugueisJogo(cod));
			}
			comando = sc.nextLine();
		}
	}
	
}
