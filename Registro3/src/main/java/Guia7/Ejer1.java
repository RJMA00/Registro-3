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
public class Ejer1 {
    
     private String nombre_juego;
    private String genero;
    private float lanzamiento;
    private String casa_desarolladora;
    
    
    public Ejer1(String nombre_cancion, String genero, float lanzamiento,  String casa_desarolladora){
    this.nombre_juego = nombre_juego;
    this.genero = genero;
    this.lanzamiento = lanzamiento;

    this.casa_desarolladora= casa_desarolladora;
    
}

    Ejer1(String nombre_cancion, String genero, Float lanzamiento, String album, String artista, String pass_hash) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Ejer1(String nombre_juego, String genero, Float lanzamiento, String casa_desarolladora, String pass_hash) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public String getNombre_juego() {
  return nombre_juego;
}
public void setNombre_juego(String nombre_cancion) {
  this.nombre_juego = nombre_juego; 
}
public String getGenero() {
  return genero;
}
public void setGenero(String genero) {
  this.genero = genero;
}
public float getLanzamiento() {
  return lanzamiento;
}
public void setLanzamiento(float lanzamiento) {
    this.lanzamiento = lanzamiento;
}

public String getcasa_desarolladora(){
     return casa_desarolladora;
}
public void setcasa_desarolladora(String casa_desarolladora){
     this.casa_desarolladora = casa_desarolladora;

}
}
