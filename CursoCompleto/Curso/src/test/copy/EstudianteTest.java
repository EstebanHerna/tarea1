package test.copy;

import static org.junit.Assert.*;

import org.junit.Test;

import mundo.Estudiante;

public class EstudianteTest {
    
    private Object codigo;
	@Test
    public void testCompararPorCodigo() {
        Estudiante estudiante1 = new Estudiante("Jorge", "123", 4.0);
        Estudiante estudiante2 = new Estudiante("Maria", "124", 4.5);
        Estudiante estudiante3 = new Estudiante("Juan", "123", 3.5);
        
        assertTrue(estudiante1.compararPorCodigo(estudiante2) < 0);
        assertTrue(estudiante1.compararPorCodigo(estudiante3) == 0);
    }

    
    @Test
    public void testToString() {
        Estudiante estudiante = new Estudiante("Jorge", "123", 4.0);
        assertEquals("123", estudiante.toString());
    }
    public int compararPorCodigo(Estudiante otro) {
        return this.codigo.compareTo(otro.codigo);
    }
}
