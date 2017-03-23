package aulaE.design_mensagens;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistencia {

	private String diretorio;

	public Persistencia(String diretorio) {
		this.diretorio = diretorio;
	}

	public void salvar(Usuario logado) throws PersistenciaException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(this.diretorio + File.separator + logado.getLogin() + ".txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(logado);
		} catch (IOException e) {
			throw new PersistenciaException(e);
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					throw new PersistenciaException(e);
				}
			}
		}
	}

	public void carregar(Usuario logado) throws PersistenciaException {
		FileInputStream fis;
		try {
			fis = new FileInputStream(this.diretorio + File.separator + logado.getLogin() + ".txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			logado.setLembretes(((Usuario)ois.readObject()).getLembretes());
		} catch (IOException | ClassNotFoundException e) {
			throw new PersistenciaException(e);
		}
	}

}
