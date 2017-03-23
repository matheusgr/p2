package aulaE.design_mensagens;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linhaRaw = sc.nextLine();
		String[] linha = linhaRaw.split(" ");
		String op = linha[0];
		String nome;
		Logger l = new Logger("data");
		UsuarioController uc = new UsuarioController();
		while (!op.equals("SAIR")) {
			l.log(linhaRaw);
			switch (op) {
			case "LOGIN":
				nome = linha[1];
				uc.login(nome);
				break;
			case "LEMBRETE":
				String[] msg = new String[linha.length - 1];
				System.arraycopy(linha, 1, msg, 0, linha.length - 1);
				String msgFinal = String.join(" ", msg);
				uc.criaLembrete(msgFinal);
				break;
			case "LISTAR":
				System.out.println(uc.listarLembrete());
				break;
			case "SALVAR":
				try {
					uc.salvar();
				} catch (PersistenciaException e) {
					System.err.println("Erro de gravacao!");
					e.printStackTrace();
				}
				break;
			case "CARREGAR":
				try {
					uc.carregar();
				} catch (PersistenciaException e) {
					System.err.println("Erro de gravacao!");
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
			linhaRaw = sc.nextLine();
			linha = linhaRaw.split(" ");
			op = linha[0];
		}
		sc.close();
	}

}