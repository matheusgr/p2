package r.a3.classes_pessoa;

/**
 * Programa de manipulação de pessoas. Irá criar, manipular e imprimir pessoas e
 * seus atributos. Este programa deve ser usado como base para o entendimento de
 * composição.
 * 
 * @author matheusgr
 */
public class ManipuladorDePessoas {

	/**
	 * Método de execução principal. Apenas manipula objetos construídos e
	 * relacionados com esse pacote.
	 * 
	 * @param args Argumentos do programa (ignorados).
	 */
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Alfabeto", 24, "Alfabeto", "Paraiba", "Brasil");
		// p1 e p2 moram juntos... e tem a mesma função (dizemos que rua e endereço são objetos associados!).
		Pessoa p1 = new Pessoa("Abecedário", 1999, endereco, "Abacateiro");
		Pessoa p2 = new Pessoa("Defgihário", 2000, endereco, "Abacateiro");
		System.out.println(p1);
		System.out.println(p2);
		// mudando o endereço:
		endereco.setRua("Avenida Alfabeto");
		System.out.println(p1);
		System.out.println(p2);
		// agora vamos alterar o complemento...
		p1.adicionaComplemento(10);
		p2.adicionaComplemento(20);
		// valores diferente, cada pessoa tem e controla um objeto Funcao distinto (Pessoa é COMPOSTA por Funcao).
		System.out.println(p1);
		System.out.println(p2);
	}

}
