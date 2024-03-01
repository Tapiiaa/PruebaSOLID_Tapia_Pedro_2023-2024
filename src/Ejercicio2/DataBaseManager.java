
package Ejercicio2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DataBaseManager {
    static List<OrderManager> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO A PIZZERIA TAPIA");
        System.out.println("--------------------------------");
        System.out.println("Dado al alto número de pedidos, solo podrás realizar un pedido de una pizza por vez.");
        System.out.println("");
        System.out.println("La función id es tu DNI SIN LETRA, por favor, no intercambies tu id a lo largo del curso del pedido, del contrario, se perderá el registro de tu pedido.");
        System.out.println("Por favor, inicia sesión para continuar.");
        System.out.println("");
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
            System.out.println("4. Total del pedido");
            System.out.println("5. Salir");

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
                    // Menú de pizzas
                    System.out.println("Selecciona una pizza:");
                    System.out.println("1. Jamon y Queso");
                    System.out.println("2. Carbonara");
                    System.out.println("3. Margarita");
                    int pizza = sc.nextInt();
                    switch (pizza) {
                        case 1:
                            System.out.println("Pizza Jamon y Queso ");
                            break;
                        case 2:
                            System.out.println("Pizza Carbonara");
                            break;
                        case 3:
                            System.out.println("Pizza Margarita");
                            break;
                    }
                    Pizza pizzaSeleccionada = null;
                        if(pizza == 1){
                            pizzaSeleccionada = new Pizza("Masa", "Jamon y Queso");
                        }
                        else if(pizza == 2){
                            pizzaSeleccionada= new Pizza("Masa", "Carbonara");
                        }
                        else if(pizza == 3){
                            pizzaSeleccionada = new Pizza("Masa", "Margarita");
                        }
                        else{
                            System.out.println("Opción no válida");
                        }
                        if(pizzaSeleccionada != null){
                            OrderManager nuevoPedido = new OrderManager(id, nombre, apellido, telefono, direccion);
                            nuevoPedido.addPizza(pizzaSeleccionada);
                            pedidos.add(nuevoPedido);
                            System.out.println("Pedido creado:" + nuevoPedido.getid());
                        }
                        //Almacenar pizza en pedidos




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
                        case 4: // Total del pedido
                            if (pedidos.isEmpty()) {
                                System.out.println("No hay pedidos para mostrar.");
                            }
                            // Hacer un for para recorrer la lista de pedidos y mostrar el total de cada uno
                            else {
                                for (OrderManager pedido : pedidos) {
                                    System.out.println("ID: " + pedido.getid());
                                    System.out.println("Nombre: " + pedido.getNombre());
                                    System.out.println("Apellido: " + pedido.getApellido());
                                    System.out.println("Número de teléfono: " + pedido.getNumeroTelefono());
                                    System.out.println("Dirección: " + pedido.getDireccion());
                                    System.out.println("Pizzas:"+ Pizza.pizzasTotalesDelPedido());
                                    System.out.println("");
                                    break;
                                }
                            }
                    }
                    if (opcion == 5) {
                        System.out.println("Saliendo...");
                        break;
                    }


            }

        }
    }






