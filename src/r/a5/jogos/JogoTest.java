package r.a5.jogos;

import static org.junit.Assert.fail;

import org.junit.Test;

class JogoTest {

	@Test
	void testConstrutorBasico() {
		Jogo j = new Jogo(10, "abc", "abc def");
	}
	
	@Test
	void testConstrutorNomeInvalido() {
		try {
			Jogo j = new Jogo(10, null, "abc def");
			fail("Era esperado uma exceção.");
		} catch (NullPointerException npe) {
			
		}
	}
	

}
