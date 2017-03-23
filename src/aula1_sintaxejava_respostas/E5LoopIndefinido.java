package aula1_sintaxejava_respostas;

import java.util.Scanner;

/*
idade = int(raw_input())
soma = 0
qntd = 0
while idade != 0:
    soma += idade
    qntd += 1
    print("media atual: " + str(float(soma)/qntd))
    idade = int(raw_input())
 */
public class E5LoopIndefinido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		double soma = 0;
		int qntd = 0;
		while (idade != 0) {
			soma += idade;
			qntd += 1;
			System.out.println("media atual: " + (soma / qntd));
			idade = sc.nextInt();
		}
		sc.close();
	}

}
