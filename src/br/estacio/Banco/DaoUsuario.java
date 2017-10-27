/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.Banco;

import java.sql.Connection;
import java.util.List;

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
    public boolean salvarUsuario(Usuario usuario){
        
        return false;
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
