package r.a5.robos;

public class Main {

	public static void main(String[] args) {
		Robo or15 = new Robo("OR15", 150, 12);
		Robo bastion = new Robo("Bastion", 300, 35);
		try {
			new Robo("Bastion", 300, 35);
		} catch (IllegalArgumentException re) {
			System.out.println("Opsss...");
		}
		int tirosDisparados = 0;
		tirosDisparados += or15.atira();
		tirosDisparados += bastion.atira();
		tirosDisparados += or15.atira();
		tirosDisparados += or15.atira();
		tirosDisparados += or15.atira();
		System.out.println(tirosDisparados);
	}

}
