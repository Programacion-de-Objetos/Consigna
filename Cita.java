import java.util.Date;

public class Cita {

    //ATRIBUTOS

    private int idCita;
    private Date fecha;
    private String hora;
    private int clienteCedula;
    private String tecnicoAsignado;
    private String tipoServicio;
    private double tamanoJardin;
    private String plantasAdicionales;
    private boolean confirmacionTecnico;
    private double precioBase;
    private double precioPlantasAdicionales;
    private double precioTotal;

    public Cita() {}

    // Constructor con parámetros, donde los valores de plantasAdicionales y precios se pasan desde otra clase
    
    public Cita(int idCita, Date fecha, String hora, int clienteCedula, String tecnicoAsignado,
                String tipoServicio, double tamanoJardin, String plantasAdicionales, double precioBase, double precioPlantasAdicionales) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.clienteCedula = clienteCedula;
        this.tecnicoAsignado = tecnicoAsignado;
        this.tipoServicio = tipoServicio;
        this.tamanoJardin = tamanoJardin;
        this.plantasAdicionales = plantasAdicionales;
        this.confirmacionTecnico = false;
        this.precioBase = precioBase;  // Asignado desde afuera
        this.precioPlantasAdicionales = precioPlantasAdicionales;  // Asignado desde afuera
        this.precioTotal = calcularPrecioTotal();
    }

    // Métodos set y get
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setClienteCedula(int clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public int getClienteCedula() {
        return clienteCedula;
    }

    public void setTecnicoAsignado(String tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public String getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTamanoJardin(double tamanoJardin) {
        this.tamanoJardin = tamanoJardin;
    }

    public double getTamanoJardin() {
        return tamanoJardin;
    }

    public void setPlantasAdicionales(String plantasAdicionales) {
        this.plantasAdicionales = plantasAdicionales;
    }

    public String getPlantasAdicionales() {
        return plantasAdicionales;
    }

    public void setConfirmacionTecnico(boolean confirmacionTecnico) {
        this.confirmacionTecnico = confirmacionTecnico;
    }

    public boolean getConfirmacionTecnico() {
        return confirmacionTecnico;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioPlantasAdicionales(double precioPlantasAdicionales) {
        this.precioPlantasAdicionales = precioPlantasAdicionales;
    }

    public double getPrecioPlantasAdicionales() {
        return precioPlantasAdicionales;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        return this.precioBase + this.precioPlantasAdicionales;
    }

    // Sobrescribir el método toString para mostrar la información de la cita
    @Override
    public String toString() {
        return "Cita ID: " + idCita + "\n" +
            "Fecha: " + fecha + "\n" +
            "Hora: " + hora + "\n" +
            "Cliente Cédula: " + clienteCedula + "\n" +
            "Técnico Asignado: " + tecnicoAsignado + "\n" +
            "Tipo de Servicio: " + tipoServicio + "\n" +
            "Tamaño del Jardín: " + tamanoJardin + "\n" +
            "Plantas Adicionales: " + plantasAdicionales + "\n" +
            "Confirmación del Técnico: " + (confirmacionTecnico ? "Sí" : "No") + "\n" +
            "Precio Base: " + precioBase + "\n" +
            "Precio Plantas Adicionales: " + precioPlantasAdicionales + "\n" +
            "Precio Total: " + precioTotal;
    }
}