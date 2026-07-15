/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.controller;
import com.robertomarroquin.model.Rol;
import com.robertomarroquin.model.Usuario;
import java.util.ArrayList;
/**
 *
 * @author informatica
 */
public class AuthSistema {
  private static ArrayList <Usuario> ListaUsuarios = new ArrayList<>();
  private AuthSistema authSistema = new AuthSistema();
  public AuthSistema(){
      Usuario usuarioAdmin = new Usuario("admin",
                              "admin", "admin", Rol.ADMIN);
      Usuario usuarioUser = new Usuario("user",
                              "user", "user", Rol.USER);
      Usuario usuarioYo = new  Usuario("Roberto",
                              "123", "Roberto Marroquin Larios", Rol.ADMIN);
      
      ListaUsuarios.add(usuarioAdmin);
      ListaUsuarios.add(usuarioUser);
      ListaUsuarios.add(usuarioYo);
  }
    
    public Usuario login ( String nombreUsuario, String Clave){
        for( Usuario usuarioBuscado :  ListaUsuarios ){
            
            if( usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                && usuarioBuscado.getPassword().equals(Clave))
            return usuarioBuscado;
                
        }
        
        return null; 
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> ListaUsuarios) {
        AuthSistema.ListaUsuarios = ListaUsuarios;
    }
  
}
