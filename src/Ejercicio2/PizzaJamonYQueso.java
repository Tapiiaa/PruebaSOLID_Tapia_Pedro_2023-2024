package Ejercicio2;

public class PizzaJamonYQueso extends Pizza{
    public PizzaJamonYQueso(String masa, String nombre){
        super(masa, nombre);
    }
    public void addTopping(String topping){
        if (topping.equals("jamon") || topping.equals("queso")){
            super.addTopping(topping);
        }
    }
    public void printPizza(){
        System.out.println("Pizza: " + getNombre());
        System.out.println("Masa: " + getMasa());
        System.out.println("Toppings: ");
        printToppings();
    }
}
