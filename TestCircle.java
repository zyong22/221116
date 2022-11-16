// 2차원 평면상의 좌표를 나타내는 Point 클래스
// 가로 x 세로 y

// 2차원 평면상에 중심점을 가지는 원
// 중심점 가로 좌표, 세로 좌표
// 반지름

public class TestCircle {
	public static void main(String[] args) {
		// 중심좌표가 (2,4) 반지름이 5인 원
		Circle c = new Circle(new Point(2,4), 5);
		
		// 위의 원 중심정 (5, 7)로 변경
//		c.getCenter().setX(5);
//		c.getCenter().setY(7);
		c.setCenter(new Point(5, 7));
		
		// 위의 원 c 중심점 x 좌표를 알아봅시다
		int x = c.getCenter().getX();
		int y = c.getCenter().getY();
		System.out.println(x);
	}

}
