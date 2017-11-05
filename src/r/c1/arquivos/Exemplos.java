package r.c1.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Exemplos {

	public static void exemplo1Escrita() throws IOException {
		File file = new File("txun_txun_txun.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			String content = "Mensagem secreta!";
			fos.write(content.getBytes());
		} finally {
			fos.close();
		}
	}

	public static void exemplo1EscritaAlternativaJava8() throws IOException {
		File file = new File("txun_txun_txun.txt");
		try (FileOutputStream fos = new FileOutputStream(file)){
			String content = "Mensagem secreta!";
			fos.write(content.getBytes());
		}
	}


	public static void exemplo2Leitura() throws IOException {
		File file = new File("txun_txun_txun.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			System.out.println("Tamanho (b) : " + fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
		} finally {
			fis.close();
		}
	}

	public static void exemplo3Leitura() throws IOException {
		FileReader reader = new FileReader("FileReaderExamples.java");
		int charRead = -1;
		while ((charRead = reader.read()) != -1) {
			System.out.print((char) charRead);
		}
	}

	public static void exemplo4Escrita() throws IOException {
		FileWriter writer = new FileWriter(new File("Notes.txt"), true);
		writer.write("Java FileWriter Examples");
	}

	public static void exemplo4Nio() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("data/nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(48);
		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {
			System.out.println("Read " + bytesRead);
			buf.flip();
			while (buf.hasRemaining()) {
				System.out.print((char) buf.get());
			}
			buf.clear();
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}

}