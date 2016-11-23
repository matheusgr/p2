package aula6.sistema_de_compras_respostas;

import java.util.ArrayList;

public class Cesta {

	private ArrayList<Item> itens;

	public Cesta() {
		this.itens = new ArrayList<>();
	}
	
	public void coloca(Produto produto, int qtd) {
		this.itens.add(new Item(produto, qtd));
	}

	public void imprime() {
		for (Item item : itens) {
			System.out.println(item.getNome() + " : " + item.getQtd());
		}
	}

	public double finaliza() {
		double soma = 0;
		for (Item item : itens) {
			soma += item.getValor();
		}
		this.itens = new ArrayList<>();
		return soma;
	}

}
