/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectacuatro;


public class ConectaCuatro {

    
    public static void main(String[] args) {
        
        
        Jugador jugador1 = new Jugador('V');
        Jugador jugador2 = new Jugador('G');
        Partida P = new Partida();
        Tablero T = new Tablero(6, 7);
        
        
        P.seleccionaFicha(jugador1, jugador2);
        T.pintaTablero(jugador1, jugador2);
        T.colocaFicha(P.seleccionaColumna(jugador1, jugador2), T, jugador1, jugador2);
         
    }
    
    
    
}
