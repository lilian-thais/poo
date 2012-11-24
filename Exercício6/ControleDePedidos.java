package Exerc�cio6;

import java.io.IOException;
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
	
	private GravadorDePedidos gravador;
	/**
	 * o m�todo controle de pedidos cria uma lista de pedido dos clientes
	 */
	public ControleDePedidos(){
		try{
			this.pedidos= gravador.lePedidos();
		}catch (IOException e){
			this.pedidos = new ArrayList<Pedido>();
		}
	

		this.pedidos = new ArrayList<Pedido>();
	}
	/**
	 * O m�todo controle de pedidos do cliente recebe o nome do cliente
	 * compara o nome recebido com cada nome existente na lista e acumula
	 * essa informa��o em uma vari�vel depois retorna essa informa��o.
	 */
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){

		int cont = 0;
		for (Pedido p: this.pedidos){
			if (p.getCliente().getNome().equals(nomeCliente)){
				cont++;
			}
		}
		return cont;
	}

	@Override
	/**
	 * O m�todo adiciona pedido pega cada pedido passado como parametro e adiciona na lista
	 */
	public void adicionaPedido(Pedido p) {
		
		this.pedidos.add(p);
		gravarPedidos();
	}

	@Override
	/**
	 * O m�todo pesquisa pedido incluindo produto recebe um codigo de um produto como
	 * par�metro e pesquisa na lista de pedidos os pedidos que tenha produtos que tenham 
	 * codigo igual ao passado como par�metro
	 */
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codProduto) {
		
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
	/**
	 * O m�todo remove pedido recebe um n�mero de um pedido
	 * a ser removido como par�metro e compara esse n�mero com os n�meros existentes
	 * na lista e depois remove.
	 */
	public void removePedido(long numPedido) {
		
		for (Pedido p: this.pedidos){
			if (p.getNumeroDoPedido()== numPedido){
				this.pedidos.remove(p);
				gravarPedidos();
				break;
			}
		}

	}
	
	public void gravarPedidos(){
		
		
		try{
			gravador.gravarPedidos(pedidos);	
		}catch (IOException error){
			System.err.println("erro ao gravar");
		}
	}

}

