package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.util.Scanner.*;
public class B4 {

	public static void main(String[] args) {
		int bruttoInn = parseInt(showInputDialog("Bruttolønn: "));
		double skatt = 0;
		final double TRINN_0 = 0.00;
		final double TRINN_1 = 0.0093;
		final double TRINN_2 = 0.0241;
		final double TRINN_3 = 0.1152;
		final double TRINN_4 = 0.1452;
		
		if (bruttoInn > 0 && bruttoInn <= 164100) { 
			skatt = bruttoInn*TRINN_0;
		}
		if (bruttoInn > 164100 && bruttoInn <= 230950) {
			skatt = bruttoInn*TRINN_1;
		}
		if (bruttoInn > 230950 && bruttoInn <= 580650) { 
			skatt = bruttoInn*TRINN_2;
		}	
		if (bruttoInn > 580650 && bruttoInn <= 934051) { 
			skatt = bruttoInn*TRINN_3;
		}	
		if (bruttoInn > 934051) { 
			skatt = bruttoInn*TRINN_4;
		}			
		if (bruttoInn < 0) {
			showMessageDialog(null,"Bruttolønna kan ikkje være negativ");
		}
		
			showMessageDialog(null,"Lønn: " + bruttoInn +" kr \n Skatt: " + skatt + " kr");
		
		
		
		
	}
}
