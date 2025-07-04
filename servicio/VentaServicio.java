package proyecto.avance.sistemaventa.servicio;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import proyecto.avance.sistemaventa.daos.VentaDAO;
import proyecto.avance.sistemaventa.modelo.Detalle;
import proyecto.avance.sistemaventa.modelo.Venta;
import proyecto.avance.sistemaventa.utils.Utilitarios;

public class VentaServicio {

    private static VentaServicio instance;
    private final VentaDAO ventaDAO;

    public static VentaServicio getInstance() {
        return instance == null ? new VentaServicio() : instance;
    }

    private VentaServicio() {
        this.ventaDAO = VentaDAO.getInstance();
    }

    public List<Venta> getAllVentas() throws SQLException {
        return this.ventaDAO.listarVentas();
    }
    
    public void registrarVenta(Venta venta) throws SQLException {
        this.ventaDAO.registrarVenta(venta);
    }
    
    public int obtenerIdVenta() throws SQLException {
        return this.ventaDAO.obtenerIdVenta();
    }
    
    public void registrarDetalleVenta(JTable tableVenta) {
        try {
            int id = this.ventaDAO.obtenerIdVenta();
            
            for (int i = 0; i < tableVenta.getRowCount(); i++) {
                String codigoProducto = tableVenta.getValueAt(i, 0).toString();
                int cantidad = Integer.parseInt(tableVenta.getValueAt(i, 2).toString());
                double precio = Double.parseDouble(tableVenta.getValueAt(i, 3).toString());
                this.ventaDAO.registrarDetalleVenta(Detalle.builder().id(id).codigoProducto(codigoProducto).cantidad(cantidad).precio(precio).build());
            }
        } catch (SQLException ex) {
            Utilitarios.mostrarErrorGenerico(ex);
        }
    }

}
