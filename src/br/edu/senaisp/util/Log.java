package br.edu.senaisp.util;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.time.LocalDate;

public class Log {
	private static String pathArquivo = "C:\\temp\\log\\";

	public static boolean escrever(String msg) {
		String pathDestino = pathArquivo + LocalDate.now().getYear() + "_" + LocalDate.now().getMonth() + "_"
				+ LocalDate.now().getDayOfMonth() + ".log";

		PrintWriter pw;
		try {
			pw = new PrintWriter(pathDestino, Charset.forName("UTF-8"));

			pw.println(msg);

			pw.close();
			return true;
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			return false;
		}

	}

}
