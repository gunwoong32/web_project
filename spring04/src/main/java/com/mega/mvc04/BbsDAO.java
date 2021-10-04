package com.mega.mvc04;

public class BbsDAO {

	public void create(BbsDTO dto) {
		System.out.println(dto.getNo());
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		System.out.println(dto.getWriter());
	}
	
	
}
