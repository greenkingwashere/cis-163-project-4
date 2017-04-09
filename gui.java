package W17Project4StudentHelp;



import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

//import gui.gui1024;

public class GUI extends JFrame implements ActionListener {
	
	JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	public GUI(){
		
		setLayout(new GridBagLayout());
		GridBagConstraints position = new GridBagConstraints();
		position.anchor = GridBagConstraints.PAGE_START;
		position.insets =  new Insets(0,0,60,70); 
		position.gridwidth = 1;
		
		
		position.gridx = 0;
		position.gridy = 10;
		label1 = new JLabel("Input Information");
		label1.setForeground(Color.BLACK);
		add(label1, position);
		
		position.gridx = 0;
		position.gridy = 16;
		label2 = new JLabel("Seconds to next person");
		label2.setForeground(Color.BLACK);
		add(label2, position);
		
		position.gridx = 0;
		position.gridy = 24;
		label3 = new JLabel("Averge seconds per cashier");
		label3.setForeground(Color.BLACK);
		add(label3, position);
		
		position.gridx = 0;
		position.gridy = 32;
		label4 = new JLabel("Total time in seconds");
		label4.setForeground(Color.BLACK);
		add(label4, position);
		
		position.gridx = 0;
		position.gridy = 40;
		label5 = new JLabel("Average seconds per eatery");
		label5.setForeground(Color.BLACK);
		add(label5, position);
		
		position.gridx = 0;
		position.gridy = 48;
		label6 = new JLabel("Seconds before person leaves");
		label6.setForeground(Color.BLACK);
		add(label6, position);
		
		position.gridx = 0;
		position.gridy = 56;
		label7 = new JLabel("Number of Eateries");
		label7.setForeground(Color.BLACK);
		add(label7, position);
		
		position.gridx = 20;
		position.gridy = 8;
		label8 = new JLabel("-----------------------------");
		label8.setForeground(Color.BLACK);
		add(label8, position);
		
		//
		JTextField secsToNext = new JTextField("hey matie                                ");
		position.gridx = 20;
		position.gridy = 10;
		add(secsToNext,position);
		secsToNext.setEditable(false);
		
		
	
	}
	
	public static void main(String[] args){
		GUI game = new GUI();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setTitle("Cafeteria Simulation");
        game.setSize(500,500); 
        game.setVisible(true);
        game.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
