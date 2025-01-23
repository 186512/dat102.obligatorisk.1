package filmarkiv.klient;

import filmarkiv.impl.Film;
import static javax.swing.JOptionPane.*;
import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Filmarkiv;

public class Tekstgrensesnitt {

	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm() {
		
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
