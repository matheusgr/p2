package r.a3.classes;

import java.util.Scanner;

/*
Refatorar a entidade abaixo...

while operacao != "S":
	print("bem vindo a agenda. escolha uma opcao:")
	print("* (C)ADASTRAR NOME/TELEFONE")
	print("* (I)MPRIMIR NOMES/TELEFONES")
	print("* (P)ROCURAR NOME")
	print("* (A)PAGAR CADASTRO")
	print("* (S)AIR")
	# ...
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		String op;
		do {
			System.out.println(Menu.texto());
			op = sc.nextLine();
			switch (op) {
			case "C":
				String nome = sc.nextLine();
				String telefone = sc.nextLine();
				agenda.criaCadastro(nome, telefone);
				break;
			case "I":
				agenda.imprimeCadastros();
				break;
			case "P":
				String busca = sc.nextLine().trim();
				String resultado = agenda.procura(busca);
				if (resultado != null) {
					System.out.println(resultado);
				}
				break;
			case "A":
				int posicao = Integer.parseInt(sc.nextLine());
				agenda.apagaCadastro(posicao);
				break;
			case "S":
				break;
			default:
				System.out.println("comando invalido");
				break;
			}
		} while (!op.equals("S"));
		sc.close();
	}

}