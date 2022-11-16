class Point1{
	int x, y;
	public void sub(Point1 p) {
		p.x = 100;
		p.y = 200;
	}
}
public class Practice {

	public static void main(String[] args) {
		Point1 obj = new Point1();
		obj.sub(obj);
		System.out.println(obj.x + ", " + obj.y);
	}

}
