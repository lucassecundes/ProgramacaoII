package br.estacio.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TesteConexao {
    public static void main (String[] args){
        final String URL        = "jdbc:postgresql://localhost:5432/progii_bd";
        final String USUARIO    = "postgres";
        final String SENHA      = "estacio@123";
        
        Connection conexao;
    
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conetou");
            String sql =" INSERT "
                    + "INTO "
                    + " tb_usuario (nome, sobrenome)"
                    + "VALUES ('Elder', Charles') ";
            Statement sttm = conexao.createStatement();
            
            sttm.executeUpdate(sql);
            conexao.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}