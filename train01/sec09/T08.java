package train01.sec09;

import java.util.Scanner;

public class T08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int classNum = sc.nextInt(); 	//학급 수
		int[][] point = new int[classNum][];
		int totNum = 0; 				//모든 학급의 총 학생 수
		
		for (int i = 0; i<point.length; i++) {
			/*i+1반 학생 수*/;
			int num = sc.nextInt();
			point[i] = new int[num];
			totNum += num;
			for (int j = 0; j<point[i].length; j++) {
				/*(i+1)반 (j+1)번 점수: */;
				point[i][j] = sc.nextInt();
			}
		}

		int total = 0;
		for (int i = 0; i<point.length; i++) {
			int sum = 0;
			for (int j =0; j<point[i].length; j++)
				sum += point[i][j];
			total += sum;
			/*</2>(i+1)반 |</7>sum</7>(sum/point[i].length)<.1> */
			
		}
		/*합 | </7>total</7>total/totNum<.1>*/
	}
}
