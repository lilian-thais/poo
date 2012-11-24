package TreinoExceções;

public class ProgramaExercicio5 {

	public static void main(String[]args){
		
		Agenda a = new Agenda();
		
		a.adicionarContato("berg" ,"96314222");
		
		try{
			a.pesquisarContato("berg");
		}catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
		}
		try{
			a.pesquisarContato("gilson");
		}catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
		}
	}
}
