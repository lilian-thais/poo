
public class ItemDePedido {
	private int quantidade;
	private long codProduto;
	private double valorUnitario;
	
	public ItemDePedido( long codigo, int quantidade, double valor){
		this.codProduto = codigo;
		this.quantidade = quantidade;
		this.valorUnitario = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(long codProduto) {
		this.codProduto = codProduto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	

}
