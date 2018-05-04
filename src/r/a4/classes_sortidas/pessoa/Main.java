package r.a4.classes_sortidas.pessoa;

public class Main {

	public static void main(String[] args) {
		Endereco enderecoP1 = new Endereco("R. Floriano", 123);
		Pessoa p1 = new Pessoa("Matheus", 1999, enderecoP1, "Txutxucador", 10000, 1);
		System.out.println(p1);
		Pessoa p2 = new Pessoa("Gabriel", 1999, enderecoP1, "Bleh", 10000, 1);
		System.out.println(p2);
		enderecoP1.setNumero(999);
		System.out.println(p1);
		System.out.println(p2);
	}
	
	
}
