
package br.estacio.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author aluno
 */
public class TestaEventos2 extends JFrame implements ActionListener {
    
      private JButton but1, but2;
      private JPanel painel;
      public TestaEventos2(){
          
          but1.addActionListener(this);
          but2.addActionListener(this);
      }
   
 public void actionPerformed(ActionEvent e){
     if (e.getSource() == but1)
         setTitle("Botão 1");
        
     else if (e.getSource() == but2)
         setTitle("Botão 2");
     
     repaint(); // Redesenha a janela após mudanças
 }
   
}
