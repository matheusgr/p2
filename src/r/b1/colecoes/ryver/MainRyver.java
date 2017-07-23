package r.b1.colecoes.ryver;

import java.util.Scanner;

public class MainRyver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "-";
		Ryver ryver = new Ryver();
		while (!op.equals("")) {
			String[] linha = sc.nextLine().trim().split(" ");
			op = linha[0];
			String nomeCanal;
			String nomeUsuario;
			switch (op) {
			case "USUARIO":
				nomeUsuario = linha[1];
				String status = linha[2];
				if (nomeUsuario.equals("1")) {
					System.out.println("nome invalido");
				} else {
					ryver.adicionaUsuario(nomeUsuario, status);
				}
				break;
			case "CANAL":
				nomeCanal = linha[1];
				ryver.adicionaCanal(nomeCanal);
				break;
			case "ENTRAR":
				nomeCanal = linha[1];
				nomeUsuario = linha[2];
				ryver.entra(nomeCanal, nomeUsuario);
				break;
			case "SAIR":
				nomeCanal = linha[1];
				nomeUsuario = linha[2];
				ryver.sai(nomeCanal, nomeUsuario);
				break;
			case "MENSAGEM":
				nomeCanal = linha[1];
				nomeUsuario = linha[2];
				String msg = linha[3];
				ryver.envia(nomeCanal, nomeUsuario, msg);
				break;
			case "IMPRIME":
				nomeCanal = linha[1];
				System.out.println(ryver.imprime(nomeCanal));
				break;
			}
		}
		sc.close();
	}

}