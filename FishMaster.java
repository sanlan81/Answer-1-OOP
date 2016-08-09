import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fish myFish = new Fish();
		String feetString = "";
		int feet;
		
		myFish.dive(2);
		myFish.dive(97);		
		myFish.dive();
		myFish.dive(97);
		myFish.dive(3);
		myFish.sleep();
		System.out.println(myFish.say("Hi"));
		
		
		
		/*BufferedReader  stdin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true){
			
			System.out.println("Готова к погружениюй.На какую глубину?");
			
			try {
				feetString = stdin.readLine();
				
				if(feetString.equals("Q")){
					
					System.out.println("Пока!");
					System.exit(0);
					
				}else{
					
					feet = Integer.parseInt(feetString);
					myFish.dive(feet);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}*/


	}

}
