package javalesson;

import java.util.Calendar;
import java.util.Scanner;

class myInt{
	int a;//�������, �ʵ�
	int b;
	//method1();
	//method2();
	public int getA(){ //getter �Լ� - �����ϰ� �ִ� ��������� ���� ������ ��� 
		return a;
	};
	public void setA(int a){ //setter �Լ� - ���� ��������� �����Ҷ� ���
		this.a = a;
	}
	
	public int getB(){ //getter �Լ� - �����ϰ� �ִ� ��������� ���� ������ ��� 
		return b;
	};
	public void setB(int b){ //setter �Լ� - ���� ��������� �����Ҷ� ���
		this.b = b;
	}
	
}
public class PrintEx {
	public static void main(String[] args) {
		System.out.println("== main ���� ==");
		// TODO Auto-generated method stub

		// print1();//
		// print2();//
		// print3();//����

		/*
		 * \n \t \b �ڷ� ��ĭ �̵� \r ���� �� ������ �̵� \\ '\'�� ��� \' '''�� ��� \"  '"'�� ���
		 */
		// print4();//���弭��
		// variable1();//����
		// datatype1();//����������
		// datatype2();
		// ascii();//ascii ���
		// bool();//boolean
		// string();//String
		// input();//�ܼ��Է¹ޱ�
		// operator1();//������
		// operator2();//���迬��
		// ���迬����: ==, !=, >, <, >=, <=
		// operator3();//++, --, ������ �켱����
		// ��ġ����������: a++ a���� ����� �Ŀ� 1���� ������Ʈ
		// ��ġ����������: --a a���� 1���� ������Ʈ �� �Ŀ� a���� ���
		// ������������������-����
		// for01();//������ ���
		// operator4();//�������� - AND &&, OR ||, NOT !
		// ��������: &&, ||, !
		// operator5();//��Ʈ������ - AND &, OR |, EXOR ^
		// ��Ʈ������: &, |, ^, ~, <<, >>
		// operator6_form();//������ ����
		// datetime();
		// control_3();//3�׿�����(���׿�����)
		// gugudanSum();//�ΰ��� �Է��� �޾Ƽ� ����, ���� �������� �������� ���

		// whileEx();//while ���, �޴����� �Լ�����

//		int ret = 0;
//		ret = dowhileEx();// ���ʹ����뿹�� do~while
//		System.out.println("dowhileEx�� ���� �ڵ�: " + ret);
//		System.out.println("== main  ==");
		
		//control_basic();
		
		//array_1();
		//calc();
		//array_ex5_23();//����5.23
		
		//string_f1();//���ڿ� ó��- ���ڿ�����, ���ڹٲٱ�, length(), charAt()   
		//string_f2();//���ڿ� ó��- ���ڿ���ġã��-indexOf(), lastIndexOf()
		//string_f3(); //���ڿ�ó��- ���ڿ��� �ٲٱ� replace()
		//string_f4(); //���ڿ�ó��- ���ڿ��� �߶󳻱� substring()
		//string_f5(); //���ڿ�ó��- ���ڿ��� ���� split()
		//string_f6();//toUpperCase(), toLowerCase(), trim()
		//string_ex();//���ڿ�ó������
		//string_f7();//���ں� compareTo(), ���ڿ�����Ȯ�� contains(), ���ڿ�������Ȯ�� equals()
		//string_ex2();//���Ǳ�
		
		//method_ex1();//call by value
		//method_ex2();//call by reference  --> get(), set()
		method_ex3_swap();
	}
	public static void method_ex3_swap() {
		myInt m = new myInt();//Ŭ���� �ν��Ͻ� ����
		m.setA(10);
		m.setB(100);
		System.out.println("m.getA():"+ m.getA() );
		System.out.println("m.getB():"+ m.getB() );
		
		func3_swap(m);

		System.out.println("m.getA():"+ m.getA() );
		System.out.println("m.getB():"+ m.getB() );
		
		func3_swap2(m);
		System.out.println("m.getA():"+ m.getA() );
		System.out.println("m.getB():"+ m.getB() );
	}
	static void func3_swap2(myInt m) {
		System.out.println("= func3_swap2 =");
		int t;
		t = m.getA();
		m.setA(m.b);
		m.setB(t);
	}
	
