package proyecto.avance.sistemaventa.servicio;

import java.sql.SQLException;
import java.util.List;
import proyecto.avance.sistemaventa.daos.ClienteDAO;
import proyecto.avance.sistemaventa.modelo.Cliente;

public class ClienteServicio {

    private static ClienteServicio instance;
    private final ClienteDAO clienteDAO;

    public static ClienteServicio getInstance() {
        return instance == null ? new ClienteServicio() : instance;
    }

    private ClienteServicio() {
        this.clienteDAO = ClienteDAO.getInstance();
    }

    public List<Cliente> getAllClientes() throws SQLException {
        return this.clienteDAO.listarClientes();
    }

    public void registrarCliente(Cliente cliente) throws SQLException {
        this.clienteDAO.registrarCliente(cliente);
    }

    public void modificarCliente(Cliente cliente) throws SQLException {
        this.clienteDAO.modificarCliente(cliente);
    }

    public void eliminarCliente(int idCliente) throws SQLException {
        this.clienteDAO.eliminarCliente(idCliente);
    }

    public Cliente buscarCliente(int dniRut) throws SQLException {
        return this.clienteDAO.buscarCliente(dniRut);
    }

}
