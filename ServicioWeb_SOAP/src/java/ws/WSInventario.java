/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aberr
 */
@WebService(serviceName = "WSInventario")
public class WSInventario {

    /**
     * Consulta si un producto existe en el inventario
     */
    @WebMethod(operationName = "consultarProducto")
    public String consultarProducto(@WebParam(name = "nombre") String nombre) {
        //   productos disponibles
        String[] productos = {"Mouse", "Teclado", "Monitor", "Impresora"};
        for (String producto : productos) {
            if (producto.equalsIgnoreCase(nombre)) {
                return "El producto '" + nombre + "' está disponible.";
            }
        }
        return "El producto '" + nombre + "' no se encuentra en el inventario.";
    }

    /**
     * Calcula el total a pagar por un producto
     */
    @WebMethod(operationName = "calcularTotal")
    public double calcularTotal(@WebParam(name = "cantidad") int cantidad,
                                @WebParam(name = "precioUnitario") double precioUnitario) {
        return cantidad * precioUnitario;
    }
}
