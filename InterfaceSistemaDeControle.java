import java.util.List;


public interface InterfaceSistemaDeControle {
	
	public void adicionaPedido (Pedido p);
	
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codigoProd);
	
	public void removePedido (long numPedido);

}
