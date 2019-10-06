package cl.proyecto.sgi.dto;
import java.time.LocalDateTime;

public class Ventas {
    private String tipoPago;
    private LocalDateTime fechahoraVenta;
    private int nroVenta;

    public Ventas() {
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public LocalDateTime getFechahoraVenta() {
        return fechahoraVenta;
    }

    public void setFechahoraVenta(LocalDateTime fechahoraVenta) {
        this.fechahoraVenta = fechahoraVenta;
    }

    public int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }
        
}
