package Exercício8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GravadorDeContatos {

	public void gravarContatos(List<Contato> contatos) throws IOException{
		
		ObjectOutputStream oos = null;
		
		try{ // tenta executar as linhas que ele possui
			
			FileOutputStream fos = new FileOutputStream("Contatos.txt"); //manda criar o arquivo
			oos = new ObjectOutputStream(fos); // abri o caminho p gravar o arquivo
			oos.writeObject(contatos); // mandar gravar
		
		}catch(FileNotFoundException erro){ // captura o erro
			throw new IOException("Não foi encontrado o arquivo contatos.txt"); //informa q n encontrou o arquivo
			
		}
		catch(IOException error){
			throw error;
			
		}
		finally{
			if( oos!=null){
				oos.close();
		}
		}
		
	}
	
	public List<Contato>leContatos()throws IOException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("Contatos.txt")); // encontrar o arquivo
			return(List<Contato>) in.readObject(); // ler o arquivo encontrado
		
		}catch(FileNotFoundException erro){ // captura o erro
			throw new IOException("Não foi encontrado o arquivo contatos.txt"); //informa q n encontrou o arquivo
		
		}
		catch(IOException error){
			throw error;		
		}
		catch(ClassNotFoundException erro){ // captura o erro
			throw new IOException("Não conseguiu ler.txt"); //informa q n conseguiu ler
		
		}
		finally{
			if( in!=null){
			in.close();
		}
		}
	}
}
