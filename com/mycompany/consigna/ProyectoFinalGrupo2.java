package com.mycompany.consigna;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ProyectoFinalGrupo2 {

    public static void main(String[] args) {
        
        // Solicitar el ID del cliente
        int idCliente;
        try {
            idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del cliente:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID ingresado no es válido. Saliendo...");
            return;
        }

        // Solicitar el nombre del cliente
        String nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:");
        if (nombreCliente == null || nombreCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó un nombre de cliente. Saliendo...");
            return;
        }

        // Solicitar la descripción de la factura
        String desc = JOptionPane.showInputDialog(null, "Ingrese la descripción de la factura:");
        if (desc == null || desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó ninguna descripción. Saliendo...");
            return;
        }

        // Solicitar el tamaño del jardín
        double tamanioJardin;
        try {
            tamanioJardin = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tamaño del jardín en metros cuadrados:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El tamaño del jardín ingresado no es válido. Saliendo...");
            return;
        }

        // Obtener la fecha actual o solicitar una fecha
        String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha (dd/MM/yyyy):");
        if (fecha == null || fecha.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fecha = sdf.format(new Date());
        }

        // Solicitar el total
        double total;
        try {
            total = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el total de la factura:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El total ingresado no es válido. Saliendo...");
            return;
        }

        // Crear la factura con los datos ingresados
        var factura = new Factura(idCliente, nombreCliente, desc, tamanioJardin, fecha, total);
        
        // Pedir la cantidad y tipo de planta adicional
        int cantidad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Margaritas:"));
        ConjuntoPlantasAdicionales item1 = new ConjuntoPlantasAdicionales(cantidad1, PlantasAdicionales.MARGARITAS);
        
        int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Aloe:"));
        ConjuntoPlantasAdicionales item2 = new ConjuntoPlantasAdicionales(cantidad2, PlantasAdicionales.ALOE);
        
        // Añadir plantas a la factura
        factura.setConjunto_plantas_adicionales(item1);
        factura.setConjunto_plantas_adicionales(item2);
        
        // Generar el detalle de la factura
        String detalleFactura = factura.generar_detalle();
        
        // Mostrar la factura en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, detalleFactura, "Factura", JOptionPane.INFORMATION_MESSAGE);
    }
}
