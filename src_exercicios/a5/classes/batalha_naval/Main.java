package a5.classes.batalha_naval;

/*
 * Sistema de simulação da batalha entre navios.
 * O sistema é discreto, ou seja, o tempo é dividido em
 * rodadas (turnos).
 * 
 * - Um navio tem uma vida e pode ter 1 ou 2 armas.
 * - 1 arma dá 1 tiro por turno.
 * - Cada arma tem um dano base.
 * - Uma batalha acontece entre dois navios que disparam
 * todas as suas armas a cada turno. A simulação termina
 * quando a vida de um dos dois navios chega a zero.
 * 
 * Sistema:
 * 
 * 1) Cadastrar Arma
 * 2) Cadastrar Navio
 * 3) Imprimir Navio
 * 4) Simular Batalha
 * 5) Sair
 * 
 * Opcao: 1
 * NOME: Booom
 * DANO: 100
 * ....
 * Opcao: 1
 * NOME: Pew Pew
 * DANO: 50
 * ....
 * Opcao: 2
 * NOME: Bote de Guerra
 * VIDA: 1000
 * #ARMAS: 1
 * ARMA: Pew Pew
 * ....
 * Opcao: 2
 * NOME: WarMachine
 * VIDA: 500
 * #ARMAS: 2
 * ARMA: Pew Pew
 * ARMA: Booom
 * ....
 * Opcao: 3
 * NAVIO: WarMachine
 * -- WarMachine 500, 2 armas, Pew Pew + Booom
 * .....
 * Opcao: 4
 * NAVIO: WarMachine
 * NAVIO: Bote de Guerra
 * 
 * RODADA 0: WarMachine 500 vs 1000 Bote de Guerra
 * RODADA 1: WarMachine 450 vs 850 Bote de Guerra
 * ...
 * RODADA 6: WarMachine 150 vs 100 Bot de Guerra
 * RODADA 7: WarMachine 100 vs 0 Bot de Guerra
 * Vitoria do Bot de Guerra
 * (outras opcoes seriam: Vitoria do WarMachine, Empate)
 */
public class Main {

}