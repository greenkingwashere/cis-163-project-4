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
 
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
        JButton beginSim, endSim;
        JTextField inputInfo, NumberOfPlacesOutput, secB4departOutput, avgSecPerEatOutput, totalInSecsOutput, avgSecPerRegOutput, secsToNextPerson, sec2Next, avgSecPerReg, totalInSecs, avgSecPerEat, secB4depart, NumberOfPlaces, inputInfoOutput;
    pane.setLayout(new GridBagLayout());
    pane.setBackground(Color.BLACK);
    GridBagConstraints c = new GridBagConstraints();
    if (shouldFill) {
    //natural height, maximum width
    c.fill = GridBagConstraints.HORIZONTAL;
    }
 
    inputInfo = new JTextField(" Input Information:  ");
    inputInfo.setEditable(false);
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(inputInfo , c);
    
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
    pane.add(inputInfoOutput , c);
    
  
    pane.add(inputInfoOutput , c);
    sec2Next = new JTextField("  Seconds to next person:  ");
    sec2Next.setEditable(false);
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
    pane.add(secsToNextPerson , c);
 
 
    avgSecPerReg = new JTextField(" Average Seconds per cashier:  ");
    avgSecPerReg.setEditable(false);
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
    pane.add(avgSecPerRegOutput , c);
    
    totalInSecs = new JTextField("Total time in seconds  ");
    totalInSecs.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 3;
    pane.add(totalInSecs, c);
    
    totalInSecsOutput = new JTextField("                   Temp to be replaced with backend accessor");
    totalInSecsOutput .setEditable(false);
    totalInSecsOutput .setBackground(Color.BLACK);
    totalInSecsOutput .setForeground(Color.white);
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 3;
    pane.add(totalInSecsOutput  , c);
    
    avgSecPerEat = new JTextField("Average Seconds per eatery:  ");
    avgSecPerEat.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 4;
    pane.add(avgSecPerEat, c);
    
    avgSecPerEatOutput = new JTextField("                   Temp to be replaced with backend accessor");
    avgSecPerEatOutput .setEditable(false);
    avgSecPerEatOutput .setBackground(Color.BLACK);
    avgSecPerEatOutput.setForeground(Color.white);
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 4;
    pane.add(avgSecPerEatOutput  , c);
    
    secB4depart = new JTextField("Seconds before person leaves:  ");
    secB4depart.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 5;
    pane.add(secB4depart, c);
    
    secB4departOutput = new JTextField("                   Temp to be replaced with backend accessor");
    secB4departOutput .setEditable(false);
    secB4departOutput .setBackground(Color.BLACK);
    secB4departOutput.setForeground(Color.white);
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 5;
    pane.add(secB4departOutput  , c);
    
    NumberOfPlaces = new JTextField("Number of restaurants:   ");
    NumberOfPlaces.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 6;
    pane.add(NumberOfPlaces, c);
    
    NumberOfPlacesOutput = new JTextField("                   Temp to be replaced with backend accessor");
    NumberOfPlacesOutput .setEditable(false);
    NumberOfPlacesOutput .setBackground(Color.BLACK);
    NumberOfPlacesOutput.setForeground(Color.white);
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 6;
    pane.add(NumberOfPlacesOutput  , c);
    
    
   beginSim = new JButton("Begin Simulation");
   Dimension panelD = new Dimension(80,180);
   beginSim.setPreferredSize(panelD);
   // beginSim.setEditable(false);
   c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1;
    c.gridx = 1;
    c.gridy = 8;
    pane.add(beginSim, c);
    
    
    endSim = new JButton("End Simulation");
    // beginSim.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
     c.weightx = 0;
     c.gridx = 2;
     c.gridy = 8;
     pane.add(endSim, c);
    
    
    }
   
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
