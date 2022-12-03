package zadaca7;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListOdMailovi2 {
	
	public static void main(String[] args) {

        List<String> listaOdMailovi = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("00");
        for(int i = 1; i <= 20; i++){
            listaOdMailovi.add("mail" + df.format(i) + "@yahoo.com");
        }

        System.out.println(listaOdMailovi);
    }


}
