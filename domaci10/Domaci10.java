package domaci10;

import java.util.Scanner;

public class Domaci10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Osoba[] nizOsoba=new Osoba[10];
		System.out.println("Dobrodosli na sistematski pregled!");
		System.out.println("----------------------------------");
		System.out.println("Unesite osobe:");
		String i, p;
		double v,t;
		i=s.next();
		Osoba o= new Osoba(i,p=null,v=0,t=0);
			for(int j=0; j<nizOsoba.length; j++) {
				if (i.equals("kraj")) break;
				p=s.next();
				o.setIme(i+" "+p);
				v=s.nextDouble();
				o.setVisina(v);
				t=s.nextDouble();
				o.setTezina(t);
				nizOsoba[j]=o;
				i=s.next();
			}
			System.out.println("Osobe uspesno ucitane!");
			System.out.println("-----------------------");
			for(int j=0;j<nizOsoba.length;j++) {
				if (!(nizOsoba[j]==null)) {
				System.out.println(nizOsoba[j]);
			    }
			
		    }	
	  }

}
