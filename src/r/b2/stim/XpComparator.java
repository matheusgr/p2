package r.b2.stim;

import java.util.Comparator;

public class XpComparator implements Comparator<Usuario> {

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getXp() - o2.getXp();
	}

}
