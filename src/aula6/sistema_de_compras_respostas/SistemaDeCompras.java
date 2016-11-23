package aula6.sistema_de_compras_respostas;

import java.util.ArrayList;

public class SistemaDeCompras {

	private ArrayList<Produto> produtos;
	private Cesta cesta;

	public SistemaDeCompras() {
		this.produtos = new ArrayList<>();
		this.cesta = new Cesta();
	}
	
	public void cadastra(String nome, double preco) {
		this.produtos.add(new Produto(nome, preco));
	}

	public void lista() {
		for (Produto produto : this.produtos) {
			System.out.println(produto.getNome() + " : " + produto.getPreco());
		}
	}

	public void colocaNaCesta(String nome, int qtd) {
		Produto produtoCesta = null;
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				produtoCesta = produto;
				break;
			}
		}
		this.cesta.coloca(produtoCesta, qtd);
	}

	public void imprimeCesta() {
		this.cesta.imprime();
	}

	public double finalizaCompra() {
		return this.cesta.finaliza();
	}

}
