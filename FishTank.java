

import java.util.ArrayList;

public class FishTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList fishTank = new ArrayList();
		
		Fish theFish;
		
		Fish aFish = new Fish(20);
		
		aFish.color = "�������";
		aFish.weight = 2;
		fishTank.add(aFish);
		
        aFish = new Fish(10);
		
		aFish.color = "�������";
		aFish.weight = 5;
		fishTank.add(aFish);
		
		int fishCount = fishTank.size();
		
		for(int i = 0; i < fishCount; i++){
			
			theFish = (Fish) fishTank.get(i);
			
			System.out.println("������ " + theFish.color + 
					"���� � ����� " + theFish.weight + "��.�������: "
					+ theFish.getCurrentDepth());
			
		}
		
		

	}

}
