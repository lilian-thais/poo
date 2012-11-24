package br.ufpb.sistemapedidos;

package Exerc�cio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




/**
 *  Aqui o controle de pedidos implementa a interface sistema de controle de pedidos.
 * @author Lilian
 *
 */
public class ControleDePedidos implements InterfaceSistemaDeControle {

	private List <Pedido> pedidos;

	public ControleDePedidos(){
/**
 * o m�todo controle de pedidos cria uma lista de pedido dos clientes
 */
		this.pedidos = new ArrayList<Pedido>();
	}

	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
/**
 * O m�todo controle de pedidos do cliente recebe o nome do cliente
 * compara o nome recebido com cada nome existente na lista e acumula
 * essa informa��o em uma vari�vel depois retorna essa informa��o.
 */
		int cont = 0;
		for (Pedido p: this.pedidos){
			if (p.getCliente().getNome().equals(nomeCliente)){
				cont++;
			}
		}
		return cont;
	}

	@Override
	public void adicionaPedido(Pedido p) {
		/**
		 * O m�todo adiciona pedido pega cada pedido passado como parametro e adiciona na lista
		 */
		this.pedidos.add(p);

	}

	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codProduto) {
		/**
		 * O m�todo pesquisa pedido incluindo produto recebe um codigo de um produto como
		 * par�metro e pesquisa na lista de pedidos os pedidos que tenha produtos que tenham 
		 * codigo igual ao passado como par�metro
		 */
		List <Pedido> pedidosProcurados = new LinkedList<Pedido>();
		for (Pedido p: this.pedidos){
			List<ItemDePedido> itens = p.getItens();
			for (ItemDePedido it: itens){
				if (it.getCodProduto()==(codProduto)){
					pedidosProcurados.add(p);
				}
			}
		}
		//TODO: ajeitar para verificar itens repetidos
		return pedidosProcurados;
	}

	@Override
	public void removePedido(long numPedido) {
		/**
		 * O m�todo remove pedido recebe um n�mero de um pedido
		 * a ser removido como par�metro e compara esse n�mero com os n�meros existentes
		 * na lista e depois remove.
		 */
		for (Pedido p: this.pedidos){
			if (p.getNumeroDoPedido()== numPedido){
				this.pedidos.remove(p);
				break;
			}
		}

	}

}

