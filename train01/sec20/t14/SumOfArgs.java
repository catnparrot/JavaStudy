package train01.sec20.t14;

public class SumOfArgs {
	public static void main(String[] args) {
		double sum = 0.0;
		for (String s:args)
			sum += Double.parseDouble(s);
		System.out.println(sum);
	}
}
