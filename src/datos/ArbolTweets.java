/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;


/**
 *
 * 
 */
public class ArbolTweets {
   
    
    private Arbin<Tweet> raiz;
    
    //insertar tweets
    public void insertar(Tweet x){
        if(getRaiz()==null){
            raiz = new ArbolEnl<>(x);
        }else{
            insertar(getRaiz(),x);
        }
    }
    
   private void insertar(Arbin<Tweet> raiz, Tweet x) {
        if(x.getCodigo()<raiz.obtener().getCodigo()){
            if(raiz.izq()==null){
                raiz.enlIzq(new ArbolEnl<>(x));
            }else
                insertar(raiz.izq(), x);
        }else
            if(raiz.der()==null){
                raiz.enlDer(new ArbolEnl<>(x));
            }else
                insertar(raiz.der(), x);
    }
 
   //twet con menor codigo
   public Tweet menorCodigo(){
       if(raiz == null){
           return null;
       }else{
           return buscarMenorCodigo(raiz);
       }
   }
   Tweet t;
   public Tweet buscarMenorCodigo(Arbin<Tweet> raiz){
       if(raiz.izq()==null){
           t=raiz.obtener();
           return t;
       }else{
           return buscarMenorCodigo(raiz.izq());
       }
   }
  
   // metodo para mostrar arbol en orden
   public void inorden(Arbin<Tweet> r){
       if(r!=null){
           
           inorden(r.izq());
           System.out.println(" "+r.obtener().toString());
           inorden(r.der());
       }
   }
   
   // hallando tweets de un susario en comun 
    ArrayList<Tweet> tweetsUsuario = new ArrayList<>();
   public ArrayList<Tweet> hallarTweetUsuario(Arbin<Tweet> raiz, String usuario){
       if(raiz!=null){
           hallarTweets1(raiz,usuario);
           hallarTweetUsuario(raiz.izq(), usuario);
           hallarTweetUsuario(raiz.der(), usuario);
       }
       return tweetsUsuario;
   }
    private void hallarTweets1(Arbin<Tweet> raiz, String usuario) {
        if(raiz.obtener().getUsuario().equalsIgnoreCase(usuario)){
            tweetsUsuario.add(raiz.obtener());
        }  
    }
    
     
   /**
     * @return the raiz
     */
    public Arbin<Tweet> getRaiz(){
        return raiz;
    }
    
    // buscar por codigo 
    Tweet tweet ;
    public Tweet buscarPorCodigo ( int x){
        if(raiz!=null){
            return buscarPorCodigo(raiz, x);
        }else{
            return null;
        }
    }

    private Tweet buscarPorCodigo(Arbin<Tweet> r, int x) {
       if(r.obtener().getCodigo()== x){
          tweet = r.obtener();
          return tweet;
    }else{
           if(x<r.obtener().getCodigo()){
               if(r.izq()==null)
                   return null;
               else
                   return buscarPorCodigo(r.izq(), x);
           }else{
               if(r.der()==null)
                   return null;
               else
                   return buscarPorCodigo(r.der(), x);
           }
       }
    }
    
    //buscar por contenido
    public void buscarContenido(Arbin<Tweet> r, String contenido){
       if(r!=null){
           buscarContenido(r.izq(), contenido);
           buscarContenidoEliminar(r, contenido);
           buscarContenido(r.der(), contenido);
       }
   }
    //eliminar los que dicen covid
    public void buscarContenidoEliminar(Arbin<Tweet> r, String contenido){
        if(r.obtener().getContenido().equalsIgnoreCase(contenido)){
            eliminar(r.obtener().getCodigo());
        }
    }
    
    // eliminar 
    public Arbin<Tweet> mayor (Arbin<Tweet> r){
        if(r.der()==null)
            return r;
        else
            return mayor(r.der());
    }
    
    public void eliminar(int x){
        if(buscarPorCodigo(x)!=null){
            raiz=eliminar(raiz, x);
        }
    }
    public Arbin<Tweet> eliminar(Arbin<Tweet> r, int x) {
         if(r.obtener().getCodigo()==x){
           return  borrar(r,x);
         }else{
             if(x<r.obtener().getCodigo()){
                 r.enlIzq(eliminar(r.izq(), x));
             }else{
                 r.enlDer(eliminar(r.der(), x));
             }
             return r;
         }    
    }
    public Arbin<Tweet> borrar(Arbin<Tweet> r, int x) {
        if(r.izq()==null && r.der()==null){
            return null;
        }else{
            if(r.izq()==null){
                return r.der();
            }else{
                if(r.der()==null){
                    return r.izq();
                }else{
                    Arbin<Tweet> may = mayor(r.izq());
                    r.cambiar(may.obtener());
                    r.enlIzq(eliminar(r.izq(), may.obtener().getCodigo()));
                    return r;
                }
            }
               
        }
    }   
}
