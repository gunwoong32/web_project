package shop.dto;

public class DTOTest {

	public static void main(String[] args) {
		
		회원Bag bag = new 회원Bag();
//		bag.id = "apple";
//		bag.pw = "apple";
//		bag.name = "apple";
//		bag.tel = "apple";
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		System.out.println(bag);//주소를 전달하는 것이다.
		
		회원Bag bag2 = new 회원Bag();
//		bag.id = "melon";
//		bag.pw = "melon";
//		bag.name = "melon";
//		bag.tel = "melon";
		bag2.setId("melon");
		bag2.setPw("melon");
		bag2.setName("melon");
		bag2.setTel("melon");
		System.out.println(bag2);
	}

}
