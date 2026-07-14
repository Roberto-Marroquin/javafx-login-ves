/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robertomarroquin.view;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.layout.VBox;

/**
 *
 * @author informatica
 */
public class LoginView extends BorderPane {
    private  static LoginView instanciaLoginView;{}
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private HBox barraDeOpciones;
    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave ;
    private LoginView(){

        this.setPadding(new Insets(15 ));
        
        this.setBorder(new Border(
             new BorderStroke(Paint.valueOf("#292C8C"),//color del borde 
                        BorderStrokeStyle.SOLID,//Estilo del borde 
                       new CornerRadii(22),//pixeles del redondeado 
                       new BorderWidths(2))//Ancho del borde
        ));
         this.setBackGround(new Background(
                new BackgroundFill(Color.BROWN, //color del fondo 
                       new CornerRadii (25),//pixeles del redondeado 
                       Insets.EMPTY)//Espaciado del fondo 
         ));                
         barraDeOpciones = new HBox(25);
         
         btnCerrarVentana = new Button("x");
         lblTituloVentana = new Label("JAVAFX- LOGIN");
         
         barraDeOpciones.getChildren().addAll(btnCerrarVentana, lblTituloVentana);
         
         this.setTop(barraDeOpciones);
         //objetos del formulario
         cajaVertical = new VBox();
         
         formulario = new GridPane();
         
         lblNombreUsuario = nw Label("IIngrese su Nombre de Usuario");
         txtNombreUsuario = new TextField();
         
         lblClave = new Label("Ingrese su contraseña");
         pwdClave = new PasswordField();
         
         formulario.add(lblNombreUsuario, 0, 0);
         formulario.add(txtNombreUsuario, 1, 0);
         
         formulario.add(lblClave, 0, 1);
         formulario.add(pwdClave, 1, 1);
         
         btnIniciarSesion = new Button("Iniciar sesion");
         imgLogoLogin = new ImageView( new imageController().getImageLogin("logo"));
         imgLogoLogin.setFitWidth(100);
         imgLogoLogin.setFitWidth(100);
         imgLogoLogin.setCache(true);
         
         cajaVertical.setAlignment(Pos.CENTER);
         
         cajaVertical.getChildren().addAll(imgLogoLogin, formulario,btnIniciarSesion );
         
         this.setCenter(cajaVertical);
    }
 
    public static LoginView getInstanciaView(){
        if( instanciaLoginView == null)
            instanciaLoginView == new LoginView();
        return instanciaLoginView;
    }

    public static getLoginView() {
        return LoginView;
    }

    public void setLoginView(static LoginView) {
        this.LoginView = LoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }

    public static getLoginView() {
        return LoginView;
    }

    public void setLoginView(static LoginView) {
        this.LoginView = LoginView;
    }
}
}
