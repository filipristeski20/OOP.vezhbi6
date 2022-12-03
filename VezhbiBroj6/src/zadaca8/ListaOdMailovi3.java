package zadaca8;
import java.util.ArrayList;
import java.util.List;

public class ListaOdMailovi3 {
	public static void main(String[] args) {

        List<String> listaOdStringoviMail = new ArrayList<>();

        int multiplier = 5;

        for(int i = 1; i <= 4; i++){
            listaOdStringoviMail.add("mail" + i * multiplier + "@yahoo.com");
        }
           System.out.println(listaOdStringoviMail);

       }


}
