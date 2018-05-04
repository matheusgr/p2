package r.a4.classes_sortidas.aluno;
import java.util.Scanner;

public class ControleDeNotas {

	/*
	 * 3
	 * pedro 20 10
	 * matheus 21 8
	 * gabriel 23 7
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd = Integer.parseInt(sc.nextLine());
		Aluno[] alunos = new Aluno[qtd];
		leEntrada(sc, qtd, alunos);
		System.out.println(contaAcimaIdade20NotaMaiorQue7(alunos));
	}

	private static void leEntrada(Scanner sc, int qtd, Aluno[] alunos) {
		for (int i = 0; i < qtd; i++) {
			String linha = sc.nextLine();
			String[] campos = linha.split(" ");
			Aluno aluno = new Aluno(campos[0], Integer.parseInt(campos[1]), Double.parseDouble(campos[2]));
			alunos[i] = aluno;

		}
	}
	
	private static int contaAcimaIdade20NotaMaiorQue7(Aluno[] alunos) {
		int conta = 0;
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			if (aluno.idadeENotaApropriada()) {
				conta += 1;
			}
		}
		return conta;
	}
	
}
