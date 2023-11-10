/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaPrograma;

import java.util.ArrayList;
import java.util.Iterator;
import LogicaPrograma.*;
/**
 *
 * @author jemsw
 */
public abstract class Jugador {
    String Nombre,Posicion;
    String Identificacion;
    int Edad;
    public static ArrayList<Jugador> jugadores= new ArrayList<>();
    
    public Jugador(String nombre,String posicion, String identificacion,int edad) {
        this.Nombre= nombre;
        this.Posicion= posicion;
        this.Identificacion=identificacion;
        this.Edad=edad;
        jugadores.add(this);
    }
    
    public abstract void agregarJugador(Jugador jugador);
    public abstract void modificarJugador(String identificacion,String nuevoNombre,String nuevaIdentificacion);
    
    public abstract void eliminarJugador(String identificacion,String identi);
    public abstract void mostrar();
    
       public String getNombre() {
        return this.Nombre;
    }

    public String getPosicion() {
        return this.Posicion;
    }

    public String getIdentificacion() {
        return this.Identificacion;
    }

    public int getEdad() {
        return this.Edad;
    }
}