package a7.testes.triangulos;

public class EstoqueTriangulos {

	public void cadastro(int ladoA, int ladoB, int ladoC) {
		validaLado(ladoA);
		validaLado(ladoB);
		validaLado(ladoC);
		validaTriangulos(ladoA, ladoB, ladoC);
	}

	private void validaTriangulos(int ladoA, int ladoB, int ladoC) {
		// TODO Auto-generated method stub

	}

	private void validaLado(int ladoA) {
		if (ladoA < 0) {
			throw new RuntimeException("TRIANGULO INVALIDO");
		}
	}

}
