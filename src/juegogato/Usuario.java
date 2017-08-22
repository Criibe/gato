/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogato;

/**
 *
 * @author csb
 */
public class Usuario {
    
   String Ficha;
   
Usuario(String ficha){
    Ficha = ficha;
}

    public String getFicha() {
        return Ficha;
    }

    public void setFicha(String Ficha) {
        this.Ficha = Ficha;
    }
   
    public String VsJugador(){
        
       return "Jugador";
    }
    
    public String VsApp(){
        
        return "App";
    
    }
  
       
   
    
}
