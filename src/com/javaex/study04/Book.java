package com.javaex.study04;

public class Book {
	/*질문
	1.필드이름 첫글자는 소문자 이후에 단어들의 첫글자는 대문자?
	2.필드 안에있는 변수를 뭐라고 부르는지
	*/
	
	//필드
	//필드에 변수와 자료형을 적어주고 그 앞에는 접근자를 지정해준다
	//private와 public이 많이 쓰인다.
	//private는 외부로부터 직접적인 데이터 접근을 막아준다
	//이것을 캡슐화라고 한다.
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	//생성자
	/* 
		1. 메인클래스에 이 클래스를 불러올때 동작을 설정할수 있다
		2. 이 생성자는 비워 놓게 될 경우 디폴트 생성자로 적용이 된다.
		3. 파라미터의 갯수, 순서에 따라 같은 이름의 생성자를 여러개 만들 수 있는데
		   이것을 생성자 오버로드라고 한다
		   생성자를 추가로 작성 할 경우 기존에 디폴트 생성자도 써줘야 한다.
		4. this.필드변수명은 이 클래스에 있는 필드를 나타내주고
		   this(파라미터)의 형태로 사용하게 되면 다른 생성자를 가져다 쓸 수 있다.
	*/
	
	//디폴트 생성자
	public Book() {
		
	}
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode++;
	}
	
	//메소드 g-s
	/*
	 1. get, set의 차이를 잘 이해해두기
	 2. get, set의 이름을 바꿀경우 에러가 날 수 있음.
	 */
	//메소드 일반
	public void rent() {//대여기능 메소드
		if(stateCode==1) {
			System.out.println(title+"이(가) 대여되었습니다.");
			stateCode--;
		} else {
			System.out.println("재고가 없습니다.");
		}
	}
	public void print() {//책정보 출력 메소드
		if(stateCode==1) {
		System.out.println(bookNo+", \""+title+"\", \""+author+"\", "+"재고있음");
		} else {
			System.out.println(bookNo+", \""+title+"\", \""+author+"\", "+"대여중");	
		}
	}
}
