package zadaca11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Presek {
	   public static void main(String[] args) {
		      List<String> l1 = new ArrayList<>();
		        List<String> l2 = new ArrayList<>();
		        l1.add("f");
		        l1.add("a");
		        l1.add("j");
		        l1.add("v");
		        l1.add("t");
		        l2.add("k");
		        l2.add("q");
		        l2.add("j");
		        l2.add("a");
		        l2.add("q");
		        Set<String> s1 = new HashSet<>(l1);
		        Set<String> s2 = new HashSet<>(l2);
		        s1.retainAll(s2);
		        System.out.println(s1);
		    }

}
