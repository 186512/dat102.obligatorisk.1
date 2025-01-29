package filmarkiv.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filmarkiv.impl.Film;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;

public class FilmarkivTest {
    private Filmarkiv arkiv;
    
    @BeforeEach
    public void setUp() {
        arkiv = new Filmarkiv(5); 
        arkiv.leggTilFilm(new Film(1, "Henry Karlsen", "The Beginning", 1998, Sjanger.ACTION, "Mats AS"));
        arkiv.leggTilFilm(new Film(2, "Alice Olsen", "Adventure Time", 2005, Sjanger.DRAMA, "Nordic Films"));
       
    }

    @Test
    public void testFinnFilm() {
        Film film = arkiv.finnFilm(1); 
        assertNotNull(film); 
        assertEquals(1, film.getFilmnr()); 
        assertEquals("The Beginning", film.getTittel());
    }

    @Test
    public void testFinnFilmIkkeFunnet() {
        Film film = arkiv.finnFilm(3); 
        assertNull(film);  
    }
    
    @Test
    public void testLeggTillFilm() {
        Film film1 = new Film(1, "Henry Karlsen", "The Beginning", 1998, Sjanger.ACTION, "Mats AS");

        arkiv.leggTilFilm(film1);
        
        
        assertEquals(film1, arkiv.finnFilm(1));
    }
    @Test
    public void testSlettFilm() {
        assertNotNull(arkiv.finnFilm(1));
        assertNotNull(arkiv.finnFilm(2));

        boolean isDeleted = arkiv.slettFilm(1);
        assertTrue(isDeleted);

        assertNull(arkiv.finnFilm(1));
        assertNotNull(arkiv.finnFilm(2));
        assertEquals(1, arkiv.antall());
    }

    @Test
    public void testSlettFilmWhenFilmDoesNotExist() {
        boolean isDeleted = arkiv.slettFilm(3);
        assertFalse(isDeleted);
    }
   
 

        
    	
    
    
    
}
