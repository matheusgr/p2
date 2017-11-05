package r.c3.refatoramento;

public class RoboPai {

	protected int energia;
	protected String apelido;

	public RoboPai() {
		super();
	}

	@Override
	public String toString() {
		return this.apelido + " : " + this.energia;
	}

}