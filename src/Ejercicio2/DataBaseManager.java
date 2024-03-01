package Ejercicio2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DataBaseManager {
    // Clase responsable de la gestión de la base de datos y de operaciones CRUD
    //Lista para almacenar el número de pedidos, siempre que se cree un pedido se añadira a la lista

    private static List<OrderManager> pedidos = new ArrayList<OrderManager>();


    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu contraseña");
        String contraseña = sc.nextLine();
        Authenticator autenticador = new Authenticator(nombre, contraseña);
        System.out.println("Autenticando...");
        System.out.println("1. Crear Pedido");
        System.out.println("2. Actualizar Pedido");
        System.out.println("3. Eliminar Pedido");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                //Creación del pedido

                //Cuando el pedido está creado, se añade a la lista y se muestra un panel para que indique el método de pago
    System.out.println("Ingresa tu id");
    int id = sc.nextInt();
    System.out.println("Ingresa tu nombre");
    String nombrePago = sc.nextLine();
    System.out.println("Ingresa tu apellido");
    String apellidoPago = sc.nextLine();
    System.out.println("Ingresa el concepto");
    String concepto = sc.nextLine();
    System.out.println("Ingresa el importe");
    int importe = sc.nextInt();
    PaymentProcessor pago = new PaymentProcessor(id, nombrePago, apellidoPago, concepto, importe);
    System.out.println("Pedido creado");
                break;

            case 2:
                // Si no hay pedidos, no se puede actualizar
                if(pedidos.size() == 0){
                    System.out.println("No hay pedidos para actualizar");
                    break;
                }
                else {
                    System.out.println("Ingresa el id del pedido");

                    System.out.println("Ingresa tu nombre");
                    String nombrePedido2 = sc.nextLine();
                    System.out.println("Ingresa tu apellido");
                    String apellidoPedido2 = sc.nextLine();
                    System.out.println("Ingresa tu número de teléfono");
                    int numeroTelefono2 = sc.nextInt();
                    System.out.println("Ingresa tu dirección");
                    String direccion2 = sc.nextLine();
                    OrderManager pedido2 = new OrderManager(nombrePedido2, apellidoPedido2, numeroTelefono2, direccion2);
                    System.out.println("Pedido actualizado");
                }
                break;
            case 3:
                System.out.println("Ingresa el id del pedido");
                int id2 = sc.nextInt();
                System.out.println("Pedido eliminado");
                break;

        }
    }
}
