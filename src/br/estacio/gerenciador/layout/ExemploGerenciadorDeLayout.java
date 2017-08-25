
package br.estacio.gerenciador.layout;

import javax.swing.JFrame;


public class ExemploGerenciadorDeLayout extends JFrame {

    
    
    public ExemploGerenciadorDeLayout(){
         
        
        //Tamanho da Janela inteira
        //janela.setBounds(100, 100, 300, 300);
        
        //Tamanho da Janela separados
        this.setSize(300, 300);
        this.setLocation(100, 100);
        
        //Opção que não faz nada ao clicar no X - equivalente à 0
        //janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        //Somente torna o elemento invisivel - equivalente à 1
        //janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        //Desaloca o frame fechado da memoria
        //janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.setTitle("Frame Extendido");
        //Fecha toda a aplicação
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
    public static void main(String[] args) {
        JFrame janela = new ExemploGerenciadorDeLayout();
        janela.setVisible(true);
        
        }
    }
   
