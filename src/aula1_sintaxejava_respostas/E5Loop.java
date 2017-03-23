package aula1_sintaxejava_respostas;

import java.util.Scanner;

/*
idades = []
idades_str = raw_input().split()
for idade_str in idades_str:
    idades.append(int(idade_str))
media = sum(idades)/float(len(idades))
print("media: " + media)
 */
public class E5Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] idadesStr = sc.nextLine().split(" ");
		double soma = 0;
		for (int i = 0; i < idadesStr.length; i++) {
			soma += Integer.parseInt(idadesStr[i]);
		}

		// Alternativa:
		soma = 0;
		for (String idadeStr : idadesStr) {
			soma += Integer.parseInt(idadeStr);
		}
		// fim do jeito alternativo

		System.out.println("media: " + (soma / idadesStr.length));
		sc.close();
	}

}
