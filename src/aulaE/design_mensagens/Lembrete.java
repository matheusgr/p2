package aulaE.design_mensagens;

import java.io.Serializable;

public class Lembrete implements Serializable {

	private String msg;

	public Lembrete(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return this.msg;
	}

}
