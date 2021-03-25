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
public class InterfaceMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassTestInter pruebainter = new ClassTestInter();
        
    System.out.println("la suma es :" +pruebainter.suma(50, 100));
    System.out.println("la resta es :" +pruebainter.resta(50, 10));
    System.out.println("la division es :" +pruebainter.division(10, 5));
    System.out.println("la multiplicacion es :" +pruebainter.multiplicacion(100, 10));
    }
    
}
