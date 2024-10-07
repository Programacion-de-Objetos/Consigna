/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consigna;

/**
 *
 * @author ester
 */
public enum PlantasAdicionales {
    MARGARITAS("Margaritas", 1500),
    ALOE("Aloe", 3000),
    PALMERAS("Hatchback",4000),
    HELECHOS("Helechos",2500),
    TREPADORAS("Trepadoras",4000),
    BROMELIAS("Bromelias",6000),
    DRACENA("Drácena",3000),
    TRONCOBRASIL("Tronco de Brasil",1000);

    private String nombre;
    private float costo;

    PlantasAdicionales(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
}
}
