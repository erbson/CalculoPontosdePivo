/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.DecimalFormat;

/**
 *
 * @author Erbson
 */
public class CalculaPontosDePivo {
    
    double fechamento;
    double maxima;
    double minima;
    double abertura;
    double suporte;
    double resistencia;
    double pontopivo;
     DecimalFormat converte = new DecimalFormat("#.00");
    
    public void PontodePivo(double max,double min,double fech){
        maxima = max;
        minima = min;
        fechamento= fech;
       pontopivo = (maxima+minima+fechamento)/3;
        
        
  
        
    }
    
    public double suporte(){
        
      suporte = (pontopivo*2)-maxima;
      return suporte;
      
        
        
    }
    public double Resistencia(){
       resistencia = (pontopivo*2)-minima;  
        
       
       return resistencia;
        
        
    }
    
    
    
    
    
    
    
    
    
}
