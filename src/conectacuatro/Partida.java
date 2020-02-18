/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectacuatro;

import java.util.Scanner;

public class Partida {
    
    Tablero tablero;
    Ficha vermella;
    Ficha groga;
    int torn = 1;
    Scanner sc = new Scanner(System.in);
    
    public Partida(){
        
    }
    
    public void seleccionaFicha(Jugador jugador1, Jugador jugador2){
        
        System.out.print("Jugador 1, introduce tu nombre: ");
        
        jugador1.setNom(sc.nextLine());
        
        System.out.println("Hola " + jugador1.getNom());
        
        System.out.println("Jugador 2, introduce tu nombre: ");
        
        jugador2.setNom(sc.nextLine());
        
        System.out.println("Hola " + jugador2.getNom());
    }
    
    public int seleccionaColumna (Jugador jugador1, Jugador jugador2){
        int columna;
        if (torn % 2 != 0){
            System.out.println(jugador1.getNom() + ", Selecciona una columna: " );
            columna = sc.nextInt();
        } else {
            System.out.println(jugador2.getNom() + ", Selecciona una columna: " );    
            columna = sc.nextInt();
        }
        torn++;
        return columna;
    }
    
//    public void jugada(){
//        
//    }
    
}
