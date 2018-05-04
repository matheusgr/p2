package r.a7.testes.disciplina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String input2 = null; 
		while (!input.trim().equals("")) {
			Disciplina d = new Disciplina(input);
			System.out.println(d.toString());
			input = sc.nextLine();
			try {
				d = new Disciplina(input2);
				System.out.println(d.toString());
			} catch (IllegalArgumentException iae) {
				System.out.println("erro sendo ignorado..");
				System.out.println(iae.getMessage());
			} catch (NullPointerException npe) {
				System.out.println("boy tá nulo");
			}
			System.out.println("\\o\\");
		}
	}
	
}
