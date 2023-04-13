package train01.sec02;

//0, 1, 2 중 하나의 난수를 생성해서 0이면 "가위", 1이면 "바위", 2이면 "보"를 표시하는 프로그램을 작성하자
import java.util.Random;
public class T09 {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("컴퓨터 손: ");
		int x = rand.nextInt(3);
		
		switch(x) {
			case 0:		System.out.println("가위");	break;
			case 1:		System.out.println("바위");	break;
			case 2:		System.out.println("보");	break;
		}		
	}

}
