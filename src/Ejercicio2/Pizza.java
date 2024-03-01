package Ejercicio2;
import java.util.List;
import java.util.ArrayList;
public class Pizza {
    private static String nombre;
    private static String masa;
    // Crear lista de toppings
    private static List<String>toppings = new ArrayList();

    public Pizza(String masa, String nombre){
        this.masa = masa;
        this.nombre = nombre;
        this.toppings = new ArrayList();
    }
    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMasa() {
        return masa;
    }
    public void setMasa(String masa) {
        this.masa = masa;
    }
    public List<String> getToppings() {
        return toppings;
    }
    public void setToppings(List<String> toppings) {
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }
    public void removeTopping(String topping){
        toppings.remove(topping);
    }
    public static void printToppings(){
        for (String topping : toppings){
            System.out.println(topping);
        }
    }
    public static String pizzasTotalesDelPedido(){
        System.out.println("Pizzas del pedido:"+ nombre);
        for (String pizza : toppings){
            System.out.println(pizza);
        }
        return nombre;
    }





    }



