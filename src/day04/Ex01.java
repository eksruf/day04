package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) throws IOException {
	
	Scanner input = new Scanner (System.in);
	/*
	System.out.println("���Է�");
	
	int select ;
	select = input.nextInt();
	 switch(select) {
	 case 1:System.out.println("1�Է�");break; //���̽� �������� �극��ũ �ݵ�� �Է� ������ �ؿ��� ����
	 case 2:System.out.println("2�Է�");break;// �극��ũ = ����������
	 case 3:System.out.println("3�Է�");break;
	 default:System.out.println("�� ���ǰ� �Է�");  //else�� ��� (���̽��� ��Ī ������ ����)
	 } //����ġ ������ ������������ Ȱ�밡�� 
	
	char ch;
	System.out.println("�����Է�");
	ch = (char)System.in.read();
	switch(ch) {
	case 'a'://System.out.println("a�Է�");break; // �ǵ������� �����ؼ� ���� �������� Ȱ�밡��
	case 'A':System.out.println("A�Է�"); //�극��ũ ���� ����(�ڿ� �ƹ��� ������ ���⶧��)
	}
	
	
	String s;
	System.out.println("���ڿ��Է�");
	s= input.next();
	switch(s) {
	case "�ȳ�":System.out.println("�ȳ� �Է�");break;
	case "�׷�": System.out.println("�׷� �Է�");break;
	//default ��������
	}
	System.out.println("���� ���� ����"); 
	
	
	*/
	
	/*
	//��¥�� �Է¹޾� 1���̸� �� 2���̸� ȭ ... 7�� �� 8�� �� ���ڿ� ���� ���� ���
	
	while(true) {
			
	//Scanner input= new Scanner(System.in);
	
	System.out.println("��¥�Է�: ");
	
	int a;
	a= input.nextInt();
	
	switch(a%7) { //������ 7(��~��)�̴ϱ� 7�� ���������� �������� ������ �� �ִ�
	case 0:System.out.println("��");break;
	case 1:System.out.println("��");break;
	case 2:System.out.println("ȭ");break;
	case 3:System.out.println("��");break;
	case 4:System.out.println("��");break;
	case 5:System.out.println("��");break;
	case 6:System.out.println("��");break;
		}
	}
	
	*/
	/*
	while(true) {
		System.out.println("����");
	}
	*/
	
	//�����ʱ�ȭ
	//���������� 0���� ���� �д�
	/*
	char ch=0;
	double dou = 0;
	String str = null; //ù��° �빮�ڷ� ������� �ڷ����� 0���� �� �� ���� (null�� ����)
	int num=10, su=0;
	if (num ==10) {
		su=100;
	}
	System.out.println(su);  //���� ��� ������ �߻�
	*/
	/*
	int a, b;
	a= 10;
	
	b= ++a+5+5;
	
	
System.out.println(b);

	String home=null,office=null;
	int num;
	
	while(true) {
		System.out.println("1.�츮�����");
		System.out.println("2.ȸ����");
		System.out.println("3.��Ϻ���");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("�� �ּ� �Է�");
			home = input.next();
			break;
		case 2:System.out.println("ȸ�� �ּ� �Է�");
		office= input.next();
		break;
		case 3:
			if(home != null && office != null) {
			System.out.println("�츮��: "+home);
			System.out.println("ȸ��: "+office);break;
			}else {
				System.out.println("��ϸ����ϼ���");
			}
		}
		
	}
	
	*/
	/*
	
	int choice;
    String home="";
    String company="";
    
    while(true) {
       System.out.println("1. �츮�� ���\n2. ȸ�� ���\n3. ��� ����\n4. ���α׷� ����");
       choice = input.nextInt();
       input.nextLine();
       if(choice == 1) {
          System.out.print("�츮���� ����մϴ�.\n�ּ� �Է� : ");
          home = input.nextLine();
       }else if(choice == 2) {
          System.out.print("ȸ�縦 ����մϴ�.\n�ּ� �Է� : ");
          company = input.next();            
       }else if(choice == 3) {
          System.out.println("�츮�� : "+home);
          System.out.println("ȸ�� : "+company);
       }else if(choice == 4){
          System.out.println("���α׷��� �����մϴ�.");
          break;
       }else {
          System.out.println("�߸� �Է��ϼ̽��ϴ�.");
          continue;
          
       }
    }
	
	
	*/
	
	
	
}
}
