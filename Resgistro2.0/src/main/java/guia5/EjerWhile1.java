/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author RJ
 */
public class EjerWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.print("Introdusca un numero:");
        num=Entrada.entero();
        while(num!=0)
        {
            if(num>0)
        System.out.println("Positivo");
            else
        System.out.println("Negativo");
            
        System.out.println("Introduzaca otro numero:");
        num=Entrada.entero();
            
        }
    }
    
}
