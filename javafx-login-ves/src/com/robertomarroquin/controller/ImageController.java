/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.controller;

/**
 *
 * @author informatica
 */
public class ImageController {
   private final String RUTA_IMAGENES = "/com/robertomarroquin/resources/" ;
   
   public image getImagenLogin(String nombreImagen){
       image crearImagen;
       
       switch (nombreImagen){
           case "logo":
               crearImagen = new image(RUTA_IMAGENES + "login-logo.png");
               break;
           default:
               crearImagen = new Image(RUTA_IMAGENES + "login-log.png");
       
       }
       return crearImagen;
   }
}
