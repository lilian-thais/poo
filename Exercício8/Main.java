package Exercício8;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {
		Agenda ag = new Agenda();
		int op = 0;
		while (true) {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1- gravar contato\n 2- remover\n 3- pesquisar\n 4-sair"));
			switch (op) {
			case 1: // gravar contato
				String nome = JOptionPane
						.showInputDialog(null, "digite o nome");
				String telefone = JOptionPane.showInputDialog(null,
						"digite o telefone");
				ag.adicionarContato(nome, telefone);
				break;

			case 2: // excluir contato
				String nomeRemover = JOptionPane.showInputDialog(null,
						"digite o nome");
					try {
						if(ag.removerContato(nomeRemover)){
							JOptionPane.showMessageDialog(null, "contato excluído");
						}
					} catch (ContatoInexistenteException e1) {
						JOptionPane.showMessageDialog(null, "não há nenhum contato");					
					}
					break;

			case 3: // ler contato
				String nomePesquisa = JOptionPane.showInputDialog(null,
						"digite o nome");
				try {
					Contato c = ag.pesquisarContato(nomePesquisa);
					JOptionPane.showMessageDialog(null, c.toString());
				} catch (ContatoInexistenteException e) {
					JOptionPane
							.showMessageDialog(null, "não há nenhum contato");

				}
				break;

			case 4:
				System.exit(0);
			}
		}
	}

}
