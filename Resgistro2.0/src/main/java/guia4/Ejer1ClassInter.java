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
public class Ejer1ClassInter implements  Ejer1Interface {

    @Override
    public int suma(int x, int z) {
    return x+z;
    }

    @Override
    public int resta(int x, int z) {
    return x-z;    
    }

    @Override
    public int multiplicacion(int x, int z) {
    return x*z;
    }

    @Override
    public int division(int x, int z) {
    return x/z;
    }
    
}
