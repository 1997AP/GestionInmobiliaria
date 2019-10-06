package cl.proyecto.sgi.dto;
import java.time.LocalDateTime;

public class Usuarios {
    private String nombreUsuario;
    private String tipoUsuario;
    private int contraseña;
    private LocalDateTime fechaConexion;

    public Usuarios() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDateTime getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(LocalDateTime fechaConexion) {
        this.fechaConexion = fechaConexion;
    }
    
    
}
    
