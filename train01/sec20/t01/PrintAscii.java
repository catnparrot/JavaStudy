package train01.sec20.t01;

class PrintAscii {
	public static void main(String[] args) {
		for (int i = 0x21; i <= 0x7E; i++)
			System.out.printf("%c %04x\n", i, (int)i);
	}
}
