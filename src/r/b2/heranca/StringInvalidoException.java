package r.b2.heranca;

public class StringInvalidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringInvalidoException(String string, int valor) {
		super(string);
	}

	@Override
	public String getMessage() {
		return "DEU PAU!";
	}

}
