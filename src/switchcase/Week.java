package switchcase;

public class Week {
	
	public void whatToDoToday(int choice){
		String day = "";
		switch(choice){
		
		case 1: day ="MONDAY";
		     System.out.println("Start reading Data Structure book, Topics ArrayList");
		     break;
		case 2: day ="TUESDAY";
	         System.out.println("Start reading Data Structure book, Topics LinkedList");
	         break;
		case 3: day ="WEDNESDAY";
	         System.out.println("Start reading Data Structure book, Topics Stack and Queue");
	         break;
		case 4: day ="THURSDAY";
		     System.out.println("Start reading Data Structure book, Topics HashMap");
		     break;
		case 5: day ="FRIDAY";
		     System.out.println("Start reading Data Structure book, Topics HashTable");
		     break;
		case 6: day ="SATURDAY";
		     System.out.println("Start reading Data Structure book, Topics Sorting Algorithm");
		     break;
		case 7: day ="SUNDAY";
		     System.out.println("Start reading Data Structure book, Topics Graph and Tree");
		     break;
		default: day ="Invalid day";
		     System.out.println("Not a valid day. you can sleep");
		     break; 
		}
	}

}
