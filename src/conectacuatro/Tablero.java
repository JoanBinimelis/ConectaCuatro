/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectacuatro;


public class Tablero {
        
        int columnas;
        int filas;
        Ficha[][] tablero = new Ficha[filas][columnas];
        int torn = 1;
        
        
    public Tablero(int filas, int columnas, Jugador jugador1, Jugador jugador2){
        this.columnas = columnas;
        this.filas = filas;
    
    }
    
    public void pintaTablero(Jugador jugador1, Jugador jugador2){
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j++) {
                /*if (tablero[i][columnas] != null && torn % 2 != 0){
                    System.out.println("[ " + jugador1.getColor() + " ]");
                }*/
                System.out.print("[ 0 ]");
            }
        }
        System.out.println();
        System.out.println();
    }
    
    public boolean compruebaLlena(int columna){
        return tablero[0][columna] != null;
    }
    
    public void colocaFicha(int columna){
        while (!compruebaLlena(columna)){
            for (int i = filas; i >= 0; i--) {
                if (tablero[i][columna] == null){
                    tablero[i][columna] = new Ficha();
                    break;
                }   
            }
        }
    }
}
