package r.b2.stim;

public class Pro implements Perfil {

	@Override
	public double getDesconto() {
		return 0.05;
	}

	@Override
	public String getNome() {
		return "pro";
	}

	@Override
	public Perfil getPerfil(int xp) {
		return this;
	}

}
