package filmarkiv.klient;

import filmarkiv.adt.FilmarkivADT;
import filmarkiv.impl.Filmarkiv;

public class NyMain {
	
	public static void main(String[] args) {
		System.out.println("Hei");
		FilmarkivADT filmer = new Filmarkiv(100);
		Meny meny = new Meny(filmer);
		meny.start();
		System.out.println(" på deg");

	}

}
