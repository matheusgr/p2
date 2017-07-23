package r.a1.sintaxejava;

import java.util.Scanner;

/*
idade = int(raw_input())
if idade == 18:
    print("\o\ |o/ \o/ /o/")
elif idade < 18:
    print("meu bb!")
else:
    print("oi tio!") 
 */
public class E4Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = Integer.parseInt(sc.nextLine());
		if (idade == 18) {
			System.out.println("\\o\\ |o/ \\o/ /o/");
		} else if (idade < 18) {
			System.out.println("meu bb!");
		} else {
			System.out.println("oi tio!");
		}
		sc.close();
	}

}
