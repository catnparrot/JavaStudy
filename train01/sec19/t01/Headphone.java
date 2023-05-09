package train01.sec19.t01;

public class Headphone implements Wearable {
	 int vol=0;

	public void putOn() {
		System.out.println("헤드폰을 착용했습니다.");
	}

	public void putOff() {
		System.out.println("헤드폰을 벗었습니다.");
	}

	public void setVol(int vol) {
		this.vol = vol;
		System.out.println("볼륨을"+ vol +"로 변경했습니다.");
	}	 
}