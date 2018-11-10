package r.b3.interfaces.ingresso;

public class Main {

	public static void main(String[] args) {
		IngressoController ic = new IngressoController();
		String cod = ic.criarIngressoBase();
		String cod2 = ic.criarIngressoCamarote("Superior", 12);
		System.out.println(ic.pegarIngresso(cod));
		System.out.println(ic.pegarIngresso(cod2));
	}
	
}
