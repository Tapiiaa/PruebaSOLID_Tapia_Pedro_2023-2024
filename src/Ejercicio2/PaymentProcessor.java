package Ejercicio2;

public class PaymentProcessor {
    // Clase responsable de las transacciones de pago

    private int id;
    private String nombre;
    private String apellido;
    private String concepto;
    private int importe;

    public PaymentProcessor(int id, String nombre, String apellido, String concepto, int importe) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.concepto = concepto;
        this.importe = importe;
    }


}

