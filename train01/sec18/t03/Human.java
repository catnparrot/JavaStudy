package train01.sec18.t03;

class Human {
	private static int counter = 0;
	private String name;
	private int height;
	private int weight;
	private int id;
	private Day birthday;
	
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
		id = ++counter;
	}
	
	public String getName() { return name;	}
	public int getHeight() { return height;	}
	public int getWeight() { return weight;	}
	public Day getBirthday() {	return new Day(birthday);	}

	public void gainWeight(int w) {weight += w;}
	public void reduceWeight(int w) {weight -= w;}
	
	public int getId() {return id;}
	
	//--데이터 표시--//
	public void putData() {
		System.out.println("이름: " + name);
		System.out.println("신장: " + height+"cm");
		System.out.println("체중: " + weight+"kg");
	}
	
	public String toString() {
		return "{" + name+": "+height+"cm "+ weight + "kg "
					+ birthday + "출생}";
	}
}
