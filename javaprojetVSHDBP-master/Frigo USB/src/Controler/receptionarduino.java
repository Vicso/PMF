package Controler;

import Model.*;


public class receptionarduino {
	
temperature mesure = new temperature("mesure", 22);


temperature consigne= new temperature("consigne",mesure.getValeur());

}
