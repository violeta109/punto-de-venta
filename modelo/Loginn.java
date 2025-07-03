package proyecto.avance.sistemaventa.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loginn {

    private int id;
    private String nombre;
    private String correo;
    private String password;
    private String rol;

}
