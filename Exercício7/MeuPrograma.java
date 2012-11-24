package Exercício7;



public class MeuPrograma {
public static void main(String[] args) {

Agenda agenda = new Agenda();

agenda.adicionarContato("Maria","XXXX-XXXX");

try{
agenda.pesquisarContato("Maria");
agenda.pesquisarContato("Maria José");
}catch(ContatoInexistenteException e){
System.err.println("O contato não existe na agenda: "+e);
}

}

}