	static void func3_swap(myInt m) {
		System.out.println("= func3_swap =");
		int t;
		t = m.a;
		m.a = m.b;
		m.b=t;
	}
	static void func2(myInt m) { //Ŭ���� ��ü�� �Ķ����(�Ű�����) ����)
		m.a = m.a + 10;
		
		System.out.println("func2: "+ m.a);
	}
	public static void method_ex2() { //call by reference
		myInt m = new myInt();//Ŭ���� �ν��Ͻ� ����
		
		m.a=10; //a=10 Ŭ������ ����a �ʱ�ȭ
		System.out.println("m.a: "+ m.a);
		func2(m);
		
		System.out.println("method_ex2: "+ m.a);
	}
	static void func1(int a) {
		a=a+1;
		System.out.println("func1: "+a);
	}
	public static void method_ex1() { //call by value
		int a=10;
		System.out.println(a);
		func1(a);
		System.out.println("method_ex1: "+a);
		
	}
	public static void calc() {
		int a=10;
		int b=20;
		
		System.out.printf("������:%d, �����: %d", a, b);
		System.out.printf("a/b = %f", (float)a/b);
		//��        a/b
		//������   a%d
	}
	
	public static void array_ex5_23() {
		String [][] words= {
			{"chair","����"}
			,{"computer","��ǻ��"}
			,{"integer","����"}
			,{"array","�迭"}
			,{"string","���ڿ�"}
		};
			
		Scanner scan = new Scanner(System.in);
		
		int n=0;
		int t=words.length;
		
		System.out.println("�ܾ��� ���� ���纸����.");
		for(int i=0;i<t;i++) {
			//�ܾ �ִ� �׸��� �Է¹ް� �´��� �亯....
			System.out.printf("[Q%d] %s ? ", i+1, words[i][1] );
			String ans = scan.nextLine();
			
			if(ans.equals(words[i][0])) {
				System.out.println("�����Դϴ�");
				n++;
			}else{
				System.out.println("�����Դϴ� - ������ " + words[i][0]);
			};
		}
		if(t==0) {
			System.out.println("����: 0���� ������ �ֽ��ϴ�");
			return;
		}
		
		float f =(float)n/t; // 123.123123123
		
		System.out.printf("������:%d, �����: %d", t, n); 
		System.out.printf("1)������: %3.2f", f*100);
		
	}
	
	
	static final String SELECT_MILK = "1";
	static final String SELECT_AMERICANO = "2";
	static final String SELECT_CAPUCCINO = "3";
	
	public static void string_ex2() {
		Scanner scan = new Scanner(System.in);
		String s, m;
		
		System.out.println("���� �Է� : ");
		m = scan.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==���Ǳ� �޴�= ");
		m = scan.nextLine();
		System.out.println("1. ��ũĿ��,  500��");
		System.out.println("2. �Ƹ޸�ī��, 1000��");
		System.out.println("3. īǪġ��, 1500��");
		
		System.out.println("���Ǳ� �޴��� ����: ");
		s = scan.nextLine();
	
		if(s.equals(SELECT_MILK)) {
			
		}else if(s.equals(SELECT_AMERICANO)) {
			
		}else if(s.equals(SELECT_CAPUCCINO)) {
			
		}else {
			
		}
		
		switch(s) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		default:
			break;
		}
		
		System.out.println("���� ������ ");
		System.out.println("Ŀ�� ��� �Ϸ�");
		System.out.println("�ܵ���ȯ ");
		
