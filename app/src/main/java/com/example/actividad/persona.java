package com.example.actividad;

public class persona {
    private String nombre;
    private int edad;

    // Constructor
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para asignar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método para asignar la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
