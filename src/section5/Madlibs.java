package section5;

import javax.swing.JOptionPane;

public class Madlibs {
public static void main(String[] args) {
	String noun1 = JOptionPane.showInputDialog("Give me a noun.");
	String verb1 = JOptionPane.showInputDialog("Give me a verb.");
	String adjective1 = JOptionPane.showInputDialog("Give me an adjective.");
	JOptionPane.showMessageDialog(null, "(Juan)-Jacob let's go on a run.\n");
	JOptionPane.showMessageDialog(null, "(Jacob)-Can't, I am a " + noun1 + ".");
	JOptionPane.showMessageDialog(null, "(Juan);-What?! Then why are you " + verb1 + "?");
	JOptionPane.showMessageDialog(null, "(Jacob)-Becuase I want to be " + adjective1 + ".");
	}
	
	
}
