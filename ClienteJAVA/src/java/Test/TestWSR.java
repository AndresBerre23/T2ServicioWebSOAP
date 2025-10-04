/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.List;
import ws.WSReceta;
import ws.WSReceta_Service;

/**
 *
 * @author aberr
 */
public class TestWSR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WSReceta_Service servicio = new WSReceta_Service();
        WSReceta cliente = servicio.getWSRecetaPort();

        // Buscar receta
        String resultado = cliente.buscarReceta("Panqueques");
        System.out.println(resultado);

        // Listar ingredientes
        List<String> ingredientes = cliente.listarIngredientes("Panqueques");
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }

    }
    
}
