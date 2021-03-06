package exemplos.banco;

import java.util.ArrayList;

public class Agencia {	
	/*
	 * Atributos da classe Agencia
	 */	
	private int numero;
	private String nome;	
	private ArrayList<Conta> contas = new ArrayList<Conta>();	
	/**
	 * Construtor da classe Agencia
	 * @param numero
	 * @param nome
	 */
	public Agencia(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	/**
	 * @param conta the conta to add
	 */
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
}
