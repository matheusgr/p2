package r.b2.coisalinder;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaComum("123", "123", 18);
		// this.getClass() + " [descr=" + descr + ",
		// nome=" + nome + ", idade=" + idade + ",
		// lindezas=" + lindezas + "]";
		System.out.println(cc.toString());
	}
	
}
