package Model;

public class temperature {
	String nomValeur;
	int Valeur;
	
	public temperature() {	
	}
	 public temperature(String nomValeur, int Valeur) {
		 this.setNomValeur(nomValeur);
		 this.setValeur(Valeur);
	 } 
	
	public String getNomValeur() {
		return nomValeur;
	}
	public void setNomValeur(String nomValeur) {
		this.nomValeur = nomValeur;
	}
	public int getValeur() {
		return Valeur;
	}
	public void setValeur(int valeur) {
		Valeur = valeur;
	}
	
}

