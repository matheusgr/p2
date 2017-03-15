package aulaC.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	private String diretorio;

	public Logger(String diretorio) {
		this.diretorio = diretorio;
	}

	public void log(String msg) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(this.diretorio + File.separator + "sistema.log", true);
			fw.write(msg + System.lineSeparator());
		} catch (IOException e) {
			System.err.println("N�o foi poss�vel fazer log da a��o.");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.err.println("N�o foi poss�vel fechar o logger.");
				}
			}
		}
	}

}
