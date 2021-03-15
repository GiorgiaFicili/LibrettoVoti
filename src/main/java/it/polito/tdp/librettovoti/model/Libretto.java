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
		
		System.out.println("Sono Libretto e sono vivo!");
		
	}
	
	public void add(Voto v) {
		
		this.voti.add(v);
		
	}
	
	/*
	 
	 
	public void stampaVotiUguali(int punteggio) {
		//il libretto stampa da solo i voti
		//questo metodo sa solo stampare nella console
		System.out.println();
	}
	
	*/
	
	//oppure
	
	/*
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sara' poi il chiamante a stamparli
		//questo metodo invece crea una stringa e poi sono io a decidere come usarla
		//questo metodo e' piu' generale e quindi migliore del primo
		//ma nella stringa devo stampare solo il nome del corso oppure tutto voto.toString() ??
		//non ho informazioni chiare dal testo per decidere come comporre questa stringa
		//quindi seleziono (con il metodo successivo) i voti cercati, e poi uno se li stampa come vuole
	}
	
	*/
	
	
	
	public List<Voto> listaVotiUguali(int punteggio) {
		
		List<Voto> risultato = new ArrayList<>();
		
		for(Voto v : this.voti) {
			
			if(v.getVoto()==punteggio) {
				
				risultato.add(v);
				
				//v ora e' lo STESSO OGGETTO VOTO contenuto in DUE LISTE DIVERSE, non sono due oggetti diversi copiati, ma sono proprio lo STESSO OGGETTO, perche' non abbiamo scritto new creando un nuovo oggetto, ma stiamo usando un oggetto che esiste gia'
			}
			
		}
		
		return risultato;
		
		//restituisce solo i voti uguali al criterio
		//ha un difetto = espone all'esterno il tipo di struttura dati interna che ho usato
		//se poi decido di organizzare i dati in modo diverso, dovrei modificare tutto
		
	}
	
	
	
	//alternativa = METODO MIGLIORE
	
	public Libretto votiUguali(int punteggio) {
		
		//restituisco un nuovo libretto con i voti cercati
		//in questo modo, in questo nuovo libretto ci sono tutte le operazioni che si avevano nel libretto completo iniziale
		
		Libretto risultato = new Libretto();
		
		for(Voto v : this.voti) {
			
			if(v.getVoto()==punteggio) {
				risultato.add(v);
				//risultato.voti.add(v);
			}
			
		}
		
		return risultato;
	}
	
	/**
	 * Ricerca un Voto del corso di cui e' specificato il nome
	 * Se il corso non esiste, restituisce null.
	 * @param nomeCorso
	 * @return
	 */
	
	public Voto ricercaCorso(String nomeCorso) {
		
		Voto risultato = null;
		
		for(Voto v : this.voti) {
			
			if(v.getNome().equals(nomeCorso)) {
				risultato = v;
				break;
			}
			
		}
		
		return risultato;
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
