/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

/**
 *
 * @author RJ
 */
public class Login {
 
private  String nombre;
private  String apellidos;
private  float edad;
private  String departamento;
private  String email;
private  String id_usuario;
private String password;
    
    public Login (String nombre, String apellidos, float edad, String departamento, String email, String id_usuario, String password){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.departamento = departamento;
        this.email = email;
        this.id_usuario = id_usuario;
        this.password = password;
        
        
    }
    
    public String getnombre(){
    
        return nombre;
    } 
    
    public void setnombre (String nombre){
        this.nombre = nombre;
    }
    
        public String getapellidos(){
    
        return apellidos;
    } 
    
    public void setapellidos (String apellidos){
        this.apellidos = apellidos;
    }
    
        public float getedad(){
    
        return edad;
    } 
    
    public void setedad (float edad){
        this.edad = edad;
    }
    
        public String getdepartamento(){
    
        return departamento;
    } 
    
    public void departamento (String departamento){
        this.departamento = departamento;
    }
        public String getemail(){
    
        return email;
    } 
    
    public void setemail (String email){
        this.email = email;
    }
        public String getid_usuario(){
    
        return id_usuario;
    } 
    
    public void setid_usuario (String id_usuario){
        this.id_usuario = id_usuario;
    }
        public String getpassword(){
    
        return password;
    } 
    
    public void setpassword (String password){
        this.password = password;
    }
}
