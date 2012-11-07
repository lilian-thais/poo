
public class Main {
	public static void main(String[] args) {
		ControleDePedidos controle = new ControleDePedidos();
		
		Cliente c1 = new Cliente("Lilian");
		Pedido p1 = new Pedido(100);

		p1.setCliente(c1);
		
		controle.adicionaPedido(p1);
		
		System.out.println(controle.pedidos.get(0).getCliente().getNome());
	}
}
