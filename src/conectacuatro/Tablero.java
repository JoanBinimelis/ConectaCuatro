/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectacuatro;


public class Tablero {
        int columnas;
        int filas;
        
    public Tablero(int filas, int columnas){
        this.columnas = columnas;
        this.filas = filas;
        Ficha[][] tablero = new Ficha[filas][columnas];
    }
    
    public void pintaTablero(){
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j++) {
                System.out.print("[ 0 ]");
            }
        }
        System.out.println();
        System.out.println();
    }
    
    public static boolean compruebaLlena(int columna, Ficha[][] tablero){
        return tablero[0][columna] != null;
    }
    
    public static void colocaFicha(int columna, Ficha[][] tablero){
        while (!compruebaLlena(columna, tablero)){
            
        }
    }
}
