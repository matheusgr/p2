package aulaA.colecoes_respostas.ryver;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

	@Test
	public void testEquals() {
		Usuario u1 = new Usuario("MATHEUS", "ONLINE");
		Usuario u2 = new Usuario("PEDRO", "OFFLINE");
		Assert.assertNotEquals(u1, u2);
		u1 = new Usuario("MATHEUS", "ONLINE");
		u2 = new Usuario("MATHEUS", "OFFLINE");
		Assert.assertEquals(u1, u2);
	}

}
