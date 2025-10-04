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
@WebService(serviceName = "WSReceta")
public class WSReceta {

    /**
     * Verifica si una receta esta disponible
     */
    @WebMethod(operationName = "buscarReceta")
    public String buscarReceta(@WebParam(name = "nombre") String nombre) {
        String[] recetasDisponibles = {"Arroz con pollo", "Ensalada César", "Tortilla de papa", "Panqueques"};
        for (String receta : recetasDisponibles) {
            if (receta.equalsIgnoreCase(nombre)) {
                return "La receta '" + nombre + "' está disponible.";
            }
        }
        return "La receta '" + nombre + "' no se encuentra en el recetario.";
    }

    /**
     * Lista los ingredientes de una receta específica
     */
    @WebMethod(operationName = "listarIngredientes")
    public String[] listarIngredientes(@WebParam(name = "receta") String receta) {
        switch (receta.toLowerCase()) {
            case "arroz con pollo":
                return new String[] {"Arroz", "Pollo", "Cebolla", "Pimiento", "Ajo"};
            case "ensalada césar":
                return new String[] {"Lechuga", "Pollo", "Crutones", "Queso parmesano", "Aderezo César"};
            case "tortilla de papa":
                return new String[] {"Papa", "Huevo", "Cebolla", "Aceite", "Sal"};
            case "panqueques":
                return new String[] {"Harina", "Leche", "Huevo", "Azúcar", "Mantequilla"};
            default:
                return new String[] {"Receta no encontrada"};
        }
    }

}
