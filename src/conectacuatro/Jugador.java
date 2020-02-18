/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectacuatro;


public class Jugador {
    
    String nom;
    char color;
    int torn;
    
    public Jugador(String nom, char color){
        this.nom = nom;
        this.color = color;
    }
        public Jugador( char color){
        this.color = color;
    }
    
    public Jugador(int torn){
        this.torn = torn;
    }

    public int getTorn() {
        return torn;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setTorn(int torn) {
        this.torn = torn;
    }

    public char getColor() {
        return color;
    }
    
    
    
}
