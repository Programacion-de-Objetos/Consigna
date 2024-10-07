/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consigna;

/**
 *
 * @author ester
 */
public class ConjuntoPlantasAdicionales {
    private int cantidad;
    private PlantasAdicionales plantas_adicionales;
    
    public ConjuntoPlantasAdicionales(int cantidad, PlantasAdicionales plantas_adicionales){
    this.cantidad = cantidad;
    this.plantas_adicionales = plantas_adicionales;
    }
    
    public double calcular_precio_rubro(){
    return this.getCantidad() * this.getPlantas_adicionales().getCosto();
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the plantas_adicionales
     */
    public PlantasAdicionales getPlantas_adicionales() {
        return plantas_adicionales;
    }

    /**
     * @param plantas_adicionales the plantas_adicionales to set
     */
    public void setPlantas_adicionales(PlantasAdicionales plantas_adicionales) {
        this.plantas_adicionales = plantas_adicionales;
}
}
