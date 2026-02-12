package cycles;

import java.util.Random;

public class VeloElec extends Velo {
	
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	private double facteurPuissanceMoteur;
	
	public VeloElec (double braquet, double diamRoue, double facteurPuissance) {
		super(braquet, diamRoue);
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 13.0;
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	
	public VeloElec (double diamRoue, double facteurPuissance) {
		super(diamRoue);
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 13.0;
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	
	public VeloElec () {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 13.0;
		this.facteurPuissanceMoteur = 0.0;
	}
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR () {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR (double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur () {
		return this.facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur (double facteurPuissance) {
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	
	public String toString () {
		return "VeloElec[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance (double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * this.facteurPuissanceMoteur;
 	}
	
	public static void main(String[] args) {
		VeloElec vE = new VeloElec(5.2, 0.6);
		System.out.println(getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		System.out.println(vE.getFacteurPuissanceMoteur());
		System.out.println(vE);
		System.out.println(vE.getPuissance(0.7));
		setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(0.9);
		vE.setFacteurPuissanceMoteur(0.4);
		System.out.println(getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		System.out.println(vE.getFacteurPuissanceMoteur());
		System.out.println(vE);
		System.out.println(vE.getPuissance(0.5));
	}

}
