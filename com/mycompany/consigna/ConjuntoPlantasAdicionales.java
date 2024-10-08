package com.mycompany.consigna;

public class ConjuntoPlantasAdicionales {
    private int cantidad;
    private PlantasAdicionales plantas_adicionales;
    
    // Constructor
    public ConjuntoPlantasAdicionales(int cantidad, PlantasAdicionales plantas_adicionales) {
        this.cantidad = cantidad;
        this.plantas_adicionales = plantas_adicionales;
    }
    
    // Método para calcular el precio por rubro
    public double calcular_precio_rubro() {
        return this.getCantidad() * this.getPlantas_adicionales().getCosto();
    }

    // Getter para cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Setter para cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Getter para plantas_adicionales
    public PlantasAdicionales getPlantas_adicionales() {
        return plantas_adicionales;
    }

    // Setter para plantas_adicionales
    public void setPlantas_adicionales(PlantasAdicionales plantas_adicionales) {
        this.plantas_adicionales = plantas_adicionales;
    }

    // Método para obtener el tipo de planta (nuevo método)
    public PlantasAdicionales getTipoPlanta() {
        return plantas_adicionales;
    }
}
