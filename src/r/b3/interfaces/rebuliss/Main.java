package r.b3.interfaces.rebuliss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("matheusgr", "matheusgr@comp", "http://bleh");
		Usuario u2 = new Usuario("gabrielgr", "gabriel@psi", "http://blah");
		Usuario u3 = new Usuario("thaisgr", "thais@comp", "http://bluh");
		List<Usuario> meusUsuarios = new ArrayList<>();
		meusUsuarios.add(u1);
		meusUsuarios.add(u2);
		meusUsuarios.add(u3);
		Collections.sort(meusUsuarios, new ComparadorDeUsuarioPeloNome());
		Collections.sort(meusUsuarios, new ComparadorDeUsuarioPeloEmail());
		Collections.max(meusUsuarios);
		System.out.println(meusUsuarios);
	}

}
