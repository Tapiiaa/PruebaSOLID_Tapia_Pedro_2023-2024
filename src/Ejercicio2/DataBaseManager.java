
package Ejercicio2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DataBaseManager {
    static List<OrderManager> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu contraseña");
        String contraseña = sc.nextLine();
        Authenticator autenticador = new Authenticator(nombre, contraseña);
        System.out.println("Autenticando...");
        while (true) {
            System.out.println("1. Crear Pedido");
            System.out.println("2. Actualizar Pedido");
            System.out.println("3. Eliminar Pedido");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: // Crear Pedido
                    System.out.println("Ingresa el ID:");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.println("Nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Apellido:");
                    String apellido = sc.nextLine();
                    System.out.println("Número de teléfono:");
                    int telefono = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.println("Dirección:");
                    String direccion = sc.nextLine();

                    OrderManager nuevoPedido = new OrderManager(id, nombre, apellido, telefono, direccion);
                    pedidos.add(nuevoPedido);
                    System.out.println("Pedido creado:" + nuevoPedido.getid());
                    break;

                case 2:
                    if (pedidos.size() == 0) {
                        System.out.println("No hay pedidos para actualizar");
                        break;
                    } else {
                        System.out.println("Ingresa el id del pedido");
                        int idPedido = sc.nextInt();
                        System.out.println("Ingresa tu nombre");
                        nombre = sc.nextLine();
                        System.out.println("");
                        System.out.println("Ingresa tu apellido");
                        apellido = sc.nextLine();
                        System.out.println("");
                        System.out.println("Ingresa tu número de teléfono");
                        telefono = sc.nextInt();
                        System.out.println("");
                        System.out.println("Direccion");
                        direccion = sc.nextLine();

                        OrderManager pedido2 = new OrderManager(idPedido, nombre, apellido, telefono, direccion);
                        System.out.println("Pedido actualizado");// Actualizar Pedido
                    }
                    break;


                case 3: // Eliminar Pedido
                    if (pedidos.isEmpty()) {
                        System.out.println("No hay pedidos para eliminar.");
                    } else {
                        System.out.print("Ingrese el ID del pedido a eliminar: ");
                        int idEliminar = sc.nextInt();
                        boolean encontrado = false;
                        for (OrderManager pedido : pedidos) {
                            if (pedido.getid() == idEliminar) {
                                pedidos.remove(pedido);
                                encontrado = true;
                                System.out.println("Pedido encontrado.");
                                System.out.println("");
                                System.out.println("Escribe SI para confirmar la eliminación.");
                                String confirmacion = sc.next();
                                if (confirmacion.equals("SI")) {
                                    pedidos.remove(pedido);
                                    System.out.println("Pedido eliminado.");
                                } else {
                                    System.out.println("Eliminación cancelada.");
                                }
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("El id no coincide con ningún pedido");
                        }
                    }
                    break;
            }if(opcion == 4){
                System.out.println("Saliendo...");
                break;
            }






        }

    }
}





