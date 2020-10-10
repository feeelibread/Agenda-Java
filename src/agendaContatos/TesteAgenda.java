package agendaContatos;

import java.util.Date;

public class TesteAgenda {

	public static void main(String[] args) {
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		
		/*
		contato.setNome("Felipe");
		contato.setIdade(20);
		contato.setDataCadastro(new Date());
		
		contatoDAO.save(contato);
		*/
		
		/*
		contato.setNome("Fernanda Montenegro");
		contato.setIdade(25);
		contato.setDataCadastro(new Date());
		
		contatoDAO.save(contato);
		*/
		 
		/*
		contatoDAO.delete(3);
		*/
		 /*
		Contato contato1 = new Contato();
		contato1.setId(1);
		contato1.setNome("Felipe Pichinine");
		contato1.setIdade(20);
		contato1.setDataCadastro(new Date());
	
		contatoDAO.update(contato1);
		*/
		
		for(Contato c : contatoDAO.getContatos()) {
			System.out.println("NOME: " + c.getNome());
			System.out.println("IDADE: " + c.getIdade());
			System.out.println("DATA DO CADASTRO: " + c.getDataCadastro());
		}
	}

}
