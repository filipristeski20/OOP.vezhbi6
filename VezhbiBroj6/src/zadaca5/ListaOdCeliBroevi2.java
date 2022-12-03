package zadaca5;
import java.util.ArrayList;
import java.util.List;

public class ListaOdCeliBroevi2 {
	public static void main(String[] args) {

        List<Integer> listaOdCeliBroevi = new ArrayList<>();
        listaOdCeliBroevi.add(42);
        listaOdCeliBroevi.add(235);
        listaOdCeliBroevi.add(767);
        listaOdCeliBroevi.add(123);
        listaOdCeliBroevi.add(9);

        System.out.println("Vtoriot element na listata e: " + listaOdCeliBroevi.get(2));
    }


}
