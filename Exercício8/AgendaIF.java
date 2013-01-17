package Exercício8;

import java.util.Collection;



public interface AgendaIF {

public void adicionarContato(String nome, String telefone);

public boolean removerContato(String nomeContato) throws ContatoInexistenteException;

public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException;

public Collection<Contato> getContatos();

}