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
 
        JButton button;
        JTextField inputInfo,  sec2Next, avgSecPerReg, totalInSecs, avgSecPerEat, secB4depart, NumberOfPlaces;
    pane.setLayout(new GridBagLayout());
    pane.setBackground(Color.BLACK);
    GridBagConstraints c = new GridBagConstraints();
    if (shouldFill) {
    //natural height, maximum width
    c.fill = GridBagConstraints.HORIZONTAL;
    }
 
    inputInfo = new JTextField(" Input Information:");
    inputInfo.setEditable(false);
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(inputInfo , c);
 
    sec2Next = new JTextField(" Seconds to next person:");
    sec2Next.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 1;
    pane.add(sec2Next, c);
 
    avgSecPerReg = new JTextField(" Average Seconds per cashier:");
    avgSecPerReg.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 2;
    pane.add(avgSecPerReg, c);
    
    totalInSecs = new JTextField("Total time in seconds");
    totalInSecs.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 3;
    pane.add(totalInSecs, c);
    
    avgSecPerEat = new JTextField("Average Seconds per eatery:");
    avgSecPerEat.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 4;
    pane.add(avgSecPerEat, c);
    
    secB4depart = new JTextField("Seconds before person leaves:");
    secB4depart.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 5;
    pane.add(secB4depart, c);
    
    NumberOfPlaces = new JTextField("Number of restaurants: ");
    NumberOfPlaces.setEditable(false);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 6;
    pane.add(NumberOfPlaces, c);
    
 
    button = new JButton("5");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 0;       //reset to default
    c.weighty = 1.0;   //request any extra vertical space
    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
    c.insets = new Insets(10,0,0,0);  //top padding
    c.gridx = 1;       //aligned with button 2
    c.gridwidth = 2;   //2 columns wide
    c.gridy = 2;       //third row
    pane.add(button, c);
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
