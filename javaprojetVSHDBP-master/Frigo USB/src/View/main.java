package View;
import Controler.*;
import javax.swing.JPanel;
import Controler.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		last main = new last();
        main.initialize();
        Thread t = new Thread() {
            public void run() { //garde le programme actif pour 1000 seconds
                //récupère données console arduino et les affiches
                try {Thread.sleep(100000);} catch (InterruptedException ie) {}
            }
        };
        t.start();
        System.out.println("Started");
		receptionarduino phase1 = new receptionarduino();
		//Fenetre fen = new Fenetre();

	}

}
