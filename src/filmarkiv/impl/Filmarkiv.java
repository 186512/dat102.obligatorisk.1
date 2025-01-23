package filmarkiv.impl;
import java.util.Arrays;

public abstract class Filmarkiv implements filmarkiv.adt.FilmarkivADT {
	
	
	public Film[] filmer;
	private int antall;
	
	
	public Filmarkiv(int kapasitet) {
		filmer = new Film[kapasitet];
		antall = 0;
		
	}
	
	@Override
	public Film finnFilm(int filmNr) {
		for(int i = 0; i < antall; i++) {
			if(filmer[i].getFilmNr() == filmNr) {
				return filmer[i];
			}
		}
		return null;
		
	}
	
	void leggTillFilm(Film nyFilm) {
		 if (antall == filmer.length) {
			 
	        }
	        filmer[antall] = nyFilm;
	        antall++;
	}
	
	
	@Override
    public boolean slettFilm(int filmnr) {
        for (int i = 0; i < antall; i++) {
            if (filmer[i].getFilmNr() == filmnr) {
                filmer[i] = filmer[antall - 1]; 
                filmer[antall - 1] = null; 
                antall--;
                return true;
            }
        }
        return false; 
    }
	
	public Film[] soekTittel(String filmTittel) {
		Film[] resultat = new Film[antall];
		int treff = 0;
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i].getFilmTittel().contains(filmTittel)) {
				resultat[treff++] = filmer[i];
				
				return resultat;
			}
			return null;
			
		}
		return resultat;
		
		
	}

	


	
	
	
	

}
