package br.estacio.MiniProva;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExercicioBorderLayout extends JFrame {

    
    public ExercicioBorderLayout() {
        
	//Paineis
	JPanel P = new JPanel();
        JPanel A = new JPanel();
        JPanel N = new JPanel();
        JPanel E = new JPanel();
        JPanel L = new JPanel();
        
	//Botoes
	JButton B1 = new JButton ("Botão 1");
        JButton B2 = new JButton ("Botão 2");
        JButton B3 = new JButton ("Botão 3");
        JButton B4 = new JButton ("Botão 4");
        JButton B5 = new JButton ("           Botão 5           ");
        JButton B6 = new JButton ("           Botão 6           ");
        JButton B7 = new JButton ("           Botão 7           ");
        JButton B8 = new JButton ("           Botão 8           ");
        JButton B9 = new JButton ("Botão 9");
        JButton B0 = new JButton ("Botão 0");
        
	//Localização de cada Painel
	JLabel L1 = new JLabel("                                                                        Parte Sul");
        JLabel L2 = new JLabel("                     Parte Central");
        JLabel L3 = new JLabel("            Parte Oeste");
        JLabel L4 = new JLabel("            Parte Leste");
        JLabel L5 = new JLabel("                                                                      Parte Norte");
        
	//Layouts
	BorderLayout m = new BorderLayout();
        BorderLayout S = new BorderLayout();
        BorderLayout e = new BorderLayout();
        BorderLayout o = new BorderLayout();
        BorderLayout C = new BorderLayout();
        
	//Propriedades
        super.setTitle("Exercicio Programação ");
        
        P.setLayout(m);
        P.add(B1, m.NORTH);
        P.add(B2, m.SOUTH);
        P.add(L5, m.CENTER);
        add(P, m.NORTH);
        
        A.setLayout(S);
        A.add(B3, S.NORTH);
        A.add(B4, S.SOUTH);
        A.add(L1, S.CENTER);
        add(A, S.SOUTH);
        
        N.setLayout(o);
        N.add(B5, o.NORTH);
        N.add(B6, o.SOUTH);
        N.add(L4, o.CENTER);
        add(N, o.EAST);
        
        E.setLayout(e);
        E.add(B7, e.NORTH);
        E.add(B8, e.SOUTH);
        E.add(L3, e.CENTER);
        add(E, e.WEST);
        
        L.setLayout(C);
        L.add(B9, C.NORTH);
        L.add(B0, C.SOUTH);
        L.add(L2, C.CENTER);
        add(L, C.CENTER);
        
        
        
   }
	//Execução do Aplicativo java
      public static void main(String args[]) {
        ExercicioBorderLayout B = new ExercicioBorderLayout();
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setSize(500,250); 
        B.setVisible(true);
    }

}
