package zadaca4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOdCeliBroevi {
	 public static void main(String[] args) {

	        List<Integer> listaOdCeliBroevi = new ArrayList<>();
	        listaOdCeliBroevi.add(6);
	        listaOdCeliBroevi.add(435);
	        listaOdCeliBroevi.add(3);
	        listaOdCeliBroevi.add(756);
	        listaOdCeliBroevi.add(543);

	        Collections.sort(listaOdCeliBroevi);
	        System.out.println("Sortirana lista od celobroevi: " + listaOdCeliBroevi);


	    }

}
