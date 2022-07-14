/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author amarmol
 */
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private double altura;

    public Usuario(int id, String nombre, String apellido, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public String toString(){
        return "Usuario "+nombre+" "+apellido+" de id "+id+" y altura"+altura+".";
    }
}
