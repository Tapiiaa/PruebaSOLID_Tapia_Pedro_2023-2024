package Ejercicio2;

public class PizzaMargarita extends Pizza{
    public PizzaMargarita(String masa, String nombre){
        super(masa, nombre);
    }
    public void addTopping(String topping){
        if (topping.equals("tomate") || topping.equals("mozzarella")){
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
