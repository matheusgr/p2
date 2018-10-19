package r.c3.refatoramento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RoboControllerTest {

	private RoboController roboController;

	@BeforeEach
	public void prepara() {
		this.roboController = new RoboController();
		this.roboController.criarRobo("abc", 20);
	}

	@Test
	public void testArmar() {
		this.roboController.armar(new ArmaConfiguracao("abc", "TIRO"));
		this.roboController.armar(new ArmaConfiguracao("abc", "BAZOOKA"));
		this.roboController.armar(new ArmaConfiguracao("abc", "SNIPER"));
	}

	@Test
	public void testAtirar() {
		this.roboController.armar(new ArmaConfiguracao("abc", "TIRO"));
		assertEquals(roboController.atirar("abc"), "PEW PEW PEW");
		this.roboController.armar(new ArmaConfiguracao("abc", "BAZOOKA"));
		assertEquals(roboController.atirar("abc"), "BOOOM");
		this.roboController.armar(new ArmaConfiguracao("abc", "SNIPER"));
		assertEquals(roboController.atirar("abc"), "PPPPPFFT");
	}

}
