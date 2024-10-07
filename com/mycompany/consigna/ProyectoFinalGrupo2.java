/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consigna;

/**
 *
 * @author ester
 */
import java.util.Scanner;

public class ProyectoFinalGrupo2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        String desc = s.nextLine();
        
        int id_cliente = 123;
        
        Factura factura = new Factura(id_cliente, desc, 20.5);
        
        ConjuntoPlantasAdicionales item1 = new ConjuntoPlantasAdicionales(3,PlantasAdicionales.MARGARITAS);
        ConjuntoPlantasAdicionales item2 = new ConjuntoPlantasAdicionales(2,PlantasAdicionales.ALOE);
        
        System.out.println();
        
        factura.setConjunto_plantas_adicionales(item1);
        factura.setConjunto_plantas_adicionales(item2);
        
        System.out.println(factura.generar_detalle());
}
}