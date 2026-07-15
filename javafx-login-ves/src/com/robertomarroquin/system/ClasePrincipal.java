/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.robertomarroquin.system;
import javafx.stage.Stage;
import com.robertomarroquin.controller.SceneManager;
import javafx.application.Application;
/**
 *
 * @author informatica
 */
public class ClasePrincipal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     launch(args);
    }
    @Override
    public void start( Stage escenarioRaiz){
        SceneManager.getInstanciaSceneManager().setEscenarioPrincipal(escenarioRaiz);
        SceneManager.getInstanciaSceneManager().ventanaLogin();
    }
    
}
