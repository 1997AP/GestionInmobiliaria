package cl.proyecto.sgi.dto;


public class bienRaiz {
    private String tipoBR;
    private String direccion;
    private String poblacion;
    private String sector;
    private String comuna;
    private int valorTasacion;
    private int precio;
    private boolean estacionamiento;
    private int tamaño;
    private int cantConstruido;
    private char patios;
    private byte pisos;
    private byte baños;
    private byte habitaciones;

    public bienRaiz() {
    }

    public String getTipoBR() {
        return tipoBR;
    }

    public void setTipoBR(String tipoBR) {
        this.tipoBR = tipoBR;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getValorTasacion() {
        return valorTasacion;
    }

    public void setValorTasacion(int valorTasacion) {
        this.valorTasacion = valorTasacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCantConstruido() {
        return cantConstruido;
    }

    public void setCantConstruido(int cantConstruido) {
        this.cantConstruido = cantConstruido;
    }

    public char getPatios() {
        return patios;
    }

    public void setPatios(char patios) {
        this.patios = patios;
    }

    public byte getPisos() {
        return pisos;
    }

    public void setPisos(byte pisos) {
        this.pisos = pisos;
    }

    public byte getBaños() {
        return baños;
    }

    public void setBaños(byte baños) {
        this.baños = baños;
    }

    public byte getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(byte habitaciones) {
        this.habitaciones = habitaciones;
    }
    
}
