package 상속;

public class IronManUse {

	public static void main(String[] args) {
		IronMan iMan = new IronMan();
		iMan.suit="마크3";
		iMan.age=50;
		iMan.fly=true;
		iMan.name="아이언맨";
		
		System.out.println(iMan);
		
		iMan.fight();
		iMan.fly();
		iMan.think();
		iMan.tool();
		
	}

}
