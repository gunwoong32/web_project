package 상속;

public class IronMan extends Person{

	boolean fly;
	int power;
	String suit;
	
	public void fly() {
		System.out.println("날아다닌다. ");
	}
	public void fight() {
		System.out.println("싸운다. ");
	}
	@Override
	public String toString() {
		return "IronMan [fly=" + fly + ", power=" + power + ", suit=" + suit + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
