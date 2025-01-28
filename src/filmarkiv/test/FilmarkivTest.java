package filmarkiv.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filmarkiv.impl.Film;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;

public class FilmarkivTest {
    private Filmarkiv arkiv;
    
  

    @BeforeEach
    public void setUp() {
        arkiv = new Filmarkiv(5); // Initialize an archive with space for 5 films
        arkiv.leggTilFilm(new Film(1, "Henry Karlsen", "The Beginning", 1998, Sjanger.ACTION, "Mats AS"));
        arkiv.leggTilFilm(new Film(2, "Alice Olsen", "Adventure Time", 2005, Sjanger.DRAMA, "Nordic Films"));
    }

    @Test
    public void testFinnFilm() {
        Film film = arkiv.finnFilm(1); // Try to find the film with ID 1
        assertNotNull(film); // Check if a film was found
        assertEquals(1, film.getFilmnr()); // Check if the correct film was returned
        assertEquals("The Beginning", film.getTittel());
        // Verify the title
    }

    @Test
    public void testFinnFilmIkkeFunnet() {
        Film film = arkiv.finnFilm(3); // Try to find a film with an ID that doesn't exist
        assertNull(film); // Check if the method returned null
    }
}
