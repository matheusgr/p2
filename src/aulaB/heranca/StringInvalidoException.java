package aulaB.heranca;

public class StringInvalidoException extends RuntimeException {

	private int valor;

	public StringInvalidoException(String string, int valor) {
		super(string);
		this.valor = valor;
	}

	@Override
	public String getMessage() {
		return "DEU PAU!";
	}

}
