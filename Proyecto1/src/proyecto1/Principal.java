/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author amarmol
 */
public class Principal {
    
    private int id;
    private String nombre;
    private String apellido;
    private double altura;
    private boolean confirmacion;
    private Scanner lector;

    public Principal() {
        lector = new Scanner(System.in);
    }
    
    public void arrancar(){
        confirmacion = false;

        do{
            System.out.println("Introduzca los datos de su usuario.");

            System.out.println("Introduzca su id : ");
            id = lector.nextInt();
            lector.nextLine();

            System.out.println("Introduzca su nombre : ");
            nombre = lector.nextLine();

            System.out.println("Introduzca su apellido : ");
            apellido = lector.nextLine();

            System.out.println("Introduzca su altura : ");
            altura = lector.nextDouble();
            lector.nextLine();

            Usuario usuario = new Usuario(id, nombre, apellido, altura);
            System.out.println(usuario.toString());
            System.out.println("¿Desea salir del programa? s/tecla");
            
            confirmacion = lector.nextLine().equals("s");
        }
        while(!confirmacion);

    }
    
    
    
}
