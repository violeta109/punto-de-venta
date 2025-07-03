package proyecto.avance.sistemaventa.controladores;

import java.sql.SQLException;
import proyecto.avance.sistemaventa.modelo.ConfiguracionDatosEmpresa;
import proyecto.avance.sistemaventa.servicio.ConfiguracionDatosEmpresaServicio;
import proyecto.avance.sistemaventa.utils.Utilitarios;

public class ConfiguracionDatosEmpresaControlador {

    private static ConfiguracionDatosEmpresaControlador instance;
    private final ConfiguracionDatosEmpresaServicio configuracionDatosEmpresaServicio;

    public static ConfiguracionDatosEmpresaControlador getInstance() {
        if (instance == null) {
            synchronized (ConfiguracionDatosEmpresaControlador.class) {
                if (instance == null) {
                    instance = new ConfiguracionDatosEmpresaControlador();
                }
            }
        }
        return instance;
    }
    
    public ConfiguracionDatosEmpresaControlador() {
        this.configuracionDatosEmpresaServicio = ConfiguracionDatosEmpresaServicio.getInstance();
    }
    
    public ConfiguracionDatosEmpresa obtenerDatosEmpresa() {
        try {
            return this.configuracionDatosEmpresaServicio.getDatosEmpresa();
        } catch (SQLException ex) {
            Utilitarios.mostrarErrorGenerico(ex);
        }
        
        return null;
    }
    
    public void modificarDatosEmpresa(ConfiguracionDatosEmpresa configuracionDatosEmpresa) {
        try {
            this.configuracionDatosEmpresaServicio.modificarDatosEmpresa(configuracionDatosEmpresa);
        } catch (SQLException ex) {
            Utilitarios.mostrarErrorGenerico(ex);
        }
    }
    
}
