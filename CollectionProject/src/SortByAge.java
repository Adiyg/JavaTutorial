import java.util.Comparator;

public class SortByAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		//return o1.personAge-o2.personAge;
		return Integer.compare(o1.personAge, o2.personAge);
	}

}
