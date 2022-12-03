package zadaca1;
import java.util.ArrayList;
import java.util.List;

public class IminjaNaGradovi {
	

	public static void main(String[] args) {

        List<String> gradovi = new ArrayList<>();
        gradovi.add("Bitola");
        gradovi.add("Skopje");
        gradovi.add("Ohrid");
        gradovi.add("Rim");
        gradovi.add("Berlin");
        gradovi.add("Belgrad");
        gradovi.add("Minhen");
        gradovi.add("Tokio");
        gradovi.add("Atina");
        gradovi.add("Istanbul");
        gradovi.add("Viena");
        gradovi.add("Bern");
        gradovi.add("Madrid");
        gradovi.add("London");

        for(String s: gradovi){
            System.out.println(s);
        }

}
}