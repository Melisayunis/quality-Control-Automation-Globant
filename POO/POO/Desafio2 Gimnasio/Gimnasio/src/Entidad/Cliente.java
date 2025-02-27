/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Crea una clase de entidad llamada "Cliente" con los siguientes atributos: 
 id, nombre, edad, altura, peso, objetivo (cadena de caracteres)
 */
public class Cliente {
    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, double altura, double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", objetivo=" + objetivo + '}';
    }

}
