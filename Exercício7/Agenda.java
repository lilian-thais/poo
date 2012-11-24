package Exercício7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Agenda extends Contato implements AgendaIF {

	public List<Contato> contatos;
	private GravadorDeContatos gravadordcontato;
	
	public Agenda(){
		gravadordcontato = new GravadorDeContatos();
		contatos = new ArrayList<Contato>();
			try {
				contatos = gravadordcontato.leContatos();
			} catch (IOException e) {				
				e.printStackTrace();
			}		
			
	}
	@Override
	public void adicionarContato(String nome, String telefone) {
		Contato contato = new Contato(nome, telefone);
		contatos.add(contato);
		gravarLista();
	}
	

	@Override
	public boolean removerContato(String nomeContato)
			throws ContatoInexistenteException {
		boolean achou = false;
		for (Contato c : this.contatos) {
			if (c.getNome().equals(nomeContato)) {
				this.contatos.remove(c);
				achou = true;
				gravarLista();
				return achou;
			} 
		}
		throw new ContatoInexistenteException();
	}

	@Override
	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {
		for (Contato c : this.contatos) {
			if (c.getNome().equalsIgnoreCase(nomeContato)) {
				return c;
			}
			
		}
		throw new ContatoInexistenteException(
		"A pessoa procurada não existe na agenda");
		
	}
	private void gravarLista() {
		try {
			gravadordcontato.gravarContatos(contatos);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}