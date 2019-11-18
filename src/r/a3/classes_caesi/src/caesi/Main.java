package r.a3.classes_caesi.src.caesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[100];
		int alunosCadastrados = 0;

		Scanner sc = new Scanner(System.in);

		// T
		// I
		// S

		String operacao = sc.nextLine();

		while (!"S".equals(operacao)) {
			String[] operacaoSplit = operacao.split(" ");
			// C Matheus 2291146
			if ("C".equals(operacaoSplit[0])) {
				if (alunosCadastrados == alunos.length) {
					alunos = expandeArray(alunos);
				}
				alunos[alunosCadastrados] = new Aluno(operacaoSplit[1], operacaoSplit[2]);
				alunosCadastrados++;
			}
			if ("E".equals(operacaoSplit[0])) {
				System.out.print(exibirAluno(operacaoSplit[1], alunos));
			}
			if ("T".equals(operacaoSplit[0])) {
				System.out.print(alunosCadastrados);
			}
			if ("I".equals(operacaoSplit[0])) {
				System.out.print(exibirAlunos(alunosCadastrados, alunos));
			}
			operacao = sc.nextLine();
		}

	}

	private static String exibirAlunos(int alunosCadastrados, Aluno[] alunos) {
		String resultado = "";
		for (int i = 0; i < alunosCadastrados; i++) {
			Aluno aluno = alunos[i];
			resultado += aluno.toString() + System.lineSeparator();
		}
		return resultado;
	}

	private static String exibirAluno(String matricula, Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			Aluno a = alunos[i];
			if (a != null) {
				if (matricula.equals(a.getMatricula())) {
					return a.toString();
				}
			}
		}
		return "-";
	}

	private static Aluno[] expandeArray(Aluno[] array) {
		Aluno[] tmp = new Aluno[array.length * 2];
		System.arraycopy(array, 0, tmp, 0, array.length);
		return tmp;
	}

}
