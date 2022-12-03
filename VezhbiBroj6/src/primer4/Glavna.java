package primer4;
import java.util.ArrayList;
import java.util.List;
public class Glavna {
	public static void main(String[] args) {
		List<String> footballClubs = new ArrayList<>();
		footballClubs.add("Barcelona");
		footballClubs.add("Real Madrid");
		footballClubs.add("Atletico Madrid");
		footballClubs.remove(1);
		int footballclub = footballClubs.size();
		
		 System.out.println("Goleminata na listata e "+ footballclub);
	}

}
