/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author aberr
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear el cliente
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();

        //Utilizar metodos
        //1.- Login
        if (cliente.login("Andres", "Andres2025")) {
            System.out.println("Credenciales correctas");
        } else {
            System.out.println("Credenciales incorrectas");
        }
        
        //2.- Procesar pago
        System.out.println(cliente.procesarPago(5000, 20000));
    }

}
