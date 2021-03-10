package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

// POJO - Plain Old Java Object (Semplice Oggetto Java)
// Java Bean (una classe che al suo interno ha proprietà definite in questo modo: costruttore e getters and setters
// Questa classe e' un semplice contenitore dati

/**
 * Memorizza il risultato di un esame singolo
 * 
 * @author giorgia
 *
 */
public class Voto {

	private String nome; //nome corso
	private int voto; //30L come lo rappresento?
	private LocalDate data; //data superamento esame
	
	/**
	 * Costruttore della classe Voto
	 * @param nome Nome del corso superato
	 * @param voto Voto ottenuto
	 * @param data Data di superamento
	 */
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data;
	}

	
	
	
	
	
	
}
