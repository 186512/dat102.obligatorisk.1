package filmarkiv.klient;

import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Filmarkiv;

public class NyMain {
	
	public static void main(String[] args) {
		FilmarkivADT filmer = new Filmarkiv(100);
		Meny meny = new Meny(filmer);
		meny.start();
		
	}

}
