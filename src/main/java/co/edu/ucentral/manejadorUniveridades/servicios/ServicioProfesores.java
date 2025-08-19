package co.edu.ucentral.manejadorUniveridades.servicios;

import co.edu.ucentral.manejadorUniveridades.entidades.Profesor;
import co.edu.ucentral.manejadorUniveridades.repositorios.RepositorioProfesor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServicioProfesores {
    @Autowired
    private RepositorioProfesor repositorioProfesor;

    public void CrearProfesor(Profesor profesor) {this.repositorioProfesor.save(profesor);}
    public void BorrarProfesor(Long cedula) {this.repositorioProfesor.deleteById(cedula);}

    public List<Profesor> consultarTodos(){
        return this.repositorioProfesor.findAll();
    }
}
