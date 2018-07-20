/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.moldel.Carro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javassist.CtMethod;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 79643035204
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtResultado;
    @FXML
    private TextField txtNumero2;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private TextField txtCor;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtAno;
    
    
    
    @FXML
    private void soma(ActionEvent event){
        Double n1, n2, res;
          
      n1 = Double.parseDouble(txtNumero1.getText());
      n2 = Double.parseDouble(txtNumero2.getText());
        
      res = n1 + n2;
      
      txtResultado.setText(res.toString());
       
    }
    
    @FXML
    private void divisão(ActionEvent event){
        Double n1, n2, res;
          
      n1 = Double.parseDouble(txtNumero1.getText());
      n2 = Double.parseDouble(txtNumero2.getText());
        
      res = n1 / n2;
      
      txtResultado.setText(res.toString());
       
    }
    @FXML
    private void subtração(ActionEvent event){
        Double n1, n2, res;
          
      n1 = Double.parseDouble(txtNumero1.getText());
      n2 = Double.parseDouble(txtNumero2.getText());
        
      res = n1 - n2;
      
      txtResultado.setText(res.toString());
       
    }
    @FXML
    private void multiplicação(ActionEvent event){
        Double n1, n2, res;
          
      n1 = Double.parseDouble(txtNumero1.getText());
      n2 = Double.parseDouble(txtNumero2.getText());
        
      res = n1 * n2;
      
      txtResultado.setText(res.toString());
    
      

    }
    @FXML
    public void gravar(ActionEvent event) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
          EntityManager em = emf.createEntityManager();
          
          Carro carro = new Carro();
          carro.setAno(Integer.parseInt(txtAno.getText()));
          carro.setCor(txtCor.getText());
          carro.setModelo(txtModelo.getText());
      
          em.getTransaction().begin();
          em.persist(carro);
          em.getTransaction().commit();
          
       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
