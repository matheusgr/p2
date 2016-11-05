package aula1_sintaxejava_respostas;

/*
# Código Python:
minha_altura = 1.83
meu_peso = 76.5
bmi = meu_peso / (minha_altura ** 2)
if bmi > 25:
    print("faca uma avaliacao medica")
else:
    print("peso sob controle")
 */

public class E3Condicional {

	public static void main(String[] args) {
		double minhaAltura = 1.83;
		double meuPeso = 76.5;
		double bmi = meuPeso / (minhaAltura * minhaAltura);
		boolean pesoOk = bmi > 25;
		if (pesoOk) {
			System.out.println("faca uma avaliacao medica");
		} else {
			System.out.println("peso sob controle");
		}
	}
	
}
