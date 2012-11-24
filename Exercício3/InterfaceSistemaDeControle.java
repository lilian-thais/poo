package Exercício3;

import java.util.List;


/**
 * Esta interface define as operações de um sistema de gerenciamento de pedidos.
 * @author Lilian
 *
 */

public interface InterfaceSistemaDeControle {
	
/**
 *  esta opção adiciona um novo pedido
 * @param p
 */
	public void adicionaPedido (Pedido p);
	
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codigoProd);
	
	public void removePedido (long numPedido);

}
