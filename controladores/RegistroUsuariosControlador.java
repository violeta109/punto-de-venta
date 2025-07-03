package proyecto.avance.sistemaventa.controladores;

import java.sql.SQLException;
import java.util.ResourceBundle;
import proyecto.avance.sistemaventa.daos.LoginDAO;
import proyecto.avance.sistemaventa.modelo.Loginn;
import proyecto.avance.sistemaventa.utils.Utilitarios;
import proyecto.avance.sistemaventa.vista.Login;

public class RegistroUsuariosControlador {

    private static RegistroUsuariosControlador instance;
    private final LoginDAO loginDAO;
    private final ResourceBundle messages;

    public static RegistroUsuariosControlador getInstance() {
        if (instance == null) {
            synchronized (RegistroUsuariosControlador.class) {
                if (instance == null) {
                    instance = new RegistroUsuariosControlador();
                }
            }
        }
        return instance;
    }

    public RegistroUsuariosControlador() {
        this.loginDAO = LoginDAO.getInstance();
        this.messages = ResourceBundle.getBundle("juan.estevez.sistemaventa.recursos.messages");
    }

    public boolean validar(String correo, String password, String nombre, String rol, boolean esRegistroUsuario) {
        if (!correo.isEmpty() && !password.isEmpty() && !nombre.isEmpty() && !rol.isEmpty()) {
            Loginn loginn = Loginn.builder()
                    .nombre(nombre)
                    .correo(correo)
                    .rol(rol)
                    .password(password)
                    .build();

            try {
                loginDAO.registrarUsuario(loginn);
                Utilitarios.mostrarMensajeExito(messages.getString("mensajeRegistroExitoso"));
                if (!esRegistroUsuario) {
                    openLogin();
                }
                return true;
            } catch (SQLException ex) {
                Utilitarios.mostrarMensajeError(messages.getString("errorConexionDB"));
            }
        } else {
            Utilitarios.mostrarMensajeAdvertencia(messages.getString("mensajeRegistroInvalido"));
        }

        return false;
    }

    private void openLogin() {
        new Login().setVisible(true);
    }
}
