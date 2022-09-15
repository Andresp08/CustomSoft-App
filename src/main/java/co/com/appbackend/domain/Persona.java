package co.com.appbackend.domain;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data //GET y SET
@Entity //entidad de la BD
@Table(name = "persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //convertir objeto java en obj JSON
    private Long idPersona;
    
    @NotEmpty(message = "El nombre no puede ir vacio")
    private String nombre;
    
    @NotEmpty(message = "El apellido no puede ir vacio")
    private String apellido;
    
    @NotEmpty(message = "El email no puede ir vacio")
    @Email
    private String email;
    
    @NotEmpty(message = "El telefono no puede ir vacio")
    private String telefono;
    
    @NotNull(message= "El saldo no puede ir vacio")
    private Double saldo;
}