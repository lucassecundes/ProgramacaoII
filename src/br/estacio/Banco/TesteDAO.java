/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.Banco;

/**
 *
 * @author aluno
 */
public class TesteDAO {
    public static void main(String[] args){
        Usuario usu     = new Usuario();
        DaoUsuario dao  = new DaoUsuario();
        
        usu.setNome("Lucas");
        usu.setSobrenome("Secundes");
        
        dao.salvarUsuario(usu);
    }
}
