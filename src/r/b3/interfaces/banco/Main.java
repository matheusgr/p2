package r.b3.interfaces.banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente("123", 123, 123);
		cc.sacar(10);
		cc.toString();
		
		ContaCorrente cc2 = (ContaCorrente) cc;
		cc2.getChqEspecial();
		System.out.println(cc.reprBancaria());
	}
	
}
