package br.com.caelum.agenda.teste;

import java.time.LocalDate;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class TestaInsercao {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Lucas");
		contato.setEmail("lucas@gmail.com");
		contato.setEndereco("Rua Vergueiro");
		contato.setDataNascimento(LocalDate.of(1996, 02, 01));
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		System.out.println("Contato inserido com sucesso");
	}
}
