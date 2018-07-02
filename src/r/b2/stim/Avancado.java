package r.b2.stim;

public class Avancado implements Perfil {

	@Override
	public double getDesconto() {
		return 0.02;
	}

	@Override
	public String getNome() {
		return "avancado";
	}

	@Override
	public Perfil getPerfil(int xp) {
		if (xp >= 5000) {
			return new Pro();
		}
		return this;
	}

}
