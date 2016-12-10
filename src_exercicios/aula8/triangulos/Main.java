package aula8.triangulos;

import java.util.Scanner;

/*
 * Sistema para armazenar informações de triângulos.
 * 
 * Identifica o tipo de triângulo e valida os triângulos
 * a serem armazenados.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "";
		EstoqueTriangulos estoque = new EstoqueTriangulos();
		while (!op.equals("SAIR")) {
			String[] linha = sc.nextLine().trim().split(" ");
			op = linha[0];
			switch (op) {
			case "CADASTRAR":
				int ladoA = Integer.parseInt(linha[1]);
				int ladoB = Integer.parseInt(linha[2]);
				int ladoC = Integer.parseInt(linha[3]);
				estoque.cadastro(ladoA, ladoB, ladoC);
				break;
			case "IMPRIMIR":

				break;
			}
		}
		sc.close();
	}

}
