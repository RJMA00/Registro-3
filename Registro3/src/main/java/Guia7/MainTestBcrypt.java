/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author RJ
 */
public class MainTestBcrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String nombre;
String apellidos;
float edad;
String departamento;
String email;
String id_usuario;
String password;

Scanner teclado= new Scanner(System.in);

System.out.println("Ingrese el nombre del usuario :");
nombre = teclado.nextLine();

System.out.println("Ingrese el apellido del usuario :");
apellidos = teclado.nextLine();

System.out.println("Ingrese la edad del usuario :");
edad = teclado.nextLine();

System.out.println("Ingrese el departamento :");
departamento = teclado.nextLine();

System.out.println("Ingrese el email del usuario :");
email = teclado.nextLine();

System.out.println("Ingrese el id del usuario :");
id_usuario = teclado.nextLine();

System.out.println("Ingrese la contraseña :");
password = teclado.nextLine();


String pass_hash;

pass_hash = encriptar (password);

Login registro;
registro= new Login(nombre, apellidos, edad, departamento, email, id_usuario, pass_hash);

System.out.println("Los datos del registro son:");
System.out.println("Nombre:" +registro.getnombre());
System.out.println("Apellidos:" +registro.getapellidos());
System.out.println("Edad:" +registro.getedad());
System.out.println("Departamento:" +registro.getdepartamento());
System.out.println("Email:" +registro.getemail());
System.out.println("Id Usuario:" +registro.getid_usuario());
System.out.println("Contraseña:" +registro.getpassword());

String password_chek;

System.out.println("Ingrese la contraseña para verificar: ");
password_check = teclado.nextLine();

if (BCrypt.checkpv(password_check, registro.getpassword())){
System.out.println("La contraseña es correcta");
}else{
System.out.println("La contraseña es incorrecta");
}

  public static String encriptar(String pass){
      return BCrypt.hashpw(pass,BCrypt.gensalt());
  }
    
       
            
        }
