/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.controller;
import com.robertomaroquin.view.LoginView;
/**
 *
 * @author informatica
 */
public class LoginController {
    private final LoginView LOGIN_VIEW;
    
    
    public LoginController (LoginView LoginView){
        this.LOGIN_VIEW = LoginView;
        construirAcciones();
    }
    public void construirAcciones(){
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseCllicked(
            (evento)->{
                System.exit(0);
       }
      );
    }
}
