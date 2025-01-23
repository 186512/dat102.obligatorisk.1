package filmarkiv.klient;

import filmarkiv.impl.Film;
import static javax.swing.JOptionPane.*;
import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;

public class Tekstgrensesnitt {

	public Film lesFilm() {
		String NyFilmNr = showInputDialog("skriv inn filmnummeret");
		String NyFilmSkaper = showInputDialog("skriv inn Filmskaperen");
		String NyFilmTittel = showInputDialog("skriv inn filmnummeret");
		String NyFilmLansering = showInputDialog("skriv inn Lanserings år");
<<<<<<< HEAD
		¨
		Sjanger[] sjangere = Sjanger.values();
=======
		
		 Sjanger[] sjangere = Sjanger.values();
>>>>>>> 791b366d1cb54867c6faa574741ea60c181987b1
		Sjanger nyFilmSjanger = (Sjanger) showInputDialog(
                null,
                "Velg en filmsjanger:",
                "Filmsjanger",
                QUESTION_MESSAGE,
                null,
                sjangere,
                sjangere[0] 
        );

       
        if (nyFilmSjanger != null) {
            System.out.println("Valgt sjanger: " + nyFilmSjanger);
        } else {
            System.out.println("Ingen sjanger ble valgt.");
        }
    
		String nyFilmSelskap = showInputDialog("skriv inn Filmselskapet");
		
		int nyttNr = Integer.parseInt(NyFilmNr);
		int nylansering = Integer.parseInt(NyFilmLansering);
		
		
		Film nyFilm = new Film(nyttNr, NyFilmSkaper, NyFilmTittel,nylansering, nyFilmSjanger, nyFilmSelskap);
	
	
	return nyFilm; 
	}

	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {
		System.out.println("Filmdetaljer:");
		System.out.println("Tittel: " + film.getTittel());
		System.out.println("Produsent: " + film.getProdusent());
		System.out.println("Lanseringsår: " + film.getLanseringsår());
		System.out.println("Sjanger: " + film.getSjanger());
		System.out.println("Filmselskap: " + film.getFilmselskap());
	}

	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
		 Film[] funnetFilmer = arkiv.soekTittel(delstreng);
		 if (funnetFilmer.length > 0) {
		        System.out.println("Filmer som inneholder '" + delstreng + "' i tittelen:");
		        for (Film film : funnetFilmer) {
		            skrivUtFilm(film);
		        }
		    } else {
		        System.out.println("Ingen filmer funnet med den angitte delstrengen.");
		    }
	}

	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
	    Film[] funnetFilmer = arkiv.soekProdusent(delstreng);

	    if (funnetFilmer.length > 0) {
	        System.out.println("Filmer produsert av: " + delstreng);
	        for (Film film : funnetFilmer) {
	            skrivUtFilm(film); 
	        }
	    } else {
	        System.out.println("Ingen filmer funnet med den angitte produsenten.");
	    }
	}

	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
		int totalAntallFilmer = arkiv.antall();
		System.out.println("Totalt antall filmer: " + totalAntallFilmer);
		
		Sjanger[] alleSjangre = Sjanger.values();
		
		for (Sjanger sjanger : alleSjangre) {
	        int antallISjanger = arkiv.antall(sjanger);
	        System.out.println(sjanger + ": " + antallISjanger);
	    }
	}
	// osv ... andre metoder
}
