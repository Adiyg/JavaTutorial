
public class Person {
	public int personId;
	public String personName;
	public int personAge;
	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
	
}
