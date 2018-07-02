package r.b2.stim;

public class CompraController {

	private UsuarioController uc;
	private ItemController ic;

	public CompraController(UsuarioController uc, ItemController ic) {
		this.uc = uc;
		this.ic = ic;
	}
	
	public void compra(String idUsuario, String idItem) {
		Usuario u = this.uc.getUsuario(idUsuario);
		Item i = this.ic.getItem(idItem);
		double d = u.getDesconto();
		int valor = i.getValor();
		u.cadastraCompra(new Compra(i, valor, d));
	}
	
}
