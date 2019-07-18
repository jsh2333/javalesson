package JavaEx;

import java.util.Calendar;
import java.util.Scanner;

import JavaBasic.Car;
import JavaBasic.Tv;

public class JavaPractice {

	public static void main(String[] args) {
		System.out.println("== JavaPractice main 시작 ==");
		//class_ex();//클래스 예 -자동차클래스
		//class_TvTest();//클래스 예 -TV클래스
		
//		print1();//
//		print2();//
//		print3();//서식
//		print4();
//		ascii();
//		stringAsciiNumbSum();
//		charToAscii();
//		asciiToChar();
//		stringToInt();
//		inputCalculate();
//		for9x9();
//		printf_form();
//		array3();
		
//		flowEx34(); //break,continue 예제
//		array_ScoreCard();
//		factorialEX();//팩토리얼 계산
//		factorialEx2();//
//		myMathEx();
//		arrayShipBoard();//Ex5-20, MultiArrEx1.java
//		arrayBingo();//Ex5-21
		arrayMatrix();//Ex5-22
		
	}

	private static void arrayMatrix() {
		int[][] m1= {
				{1,2,3}
				,{4,5,6}
		};
		int[][] m2= {
				{1,2}
				,{3,4}
				,{5,6}
		};
		final int ROW = m1.length;//m1행의 길이
		final int COL = m2[0].length;//m2열의길이
		final int M2ROW = m2.length;//m2행의 길이
		
		int[][] m3= new int[ROW][COL];
		
		//m1 x m2 계산, 결과m3저장
		for(int i =0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				for(int k =0;k<M2ROW;k++) {
					m3[i][j] +=m1[i][k]*m2[k][j];
				}
			}
		}
		
		//m3출력
		for(int i =0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
	}

