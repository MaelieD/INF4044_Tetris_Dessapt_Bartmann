package fr.esiea.architecture.movement;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Maélie on 22/03/2016.
 */
public class InputReaderTest {
    private InputReader mock = mock(InputReader.class);

    @Before
    public void setUp() throws Exception{
        when(mock.getMovements()).thenCallRealMethod();
    }

    @Test
    public void testBufferedMovement() throws Exception {
        Movement movement = Movement.TURN_LEFT;

        //assertTrue("Test max buffered movement :", InputReader.MAX_BUFFERIZED_MOVEMENT < 5);
        when(mock.readNextValue()).thenReturn((int)'s',(int)'s',-2);

        List<Movement> movements = mock.getMovements();

        assertEquals("Je m'attend à deux mouvements car il y a deux input",2,movements.size());
    }

}