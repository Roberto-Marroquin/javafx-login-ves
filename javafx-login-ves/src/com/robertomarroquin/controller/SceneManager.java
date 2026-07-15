/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.controller;

import com.robertomarroquin.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import javafx.stage.StageStyle;

/**
 *
 * @author informatica
 */
public class SceneManager {

    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;

    private SceneManager() {

    }

    public void ventanaLogin() {
        try {
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaView();
            cambiarEscena(login, 450, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new LoginController(login);
            } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo.printStackTrace();//mostrar odo el camino del error 
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: ventana Login");
            errorPadre.printStackTrace();
        }
    }
    public void ventanaBienvenida(){
         try {
           this.escenarioSecundario = new Stage();
           this.escenarioSecundario.initStyle(StageStyle.TRANSPARENT);
           this.escenarioSecundario.initModality(Modality.APLICATION_M);
           BienvenidaView bienvenida = new BienvenidaView
           
           
            } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo.printStackTrace();//mostrar odo el camino del error 
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: ventana Login");
            errorPadre.printStackTrace();
        }
    }

    public void cambiarEscena(Pane panel, int ancho, int alto) {
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo.printStackTrace();//mostrar odo el camino del error 
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: cambiar Escena");
            errorPadre.printStackTrace();
        }
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }


    public static SceneManager getInstanciaSceneManager() {
        if( instanciaSceneManager == null)
            instanciaSceneManager = new SceneManager();
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

}
