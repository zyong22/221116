// 사자(3), 호랑이(4), 표범(5) 세 동물의 사육사가 "길동"

// 동물
// 종, 나이

// 사육사 
// 이름
class Trainer{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer(String name) {
		this.name = name;
	}
	
}
class Animal{
	private String type;
	private int age;
	private Trainer trainer;

	public Animal(String type, int age, Trainer trainer) {
		super();
		this.type = type;
		this.age = age;
		this.trainer = trainer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
	
}
	

public class TestZoo {
	public static void main(String[] args) {
		Trainer t = new Trainer("길동");
		
		Animal lion = new Animal("사자", 3, t);
		Animal tiger = new Animal("호랑이", 4, t);
		Animal led = new Animal("표범", 5, t);
	
	}
	
	
}
