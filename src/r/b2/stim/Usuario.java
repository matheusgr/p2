package r.b2.stim;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String id;
	private List<Compra> compras;
	private int xp;
	private Perfil perfil;

	public Usuario(String id) {
		this.id = id;
		this.compras = new ArrayList<>();
		this.xp = 0;
		this.perfil = new Noob();
	}

	public double getDesconto() {
		return this.perfil.getDesconto();
	}

	public void cadastraCompra(Compra compra) {
		this.compras.add(compra);
		this.xp++;
		this.perfil = this.perfil.getPerfil(xp);
	}

	@Override
	public String toString() {
		return this.id + " " + this.perfil.getNome();
	}

	public String getId() {
		return this.id;
	}

	public int getXp() {
		return this.xp;
	}
	
}
