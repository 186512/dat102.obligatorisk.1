package filmarkiv.klient;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Film;
import filmarkiv.impl.Sjanger;

public class Tekstgrensesnitt {
	
	
	//
	public Film lesFilm(){
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
		
		
		Film nyFilm = new Film(nyttNr, NyFilmSkaper, NyFilmTittel,nyFilmSjanger, nylansering, nyFilmSelskap);
	
	
	return nyFilm; 
		
	}
	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {
	// TODO
	}
	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
		Film[] delsStrengFilm = new Film[100];
		Film[] filmer;
		String soek = showInputDialog("søk på en tittel ");
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i].getFilmTittel().contains(soek)) {
				
				delsStrengFilm[] = filmer[i];
				delStrengFilm[]
				
			}
		
		}
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

;