package Exercício9;



public interface AgendaIF {

public void adicionarContato(String nome, String telefone);

public boolean removerContato(String nomeContato) throws ContatoInexistenteException;

public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;

}