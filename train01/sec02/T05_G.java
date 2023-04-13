package train01.sec02;

//키보드에서 입력한 3개의 정숫값 중 중앙값을 구해서 표시하는 프로그램을 작성하자.
//예를 들어 2, 3, 1의 중앙값은 2이고 1, 2, 1의 중앙값은 1이고, 3, 3, 3의 중앙값은 3이다.
import java.util.Scanner;
import java.util.Arrays;

public class T05_G {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3개의 정숫값 입력 받기
        System.out.print("정숫값 a: ");    int a = scanner.nextInt();
        System.out.print("정숫값 b: ");    int b = scanner.nextInt();
        System.out.print("정숫값 c: ");    int c = scanner.nextInt();

        // 입력받은 값을 배열에 저장
        int[] nums = {a, b, c};

        // 배열을 정렬
        Arrays.sort(nums);

        // 중앙값 출력
        System.out.println("중앙값은 " + nums[1] + "입니다.");
			
	}
}