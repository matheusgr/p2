package aula1_sintaxejava_respostas;

import java.util.Scanner;

/*
palavra = raw_input()
vogais = 0
for letra in palavra:
    if letra in 'aeiou':
        vogais += 1
print(str(vogais) + " vogais")     
 */
public class E7ContaVogais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		int vogais = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a' ||
					palavra.charAt(i) == 'e' ||
					palavra.charAt(i) == 'i' ||
					palavra.charAt(i) == 'o' ||
					palavra.charAt(i) == 'u') {
				vogais += 1;
			}
		}
		System.out.println(vogais + " vogais");
		sc.close();
	}
	
}