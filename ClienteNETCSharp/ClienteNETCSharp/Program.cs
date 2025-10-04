using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClienteNETCSharp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Crear clientes
            ServicioWebSOAPOperaciones.WSOperacionesClient clienteOperaciones = new ServicioWebSOAPOperaciones.WSOperacionesClient();
            ServicioWebSOAPReceta.WSRecetaClient clienteReceta = new ServicioWebSOAPReceta.WSRecetaClient();
            ServicioWebSOAPInventario.WSInventarioClient clienteInventario = new ServicioWebSOAPInventario.WSInventarioClient();

            //utilizar metodos

            Console.WriteLine("\n Operaciones");

            // 1. Login
            if (clienteOperaciones.Login("Andres", "Andres2025"))
                Console.WriteLine("Credenciales correctas");
            else
                Console.WriteLine("Credenciales incorrectas");

            // 2. Procesar pago
            int resultadoPago = clienteOperaciones.ProcesarPago(5000, 9000);
            if (resultadoPago >= 0)
                Console.WriteLine("Pago realizado");
            else
                Console.WriteLine("Dinero insuficiente");
            clienteOperaciones.Close();


            // =================================================================================================
            Console.WriteLine("\n Receta");

            // Buscar receta
            string resultadoReceta = clienteReceta.buscarReceta("Panqueques");
            Console.WriteLine(resultadoReceta);

            // Listar ingredientes
            string[] ingredientes = clienteReceta.listarIngredientes("Panqueques");
            Console.WriteLine("Ingredientes:");
            foreach (string ingrediente in ingredientes)
            {
                Console.WriteLine("- " + ingrediente);
            }
            clienteReceta.Close();

            // =================================================================================================
            Console.WriteLine("\n Inventario");

            // Consultar producto
            string resultadoConsulta = clienteInventario.consultarProducto("Monitor");
            Console.WriteLine(resultadoConsulta);

            // Calcular total
            double total = clienteInventario.calcularTotal(3, 125.50);
            Console.WriteLine($"Total a pagar: ${total:F2}");

            clienteInventario.Close();
            Console.ReadKey();
        }
    }
}
