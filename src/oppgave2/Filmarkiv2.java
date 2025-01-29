package oppgave2;

import java.util.Arrays;

import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Film;
import filmarkiv.impl.Sjanger;

public class Filmarkiv2 implements FilmarkivADT {
	
	private int antall;
	private LinearNode<Film> start;
	private Film[] filmer;
	
	public Filmarkiv2(int antall) {
		filmer = new Film[antall];
		antall = 0;
	}

	@Override
	public Film finnFilm(int nr) {
		for (int i = 0; i < antall; i++) {
			if (filmer[i].getFilmnr() == nr) {
				
				return filmer[i];
			}
		}
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == filmer.length) {
			fultArkiv();
		}
		filmer[antall] = nyFilm;
		antall++;
		System.out.println("film lagt til, nå er det " + antall + " antall filmer");
	}

	@Override
	public boolean slettFilm(int filmnr) {
	    for (int i = 0; i < antall; i++) {
	        if (filmer[i].getFilmnr() == filmnr) {
	            filmer[i] = filmer[antall - 1];  // Swap with the last film
	            filmer[antall - 1] = null;       // Set last film to null
	            antall--;                        // Decrease count
	            return true;
	        }
	    }
	    return false;
	}

	@Override
	public Film[] soekTittel(String tittel) {
		Film[] funnet = new Film[antall];
		int funnetAntall = 0;
		for (int i = 0; i < antall; i++) {
			if (filmer[i].getTittel().toLowerCase().contains(tittel.toLowerCase())) {
				funnet[funnetAntall++] = filmer[i];
			}
		}
		return trimTabell(funnet, funnetAntall);
	}

	@Override
	public Film[] soekProdusent(String produsent) {
		Film[] funnet = new Film[antall];
		int funnetAntall = 0;
		for (int i = 0; i < antall; i++) {
			if (filmer[i].getProdusent().toLowerCase().contains(produsent.toLowerCase())) {
				funnet[funnetAntall++] = filmer[i];
			}
		}
		return trimTabell(funnet, funnetAntall);
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antallSjanger = 0;
		for (int i = 0; i < antall; i++) {
			if (filmer[i].getSjanger() == sjanger) {
				antallSjanger++;
			}
		}
		return antallSjanger;
	}

	@Override
	public int antall() {
		return antall;
	}

	public void fultArkiv() {

		Film[] nyTabell = new Film[filmer.length * 2];
		for (int i = 0; i < antall; i++) {
			nyTabell[i] = filmer[i];
		}
		filmer = nyTabell;

	}

	private Film[] trimTabell(Film[] tabell, int lengde) {
		return Arrays.copyOf(tabell, lengde);
	}

	public Object[] getFilmer() {
		
		return filmer;
	}

}
	
}
