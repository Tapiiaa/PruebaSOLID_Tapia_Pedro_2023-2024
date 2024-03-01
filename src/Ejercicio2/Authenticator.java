package Ejercicio2;

public class Authenticator {
    // Clase responsable de la autenticación de usuarios

    private String nombre;
    private String contraseña;

    public Authenticator(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public boolean autenticar(String nombre, String contraseña) {
        return this.nombre.equals(nombre) && this.contraseña.equals(contraseña);
    }


}