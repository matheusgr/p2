package aula3_classes_respostas;

public class Agenda {

	private Registro[] registros = new Registro[1000];
	private int cadastros = 0;

	public void apagaCadastro(int posicao) {
		System.arraycopy(registros, posicao + 1, registros, posicao, cadastros - posicao);
		cadastros -= 1;
	}

	public void criaCadastro(String nome, String telefone) {
		registros[cadastros] = new Registro(nome, telefone);
		cadastros += 1;
	}

	public String imprimeCadastros() {
		String resultado = "";
		for (int i = 0; i < cadastros; i++) {
			resultado += registros[i].print(i) + System.lineSeparator();
		}
		return resultado;
	}

	public String procura(String busca) {
		for (int i = 0; i < cadastros; i++) {
			if (registros[i].nome.equals(busca)) {
				return registros[i].print();
			}
		}
		return null;
	}

}