package filmarkiv.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import filmarkiv.impl.Film;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;

public class FilmarkivTest {
    private Filmarkiv arkiv;

    @Before
    public void setUp() {
        arkiv = new Filmarkiv(5); 
    }

    @Test
    public void testLeggTilFilm() {
        Film nyFilm = new Film(1, "henry karlsen", "the beginning", 1998, Sjanger.ACTION, "mats as");

        arkiv.leggTilFilm(nyFilm);

        assertEquals(1, arkiv.antall());
        assertEquals(nyFilm, arkiv.getFilmer()[0]);
    }

    @Test
    public void testLeggTilFilmFulltArkiv() {
        for (int i = 0; i < 5; i++) {
            arkiv.leggTilFilm(new Film(i, "", "", 2023, Sjanger.ACTION, ""));
        }

        Film nyFilm = new Film(6, "", "", 2023, Sjanger.ACTION, "");
        arkiv.leggTilFilm(nyFilm);

        // Now the archive should hold 6 films after resizing
        assertEquals(6, arkiv.antall());
    }
}
