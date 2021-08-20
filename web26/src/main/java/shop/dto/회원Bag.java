package shop.dto;

public class 회원Bag {
	//public String id;	//모든 패키지에서 접근가능
	//private String id; //해당 클래스 안에서만 접근가능
	private String id;	//default 접근제어자, 같은 패키지내에서만 접근가능
	private String pw;	//이 변수들은 무슨 변수일까요?
	private String name;// -> 멤버변수입니다
	private String tel;
	//멤버변수,클래스 바로 아래 선언됨
	//변수선언의 위치는 변수의 생존범위를 결정한다. -> 클래스 전역에서 사용
	//전역변수(global, 글로벌 변수), 자동초기화됨.
	//참조형인 경우, null로 초기화된다.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "회원Bag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	//값을 넣을 때는 set변수명(), setId
	//값을 꺼낼 대때는 get변수명() getId
	//setters, getters라고 부른다. -> 자동완성 generate getters and setters
	
}
