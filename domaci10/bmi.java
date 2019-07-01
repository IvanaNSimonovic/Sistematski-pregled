package domaci10;

public class bmi {
	
	
	public int id;
	public String kategorija;
	public String skracenica;
	public double vrednost;
	
	
	public void bmi(double visina, double tezina) {
		
		vrednost=tezina/(visina*visina);
		if (vrednost<18.5) {
			id=0;
			kategorija="Neuhranjenost";
			skracenica="N";
		}
		else if (vrednost>18.5 && vrednost<24.9) {
			id=1;
			kategorija="Idealna masa";
			skracenica="IM";
		}
		else if (vrednost>25 && vrednost<29.9) {
			id=2;
			kategorija="Prekomerna masa";
			skracenica="PM";
		}
		else if (vrednost>30) {
			id=3;
			kategorija="Gojaznost";
			skracenica="G";
		}
	}
}
