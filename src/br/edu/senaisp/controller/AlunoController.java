package br.edu.senaisp.controller;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import br.edu.senaisp.model.Aluno;
import br.edu.senaisp.util.Log;

public class AlunoController {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(123L, "Josué", "000.000.000-00");

		Aluno a2 = new Aluno();
		a2.setId(124L);
		a2.setNome("Jojô");
		a2.setCpf("111.111.111-11");

		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a1);
		lista.add(a2);

		//Escrita
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\TEMP\\TesteDeArquivo\\BancoDeDados.csv"
					, Charset.forName("UTF-8"));

			for (Aluno a : lista) {
				pw.print(a.getId());
				pw.print(";" + a.getNome());
				pw.print(";" + a.getCpf());
				pw.println();
			}

			pw.close();
			Log.escrever("Sucesso!");
		} catch (Exception e) {
			Log.escrever("Erro: " + e.getMessage());
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		//Leitura

		/*
		 * 		String path = "C:\\TEMP\\TesteDeArquivo\\BancoDeDados.csv";
		Charset mapaChar =  Charset.forName("UTF-8");
		byte[] bites;
		try {
			bites = Files.readAllBytes(Paths.get(path));
			String lido = mapaChar.decode(ByteBuffer.wrap(bites)).toString();
			System.out.println(lido);
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}*/

		

	}

}

