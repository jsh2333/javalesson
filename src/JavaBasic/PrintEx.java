package JavaBasic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
//
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

class Data{
	int x;
}

class myInt{
	int a;//멤버변수, 필드
	int b;
	//method1();
	//method2();
	public int getA(){ //getter 함수 - 저장하고 있는 멤버변수의 값을 읽을때 사용 
		return a;
	};
	public void setA(int a){ //setter 함수 - 값을 멤버변수에 저장할때 사용
		this.a = a;
	}
	
	public int getB(){ //getter 함수 - 저장하고 있는 멤버변수의 값을 읽을때 사용 
		return b;
	};
	public void setB(int b){ //setter 함수 - 값을 멤버변수에 저장할때 사용
		this.b = b;
	}
	
}
public class PrintEx {
	public static void main(String[] args) {
		System.out.println("== main 시작 ==");
		// TODO Auto-generated method stub

		 //print1();//
		 //print2();//
		 //print3();//서식
//		systemin_scan();//scan() 함수의 사용예
		 

		/*
		 * \n \t \b 뒤로 한칸 이동 \r 줄의 맨 앞으로 이동 \\ '\'를 출력 \' '''를 출력 \"  '"'를 출력
		 */
		 //print4();//문장서식
		
//		 variable1();//변수
//		 datatype1();//데이터형식
//		 datatype2();
		// ascii();//ascii 출력
		// bool();//boolean
		// string();//String
		// input();//콘솔입력받기
		// operator1();//산술계산
		// operator2();//관계연산
		// 관계연산자: ==, !=, >, <, >=, <=
		// operator3();//++, --, 연산자 우선순위
		// 후치증가연산자: a++ a값을 사용한 후에 1증가 업데이트
		// 전치증가연산자: --a a값을 1증가 업데이트 한 후에 a값을 사용
		// 곱셈덧셈나눗셈뺄셈-계산기
		// for01();//구구단 계산
		// operator4();//논리연산자 - AND &&, OR ||, NOT !
		// 논리연산자: &&, ||, !
		// operator5();//비트연산자 - AND &, OR |, EXOR ^
		// 비트연산자: &, |, ^, ~, <<, >>
		// operator6_form();//연산자 서식
		// datetime();
		// control_3();//3항연산자(삼항연산자)
		// gugudanSum();//두개의 입력을 받아서 시작, 끝의 범위에서 구구단을 계산

		// whileEx();//while 제어문, 메뉴선택 함수동작

//		int ret = 0;
//		ret = dowhileEx();// 기초문법용예제 do~while
//		System.out.println("dowhileEx의 종료 코드: " + ret);
//		System.out.println("== main  ==");
		
		control_basic();
		
		//array_1();
		//calc();
		//array_ex5_23();//예제5.23
		
		//string_f1();//문자열 처리- 문자열길이, 문자바꾸기, length(), charAt()   
		//string_f2();//문자열 처리- 문자열위치찾기-indexOf(), lastIndexOf()
		//string_f3(); //문자열처리- 문자열을 바꾸기 replace()
		//string_f4(); //문자열처리- 문자열을 잘라내기 substring()
		//string_f5(); //문자열처리- 문자열을 분할 split()
		//string_f6();//toUpperCase(), toLowerCase(), trim()
		//string_ex();//문자열처리예제
		//string_f7();//문자비교 compareTo(), 문자열포함확인 contains(), 문자열같은지확인 equals()
		//string_ex2();//자판기
		
		//method_ex1();//call by value
		//method_ex2();//call by reference  --> get(), set()
		//method_ex3_swap();
//		parameter_value();//값을 전달, reference by value
//		parameter_address();//주소 전달, reference by address
//		parameter_array();
		//class_ex();//클래스 예 -자동차클래스
		//class_TvTest();//클래스 예 -TV클래스

		//callStack(); //static메소드의 호출과 stack메모리번지할당
		
		//classExtends();//클래스상속 예제
		
//		class_ex_DmbPhone();//클래스상속예제:폰특징, dmb특징
//		class_ex_Student();//주민번호,학생번호
//		class_ex_Computer();//오버라이딩(overriding) 계산기, 컴퓨터
//		class_ex_Airplane();//오버라이딩(overriding) airplain
//		class_ex_promotion();//parent, child access
//		class_ex_polymorphism();//폴리모피즘 자동차바퀴 예제
//		class_ex_carDriver();//폴리모피즘 자동차 드라이버
//		class_ex_cast();//클래스 cast  child=(child)Parent
//		class_ex_instanceof();
		//interface_ex();//인터페이스 예제
		
//		trycatch_ex1();//try~catch연습 - ArrayIndexOutOfBoundsException
//		trycatch_ex2();
//		trycatch_throw();//try~catch throw를 사용하는 예제
		
//		scanner_ex();//단어 입력예제
//		systemread_ex();//입력예제
		
//		fileStream_ex();//파일 입출력 예제
//		fileStream_ex2();//FileInputStream, fis.read(), byte[1024] 사용해서 파일읽기
		//fileStream_ex3();//FileReader, BufferedReader 사용해서 파일읽기
//		fileStream_ex4();//Scanner(new File(FILE) 사용해서 파일읽기
//		fileStream_ex5();//Scanner(new File(FILE) 사용해서 파일읽기
//		fileStream_ex6();//파일쓰기 write, System.in.read() 입력사용
//		fileStream_ex7();//파일쓰기 write, Scanner입력사용
//		fileStream_ex8();//파일내용복사
//		String [] param = new  String [3];
//		for(int i=0;i<args.length;i++) {
//			param[i]=args[i];
//		}
//		fileStream_ex9(args);//매개변수(파라미터)로 복사할 파일명을 입력받고 파일내용복사
	}
	private static void fileStream_ex9(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int ch;
			
			try {
				System.out.println("복사시작");
				while((ch=fis.read())!=-1) {
					fos.write((byte)ch);
					System.out.print("#");
				}
				System.out.println("복사종료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fos.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	private static void fileStream_ex8() {
		System.out.println("FileInputStream, FileOutputStream 파일복사(읽고,쓰기)");
//		String FILEREAD = "c:\\temp\\data3.txt";
		String FILEREAD = "c:\\Windows\\system.ini";
		String FILEOUT = "c:\\temp\\data5.txt";
		FileInputStream fis=null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(FILEREAD);
			fos = new FileOutputStream(FILEOUT);
			int ch;
			try {
				System.out.println("복사시작");
				while((ch = fis.read())!=-1){
					System.out.print("#");
					fos.write((byte)ch);
				}
				System.out.println();
				System.out.println("복사완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private static void fileStream_ex7() {
		System.out.println("FileOutputStream, fw.write(), Scanner입력 사용해서 파일쓰기");
		String FILE = "c:\\temp\\data4.txt";
		Scanner scan = new Scanner(System.in);
		FileWriter fw=null;
		try {
			fw = new FileWriter(FILE);
			
			String s;
			
			System.out.println("글자를 입력해주세요(파일에 저장됩니다):");
			while(!(s=scan.nextLine()).equals("") ) {
				fw.write(s + "\r\n");
				
			}
			System.out.println("입력이 종료되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			scan.close();
		}
		
	}
	private static void fileStream_ex6() {
		System.out.println("FileOutputStream, fos.write() 사용해서 파일쓰기");
		String FILE = "c:\\temp\\data3.txt";
		try {
			FileOutputStream fos = new FileOutputStream(FILE);
			
			int ch;
			try {
				System.out.println("글자를 입력해주세요(파일에 저장됩니다):");
				while((ch=System.in.read())!=13) {
					fos.write((byte)ch);
				}
				System.out.println("입력이 종료되었습니다");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void fileStream_ex5() {
		System.out.println("Scanner(new File(FILE) 사용해서 파일읽기");
		String FILE = "c:\\temp\\data2.txt";
		
		File f = new File(FILE);
		Scanner scan = null;
		int tot = 0;
		try {
			scan = new Scanner(f);
			int n=0;
			while(scan.hasNextLine()) {
				n=scan.nextInt();
				System.out.println("while: "+ n);
//				tot +=scan.nextInt();
				tot +=n;
			}
			System.out.println("tot: " + tot);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e){
			System.out.println(e.getMessage());
		} finally {
			
			scan.close();
		}
	}
	private static void fileStream_ex4() {
		System.out.println("Scanner(new File(FILE) 사용해서 파일읽기");
		String FILE = "c:\\temp\\data2.txt";
		
//		File f = new File(FILE);
//		Scanner scan = null;
		int tot = 0;
		try {
			Scanner scan = new Scanner(new File(FILE));
			
			while(scan.hasNextLine()) {
				tot +=scan.nextInt();
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e){
			System.out.println(e.getMessage());
		} finally {
			System.out.println("tot: " + tot);
		}
	}
	private static void fileStream_ex3() {
		System.out.println("FileReader, BufferedReader 사용해서 파일읽기");
		String FILE = "c:/temp/data1.txt";
		FileReader fr=null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILE);
			br = new BufferedReader(fr);
			
			String s = null;
			try {
				while((s=br.readLine())!=null) {
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private static void fileStream_ex2() {
		System.out.println("FileInputStream, fis.read(), byte[1024] 사용해서 파일읽기");
		String FILE = "c:/temp/data1.txt";
		byte[] b = new byte[1024];
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(FILE);
			int ch;
			
			int i=0;
			try {
				while((ch=fis.read())!= -1) {
					b[i] = (byte) ch;
					i++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			String outs = new String(b);
			System.out.print(outs);
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void fileStream_ex() {
		System.out.println("FileInputStream, fis.read() 사용해서 파일읽기");
		try {
			FileInputStream fis =new FileInputStream("c:/temp/data1.txt");
			int ch;
			
			try {
				while((ch=fis.read())!=-1) {
					System.out.print((char)ch);;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	private static void systemread_ex() {
		Scanner scan = new Scanner(System.in);
		String userName = "";
		String userPassword = "";
		System.out.println("1) 사용자 이름과 패스워드를 저장합니다. 다음을 입력하세요.");
		System.out.println("* 사용자이름: ");
		userName = scan.nextLine();
		System.out.println("* 사용자패스워드: ");
		userPassword = scan.next();
		
		String uname="";
		String upass="";
		int key;
		System.out.println("2) 저장되어 있는 사용자이름, 패스워드를 비교합니다");
		try {
			System.out.print("이름을 입력하세요: ");
			while((key = System.in.read()) !=13) { //13은 ascii Enter키에 해당합니다 /r/n
				uname +=Character.toString((char)key);
			}
			if(userName.equals(uname)) {
				System.out.println(uname+"고객님 입장");
				System.out.println(uname+"패스워드를 입력해주세요");
				key=0;
				
				System.in.read(new byte[System.in.available()]);
								
				while((key = System.in.read()) !=13) { //13은 ascii Enter키에 해당합니다
					upass +=Character.toString((char)key);
				}
				if(userPassword.equals(upass)) {
					System.out.println(uname+"고객님 로그인하였습니다");
					
				}else {
					System.out.println(uname+"고객님 패스워드를 확인해서 로그인하십시요");
					
				}
				
			}else {
				System.out.println(uname+"등록되어있지 않은 고객이십니다");
			}
		} catch(IOException e) {
			System.out.println("IO Exceptopm 발생");
			e.printStackTrace();//프로그램 실행 순서대로 역추적을 해주는 로그 
			
		}
		
		
	}
	private static void scanner_ex() {
		Scanner scan = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.println("단어 3개 입력하세요(단어는 공백문자로 구분): ");
		s1 = scan.next();
		s2 = scan.next();
		s3 = scan.next();
		
		System.out.println("입력된 문자열:");
		
		System.out.printf("s1: [%s] \n", s1);
		System.out.printf("s2: [%s] \n", s2);
		System.out.printf("s3: [%s] \n", s3);
		
		scan.close();
	}
	private static void systemin_scan() {
		Scanner scan = new Scanner(System.in);
		byte b;
		short sh;
		int i;
		long l;
		float f;
		double d;
		String s1, s2;
		
		System.out.println("Scanner 입력 예제");
		System.out.print("byte :");
		b = scan.nextByte();
		System.out.printf("byte :[%d]\n", b);
		System.out.print("short :");
		sh = scan.nextShort();
		System.out.printf("short :[%d]\n", sh);
		System.out.print("int :");
		i = scan.nextInt();
		System.out.printf("int :[%d]\n", i);
		System.out.print("long :");
		l = scan.nextLong();
		System.out.printf("long :[%d]\n", l);
		System.out.print("float :");
		f = scan.nextFloat();
		System.out.printf("float :[%f]\n", f);
		System.out.print("double :");
		d = scan.nextDouble();
		System.out.printf("double :[%f]\n", d);
		System.out.print("String :");
		s1 = scan.next();//단어단위, 공백 입력 전까지 
		System.out.printf("String next:[%s]\n", s1);
		System.out.print("String nextLine:");
		s2 = scan.nextLine();//줄단위입력, /n/r 리턴입력전까지
		System.out.printf("String :[%s]\n", s2);
		
		scan.close();
	}
	private static void trycatch_throw() {
		int a =100, b=0;
		int res;
		int errCode=999;
		String errMsg = "";
		try {
			if(b==0) {
				errCode = 100;
				errMsg = "0으로 나누려고 합니다.";
				throw new Exception ("오류["+errCode+"]"+errMsg);
			}
			res = a/b;
				
		}catch(Exception e) {
			System.out.println("Exception 오류발생:");
			System.out.println(e.getMessage());
		}
		
	}
	private static void trycatch_ex2() {
		int [] nArr = new int[3];
		
		nArr[0] = 1;
		nArr[1] = 2;
		
		System.out.println("배열값출력");
		for(int i=0;i<3;i++) {
			System.out.printf("=> nArr[%d]: %d \n", i, nArr[i]);
		}
		
		System.out.println("배열값 변경시 오류 메시지 trycatch실행");
		try {
			nArr[3] = 1000000;
			nArr[2] = 100/0;
			
			
			System.out.println("배열값출력");
			for(int i=0;i<3;i++) {
				System.out.printf("=> nArr[%d]: %d \n", i, nArr[i]);
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: 배열크기오류 ArrayIndexOutOfBoundsException");
			System.out.println(e.getMessage());
			e.getStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("Exception: 0으로나누기오류 ArithmeticException");
			System.out.println(e.getMessage());
			e.getStackTrace();
		} finally {
			System.out.println("finally 출력되는 구문");
		}
		
		
	}
	private static void trycatch_ex1() {
		int [] nArr = new int[3];
		try {
			nArr[3] = 10000000;
			System.out.println("=> nArr: "+ nArr);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열첨자가 바운더리 오류");
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	private static void class_ex_instanceof() {
		System.out.println("1) new Child");
		Parent parent1 = new Child();
		method1(parent1);
		method2(parent1);
		System.out.println("2) new Parent()");
		Parent parent2 = new Parent();
		method1(parent2);
		//method2(parent2);
		System.out.println("3) new Parent()");
		Child child1 = new Child();
		method3(child1);
		System.out.println("4) new Parent()"); //오류발생
		Child child2 = (Child) new Parent();//오류발생
		method3(child2);
	}
	
	private static void method3(Child c) {
		if(c instanceof Parent) {
			Parent parent = (Parent) c;
			System.out.println("method3() Child-> Parent변환 성공");
		}else {
			System.out.println("method3() Child-> Parent변환 실패");
		}
	}
	private static void method2(Parent p) {
		try {
			Child child = (Child) p;
			System.out.println("method2() Parent->Child 변환 성공");
		}catch(Exception e) {
			e.getMessage();
			System.out.println(e);
			e.getStackTrace();
		}
	}
	private static void method1(Parent p) {
		if(p instanceof Child) {
			Child child = (Child) p;
			System.out.println("method1() Parent-> Child변환 성공");
		}else {
			System.out.println("method1() Parent-> Child변환 실패");
		}
	}
	private static void class_ex_cast() {
		Parent parent = new Child();
		parent.field_parent = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field_child = "data2";
//		parent.method3();
		
		Child child = (Child) parent;
		child.field_child="data3";
		child.method3();
	}
	private static void class_ex_carDriver() {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}
	private static void class_ex_polymorphism() {
		Car car = new Car();
//		
//		for(int i=1;i<=10;i++) {
//			int check = car.run();
//
//			switch(check) {
//			case 1:
//				System.out.println("앞-왼쪽 타이어교체");
//				car.frontLeftTire = new HankookTire("앞-왼쪽", 15);
//				break;
//			case 2:
//				System.out.println("앞-오른쪽 타이어교체");
//				car.frontRightTire = new HankookTire("앞-오른쪽", 15);
//				break;
//			case 3:
//				System.out.println("뒤-왼쪽 타이어교체");
//				car.backLeftTire = new HankookTire("뒤-왼쪽", 15);
//				break;
//			case 4:
//				System.out.println("앞-오른쪽 타이어교체");
//				car.backRightTire = new HankookTire("앞-오른쪽", 15);
//				break;
//			}
//			System.out.println("---------------------");
//		}
//		
		
		for(int i=1;i<=10;i++) {
			int check = car.run2();

			if(check !=0) {
				System.out.println(car.tires[check-1].location + "HankookTire으로 교체");
				
				car.tires[check-1] = 
						new HankookTire(car.tires[check-1].location, 15);
				
			}
			System.out.println("---------------------");
		}
		
		
	}
	private static void class_ex_promotion() {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();
		child.method3();
	}
	private static void class_ex_Airplane() {
		SupersonicAirplane sa = new SupersonicAirplane();
		System.out.println("보통비행기");
		//--보통비행기
		sa.flyMode=SupersonicAirplane.NORMAL;
		//비행기 이륙
		sa.takeoff();
		//비행기 비행
		sa.fly();
		//비행기 착륙
		sa.land();
		
		System.out.println("초음속비행기");
		//--초음속비행기
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		//비행기 이륙
		sa.takeoff();
		//비행기 비행
		sa.fly();
		//비행기 착륙
		sa.land();
	}
	private static void class_ex_Computer() {
		//원면적계산
		int r = 10;
		
		Calculator calc = new Calculator();
		
		System.out.println("원면적: " + calc.areaCircle(r));
		System.out.println();

		ComputerCalc comp = new ComputerCalc();
		
		System.out.println("원면적: " + comp.areaCircle(r));
		
		
	}
	private static void class_ex_Student() {
		//사람이름, 주민번호 //-->주민
		//학생번호 //->학생
		String name="";
		String ssn="";
		int studentCode=1;
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		name = scan.nextLine();
		System.out.println();
		System.out.println("주민번호를 입력하세요: ");
		ssn = scan.nextLine();
		System.out.println();
		System.out.println("학생번호를 입력하세요: ");
		studentCode = scan.nextInt();
		//생성자 초기화
		Student std = new Student(name, ssn, studentCode);
		
		//출력
		System.out.println("이름: " + std.name);
		System.out.println("주민번호: " + std.ssn);
		System.out.println("학생번호: " + std.studentNo);
		
	}
	private static void class_ex_DmbPhone() {
		
		//기기의 초기값
		String model="LG G2";
		String color="WHITE"; 
		int ch=11;
		int vol=10;
		
		DmbCellPhone dmbcp = new DmbCellPhone(model, color, ch, vol);
		
		System.out.println("1) 초기값");
		System.out.println("모델:" + dmbcp.model);
		System.out.println("색상:" + dmbcp.color);
		System.out.println("채널:" + dmbcp.ch);
		System.out.println("볼륨:" + dmbcp.getVol());
		
		//폰을 동작...
		System.out.println("2) 기본 폰의 동작");
		dmbcp.powerOn();
		dmbcp.bell();
		dmbcp.sendVoice("Hello~Hello~");
		dmbcp.receiveVoice("안녕하세요 잘계시지요?");
		dmbcp.hangUp();
		//dmb동작
		System.out.println("3) dmb 동작");
		dmbcp.turnOnDmb();
		dmbcp.changeChDmb(9);
		dmbcp.setVol(20);
	}
	
	static void parameter_value() {
		System.out.println("parameter_value()");
		//기본형 데이터 타입 : int, char, float, double, boolean, byte
		Data d = new Data();
		d.x = 10;
		System.out.println("초기값: " + d.x);
		change(d.x);//전달하는 매개변수는 값? 주소?
		System.out.println("parameter_value x= "+d.x);
	}
	
	static void parameter_address() {
		//기본형 데이터 타입 외 : 클래스, user가만든 데이터타입
		System.out.println("parameter_address()");
		Data d = new Data();
		d.x = 10;
		System.out.println("초기값: " + d.x);
		change(d);//전달하는 매개변수는 값? 주소?
		System.out.println("parameter_address x= "+d.x);		
	}
	static void parameter_array() {
		//기본형 데이터 타입 외 : 클래스, user가만든 데이터타입
		System.out.println("parameter_array()");
		int [] arr =  new int[10]; ;
		arr[0] = 10;
		System.out.println("초기값: " + arr[0]);
		change(arr);//전달하는 매개변수는 값? 주소?
		System.out.println("parameter_array x= "+arr[0]);		
	}
	static void change(int x) { //기본형 매개변수(기본형 데이터타입 매개변수)
		System.out.println("change(int x)");
		x=9000;
		System.out.println("change: x= "+x);
	}
	static void change(Data d) { //기본형 매개변수(기본형 데이터타입 매개변수)
		System.out.println("change(Data x)");
		d.x=1000;
		System.out.println("change: x= "+d.x);
	}
	static void change(int x[]) { //기본형 매개변수(기본형 데이터타입 매개변수)
		System.out.println("change(int x[]), x[] size: "+ x.length);
		
		x[0]=1000;
		System.out.println("change: x= "+x[0]);
	}

	static void interface_ex() {
		String computerOsType = Computer.COMPUTER_OS_TYPE;
		System.out.println("* computer os type: " + computerOsType);
		
		Notebook note1 = new Notebook((float) 1.6);
		System.out.println("* note1 ");
		note1.work();
		note1.purpose();
		System.out.println("note1사양: " + note1.toString());
		
		System.out.println("* desk1 ");
		Desktop desk1 = new Desktop();
		desk1.work();
		desk1.purpose();
		
	}
	static void classExtends() {
		Sedan sedan1 = new Sedan();//sedan 클래스 인스턴스
		Truck truck1 = new Truck();//truck 클래스 인스턴스
		
//		sedan1.seatNum = 5; //인스턴스 변수
//		truck1.capacity =50;//인스턴스 변수
		

		sedan1.setSeatNum(5);//5인승 좌석
		sedan1.setSpeed(230);
		sedan1.setColor("red");
		
		truck1.setCapacity(50);//50T 무게 적재함
		truck1.setSpeed(10);
		truck1.setColor("white");
		
		System.out.println("* 판매 승용차특징: ");
		System.out.printf("속도:%d km, 색상: %s, 좌석수: %d"
				,sedan1.getSpeed(),sedan1.getColor(),sedan1.getSeatNum());
		System.out.println();
		System.out.println();
		System.out.println("* 판매 트럭특징: ");
		System.out.printf("속도:%d km, 색상: %s, 적재량: %d T"
				,truck1.getSpeed(), truck1.getColor(), truck1.getCapacity());
		
		System.out.println("Sedan 클래스 타입=>" + Sedan.CAR_TYPE);
		System.out.println("Truck 클래스 타입=>" + Truck.CAR_TYPE);
		int d=2;
		for(int i=0;i<10;i++) {
			d = d*(i+1);
			truck1.upSpeed(d);	
			System.out.printf("truck1 속도:%d km\n", truck1.getSpeed()); 
		}
		
	}
	
	static void Method2() {
		System.out.println("Method2()-start");
		//처리
		System.out.println("Method2()-end");
	}
	static void Method1() {
		System.out.println("Method1()-start");
		Method2();
		System.out.println("Method1()-end");
	}
	static void callStack() {
		System.out.println("callStack()-start");
		Method1();
		System.out.println("callStack()-end");	
	}
	static void class_TvTest() {
		Tv t1 = new Tv(); //클래스 인스턴스 생성
		t1.ch = 11;//MBC
		System.out.println("1) t1생성");
		System.out.println("현재채널t1.ch: "+ t1.ch);
		System.out.println("현재채널t1.color: "+ t1.color);
		System.out.println("현재채널t1.size: "+ t1.size);
		System.out.println("현재채널t1.powerOn: "+ t1.powerOn);
		System.out.println("현재채널t1 속성: "+ t1.toString());
		
		
		String color="green";
		float size= (float) 15.2;
		Tv t2 = new Tv(color, size); //클래스 인스턴스 생성
		
		System.out.println("2) t2생성자 파라미터 사용");
		System.out.println("현재채널t2.ch: "+ t2.ch);
		System.out.println("현재채널t2.color: "+ t2.color);
		System.out.println("현재채널t2.size: "+ t2.size);
		System.out.println("현재채널t2.powerOn: "+ t2.powerOn);
		System.out.println("현재채널t2 속성: "+ t2.toString());
		
		t2=t1;//주소를 넘겨줬다
		System.out.println("3) ts=t1 주소 전달 ");		
		t1.chDown();
		System.out.println("현재채널t2.ch: "+ t2.ch);
		System.out.println("현재채널t2.color: "+ t2.color);
		System.out.println("현재채널t2.size: "+ t2.size);
		System.out.println("현재채널t2.powerOn: "+ t2.powerOn);
		
	}
	static void class_ex() {
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
	public static void method_ex3_swap() {
		myInt m = new myInt();//클래스 인스턴스 생성
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
	static void func2(myInt m) { //클래스 객체를 파라미터(매개변수) 전달)
		m.a = m.a + 10;
		
		System.out.println("func2: "+ m.a);
	}
	public static void method_ex2() { //call by reference
		myInt m = new myInt();//클래스 인스턴스 생성
		
		m.a=10; //a=10 클래스의 변수a 초기화
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
		
		System.out.printf("문제수:%d, 정답수: %d", a, b);
		System.out.printf("a/b = %f", (float)a/b);
		//몫        a/b
		//나머지   a%d
	}
	
	public static void array_ex5_23() {
		String [] arr = {"1", "2", "3"}; // arr[0]="1", arr[1]="2",arr[2]="3",
		String [][][] a3 = {};
		String [][] words= {
			{"chair","의자"}
			,{"computer","컴퓨터"}
			,{"integer","정수"}
			,{"array","배열"}
			,{"string","문자열"}
		};
			
		Scanner scan = new Scanner(System.in);
		
		int n=0;
		int t=words.length;
		
		System.out.println("단어의 뜻을 맞춰보세요.");
		for(int i=0;i<t;i++) {
			//단어에 있는 항목을 입력받고 맞는지 답변....
			System.out.printf("[Q%d] %s ? ", i+1, words[i][1] );
			String ans = scan.nextLine();
			
			if(ans.equals(words[i][0])) {
				System.out.println("정답입니다");
				n++;
			}else{
				System.out.println("오답입니다 - 정답은 " + words[i][0]);
			};
		}
		if(t==0) {
			System.out.println("오류: 0으로 나누고 있습니다");
			return;
		}
		
		float f =(float)n/t; // 123.123123123
		
		System.out.printf("문제수:%d, 정답수: %d", t, n); 
		System.out.printf("1)정답율: %3.2f", f*100);
		
	}
	
	
	static final String SELECT_MILK = "1";
	static final String SELECT_AMERICANO = "2";
	static final String SELECT_CAPUCCINO = "3";
	
	public static void string_ex2() {
		Scanner scan = new Scanner(System.in);
		String s, m;
		
		System.out.println("돈을 입력 : ");
		m = scan.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==자판기 메뉴= ");
		m = scan.nextLine();
		System.out.println("1. 밀크커피,  500원");
		System.out.println("2. 아메리카노, 1000원");
		System.out.println("3. 카푸치노, 1500원");
		
		System.out.println("자판기 메뉴를 선택: ");
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
		
		System.out.println("물을 내린다 ");
		System.out.println("커피 출력 완료");
		System.out.println("잔돈반환 ");
		
		System.out.println("==커피가 나왔습니다= ");
	}
	public static void string_f7() {
		Scanner scan = new Scanner(System.in);
		String s1, s2, s3;
		
		System.out.println("문자열을 입력하세요: ");
		s1 = scan.nextLine();
		System.out.println("비교할 문자열을 입력하세요: ");
		s2 = scan.nextLine();
	
		System.out.println();
		System.out.println("s1:["+s1+"]");
		System.out.println("s2:["+s2+"]");
		System.out.println("1) 문자열 비교: "+s1.compareTo(s2));
		
		System.out.println();
		System.out.println("2) 문자열이같은지비교: " + s1.equals(s2));
		
		System.out.println();
		System.out.println("검색할 단어를 입력하세요: ");
		s3 = scan.nextLine();
		System.out.println("3) 단어 포함확인: "+s1.contains(s3));
		
	}
	public static void string_ex() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하세요: ");
		s = scan.nextLine();
	
		String r = "";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				r += s.substring(i, i+1);
			}
			System.out.println("입력문자열:["+s+"]");
			System.out.println("공백제거 문자열:["+r+"]");
		}
	}
	public static void string_f6() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하세요: ");
		s = scan.nextLine();
		System.out.println();
		System.out.println("입력된 문자열:["+s +"]");
		System.out.println("1) 대문자변환: "+ s.toUpperCase());
		System.out.println("2) 소문자변환: "+s.toLowerCase());
		System.out.println("3) 공백제거(trim):["+s.trim()+"]");
		
		
	}
	public static void string_f5() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하세요(콤마는 분할됩니다): ");
		s = scan.nextLine();
		String s2[] = s.split(",");
		System.out.println("s1:"+s2[0]);
		System.out.println("s2:"+s2[1]);
	}
	public static void string_f4() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하세요(콤마는 분할됩니다): ");
		s = scan.nextLine();
		
		System.out.println("잘라낼 문자열 위치를 입력하세요");
		System.out.println("시작:");
		int n1 = scan.nextInt();
		System.out.println("끝:");
		int n2 = scan.nextInt();
		
		System.out.println("잘라낸 문자열: "+ s.substring(n1,n2));
		
	}
	public static void string_f3() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하세요: ");
		s = scan.nextLine();
		
		//문자열위치찾기-indexOf(), lastIndexOf()
		System.out.print("\n검색할 단어 입력: ");
		String f = scan.nextLine();
		System.out.println(f);
		
		System.out.print("\n대체할 단어를 입력: ");
		String r = scan.nextLine();
		System.out.println(r);
		
		String rep = s.replace(f, r);
		System.out.println();
		System.out.print("단어바꾼 문자열:[" +rep +"]");
		
		
			
	}
	public static void string_f2() {
		Scanner scan = new Scanner(System.in);
		String s;
		
		System.out.println("문자열을 입력하세요: ");
		s = scan.nextLine();
		
		//문자열위치찾기-indexOf(), lastIndexOf()
		System.out.print("\n검색할 문자열을 입력: ");
		String f = scan.nextLine();
		System.out.println(f);
		
		System.out.println();
		System.out.print("입력된 문자열:[" +s +"]");
		
		System.out.println("\n처음위치:"+s.indexOf(f));//--검색문자열처음위치출력
		System.out.println("\n마지막위치:"+s.lastIndexOf(f));//--검색문자열마지막위치출력

	}
	public static void string_f1() {
		
		String s = "abcd1234";
		int n = 0;
		n =  s.length();
		
		System.out.println("문자열의 길이:"+n);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요: ");
		s = scan.nextLine();
		System.out.println("입력한 문자열의 길이:"+s.length());
		
	
		//문자열확인 - startsWidth(), endsWidth()
		if(!s.startsWith("(")) {
			System.out.printf("(");
		}
		
		//문자열위치 - charAt()
		//출력할때 문자를 바꿔주기
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
		// 변수를 선언하면 갯수가 많을경우 오류발생할 수도 있고 시간도 많이 걸린다.
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
		// 변수를 배열로 바꾸고, for 구문을 사용해서 배열을 입력, 출력할 수 있다. 
		//배열(array) 연속된데이터타입을 쉽게 쓰자, 연속된 것을 배열이라고 하자
		int [] a = new int[10];
		int c[];
		c = new int [10];
		
		
		//int a[10] //c 프로그래밍
		// 값을 저장해놓는다(입력)
		for (int i=0;i<10;i++) {
			if(i==0) {
				a[i]=1;
			}else {
				a[i]=a[0]*(i+1);
			}
		}
		// 값을 불러오기 (출력)
		System.out.println();
		System.out.print("data: ");
		for (int i=0;i<10;i++) {
			System.out.print("["+a[i]+"]");
		}
		
		//-----------------------------------
		// for 구문에 대한 코드길이는 같지만 배열의 갯수를 늘려서 사용할 수 있다.
		int n=1000;
		int b[] = new int[n];
		
		//int a[10] //c 프로그래밍
		// 값을 저장해놓는다(입력)
		for (int i=0;i<n;i++) {
			if(i==0) {
				b[i]=1;
			}else {
				b[i]=b[0]*(i+1);
			}
		}
		// 값을 불러오기 (출력)
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
		System.out.println("== if 구문을 사용한 예제 실행 == ");
		System.out.println("현재의 계절을 구합니다. 숫자를 입력해주세요(1~12): ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(3<=a && a<=5) {
			System.out.println("봄 입니다");
		}else if(6<=a && a<=8){
			System.out.println("여름 입니다");
		}else if(9<=a && a<=11) {
			System.out.println("가을 입니다");
		}else if(a==12 || a==1 || a==2) {
			System.out.println("겨울 입니다");
		}else {
			System.out.println("잘못입력했습니다. 1월~12월 사이에서 입력해주세요");
		}
	}
	public static void control_switch() {
		System.out.println("== switch 구문을 사용한 예제 실행 == ");
		System.out.println("현재의 계절을 구합니다. 숫자를 입력해주세요(1~12): ");
		// 345-> 봄, 678-> 여름, 91011->가을, 12,1,2->겨울
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 3:// if(a==3)
		case 4:// if(a==4)
		case 5:// if(a==5)
			System.out.println("봄 입니다");
			break;
		case 6:// if(a==6)
		case 7:// if(a==7)
		case 8:// if(a==8)
			System.out.println("여름 입니다");
			break;
		case 9:// if(a==9)
		case 10:// if(a==10)
		case 11:// if(a==11)
			System.out.println("가을 입니다");
			break;
		case 12:// if(a==12)
		case 1:// if(a==1)
		case 2:// if(a==2)
			System.out.println("겨울 입니다");
			break;
		default: //else { }
			System.out.println("잘못입력했습니다. 1월~12월 사이에서 입력해주세요");
			break;
		
		}
	}
	public static void control_for() {
		System.out.println("== for 구문을 사용한 예제 실행 == ");
		System.out.println("== 구구단 예제, 출력할 구구단의 범위를 정해주세요 == ");
		System.out.println("시작할 구구단에 대한 숫자를 입력해주세요(1~) : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("끝 구구단에 대한  숫자를 입력해주세요(1~9) : ");
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
		System.out.println("== while 구문을 사용한 예제 실행 == ");
		System.out.println("== 1부터 입력받은 숫자까지 덧셈을 수행== ");
		System.out.println("숫자를 입력해주세요(1~200000) : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i=0;
		int s=0;
		while(i<a) {//a=2?
			i++;
			s+=i;//1+2
		//
		}
		System.out.printf("1부터 %d까지의 합: %d", a,s);
	}
	public static void control_dowhile() {
		System.out.println("== do while 구문을 사용한 예제 실행 == ");
		System.out.println("== 1부터 입력받은 숫자까지 덧셈을 수행== ");
		System.out.println("숫자를 입력해주세요(1~200000) : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int s=0;
		int i=0;
		do {
			//계산
			i++;
			s+=i;
		}while(i<a);
		System.out.printf("1부터 %d까지의 합: %d", a,s);
	}
	public static int control_menu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제어연습을 합니다. if, for, while, do while, which ");
		System.out.println("------------------");
		System.out.println("메뉴 1) if  ");
		System.out.println("메뉴 2) switch ");
		System.out.println("메뉴 3) for ");
		System.out.println("메뉴 4) while ");
		System.out.println("메뉴 5) do~while ");
		System.out.println("메뉴 9) 메뉴 ");
		System.out.println("메뉴 0) 종료 ");
		System.out.println("------------------");
		System.out.println("메뉴를 선택하세요: ");
		
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
				System.out.println("메뉴를 확인하고 입력해주세요");
				break;
			}
			
		}while(m != 0);
		
		return ;
	}
	public static int dowhileEx() {
		System.out.println("dowhile, while 동작을 비교합니다");
		System.out.println("반복 회수를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i=0;
		while(i<a) {
			System.out.println("while 구문 동작....");
			i++;
			if(i>10) {
				System.out.printf("while출력횟수: %d\n", i);
				return 991;
			}
		}
		System.out.println("= while 출력 끝 = ");
		int j=0;
		do {
			System.out.println("do~while 구문 동작....");
			j++;
			if(j>15) {
				break;
			}
			
		}while(j<a);
		System.out.println("= do~while 출력 끝 = ");
		System.out.printf("while출력횟수: %d", i);
		System.out.printf("\ndo while출력횟수: %d", j);
		
		return 0;
		
	}
	public static void whileEx_menu() {
		System.out.println("구구단을 출력해줍니다");
		System.out.println("------------------");
		System.out.println("메뉴 1) 현재날자시간 ");
		System.out.println("메뉴 2) 구구단출력 ");
		System.out.println("메뉴 3) 계산기 ");
		System.out.println("메뉴 9) 메뉴 ");
		System.out.println("메뉴 0) 종료 ");
		System.out.println("------------------");
		System.out.println("메뉴를 선택하세요: ");
	}
	public static void whileEx() {
		Scanner scan = new Scanner(System.in);// 문자입력
				
		int a;
		//int i=0;
		whileEx_menu();
		while(true) {
			a = scan.nextInt();
			if(a==0) {
				System.out.println("종료합니다");
				break;
			}
			if(a==9) {
				System.out.println("메뉴를 안내합니다\n");
				whileEx_menu();
				continue;
			}
			if(a==1) {
				System.out.println("현재날자시간을 안내합니다");
				datetime_memu();
				
			}else if(a==2) {
				System.out.println("구구단출력을 출력합니다");
				gugudan_menu();
				
			}else if(a==3) {
				System.out.println("계산기를 시작합니다");
				//calculator_menu();
				operator1();
			}else {
				System.out.println("메뉴항목에 없습니다\n");
				
			}
			
			System.out.println("계속하려면 메뉴를 선택하세요: ");
		}
		
		
		
		
		
	}
	public static void gugudan_menu() {
		System.out.println("출력할 구구단을 입력하세요:");
		int s;
		Scanner scan = new Scanner(System.in);// 문자입력
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
		Scanner scan = new Scanner(System.in);// 문자입력

		System.out.println("시작, 끝단을 입력받아서 구구단을 계산합니다");
		System.out.println("시작할 구구단) 숫자 a를 입력하세요: ");
		a = scan.nextInt();
		System.out.println("끝 구구단) 숫자 b를 입력하세요: ");
		b = scan.nextInt();

		int s = 0;
		System.out.println("9x9단을 출력합니다");
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
		System.out.println("범위에서 구구단의 합산 계산=" + s);
	}
	public static void datetime_memu() {
		int h; 
		Calendar cal = Calendar.getInstance();
		h= cal.get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = h>12?"PM":"AM";
		
		System.out.println("1) 현재시간:"+ampm+" "+h);
		System.out.printf("2) 현재날자와 시간: [%1$tF %tT]%n"
				, Calendar.getInstance());
		
	}
	public static void control_3() {
		int h; 
		Calendar cal = Calendar.getInstance();
		h= cal.get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = h>12?"PM":"AM";
		System.out.println("1) 현재시간:"+ampm+" "+h);
		
		if(h>12) {
			ampm="PM";
		}else {
			ampm="AM";
		}
		System.out.println("2) 현재시간:"+ampm+" "+h);
		
		System.out.println();
		int p;
		int sensor_p=1000;
		String r;
		p=sensor_p>100? 10: -10;
		r=p>0? "전진":"후진";
		System.out.println("방향:"+r+", 구동 동력:"+p);
		
		String s;
		s=(r.equals("전진"))?"주행중입니다":"주행하고 있지 않습니다";
		System.out.println("주행판단:"+ s);
		
	}
	public static void datetime() {
		System.out.println("datetime에 대한 예제");
		System.out.println();
		System.out.printf("Local time의 출력: [%tT], 14:27:38 %n", Calendar.getInstance());
		System.out.printf("Local time의 출력: [%tr], 02:27:24 오후 %n", Calendar.getInstance());
		System.out.printf("Local time의 출력: [%tF], 2019-07-09  %n", Calendar.getInstance());
		System.out.printf("Local time의 출력: [%1$tF %1$tA] 2019-07-09 화요일%n", Calendar.getInstance());
		System.out.printf("Local time의 출력: [%1$tF %tT], 14:27:38 %n", Calendar.getInstance());
		
		int h; 
		Calendar cal = Calendar.getInstance();
		h= cal.get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = h>12?"PM":"AM";
		System.out.println("현재시간:"+ampm+" "+h);
		
		//계절판별
		// 봄 3~5, 여름6~8, 가을9~11, 겨울12~2
		int m,d;
		String mm="봄";
		m= cal.get(Calendar.MONTH);
		m+=1;
		d= cal.get(Calendar.DAY_OF_MONTH);
		switch(m) {
		case 3:
		case 4:
		case 5:
			mm="봄";
			break;
		case 6:
		case 7:
		case 8:
			mm="여름";
			break;
		case 9:
		case 10:
		case 11:
			mm="가을";
			break;
		case 12:
		case 1:
		case 2:
			mm="겨울";
			break;
		default:
			mm="봄";
			break;
		}
		System.out.printf("현재의 날자:%s월 %s일 - 입니다. ", m,d);
		System.out.println("현재의 계절:"+ mm);
		
	}
	public static void operator6_form() {
		System.out.printf("[%d] * %n", 12345);
		System.out.printf("[%10d] * %n", 12345);
		System.out.printf("[%-10d] * %n", 12345);
		
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
	public static void operator5() {
		System.out.println("비트연산");
		
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
		System.out.printf(" AND연산: %s", (a>=100) && (a<=200) );
		System.out.printf("\n OR연산: %s", (a>=100) || (a<=200) );
		System.out.printf("\n NOT연산: %s, not: %s", (a==100), !(a==100) );
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
	public static void operator2() {
		int a=0, b=0;
		int s=0;
		String m=null;
		int r=0;
		
		Scanner scan = new Scanner(System.in);// 문자입력
		
		System.out.println("논리연산을 합니다");
		System.out.println("숫자 a를 입력하세요: ");
		a = scan.nextInt();
		System.out.println("숫자 b를 입력하세요: ");
		b = scan.nextInt();
		
		System.out.println();
		System.out.println("1) ==  2) != 3) >  4) <");
		System.out.println("5) >=  6) <=  ");
		System.out.println("계산할 연산자를 선택해주세요: ");
		s = scan.nextInt(); //키보드 문자 입력
		
		if(s==1) {
			m="==";
			System.out.printf("연산식: %d %s %d, 결과: %s",a,m,b,a==b);
		} else if(s==2) {
			m="!=";
			System.out.printf("연산식: %d %s %d, 결과: %s",a,m,b,a!=b);
		} else if(s==3) {
			m=">";
			System.out.printf("연산식: %d %s %d, 결과: %s",a,m,b,a>b);
		} else if(s==4) {
			m="<";
			System.out.printf("연산식: %d %s %d, 결과: %s",a,m,b,a<b);
		} else if(s==5) {
			m=">=";
			System.out.printf("연산식: %d %s %d, 결과: %s",a,m,b,a>=b);
		} else if(s==6) {
			m="<=";
			System.out.printf("연산식: %d %s %d, 결과: %s",a,m,b,a<=b);
		} else {
			m=null;
		}
	}
	public static void operator1() {
	//연산자 조금더 알아봅시다
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
		Scanner scan = new Scanner(System.in);// 문자입력
		
		System.out.println("숫자 a를 입력하세요: ");
		a = scan.nextInt();
		System.out.println("숫자 b를 입력하세요: ");
		b = scan.nextInt();
		System.out.println();
		System.out.println("1) +=  2) -= 3) *=  4) /=");
		System.out.println("5) %=  6) ++ 7) --  ");
		System.out.println("계산할 연산자를 선택해주세요: ");
		s = scan.nextInt(); //키보드 문자 입력
/*논리계산
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

관계 연산자

 
*
*/
		if(1> s || s>7) {
			System.out.println("선택한 연산자는 없습니다. =끝=");
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
			m="-=";
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
		System.out.printf("계산식: %d %s %d",a,m,b);
		System.out.println("=> 계산결과는: " + n);
	}
	public static void input() {
		String m=null;
		Scanner scan = new Scanner(System.in);// 문자입력
		System.out.println("이름을 입력해주세요: ");
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
		System.out.print("계산 연비: "+ avg);
	}
	public static void string() {
		String s1 ="자두쥬스~";
		String s2 ="100";
		String s3 ="20";
		String value = null;
		
		int n1=0;
		int n2=0;
		
		n1 = Integer.parseInt(s2);
		n2 = Integer.parseInt(s3);
						
		System.out.printf("문자열:%s \n", s1);
		
		value = Integer.toString(n1*n2);
		System.out.printf("값:%s \n", n1*n2);
		
		System.out.println();
		System.out.println(s1+"값은 "+ value + " 입니다.");
		
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
		System.out.printf("%c의 ASCII값은 %d 입니다"
				, d, (int)d);
	}
	public static void datatype2() {
		//ASCII 7bit 0~127
		//UNICODE 3문자셋 표시
		//UTF-8 
		//UTF-16
	}
	public static void datatype1() {
//		 8 bit = 1 byte
//		 short = 2byte
//		 int   = 4byte
//		 int   = 2* short
//		long   = 2* int = 8byte
//		double = 2* int = 8byte
//		 float = 4byte 
	}
	public static void variable1() {
		int a;
		float b;
		a=123;
		b=321.45f;
		a = (int)b;//cast
		System.out.printf("a의 값은: %d \n", a);//---
		System.out.printf("b의 값은: %f \n", b);
		
	}
	public static void print4() {
		System.out.printf("\n줄바꿈\n연습\n"); // \n 
		
		System.out.printf("\t탭 넣기\t연습\n"); // \t
		System.out.printf("넣기\r\r덮어씁니다\n"); // \r
		System.out.printf("글자가 \"강조\"되는 효과\n"); //   \"
		System.out.printf("\\\\\\\\ 역슬래시 출력 \n"); //  \\
	}
	public static void print3() {
		System.out.printf("[%d]\n", 123);
		System.out.printf("[%5d]\n", 123);
		System.out.printf("[%05d]\n", 123);
		
		
		System.out.printf("[%f]\n", 123.45);
		System.out.printf("[%7.1f]\n", 123.45);
		System.out.printf("[%7.3f]\n", 123.45);
		
		System.out.printf("[%s]\n", "string123");
		System.out.printf("[%10s]\n", "string123");
		
		int i = 1234;
		float f = 1234.123456f;
		char c = 'c';
		String s = "string s";
		System.out.printf("정수의 10진수  d:[%d] \n", i);
		System.out.printf("정수의 16진수  x:[%X], \n", i);
		System.out.printf("정수의 8진수 o: [%o]  \n", i);
		System.out.printf("실수 자리수 표시 10.3f: [%10.3f] \n", f);
		System.out.printf("실수(공학) 표시  e: [%e],\n", f);
		System.out.printf("문자 표시  c: [%c]  \n", c);
		System.out.printf("문자열 표시  s: [%s]  \n", s);
		
		
		
	}

	public static void print2() {
		System.out.printf("%s %c %d", "abc", 'a', 123);
	}
	
	public static void print1() {
		System.out.print("abc");//줄바꿈 없이 출력
		System.out.print("123");
		
		System.out.println("abc");//줄바꿈
		System.out.println("123");
		
		String a = "abc";
		String b = "123";
		
		System.out.printf("%s %s", a, b);
		
		//System.out.printf("%s %s", a); //error
		
	}


	 		
}
