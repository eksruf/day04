package day04;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
		/*
	Scanner scan = new Scanner(System.in);

	int su1, su2;
	
	System.out.println("�� ���� �Է��ϼ���: ");
	su1= scan.nextInt();
	su2 = scan.nextInt();
	
	switch ((su1+su2)%2) {
	case 0:System.out.println("¦��");break;
	case 1:System.out.println("Ȧ��");break;
	}*/
	
	
	/*
	 * int choice; String home=""; String company="";
	 * 
	 * while(true) {
	 * System.out.println("1. �츮�� ���\n2. ȸ�� ���\n3. ��� ����\n4. ���α׷� ����"); choice =
	 * scan.nextInt(); scan.nextLine();
	 * 
	 * switch(choice) { case 1: System.out.print("�츮���� ����մϴ�.\n�ּ� �Է� : "); home =
	 * scan.nextLine(); //���ڸ� ������ ���� ġ�� ���͵� ������ �����Ƿ� ���͸� �����ִ� �ָ� ���ش� break; case 2:
	 * System.out.print("ȸ�縦 ����մϴ�.\n�ּ� �Է� : "); company = scan.nextLine(); break;
	 * case 3: System.out.println("�츮�� : "+home);
	 * System.out.println("ȸ�� : "+company); break; case 4:
	 * System.out.println("���α׷��� �����մϴ�."); System.exit(0); //���⼭ �극��ũ�� ����ġ �극��ũ�� �ٽ�
	 * �ݺ��Ѵ� �׷��Ƿ� �����Ű�� �ڵ带 �ۼ��Ѵ�. default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	 * continue; } }
	 */
	/*
	Scanner scan = new Scanner(System.in);
	int su, num;
	System.out.println("���� �Է�");
	su = scan.nextInt();
	
	num= (su/3)+(su%3);
	
	if(num%2==0) {
		if(su>(num+10))
		{
			System.out.println("¦���̸� �� ũ��");
		}else if(su<(num+10)) {
			System.out.println("¦���̸� �۴�");
		}else if(su==(num+10)) {
			System.out.println("¦���̸� ����");
		}
	}else {
		if(su>(num+10))
		{
			System.out.println("¦���̸� �� ũ��");
		}else if(su<(num+10)) {
			System.out.println("¦���̸� �۴�");
		}else if(su==(num+10)) {
			System.out.println("¦���̸� ����");
		}
	}*/
	
	/*
	 * 3.�������Ǳ� ���Ḧ ���������� �Է¹޴´�. �������� ���� ���ڶ�� �ٽ� �Է����ּ��� ���� ��� ���� �ݾ��� �Է� �Ѵ�. ���� �ݾ��� ����
	 * ���ݺ��� ���ٸ� �ݾ��� �����մϴ� ��� ������ ����� ������� ���� �ܾ� ���
	 */

	
	Scanner scan = new Scanner (System.in);
	int su,m;
	
	System.out.println("1.��Ƽ 100\n2.������200 \n3.Ŀ�� 100");
	
	 System.out.println("���� �־��ּ���");
	 m= scan.nextInt();
	 
	System.out.println("���� ����");
	su = scan.nextInt();
	
	if(su==1) {
		if(m<100) {
			System.out.println("�ݾ׺���");
		}else {
			System.out.println();
		}
	}
	
	
	
	
	
	
}
}
