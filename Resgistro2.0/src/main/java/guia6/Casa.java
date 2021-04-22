/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author RJ
 */
public class Casa {
    
 private String color;
    private int vecindario ;
    private float tamaño;
    public static int numerodehabitaciones  =4;
    public  static final String piscina = "Atras";
    
    public static String abrir (){
        return "la puerta esta abierta";
    }
    
    public static String timbre (){
        return "Alguien toca el timbre";
    }
    
    public static String luz (){
        return "Se encendio la luz"; 
    }
    
    public static String TV (){
        return "Se encendio la TV";
    }
    
    public String getColor (){
        return color;
    }
     public void  setcolor (String color){
        this.color = color;
        }
     
    public int getvecindario(){
        return vecindario;
    }
    
     
    public float getTamaño(){
        return tamaño;
    }
    
      public void  setTamaño (float tamaño){
        this.tamaño = tamaño;
    }
}
