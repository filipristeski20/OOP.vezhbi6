package primer5;
import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
	public static void main(String[] args) {
		List<Student> studenti = new ArrayList<Student>();
		Student student1 = new Student("Trajko", "Trajkovski", 1);
		studenti.add(student1);
		studenti.add(new Student ("Petko", "Petkovski", 2));
		for (int i = 0; i < studenti.size(); i ++){
		System.out.println(studenti.get(i).getIme());
		System.out.println(studenti.get(i).getPrezime());
		System.out.println(studenti.get(i).getIndex());
		}
		}

}
