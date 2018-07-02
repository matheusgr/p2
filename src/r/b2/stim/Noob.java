package r.b2.stim;

public class Noob implements Perfil {

	@Override
	public double getDesconto() {
		return 0;
	}

	@Override
	public String getNome() {
		return "noob";
	}

	@Override
	public Perfil getPerfil(int xp) {
		if (xp >= 1000) {
			return new Avancado();
		}
		return this;
	}

}
