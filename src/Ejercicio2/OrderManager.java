package Ejercicio2;
import java.util.Scanner;
public class OrderManager {
    //Clase responsable de la gestión de pedidos: Creación, actualización, eliminación de pedidos de los usuarios
    private String nombre;
    private String apellido;
    private int numeroTelefono;
    private String direccion;

    public OrderManager(String nombre, String apellido, int numeroTelefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
    }
    //Métodos para crear, actualizar y eliminar pedidos
    public String crearPedido(String nombre, String apellido, int numeroTelefono, String direccion){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombrePedido = sc.nextLine();
        System.out.println("Ingresa tu apellido");
        String apellidoPedido = sc.nextLine();
        System.out.println("Ingresa tu número de teléfono");
        int numeroTelefonoPedido = sc.nextInt();
        System.out.println("Ingresa tu dirección");
        String direccionPedido = sc.nextLine();
        OrderManager pedido = new OrderManager(nombrePedido, apellidoPedido, numeroTelefonoPedido, direccionPedido);
        return "Pedido creado";
    }
    public void actualizarPedido(int id, String nombre, String apellido, int numeroTelefono, String direccion){
        OrderManager pedido = new OrderManager(nombre, apellido, numeroTelefono, direccion);
    }
    public void eliminarPedido(int id){

    }

}
