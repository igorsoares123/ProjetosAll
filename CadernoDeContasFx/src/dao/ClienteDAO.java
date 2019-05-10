package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Cliente;

public class ClienteDAO {
   
    public void salvar(Cliente cliente){
   Connection con = ConexaoFx.getConnection();
   PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO anot(cliente, telefone, endereco, residencia) VALUES (?, ?, ?, ?)");
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTel());
            ps.setInt(3, cliente.getCasa());
            ps.setString(4, cliente.getEndereço());
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }finally{
            ConexaoFx.fecharConexao(con, ps);
    }
    }
    
 }  
