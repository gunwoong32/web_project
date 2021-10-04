package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.name ="park";		//Person
		sMan.age = 1000;		//Person
		sMan.power =3000;		//Man
		sMan.fly =true;			//SuperMan
		
		System.out.println(sMan);
		
		sMan.think();
		sMan.run();
		sMan.tool();
		sMan.space();
	}

}
