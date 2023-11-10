/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaPrograma;

import java.util.ArrayList;

/**
 *
 * @author jemsw
 */
public class Portero extends Jugador{
    public Portero(String nombre, String identificacion, int edad) {
        super(nombre, "Portero", identificacion, edad);
    }
    @Override
    public void agregarJugador(Jugador jugador){}
    
    @Override
    public void modificarJugador(String identificacion, String nuevoNombre,String nuevaIdentificacion){}
    
    @Override
    public void eliminarJugador(String identificacion, String identi){}
    
     @Override
    public void mostrar() {
        for (Jugador juga: jugadores) {
            System.out.println("Nombre: " + juga.Nombre);
            System.out.println("Posición: " + juga.Posicion);
            System.out.println("Identificación: " + juga.Identificacion);
            System.out.println("Edad: " + juga.Edad);
        }
    }
    public ArrayList<Portero> porteroList= new ArrayList<>();
}
