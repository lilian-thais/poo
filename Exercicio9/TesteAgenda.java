package Exercício9;

import static org.junit.Assert.*;


import java.util.Iterator;

import org.junit.*;

public class TesteAgenda {

	private Agenda ag;

	@Before
	public void up() {
		ag = new Agenda();
	}

	@Test(expected= ContatoInexistenteException.class )
	public void testeAdicionarPesquisarRemoverContato() throws ContatoInexistenteException {

		String nome = "Lilian";
		String telefone = "8836-4816";

		ag.adicionarContato(nome, telefone);

		assertEquals(nome, ag.pesquisarContato(nome).getNome());

		assertEquals(telefone, ag.pesquisarContato(nome).getTelefone());
	
		ag.removerContato(nome);

		ag.pesquisarContato(nome);
	}
	
	@Test(expected= ContatoInexistenteException.class )
	public void testeRemovercontatoNaoCadastrado() throws ContatoInexistenteException{
		
		String nome = "Lilian";
		ag.removerContato(nome);
		
	}
	
	@Test(expected= ContatoInexistenteException.class )
	public void testePesquisarcontatoNaoCadastrado() throws ContatoInexistenteException{
		
		String nome = "Lilian";
		ag.pesquisarContato(nome);
	}
	
	@Test
	public void testeVerificarOrdenacao() throws ContatoInexistenteException {

		
		ag.adicionarContato("nome2", "telefone2");
		ag.adicionarContato("nome1", "telefone1");
		ag.adicionarContato("nome3", "telefone3");

		Iterator<Contato> i = ag.getContatoOrdenados();
		
		assertEquals("nome1", i.next().getNome());
		
		assertEquals("nome2", i.next().getNome());
		
		assertEquals("nome3", i.next().getNome());		
				
		ag.removerContato("nome1");
		ag.removerContato("nome2");
		ag.removerContato("nome3");
		
	}
	
}

