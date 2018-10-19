package r.a5.jogos;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

class JogoTest {

	@Test
	void testConstrutorBasico() {
		new Jogo(10, "abc", "abc def");
	}
	
	@Test
	void testConstrutorNomeInvalido() {
		try {
			new Jogo(10, null, "abc def");
			fail("Era esperado uma exceção.");
		} catch (NullPointerException npe) {
			
		}
	}
	

}
