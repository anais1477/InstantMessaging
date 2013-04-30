package viewClient;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Client.Client;
import Client.Connexion;
 
public class ViewConnexion extends JDialog  {
	  private JPanel container = new JPanel();
	  private JTextField fieldUser = new JTextField(15);
	  private JPasswordField fieldPassword = new JPasswordField(15);
	  private JLabel labelUser = new JLabel("         User");
	  private JLabel labelPassword = new JLabel("Password");
	  private JButton btnConnect = new JButton ("Connect");
	  private JButton btnCancel = new JButton ("Cancel");
	  String login = "";
	  String password = "";
	 
	  public ViewConnexion(){
		    this.setTitle("Connexion");
		    this.setSize(400, 400);
		    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
			this.setModalityType(ModalityType.APPLICATION_MODAL);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.white);
		    container.setLayout(new BorderLayout());
		    	 
		    
	        fieldUser.setMaximumSize(fieldUser.getPreferredSize());
	        
	        Box hBox1 = Box.createHorizontalBox();
	        hBox1.add(labelUser);
	        hBox1.add(Box.createHorizontalStrut(5));
	        hBox1.add(fieldUser);
	 
	        fieldPassword.setMaximumSize(fieldPassword.getPreferredSize());
	 
	        Box hBox2 = Box.createHorizontalBox();
	        hBox2.add(labelPassword);
	        hBox2.add(Box.createHorizontalStrut(5));
	        hBox2.add(fieldPassword);
	 
	        Box hBox3 = Box.createHorizontalBox();
	        hBox3.add(btnConnect);
	        hBox3.add(Box.createHorizontalStrut(20));
	        hBox3.add(btnCancel);
	 
	        Box vBox = Box.createVerticalBox();
	        vBox.add(Box.createVerticalStrut(20));
	        vBox.add(hBox1);
	        vBox.add(Box.createVerticalStrut(5));
	        vBox.add(hBox2);
	        vBox.add(hBox3);
	        
	        btnConnect.addActionListener(new ActionListener(){
	        	  public void actionPerformed(ActionEvent event){
	        	    login = fieldUser.getText();
	        	    password = new String(fieldPassword.getPassword());
	        		setVisible(false);
	        		dispose();
	        	  }
	        	});
	        
	        btnCancel.addActionListener(new ActionListener(){
	        	  public void actionPerformed(ActionEvent event){
	        		  setVisible(false);
	        		  dispose();
	        	  }
	        	});
	        container.add(vBox,BorderLayout.CENTER);
		    this.setContentPane(container);
		    this.setVisible(true); 
	}
	  
	  public String getLogin(){
		  return this.login;
	  }
	  
	  public String getPassword(){
		  return this.password;
	  }
	  
}