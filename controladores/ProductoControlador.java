package proyecto.avance.sistemaventa.controladores;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.avance.sistemaventa.modelo.Producto;
import proyecto.avance.sistemaventa.servicio.ProductoServicio;
import proyecto.avance.sistemaventa.utils.Utilitarios;
import proyecto.avance.sistemaventa.utils.vista.GUIUtils;

public class ProductoControlador {

    private static ProductoControlador instance;
    private final ProductoServicio productoServicio;
    private final ResourceBundle messages;
    private List<Producto> productos;

    public static ProductoControlador getInstance() {
        if (instance == null) {
            synchronized (ProductoControlador.class) {
                if (instance == null) {
                    instance = new ProductoControlador();
                }
            }
        }
        return instance;
    }

    public ProductoControlador() {
        this.productoServicio = ProductoServicio.getInstance();
        this.productos = listarProductos();
        this.messages = ResourceBundle.getBundle("juan.estevez.sistemaventa.recursos.messages");
    }

    private List<Producto> listarProductos() {
        try {
            this.productos = this.productoServicio.getAllProductos();
            return this.productos;
        } catch (SQLException ex) {
            Utilitarios.mostrarMensajeError(messages.getString("error"));
        }

        return new ArrayList<>();
    }

    public void listarProductos(JTable tableProductos) {
        listarProductos();
        tableProductos.setModel(GUIUtils.listarProductos(productos, (DefaultTableModel) tableProductos.getModel()));
    }

    public boolean guardarProducto(Producto producto) {
        try {
            productoServicio.registrarProducto(producto);
            Utilitarios.mostrarMensajeExito(messages.getString("producto.registrado"));
            return true;
        } catch (HeadlessException | SQLException e) {
            Utilitarios.mostrarErrorGenerico(e);
        }

        return false;
    }

    public boolean eliminarProducto(int idProducto) {
        try {
            if (Utilitarios.confirmarEliminacion()) {
                productoServicio.eliminarProducto(idProducto);
                Utilitarios.mostrarMensajeExito(messages.getString("producto.eliminado"));
                return true;
            }
        } catch (HeadlessException | SQLException e) {
            Utilitarios.mostrarErrorGenerico(e);
        }

        return false;
    }

    public boolean editarProducto(Producto producto) {
        try {
            productoServicio.modificarProducto(producto);
            Utilitarios.mostrarMensajeExito(messages.getString("producto.actualizado"));
            return true;
        } catch (HeadlessException | SQLException e) {
            Utilitarios.mostrarErrorGenerico(e);
        }

        return false;
    }

    public Producto buscarProducto(String codigo) {
        try {
            return this.productoServicio.buscarProducto(codigo);
        } catch (SQLException ex) {
            Utilitarios.mostrarErrorGenerico(ex);
        }
        return null;
    }
    
    public void limpiarTablaProductos(JTable tableProductos) {
        DefaultTableModel model = (DefaultTableModel) tableProductos.getModel();
        model.setRowCount(0);
    }
    
    public void consultarProveedor(JComboBox<String> proveedor) {
        try {
            this.productoServicio.consultarProveedor(proveedor);
        } catch (SQLException ex) {
            Utilitarios.mostrarErrorGenerico(ex);
        }
    }
    
    public void actualizarStock(JTable table) {
        try {
            this.productoServicio.actualizarStock(table);
        } catch (SQLException ex) {
            Utilitarios.mostrarErrorGenerico(ex);
        }
    }

}
