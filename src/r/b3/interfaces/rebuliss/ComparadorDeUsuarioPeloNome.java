package r.b3.interfaces.rebuliss;

import java.util.Comparator;

public class ComparadorDeUsuarioPeloNome implements Comparator<Usuario> {

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getLogin().compareTo(o2.getLogin());
	}

}
