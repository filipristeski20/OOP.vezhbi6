package zadaca2;
import java.util.ArrayList;
import java.util.List;

public class IminjaNaDrzavi {
	public static void main(String[] args) {

        List<String> drzavi = new ArrayList<>();
        drzavi.add("Makedonija");
        drzavi.add("Germanija");
        drzavi.add("Italija");
        drzavi.add("Anglija");

        System.out.println("Listata sodrzhi: " + drzavi.size() + " elementi.");
        System.out.println("Elementite na listata se: " + drzavi);
        if(drzavi.size() > 3){
            drzavi.add("Kina");
            drzavi.add("Turcija");
            System.out.println("Elementite na listata se: " + drzavi);
        }

    }


}
