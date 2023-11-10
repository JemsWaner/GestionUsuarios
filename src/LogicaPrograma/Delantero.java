/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaPrograma;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jemsw
 */
public class Delantero extends Jugador {
    
    public Delantero(String nombre, String identificacion, int edad) {
        super(nombre, "Delantero", identificacion, edad);
    }
    
//    public ArrayList<Delantero> delanteroList= new ArrayList<>();
    
    @Override
    public void agregarJugador(Jugador jugador) {
        Delantero.delanteros.add((Delantero) jugador);
    }

    @Override
    public void modificarJugador(String identificacion,String nuevoNombre,String nuevaIdentificacion) {
        for (Jugador juga : jugadores) {
            if (juga.Identificacion.equals(identificacion)) {
                juga.Nombre = nuevoNombre;
                juga.Identificacion=nuevaIdentificacion;
            }
        }
    }

    @Override
    public void eliminarJugador(String identificacion, String identi) {
        Iterator<Delantero> iter = Delantero.delanteros.iterator();
        while (iter.hasNext()) {
            Delantero delantero = iter.next();
            if (delantero.Identificacion.equals(identificacion)) {
                iter.remove();
            }
        }
    }

    public void listarJugadores() {
        for (Delantero delantero : Delantero.delanteros) {
            System.out.println("Nombre: " + delantero.Nombre);
            System.out.println("Posición: " + delantero.Posicion);
            System.out.println("Identificación: " + delantero.Identificacion);
            System.out.println("Edad: " + delantero.Edad);
        }
    }
    
    @Override
    public void mostrar() {
        for (Jugador juga: jugadores) {
            System.out.println("Nombre: " + juga.Nombre);
            System.out.println("Posición: " + juga.Posicion);
            System.out.println("Identificación: " + juga.Identificacion);
            System.out.println("Edad: " + juga.Edad);
        }
    }

    // Lista de delanteros
    static ArrayList<Delantero> delanteros = new ArrayList<>();
}