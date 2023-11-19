package proyectospring.gestionusuario.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import proyectospring.gestionusuario.model.Auto;
@RunWith(MockitoJUnitRunner.class)
class AutosControllerTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@InjectMocks
    private AutosController autosController;

    @Mock
    private List<Auto> autos;

    @Test
    public void setUp() {
        autos = new ArrayList<>();
        autos.add(new Auto(1, "Toyota"));
        autos.add(new Auto(2, "Kia"));
        autos.add(new Auto(3, "Nissan"));
        autos.add(new Auto(4, "BMW"));
    }


    @SuppressWarnings("unused")
	@Test
    public void agregarAuto_DebeAgregarAuto() {
        Auto autoNuevo = new Auto(5, "Ford");
        
    }
    
    
    

    @Test
    public void eliminarAuto_DebeEliminarAuto() {
        ResponseEntity<?> response = autosController.eliminarAuto(1L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
      
    }

}













