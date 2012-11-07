import java.util.ArrayList;
import java.util.List;


public class ControleDePedidos implements InterfaceSistemaDeControle {

	List<Pedido> pedidos;
	
	public ControleDePedidos (){
		this.pedidos = new ArrayList<Pedido>();
	}

	@Override
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);		
	}

	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codigoProd) {
		List<Pedido> listaDePedidos = new ArrayList<Pedido>();
		for (Pedido pedido : pedidos) {
			for(ItemDePedido itens : pedido.getItens()){
				if(itens.getCodProduto()==codigoProd){
					listaDePedidos.add(pedido);
				}
			}
		}
		return listaDePedidos;
	}

	@Override
	public void removePedido(long numPedido) {
		
		for (Pedido aux : pedidos) {
			if(aux.getNumeroDoPedido()==numPedido){
				pedidos.remove(aux);
				break;
			}
		}
	}
	
	
}
