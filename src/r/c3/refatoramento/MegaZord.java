package r.c3.refatoramento;

import java.util.Scanner;

public class MegaZord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RoboController controller = new RoboController();
		while (true) {
			String line = sc.nextLine().trim();
			if (line.startsWith("ROBO")) {
				String[] comandos = line.split(" ");
				controller.criarRobo(comandos[1], Integer.parseInt(comandos[2]));
			} else if (line.startsWith("ARMA")) {
				String[] comandos = line.split(" ");
				controller.armar(new ArmaConfiguracao(comandos[1], comandos[2]));
			} else if (line.startsWith("TIRO")) {
				String[] comandos = line.split(" ");
				System.out.println(controller.atirar(comandos[1]));
			} else {
				break;
			}
		}
		sc.close();
	}
	
}
