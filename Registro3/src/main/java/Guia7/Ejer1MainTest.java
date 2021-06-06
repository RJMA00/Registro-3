/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;
import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author RJ
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_juego;
        String genero;
        Float lanzamiento;
        String casa_desarolladora;
        
        Scanner teclado = new Scanner(System.in);
        
        System .out.println("Ingresa el nombre del juego :");
        nombre_juego = teclado.nextLine();
        System.out.println("Ingresa el genero del juego :");
        genero = teclado.nextLine();
        System.out.println("Ingresa la fecha de lanzamiento :");
        lanzamiento = Float.parseFloat(teclado.nextLine());        
        System.out.println("Ingrese la casa desarolladora del juergo:");
        casa_desarolladora= teclado.nextLine();
        
        
        String pass_hash;
        
        pass_hash = encriptar(nombre_juego);
        
        Ejer1 registro;
        registro = new Ejer1(nombre_juego, genero, lanzamiento,  casa_desarolladora, pass_hash);
        
        System.out.println("Los datos del registro son:");
        System.out.println("Nombre del juego:" + registro.getNombre_juego());
        System.out.println("Genero:" + registro.getGenero());
        System.out.println("Fecha de lanzamiento:" + registro.getLanzamiento());
        
        System.out.println("El nombre del la casa desarolladora es:" + registro.getcasa_desarolladora());
       
        String password_check;
        System.out.println("Ingresa el password a verificar" );
        password_check = teclado.nextLine();
        if (BCrypt.checkpw(password_check, registro.getNombre_juego())){
            System.out.println("El juego sido encontrado");
        }else{
            System.out.println("el juego no fue encontrada");
        }
        
        
    }

    private static String encriptar(String nombre_juego) {
     return  BCrypt.hashpw(nombre_juego,BCrypt.gensalt());
    }
    }
    

