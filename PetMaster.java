
public class PetMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String petReaction;
		
		Pet myPet = new Pet();
		
		myPet.eat();
		
		petReaction = myPet.say("Chik chirik");
		
		System.out.println(petReaction);
		
		myPet.sleep();
		

	}

}
