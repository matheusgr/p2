package aula1_sintaxejava_respostas;

import java.util.Scanner;

/*
nome, idade_str = raw_input().split()
sobrenome = raw_input()
idade = int(idade_str)
if idade == 18:
    print("\o\ |o/ \o/ /o/")
elif idade < 18:
    print(nome + " " + sobrenome + ", meu bb!")
else:
    print(nome + " " + sobrenome + ", oi tio!")
 */
public class E4Leitura2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		String nome = entrada[0];
		String sobrenome = sc.nextLine();
		int idade = Integer.parseInt(entrada[1]);
		if (idade == 18) {
			System.out.println("\\o\\ |o/ \\o/ /o/");
		} else if (idade < 18) {
			System.out.println(nome + " " + sobrenome + ", meu bb!");
		} else {
			System.out.println(nome + " " + sobrenome + ", oi tio!");
		}
		sc.close();
	}

	/* jeito alternativo */
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		int idade = sc.nextInt();
		sc.nextLine();
		String sobrenome = sc.nextLine();
		if (idade == 18) {
			System.out.println("\\o\\ |o/ \\o/ /o/");
		} else if (idade < 18) {
			System.out.println(nome + " " + sobrenome + ", meu bb!");
		} else {
			System.out.println(nome + " " + sobrenome + ", oi tio!");
		}
		sc.close();
	}
	
}