	private static void arrayBingo() {
		final int SIZE=5;
		int x=0, y=0, num=0;
		
		int [][] bingo = new int[SIZE][SIZE];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j]=i*SIZE+j+1;
			}
		}
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				x=(int)(Math.random() * SIZE);
				y=(int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j]=bingo[x][y];;
				bingo[x][y]=tmp;
			}
		}
		
		do {
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요(종료:0)>",  SIZE*SIZE);
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
				for(int i=0;i<SIZE;i++) {
					for(int j=0;j<SIZE;j++) {
						if(bingo[i][j]==num) {
							bingo[i][j]=0;
							break outer;
						}
					}
				}
		}while(num!=0);
	}

	private static void arrayShipBoard() {
		final int SIZE = 10;
		
		int x=0,y=0;
		char [][] board = new char[SIZE][SIZE];
		byte [][] shipBoard = {
				{0,0,1,0,1,0,0,0,0,0}
				,{0,1,0,0,0,0,0,0,0,0}
				,{0,0,1,0,1,0,0,0,0,0}
				,{0,0,0,1,0,0,0,0,0,0}
				,{0,0,0,1,1,1,0,1,1,0}
				,{0,1,1,0,0,0,0,0,0,1}
				,{1,0,0,1,0,0,0,1,0,1}
				,{1,0,0,1,0,0,1,1,1,1}
				,{0,0,1,0,0,0,0,1,0,0}
				,{1,1,0,0,1,1,1,0,0,0}
		};
		
		for(int i=1;i<SIZE;i++) {
			board[0][i] = board[i][0]= (char)(i+'0');
		}
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.printf("좌표를 입력하세요(종료는 00)>");
			String in = scan.nextLine();
			
			if(in.length()==2) {
				x=in.charAt(0)-'0';
				y=in.charAt(1)-'0';
				if(x==0 && y==0)
					break;
			}
			if(in.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
						
			}
			
			board[x][y] = shipBoard[x-1][y-1]==1?'O':'X';//입력받은 좌표의 값이 1인가?
			
			for(int i=0;i<SIZE;i++) {
				System.out.println(board[i]);
			}
			System.out.println();
		}
	}

	private static void myMathEx() {
		System.out.println("MyMath.add()=" + MyMath.add(200L, 100L));
		System.out.println("MyMath.sub()=" +MyMath.sub(200L, 100L));
		System.out.println("MyMath.mult()=" +MyMath.mult(200L, 100L));
		System.out.println("MyMath.div()=" +MyMath.div(200L, 100L));
		
		MyMath m = new MyMath();
		m.a=200;
		m.b=100;
		System.out.println("m.add()=" + m.add());
		System.out.println("m.sub()=" +m.sub());
		System.out.println("m.mult()=" +m.mult());
		System.out.println("m.div()=" +m.div());
	}

	private static void factorialEx2() {
		System.out.println("팩토리얼 계산을 수행합니다.");
		System.out.println("숫자를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int ret;
		
		for(int i=1;i<=n;i++) {
			ret = (int) factorial(i);
			if(ret==-1) {
				System.out.printf("유효하지 않은 값입니다(입력값:%d)\n1000이하 입력할것", n);
				break;
			}
			System.out.printf("%2d!=%20d \n ", i, ret);
		}
	}

	static long factorial(int n) {
		int ret=0;
		if(n<=0 || n>20) {
			ret=-1;
			return ret;
		}
		if(n==1) {
			ret=1;
		}else {
			ret = (int) (n*factorial(n-1));// 5-> 4->3->2->1, 1이면 리턴 (끝)
		}
		return ret;
	}
	private static void factorialEX() {
		System.out.println("팩토리얼 계산을 수행합니다.");
		System.out.println("숫자를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int fac = (int) factorial(n);
		System.out.println("n! = " + fac);
		//menu : 0번 종료, 1  번 입력 -> while, for
 	}

	private static void array_ScoreCard() {
		//성적표
		//kor, eng, math
		int[][] score= {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{30,40,50}
		};
		
		int total_kor=0;
		int total_eng=0;
		int total_math=0;
		System.out.println("성적표 항목수(번호): " + score.length);

		System.out.println("번호  국어  영어 수학 총점 평균 ");
		System.out.println("=====================");
		
		for(int i=0;i<score.length;i++) {
			int sum=0;//개별 총점
			float avg = 0.0f; //개별 평균
			total_kor +=score[i][0];
			total_eng +=score[i][1];
			total_math +=score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j=0;j<score[i].length;j++) {
				sum +=score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum / (float)score[i].length;
			System.out.printf("%5d %5.1f \n", sum, avg);
		}
		System.out.println("=====================");
		System.out.printf("총점: %3d %4d %4d \n"
				, total_kor,total_eng,total_math);
	}

	private static void flowEx34() {
		System.out.println("== flowEx34() 시작 ==");
		
		int menu=0, num=0;
		
		Scanner scan = new Scanner(System.in);
		
		outer:
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.println("계산할 메뉴를 선택하세요 (단, 종료: 0)");
				
				String tmp = scan.nextLine();
				menu = Integer.parseInt(tmp);// 입력 문자 ->숫자 데이타로 변환
				
				if(menu==0) {
					System.out.println("exit");
					break;
				}else if(!(1<=menu && menu <=3)) {
					System.out.println("입력오류, 1~3번 메뉴를 선택해주세요");
					continue;
				}
				
				for(;;) {
					System.out.println("계산할 값을 입력하세요 (메뉴:99, 종료:11)");
					tmp = scan.nextLine();

					num = Integer.parseInt(tmp);

					if(num==99)
						break;
					if(num==11)
						break outer;
					
					switch(menu) {
					case 1:
						System.out.println("caclc) square: "+ num*num);
						break;
					case 2:
						System.out.println("caclc) sqrt: "+ Math.sqrt(num));
						break;
					case 3:
						System.out.println("caclc) log: "+ Math.log(num));
						break;
					}
					System.out.println();
				}//for
			}//while
		System.out.println("종료");
	}//main

	public static void array3() {
		System.out.println("== array3() 시작 ==");
		int n1=5, n2=4, n3=3;
		int a[][][] = new int [n1][n2][n3];
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				for(int k=0;k<n3;k++) {
					a[i][j][k] = i+1;
					System.out.print(a[i][j][k] + "   ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void printf_form() {
		System.out.printf("[d][%d] * %n", 12345);
		System.out.printf("[10d] * %n", 12345);
		System.out.printf("[-10d] * %n", 12345);
		
		System.out.printf("잔액:[%, d]원 %n", 12345);
		System.out.printf("값:[%10.2f] %n", 12345.6789012345);
		System.out.printf("값:[%.2f] %n", 12345.6789012345);
		System.out.printf("값:[%010.2f] %n", 12345.6789012345);
		System.out.printf("값:[%d] %n", 12345L);
		System.out.printf("값:[%+d] %n", 12345L);
		System.out.printf("값:[%+d] %n", -12345);
		
		System.out.printf("%s hex 값:[%h] %n", 10, 10);
		System.out.printf("%s bool 값:[%b] %n", "10>10", 10>10);
		System.out.printf("%s float 값:[%f] %n", "12345.6789", 12345.6789);
		System.out.printf("%s float 값:[%8.2f] %n", "12345.6789", 12345.6789);
		System.out.printf("%s float 값:[%.2f] %n", "12345.6789", 12345.6789);
		System.out.printf("%s float 값:[%f] %n", "12345.0e-03", 12345.0e-03);
		
		System.out.printf("%s g값:[%g] %n", "12345.6789", 12345.6789);//소수1자리 반올림
		System.out.printf("%s g값:[%10.5g] %n", "12345.6789", 12345.6789);
		System.out.printf("%s g값:[%10.3g] %n", "12345.6789", 12345.6789);
		System.out.printf("%s g값:[%10.2g] %n", "12345.6789", 12345.6789);
		
		System.out.printf("%s e값:[%e] %n", "12345.0e-03", 12345.0e-03);
		System.out.printf("%s e값:[%10.3e] %n", "12345.0e-03", 12345.0e-03);
		
		System.out.printf("%s hex값:[%x] %n", "1234", 1234);
		System.out.printf("%s hex값:[%X] %n", "1234", 1234);
		System.out.printf("%s hex값:[%#7X] %n", "1234", 1234);
		
		System.out.printf("%s octet값:[%o] %n", "1234", 1234);
		System.out.printf("%s octet값:[%#o] %n", "1234", 1234);
		
		System.out.printf("%s char값:[%c] %n", "\u1234", '\u1234');
		System.out.printf("%s char값:[%c] %n", "a", 'a');
		System.out.printf("%s char값:[%c] %n", "65", 65);
		System.out.printf("%s char값:[%C] %n", "a", 'a');
		
		System.out.printf("문자열출력: [%s] %n", "abcde");
		System.out.printf("문자열출력: [%10s] %n", "abcde");
		System.out.printf("문자열출력: [%10.3s] %n", "abcde");
		System.out.printf("문자열출력: [%S] %n", "abcde");
		
		System.out.printf("%s 의 출력: [%d] %n", "-12345", -12345);
		System.out.printf("%s 의 출력: [%2f] %n", "-12345", 12345.678);
		
		
		System.out.printf("Local time의 출력: [%tT], 14:27:38 %n", Calendar.getInstance());
		System.out.printf("Local time의 출력: [%tr], 02:27:24 오후 %n", Calendar.getInstance());
		System.out.printf("Local time의 출력: [%tF], 2019-07-09  %n", Calendar.getInstance());
		System.out.printf(" Local time의 출력: [%1$tF %1$tA] 2019-07-09 화요일%n", Calendar.getInstance());
		
		System.out.printf("Local time의 출력: [%1$tF %tT], 14:27:38 %n", Calendar.getInstance());
	}
	private static void for9x9() {
		//int i=0,j;
		//2단
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
		System.out.println("9x9단을 출력합니다");
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				int r=0;
				r=i*j;
				System.out.printf("%d x %d = %d \n", i, j, r);
			}
			System.out.println();
			
		}
	}
	public static void inputCalculate() {//입력받은 값을 계산
		System.out.println("==inputCalculate() 시작 ==");
		String m=null;
		Scanner scan = new Scanner(System.in);// 문자입력
		System.out.println("차의 이름을 입력해주세요: ");
		m = scan.nextLine(); //키보드 문자 입력
		System.out.println("입력값: " + m + "\n");
		
		int k=0;
		System.out.println("주행거리(km)를 입력: ");
		k=scan.nextInt();
		
		double li=0;
		System.out.println("주유리터(liter)를 입력: ");
		li=scan.nextInt();
		
		double avg = 0;
		avg = k/ li;
		System.out.printf("계산 연비: %3.2f km/h\n", avg);
	}
	private static void stringToInt() { //문자열 숫자 변환
		System.out.println("== stringToInt() 시작 ==");
		String s1 ="자두쥬스~";
		String s2 ="100";
		String s3 ="20";
		String value = null;
		
		int n1=0;
		int n2=0;
		
		n1 = Integer.parseInt(s2); // 문자열에서 숫자로 변환
		n2 = Integer.parseInt(s3);
						
		System.out.printf("문자열:%s \n", s1);
		
		value = Integer.toString(n1*n2); // 숫자에서 문자타입으로 변환
		System.out.printf("값:%s \n", n1*n2);
		
		System.out.println();
		System.out.println(s1+"값은 "+ value + " 입니다.");
		
	}
	
	private static void asciiToChar() {
		System.out.println();
		System.out.println("== AsciiToChar() 시작 ==");
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요:");
		int a = scan.nextInt();
		char c = (char)a;
		
		System.out.printf("입력된  숫자의 문자: %c\n", c);
	}
	private static void charToAscii() {
		System.out.println();
		System.out.println("== charToAscii() 시작 ==");
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요:");
		char c = scan.nextLine().charAt(0);
		int a = (int ) c;
		
		System.out.printf("입력된 문자의 아스키값: %d\n", a);
	}
	private static void stringAsciiNumbSum() {
		System.out.println();
		System.out.println("== numbSum() 시작 ==");
		Scanner in = new Scanner(System.in);
		
		System.out.println("* 입력숫자까지의 문자의 ascii값의 합을 계산합니다");
		
		System.out.println("단어 또는 문자열을 입력해주세요:");
		String input =in.next();
		System.out.println();
		System.out.printf("입력된 문자열의 길이는 %d 입니다\n", input.length());
		System.out.println("숫자를 입력해주세요:");
		int n = in.nextInt();
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum += input.charAt(i)-'0';
			System.out.printf("%c[%d]=%d\n",input.charAt(i),i, (int)input.charAt(i));
 		}
		System.out.println();
		System.out.println("sum="+sum);
		
	}

	private static void ascii() {
		System.out.println();
		System.out.println("== ascii() 시작 ==");
		char d;
		d = '#';
		System.out.printf("%c의 ASCII값은 %d 입니다", d, (int) d);
	}
		
	private static void print4() {
		System.out.printf("\n줄바꿈\n연습\n"); // \n 
		
		System.out.printf("\t탭 넣기\t연습\n"); // \t
		System.out.printf("넣기\r\r덮어씁니다\n"); // \r
		System.out.printf("글자가 \"강조\"되는 효과\n"); //   \"
		System.out.printf("\\\\\\\\ 역슬래시 출력 \n"); //  \\
	}
	
	private static void print3() {
		System.out.println();
		System.out.println("== print3 시작 ==");
		System.out.println("*** printf 서식출력");
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		
		System.out.printf("%s\n", "string123");
		System.out.printf("%10s\n", "string123");
		
	}

	private static void print2() {
		System.out.println();
		System.out.println("== print2 시작 ==");
		System.out.printf("%s %c %d", "abc", 'a', 123);
		
	}

	private static void print1() {
		System.out.println();
		System.out.println("== print1 시작 ==");
		System.out.println("*** pint, println, printf 구분하기");
		System.out.print("abc");//줄바꿈 없이 출력
		System.out.print("123");
		
		System.out.println("abc");//줄바꿈
		System.out.println("123");
		
		String a = "abc";
		String b = "123";
		
		System.out.printf("%s %s", a, b);
		
		//System.out.printf("%s %s", a); //error
		
	}

	private static void class_TvTest() {
		System.out.println("== class_TvTest() 시작 ==");
		Tv t1 = new Tv(); //클래스 인스턴스 생성
		t1.setCh(11);//MBC  클래스 변수
		System.out.println("1) t1생성");
		System.out.println("현재채널t1.ch: "+ t1.getCh());//getter
		System.out.println("현재채널t1.color: "+ t1.getColor());
		System.out.println("현재채널t1.size: "+ t1.getSize());
		System.out.println("현재채널t1.powerOn: "+ t1.getPowerOn());
		System.out.println("현재채널t1 속성: "+ t1.toString());
		
		
		String color="green";
		float size= (float) 15.2;
		Tv t2 = new Tv(color, size); //클래스 인스턴스 생성
		
		System.out.println("2) t2생성자 파라미터 사용");
		System.out.println("현재채널t2.ch: "+ t2.getCh());
		System.out.println("현재채널t2.color: "+ t2.getColor());
		System.out.println("현재채널t2.size: "+ t2.getSize());
		System.out.println("현재채널t2.powerOn: "+ t2.getPowerOn());
		System.out.println("현재채널t2 속성: "+ t2.toString());
		
		t2=t1;//주소를 넘겨줬다
		System.out.println("3) ts=t1 주소 전달 ");		
		t1.chDown();
		System.out.println("현재채널t2.ch: "+ t2.getCh());
		System.out.println("현재채널t2.color: "+ t2.getColor());
		System.out.println("현재채널t2.size: "+ t2.getSize());
		System.out.println("현재채널t2.powerOn: "+ t2.getPowerOn());
		
	}

	private static void class_ex() {
		System.out.println("== class_ex() 시작 ==");
//		Car car1 = new Car();
//		System.out.println("내차: "+ car1.count);
//		
//		Car car2 = new Car();
//		System.out.println("내차: "+ car2.count);
//		
//		Car car3 = new Car();
//		System.out.println("내차: "+ car3.count);
		
		int n=0;
		
		n= Car.getCount();//클래스메소드 호출
		System.out.println("클래스 내차: " + n);
		
		Car car4 = new Car();
		n = car4.getCount(); // 인스턴스 메소드
		System.out.println("인스턴스 내차: " + n);

		car4.setColor("red");
		car4.setSpeed(150);
		car4.setWheel(4);
		
	    Car car5 = new Car();
	    car5.setColor("black");
		car5.setSpeed(220);
		car5.setWheel(8);
		
		System.out.println("car4 내차: " + n);
		System.out.println("car4 color: " + car4.getColor());
		System.out.println("car4 speed: " + car4.getSpeed());
		System.out.println("car4 wheel: " + car4.getWheel());
		
		
		System.out.println("car5 내차: " + n);
		System.out.println("car5 color: " + car5.getColor());
		System.out.println("car5 speed: " + car5.getSpeed());
		System.out.println("car5 wheel: " + car5.getWheel());
		
	}

}
