package 상속;

public class Manager extends Employee{

	
	int bonus;
	
	public void test() {
		System.out.println("테스트입니다");
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ rrn + "]";
	}
	
	
}
