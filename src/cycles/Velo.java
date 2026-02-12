package cycles;
import java.util.Random;

public class Velo {

	private static double DEFAUT_BRAQUET;
	private double braquet;
	private double diamRoue;
	private Random gendAlea; // = new Random ()
	
	public static double getDEFAUT_BRAQUET () {
		return DEFAUT_BRAQUET;
	}
	
	public static void setDEFAUT_BRAQUET (double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo (double braquet, double diamRoue) {
		DEFAUT_BRAQUET = 13.0;
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		gendAlea = new Random ();
	}
	
	public Velo (double braquet) {
		DEFAUT_BRAQUET = 13.0;
		this.braquet = braquet;
		this.diamRoue = 0.0;
		gendAlea = new Random ();
	}
	
	public Velo () {
		DEFAUT_BRAQUET = 13.0;
		this.braquet = 0.0;
		this.diamRoue = 0.0;
		gendAlea = new Random ();
	}
	
	public Random getGenAlea () {
		return this.gendAlea;
	}
	
	public void setGenAlea (Random gendAlea) {
		this.gendAlea = gendAlea;
	}
	
	public double getBraquet () {
		return this.braquet;
	}
	
	public void setBraquet (double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue () {
		return this.diamRoue;
	}
	
	public void setDiamRoue (double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public String toString () {
		return "Velo[braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance (double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * this.braquet * this.diamRoue * this.gendAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo v = new Velo(5.2, 8.6);
		System.out.println(getDEFAUT_BRAQUET());
		System.out.println(v.getGenAlea().nextDouble());
		System.out.println(v.getBraquet());
		System.out.println(v.getDiamRoue());
		System.out.println(v.getPuissance(0.7));
		setDEFAUT_BRAQUET(8.9);
		v.setGenAlea(new Random ());
		v.setBraquet(6.3);
		v.setDiamRoue(7.5);
		System.out.println(getDEFAUT_BRAQUET());
		System.out.println(v.getGenAlea().nextDouble());
		System.out.println(v.getBraquet());
		System.out.println(v.getDiamRoue());
		System.out.println(v.getPuissance(0.3));
	}

}
