/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class DaoUsuario {
    
    Connection conexao = Conexao.criarConexao();
    
    
    //listar
    public List<Usuario> listarUsuarios(){
        
        return null;
      
    }
    
    //salvar
    public int salvarUsuario(Usuario usuario){
        String sql = " INSERT "
                    + "INTO "
                    + " tb_usuario (nome, sobrenome)"
                    + "VALUES (?, ?) ";
        try {
            PreparedStatement preparacaoDaInstrucao = conexao.prepareStatement("sql");
            // De acordo com a posição do ponto de interrogação na SQl e o tipo de dado
            preparacaoDaInstrucao.setString(1, usuario.getNome());
            preparacaoDaInstrucao.setString(1, usuario.getSobrenome());
            
            return preparacaoDaInstrucao.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
        
    }
    //excluir
     public boolean excluirUsuario(Usuario usuario){
        
        return false;
    }
    
    //atualizar
      public boolean atualizarUsuario(Usuario usuario){
        
        return false;
    }
    
}
