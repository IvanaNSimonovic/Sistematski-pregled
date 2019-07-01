package domaci10;

public class Osoba {
	
	private String ime;
	private double visina;
	private double tezina;
	
	public Osoba (String i, String p, double v, double t) {
		ime=i+" "+p;
		visina=v;
		tezina=t;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}



	public void setVisina(double visina) {
		this.visina = visina;
	}



	public void setTezina(double tezina) {
		this.tezina = tezina;
	}



	public double bmI(double v, double t) {
		double bmI = t/(v*v);
		return bmI;
	}
	
	public String bmi_kategorija(double bmI) {
	String bmi_kategorija=null;
	double b=bmI(visina, tezina);
	if (b<18.5) bmi_kategorija="Neuhranjenost";
	if (b>=18.5 && b<=24.9) bmi_kategorija="Idealna masa";
	if (b>=25 && b<=29.9) bmi_kategorija="Prekomerna masa";
	if (b>=30) bmi_kategorija="Gojaznost";
	
	return bmi_kategorija;
	
	}
	
	public String toString() {
	    String str=ime+" ("+visina+", "+tezina+"): "+ bmI(visina, tezina)+" "+bmi_kategorija(bmI(visina, tezina));
		return str;
	}

}
