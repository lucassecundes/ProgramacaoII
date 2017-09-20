package br.estacio.MiniProva;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExercicioBorderLayout extends JFrame {

    
    public ExercicioBorderLayout() {
        
	//Declarando os paineis
	JPanel a = new JPanel();
        JPanel b = new JPanel();
        JPanel d = new JPanel();
        JPanel f = new JPanel();
        JPanel g = new JPanel();
        
	//Declarando os botoes
	JButton Botaon1 = new JButton ("Botão Norte 1");
        JButton Botaon2 = new JButton ("Botão Norte 2");
        JButton Botaos1 = new JButton ("Botão Sul 1");
        JButton Botaos2 = new JButton ("Botão Sul 2");
        JButton Botaol1 = new JButton ("Botão Leste 1");
        JButton Botaol2 = new JButton ("Botão Leste 2");
        JButton Botaoo1 = new JButton ("Botão Oeste 1");
        JButton Botaoo2 = new JButton ("Botão Oeste 2");
        JButton Botaoc1 = new JButton ("Botão Centro 1");
        JButton Botaoc2 = new JButton ("Botão Centro 2");
        
	//Onde vai ficar cada painel
	JLabel Label1 = new JLabel("                                                                            Sul");
        JLabel Label2 = new JLabel("                                    Centro");
        JLabel Label3 = new JLabel("             Oeste");
        JLabel Label4 = new JLabel("             Leste");
        JLabel Label5 = new JLabel("                                                                         Norte");
        
	//Layouts
	BorderLayout n = new BorderLayout();
        BorderLayout S = new BorderLayout();
        BorderLayout l = new BorderLayout();
        BorderLayout o = new BorderLayout();
        BorderLayout C = new BorderLayout();
        
	//Propriedades
        super.setTitle("Exercicio Border Layout ");
        //Norte
        a.setLayout(n);
        a.add(Botaon1, n.NORTH);
        a.add(Botaon2, n.SOUTH);
        a.add(Label5, n.CENTER);
        add(a, n.NORTH);
        //Sul
        b.setLayout(S);
        b.add(Botaos1, S.NORTH);
        b.add(Botaos2, S.SOUTH);
        b.add(Label1, S.CENTER);
        add(b, S.SOUTH);
        //Oeste
        d.setLayout(o);
        d.add(Botaol1, o.NORTH);
        d.add(Botaol2, o.SOUTH);
        d.add(Label4, o.CENTER);
        add(d, o.EAST);
        //Leste
        f.setLayout(l);
        f.add(Botaoo1, l.NORTH);
        f.add(Botaoo2, l.SOUTH);
        f.add(Label3, l.CENTER);
        add(f, l.WEST);
        //Centro
        g.setLayout(C);
        g.add(Botaoc1, C.NORTH);
        g.add(Botaoc2, C.SOUTH);
        g.add(Label2, C.CENTER);
        add(g, C.CENTER);
        }
    
	//Execução
      public static void main(String args[]) {
        ExercicioBorderLayout Border = new ExercicioBorderLayout();
        Border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Border.setSize(500,300); 
        Border.setVisible(true);
    }

}
