package r.c1.arquivos;

import java.io.Serializable;

public class Lembrete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public Lembrete(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return this.msg;
	}

}
