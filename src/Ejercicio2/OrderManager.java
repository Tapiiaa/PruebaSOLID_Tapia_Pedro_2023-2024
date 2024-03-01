package Ejercicio2;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
public class OrderManager {
    //Clase responsable de la gestión de pedidos: Creación, actualización, eliminación de pedidos de los usuarios
    private String nombre;
    private String apellido;
    private int numeroTelefono;
    private String direccion;
    private int id;
    private ArrayList<Pizza> pizzas;


    public OrderManager(int id,String nombre, String apellido, int numeroTelefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.id = id;
        this.pizzas= new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getid() {
        return this.id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setid(int id) {
        this.id = id;
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
        OrderManager pedido = new OrderManager(id, nombrePedido, apellidoPedido, numeroTelefonoPedido, direccionPedido);
        return "Pedido creado";
    }
    public void actualizarPedido(int id, String nombre, String apellido, int numeroTelefono, String direccion){
        OrderManager pedido = new OrderManager(id, nombre, apellido, numeroTelefono, direccion);
    }
    public static void eliminarPedido(int id){
        // Implementamos el método para eliminar un pedido que esté almacenado en la lista
        Scanner sc = new Scanner(System.in);
        List<OrderManager> pedidos = new ArrayList<OrderManager>();
        if(pedidos.size() == 0){
            System.out.println("No hay pedidos para eliminar");
        }
        else {
            System.out.println("Ingresa el id del pedido");
            int idPedido = sc.nextInt();
            pedidos.removeIf(pedido -> pedido.getid() == idPedido);
        }


    }
    public void addPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }
    public ArrayList<Pizza> getPizzas(){
        return pizzas;
    }

}
