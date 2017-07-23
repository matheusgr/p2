package r.b2.heranca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Scanner sc = new Scanner(System.in);
		String op = "";
		while (!op.equals("SAIR")) {
			String[] linha = sc.nextLine().trim().split(" ");
			op = linha[0];
			Conta conta;
			switch (op) {
			case "C":
				String tipo = linha[2];
				banco.cadastra(linha[1], tipo);
				break;
			case "I":
				banco.imprime(linha[1]);
				break;
			case "S":
				conta = banco.consulta(linha[1]);
				conta.saca(Integer.parseInt(linha[2]));
				break;
			case "D":
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