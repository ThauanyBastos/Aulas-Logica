import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TrimestreTest.
 *
 * @author  Thauany Azevedo Bastos
 * @version 1.0
 * @since 01/06/2020 - 08:41
 * @category Test
 */
public class TrimestreTest {
    
    Trimestre trimestre = new Trimestre();
    
    public TrimestreTest() {
        trimestre.setMes(1);
    }

     @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testValidarMes() {   
        assertEquals("1 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(2);
        assertEquals("1 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(3);
        assertEquals("1 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(4);
        assertEquals("2 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(5);
        assertEquals("2 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(6);
        assertEquals("2 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(7);
        assertEquals("3 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(8);
        assertEquals("3 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(9);
        assertEquals("3 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(10);
        assertEquals("4 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(11);
        assertEquals("4 Trimestre", trimestre.validarTrimestre());
        trimestre.setMes(12);
        assertEquals("4 Trimestre", trimestre.validarTrimestre());
    }
}
