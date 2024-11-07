

package com.mycompany.consigna;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private int idCliente;
    private String nombreCliente;
    private String descripcion;
    private double tamanioJardin;
    private String fecha;
    private double total;
    private List<ConjuntoPlantasAdicionales> plantasAdicionales;
    private List<Servicios> servicios;

    // Constructor actualizado para incluir el nombre del cliente
    public Factura(int idCliente, String nombreCliente, String descripcion, double tamanioJardin, String fecha, double total) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.tamanioJardin = tamanioJardin;
        this.fecha = fecha;
        this.total = total;
        this.plantasAdicionales = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public Factura() {
    }

    // Método para añadir plantas adicionales
    public void setConjunto_plantas_adicionales(ConjuntoPlantasAdicionales item) {
        this.plantasAdicionales.add(item);
    }

    public void agregarServicio(Servicios servicio) {
        this.servicios.add(servicio);
    }

    // Método para generar el detalle de la factura
    public String generar_detalle() {
        StringBuilder detalle = new StringBuilder();
        detalle.append("Factura\n");
        detalle.append("Cliente: ").append(nombreCliente).append("\n");  // Muestra el nombre del cliente
        detalle.append("Fecha: ").append(fecha).append("\n");
        detalle.append("Descripción: ").append(descripcion).append("\n");
        detalle.append("Tamaño del jardín: ").append(tamanioJardin).append(" m²\n");
        detalle.append("Total: $").append(total).append("\n");
        detalle.append("Servicios:\n");

        for (Servicios servicio : servicios) {
            detalle.append(servicio.mostrarDetalles()).append("\n");
        }

        detalle.append("Plantas Adicionales:\n");

        for (ConjuntoPlantasAdicionales planta : plantasAdicionales) {
            detalle.append(planta.getCantidad()).append(" x ").append(planta.getTipoPlanta()).append("\n");
        }
        
        return detalle.toString();
    }

    public List<ConjuntoPlantasAdicionales> getPlantasAdicionales() {
        return plantasAdicionales;
    }

    public void setPlantasAdicionales(List<ConjuntoPlantasAdicionales> plantasAdicionales) {
        this.plantasAdicionales = plantasAdicionales;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }

}
