/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import datos.ArbolTweets;
import datos.Tweet;
import java.util.ArrayList;

/**
 *
 * @author Diego Ballesteros
 */
public class Main {
    
  public static void main(String[] args) {
        
       ArbolTweets ob=new ArbolTweets();
       
       System.out.println("solo quiero modificar algo y ya ");
       
       //istanciando tweets
       Tweet t1 = new Tweet(1,"diego","hola");
       Tweet t2 = new Tweet(11,"marta","covid");
       Tweet t3 = new Tweet(21,"diego","viva");
       Tweet t4 = new Tweet(8,"gabriel","covid");
       Tweet t5 = new Tweet(4,"diego","hola");
       Tweet t6 = new Tweet(3,"jenn","covid");
       Tweet t7 = new Tweet(15,"yuli","hola");
       Tweet t9 = new Tweet(17,"andre","covid");
       
      //insertando tweets
       ob.insertar(t1);
       ob.insertar(t2);
       ob.insertar(t3);
       ob.insertar(t4);
       ob.insertar(t5);
       ob.insertar(t6);
       ob.insertar(t7);
       ob.insertar(t9);
       
       System.out.println("Mostrando tweets ordenados por codigo");
       ob.inorden(ob.getRaiz());
       
       //buscar tweet con codigo 8
       System.out.println("\nbuscando tweet por codigo");
       Tweet tw;
       tw = ob.buscarPorCodigo(8);
       if(tw != null){
           System.out.println(" Tweet Encontrado! sus datos son: ");
           System.out.println(" "+tw.toString());
       }else{
           System.out.println("teewt No encontrado");
       }
       
        System.out.println("\nMostrando el Tweet menor");
        tw = ob.menorCodigo();
        System.out.println(" El tweet con menor codigo es: "+tw.toString());
        
        System.out.println("\nHallando tweets de un usuario");
        ArrayList<Tweet> tweets;
        tweets = ob.hallarTweetUsuario(ob.getRaiz(),"diego");
        for (Tweet tweet : tweets) {
            System.out.println(tweet.toString());
        }
        
        // eliminar tweet de codigo 1
        System.out.println("\nEliminando tweet de un codigo");
        ob.eliminar(1);
        System.out.println("mostrando el arbol sin el registro del tweet eliminado");
        ob.inorden(ob.getRaiz());
       
        System.out.println("\n Eliminando tweets con palabra covid");
        ob.buscarContenido(ob.getRaiz(), "covid");
        System.out.println("mostrando el arbol sin los registros que dicen covid");
        ob.inorden(ob.getRaiz());
    }
    
}
