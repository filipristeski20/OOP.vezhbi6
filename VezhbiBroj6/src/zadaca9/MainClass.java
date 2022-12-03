package zadaca9;

import java.util.ArrayList;
import java.util.List;


public class MainClass {
	 public static void main(String[] args){
	        List<Fakultet> listaOdFakulteti = new ArrayList<>();
	        listaOdFakulteti.add(new Fakultet("FIKT", 2,500));
	        listaOdFakulteti.add(new Fakultet("FINKI", 4,3000));
	        listaOdFakulteti.add(new Fakultet("FEIT", 2,100));
	        listaOdFakulteti.add(new Fakultet("PMF", 10,300));
	        listaOdFakulteti.add(new Fakultet("Biotehnicki", 3,250));


	        for(Fakultet fakultet : listaOdFakulteti){
	            System.out.println(fakultet.toString());
	        }

	    }

}
