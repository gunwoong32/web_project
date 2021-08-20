package shop.dto;

public class DTOTest2 {

	public static void main(String[] args) {
		//게시판Bag을 2개 만들어서 값들을 넣어보시고
		//넣을 값들을 프린트해보세요 toString()
		//그림 그려보세요
		
		게시판Bag2 bag = new 게시판Bag2();
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		
		게시판Bag2 bag2 = new 게시판Bag2();
		bag2.setId("banana");
		bag2.setPw("banana");
		bag2.setName("banana");
		bag2.setTel("banana");
		
		System.out.println(bag);
		System.out.println(bag2);
	}

}
