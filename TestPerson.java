
public class TestPerson {

	public static void main(String[] args) {
		Pen pen = new Pen(2000);
		Person p = new Person("김주용", 27, pen);
		p.writeName();
	}

}
