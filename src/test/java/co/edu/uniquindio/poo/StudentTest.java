/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * Clase de pruebas para verificar funcionamiento de Student
 */
public class StudentTest {
    private static final Logger LOG = Logger.getLogger(StudentTest.class.getName());

    /**
     * Prueba para verificar que los datos del estudiante esten completos
     */
    @Test
    public void completeData() {
        LOG.info("Start completeData");
        
        var student = new Student("Sharon", "Ospina Osorio", "1098306887", "sharond.ospinao@uqvirtual.edu.co", 
        "3136938483", (byte)18);

        assertEquals("Sharon", student.getName());
        assertEquals("Ospina Osorio", student.getLastName());
        assertEquals("1098306887", student.getIdentification());
        assertEquals("sharond.ospinao@uqvirtual.edu.co", student.getEmail());
        assertEquals("3136938483", student.getTelephone());
        assertEquals((byte) 18, student.getAge());
        LOG.info("Ending completeData");
    }

    /**
     * Prueba para verificar que los datos del estudiante no esten nulos
     */
    @Test
    public void nullData() {
        LOG.info("Start nullData");
        assertThrows(Throwable.class, () -> new Student(null,null, null, null, null, (byte)18));
        LOG.info("Ending nullData");
    }
    
    /*
     * Prueba para verificar que el correo del estudiante este correcto
     */
    @Test
    public void negativeAge() {
        LOG.info("Start negativeAge");
        assertThrows(Throwable.class, () -> new Student("Sharon", "Ospina Osorio", "1098306887", "sharond.ospinao@uqvirtual.edu.co", "3136938483", (byte)-18));
         //NegativeAgeTester tester= new NegativeAgeTester();
        //assertThrows(Throwable.class, tester);
        LOG.info("Ending emptyData");

    }
    private static class NegativeAgeTester implements Executable{
        @Override
        public void execute() throws Throwable {
            new Student("Sharon", "Ospina Osorio", "1098306887",
                    "sharond.ospinao@uniquindio.edu.co", "3136938483", (byte) -18);

    }
}
}
