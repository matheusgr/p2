package construcao;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("123", "beatriz");
		Aluno a2 = new Aluno("123", "beatriz");
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals("oi"));
		System.out.println(a1.equals(null));
		
		
		
		
		
		Object o0 = new Predio("JP - Base", 2015, "Rua Rodrigues Alves", "1000",
				"Campina Grande", "PB", "Brasil", "58428-795");

		Predio p0 = (Predio) o0;
		Object o1 = p0;
	
		Predio p1 = new Predio("JP - Terreo", 2015, "Rua Rodrigues Alves", "1000",
				"Campina Grande", "PB", "Brasil", "58428-795");
		Predio p2 = new Predio("JP - Cobertura", 2015, "Rua Rodrigues Alves", "1000",
				"Campina Grande", "PB", "Brasil", "58428-795");
		
		
		p1.setNumero("1000A");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Endereco e1 = new Endereco("Rua Rodrigues Alves", "1100",
				"Campina Grande", "PB", "Brasil", "58428-795");
		
		PredioP pp1 = new PredioP("JP - Terreo", 2015, e1);
		PredioP pp2 = new PredioP("JP - Terreo", 2015, e1);
		
		e1.setNumero("1200B");
		System.out.println(pp1.toString());
		System.out.println(pp2.toString());
	}

}
