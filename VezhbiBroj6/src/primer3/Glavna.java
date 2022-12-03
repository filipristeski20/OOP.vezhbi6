package primer3;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 

public class Glavna {
	public static void main(String[] args) {
		List<String> fakulteti = new ArrayList<>();
		fakulteti.add("FIKT");
		fakulteti.add("PMF");
		fakulteti.add("FINKI");
		System.out.println("Lista : "+fakulteti);  
		Collections.sort(fakulteti); 
		System.out.println("Sortirana lista : "+fakulteti); 
		
	}
	

}
