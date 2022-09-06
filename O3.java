package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		int heltal = Integer.parseInt(JOptionPane.showInputDialog("Skriv et heltall: "));
		while (heltal < 0) {
			JOptionPane.showMessageDialog(null, "Ugyldig, velg et nytt positivt heltall");
			heltal = Integer.parseInt(JOptionPane.showInputDialog("Skriv et nytt heltall: "));
		}
		int fakultetTall = 1;
		for (int i = 1; i <= heltal; i++) {
			fakultetTall = fakultetTall * i;
		}
		JOptionPane.showMessageDialog(null, heltal + "\t\t! er " + fakultetTall);

	}

}
