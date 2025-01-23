package filmarkiv.impl;

import java.util.Objects;

public class Film {
	
	private int filmNr;
	private String filmSkaper;
	private String filmTittel;
	private int lansering;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		
		this.filmNr = 0;
		this.filmSkaper = "";
		this.filmTittel = "";
		this.sjanger = null;
		this.lansering = 0;
		this.filmselskap = "";
		
	}
	
	
	public Film(int filmNr, String filmSkaper, String filmTittel, Sjanger sjanger, int lansering, String filmselskap) {
		
		this.filmNr = filmNr;
		this.filmSkaper = filmSkaper;
		this.filmTittel = filmTittel;
		this.sjanger = sjanger;
		this.lansering = lansering;
		this.filmselskap = filmselskap;
		
	}
	
	

	public int getFilmNr() {
		return filmNr;
	}

	public void setFilmNr(int filmNr) {
		this.filmNr = filmNr;
	}

	public String getFilmSkaper() {
		return filmSkaper;
	}

	public void setFilmSkaper(String filmSkaper) {
		this.filmSkaper = filmSkaper;
	}

	public String getFilmTittel() {
		return filmTittel;
	}

	public void setFilmTittel(String filmTittel) {
		this.filmTittel = filmTittel;
	}

	public int getLansering() {
		return lansering;
	}

	public void setLansering(int lansering) {
		this.lansering = lansering;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}


	@Override
	public int hashCode() {
		return Objects.hash(filmNr, filmSkaper, filmTittel, filmselskap, lansering, sjanger);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return filmNr == other.filmNr && Objects.equals(filmSkaper, other.filmSkaper)
				&& Objects.equals(filmTittel, other.filmTittel) && Objects.equals(filmselskap, other.filmselskap)
				&& lansering == other.lansering && sjanger == other.sjanger;
	}
	
	
	

}
