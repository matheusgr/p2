package r.a7.testes.correios;

import org.junit.Assert;
import org.junit.Test;

/*
 * - ate 1 kg (inclusive): 10 reais
 * - >1 e ate 5 kg (inclusive): 10 reais por kg (inteiro)
 * - >5: 50 + 15 reais por kg
 * 
 * 1) Enviar Pacote
 * 2) Listar Pacotes
 * 3) Confirmar Recebimento
 * 4) Listar Balanco
 * 5) Sair
 */
public class CorreiosTest {

	@Test
	public void testarEnvioSimples() {
		Correios correios = new Correios();
		Assert.assertEquals(0, correios.listaPacotes().length);
		correios.enviaPacote("Teste", 20);
		Assert.assertEquals(1, correios.listaPacotes().length);
	}

	@Test
	public void testarEnvioComDoisPacotes() {
		Correios correios = new Correios();
		Assert.assertEquals(0, correios.listaPacotes().length);
		correios.enviaPacote("Teste", 20);
		Assert.assertEquals(1, correios.listaPacotes().length);
		correios.enviaPacote("Teste2", 30);
		Assert.assertEquals(2, correios.listaPacotes().length);
	}

	@Test
	public void testarEnvioComDoisPacotesComNomeEPesoIguais() {
		Correios correios = new Correios();
		Assert.assertEquals(0, correios.listaPacotes().length);
		correios.enviaPacote("Teste", 20);
		Assert.assertEquals(1, correios.listaPacotes().length);
		correios.enviaPacote("Teste", 20);
		Assert.assertEquals(2, correios.listaPacotes().length);
	}

	@Test
	public void testPrecoDezPorQuilo() {
		Pacote pacote = new Pacote("Pacote", 1);
		Assert.assertEquals(10.0, pacote.getPreco(), 0.001);
		Pacote outroPacote = new Pacote("Pacote", 5);
		Assert.assertEquals(50.0, outroPacote.getPreco(), 0.001);
	}

	@Test
	public void testPrecoDezMaisQuinzePorQuilo() {
		Pacote pacote = new Pacote("Pacote", 6);
		Assert.assertEquals(65.0, pacote.getPreco(), 0.001);
	}

	@Test(expected = RuntimeException.class)
	public void testZeroQuilos() {
		new Pacote("Pacote", 0);
		Assert.assertFalse(true);
	}

}