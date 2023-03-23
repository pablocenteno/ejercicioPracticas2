package org.example;

public class Persona {
    private String nombre;
    private Direccion direccion;

    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + this.nombre + " y vivo en " + this.direccion.obtenerDireccion());
    }
}
