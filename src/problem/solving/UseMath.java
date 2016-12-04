package problem.solving;

import java.util.Random;

public class UseMath {

	public static void main(String[] args) {
		
		int [] array = new int [10];
		Random random = new Random();
		for(int i=0; i<array.length; i++){
		      array[i] = random.nextInt(100000);
		      //System.out.println(array[i]);  
		}
		
		for(int i=0; i<array.length; i++){
		      System.out.println(array[i]);
		}
	} 

}
