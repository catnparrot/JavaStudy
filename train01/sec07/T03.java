package train01.sec07;

public class T03 {
	public static void main(String[] args) {
		
		for(float x = 0.0F; x<=1.0F; x += 0.001F)
			System.out.printf("%5.3f  %10.7f\n", x, x*x);

			System.out.println("-------------------------------------------------");
		
		for(float y = 0.0F; y<=1.0F; y += 0.001F)
			System.out.printf("%5.3f  %10.7f\n", y, y*y);
	}

}
