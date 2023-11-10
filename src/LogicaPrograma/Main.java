/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaPrograma;

import static LogicaPrograma.Jugador.jugadores;
import java.util.Iterator;

/**
 *
 * @author jemsw
 */
public class Main extends Jugador{
       public Main(String nombre, String identificacion, int edad) {
        super(nombre, "ninguna",identificacion,  edad);
    }
     public Main(String nombre,String posicion, String identificacion, int edad) {
        super(nombre, posicion,identificacion,  edad);
    }   
     
    @Override
    public void agregarJugador(Jugador jugador){
    Jugador.jugadores.add(jugador);
    }
    
    @Override
       public void modificarJugador(String identificacion,String nuevoNombre,String nuevaIdentificacion) {
           Jugador.jugadores.get(Jugador.jugadores.size()-1).Nombre=nuevoNombre;
           Jugador.jugadores.get(Jugador.jugadores.size()-1).Identificacion=nuevaIdentificacion; 
        }
    
    

    @Override
    public void eliminarJugador(String identificacion, String identi) {
        System.out.println("*******Eliminado***********");
        for (int i = 0; i < Jugador.jugadores.size(); i++) {
            Jugador juga = Jugador.jugadores.get(i);
            if (juga.Identificacion.equals(identificacion) || juga.Identificacion.equals(identi)) {
                Jugador.jugadores.remove(i);
                i--;
            }
        }
    }

    
     @Override
    public void mostrar(){
    for (Jugador juga: jugadores) {
            System.out.println("Nombre: " + juga.Nombre);
            System.out.println("Posición: " + juga.Posicion);
            System.out.println("Identificación: " + juga.Identificacion);
            System.out.println("Edad: " + juga.Edad);
            System.out.println("****************");
        }
    }
    public String mostrarName(){
        String jugador = Jugador.jugadores.get(Jugador.jugadores.size() - 1).Nombre;
        return jugador;
    }
      public String mostrarIdenti(){
        String jugador = Jugador.jugadores.get(Jugador.jugadores.size() - 1).Identificacion;
        return jugador;
    }
    public boolean ConfirmarUsuario(String nombre, String posicion, String identificacion){
        boolean confirm = false;
        for (Jugador juga: jugadores){
            if(juga.Nombre.equals(nombre) && juga.Posicion.equals(posicion) && juga.Identificacion.equals(identificacion)){
                confirm= true;
            }
        }
      System.out.println(confirm);
      return confirm;
    }
    
}