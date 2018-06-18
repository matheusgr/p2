package r.b1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> outraLista = new LinkedList<>();
		ArrayList<String> minhaLista = new ArrayList<>();
		minhaLista.add("123456");
		Scanner sc = new Scanner(System.in);
		minhaLista.add(0, "456");
		System.out.println(minhaLista);
		System.out.println(minhaLista.get(1));
		System.out.println(minhaLista.get(0).getClass());
		minhaLista.set(0, "1234");
		System.out.println(minhaLista);
		String s = minhaLista.get(0);
		
		for (String e : minhaLista) {
			System.out.println(e);
		}
		
		for (int i = 0; i < minhaLista.size(); i++) {
			String res = minhaLista.get(i);
			System.out.println(res);
		}
		
		for (Iterator<String> iterator = minhaLista.iterator(); iterator.hasNext();) {
			String res = iterator.next();
			if (res.equals("Apague")) {
				iterator.remove();
			}
			System.out.println(res);
		}
		
		HashSet<Integer> meuConjunto = new HashSet<>();
		System.out.println(meuConjunto.add(1));
		System.out.println(meuConjunto.add(2));
		System.out.println(meuConjunto.add(1));

		for (Integer e : meuConjunto) {
			System.out.println(e);
		}
		
		
		for (Iterator<Integer> iterator = meuConjunto.iterator(); iterator.hasNext();) {
			Integer res = iterator.next();
			if (res == 0) {
				iterator.remove();
			}
			System.out.println(res);
		}
		
		
		
		
	}
	
}
