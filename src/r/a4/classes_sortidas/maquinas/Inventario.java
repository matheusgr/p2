package r.a4.classes_sortidas.maquinas;

import java.util.Scanner;

public class Inventario {

	
	/*
	 * Cadastra maquina:
	 * CADASTRA LCC1-02
	 * 
	 * Torna maquina disponivel:
	 * UP LCC1-02
	 * 
	 * Listar maquinas, status e ocupacao:
	 * LISTAR
	 * 
	 * Exemplo de saida:
	 * LCC1-02 DOWN
	 * LCC1-10 UP 2291145
	 * LCC1-12 UP
	 * LCC1-20 DOWN
	 * 
	 * Ocupa maquina:
	 * OCUPA LCC1-02 2291146
	 * 
	 * Libera maquina:
	 * LIBERA LCC1-02
	 * 
	 * Torna maquina indisponivel:
	 * DOWN LCC1-02
	 * 
	 * SAIR
	 * 
	 * Exemplo de uso:
	 * CADASTRA LCC3-100
	 * CADASTRA LCC3-102
	 * UP LCC3-102
	 * OCUPA LCC3-100 2299999
	 * LIBERA LCC3-100
	 * DOWN LCC3-100
	 * SAIR
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		Maquina[] maquinas = new Maquina[1000];
		int qtdMaquinasCadastradas = 0;
		while (!entrada.equals("SAIR")) {
			if (entrada.startsWith("CADASTRA")) {
				String maquina = entrada.split(" ")[1];
				maquinas[qtdMaquinasCadastradas] = new Maquina(maquina);
				qtdMaquinasCadastradas += 1;
			} else if (entrada.startsWith("UP")) {
				String maquina = entrada.split(" ")[1];
				int posicao = procuraPosicao(maquina, maquinas);
				maquinas[posicao].up();
			} else if (entrada.startsWith("OCUPA")) {
				String maquina = entrada.split(" ")[1];
				int posicao = procuraPosicao(maquina, maquinas);
				maquinas[posicao].ocupa(entrada.split(" ")[2]);
			} else if (entrada.startsWith("LIBERA")) {
//				String maquina = entrada.split(" ")[1];
//				int posicao = procuraPosicao(maquina, maquinasCadastradas, qtdMaquinasCadastradas);
//				maquinasStatus[posicao] = "UP";
//				maquinasOcupadas[posicao] = null;
			} else if (entrada.startsWith("DOWN")) {
//				String maquina = entrada.split(" ")[1];
//				int posicao = procuraPosicao(maquina, maquinasCadastradas, qtdMaquinasCadastradas);
//				maquinasStatus[posicao] = "DOWN";
			} else if (entrada.startsWith("SAIR")) {
				break;
			} else if (entrada.startsWith("LISTA")) {
				listaMaquinas(qtdMaquinasCadastradas, maquinas);
			} else {
				System.out.println("Comando invalido");
			}
			entrada = sc.nextLine();
		}
		sc.close();
	}

	private static void listaMaquinas(int qtdMaquinasCadastradas, Maquina[] maquinas) {
		for (int i = 0; i < qtdMaquinasCadastradas; i++) {
			Maquina maquina = maquinas[i];
			if (maquina.isOcupada()) {
				System.out.println(maquina + " UP " + maquina.getOcupante());				
			} else {
				System.out.println(maquina + " " + maquina.getStatus());
			}
		}
	}

	private static int procuraPosicao(String maquina, Maquina[] maquinas) {
		for (int i = 0; i < maquinas.length; i++) {
			String maquinaAvaliada = maquinas[i].getNome();
			if (maquina.equals(maquinaAvaliada)) {
				return i;
			}
		}
		return -1;
	}
	
}