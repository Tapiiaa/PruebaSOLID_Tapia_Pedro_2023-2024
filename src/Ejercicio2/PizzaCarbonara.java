package Ejercicio2;

public class PizzaCarbonara extends Pizza{
    public PizzaCarbonara(String masa, String nombre){
        super(masa, nombre);
    }
    public void addTopping(String topping){
        if (topping.equals("bacon") || topping.equals("huevo")){
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
