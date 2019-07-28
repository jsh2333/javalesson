package JavaEx;

import java.util.Arrays;
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
//		arrayMatrix();//Ex5-22
		
//		forwhile_ex();//배수의 합계 계산
//		dowhile_ex();//입력된 문자열로부터 대문자,소문자,숫자 개수 계산
//		array_ex();//배열 연습
//		array_ex_basic();//배열 초기화에 대한 연습
//		array_ex2();
//		array_ex3();//2중 배열의 저장과 출력
//		array_ex4();//배열의 행,열 개수를 입력받아서 생성하는 예제 연습
//		array_ex5();//배열에 할당한 문자를 꺼내쓰는 연습
//		array_ex5_menu();//쌓기, 빼기 기능선택 메뉴작성 연습
//		array_ex6_sort_bubble();//버블정렬
//		bubbleSort_ex();
//		array_ex7();//3중 배열
		array_ex8_random_lotto();//random() 사용
	}



	private static void array_ex8_random_lotto() {
		int [] lotto = new int [6];
		Arrays.fill(lotto, 0);
		
		System.out.println("**로또 추첨하기**");
		int n;
		int errCnt=0;
		for(int i=0;i<6;i++) {
			//번호추첨
			n = getRandNumb();
			//번호중복이면 재추첨
			for(int j=0;j<6;j++) {
				if(lotto[j]==n) {
					errCnt++;
					n = getRandNumb(lotto);
				}else {
					lotto[i]=n;
				}
			}
			//중복되징 않은 번호만 배열에 입력
		}
		System.out.println("재추첨회수:"+ errCnt);
		System.out.println("추첨된 로또 번호:");
		for(int i=0;i<6;i++) {
			System.out.printf("%3d",lotto[i]);
		}
		
		
	}

	private static int getRandNumb() {
		int n = (int) (Math.random()*45 + 1);
		return n;
	}

	private static int getRandNumb(int[] lotto) {
		int n = (int) (Math.random()*45 + 1);
		
		for(int j=0;j<6;j++) {
			if(lotto[j]==n) {
				n = getRandNumb(lotto);
			}else {
				continue;
			}
		}
		
		return n;
	}


	private static void array_ex7() {
		int[][][] arr = new int[10][10][10];
		int n=1;
		System.out.printf("%dx%dx%d 배열의 값을 입력 \n", 10, 10, 10);
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					arr[i][j][k]=n++;
				}
			}
		}
		System.out.println("합계 계산, 출력");
		int sum=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					sum = sum + arr[i][j][k];
				}
			}
		}
		System.out.printf("%d 까지의 합계: %d", 10*10*10, sum );
		
		
	}



	private static void bubbleSort_ex() {
		int[] arr = {1,4,3,2,5};
		printArr(arr);
		bubbleSort(arr);
		printArr(arr);
		
	}

	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length-1);
	}

	private static void bubbleSort(int[] arr, int last) {
		if(last>0) {
			for(int i=0;i<=last;i++) {
				if(arr[i-1]>arr[i]) {
					swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, last-1);
		}
	}

	private static void printArr(int[] arr) {
		for(int data:arr) {
			System.out.printf("%3d", data);
		}
		System.out.println();
	}

	private static void swap(int[] arr, int i, int i2) {
		int tmp=0;
		tmp = arr[i];
		arr[i] = arr[i2];
		arr[i2]=tmp;
	}



	private static void array_ex6_sort_bubble() {
		int[] data = {1,2,3,10,4,6,5,9,8,7};
		System.out.println("정렬하기전 data:");
		
		for(int i=0;i<data.length;i++) {
			System.out.printf("%3d", data[i]);
		}
		System.out.println();
		System.out.println("정렬적용중...");
		
		int cnt=0;
		for(int i=data.length;i>0;i--) {
			for(int j=0;j<i-1; j++) {
				cnt++;
				//자리교환
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		System.out.println("정렬한후 data:");
		
		for(int i=0;i<data.length;i++) {
			System.out.printf("%3d", data[i]);
		}
		System.out.println();
		System.out.println("정렬 횟수 :"+cnt);
	}



	private static void array_ex5_menu() {
		char[] stack = new char[5];
		int top=0;
		
		int select;
		Scanner scan = new Scanner(System.in);
//		select = scan.nextInt();
		//책이름입력: A,B,C,D,E
		do {
			select=array_ex5_menuitem();
			
			switch (select) {
			case 1:
				if (top >= 5) {
					System.out.println("책쌓을 stack이 다 차서 공간이 없어요");
				} else {
					// 책 한권씩 쌓기
					System.out.println("책이름을 입력해주세요(ex: A,B,C,D,E): ");
					char book = scan.next().toUpperCase().charAt(0);

					System.out.println("1)맨위에 한권씩 책쌓아올리기");
					stack[top] = book;
					System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
					top++;
				}
				break;
			case 2:
				// 책 한권씩 빼기
				if (top <= 0) {
					System.out.println("stack에서 빼낼 책이 없어요");
				} else {
					System.out.println("2) 위에서부터 책한권씩 빼내기");

					top--;
					System.out.printf("맨위에서 한권 빼낸 책: %c \n", stack[top]);
					stack[top] = ' ';
				}
				break;
			case 3:
				// 보관된 책목록 출력
				System.out.println("쌓여있는 책:");
				for(int i=0;i<stack.length;i++) {
					System.out.printf("stack[%d]=%3c \n"
							,stack.length-1-i, stack[stack.length-1-i]);
				}
				break;
			case 4:
				// 선택메뉴출력
				continue;
			case 5:
				// 종료
				System.out.println("종료합니다");
				break;
			default:
				//
				System.out.println("선택번호를 확인해주세요.");
				// 선택 menu 출력
				array_ex5_menuitem();
				break;

			}
		} while (select !=5);
		
	}



	private static int array_ex5_menuitem() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("stack 책장 메뉴입니다");
		System.out.println("------------------");
		System.out.println("메뉴 1) 책 한권씩 쌓기 ");
		System.out.println("메뉴 2) 책 한권씩 빼기 ");
		System.out.println("메뉴 3) 보관된 책목록 출력 ");
		System.out.println("메뉴 4) 메뉴 ");
		System.out.println("메뉴 5) 종료 ");
		System.out.println("------------------");
		System.out.println("메뉴를 선택하세요: ");
		
		int m = scan.nextInt();
		return m;
	}



	private static void array_ex5() {
		System.out.println("책쌓아올리기: 배열에 할당한 문자를 꺼내쓰는 연습");
		
		char[] stack = new char[5];
		int top=0;
		
		System.out.println("1)맨위에 한권씩 책쌓아올리기");
		stack[top]='A';
		System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
		top++;
		
		stack[top]='B';
		System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
		top++;
		
		stack[top]='C';
		System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
		top++;
		
		stack[top]='D';
		System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
		top++;
		
		System.out.println("쌓여있는 책:");
		for(int i=0;i<stack.length;i++) {
			System.out.printf("stack[%d]=%3c \n"
					,stack.length-1-i, stack[stack.length-1-i]);
		}
		
		System.out.println("2) 위에서부터 책한권씩 빼내기");
		
		top--;
		System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
		stack[top]=' ';
		
		top--;
		System.out.printf("맨위에 쌓아올려놓은 책: %c \n", stack[top]);
		stack[top]=' ';
		
		System.out.println("쌓여있는 책:");
		for(int i=0;i<stack.length;i++) {
			System.out.printf("stack[%d]=%3c \n"
					,stack.length-1-i, stack[stack.length-1-i]);
		}
		
		
	}



	private static void array_ex4() {
		System.out.println("배열의 행,열 개수를 입력받아서 생성하는 예제 연습");
		Scanner scan = new Scanner(System.in);
				
		int row = 0, col = 0;
		
		System.out.println("행(row)의 개수: ");
		row = scan.nextInt();
		System.out.println("열(col)의 개수: ");
		col = scan.nextInt();
		
		int[][] nn = new int[row][col];
		int value = 1;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				nn[i][j] = value;
				value++;
			}
		}
		
		System.out.printf("%dx%d행렬출력: \n", row, col);
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.printf("%3d", nn[i][j]);
			}
			System.out.println();
		}
		
		
		scan.close();
	}



	private static void array_ex3() {
		int[][] nn =  new int [3][4];
		System.out.println("1) 배열입력, 출력");
		nn[0][0]=1;nn[0][1]=2;nn[0][2]=3;nn[0][3]=4;//nn[0][4]=1;
		nn[1][0]=5;nn[1][1]=6;nn[1][2]=7;nn[1][3]=8;//nn[1][4]=1;
		nn[2][0]=9;nn[2][1]=10;nn[2][2]=11;nn[2][3]=12;//nn2[2][4]=1;
		
		System.out.println("3x4 배열 출력");
		System.out.printf("%3d %3d %3d %3d \n", nn[0][0],nn[0][1],nn[0][2],nn[0][3]);
		System.out.printf("%3d %3d %3d %3d \n", nn[1][0],nn[1][1],nn[1][2],nn[1][3]);
		System.out.printf("%3d %3d %3d %3d \n", nn[2][0],nn[2][1],nn[2][2],nn[2][3]);
		
		System.out.println("2) 배열입력, 출력 for()구문으로 처리하기");
		
		int value = 1;
		for(int  i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nn[i][j] = value;
				value++;
			}
		}
		System.out.println("3x4 배열 출력");
		
		for(int  i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%3d ", nn[i][j]);
			}
			System.out.println();
		}
		
		int[][] nn3 = {
				{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};
		
		System.out.println("3) 배열선언할 때 입력을 설정, 값 초기화");
		
		System.out.println("3x4 배열 출력");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%3d ", nn3[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void array_ex2() {
		System.out.println("배열 인덱스 활용 연습 ");
		int[] n1 = new int [10];
		int n2 [] = new int[10];
		
		System.out.println("n1배열의 길이: "+ n1.length);
		System.out.printf("n1배열 요소의 크기 : %d 바이트(byte) \n", n1.length * Integer.BYTES);
		int i;
		for(i=0;i<n1.length;i++) {
			n1[i] = i*2;
		}
		
		System.out.println("n2배열의 길이: "+ n2.length);
		System.out.printf("n2배열 요소의 크기 : %d 바이트(byte) \n", n2.length * Integer.BYTES);
		for(i=0;i<n2.length;i++) {
			n2[i] = n1[9-i];
		}
		
		for(i=0;i<n1.length;i++) {
			System.out.printf("n1[%d]=%d, n2[%d]=%d \n", i, n1[i], i, n2[i]);
		}
	}

	private static void array_ex_basic() {
		System.out.println("배열 초기화에 대한 연습");
		int nn1[] = {100, 200, 300, 400};
		char cc1[] = {'a', 'b', 'c', 'd'};
		
		int nn2 [] = new int[] {100, 200, 300};
		char cc2 [] = new char[] {'a', 'b', 'c'};
		
		int nn3[];
		nn3 = new int[] {100, 200};
		char cc3[];
		cc3 = new char[] {'a','b'};
		
		int [] nn4 = new int[2];
		nn4[0]=100;
		nn4[1]=200;
		//nn4[2]='/0'; -> 배열의 끝번지에는 종료문자가 들어가 있다
		char [] cc4 = new char[2];
		cc4[0]='a';
		cc4[1]='b';
		
		System.out.println("숫자형출력");
		int i=0;
		for (i=0;i<nn1.length;i++) {
			System.out.printf("nn1[%d]=%d  ", i, nn1[i]);
		}
		System.out.println();
		for (i=0;i<nn2.length;i++) {
			System.out.printf("nn2[%d]=%d  ", i, nn2[i]);
		}
		System.out.println();
		for (i=0;i<nn3.length;i++) {
			System.out.printf("nn3[%d]=%d  ", i, nn3[i]);
		}
		System.out.println();
		for (i=0;i<nn4.length;i++) {
			System.out.printf("nn4[%d]=%d  ", i, nn4[i]);
		}
		System.out.println();
		
		System.out.println("문자형출력");
		for (i=0;i<cc1.length;i++) {
			System.out.printf("cc1[%d]=%c  ", i, cc1[i]);
		}
		System.out.println();
		for (i=0;i<cc2.length;i++) {
			System.out.printf("cc2[%d]=%c  ", i, cc2[i]);
		}
		System.out.println();
		for (i=0;i<cc3.length;i++) {
			System.out.printf("cc3[%d]=%c  ", i, cc3[i]);
		}
		System.out.println();
		for (i=0;i<cc4.length;i++) {
			System.out.printf("cc4[%d]=%c  ", i, cc4[i]);
		}
		System.out.println();
		
	}

	private static void array_ex() {
		System.out.println("배열 연습 -  입력숫자를 배열 변수에서 처리");
		
		Scanner scan = new  Scanner(System.in);
		
		System.out.println("배열의 개수를 입력- 몇개의 숫자를 입력받을까요?");
		int max=0;
		max =scan.nextInt();
		int [] nArr = new int[max];
		for(int i=0;i<max;i++) {
			System.out.printf("%d번째 숫자 입력: ", (i+1));
			nArr[i]=scan.nextInt();
			//System.out.println();
		}
		int sum=0;
		for(int i=0;i<max;i++) {
			sum += nArr[i];
		}
		
		System.out.printf("sum = %d \n", sum);
		scan.close();
	}

	private static void dowhile_ex() {
		System.out.println("입력된 문자열로부터 대문자,소문자,숫자 개수 계산 ");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요: ");
		String s = scan.nextLine();
		System.out.println("입력문자열의 길이: " + s.length());
		
		int i = 0;
		char ch;
		int upper_cnt=0, lower_cnt=0, digit_cnt=0;
		do {
			ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				//대문자 
				upper_cnt++;
			}
			if(ch>='a' && ch<='z') {
				//소문자 
				lower_cnt++;
			}
			if(ch>='0' && ch<='9') {
				//숫자 
				digit_cnt++;
			}
			i++;
		}while(i<s.length());
		System.out.println("i:"+i);
		System.out.printf("입력된 문자열로부터 대문자 %d,소문자 %d,숫자 %d 계수되었습니다 \n "
				,upper_cnt,lower_cnt,digit_cnt );
		
		System.out.println("프로그램을 다시 수행하고 싶으면 9를 입력해주세요");
	}

	private static int[] while_ex_input(){
		System.out.println("배수의 합계 계산 ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작하는 값을 입력: ");
		int start = scan.nextInt();
		System.out.println("종료하는 값을 입력: ");
		int end = scan.nextInt();
		System.out.println("배수 입력: ");
		int m = scan.nextInt();
		int [] param = new int[3];
		param[0]=start;
		param[1]=end;
		param[2]=m;
		
//		scan.close();
		return param; 
	}
	private static void forwhile_ex() {
		System.out.println("시작~종료 숫자 범위에서 입력된 숫자의 배수들의 합을 계산");
		int start, end;//시작, 종료
		int m;//배수
		
		int [] param = new int[3];
		
		param = while_ex_input();
		start= param[0];
		end = param[1];
		m = param[2];

		System.out.printf("=> start:%d end:%d m:%d \n",  start, end, m);
		
		//1) while()
		int i = start;
		int sum=0;
		while(i<=end) {
			if(i%m==0) {  //배수
				sum=sum+i;//합산
			}
			i++;
		}
		System.out.printf("(%d ~ %d) 범위 %d배수들의 합: %d \n", start, end, m, sum);
		
		Arrays.fill(param, 0);
		param = while_ex_input();
		start= param[0];
		end = param[1];
		m = param[2];
		
		sum=0;
		for(i=0;i<=end;i++) {
			if(i%m==0) {  //배수
				sum=sum+i;//합산
			}
		}
		System.out.printf("(%d ~ %d) 범위 %d배수들의 합: %d\n", start, end, m, sum);
		
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
