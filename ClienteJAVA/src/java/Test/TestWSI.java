/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ws.WSInventario;
import ws.WSInventario_Service;

/**
 *
 * @author aberr
 */
public class TestWSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear el cliente
        WSInventario_Service servicio = new WSInventario_Service();
        WSInventario cliente = servicio.getWSInventarioPort();

        //Utilizar metodos
        // Consultar producto
        String resultadoConsulta = cliente.consultarProducto("Monitor");
        System.out.println(resultadoConsulta);

        // Calcular total
        double total = cliente.calcularTotal(3, 125.50);
        System.out.println("Total a pagar: $" + total);

    }
    
}
