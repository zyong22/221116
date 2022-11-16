// 형제 brother
// 자매 sister
// 키 Key
class Brother{
	Key key;
}
class Sister{
	Key key;
}
class Key{
	
}
public class Test {

	public static void main(String[] args) {
		Brother b = new Brother();
		Key key = new Key();
		b.key = key;
		Sister s = new Sister();
		s.key = key;
		
		System.out.println(b.key == s.key);
	}

}
