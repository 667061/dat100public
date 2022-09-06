package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poengInn = parseInt(showInputDialog("Poengsum nummer " + i ));			
			
			if (poengInn < 0 || poengInn > 100) {
				showMessageDialog(null, "Ugyldig, poengsummen må være mellom 0 og 100");
				i--;
			}
			if (poengInn <= 39 && poengInn >= 0) {
				showMessageDialog(null, "Poengsum nummer " + i + " gir karakter F");
			}
			if (poengInn <= 49 && poengInn >= 40) {
				showMessageDialog(null, "Poengsum nummer " + i + " gir karakter E");
			}
			if (poengInn <= 59 && poengInn >= 50) {
				showMessageDialog(null, "Poengsum nummer " + i + " gir karakter D");
			}
			if (poengInn <= 79 && poengInn >= 60) {
				showMessageDialog(null, "Poengsum nummer " + i + " gir karakter C");
			}
			if (poengInn <= 89 && poengInn >= 80) {
				showMessageDialog(null, "Poengsum nummer " + i + " gir karakter B");
			}
			if (poengInn <= 100 && poengInn >= 90) {
				showMessageDialog(null, "Poengsum nummer " + i + " gir karakter A");
			}
			
			
			
		}

	}

}
