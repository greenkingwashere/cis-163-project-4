package W17Project4StudentHelp;

/*
 * 
 * 
 * Dez White
 * 
 * 
 * 
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI implements ActionListener {

	static ArrayList<Person> line;
	static ArrayList<Eatery> stores;
	static ArrayList<PersonProducer> producers;
	static ArrayList<Cashier> cashiers;
	static Clock clk;

	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	int globalTemp;
	JButton beginSim, endSim;
	JTextField avgTime, maxQlengthInput, inputInfo, throughputInput, throughput, outputInfoInput, outputInfo,
			NumberOfPlacesInput, secB4departInput, avgSecPerEatInput, totalInSecsInput, avgSecPerRegInput,
			secsToNextPerson, sec2Next, avgSecPerReg, totalInSecs, avgSecPerEat, secB4depart, NumberOfPlaces,
			inputInfoInput, maxQlength, avgTimeInput, numPeopleLeft, numPeopleLeftInput;
	int line1 = 0;
	int line2 = 0;
	int line3 = 0;
	int line4 = 0;
	int line5 = 0;
	int line6 = 0;
	// ActionListener listener;
	// Scanner scan;

	public void render(Container pane) {
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		// Scanner scan = new Scanner(System.in);

		pane.setLayout(new GridBagLayout());
		pane.setBackground(Color.BLACK);
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
			// natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}

		inputInfo = new JTextField(" *Input Information*  ");
		inputInfo.setEditable(false);
		inputInfo.setBackground(Color.DARK_GRAY);
		inputInfo.setOpaque(true);

		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		pane.add(inputInfo, c);

		inputInfoInput = new JTextField("                   	----------------------------");
		inputInfoInput.setEditable(false);
		inputInfoInput.setBackground(Color.BLACK);
		inputInfoInput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		pane.add(inputInfoInput, c);

		// int numba = scan.nextInt();
		sec2Next = new JTextField("Enter seconds to next person:  ");
		sec2Next.setEditable(false);
		sec2Next.setBackground(Color.DARK_GRAY);
		sec2Next.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 1;
		pane.add(sec2Next, c);

		secsToNextPerson = new JTextField("" + line1 + "");
		secsToNextPerson.addActionListener(this);
		secsToNextPerson.setEditable(true);
		secsToNextPerson.setBackground(Color.white);
		secsToNextPerson.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		pane.add(secsToNextPerson, c);

		avgSecPerReg = new JTextField("Enter average seconds per cashier:  ");
		avgSecPerReg.setEditable(false);
		avgSecPerReg.setBackground(Color.DARK_GRAY);
		avgSecPerReg.setOpaque(true);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 2;
		pane.add(avgSecPerReg, c);

		avgSecPerRegInput = new JTextField("" + line2 + "");
		avgSecPerRegInput.setEditable(true);
		avgSecPerRegInput.setBackground(Color.white);
		avgSecPerRegInput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		pane.add(avgSecPerRegInput, c);

		totalInSecs = new JTextField("Enter total time in seconds  ");
		totalInSecs.setEditable(false);
		totalInSecs.setBackground(Color.DARK_GRAY);
		totalInSecs.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		pane.add(totalInSecs, c);

		totalInSecsInput = new JTextField("" + line3 + "");
		totalInSecsInput.setEditable(true);
		totalInSecsInput.setBackground(Color.white);
		totalInSecsInput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		pane.add(totalInSecsInput, c);

		avgSecPerEat = new JTextField("Enter average seconds per eatery:  ");
		avgSecPerEat.setEditable(false);
		avgSecPerEat.setBackground(Color.DARK_GRAY);
		avgSecPerEat.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		pane.add(avgSecPerEat, c);

		avgSecPerEatInput = new JTextField("" + line4 + "");
		avgSecPerEatInput.setEditable(true);
		avgSecPerEatInput.setBackground(Color.white);
		avgSecPerEatInput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		pane.add(avgSecPerEatInput, c);

		secB4depart = new JTextField("Enter seconds before person leaves:  ");
		secB4depart.setEditable(false);
		secB4depart.setBackground(Color.DARK_GRAY);
		secB4depart.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 5;
		pane.add(secB4depart, c);

		secB4departInput = new JTextField("" + line5 + "");
		secB4departInput.setEditable(true);
		secB4departInput.setBackground(Color.white);
		secB4departInput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		pane.add(secB4departInput, c);

		NumberOfPlaces = new JTextField("Enter number of restaurants:   ");
		NumberOfPlaces.setEditable(false);
		NumberOfPlaces.setBackground(Color.DARK_GRAY);
		NumberOfPlaces.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 6;
		pane.add(NumberOfPlaces, c);

		NumberOfPlacesInput = new JTextField("" + line6 + "");
		NumberOfPlacesInput.setEditable(false);
		NumberOfPlacesInput.setBackground(Color.white);
		NumberOfPlacesInput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
		pane.add(NumberOfPlacesInput, c);

		beginSim = new JButton("            Begin Simulation >");
		beginSim.setBackground(Color.black);
		beginSim.setOpaque(true);
		beginSim.setBorderPainted(false);
		beginSim.addActionListener(this);
		Dimension panelD = new Dimension(10, 20);
		beginSim.setPreferredSize(panelD);
		beginSim.setForeground(Color.GREEN);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.gridx = 0;
		c.gridy = 10;
		pane.add(beginSim, c);

		endSim = new JButton("End Simulation ||                                   ");
		endSim.setBackground(Color.black);
		endSim.setOpaque(true);
		endSim.setBorderPainted(false);
		Dimension panelE = new Dimension(10, 20);
		endSim.setPreferredSize(panelE);
		endSim.setForeground(Color.RED);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 10;
		pane.add(endSim, c);

		outputInfo = new JTextField(" *Output Information*  ");
		outputInfo.setEditable(false);
		outputInfo.setBackground(Color.PINK);
		outputInfo.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 20;
		pane.add(outputInfo, c);

		outputInfoInput = new JTextField("Replace with accessor");
		outputInfoInput.setEditable(false);
		outputInfoInput.setBackground(Color.BLACK);
		outputInfoInput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 20;
		pane.add(outputInfoInput, c);

		throughput = new JTextField(" Throughput  ");
		throughput.setEditable(false);
		throughput.setBackground(Color.PINK);
		throughput.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 21;
		pane.add(throughput, c);

		throughputInput = new JTextField("Replace with accessor");
		throughputInput.setEditable(false);
		throughputInput.setBackground(Color.BLACK);
		throughputInput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 21;
		pane.add(throughputInput, c);

		avgTime = new JTextField(" Average seconds per cashier  ");
		avgTime.setEditable(false);
		avgTime.setBackground(Color.PINK);
		avgTime.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 22;
		pane.add(avgTime, c);

		avgTimeInput = new JTextField("Replace with accessor");
		avgTimeInput.setEditable(false);
		avgTimeInput.setBackground(Color.BLACK);
		avgTimeInput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 22;
		pane.add(avgTimeInput, c);

		numPeopleLeft = new JTextField(" Number of people left line:  ");
		numPeopleLeft.setEditable(false);
		numPeopleLeft.setBackground(Color.PINK);
		numPeopleLeft.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 23;
		pane.add(numPeopleLeft, c);

		numPeopleLeftInput = new JTextField("Replace with accessor");
		numPeopleLeftInput.setEditable(false);
		numPeopleLeftInput.setBackground(Color.black);
		numPeopleLeftInput.setForeground(Color.white);
		numPeopleLeftInput.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 23;
		pane.add(numPeopleLeftInput, c);

		maxQlength = new JTextField(" Max Q length cashier line:             ");
		maxQlength.setEditable(false);
		maxQlength.setBackground(Color.pink);

		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 24;
		pane.add(maxQlength, c);

		maxQlengthInput = new JTextField("Replace with accessor");
		maxQlengthInput.setEditable(false);
		maxQlengthInput.setBackground(Color.black);
		maxQlengthInput.setForeground(Color.white);
		maxQlengthInput.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 24;
		pane.add(maxQlengthInput, c);

	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.

		GUI goo = new GUI();
		JFrame frame = new JFrame("Food Court Sim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set up the content pane.
		goo.render(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		// Sim sim = new Sim();

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (beginSim.isSelected()) {
			Sim sim = new Sim();
		}
		// TODO Auto-generated method stub
		// if(num)

	}

}
