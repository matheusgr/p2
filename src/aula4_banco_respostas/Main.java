package aula4_banco_respostas;

import java.util.Scanner;

public class Main {

	/*
	 * Modelar um sistema bancário onde um banco pode ter um conjunto de pessoas
	 * (identificadas pelo CPF) e cada pessoa pode ter uma conta com uma
	 * determinada quantia que pode ser sacada ou acrescida através de depósito.
	 * 
	 * Menu de operações: CADASTRAR CPF IMPRIMIR CPF SACAR CPF VALOR DEPOSITAR
	 * CPF VALOR SAIR
	 */
	public static void main(String[] args) {
		Banco banco = new Banco();
		Scanner sc = new Scanner(System.in);
		String op = "";
		while (!op.equals("SAIR")) {
			String[] linha = sc.nextLine().trim().split(" ");
			op = linha[0];
			Conta conta;
			switch (op) {
			case "CADASTRAR":
				banco.cadastra(linha[1]);
				break;
			case "IMPRIMIR":
				banco.imprime(linha[1]);
				break;
			case "SACAR":
				conta = banco.consulta(linha[1]);
				conta.saca(Integer.parseInt(linha[2]));
				break;
			case "DEPOSITAR":
				conta = banco.consulta(linha[1]);
				conta.deposita(Integer.parseInt(linha[2]));
				break;
			default:
				break;
			}
		}
		sc.close();
	}
	
}