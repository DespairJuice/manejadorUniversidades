package co.edu.ucentral.manejadorUniveridades.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "profesores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profesor {
    @Id
    private long cedula;

    private String nombre;
    private String correo;
    private String telefono;
    private String edad;
}
