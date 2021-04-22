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
public class MainClassStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Coche.numeroRuedas);
        System.out.println("El coche tiene su timon al lado :"+ Coche.timon);
        
        System.out.println("El metodo retorna:"+Coche.arrancar());
        System.out.println("El metodo retorna:"+Coche.combustible());
        System.out.println("El metodo retorna:"+Coche.frenar());
        System.out.println("El metodo retorna:"+Coche.girar());
        
     Coche toyota =new Coche();
     toyota.setcolor("Rojo");
     System.out.println("El color del carro es :"+toyota.getColor());
     
     toyota.setVelocidad(100);
     System.out.println("La velocidad maxima del carro es :"+toyota.getVelocidad());
     
     toyota.setTamaño(7);
     System.out.println("El Tamaño del carro es :"+toyota.getTamaño());
     
     if (toyota instanceof Coche){
         System.out.println("En efecto toyota es una instancia de choche");
         
     }else{
        System.out.println("Toyota no es una instancia de choche");
     }
     
    }
    
}
