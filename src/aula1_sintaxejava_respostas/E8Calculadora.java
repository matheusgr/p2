package aula1_sintaxejava_respostas;

import java.util.Scanner;

/*
operacao = raw_input()
valor1 = int(raw_input())
valor2 = int(raw_input())

while valor1 != 0 and valor2 != 0:
	if operacao == "+":
	    print(valor1+valor2)
	elif operacao == "-":
	    print(valor1-valor2)
	elif operacao == "*":
	    print(valor1*valor2)
	elif operacao == "/":
	    print(float(valor1)/valor2)
	else:
	    print("comando invalido")
	valor1 = int(raw_input())
	valor2 = int(raw_input())
	operacao = raw_input()
 */
public class E8Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		sc.nextLine();
		while (valor1 != 0 || valor2 != 0) {
			switch (op) {
			case "+":
				System.out.println(valor1 + valor2);
				break;
			case "-":
				System.out.println(valor1 - valor2);
				break;
			case "*":
				System.out.println(valor1 * valor2);
				break;
			case "/":
				System.out.println(valor1 / valor2);
				break;
			default:
				System.out.println("comando invalido");
				break;
			}
			op = sc.nextLine();
			valor1 = sc.nextInt();
			valor2 = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
	}

}