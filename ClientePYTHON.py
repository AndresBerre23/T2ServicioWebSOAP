from zeep import Client

#Crear el cliente
cliente = Client('http://localhost:8080/ServicioWeb_SOAP/WSOperaciones?WSDL')
print(' ')
print(' Operaciones')
#1 Login
if cliente.service.Login('Andres', 'Andres2025'):
    print('credenciales correctas')
else:
    print('Credenciales incorrectas')

#2 Procesar pago
if cliente.service.ProcesarPago(5000, 9000)>=0:
    print('Pago realizado')
else:
    print('Dinero insuficiente')

# =================================================================================================
print(' ')
print(' Receta')

    # Cliente para WSReceta
cliente_receta = Client('http://localhost:8080/ServicioWeb_SOAP/WSReceta?WSDL')
# Buscar receta
resultado = cliente_receta.service.buscarReceta("Panqueques")
print(resultado)

# Listar ingredientes
ingredientes = cliente_receta.service.listarIngredientes("Panqueques")
print("Ingredientes:")
for ingrediente in ingredientes:
    print("-", ingrediente)

# =========================================================================================================
print(' ')
print(' Inventario')
# Cliente para WSInventario
cliente_inventario = Client('http://localhost:8080/ServicioWeb_SOAP/WSInventario?WSDL')


# Consultar producto
resultado_consulta = cliente_inventario.service.consultarProducto("Monitor")
print(resultado_consulta)

# Calcular total
total = cliente_inventario.service.calcularTotal(cantidad=3, precioUnitario=125.50)
print(f"Total a pagar: ${total}")

