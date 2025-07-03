package proyecto.avance.sistemaventa.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private int id;
    private long telefono;
    private long dni;
    private String nombre;
    private String razonSocial;
    private String direccion;

}
