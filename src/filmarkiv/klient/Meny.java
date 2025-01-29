package filmarkiv.klient;

import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Film;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;
import static javax.swing.JOptionPane.*;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	
	}

	public void start() {
		
	
		String valg = showInputDialog("Velg hva du vil gjøre:\n"
				+ "1: Legge til en ny film\n"
				+ "2: Søke etter film etter tittel\n"
				+ "3: Søke etter film etter produsent\n"
				+ "4: Vis statistikk\n"
				+ "5: Avslutt");
					
		switch (valg) {
		case "1":
			Film nyFilm = tekstgr.lesFilm();
			if (nyFilm != null) { 
		        filmarkiv.leggTilFilm(nyFilm);
		        showMessageDialog(null, "Filmen er lagt til!");
		    } else {
		        showMessageDialog(null, "Ingen film ble opprettet.");
		    }
			break;
		case "2":
			String tittelSoek = showInputDialog("Søk etter tittel: ");
			tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, tittelSoek);
			break;
		case "3":
			String produsentSoek = showInputDialog("Søk etter produsent: ");
			tekstgr.skrivUtFilmProdusent(filmarkiv, produsentSoek);
			break;
		case "4":
			tekstgr.skrivUtStatistikk(filmarkiv);
			break;
		case "5":
			
			showMessageDialog(null, "Avslutter");
			break;
		default:
			showMessageDialog(null, "Ugyldig valg, prøv igjen.");
		}
		
		
	}
	
	
	
}
