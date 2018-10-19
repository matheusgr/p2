package r.a4.classes_sortidas.musica;

import java.util.Scanner;

/**
 * Sistema de controle de m�sicas. Deve permitir o cadastro de m�sicas,
 * determinar as m�sicas favoritas do usu�rio e listar as m�sicas cadastradas.
 * 
 * @author Matheus Gaudencio do R�go
 */
public class Main {

	/**
	 * M�todo principal de execu��o. Os par�metros n�o s�o utilizados nesse
	 * sistema. Ir� trabalhar com a entrada e sa�da padr�o para executar as
	 * opera��es do sistema.
	 *
	 * <ul>
	 * Exemplos de opera��es:
	 * <li>CADASTRAR 180 Diamonds</li>
	 * <li>CADASTRAR 270 Back in Black</li>
	 * <li>ALTERAR 0 Diamantes</li>
	 * <li>FAVORITAR Diamonds</li>
	 * <li>LISTAR</li>
	 * </ul>
	 * 
	 * @param args
	 *            N�o � utilizado neste programa.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Colecao c = new Colecao();
		String entrada = sc.nextLine();
		while (!entrada.equals("SAIR")) {
			if (entrada.startsWith("CADASTRAR")) {
				// CADASTRAR 180 Diamonds
				Scanner scLinha = new Scanner(entrada);
				scLinha.next();
				int duracao = scLinha.nextInt();
				String nome = scLinha.nextLine().trim();
				Musica musica = new Musica(duracao, nome);
				c.adicionaMusica(musica);
				scLinha.close();
			} else if (entrada.startsWith("ALTERAR")) {
				// ALTERAR 0 Diamantes
				Scanner scLinha = new Scanner(entrada);
				scLinha.next();
				int pos = scLinha.nextInt();
				String novoNome = scLinha.nextLine().trim();
				c.alteraMusica(pos, novoNome);
				scLinha.close();
			} else if (entrada.startsWith("LISTAR")) {
				System.out.println(c.listaMusicas());
			}
			entrada = sc.nextLine();
		}
		sc.close();
	}

}