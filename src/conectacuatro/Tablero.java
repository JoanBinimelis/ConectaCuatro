/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectacuatro;


public class Tablero {
        
        int columnas;
        int filas;
        Ficha[][] tablero ;
        int torn = 1;
        
        
    public Tablero(int filas, int columnas){
        this.columnas = columnas;
        this.filas = filas;
        tablero = new Ficha[filas][columnas];
    
    }
    
    public void pintaTablero(Jugador jugador1, Jugador jugador2){
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] != null && torn % 2 != 0){
                    System.out.print("[ " + jugador1.getColor() + " ]");
                }else if (tablero[i][j] != null && torn % 2 == 0){
                    System.out.print("[ " + jugador2.getColor() + " ]");
                }else{
                System.out.print("[ 0 ]");
                }
            }
        }
        System.out.println();
        System.out.println();
    }
    
    public boolean compruebaLlena(int columna){
        return tablero[0][columna] != null;           
    }
    
    public void colocaFicha(int columna, Tablero T, Jugador jugador1, Jugador jugador2){   
            if (!compruebaLlena(columna)){
                for (int i = filas-1; i >= 0; i--) {
                    if (tablero[i][columna] == null){
                        tablero[i][columna] = new Ficha();
                        break;
                    }   
                }
                T.pintaTablero(jugador1, jugador2);
            }else{
                System.out.println("Error");
            }
    }
    
    public void comprobarCuatro(int columna){
        
    }
}
