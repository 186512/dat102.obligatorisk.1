import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import filmarkiv.impl.Film;
import filmarkiv.impl.Filmarkiv;
import filmarkiv.impl.Sjanger;
import filmarkiv.adt.FilmarkivADT;


public class FilmarkivTest {
    private Filmarkiv arkiv;
    

    @BeforeEach
    public void setUp() {
        arkiv = new Filmarkiv(5); 
    }

    @Test
    public void testLeggTilFilm() {
        
        Film nyFilm = new Film(1, "henry karlsen", "the beggining", 1998, Sjanger.ACTION, "mats as");

        
        arkiv.leggTilFilm(nyFilm);

        
        assertEquals(1, arkiv.antall());

        
        assertEquals(nyFilm, arkiv.getFilmer()[0]);
    }

    @Test
    public void testLeggTilFilmFulltArkiv() {
       
        for (int i = 0; i < 5; i++) {
            arkiv.leggTilFilm(new Film(i, "", "", 2023, Sjanger.ACTION, ""));
        }

        
        Film nyFilm = new Film(6, "", "", 2023,  Sjanger.ACTION, "");
        arkiv.leggTilFilm(nyFilm);

        
        assertEquals(5, arkiv.antall());
        
       
    }
}