package futebol;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*
		 * Deve ser possível agora identificar o
			artilheiro, adicionar gols em um jogador,
			contar o número de jogadores,
			pegar os jogadores de uma posição e
			pegar dados de um jogador pelo seu
			nome e camisa
		 */
		RepositorioDeJogadores repositorio = new RepositorioDeJogadores();
		repositorio.cadastrarJogador("Matheus", 5, "GOLEIRO");
		repositorio.adicionaGol("Matheus", 5);
		System.out.println(repositorio.contaJogadores());
		System.out.println(Arrays.toString(repositorio.getJogadores("GOLEIRO")));
		System.out.println(repositorio.getJogador("Matheus", 5));
		System.out.println(repositorio.getArtilheiro().toString());
	}
	
	
	
	
	
	
}
