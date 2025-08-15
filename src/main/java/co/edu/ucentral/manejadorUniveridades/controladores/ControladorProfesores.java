package co.edu.ucentral.manejadorUniveridades.controladores;

import co.edu.ucentral.manejadorUniveridades.entidades.Profesor;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioProfesores;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/profesores")
public class ControladorProfesores {
    @Autowired
    private ServicioProfesores servicioProfesores;

    @PostMapping("/")
    public void crear (@RequestBody Profesor profesor) {this.servicioProfesores.CrearProfesor(profesor);}
    @GetMapping("/")
    public void eliminar (@RequestBody Profesor profesor) {this.servicioProfesores.BorrarProfesor(profesor);}
}
