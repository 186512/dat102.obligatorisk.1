package filmarkiv.impl;

import java.util.Objects;

public class Film {
	
	private int filmnr;
	private String produsent;
	private String tittel;
	private int lanseringsår;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		
		this.filmnr = 0;
		this.produsent = "";
		this.tittel = "";
		this.sjanger = null;
		this.lanseringsår = 0;
		this.filmselskap = "";
		
	}
	
	
	public Film(int filmnr, String produsent, String tittel, int lanseringsår,  Sjanger sjanger,  String filmselskap) {
		
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.sjanger = sjanger;
		this.lanseringsår = lanseringsår;
		this.filmselskap = filmselskap;
		
	}
	
	

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getprodusent() {
		return produsent;
	}

	public void setprodusent(String produsent) {
		this.produsent = produsent;
	}

	public String gettittel() {
		return tittel;
	}

	public void settittel(String tittel) {
		this.tittel = tittel;
	}

	public int getlanseringsår() {
		return lanseringsår;
	}

	public void setlanseringsår(int lanseringsår) {
		this.lanseringsår = lanseringsår;
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
		return Objects.hash(filmnr, produsent, tittel, filmselskap, lanseringsår, sjanger);
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
		return filmnr == other.filmnr && Objects.equals(produsent, other.produsent)
				&& Objects.equals(tittel, other.tittel) && Objects.equals(filmselskap, other.filmselskap)
				&& lanseringsår == other.lanseringsår && sjanger == other.sjanger;
	}
	
	
	

}
