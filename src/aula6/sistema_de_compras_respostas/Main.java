package aula6.sistema_de_compras_respostas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SistemaDeCompras sistema = new SistemaDeCompras();
		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(" ");
		String op = linha[0];
		String nome;
		while (op != "SAIR") {
			switch (op) {
			case "CADASTRAR":
				nome = linha[1];
				double preco = Double.parseDouble(linha[2]);
				sistema.cadastra(nome, preco);
				break;
			case "LISTAR":
				sistema.lista();
				break;
			case "C_CESTA":
				int qtd = Integer.parseInt(linha[2]);
				nome = linha[1];
				sistema.colocaNaCesta(nome, qtd);
				break;
			case "I_CESTA":
				sistema.imprimeCesta();
				break;
			case "F_CESTA":
				System.out.println("Total :" + sistema.finalizaCompra());
				break;
			default:
				break;
			}
			linha = sc.nextLine().split(" ");
			op = linha[0];
		}
		sc.close();
	}

}
