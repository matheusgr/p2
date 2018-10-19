package r.b3.interfaces.rebuliss;

import java.util.Comparator;

public class ComparadorDeUsuarioPeloEmail implements Comparator<Usuario> {

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
