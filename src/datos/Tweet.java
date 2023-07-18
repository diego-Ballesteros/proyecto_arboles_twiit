/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * 
 */
public class Tweet {
    int codigo;
    String usuario;
    String contenido;

    public Tweet(int codigo, String usuario, String contenido) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Tweet{" + "codigo=" + codigo + ", usuario=" + usuario + ", contenido=" + contenido + '}';
    }
    

    public int getCodigo() {
        return codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContenido() {
        return contenido;
    }
    
    
    
}
