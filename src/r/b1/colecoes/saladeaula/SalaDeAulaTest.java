package r.b1.colecoes.saladeaula;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaDeAulaTest {

	@Test
	public void testListaVazia() {
		SalaDeAula sda = new SalaDeAula();
		assertEquals("", sda.listaRespondoes());
	}
	
	@Test
	public void testLista() {
		SalaDeAula sda = new SalaDeAula();
		sda.cadastrar("1");
		sda.registrarResposta("1");
		assertEquals("1" + System.lineSeparator(), sda.listaRespondoes());
	}

	@Test
	public void testListaMaisDeUm() {
		SalaDeAula sda = new SalaDeAula();
		sda.cadastrar("1");
		sda.cadastrar("2");
		sda.registrarResposta("1");
		sda.registrarResposta("2");
		sda.registrarResposta("1");
		assertEquals("1" + System.lineSeparator() + "2" + System.lineSeparator() + "1" + System.lineSeparator(), sda.listaRespondoes());
	}

	@Test
	public void testContagemVazia() {
		SalaDeAula sda = new SalaDeAula();
		sda.cadastrar("1");
		assertEquals(0, sda.contagemRespondoes());
	}

	@Test
	public void testContagemVarios() {
		SalaDeAula sda = new SalaDeAula();
		sda.cadastrar("1");
		sda.cadastrar("2");
		sda.registrarResposta("1");
		sda.registrarResposta("2");
		sda.registrarResposta("1");
		assertEquals(2, sda.contagemRespondoes());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAlunoInvalido() {
		SalaDeAula sda = new SalaDeAula();
		sda.registrarResposta("1");
	}
	
}
