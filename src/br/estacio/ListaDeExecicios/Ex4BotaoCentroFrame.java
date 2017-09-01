/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.ListaDeExecicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alunoadm
 */
public class Ex4BotaoCentroFrame extends JFrame{
   
   private JButton centerJButton; // button to set alignment cente
   private FlowLayout layout; // layout object
   private Container container; // container to set layout
   
   // set up GUI and register button listeners
   public Ex4BotaoCentroFrame()
   {
      super( "Ex4 BotãoCentro Demo" );

      layout = new FlowLayout(); // create FlowLayout
      container = getContentPane(); // get container to layout
      setLayout( layout ); // set frame layout
      
 
      centerJButton = new JButton( "Center" ); // create Center button
      add( centerJButton ); // add Center button to frame
      centerJButton.addActionListener(

         new ActionListener() // anonymous inner class 
         {
            // process centerJButton event  
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.LEFT );

               // realign attached components
               layout.layoutContainer( container );
            } 
         } 
      ); 
   } 
} 

              



         
     

     
     
          

