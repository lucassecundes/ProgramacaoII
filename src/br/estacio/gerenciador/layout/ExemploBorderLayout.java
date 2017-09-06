
package br.estacio.gerenciador.layout;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ExemploBorderLayout extends JFrame {
    
        private JButton botaosul;
        private JButton botaonorte;
        private JButton botaooeste;
        private JButton botaocentro;        
        private JButton botaolest;
        
        private BorderLayout layout;

   
        public ExemploBorderLayout(){
            
            botaosul = new JButton("Botão ao Sul");
            botaonorte = new JButton("Botão ao Norte");
            botaooeste = new JButton("Botão ao Oeste");
            botaolest = new JButton("Botão ao Leste");
            botaocentro = new JButton("Botão a Centro");
            
            layout = new BorderLayout();
        
            this.setLayout (layout);
            
            this.add(botaosul, BorderLayout.SOUTH);
            this.add(botaonorte,BorderLayout.NORTH);
            this.add(botaooeste, BorderLayout.WEST);
            this.add(botaolest,BorderLayout.EAST);
            this.add(botaocentro,BorderLayout.CENTER);
            
            this.setSize(300, 300);
            this.setLocation(500, 200);
         
            this.setVisible(true);
            // layout.add(botaosul, BorderLayout.);
    
    
}   
}
