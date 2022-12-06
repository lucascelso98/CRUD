package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("elminho chora paixão");
		contato.setIdade(29);
		contato.setDataCadastro(new Date());	
		
	    //contatoDAO.save(contato);
		
		//Atualizar contato
		Contato c1 = new Contato();
		c1.setNome("elminho nego");
		c1.setIdade(40);
		c1.setDataCadastro(new Date());
		c1.setId(23);//é o número que está no banco de dados da PK
		
		contatoDAO.update(c1);
		
		//Deletar o contato pelo seu número de ID
		contatoDAO.deleteByID(18);
		
		
		
		//Visualização dos registros do banco de dados
		
		for(Contato c : contatoDAO.getContatos()) {
			System.out.println("contato: "+c.getNome());
		}
	}

}
