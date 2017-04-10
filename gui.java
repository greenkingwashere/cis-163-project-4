

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
		label1 = new JLabel("Input Information     ");
		label1.setForeground(Color.BLACK);
		add(label1, position);
		
		position.gridx = 0;
		position.gridy = 20;
		label2 = new JLabel("Seconds to next person");
		label2.setForeground(Color.RED);
		add(label2, position);
		
		position.gridx = 0;
		position.gridy = 30;
		label3 = new JLabel("  Averge seconds per cashier");
		label3.setForeground(Color.BLACK);
		add(label3, position);
		
		position.gridx = 0;
		position.gridy = 40;
		label4 = new JLabel("Total time in seconds");
		label4.setForeground(Color.RED);
		add(label4, position);
		
		position.gridx = 0;
		position.gridy = 50;
		label5 = new JLabel(" Average seconds per eatery");
		label5.setForeground(Color.BLACK);
		add(label5, position);
		
		position.gridx = 0;
		position.gridy = 60;
		label6 = new JLabel("  Seconds before person leaves");
		label6.setForeground(Color.RED);
		add(label6, position);
		
		position.gridx = 0;
		position.gridy = 70;
		label7 = new JLabel("Number of Eateries");
		label7.setForeground(Color.BLACK);
		add(label7, position);
		
		position.gridx = 20;
		position.gridy = 10;
		label8 = new JLabel("  ---------------------------");
		add(label8, position);
		
		//temp string, replace with backEnd accessor 
		JTextField secsToNext = new JTextField("hey matie                                ");
		secsToNext.setBackground(Color.BLACK);
		secsToNext.setForeground(Color.WHITE);
		position.gridx = 20;
		position.gridy = 20;
		add(secsToNext,position);
		secsToNext.setEditable(false);
		
		JTextField avgSecPer = new JTextField("hey matie2                               ");
		position.gridx = 20;
		position.gridy = 30;
		add(avgSecPer,position);
		secsToNext.setEditable(false);
		
		JTextField totalTimeInSec = new JTextField("hey matie3                              ");
		position.gridx = 20;
		position.gridy = 40;
		totalTimeInSec.setBackground(Color.BLACK);
		totalTimeInSec.setForeground(Color.WHITE);
		add(totalTimeInSec,position);
		secsToNext.setEditable(false);
		
		
		JTextField avgSecPerEatery = new JTextField("hey matie4                             ");
		position.gridx = 20;
		position.gridy = 50;
		add(avgSecPerEatery,position);
		secsToNext.setEditable(false);
		
		JTextField secB4persomLeaves = new JTextField("hey matie5                             ");
		position.gridx = 20;
		position.gridy = 60;
		secB4persomLeaves.setBackground(Color.BLACK);
		secB4persomLeaves.setForeground(Color.WHITE);
		add(secB4persomLeaves,position);
		secsToNext.setEditable(false);
		
		JTextField numOfEateries = new JTextField("hey matie6                             ");
		position.gridx = 20;
		position.gridy = 70;
		add(numOfEateries,position);
		secsToNext.setEditable(false);
		
		//JButton
		
	
	}
	
	  //backGround color changes then reverts, issue with scope?
	public static void main(String[] args){
		GUI game = new GUI();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setTitle("Sub-Par Food Court Simulation");
        game.setSize(500,500); 
        game.setVisible(true);
        game.pack();
       // game.setBackground(Color.BLACK);
      
        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
