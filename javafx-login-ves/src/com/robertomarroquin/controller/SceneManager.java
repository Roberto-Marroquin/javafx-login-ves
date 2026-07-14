    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.controller;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import com.robertomaroquin.view.LoginView;
import javafx.stage.StageStyle;
/**
 *
 * @author informatica
 */
public class SceneManager {
    private Stage escenarioPrincipal; 
    private Stage escenarioSecundario;
    private Stage escenaPrincipal; 
    private static SceneManager instanciaSceneManager;
    
    private SceneManager(){
        
    }
    
    public void ventanaLogin(){
         try {
             this.escenaPrincipal.initStyle(StageStyle.TRANSPARENT);
             loginView login = loginView.getInsatnciaLoginVIew();
             cambiarEscena(login, 450,500);
             this.escenaPrincipal.setFill(Color.TRANSPARENT);
             new LoginController(login);
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: ventana Login");
            objetoNulo.printStackTrace();//mostrar todo el camino del error 
        }catch (Exception errorPadre)
            JOptionPane.showMessageDialog(null, "Error padre: ventana Login");
            errorPadre.printStackTrace();
    }
    }
    
    
    public void cambuiarEscena (Pane panel , int ancho , int alto ){
        try {
            escenaPrincipal = new Scene(panel, ancjo, alto);
            this.escenaPrincipal.setScene(escenaPricipal);
            this.escenaPrincipal.sizeToScene();
            this.escenaPrincipal.show();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo.printStackTrace();//mostrar odo el camino del error 
        }catch (Exception errorPadre)
            JOptionPane.showMessageDialog(null, "Error padre: cambiar Escena");
            errorPadre.printStackTrace();
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

    public Stage getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Stage escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }

    public static SceneManager getInstanciaSceneManager() {
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

  
    
}
