package aula5.controle_academico;

import java.util.Scanner;

import aula5.controle_academico_respostas.ControleAcademico;

/*
 * Sistema de controle acadêmico.
 * 
 * Com as operações:
 * CADASTRAR_ALUNO MATHEUS 123456 APELIDO
 * CADASTRAR_TURMA P2
 * CADASTRAR_ALUNO_TURMA 123456 P2
 * IMPRIMIR
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "";
		ControleAcademico controle = new ControleAcademico();
		while (!op.equals("SAIR")) {
			String[] linha = sc.nextLine().trim().split(" ");
			op = linha[0];
			switch (op) {
			case "CADASTRAR_ALUNO":
				// CADASTRAR_ALUNO MATHEUS 123456
				// CADASTRAR_ALUNO MATHEUS 123456 APELIDO
				String nome = linha[1];
				int matricula = Integer.parseInt(linha[2]);
				if (linha.length == 3) {
					controle.cadastraAluno(nome, matricula);
				} else {
					String apelido = linha[3];
					controle.cadastraAluno(nome, matricula, apelido);
				}
				break;
			case "CADASTRAR_TURMA":
				// CADASTRAR_TURMA P2
				String nomeTurma = linha[1];
				controle.cadastraTurma(nomeTurma);
				break;
			case "CADASTRAR_ALUNO_TURMA":
				// CADASTRAR_ALUNO_TURMA 123456 P2
				int matriculaAlunoC = Integer.parseInt(linha[1]);
				String nomeTurmaC = linha[2];
				controle.cadastraAlunoTurma(matriculaAlunoC, nomeTurmaC);
				break;
			case "IMPRIMIR":
				// TODO
				break;
			}
		}
		sc.close();
	}

}