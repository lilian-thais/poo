package br.ufpb.sistemapedidos;

package Exercício3;

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
 * o método controle de pedidos cria uma lista de pedido dos clientes
 */
		this.pedidos = new ArrayList<Pedido>();
	}

	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
/**
 * O método controle de pedidos do cliente recebe o nome do cliente
 * compara o nome recebido com cada nome existente na lista e acumula
 * essa informação em uma variável depois retorna essa informação.
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
		 * O método adiciona pedido pega cada pedido passado como parametro e adiciona na lista
		 */
		this.pedidos.add(p);

	}

	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codProduto) {
		/**
		 * O método pesquisa pedido incluindo produto recebe um codigo de um produto como
		 * parâmetro e pesquisa na lista de pedidos os pedidos que tenha produtos que tenham 
		 * codigo igual ao passado como parâmetro
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
		 * O método remove pedido recebe um número de um pedido
		 * a ser removido como parâmetro e compara esse número com os números existentes
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

