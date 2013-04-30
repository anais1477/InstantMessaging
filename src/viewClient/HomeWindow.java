package viewClient;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Client.Client;


public class HomeWindow extends JFrame {
	  private JPanel container = new JPanel();
	  private JTextField fieldUser = new JTextField(15);
	  private JPasswordField fieldPassword = new JPasswordField(15);
	  private JLabel labelPassword = new JLabel("Password");
	  private JButton btnConnection = new JButton ("Connection");
	  private JButton btnSubscription = new JButton ("Subscription");
	  private Client client;
	  
	  public HomeWindow(){
		    this.setTitle("Home");
		    this.setSize(400, 700);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.white);
		    container.setLayout(new BorderLayout());
		    
	        Box vBox = Box.createVerticalBox();
	        vBox.add(Box.createVerticalStrut(super.getSize().height/3));
	        vBox.add(btnConnection);
	        vBox.add(Box.createVerticalStrut(50));
	        vBox.add(btnSubscription);
	        vBox.add(Box.createHorizontalStrut(super.getSize().width/3));
	 
	 
	        container.add(vBox,BorderLayout.CENTER);
	        
	        btnConnection.addActionListener(new ActionListener(){
	        	  public void actionPerformed(ActionEvent event){
	        	    ViewConnexion vc = new ViewConnexion();
	        	   
	        	    client = new Client(vc.getLogin(), vc.getPassword());
	        	    
	                container.removeAll();
	                displayClientList();
	        	  }
	        	});
	        
	        btnSubscription.addActionListener(new ActionListener(){
	        	  public void actionPerformed(ActionEvent event){
	        		  new ViewSubscription();           
		              container.removeAll();
		              displayClientList();  
	        	  }
	        	});
		    this.setContentPane(container);
		    this.setVisible(true); 
	  }
	  
	  public void displayClientList(){
		  repaint();
		  
		  
	  }
	  
	  public static void main(String[] args) {
		  HomeWindow hw = new HomeWindow();
		  
		  
	  
	  }
	

}
