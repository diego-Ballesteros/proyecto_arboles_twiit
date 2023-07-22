/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import datos.ArbolTweets;
import datos.Tweet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Ballesteros
 */
public class Main {
    
  public static void main(String[] args) {
      
      Scanner entrada = new Scanner(System.in);
        
       ArbolTweets arbolTweet=new ArbolTweets();
       
//       System.out.println("solo quiero modificar algo y ya ahora desde git hub 2.0");
//       
//       //istanciando tweets
//       Tweet t1 = new Tweet(1,"diego","hola");
//       Tweet t2 = new Tweet(11,"marta","covid");
//       Tweet t3 = new Tweet(21,"diego","viva");
//       Tweet t4 = new Tweet(8,"gabriel","covid");
//       Tweet t5 = new Tweet(4,"diego","hola");
//       Tweet t6 = new Tweet(3,"jenn","covid");
//       Tweet t7 = new Tweet(15,"yuli","hola");
//       Tweet t8 = new Tweet(17,"andre","covid");
//       
//      //insertando tweets
//       arbolTweet.insertar(t1);
//       arbolTweet.insertar(t2);
//       arbolTweet.insertar(t3);
//       arbolTweet.insertar(t4);
//       arbolTweet.insertar(t5);
//       arbolTweet.insertar(t6);
//       arbolTweet.insertar(t7);
//       arbolTweet.insertar(t8);
//
//       System.out.println("Mostrando tweets ordenados por codigo");
//       arbolTweet.inorden(arbolTweet.getRaiz());
//       
//       //buscar tweet con codigo 8
//       System.out.println("\nbuscando tweet por codigo");
//       Tweet tw;
//       tw = arbolTweet.buscarPorCodigo(8);
//       if(tw != null){
//           System.out.println(" Tweet Encontrado! sus datos son: ");
//           System.out.println(" "+tw.toString());
//       }else{
//           System.out.println("teewt No encontrado");
//       }
//       
//        System.out.println("\nMostrando el Tweet menor");
//        tw = arbolTweet.menorCodigo();
//        System.out.println(" El tweet con menor codigo es: "+tw.toString());
//        
//        System.out.println("\nHallando tweets de un usuario");
//        ArrayList<Tweet> tweets;
//        tweets = arbolTweet.hallarTweetUsuario(arbolTweet.getRaiz(),"diego");
//        for (Tweet tweet : tweets) {
//            System.out.println(tweet.toString());
//        }
//        
//        // eliminar tweet de codigo 1
//        System.out.println("\nEliminando tweet de un codigo");
//        arbolTweet.eliminar(1);
//        System.out.println("mostrando el arbol sin el registro del tweet eliminado");
//        arbolTweet.inorden(arbolTweet.getRaiz());
//       
//        System.out.println("\n Eliminando tweets con palabra covid");
//        arbolTweet.buscarContenido(arbolTweet.getRaiz(), "covid");
//        System.out.println("mostrando el arbol sin los registros que dicen covid");
//        arbolTweet.inorden(arbolTweet.getRaiz());
   
  
        String men= "\n1.Agregar tweet "
                    + "\n2.Mostrar twwets en orden por codigo "
                    + "\n3.Mostrar tweet menor"
                    + "\n4.Buscar tweet por codigo"
                    + "\n5.Eliminar tweet por codigo"
                    + "\n6.Eliminar todos los tweet con palabra covid"
                     + "\n0. Salir"
                     + "\n Elija su opcion --> ";
  
        fin: do {    
        
        System.out.println(men);
        int op = entrada.nextInt();
           
        switch (op) {
            case 1:
                
                System.out.println("\n  || Agregando Tweet || \n digite los siguientes datos: \n");
                System.out.println(" Digite el codigo del Tweet: ");
                int codigo = entrada.nextInt();
                System.out.println(" Digite el usuario del Tweet: ");
                String usuario = entrada.next();
                System.out.println("Digite el contenido del tweet (maximo 225 caracteres)");
                String contenido = entrada.next();
                
                Tweet tweet = new Tweet(codigo, usuario, contenido);
                arbolTweet.insertar(tweet);
                
                System.out.println("\n Tweet agregado con exito! ");
                
                break;
            case 2:
                
                 System.out.println(" Mostrando tweets ordenados por codigo");
                 arbolTweet.inorden(arbolTweet.getRaiz());

                break;
            case 3:
                
                break;
            case 0:
                break fin;
            default:
               throw new AssertionError();
        }
         } while (true);

  }
}
