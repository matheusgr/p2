package aulaD.recursividade.arvore;

public class No {

	private No menor;
	private No maior;
	private int valor;

	public No(int valor) {
		this.valor = valor;
	}

	public void add(No no) {
		if (no.valor < this.valor) {
			if (this.menor == null) {
				this.menor = no;
			} else {
				this.menor.add(no);
			}
		}
		if (no.valor > this.valor) {
			if (this.maior == null) {
				this.maior = no;
			} else {
				this.maior.add(no);
			}
		}
	}
	
	public boolean contains(int valor) {
		if (this.valor == valor) {
			return true;
		}
		if (valor < this.valor) {
			if (this.menor == null) {
				return false;
			} else {
				return this.menor.contains(valor);
			}
		} else {
			if (this.maior == null) {
				return false;
			} else {
				return this.maior.contains(valor);
			}
		}
	}

	public String toString() {
		// pre ordem
		String retorno = "";
		retorno += " " + this.valor;
		if (this.menor != null) { retorno += " " + menor.toString(); }
		if (this.maior != null) { retorno += " " + maior.toString(); }		
		return retorno;
	}
	
	public String toStringEmOrdem() {
		// em ordem
		String retorno = "";
		if (this.menor != null) { retorno += " " + menor.toStringEmOrdem(); }
		retorno += " " + this.valor;
		if (this.maior != null) { retorno += " " + maior.toStringEmOrdem(); }		
		return retorno;
	}
	
	public String toStringPosOrdem() {
		// pós ordem
		String retorno = "";
		if (this.menor != null) { retorno += " " + menor.toStringPosOrdem(); }
		if (this.maior != null) { retorno += " " + maior.toStringPosOrdem(); }		
		retorno += " " + this.valor;
		return retorno;
	}
	
	public static void main(String[] args) {
		No no = new No(5);
		no.add(new No(10));
		no.add(new No(6));
		no.add(new No(2));
		no.add(new No(3));
		no.add(new No(1));
		
		System.out.println(7 + " " + no.contains(7));
		System.out.println(1  + " " + no.contains(1));
		System.out.println(10  + " " + no.contains(10));
		System.out.println(5  + " " + no.contains(5));
		System.out.println(8  + " " + no.contains(8));
		
		System.out.println(no);
		
	}

}
