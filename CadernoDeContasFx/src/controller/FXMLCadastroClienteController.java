
package controller;

import dao.ClienteDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Cliente;

public class FXMLCadastroClienteController {

    @FXML
    private Button btSalvar;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtEndereço;

    @FXML
    private TextField txtResidencia;


    @FXML
    void salvar() throws ClassNotFoundException {
        Cliente cliente = new Cliente();
        ClienteDAO dao = new ClienteDAO();
        cliente.setNome(txtCliente.getText());
        cliente.setTel(txtTelefone.getText());
        cliente.setEndereço(txtEndereço.getText());
        cliente.setCasa(Integer.parseInt(txtResidencia.getText()));
        dao.salvar(cliente);
    }
    }
    
