package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) throws IOException {
	
	Scanner input = new Scanner (System.in);
	/*
	System.out.println("수입력");
	
	int select ;
	select = input.nextInt();
	 switch(select) {
	 case 1:System.out.println("1입력");break; //케이스 마지막에 브레이크 반드시 입력 없으면 밑에도 실행
	 case 2:System.out.println("2입력");break;// 브레이크 = 빠져나가라
	 case 3:System.out.println("3입력");break;
	 default:System.out.println("그 외의값 입력");  //else와 비슷 (케이스와 매칭 없으면 실행)
	 } //스위치 구문은 이프구문으로 활용가능 
	
	char ch;
	System.out.println("문자입력");
	ch = (char)System.in.read();
	switch(ch) {
	case 'a'://System.out.println("a입력");break; // 의도적으로 생략해서 다음 문자으로 활용가능
	case 'A':System.out.println("A입력"); //브레이크 생략 가능(뒤에 아무런 문장이 없기때문)
	}
	
	
	String s;
	System.out.println("문자열입력");
	s= input.next();
	switch(s) {
	case "안녕":System.out.println("안녕 입력");break;
	case "그래": System.out.println("그레 입력");break;
	//default 생략가능
	}
	System.out.println("다음 문장 실행"); 
	
	
	*/
	
	/*
	//날짜를 입력받아 1일이면 월 2일이면 화 ... 7일 일 8일 월 숫자에 맞춰 요일 출력
	
	while(true) {
			
	//Scanner input= new Scanner(System.in);
	
	System.out.println("날짜입력: ");
	
	int a;
	a= input.nextInt();
	
	switch(a%7) { //범위가 7(월~일)이니깐 7로 나누었을때 나머지로 구분할 수 있다
	case 0:System.out.println("일");break;
	case 1:System.out.println("월");break;
	case 2:System.out.println("화");break;
	case 3:System.out.println("수");break;
	case 4:System.out.println("목");break;
	case 5:System.out.println("금");break;
	case 6:System.out.println("토");break;
		}
	}
	
	*/
	/*
	while(true) {
		System.out.println("실행");
	}
	*/
	
	//변수초기화
	//보편적으로 0으로 수를 둔다
	/*
	char ch=0;
	double dou = 0;
	String str = null; //첫번째 대문자로 만들어진 자료형은 0으로 할 수 없다 (null로 가능)
	int num=10, su=0;
	if (num ==10) {
		su=100;
	}
	System.out.println(su);  //값이 없어서 에러가 발생
	*/
	/*
	int a, b;
	a= 10;
	
	b= ++a+5+5;
	
	
System.out.println(b);

	String home=null,office=null;
	int num;
	
	while(true) {
		System.out.println("1.우리집등록");
		System.out.println("2.회사등록");
		System.out.println("3.등록보기");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("집 주소 입력");
			home = input.next();
			break;
		case 2:System.out.println("회사 주소 입력");
		office= input.next();
		break;
		case 3:
			if(home != null && office != null) {
			System.out.println("우리집: "+home);
			System.out.println("회사: "+office);break;
			}else {
				System.out.println("등록먼저하세요");
			}
		}
		
	}
	
	*/
	/*
	
	int choice;
    String home="";
    String company="";
    
    while(true) {
       System.out.println("1. 우리집 등록\n2. 회사 등록\n3. 등록 보기\n4. 프로그램 종료");
       choice = input.nextInt();
       input.nextLine();
       if(choice == 1) {
          System.out.print("우리집을 등록합니다.\n주소 입력 : ");
          home = input.nextLine();
       }else if(choice == 2) {
          System.out.print("회사를 등록합니다.\n주소 입력 : ");
          company = input.next();            
       }else if(choice == 3) {
          System.out.println("우리집 : "+home);
          System.out.println("회사 : "+company);
       }else if(choice == 4){
          System.out.println("프로그램을 종료합니다.");
          break;
       }else {
          System.out.println("잘못 입력하셨습니다.");
          continue;
          
       }
    }
	
	
	*/
	
	
	
}
}
