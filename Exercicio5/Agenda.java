package TreinoExceções;
import java.util.*;

public class Agenda implements AgendaIF{

	private List<Contato> contatos;
	
	public Agenda(){
		this.contatos = new ArrayList<Contato>();
	}
	public void adicionarContato(String nome, String tel) {
		this.contatos.add(new Contato(nome, tel));	
	}
	public void removerContato(String nomeContato) throws ContatoInexistenteException {
		boolean b = false;
		for(Contato rem : this.contatos){
			if(rem.getNome().equals(nomeContato)){
				this.contatos.remove(rem);
				b = true;
				break;
			}
		}if(!b){
			throw new ContatoInexistenteException ("Contato Inexistente! " + nomeContato);
		}	
	}
	public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException {
		for(Contato rem : this.contatos){
			if(rem.getNome().equals(nomeContato)){
				return rem;
			}
		}
		throw new ContatoInexistenteException ("Contato Inexistente! " + nomeContato);
	}
}
