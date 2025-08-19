package co.edu.ucentral.manejadorUniveridades.controladores;

import co.edu.ucentral.manejadorUniveridades.entidades.Profesor;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioProfesores;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/profesores")
public class ControladorProfesores {
    @Autowired
    private ServicioProfesores servicioProfesores;

    @PostMapping("/")
    public void crear (@RequestBody Profesor profesor) {this.servicioProfesores.CrearProfesor(profesor);}
    @DeleteMapping ("/{cedula}")
    public void eliminar (@PathVariable Long cedula) {this.servicioProfesores.BorrarProfesor(cedula);}

    @GetMapping("/")
    public List<Profesor> consultar(){
        return this.servicioProfesores.consultarTodos();

    }
}
