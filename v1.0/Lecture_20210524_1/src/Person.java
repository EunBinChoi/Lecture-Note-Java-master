/*
 * 객체지향 (Object-oriented) 언어
 * 
 * 자동차 설계도 (메뉴얼) == 클래스
 * "필드 (속성) + 함수 (기능, 동작)"
 * (color, id)
 * 
 * 
 * 자동차 == 객체 (object)
 * 자동차 주문 -> 자동차 만듦 == 생성자 (constructor)
 * 
 * 
 * 
 * (main 함수)
 * 생성자 호출 - 객체 만듦
 * new Car(); // 1번 생성자 이용
 * new Car("red", 1); // 2번 생성자 이용
 * String color = "red";
 * int id = 1;
 * 
 * 생성자 (반환형 없음, 접근 제어자는 줄 수 있음)
 *
 * Car (){ - 1번
 * 
 * }
 * 
 * Car (String color, int id){ - 2번
 * 		this.color = color;
 * 		this.id = id;
 * }
 *	// color, id 변수를 모름
 * 
 * 매개변수가 비어있으면 디폴트 생성자
 * 매개변수가 여러 개 올 수도 있음
 * 
 * 
 * 생성자를 아예 안 만듦 - 1번은 사용할 수 있음
 * 생성자를 2번만 만듦 - 1번은 사용할 수 없음 (new Car() X)
 * 
 * */


public class Person {
	// 필드 정의
	private String name;
	private int age;
	private String regNum; // 주민등록번호
	private String gender;
	private String email;
	private double height;
	private double weight;
	
	/*
	 * changeName()
	 * incAge()
	 * changeEmail(String newEmail)
	 * changeHeight(double newHeight)
	 * changeWeight(double newWeight)
	 * */
	
	// 생성자 (constructor):
	// 객체가 생성될 때 호출되는 초기화 함수
	// 모든 클래스에는 반드시 하나 이상의 생성자 필요
	// 만약 생성자가 하나도 없을 경우에는 디폴트 생성자 불림
	// 하나라도 생성자가 만들어지면 디폴트 생성자도 만들어줘야 함
	
	// 디폴트 생성자 
	// (default constructor)
	public Person() {
		
	}
////	
	public Person(String name, String regNum){
		this.name = name;
		this.regNum = regNum;
	}
	
	public Person(String name, int age, 
			String regNum, String gender,
			String email, double height, 
			double weight){
		this.name = name;
		this.age = age;
		this.regNum = regNum;
		this.gender = gender;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	public void incAge(int rate) {
		if (rate > 0) {
			this.age = this.age + rate;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터입니다!");
		}
	}
	
	public void printAge() {
		System.out.println("나이 : " + this.age);
	}
	
	public void changeEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public void changeHeight(double newHeight) {
		if(newHeight > 0) {
			this.height = newHeight;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터입니다!");
		}
	}
	
	public void printHeight() {
		System.out.println("신장 : " + this.height);
	}
	
	public void changeWeight(double newWeight) {
		if(newWeight > 0) {
			this.weight = newWeight;
		}
		else {
			System.out.println("[경고] 유효하지 않은 데이터입니다!");
		}
	}
	
	public void printWeight() {
		System.out.println("체중 : " + this.weight);
	}
	// 함수 정의
	/* 반환형 함수이름 (매개변수) {
	 * 	
	 * }
	 * 
	 * 반환형이 없을 경우: void
	 * */
	
	
	/* 필드 (속성)
	 * 이름: String
	 * 나이: int
	 * 주민등록번호: String
	 * 성별: String (Female or Male)
	 * 이메일 주소: String
	 * 신장 (키): double
	 * 체중: double
	 * 
	 * 
	 * 기능 (함수)
	 * changeName()
	 * incAge()
	 * changeEmail()
	 * changeHeight()
	 * changeWeight()
	 * */
}
