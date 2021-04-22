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
public class MainCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println(Coche.numeroRuedas);
        System.out.println("La piscina se encuentra:"+ Casa.piscina);
        
        System.out.println("El metodo retorna:"+Casa.abrir());
        System.out.println("El metodo retorna:"+Casa.timbre());
        System.out.println("El metodo retorna:"+Casa.luz());
        System.out.println("El metodo retorna:"+Casa.TV());
        
     Casa SanSalvador =new Casa();
     SanSalvador.setcolor("Blanco");
     System.out.println("El color de la casa es :"+SanSalvador.getColor());
     
    
     
     SanSalvador.setTamaño(200);
     System.out.println("El Tamaño de la casa en metros cuadrados es de :"+SanSalvador.getTamaño());
     
     if (SanSalvador instanceof Casa){
         System.out.println("En efecto SanSalvador es una instancia de casa");
         
     }else{
        System.out.println(" SanSalvador no es una instancia de casa");
     }
     
    
    }
    
}
