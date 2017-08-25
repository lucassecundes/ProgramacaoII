/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.jframe.endereco;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author aluno
 */
public class ViewEndereco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de JFrame");
        janela.setBounds(300, 300, 200, 200);
        JLabel lblTexto = new JLabel ("Teste");
        JButton btnTeste = new JButton ("Teste");
        
        janela.add(lblTexto);
        janela.add(btnTeste);
       
        janela.pack();
        janela.setVisible(true);
    }
    
}
