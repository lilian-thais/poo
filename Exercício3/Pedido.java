package Exercício3;

import java.util.ArrayList;
import java.util.List;



public class Pedido {

	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido>itens;
	
	public Pedido(long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
		this.cliente = new Cliente ("Sicrano");
		this.itens = new ArrayList<ItemDePedido>();
	}

	public long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(long numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void adicionaItem(ItemDePedido itens) {
		this.itens.add(itens);
	}
}
