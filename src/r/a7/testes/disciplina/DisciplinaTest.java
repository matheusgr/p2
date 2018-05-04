package r.a7.testes.disciplina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DisciplinaTest {

	private Disciplina d;

	@Before
	public void inicializaDisciplina() {
		this.d = new Disciplina("P2");
	}
	
	@Test
	public void testReprovadoPosConstrutor() {
		assertFalse(d.aprovado());
	}
	
	@Test
	public void testEqualsComMesmoNome() {
		Disciplina d1 = new Disciplina("P2");
		Disciplina d2 = new Disciplina("P2");
		assertEquals("Disciplinas devem ser iguais", d1, d2);
	}

	@Test
	public void testEqualsComNomesDiferentes() {
		Disciplina d1 = new Disciplina("P1");
		Disciplina d2 = new Disciplina("P2");
		assertNotEquals(d1, d2);
	}
	
	
	@Test
	public void testReprovadoNoLimite() {
		d.cadastraNota(1, 7);
		d.cadastraNota(2, 7);
		d.cadastraNota(3, 7);
		d.cadastraNota(4, 6.9);
		assertFalse(d.aprovado());		
	}

	@Test
	public void testAprovadoNoLimite() {
		d.cadastraNota(1, 7);
		d.cadastraNota(2, 7);
		d.cadastraNota(3, 7);
		d.cadastraNota(4, 7);
		assertTrue(d.aprovado());		
	}
	
	@Test(expected=NullPointerException.class)
	public void testConstrutorNulo() {
		new Disciplina(null);		
	}
	
	@Test
	public void testPosicaoInvalida() {
		try {
			d.cadastraNota(5, 10);
			// Uma exceção dentro do código da linha de cima, interrompe
			// a execução do código... e a linha de baixo não será executada
			fail("Era esperada uma exceção");
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			// Como a exceção foi capturada, o código continua executando daqui.
		}
		
	}
	
}
