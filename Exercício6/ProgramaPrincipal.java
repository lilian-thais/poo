package Exercício6;

	import java.util.Scanner;


	
	public class ProgramaPrincipal {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			double valorTotal = 0;
			ItemDePedido item;
			Pedido pedido = new Pedido(100);
			
			
			System.out.println("Informe o codigo do produto pedido: ");
			long codigoItem = ler.nextLong();
			System.out.println("Informe a quantidade de itens pedidos: ");
			int quantidade = ler.nextInt();
			System.out.println("Informe o valor unitário do item: ");
			double valorUnitario = ler.nextDouble();
			item = new ItemDePedido(codigoItem, quantidade, valorUnitario);
			pedido.adicionaItem(item);
			
			while(codigoItem != 0){
				System.out.println("Informe o codigo do produto pedido: ");
				codigoItem = ler.nextLong();
				System.out.println("Informe a quantidade de itens pedidos: ");
				quantidade = ler.nextInt();
				System.out.println("Informe o valor unitário do item: ");
				valorUnitario = ler.nextDouble();
				item = new ItemDePedido(codigoItem, quantidade, valorUnitario);
				pedido.adicionaItem(item);
			}
			for( ItemDePedido itens:pedido.getItens()){
				valorTotal = itens.getQuantidade() * itens.getValorUnitario();	
			}
			System.out.println("O valor total do produto : "+valorTotal);
		}
	}