		System.out.println("==Ŀ�ǰ� ���Խ��ϴ�= ");
	}
	public static void string_f7() {
		Scanner scan = new Scanner(System.in);
		String s1, s2, s3;
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		s1 = scan.nextLine();
		System.out.println("���� ���ڿ��� �Է��ϼ���: ");
		s2 = scan.nextLine();
	
		System.out.println();
		System.out.println("s1:["+s1+"]");
		System.out.println("s2:["+s2+"]");
		System.out.println("1) ���ڿ� ��: "+s1.compareTo(s2));
		
		System.out.println();
		System.out.println("2) ���ڿ��̰�������: " + s1.equals(s2));
		
		System.out.println();
		System.out.println("�˻��� �ܾ �Է��ϼ���: ");
		s3 = scan.nextLine();
		System.out.println("3) �ܾ� ����Ȯ��: "+s1.contains(s3));
		
	}
	public static void string_ex() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		s = scan.nextLine();
	
		String r = "";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				r += s.substring(i, i+1);
			}
			System.out.println("�Է¹��ڿ�:["+s+"]");
			System.out.println("�������� ���ڿ�:["+r+"]");
		}
	}
	public static void string_f6() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		s = scan.nextLine();
		System.out.println();
		System.out.println("�Էµ� ���ڿ�:["+s +"]");
		System.out.println("1) �빮�ں�ȯ: "+ s.toUpperCase());
		System.out.println("2) �ҹ��ں�ȯ: "+s.toLowerCase());
		System.out.println("3) ��������(trim):["+s.trim()+"]");
		
		
	}
	public static void string_f5() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��ϼ���(�޸��� ���ҵ˴ϴ�): ");
		s = scan.nextLine();
		String s2[] = s.split(",");
		System.out.println("s1:"+s2[0]);
		System.out.println("s2:"+s2[1]);
	}
	public static void string_f4() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��ϼ���(�޸��� ���ҵ˴ϴ�): ");
		s = scan.nextLine();
		
		System.out.println("�߶� ���ڿ� ��ġ�� �Է��ϼ���");
		System.out.println("����:");
		int n1 = scan.nextInt();
		System.out.println("��:");
		int n2 = scan.nextInt();
		
		System.out.println("�߶� ���ڿ�: "+ s.substring(n1,n2));
		
	}
	public static void string_f3() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		s = scan.nextLine();
		
		//���ڿ���ġã��-indexOf(), lastIndexOf()
		System.out.print("\n�˻��� �ܾ� �Է�: ");
		String f = scan.nextLine();
		System.out.println(f);
		
		System.out.print("\n��ü�� �ܾ �Է�: ");
		String r = scan.nextLine();
		System.out.println(r);
		
		String rep = s.replace(f, r);
		System.out.println();
		System.out.print("�ܾ�ٲ� ���ڿ�:[" +rep +"]");
		
		
			
	}
	public static void string_f2() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		s = scan.nextLine();
		
		//���ڿ���ġã��-indexOf(), lastIndexOf()
		System.out.print("\n�˻��� ���ڿ��� �Է�: ");
		String f = scan.nextLine();
		System.out.println(f);
		
		System.out.println();
		System.out.print("�Էµ� ���ڿ�:[" +s +"]");
		
		System.out.println("\nó����ġ:"+s.indexOf(f));//--�˻����ڿ�ó����ġ���
		System.out.println("\n��������ġ:"+s.lastIndexOf(f));//--�˻����ڿ���������ġ���

	}
	public static void string_f1() {
		
		String s = "abcd1234";
		int n = 0;
		n =  s.length();
		
		System.out.println("���ڿ��� ����:"+n);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		s = scan.nextLine();
		System.out.println("�Է��� ���ڿ��� ����:"+s.length());
		
	
		//���ڿ�Ȯ�� - startsWidth(), endsWidth()
		if(!s.startsWith("(")) {
			System.out.printf("(");
		}
		
		//���ڿ���ġ - charAt()
		//����Ҷ� ���ڸ� �ٲ��ֱ�
		//abcdefghijklmnopqrstuvwxyz
		//0123456789
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a')
				System.out.printf("%C", '#');
			else
				System.out.printf("%C", s.charAt(i));
			
		}
		
		if(!s.endsWith(")")) {
			System.out.printf(")");
		}
		
	}
	
	public static void array_1() {
		// ������ �����ϸ� ������ ������� �����߻��� ���� �ְ� �ð��� ���� �ɸ���.
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		a1=1;
		a2=a1*2;
		a3=a1*3;
		a4=a1*4;
		a5=a1*5;
		a6=a1*6;
		a7=a1*7;
		a8=a1*8;
		a9=a1*9;
		a10=a1*10;
		
		System.out.printf("data: [%d][%d][%d][%d][%d][%d][%d][%d][%d][%d] "
				, a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);

		
		//-----------------------------------
		// ������ �迭�� �ٲٰ�, for ������ ����ؼ� �迭�� �Է�, ����� �� �ִ�. 
		//�迭(array) ���ӵȵ�����Ÿ���� ���� ����, ���ӵ� ���� �迭�̶�� ����
		int [] a = new int[10];
		int c[];
		c = new int [10];
		
		
		//int a[10] //c ���α׷���
		// ���� �����س��´�(�Է�)
		for (int i=0;i<10;i++) {
			if(i==0) {
				a[i]=1;
			}else {
				a[i]=a[0]*(i+1);
			}
		}
		// ���� �ҷ����� (���)
		System.out.println();
		System.out.print("data: ");
		for (int i=0;i<10;i++) {
			System.out.print("["+a[i]+"]");
		}
		
		//-----------------------------------
		// for ������ ���� �ڵ���̴� ������ �迭�� ������ �÷��� ����� �� �ִ�.
		int n=1000;
		int b[] = new int[n];
		
		//int a[10] //c ���α׷���
		// ���� �����س��´�(�Է�)
		for (int i=0;i<n;i++) {
			if(i==0) {
				b[i]=1;
			}else {
				b[i]=b[0]*(i+1);
			}
		}
		// ���� �ҷ����� (���)
		System.out.println();
		System.out.print("data: ");
		for (int i=0;i<n;i++) {
			System.out.print("["+b[i]+"]");
			
			if((i+1)%10==0) {
				System.out.println();
			}
		}
	}
	
	public static void control_if() {
		System.out.println("== if ������ ����� ���� ���� == ");
		System.out.println("������ ������ ���մϴ�. ���ڸ� �Է����ּ���(1~12): ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(3<=a && a<=5) {
			System.out.println("�� �Դϴ�");
		}else if(6<=a && a<=8){
			System.out.println("���� �Դϴ�");
		}else if(9<=a && a<=11) {
			System.out.println("���� �Դϴ�");
		}else if(a==12 || a==1 || a==2) {
			System.out.println("�ܿ� �Դϴ�");
		}else {
			System.out.println("�߸��Է��߽��ϴ�. 1��~12�� ���̿��� �Է����ּ���");
		}
	}
	public static void control_switch() {
		System.out.println("== switch ������ ����� ���� ���� == ");
		System.out.println("������ ������ ���մϴ�. ���ڸ� �Է����ּ���(1~12): ");
		// 345-> ��, 678-> ����, 91011->����, 12,1,2->�ܿ�
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 3:// if(a==3)
		case 4:// if(a==4)
		case 5:// if(a==5)
			System.out.println("�� �Դϴ�");
			break;
		case 6:// if(a==6)
		case 7:// if(a==7)
		case 8:// if(a==8)
			System.out.println("���� �Դϴ�");
			break;
		case 9:// if(a==9)
		case 10:// if(a==10)
		case 11:// if(a==11)
			System.out.println("���� �Դϴ�");
			break;
		case 12:// if(a==12)
		case 1:// if(a==1)
		case 2:// if(a==2)
			System.out.println("�ܿ� �Դϴ�");
			break;
		default: //else { }
			System.out.println("�߸��Է��߽��ϴ�. 1��~12�� ���̿��� �Է����ּ���");
			break;
		
		}
	}
	public static void control_for() {
		System.out.println("== for ������ ����� ���� ���� == ");
		System.out.println("== ������ ����, ����� �������� ������ �����ּ��� == ");
		System.out.println("������ �����ܿ� ���� ���ڸ� �Է����ּ���(1~) : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("�� �����ܿ� ����  ���ڸ� �Է����ּ���(1~9) : ");
		int b = scan.nextInt();
		for(int i=a;i<=b;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%dx%d = %d", i,j,i*j);
				System.out.println();
			}
			System.out.println();	
		}
	}
	public static void control_while() {
		System.out.println("== while ������ ����� ���� ���� == ");
		System.out.println("== 1���� �Է¹��� ���ڱ��� ������ ����== ");
		System.out.println("���ڸ� �Է����ּ���(1~200000) : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i=0;
		int s=0;
		while(i<a) {//a=2?
			i++;
			s+=i;//1+2
		//
		}
		System.out.printf("1���� %d������ ��: %d", a,s);
	}
	public static void control_dowhile() {
		System.out.println("== do while ������ ����� ���� ���� == ");
		System.out.println("== 1���� �Է¹��� ���ڱ��� ������ ����== ");
		System.out.println("���ڸ� �Է����ּ���(1~200000) : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int s=0;
		int i=0;
		do {
			//���
			i++;
			s+=i;
		}while(i<a);
		System.out.printf("1���� %d������ ��: %d", a,s);
	}
	public static int control_menu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� �մϴ�. if, for, while, do while, which ");
		System.out.println("------------------");
		System.out.println("�޴� 1) if  ");
		System.out.println("�޴� 2) switch ");
		System.out.println("�޴� 3) for ");
		System.out.println("�޴� 4) while ");
		System.out.println("�޴� 5) do~while ");
		System.out.println("�޴� 9) �޴� ");
		System.out.println("�޴� 0) ���� ");
		System.out.println("------------------");
		System.out.println("�޴��� �����ϼ���: ");
		
		int m = scan.nextInt();
		
		return m;
	}
	public static void control_basic() {
		int m=0;
		do{
			System.out.println();
			m = control_menu();
			System.out.println();
			switch(m) {
			case 1:
				control_if();
				break;
			case 2:
				control_switch();
				break;
			case 3:
				control_for();
				break;
			case 4:
				control_while();
				break;	
			case 5:
				control_dowhile();
				break;
			case 9:
				continue;
			case 0:
				break;
			default:
				System.out.println("�޴��� Ȯ���ϰ� �Է����ּ���");
				break;
			}
			
		}while(m != 0);
		
		return ;
	}
	public static int dowhileEx() {
		System.out.println("dowhile, while ������ ���մϴ�");
		System.out.println("�ݺ� ȸ���� �Է����ּ���: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i=0;
		while(i<a) {
			System.out.println("while ���� ����....");
			i++;
			if(i>10) {
				System.out.printf("while���Ƚ��: %d\n", i);
				return 991;
			}
		}
		System.out.println("= while ��� �� = ");
		int j=0;
		do {
			System.out.println("do~while ���� ����....");
			j++;
			if(j>15) {
				break;
			}
			
		}while(j<a);
		System.out.println("= do~while ��� �� = ");
		System.out.printf("while���Ƚ��: %d", i);
		System.out.printf("\ndo while���Ƚ��: %d", j);
		
		return 0;
		
	}
	public static void whileEx_menu() {
		System.out.println("�������� ������ݴϴ�");
		System.out.println("------------------");
		System.out.println("�޴� 1) ���糯�ڽð� ");
		System.out.println("�޴� 2) ��������� ");
		System.out.println("�޴� 3) ���� ");
		System.out.println("�޴� 9) �޴� ");
		System.out.println("�޴� 0) ���� ");
		System.out.println("------------------");
		System.out.println("�޴��� �����ϼ���: ");
	}
	public static void whileEx() {
		Scanner scan = new Scanner(System.in);// �����Է�
				
		int a;
		//int i=0;
		whileEx_menu();
		while(true) {
			a = scan.nextInt();
			if(a==0) {
				System.out.println("�����մϴ�");
				break;
			}
			if(a==9) {
				System.out.println("�޴��� �ȳ��մϴ�\n");
				whileEx_menu();
				continue;
			}
			if(a==1) {
				System.out.println("���糯�ڽð��� �ȳ��մϴ�");
				datetime_memu();
				
			}else if(a==2) {
				System.out.println("����������� ����մϴ�");
				gugudan_menu();
				
			}else if(a==3) {
				System.out.println("���⸦ �����մϴ�");
				//calculator_menu();
				operator1();
			}else {
				System.out.println("�޴��׸� �����ϴ�\n");
				
			}
			
			System.out.println("����Ϸ��� �޴��� �����ϼ���: ");
		}
		
		
		
		
		
	}
	public static void gugudan_menu() {
		System.out.println("����� �������� �Է��ϼ���:");
		int s;
		Scanner scan = new Scanner(System.in);// �����Է�
		s = scan.nextInt();
		for (int j = 1; j <= 9; j++) {
			int r = 0;
			r = s * j;
			System.out.printf("%d x %d = %d \n", s, j, r);
		}
		System.out.println();
			
	}

	public static void gugudanSum() {

		int a, b;
		Scanner scan = new Scanner(System.in);// �����Է�

		System.out.println("����, ������ �Է¹޾Ƽ� �������� ����մϴ�");
		System.out.println("������ ������) ���� a�� �Է��ϼ���: ");
		a = scan.nextInt();
		System.out.println("�� ������) ���� b�� �Է��ϼ���: ");
		b = scan.nextInt();

		int s = 0;
		System.out.println("9x9���� ����մϴ�");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int r = 0;
				r = i * j;
				System.out.printf("%d x %d = %d \n", i, j, r);
				// s+=r;
				s = s + r;
			}
			System.out.println();

		}
		System.out.println("�������� �������� �ջ� ���=" + s);
	}
	public static void datetime_memu() {
		int h; 
		Calendar cal = Calendar.getInstance();
		h= cal.get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = h>12?"PM":"AM";
		
		System.out.println("1) ����ð�:"+ampm+" "+h);
		System.out.printf("2) ���糯�ڿ� �ð�: [%1$tF %tT]%n"
				, Calendar.getInstance());
		
	}
	public static void control_3() {
		int h; 
		Calendar cal = Calendar.getInstance();
		h= cal.get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = h>12?"PM":"AM";
		System.out.println("1) ����ð�:"+ampm+" "+h);
		
		if(h>12) {
			ampm="PM";
		}else {
			ampm="AM";
		}
		System.out.println("2) ����ð�:"+ampm+" "+h);
		
		System.out.println();
		int p;
		int sensor_p=1000;
		String r;
		p=sensor_p>100? 10: -10;
		r=p>0? "����":"����";
		System.out.println("����:"+r+", ���� ����:"+p);
		
		String s;
		s=(r.equals("����"))?"�������Դϴ�":"�����ϰ� ���� �ʽ��ϴ�";
		System.out.println("�����Ǵ�:"+ s);
		
	}
	public static void datetime() {
		System.out.println("datetime�� ���� ����");
		System.out.println();
		System.out.printf("Local time�� ���: [%tT], 14:27:38 %n", Calendar.getInstance());
		System.out.printf("Local time�� ���: [%tr], 02:27:24 ���� %n", Calendar.getInstance());
		System.out.printf("Local time�� ���: [%tF], 2019-07-09  %n", Calendar.getInstance());
		System.out.printf("Local time�� ���: [%1$tF %1$tA] 2019-07-09 ȭ����%n", Calendar.getInstance());
		System.out.printf("Local time�� ���: [%1$tF %tT], 14:27:38 %n", Calendar.getInstance());
		
		int h; 
		Calendar cal = Calendar.getInstance();
		h= cal.get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = h>12?"PM":"AM";
		System.out.println("����ð�:"+ampm+" "+h);
		
		//�����Ǻ�
		// �� 3~5, ����6~8, ����9~11, �ܿ�12~2
		int m,d;
		String mm="��";
		m= cal.get(Calendar.MONTH);
		m+=1;
		d= cal.get(Calendar.DAY_OF_MONTH);
		switch(m) {
		case 3:
		case 4:
		case 5:
			mm="��";
			break;
		case 6:
		case 7:
		case 8:
			mm="����";
			break;
		case 9:
		case 10:
		case 11:
			mm="����";
			break;
		case 12:
		case 1:
		case 2:
			mm="�ܿ�";
			break;
		default:
			mm="��";
			break;
		}
		System.out.printf("������ ����:%s�� %s�� - �Դϴ�. ", m,d);
		System.out.println("������ ����:"+ mm);
		
	}
	public static void operator6_form() {
		System.out.printf("[%d] * %n", 12345);
		System.out.printf("[%10d] * %n", 12345);
		System.out.printf("[%-10d] * %n", 12345);
		
		System.out.printf("�ܾ�:[%, d]�� %n", 12345);
		System.out.printf("��:[%10.2f] %n", 12345.6789012345);
		System.out.printf("��:[%.2f] %n", 12345.6789012345);
		System.out.printf("��:[%010.2f] %n", 12345.6789012345);
		System.out.printf("��:[%d] %n", 12345L);
		System.out.printf("��:[%+d] %n", 12345L);
		System.out.printf("��:[%+d] %n", -12345);
		
		System.out.printf("%s hex ��:[%h] %n", 10, 10);
		System.out.printf("%s bool ��:[%b] %n", "10>10", 10>10);
		System.out.printf("%s float ��:[%f] %n", "12345.6789", 12345.6789);
		System.out.printf("%s float ��:[%8.2f] %n", "12345.6789", 12345.6789);
		System.out.printf("%s float ��:[%.2f] %n", "12345.6789", 12345.6789);
		System.out.printf("%s float ��:[%f] %n", "12345.0e-03", 12345.0e-03);
		
		System.out.printf("%s g��:[%g] %n", "12345.6789", 12345.6789);//�Ҽ�1�ڸ� �ݿø�
		System.out.printf("%s g��:[%10.5g] %n", "12345.6789", 12345.6789);
		System.out.printf("%s g��:[%10.3g] %n", "12345.6789", 12345.6789);
		System.out.printf("%s g��:[%10.2g] %n", "12345.6789", 12345.6789);
		
		System.out.printf("%s e��:[%e] %n", "12345.0e-03", 12345.0e-03);
		System.out.printf("%s e��:[%10.3e] %n", "12345.0e-03", 12345.0e-03);
		
		System.out.printf("%s hex��:[%x] %n", "1234", 1234);
		System.out.printf("%s hex��:[%X] %n", "1234", 1234);
		System.out.printf("%s hex��:[%#7X] %n", "1234", 1234);
		
		System.out.printf("%s octet��:[%o] %n", "1234", 1234);
		System.out.printf("%s octet��:[%#o] %n", "1234", 1234);
		
		System.out.printf("%s char��:[%c] %n", "\u1234", '\u1234');
		System.out.printf("%s char��:[%c] %n", "a", 'a');
		System.out.printf("%s char��:[%c] %n", "65", 65);
		System.out.printf("%s char��:[%C] %n", "a", 'a');
		
		System.out.printf("���ڿ����: [%s] %n", "abcde");
		System.out.printf("���ڿ����: [%10s] %n", "abcde");
		System.out.printf("���ڿ����: [%10.3s] %n", "abcde");
		System.out.printf("���ڿ����: [%S] %n", "abcde");
		
		System.out.printf("%s �� ���: [%d] %n", "-12345", -12345);
		System.out.printf("%s �� ���: [%2f] %n", "-12345", 12345.678);
		
		
		System.out.printf("Local time�� ���: [%tT], 14:27:38 %n", Calendar.getInstance());
		System.out.printf("Local time�� ���: [%tr], 02:27:24 ���� %n", Calendar.getInstance());
		System.out.printf("Local time�� ���: [%tF], 2019-07-09  %n", Calendar.getInstance());
		System.out.printf(" Local time�� ���: [%1$tF %1$tA] 2019-07-09 ȭ����%n", Calendar.getInstance());
		
		System.out.printf("Local time�� ���: [%1$tF %tT], 14:27:38 %n", Calendar.getInstance());
	}
	public static void operator5() {
		System.out.println("��Ʈ����");
		
		System.out.printf("10 & 7 = %d", 10 & 7);
		System.out.printf("\n123 & 456 = %d", 123 & 456);
		//System.out.printf("\n0xFFFF & 0xFF00 = 0x%x", 0xFFFF & 0xFF00);
		System.out.printf("\n0xFFFF & 0xFF00 = 0x%x (%s) ",0xFFFF & 0xFF00
				, Integer.toBinaryString(0xFFFF & 0xFF00));
		
		System.out.println();
		System.out.printf("10^7=%d (%s)", 10^7
				, Integer.toBinaryString(10^7));
		System.out.printf("\n123 ^ 456 =%d (%s)", 123 ^ 456
				, Integer.toBinaryString(123^123));
		System.out.printf("\n0xFFFF ^ 0xFF00 = 0x%x (%s)",0xFFFF ^ 0xFF00
				, Integer.toBinaryString(0xFFFF ^ 0xFF00));
		
	}
	public static void operator4() {
		int a=99;
		System.out.printf(" AND����: %s", (a>=100) && (a<=200) );
		System.out.printf("\n OR����: %s", (a>=100) || (a<=200) );
		System.out.printf("\n NOT����: %s, not: %s", (a==100), !(a==100) );
	}
	public static void operator3() {
		int i=0, j=0;
		int r=0;
		i++;
		System.out.println("i:"+ i);//i=1
		System.out.printf("2+3*4 = %d \n",2+3*4);//14
		r=2*(i++);
		System.out.printf("i: %d, F: 2*i++ = %d \n",i,r );//i=3,2*2, 2*3
		
		System.out.println();
		j++;
		System.out.println("j:"+ j);//i=1
		System.out.printf("2+3*4 = %d \n",2+3*4);//14
		r=2*(++j);
		System.out.printf("j: %d, F: 2*++j = %d \n",j, r);//i=3,2*2, 2*3
		
	}
	public static void for01() {
		//int i=0,j;
		//2��
		// ixj=r
		// 2x1=2
		// 2x2=4
		// 2x3=6
		// 2x4=8
		// 2x5=10
		// 2x6=12
		// 2x7=14
		// 2x8=16
		// 2x9=18
		System.out.println("9x9���� ����մϴ�");
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				int r=0;
				r=i*j;
				System.out.printf("%d x %d = %d \n", i, j, r);
			}
			System.out.println();
			
		}
	}
	public static void operator2() {
		int a=0, b=0;
		int s=0;
		String m=null;
		int r=0;
		
		Scanner scan = new Scanner(System.in);// �����Է�
		
		System.out.println("�������� �մϴ�");
		System.out.println("���� a�� �Է��ϼ���: ");
		a = scan.nextInt();
		System.out.println("���� b�� �Է��ϼ���: ");
		b = scan.nextInt();
		
		System.out.println();
		System.out.println("1) ==  2) != 3) >  4) <");
		System.out.println("5) >=  6) <=  ");
		System.out.println("����� �����ڸ� �������ּ���: ");
		s = scan.nextInt(); //Ű���� ���� �Է�
		
		if(s==1) {
			m="==";
			System.out.printf("�����: %d %s %d, ���: %s",a,m,b,a==b);
		} else if(s==2) {
			m="!=";
			System.out.printf("�����: %d %s %d, ���: %s",a,m,b,a!=b);
		} else if(s==3) {
			m=">";
			System.out.printf("�����: %d %s %d, ���: %s",a,m,b,a>b);
		} else if(s==4) {
			m="<";
			System.out.printf("�����: %d %s %d, ���: %s",a,m,b,a<b);
		} else if(s==5) {
			m=">=";
			System.out.printf("�����: %d %s %d, ���: %s",a,m,b,a>=b);
		} else if(s==6) {
			m="<=";
			System.out.printf("�����: %d %s %d, ���: %s",a,m,b,a<=b);
		} else {
			m=null;
		}
	}
	public static void operator1() {
	//������ ���ݴ� �˾ƺ��ô�
	// +=
	// -=
	// *=
	// /=
	// %=
	// ++
	// --
		String m=null;
		int a=0, b = 0;
		double n=0, s=0;
		Scanner scan = new Scanner(System.in);// �����Է�
		
		System.out.println("���� a�� �Է��ϼ���: ");
		a = scan.nextInt();
		System.out.println("���� b�� �Է��ϼ���: ");
		b = scan.nextInt();
		System.out.println();
		System.out.println("1) +=  2) -= 3) *=  4) /=");
		System.out.println("5) %=  6) ++ 7) --  ");
		System.out.println("����� �����ڸ� �������ּ���: ");
		s = scan.nextInt(); //Ű���� ���� �Է�
/*      �����
 * 		and, &&, or, ||, not
		not(true) => false => 0
		not (false) => true => 1
		!(true) => false => 0
		!(false) => true=>1
	
		1 x 1 = 1  and
		1 x 0 = 0  and
		0 x 0 = 0  and
		0 x 1 = 0  and
		1 -> true
		0 -> false
		true + true = true => 1 + 1 =2
		true + false = true => 1 + 0 =1
		false + false = false => 0 + 0 =0
		true || false => 1 => true

���� ������

 
*
*/
		if(1> s || s>7) {
			System.out.println("������ �����ڴ� �����ϴ�. =��=");
			return;
		}
		
		if(s==1) {
			a+=b;
			n=a;
			m="+=";
		}
		if(s==2) {
			a-=b;
			n=a;
			m="==";
		}
		if(s==3) {
			a*=b;
			n=a;	
			m="*=";
		}
		if(s==4) {
			n=a;
			n/=b;
			m="/=";
		}
		if(s==5) {
			n=a;
			n%=b;	
			m="%=";
		}
		if(s==6) {
			a++;
			b++;
			n=a+b;
			m="++";
		}
		if(s==7) {
			a--;
			b--;
			n=a+b;
			m="--";
		}
		System.out.printf("����: %d %s %d",a,m,b);
		System.out.println("=> �������: " + n);
	}
	public static void input() {
		String m=null;
		Scanner scan = new Scanner(System.in);// �����Է�
		System.out.println("�̸��� �Է����ּ���: ");
		m = scan.nextLine(); //Ű���� ���� �Է�
		System.out.println("�Է°�: " + m + "\n");
		
		int k=0;
		System.out.println("����Ÿ�(km)�� �Է�: ");
		k=scan.nextInt();
		
		double li=0;
		System.out.println("��������(liter)�� �Է�: ");
		li=scan.nextInt();
		
		double avg = 0;
		avg = k/ li;
		System.out.print("��� ����: "+ avg);
	}
	public static void string() {
		String s1 ="�ڵ��꽺~";
		String s2 ="100";
		String s3 ="20";
		String value = null;
		
		int n1=0;
		int n2=0;
		
		n1 = Integer.parseInt(s2);
		n2 = Integer.parseInt(s3);
						
		System.out.printf("���ڿ�:%s \n", s1);
		
		value = Integer.toString(n1*n2);
		System.out.printf("��:%s \n", n1*n2);
		
		System.out.println();
		System.out.println(s1+"���� "+ value + " �Դϴ�.");
		
	}
	public static void bool() {
		boolean bData =false;
		boolean isPass=true;
		
		if(bData==true) {
			isPass=true;
		}
		
		System.out.printf("%s \n", isPass);
	}
	public static void ascii() {
		char d;
		d='#';
		System.out.printf("%c�� ASCII���� %d �Դϴ�"
				, d, (int)d);
	}
	public static void datatype2() {
		//ASCII 7bit 0~127
		//UNICODE 3���ڼ� ǥ��
		//UTF-8 
		//UTF-16
	}
	public static void datatype1() {
		// 8 bit = 1 byte
		// short = 2byte
		// int   = 4byte
		// int   = 2* short
		//long   = 2* int = 8byte
		//double = 2* int = 8byte
		// float = 4byte 
	}
	public static void variable1() {
		int a;
		float b;
		a=123;
		b=321.45f;
		a = (int)b;//cast
		System.out.printf("a�� ����: %d \n", a);//---
		System.out.printf("b�� ����: %f \n", b);
		
	}
	public static void print4() {
		System.out.printf("\n�ٹٲ�\n����\n");
		
		System.out.printf("\t�� �ֱ�\t����\n");
		System.out.printf("�ֱ�\r\r����ϴ�\n");
		System.out.printf("���ڰ� \"����\"�Ǵ� ȿ��\n");
		System.out.printf("\\\\\\\\ �������� ��� \n");
	}
	public static void print3() {
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		
		System.out.printf("%s\n", "string123");
		System.out.printf("%10s\n", "string123");
	}

	public static void print2() {
		System.out.printf("%s %c %d", "abc", 'a', 123);
	}
	
	public static void print1() {
		System.out.print("abc");
		System.out.print("123");
		
		System.out.println("abc");
		System.out.println("123");
		
		String a = "abc";
		String b = "123";
		
		System.out.printf("%s %s", a, b);
		
		//System.out.printf("%s %s", a); //error
		
	}
}
