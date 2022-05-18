package day04;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
		/*
	Scanner scan = new Scanner(System.in);

	int su1, su2;
	
	System.out.println("두 수를 입력하세여: ");
	su1= scan.nextInt();
	su2 = scan.nextInt();
	
	switch ((su1+su2)%2) {
	case 0:System.out.println("짝수");break;
	case 1:System.out.println("홀수");break;
	}*/
	
	
	/*
	 * int choice; String home=""; String company="";
	 * 
	 * while(true) {
	 * System.out.println("1. 우리집 등록\n2. 회사 등록\n3. 등록 보기\n4. 프로그램 종료"); choice =
	 * scan.nextInt(); scan.nextLine();
	 * 
	 * switch(choice) { case 1: System.out.print("우리집을 등록합니다.\n주소 입력 : "); home =
	 * scan.nextLine(); //숫자를 누르고 엔터 치면 엔터도 값으로 들어오므로 엔터를 버려주는 애를 써준다 break; case 2:
	 * System.out.print("회사를 등록합니다.\n주소 입력 : "); company = scan.nextLine(); break;
	 * case 3: System.out.println("우리집 : "+home);
	 * System.out.println("회사 : "+company); break; case 4:
	 * System.out.println("프로그램을 종료합니다."); System.exit(0); //여기서 브레이크시 스위치 브레이크라서 다시
	 * 반복한다 그러므로 종료시키는 코드를 작성한다. default: System.out.println("잘못 입력하셨습니다.");
	 * continue; } }
	 */
	/*
	Scanner scan = new Scanner(System.in);
	int su, num;
	System.out.println("숫자 입력");
	su = scan.nextInt();
	
	num= (su/3)+(su%3);
	
	if(num%2==0) {
		if(su>(num+10))
		{
			System.out.println("짝수이며 더 크다");
		}else if(su<(num+10)) {
			System.out.println("짝수이며 작다");
		}else if(su==(num+10)) {
			System.out.println("짝수이며 같다");
		}
	}else {
		if(su>(num+10))
		{
			System.out.println("짝수이며 더 크다");
		}else if(su<(num+10)) {
			System.out.println("짝수이며 작다");
		}else if(su==(num+10)) {
			System.out.println("짝수이며 같다");
		}
	}*/
	
	/*
	 * 3.음료자판기 음료를 선택지에서 입력받는다. 선택지에 없는 숫자라면 다시 입력해주세요 문구 출력 넣을 금액을 입력 한다. 넣은 금액이 음료
	 * 가격보다 적다면 금액이 부족합니다 출력 선택한 음료와 가격출력 남은 잔액 출력
	 */

	
	Scanner scan = new Scanner (System.in);
	int su,m;
	
	System.out.println("1.제티 100\n2.복숭아200 \n3.커피 100");
	
	 System.out.println("돈을 넣어주세요");
	 m= scan.nextInt();
	 
	System.out.println("음료 선택");
	su = scan.nextInt();
	
	if(su==1) {
		if(m<100) {
			System.out.println("금액부족");
		}else {
			System.out.println();
		}
	}
	
	
	
	
	
	
}
}
