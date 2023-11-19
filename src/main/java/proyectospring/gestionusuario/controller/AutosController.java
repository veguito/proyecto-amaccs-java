package proyectospring.gestionusuario.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import proyectospring.gestionusuario.model.Auto;

@RestController
@RequestMapping("/admin")
public class AutosController {

    private List<Auto> autos = new ArrayList<>(); 

    @GetMapping("/autos")
    public List<Auto> obtenerAutos() {
    	List<Auto> autos = new ArrayList<>();
    	autos.add(new Auto(1, "Toyota"));
    	autos.add(new Auto(2, "Kia"));
    	autos.add(new Auto(3, "Nissan"));
    	autos.add(new Auto(4, "BMW"));
       return autos;
       
    }
    

    @PostMapping("/agregar/auto")
    public ResponseEntity<?> agregarAuto(@RequestBody Auto auto) {
        autos.add(auto);
        return ResponseEntity.ok("Auto agregado con éxito");
    }
    
    
    

    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> eliminarAuto(@PathVariable Long id) {
       
        return ResponseEntity.ok("Auto eliminado con éxito");
    }

    
}


