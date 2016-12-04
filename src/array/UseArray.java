package array;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		
		int [] array = new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input values: ");
		for(int i=0; i<array.length; i++){	
		 array[i] = sc.nextInt();
		}
		System.out.println("Let's retrieve the values from the array......");
		for(int i = 0; i<array.length; i++){
		   System.out.println(array[i]);
		}
		try{
			if(sc != null){
		      sc = null;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		} finally{
			
			if(sc != null){
			      sc = null;
				}
			}
	}

}
