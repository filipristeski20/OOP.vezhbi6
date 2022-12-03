package primer1;
import java.util.ArrayList;
import java.util.List;

public class Glavna {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Stefan");
		lista.add("Maja");
		lista.add("Stefanija");
		lista.add("Ivana");
		lista.add("Elena");
		System.out.println("Listata sodrzhi: " + lista.size() + " elementi.");
		System.out.println("Elementite na listata se: " + lista);
		}

}
