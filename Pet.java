
public class Pet {
	private int age;
	protected float weight;
	protected float height;
	protected String color;
	
	public void sleep(){
	System.out.println("Good night!See you tomorrow");
	}
	public void eat(){
		System.out.println("I am hungry,let's eat cheeps");
	}

	public String say(String aWord){
		String petResponse = "Okey!!" + aWord;
		return petResponse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
