package r.a4.classes_sortidas.musica;

public class Colecao {

	private Musica[] musicas;
	private int musicasAdicionadas;
	
	public Colecao() {
		this.musicas = new Musica[200];
		this.musicasAdicionadas = 0;
	}
	
	public void adicionaMusica(Musica musica) {
		if (this.musicasAdicionadas == this.musicas.length) {
			aumentaTamanhoMusicas();
		}
		this.musicas[this.musicasAdicionadas++] = musica;
	}

	private void aumentaTamanhoMusicas() {
		Musica[] novasMusicas = new Musica[this.musicas.length * 2];
		System.arraycopy(this.musicas, 0, novasMusicas, 0, this.musicas.length);
		this.musicas = novasMusicas;
	}

	public String listaMusicas() {
		String listagemsDeMusicas = "";
		for (int i = 0; i < this.musicasAdicionadas; i++) {
			Musica musica = this.musicas[i];
			listagemsDeMusicas += musica.toString() + System.lineSeparator();
		}
		return listagemsDeMusicas;
	}

	public void alteraMusica(int pos, String novoNome) {
		this.musicas[pos].setNome(novoNome);
	}

}
