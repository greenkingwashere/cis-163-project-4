package W17Project4StudentHelp;

/*
 * 
 * 
 * Dez White, Gray Schafer
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
	JTextField avgTime, maxQlengthOutput, inputInfo, throughputOutput, throughput, outputInfoOutput, outputInfo,
			NumberOfPlacesOutput, secB4departOutput, avgSecPerEatOutput, totalInSecsOutput, avgSecPerRegOutput,
			secsToNextPerson, sec2Next, avgSecPerReg, totalInSecs, avgSecPerEat, secB4depart, NumberOfPlaces,
			inputInfoOutput, maxQlength, avgTimeOutput, numPeopleLeft, numPeopleLeftOutput;
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

		inputInfoOutput = new JTextField("                   	----------------------------");
		inputInfoOutput.setEditable(false);
		inputInfoOutput.setBackground(Color.BLACK);
		inputInfoOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		pane.add(inputInfoOutput, c);

		pane.add(inputInfoOutput, c);
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

		avgSecPerRegOutput = new JTextField("" + line2 + "");
		avgSecPerRegOutput.setEditable(true);
		avgSecPerRegOutput.setBackground(Color.white);
		avgSecPerRegOutput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		pane.add(avgSecPerRegOutput, c);

		totalInSecs = new JTextField("Enter total time in seconds  ");
		totalInSecs.setEditable(false);
		totalInSecs.setBackground(Color.DARK_GRAY);
		totalInSecs.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		pane.add(totalInSecs, c);

		totalInSecsOutput = new JTextField("" + line3 + "");
		totalInSecsOutput.setEditable(true);
		totalInSecsOutput.setBackground(Color.white);
		totalInSecsOutput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		pane.add(totalInSecsOutput, c);

		avgSecPerEat = new JTextField("Enter average seconds per eatery:  ");
		avgSecPerEat.setEditable(false);
		avgSecPerEat.setBackground(Color.DARK_GRAY);
		avgSecPerEat.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		pane.add(avgSecPerEat, c);

		avgSecPerEatOutput = new JTextField("" + line4 + "");
		avgSecPerEatOutput.setEditable(true);
		avgSecPerEatOutput.setBackground(Color.white);
		avgSecPerEatOutput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		pane.add(avgSecPerEatOutput, c);

		secB4depart = new JTextField("Enter seconds before person leaves:  ");
		secB4depart.setEditable(false);
		secB4depart.setBackground(Color.DARK_GRAY);
		secB4depart.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 5;
		pane.add(secB4depart, c);

		secB4departOutput = new JTextField("" + line5 + "");
		secB4departOutput.setEditable(true);
		secB4departOutput.setBackground(Color.white);
		secB4departOutput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		pane.add(secB4departOutput, c);

		NumberOfPlaces = new JTextField("Enter number of restaurants:   ");
		NumberOfPlaces.setEditable(false);
		NumberOfPlaces.setBackground(Color.DARK_GRAY);
		NumberOfPlaces.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 6;
		pane.add(NumberOfPlaces, c);

		NumberOfPlacesOutput = new JTextField("" + line6 + "");
		NumberOfPlacesOutput.setEditable(false);
		NumberOfPlacesOutput.setBackground(Color.white);
		NumberOfPlacesOutput.setForeground(Color.black);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
		pane.add(NumberOfPlacesOutput, c);

		beginSim = new JButton("            Begin Simulation >");
		beginSim.setBackground(Color.black);
		beginSim.setOpaque(true);
		beginSim.setBorderPainted(false);
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

		outputInfoOutput = new JTextField("                   	----------------------------");
		outputInfoOutput.setEditable(false);
		outputInfoOutput.setBackground(Color.BLACK);
		outputInfoOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 20;
		pane.add(outputInfoOutput, c);

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

		throughputOutput = new JTextField("                   	----------------------------");
		throughputOutput.setEditable(false);
		throughputOutput.setBackground(Color.BLACK);
		throughputOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 21;
		pane.add(throughputOutput, c);

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

		avgTimeOutput = new JTextField("                   	----------------------------");
		avgTimeOutput.setEditable(false);
		avgTimeOutput.setBackground(Color.BLACK);
		avgTimeOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 22;
		pane.add(avgTimeOutput, c);

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

		numPeopleLeftOutput = new JTextField("                   	----------------------------");
		numPeopleLeftOutput.setEditable(false);
		numPeopleLeftOutput.setBackground(Color.black);
		numPeopleLeftOutput.setForeground(Color.white);
		numPeopleLeftOutput.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 23;
		pane.add(numPeopleLeftOutput, c);

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

		maxQlengthOutput = new JTextField("                   	----------------------------");
		maxQlengthOutput.setEditable(false);
		maxQlengthOutput.setBackground(Color.black);
		maxQlengthOutput.setForeground(Color.white);
		maxQlengthOutput.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 24;
		pane.add(maxQlengthOutput, c);

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
		// TODO Auto-generated method stub
		// if(num)

	}

	public void checkChange() {
		if (secsToNextPerson.getText() != "") {
			// String number = "10";
			int line1 = Integer.parseInt(secsToNextPerson.getText());
			// System.out.println(result);
		}
	}
}
