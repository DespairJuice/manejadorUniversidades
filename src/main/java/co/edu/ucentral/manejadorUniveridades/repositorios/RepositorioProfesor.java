package co.edu.ucentral.manejadorUniveridades.repositorios;

import co.edu.ucentral.manejadorUniveridades.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProfesor extends JpaRepository<Profesor,Long> {
}
