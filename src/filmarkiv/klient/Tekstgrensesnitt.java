package filmarkiv.klient;

import filmarkiv.impl.Film;
import static javax.swing.JOptionPane.*;
import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;

public class Tekstgrensesnitt {

	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm() {
		
		String NyFilmNr = showInputDialog("skriv inn filmnummeret");
		String NyFilmSkaper = showInputDialog("skriv inn Filmskaperen");
		String NyFilmTittel = showInputDialog("skriv inn filmnummeret");
		String NyFilmLansering = showInputDialog("skriv inn Lanserings år");
		String NyFilmSelskap = showInputDialog("skriv inn Filmselskapet");
		
		 Sjanger[] sjangere = Sjanger.values();
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
		String strValg = showInputDialog("Velg hva du vil søke ette\n1: Produsent\n2: Tittel");
		int valg = Integer.parseInt(strValg);
		if (valg == 1) {
			String prodValgStr = showInputDialog("Søk etter produsent:");
			if (film.getProdusent().equalsIgnoreCase(prodValgStr)) {
	            showMessageDialog(null, "Film funnet:\n" + film.toString());
	        } else {
	            showMessageDialog(null, "Ingen filmer funnet for produsenten: " + prodValgStr);
	        }

	    } else if (valg == 2) {
	        String tittelValgStr = showInputDialog("Søk etter tittel:");

	        // Sammenligne tittelen til 'film' med brukerens input
	        if (film.getTittel().equalsIgnoreCase(tittelValgStr)) {
	            showMessageDialog(null, "Film funnet:\n" + film.toString());
	        } else {
	            showMessageDialog(null, "Ingen filmer funnet med tittelen: " + tittelValgStr);
	        }
		}
	}

	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
		// TODO
	}

	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
		// TODO
	}

	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
		// TODO
	}
	// osv ... andre metoder
}
