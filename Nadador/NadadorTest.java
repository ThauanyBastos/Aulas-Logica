import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste NadadorTest.
 * @author Thauany Azevedo Bastos 
 * @version 1.0
 * @since 01/06/2020 - 09:39
 * @category Test
 */
public class NadadorTest {
    
    Nadador nadador = new Nadador();

    public NadadorTest() {
        nadador.setNome("Thauany");
        nadador.setIdade(6); 
    }

    @Before
    public void setUp() {
        nadador.setIdade(6); 
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testVerificarNadador() {
        assertEquals("Não pode ser nadador! Idade mínima é 8 anos.", nadador.verificarNadador());
        nadador.setIdade(8);
        assertEquals("Infantil", nadador.verificarNadador());
        nadador.setIdade(9);
        assertEquals("Infantil", nadador.verificarNadador());
        nadador.setIdade(10);
        assertEquals("Infantil", nadador.verificarNadador());
        nadador.setIdade(11);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(12);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(13);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(14);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(15);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(16);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(17);
        assertEquals("Juvenil", nadador.verificarNadador());
        nadador.setIdade(18);
        assertEquals("Adulto", nadador.verificarNadador());
        nadador.setIdade(19);
        assertEquals("Adulto", nadador.verificarNadador());
        nadador.setIdade(20);
        assertEquals("Adulto", nadador.verificarNadador());
    }  
}
