package proyecto.avance.sistemaventa.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Detalle {

    private int id;
    private int cantidad;
    private int idVenta;
    private String codigoProducto;
    private double precio;

}
