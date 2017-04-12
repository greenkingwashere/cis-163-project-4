package W17Project4StudentHelp;

/*
 * GridBagLayoutDemo.java requires no other files.
 */

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI {
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	int globalTemp;

	public static void addComponentsToPane(Container pane) {
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}

		JButton beginSim, endSim;
		JTextField avgTime, inputInfo, throughputOutput, throughput, outputInfoOutput, outputInfo, NumberOfPlacesOutput,
				secB4departOutput, avgSecPerEatOutput, totalInSecsOutput, avgSecPerRegOutput, secsToNextPerson,
				sec2Next, avgSecPerReg, totalInSecs, avgSecPerEat, secB4depart, NumberOfPlaces, inputInfoOutput;
		pane.setLayout(new GridBagLayout());
		pane.setBackground(Color.BLACK);
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
			// natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}

		inputInfo = new JTextField(" Input Information:  ");
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
		sec2Next = new JTextField("  Seconds to next person:  ");
		sec2Next.setEditable(false);
		sec2Next.setBackground(Color.DARK_GRAY);
		sec2Next.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 1;
		pane.add(sec2Next, c);

		secsToNextPerson = new JTextField("                   Temp to be replaced with backend accessor");
		secsToNextPerson.setEditable(false);
		secsToNextPerson.setBackground(Color.BLACK);
		secsToNextPerson.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		pane.add(secsToNextPerson, c);

		avgSecPerReg = new JTextField(" Average Seconds per cashier:  ");
		avgSecPerReg.setEditable(false);
		avgSecPerReg.setBackground(Color.DARK_GRAY);
		avgSecPerReg.setOpaque(true);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 2;
		pane.add(avgSecPerReg, c);

		avgSecPerRegOutput = new JTextField("                   Temp to be replaced with backend accessor");
		avgSecPerRegOutput.setEditable(false);
		avgSecPerRegOutput.setBackground(Color.BLACK);
		avgSecPerRegOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		pane.add(avgSecPerRegOutput, c);

		totalInSecs = new JTextField("Total time in seconds  ");
		totalInSecs.setEditable(false);
		totalInSecs.setBackground(Color.DARK_GRAY);
		totalInSecs.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		pane.add(totalInSecs, c);

		totalInSecsOutput = new JTextField("                   Temp to be replaced with backend accessor");
		totalInSecsOutput.setEditable(false);
		totalInSecsOutput.setBackground(Color.BLACK);
		totalInSecsOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		pane.add(totalInSecsOutput, c);

		avgSecPerEat = new JTextField("Average Seconds per eatery:  ");
		avgSecPerEat.setEditable(false);
		avgSecPerEat.setBackground(Color.DARK_GRAY);
		avgSecPerEat.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		pane.add(avgSecPerEat, c);

		avgSecPerEatOutput = new JTextField("                   Temp to be replaced with backend accessor");
		avgSecPerEatOutput.setEditable(false);
		avgSecPerEatOutput.setBackground(Color.BLACK);
		avgSecPerEatOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		pane.add(avgSecPerEatOutput, c);

		secB4depart = new JTextField("Seconds before person leaves:  ");
		secB4depart.setEditable(false);
		secB4depart.setBackground(Color.DARK_GRAY);
		secB4depart.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 5;
		pane.add(secB4depart, c);

		secB4departOutput = new JTextField("                   Temp to be replaced with backend accessor");
		secB4departOutput.setEditable(false);
		secB4departOutput.setBackground(Color.BLACK);
		secB4departOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		pane.add(secB4departOutput, c);

		NumberOfPlaces = new JTextField("Number of restaurants:   ");
		NumberOfPlaces.setEditable(false);
		NumberOfPlaces.setBackground(Color.DARK_GRAY);
		NumberOfPlaces.setOpaque(true);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 6;
		pane.add(NumberOfPlaces, c);

		NumberOfPlacesOutput = new JTextField("                   Temp to be replaced with backend accessor");
		NumberOfPlacesOutput.setEditable(false);
		NumberOfPlacesOutput.setBackground(Color.BLACK);
		NumberOfPlacesOutput.setForeground(Color.white);
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

		outputInfo = new JTextField(" Output Information:  ");
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

		throughput = new JTextField(" Throughput:  ");
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

		throughputOutput = new JTextField("                   Temp to be replaced with backend accessor");
		throughputOutput.setEditable(false);
		throughputOutput.setBackground(Color.black);
		throughputOutput.setForeground(Color.white);
		// throughputOutput.setForeground(Color.white);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 21;
		pane.add(throughputOutput, c);

		avgTime = new JTextField(" Throughput:  ");
		avgTime.setEditable(false);
		avgTime.setBackground(Color.PINK);
		avgTime.setOpaque(true);
		if (shouldWeightX) {
			c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 21;
		pane.add(avgTime, c);

	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Food Court Sim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set up the content pane.
		addComponentsToPane(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
