package r.a1.sintaxejava;

import java.util.Arrays;
import java.util.Scanner;

/*
def diferenca_idades(idades1, idades2):
    resultado = []
    for i in range(len(idades1)):
        resultado.append(idades1[i] - idades2[i])
    return resultado

def recebe_idades(idades):  
	idades_str = raw_input().split()
	for idade_str in idades_str:
	    idades.append(int(idade_str))

idades_turma1 = []
idades_turma2 = []
recebe_idades(idades_turma1)
recebe_idades(idades_turma2)
print(diferenca_idades(idades_turma1, idades_turma2))     
 */
public class E6DiferencaArrays {

	public static int[] diferencaIdades(int[] idades1, int[] idades2) {
		int[] resultado = new int[idades1.length];
		for (int i = 0; i < idades1.length; i++) {
			resultado[i] = idades1[i] - idades2[i];
		}
		return resultado;
	}

	public static int[] recebeIdades() {
		Scanner sc = new Scanner(System.in);
		String[] idadesStr = sc.nextLine().split(" ");
		int[] idades = new int[idadesStr.length];
		for (int i = 0; i < idades.length; i++) {
			idades[i] = Integer.parseInt(idadesStr[i]);
		}
		sc.close();
		return idades;
	}

	public static void main(String[] args) {
		int[] idades1 = recebeIdades();
		int[] idades2 = recebeIdades();
		System.out.println(Arrays.toString(diferencaIdades(idades1, idades2)));
	}

}
