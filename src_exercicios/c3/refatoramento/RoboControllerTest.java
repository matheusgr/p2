package c3.refatoramento;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoboControllerTest {

	private RoboController roboController;

	@Before
	public void prepara() {
		this.roboController = new RoboController();
		this.roboController.criarRobo("abc", 20);
	}

	@Test
	public void testArmar() {
		this.roboController.armar("abc", "TIRO");
		this.roboController.armar("abc", "BAZOOKA");
		this.roboController.armar("abc", "SNIPER");
	}

	@Test
	public void testAtirar() {
		this.roboController.armar("abc", "TIRO");
		assertEquals(roboController.atirar("abc"), "PEW PEW PEW");
		this.roboController.armar("abc", "BAZOOKA");
		assertEquals(roboController.atirar("abc"), "BOOOM");
		this.roboController.armar("abc", "SNIPER");
		assertEquals(roboController.atirar("abc"), "PPPPPFFT");
	}

}
