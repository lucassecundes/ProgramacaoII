package br.estacio.gerenciador.layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ExemploGridLayout extends JFrame {
    
        private JButton botao1;
        private JButton botao2;
        private JButton botao3;
        private JButton botao4;        
        private JButton botao5;
        private JButton botao6;
        
        private GridLayout gridLayout;
        

   
        public ExemploGridLayout(){
             
            botao1 = new JButton("Botão 1");
            botao2 = new JButton("Botão 2");
            botao3 = new JButton("Botão 3");
            botao4 = new JButton("Botão 4");
            botao5 = new JButton("Botão 5");
            botao6 = new JButton("Botão 6");
            
            gridLayout = new GridLayout( 2, 3, 5, 5 );
           
            
        
            this.setLayout (gridLayout);
            
            this.add(botao1);
            this.add(botao2);
            this.add(botao3);
            this.add(botao4);
            this.add(botao5);
            this.add(botao6);
            
            this.setSize(500, 300);
            
         
            this.setVisible(true);
            // layout.add(botaosul, BorderLayout.);
    
    
}   
}
