package Exerc�cio8;

public class ContatoInexistenteException extends Exception{
	public ContatoInexistenteException(){
		super("Erro: Contato inexistente!!!");
	}

	public ContatoInexistenteException(String msg) {
		super(msg);
	}
}
