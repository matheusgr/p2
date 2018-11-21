package c1.csv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("alunos.csv");
		int lido = fr.read();
		while (lido != -1) {
			System.out.print((char) lido);
			lido = fr.read();
		}
		fr.close();
		LineNumberReader lnr = new LineNumberReader(new FileReader("alunos.csv"));
		String linhaLida = lnr.readLine(); // ignorando cabecalho
		linhaLida = lnr.readLine();
		while (linhaLida != null) {
			String[] campos = linhaLida.split(",");
			String matr = campos[0];
			String nome = campos[1];
			double nota1 = Double.valueOf(campos[2]);
			double nota2 = Double.valueOf(campos[3]);
			System.out.println(matr + " " + nome + " " + nota1 + " " + nota2);
			linhaLida = lnr.readLine();
		}
		lnr.close();
		Scanner sc = new Scanner(new FileReader("alunos.csv"));
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
		}
		sc.close();
		Scanner sc2 = new Scanner(new File("alunos.csv"));
		while (sc2.hasNextLine()) {
			String linha = sc2.nextLine();
			System.out.println(linha);
		}
		sc2.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
