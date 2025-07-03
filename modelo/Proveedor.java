package proyecto.avance.sistemaventa.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    private int id;
    private long rut;
    private long telefono;
    private String nombre;
    private String direccion;
    private String razonSocial;

}
