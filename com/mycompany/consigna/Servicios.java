/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consigna;

/**
 *
 * @author ester
 */
public class Servicios {

    // Atributos de la clase Servicios
    private int id_servicio;
    private String nombre_servicio;
    private String descripcion;
    private double precio_base;
    private int duracion_estimada;
    private String estado;

    // Método constructor por defecto
    public Servicios() {
        this.id_servicio = 0;
        this.nombre_servicio = "";
        this.descripcion = "";
        this.precio_base = 0.0;
        this.duracion_estimada = 0;
        this.estado = "";
    }

    // Método constructor sobrecargado
    public Servicios(int id_servicio, String nombre_servicio, String descripcion, double precio_base, int duracion_estimada, String estado) {
        this.id_servicio = id_servicio;
        this.nombre_servicio = nombre_servicio;
        this.descripcion = descripcion;
        this.precio_base = precio_base;
        this.duracion_estimada = duracion_estimada;
        this.estado = estado;
    }

    // Métodos accesores (getters) y mutadores (setters)
    // Getter y Setter para id_servicio
    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    // Getter y Setter para nombre_servicio
    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    // Getter y Setter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter y Setter para precio_base
    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    // Getter y Setter para duracion_estimada
    public int getDuracion_estimada() {
        return duracion_estimada;
    }

    public void setDuracion_estimada(int duracion_estimada) {
        this.duracion_estimada = duracion_estimada;
    }

    // Getter y Setter para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Detalles del servicio

    public String mostrarDetalles() {
        return "Servicio: " + nombre_servicio + "\nDescripción: " + descripcion + "\nPrecio base: $" + precio_base + "\nDuración estimada: " + duracion_estimada + " minutos\nEstado: " + estado;
    }
}

