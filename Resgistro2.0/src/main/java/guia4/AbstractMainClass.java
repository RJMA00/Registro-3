/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * @author RJ
 */
public class AbstractMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    AbstractTest prueba =new AbstractTest();
    System.out.println("la suma es :" +prueba.suma(10, 15));
    System.out.println("la resta es :" +prueba.resta(50, 10));
    System.out.println("la division es :" +prueba.division(50, 10));
    System.out.println("la multiplicacion es :" +prueba.multiplicacion(10, 10));
    }
    
}
