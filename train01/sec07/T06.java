package train01.sec07;

public class T06 {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++)
			a[i]=5-i;
		
		//System.out.println(i);
		
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"] = " + a[i]);
	}

}
