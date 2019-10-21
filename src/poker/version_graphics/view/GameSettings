package poker.version_graphics.view;
import poker.version_graphics.*;
import poker.version_graphics.model.DeckOfCards;
import poker.version_graphics.model.Player;
import poker.version_graphics.model.PokerGameModel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameSettings extends JFrame implements ActionListener{


	
	JLabel jlabMsg;
	JTextField jtf;
	JButton jbtn;
	
	public GameSettings() {
		
		jlabMsg = new JLabel("Enter nr players:");
		jtf = new JTextField(25);
		jbtn = new JButton("Create Game");
		
		setLayout(new FlowLayout());
		setTitle("Title");
		
		jbtn.addActionListener(this);
		
		add(jlabMsg);
		add(jtf);
		add(jbtn);
		
		setSize(400,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		int numP = Integer.parseInt(jtf.getText());
		System.out.print(numP);
		
	}
}
