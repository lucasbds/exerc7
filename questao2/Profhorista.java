/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author ifnmg
 */
public class Profhorista {
  
    private double salHora;
    private int horas;
    
    void setSalH(double sh){ this.salHora=sh;}
    double getSalH(){ return this.salHora;}

    void setHoras(int h){ this.horas=h;}
    int getHoras(){ return this.horas;}

    double calSal(){
        
        return this.horas*this.salHora;
    }
    
}


