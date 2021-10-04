package 자바심화;

import java.util.Scanner;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		int enrolment[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수강 신청을 진행합니다");
		System.out.println("원하는 과목을 신청해주세요.");
		while (true) {
			System.out.println("-----------------------------------------");
			System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리");
			System.out.println("-----------------------------------------");
			for (int i = 0; i < enrolment.length; i++) {
				System.out.print(enrolment[i] + "         ");
			}
		
			System.out.println("");
			System.out.println("=========================================");
			System.out.print("원하는 과목코드를 입력해주세요.(종료 0)==> ");
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("신청을 종료합니다\n안녕히가세요.");
				break;
			} else if (choice == 1) {
				if (enrolment[0] < 1) {
					enrolment[0]+=1;
					System.out.println("신청이 완료되었습니다.");
				}
				else {
					System.out.println("신청 불가능합니다.\n다른 코드번호를 입력해주세요");
				}
			}else if (choice ==2) {
				if (enrolment[1] < 1) {
					enrolment[1]+=1;
					System.out.println("신청이 완료되었습니다.");
				}
				else {
					System.out.println("신청 불가능합니다.\n다른 코드번호를 입력해주세요");
				}
			}else if (choice ==3) {
				if (enrolment[2] < 1) {
					enrolment[2]+=1;
					System.out.println("신청이 완료되었습니다.");
				}
				else {
					System.out.println("신청 불가능합니다.\n다른 코드번호를 입력해주세요");
				}
			}else if (choice ==4) {
				if (enrolment[3] < 1) {
					enrolment[3]+=1;
					System.out.println("신청이 완료되었습니다.");
				}
				else {
					System.out.println("신청 불가능합니다.\n다른 코드번호를 입력해주세요");
				}
			}else if (choice ==5) {
				if (enrolment[4] < 1) {
					enrolment[4]+=1;
					System.out.println("신청이 완료되었습니다.");
				}
				else {
					System.out.println("신청 불가능합니다.\n다른 코드번호를 입력해주세요");
				}
			}else {
				System.out.println("1~5중에 선택하고 종료는 0입니다. 다시 선택해주세요");
			}			
			
			
		}
		
		
		
		
	}

}
