package Exercício8;

import java.io.Serializable;

public class Contato implements Serializable, Comparable <Contato> { // toda classe gravada implementa serializable

	private String nome;
	private String telefone;

	public Contato() {
		this("nome", "telefone");
	}

	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone1() {
		return this.telefone;
	}

	public void setTelefone1(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nTelefone: " + this.getTelefone();
	}

	@Override
	public int compareTo(Contato o) {
		// TODO Auto-generated method stub
		return 0;
	}
}