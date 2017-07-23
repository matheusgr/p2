package a7.testes.correios;

import org.junit.Test;

/*
 * Complete os testes do sistema abaixo:
 * 
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
		
	}
	
	@Test
	public void testarEnvioComDoisPacotes() {
		
	}
	
	@Test
	public void testarEnvioComDoisPacotesComNomeEPesoIguais() {
		
	}

	@Test
	public void testPrecoDezPorQuilo() {
		
	}
	
	@Test
	public void testPrecoDezMaisQuinzePorQuilo() {
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testZeroQuilos() {

	}
	
}