/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.controller;
import com.robertomarroquin.model.Usuario;
import com.robertomarroquin.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 *
 * @author informatica
 */
public class LoginController {
    private final LoginView LOGIN_VIEW;
    private double ejex = 0;
    private double ejey = 0;
    
    public LoginController (LoginView LoginView){
        this.LOGIN_VIEW = LoginView;
        construirAcciones();
    }
    private Stage escenarioPrincipal = SceneManager
                            .getInstanciaManager()
                            .getEscenarioPrincipal();
    
    public void iniciarSesion(){
        String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String clave = this.LOGIN_VIEW.getPwdClave().getText().trim();
        
        if( nombreUsuario.isEmpty() ){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "NO DEJES VACIO EL NOMBRE DE USUARIO");
            
            
        }else if( clave.isEmpty() )  {
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "NO DEJES VACIA LA CONTRASEÑA ");
            
        }else{
            this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
            //METODO LOGIN
            Usuario usuario = authSistema.login(nombreUsuario, clave);
            
            if(usuario == null){
                JOptionPane.showMessageDialog(null, "VERIFICA TUS CREDENCIALES");
                
            }else{
                JOptionPane.showMessageDialog(null, "HOLA");
            }
        }  
    
    public void construirAcciones (){
        
    }
    public void construirAcciones(){
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
            (evento)->{
                System.exit(0);
       }
      );
        this.LOGIN_VIEW.setOnMouseClicked(
        (evento)->{
            ejex = evento.getSceneX();
            ejey = evento.getSceneY();
            
            
         }
       );
        this.LOGIN_VIEW.setOnMouseDragged(
            (evento)->{
                
                double ejexDesplazamientoVentana = evento.getScreenX();
                double ejeyDesplazamientoVentana = evento.getScreenY();  
                
                escenarioPrincipal.setx( ejexDesplazamientoVentana - ejex)
                escenarioPrincipal.sety( ejeyDesplazamientoVentana - ejey)
               
            
                }
        );
    }
}

