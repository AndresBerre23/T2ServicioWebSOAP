<?php
// Crear clientes SOAP
$clienteOperaciones = new SoapClient('http://localhost:8080/ServicioWeb_SOAP/WSOperaciones?wsdl');
$clienteInventario  = new SoapClient('http://localhost:8080/ServicioWeb_SOAP/WSInventario?wsdl');
$clienteRecetas     = new SoapClient('http://localhost:8080/ServicioWeb_SOAP/WSReceta?wsdl');

// ======================= OPERACIONES =======================
echo "<h2>Operaciones</h2>";
$resultado_pago = $clienteOperaciones->ProcesarPago([
    "total" => 1000,
    "pago" => 5000
])->return;

if ($resultado_pago >= 0) {
    echo "Pago realizado, su vuelto es $resultado_pago<br>";
} else {
    echo "Dinero insuficiente<br>";
}

// ======================= RECETAS =======================
echo "<h2>Receta</h2>";
$receta = "Panqueques";

// Buscar receta
try {
    $resultado_receta = $clienteRecetas->buscarReceta(["nombre" => $receta])->return;
    echo "Resultado de búsqueda: $resultado_receta<br>";

    // Listar ingredientes
    $ingredientes = $clienteRecetas->listarIngredientes(["receta" => $receta])->return;
    echo "Ingredientes:<br><ul>";
    foreach ($ingredientes as $ingrediente) {
        echo "<li>$ingrediente</li>";
    }
    echo "</ul>";
} catch (SoapFault $e) {
    echo "Error al consultar receta: " . $e->getMessage() . "<br>";
}

// ======================= INVENTARIO =======================
echo "<h2>Inventario</h2>";
$producto = "Monitor";

try {
    // Consultar producto
    $resultado_consulta = $clienteInventario->consultarProducto(["nombre" => $producto])->return;
    echo "Consulta de producto '$producto': $resultado_consulta<br>";

    // Calcular total
    $total = $clienteInventario->calcularTotal([
        "cantidad" => 3,
        "precioUnitario" => 125.50
    ])->return;
    echo "Total a pagar por 3 monitores a \$125.50: \$" . number_format($total, 2) . "<br>";
} catch (SoapFault $e) {
    echo "Error al consultar inventario: " . $e->getMessage() . "<br>";
}
?>