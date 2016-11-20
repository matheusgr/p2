package aula5.correios;

/*
 * Sistema de correios.
 * 
 * Importante, lógica do valor do pacote:
 * - até 1 kg (inclusive): 10 reais
 * - >1 e até 5 kg (inclusive): 10 reais por kg (inteiro)
 * - >5: 50 + 15 reais por kg
 * 
 * 1) Enviar Pacote
 * 2) Listar Pacotes
 * 3) Confirmar Recebimento
 * 4) Listar Balanco
 * 5) Sair
 * 
 * op: 1
 * 
 * Pacote: Presente de Natal
 * Peso (kg): 3
 * 
 * Valor -- 30 reais -- Enviado
 * 
 * ...
 * op: 2
 * - 0. Presente de Natal -- Enviado
 * ...
 * op: 4
 * 0 reais
 * ...
 * op: 3
 * Pacote: 0
 * ...
 * op: 2
 * -- Sem pacotes --
 * ...
 * op: 4
 * 30 reais
 * 
 * ------
 * 
 * E se, ao listar o balanço, você exibisse o histórico de pacotes recebidos?
 * Exemplo:
 * - 0. Presente de Natal -- 23 reais
 * Total: 23 reais
 */
public class Main {

}
