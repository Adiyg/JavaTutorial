import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		/*ArrayList arrList = new ArrayList();
		arrList.add("Diya");
		arrList.add("Ram");
		arrList.add("Diya");
		arrList.add("Anu");
		System.out.println("Collection of Arraylist");
		System.out.println(arrList);
		
		TreeSet ts1 = new TreeSet();
		ts1.add("Diya");
		ts1.add("Radha");
		ts1.add("Diya");
		ts1.add("Adiya");
		ts1.add("Harshita");
		System.out.println("collection of TreeSet");
		System.out.println(ts1);
		
		TreeSet ts2 = new TreeSet();
		ts2.add(10);
		ts2.add(12);
		ts2.add(10);
		ts2.add(89);
		ts2.add(19);
		System.out.println("Integer collection of TreeSet");
		System.out.println(ts2);
		
		TreeSet ts=new TreeSet();
		ts.add("Diya");
		ts.add("20");
		ts.add("true");
		System.out.println(ts);*/
		
		/*TreeSet<Employee> ts1=new TreeSet<Employee>();
		ts1.add(new Employee(101, "Diya", 33000));
		ts1.add(new Employee(102, "Dinesh", 33000));
		ts1.add(new Employee(105, "anu", 33000));
		ts1.add(new Employee(104, "Harshita", 33000));
		ts1.add(new Employee(103, "Divya", 33000));
		//System.out.println(ts1);
		
		Iterator<Employee> iterator = ts1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());*/
			
			
			TreeSet<Person> ts3=new TreeSet<Person>(new SortByAge());
			ts3.add(new Person(109, "Sam",24));
			ts3.add(new Person(105, "Sameer",25));
			ts3.add(new Person(108, "Samar",20));
			ts3.add(new Person(106, "Samnoor",29));
			for(Person p: ts3) {
				System.out.println(p);
			}
			
		}
		
		
			
	
	}

