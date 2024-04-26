package test.copy;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import mundo.Curso;
import mundo.Estudiante;

public class CursoTest {
    
    private Curso curso;
    
    @Before
    public void setUp() {
        curso = new Curso();
        curso.agregarEstudiante("Jorge Villalobos", "202111245", 4.0);
        curso.agregarEstudiante("Mario Sanchez", "202213243", 4.5);
        curso.agregarEstudiante("Laura Manzur", "202012333", 5.0);
        curso.agregarEstudiante("Camila Ángel", "201415643", 5.0);
        curso.agregarEstudiante("Paula Lago", "201029988", 5.0);
        curso.agregarEstudiante("Rosalía Hidalgo", "201522121", 5.0);
        curso.agregarEstudiante("Alejandro Osorio", "201121111", 5.0);
    }
    
    @Test
    public void testOrdenarEstudiantesPorCodigo() {
        curso.ordenarEstudiantesPorCodigo();
        ArrayList<Estudiante> estudiantesOrdenados = curso.getEstudiantes();
        
        ArrayList<String> codigosOrdenados = new ArrayList<>();
        for (Estudiante estudiante : estudiantesOrdenados) {
            codigosOrdenados.add(estudiante.getCodigo());
        }
        
        ArrayList<String> codigosEsperados = new ArrayList<>();
        codigosEsperados.add("201121111");
        codigosEsperados.add("201029988");
        codigosEsperados.add("201415643");
        codigosEsperados.add("201522121");
        codigosEsperados.add("202012333");
        codigosEsperados.add("202111245");
        codigosEsperados.add("202213243");
        
        assertEquals(codigosEsperados, codigosOrdenados);
    }
}
