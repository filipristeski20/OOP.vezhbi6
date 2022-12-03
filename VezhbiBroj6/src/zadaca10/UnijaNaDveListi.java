package zadaca10;

import java.util.Arrays;
import java.util.HashSet;

public class UnijaNaDveListi {
	public static void main(String[] args){

		String[] firstList = {"mercedes", "audi", "bmw", "porsche", "citroen", "fiat", "ford", "lambo", "ferrari", "dodge","toyota"};
		String[] secondList = {"ferrari", "brod", "lambo", "avion", "chokolado", "ford", "glushec", "sok", "grizini", "fiat","slushalki"};
		    HashSet<String> union = new HashSet<>();
		    union.addAll(Arrays.asList(firstList));
		    union.addAll(Arrays.asList(secondList));

		    String[] unionArr = {};
		    unionArr = union.toArray(unionArr);
		    System.out.println(Arrays.toString(unionArr));

		}

}
