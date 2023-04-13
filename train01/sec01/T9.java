package train01.sec01;

//입력한 정숫값을 3으로 나눈다. 그리고 그 결과에 따라 "이 값은 3으로 나누어집니다.",
//"이 값을 3으로 나눈 나머지는 1입니다.", "이 값을 3으로 나눈 나머지는 2입니다."
//중 하나를 표시하는 프로그램을 작성하자
//(단, 양수가 아닌 경우 "양수가 아닌 값을 입력했습니다."라고 표시할 것

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("정숫값: ");
		int a = x.nextInt();
		if(a>0)
			if(a%3==0)
				System.out.println("이 값은 3으로 나누어집니다");
			else if(a%3==1)
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다");
			else 
			//else if (a%3==2)를 입력하면 if(a>0)에 대한 else 값이 출력되지 않는다. 왜?
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다");
		else
			System.out.println("양수가 아닌 값을 입력했습니다.");
	}

}
