package r.b3.interfaces.criptografia;

public class Main {
	
	public static void main(String[] args) {
		Facade f = new Facade();
		System.out.println(f.criptografar(1, "ABC"));
		f.configurar(1, "EXP");
		System.out.println(f.criptografar(1, "ABC"));
	}
	
}
