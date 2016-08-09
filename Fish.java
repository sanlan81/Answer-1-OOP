
public class Fish extends Pet {
	private int currentDepth = 0;
	final int DEFAULT_DIVING = 5;
	
	
	public int getCurrentDepth() {
		return currentDepth;
	}
	public void setCurrentDepth(int currentDepth) {
		this.currentDepth = currentDepth;
	}
	
	
	Fish() {
		// TODO Auto-generated constructor stub
		
		currentDepth = 10;
		
	}

	 Fish(int startingPosition) {
		// TODO Auto-generated constructor stub
		 currentDepth = startingPosition;
	}







	public int dive() {
		// TODO Auto-generated method stub
		
		currentDepth = currentDepth + DEFAULT_DIVING;
		

		if(currentDepth > 100){
			System.out.println("I am smoll fish and can'not swim to deeply");
			currentDepth = currentDepth - DEFAULT_DIVING;
			
			
		}else{
			System.out.println("I am going to swim more deeply to " + DEFAULT_DIVING);
			System.out.println("I am on the " + currentDepth + " feets below sea" );
		}
		
		return currentDepth;
	}
	
	
	
	
	
	
	
	public int dive (int howDepth){
		
		currentDepth = currentDepth + howDepth;
		System.out.println(currentDepth);
		
		if(currentDepth > 100){
			System.out.println("I am smoll fish and can'not swim to deeply");
			currentDepth = currentDepth - howDepth;
		}else{
			System.out.println("I am going to swim more deeply to " + howDepth);
			System.out.println("I am on the " + currentDepth + " feets below sea" );
		}
		
		return currentDepth;
	}



	
	//public String say(String somthing){
		//return "the fish is dead";
	//}
	

}
