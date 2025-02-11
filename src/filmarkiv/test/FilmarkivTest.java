package filmarkiv.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filmarkiv.impl.Film;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;
import filmarkiv.klient.Tekstgrensesnitt;

public class FilmarkivTest {
    private Filmarkiv arkiv;
    private Tekstgrensesnitt Larkiv;
    
    @BeforeEach
    public void setUp() {
        arkiv = new Filmarkiv(5); 
        arkiv.leggTilFilm(new Film(1, "Henry Karlsen", "The Beginning", 1998, Sjanger.ACTION, "Mats AS"));
        arkiv.leggTilFilm(new Film(2, "Alice Olsen", "Adventure Time", 2005, Sjanger.DRAMA, "Nordic Films"));
        Larkiv = new Tekstgrensesnitt();
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
    
    @Test
    public void testLesFilm() {
    	
    	String simulatedInput = "3\nJohn Doe\nMovie Title\n2025\nACTION\nStudio XYZ";
        InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);  // Set the input stream to simulate user input

        // Call the method to create a film
        Film newFilm = Larkiv.lesFilm();

        // Test the created film
        assertNotNull(newFilm);
        assertEquals(3, newFilm.getFilmnr());
        assertEquals("John Doe", newFilm.getProdusent());
        assertEquals("Movie Title", newFilm.getTittel());
        assertEquals(2025, newFilm.getLanseringsår());
        assertEquals(Sjanger.ACTION, newFilm.getSjanger());
        assertEquals("Studio XYZ", newFilm.getFilmselskap());
    }
    	
    
    
 

        
    	
    
    
    
}
