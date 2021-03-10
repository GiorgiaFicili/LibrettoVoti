package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti; //Cerchiamo di definire sempre le variabili con un tipo derivato da un interfaccia, definiamo dopo il tipo specifico che useremo (ArrayList, LinkedList,....)
	
	public Libretto() {
								//Non serve ripetere <Voto>
		this.voti = new ArrayList<>(); //Ora bisogna specificare il tipo specifico di tipo List
		//Questo e' l'unico punto in cui so se la List e' di tipo ArrayList o di tipo LinkedList
		//Se devo modificare qualcosa nel mio programma, basta toccare un solo punto strategico
		
	}
	
	public void add(Voto v) {
		
		this.voti.add(v);
		
	}
	
	public String toString() {
		
		String s = "";
		
		for(Voto v : this.voti) {
			
			//E' responsabilita' di voto quella di formattare se stesso, non e' responsabilita' di libretto
			s = s + v.toString() + "\n";
			
		}
		
		return s;
	}
	
}
