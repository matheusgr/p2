package r.a5.restaurante;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RefeicaoTest {

	private Refeicao refeicao;

	@Before
	public void preparaRefeicao() {
		this.refeicao = new Refeicao("123", 4.2, 2, "Teste de comida");
	}
	
	@Test
	public void testRefeicao() {
		new Refeicao("123", 4.2, 2, "Teste de comida");
	}

	@Test(expected=RuntimeException.class)
	public void testRefeicaoValorNegativo() {
		new Refeicao("123", -4.2, 2, "Teste de comida");
	}
	
	@Test
	public void testRefeicaoValorNegativoOutraOpcao() {
		try {
			new Refeicao("123", -4.2, 2, "Teste de comida");
			fail("Era esperada uma exceção");
		} catch(RuntimeException e) {
			
		}
	}

	@Test(expected=RuntimeException.class)
	public void testRefeicaoDescrNula() {
		new Refeicao("123", 4.2, 2, null);
	}
	
	@Test(expected=RuntimeException.class)
	public void testRefeicaoDescrVazia() {
		new Refeicao("123", 4.2, 2, "");
	}
	
	@Test
	public void testToString() {
		assertEquals("Refeicao [codigo=123, valor=4.2, numPessoas=2, descr=Teste de comida]", refeicao.toString());
	}

	@Test
	public void testGetCodigo() {
		assertEquals("123", refeicao.getCodigo());
	}

	@Test
	public void testSetValor() {
		refeicao.setValor(5.3);
		assertEquals("Refeicao [codigo=123, valor=5.3, numPessoas=2, descr=Teste de comida]", refeicao.toString());
	}

}
