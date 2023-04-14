import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetaTest {

    @Test
    public void testConversioKelvin() {
        Planeta marte = new Planeta(30, 80, 10, 1, 40);

        marte.conversioKelvin();

        int conversion = marte.getTemperaturaMitjana();
        assertEquals(303, conversion);
    }

    @Test
    public void testPlanetaHabitable() {
        Planeta marte = new Planeta(30, 50, 10, 1, 40);
        Planeta jupiter = new Planeta(30, 20, 50, 1, 40);
        Planeta saturn = new Planeta(100, 100, 80, 1, 40);
        Planeta venus = new Planeta(600, 70, 10, 1, 40);

        int habitable1 = marte.planetaHabitable();
        int habitable2 = jupiter.planetaHabitable();
        int habitable3 = saturn.planetaHabitable();
        int habitable4 = venus.planetaHabitable();

        assertEquals(1, habitable1);
        assertEquals(0, habitable2);
        assertEquals(0, habitable3);
        assertEquals(0, habitable4);
    }

    @Test
    public void testCalculPes() {
        Planeta marte = new Planeta(30, 4, 10, 1, 40);
        int persona = marte.calculPes(100);

        assertEquals(101, persona);
    }

    @Test
    public void testPlanetaEquilibrat() {
        Planeta marte = new Planeta(30, 4, 10, 1, 40);
        Planeta jupiter = new Planeta(30, 7, 10, 1, 40);

        int equilibrat1 = marte.planetaEquilibrat();
        int equilibrat2 = jupiter.planetaEquilibrat();

        assertEquals(1, equilibrat1);
        assertEquals(0, equilibrat2);
    }
}
