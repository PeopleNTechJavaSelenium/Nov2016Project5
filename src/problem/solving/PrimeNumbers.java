package problem.solving;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		//give a list of prime numbers
		long startTime = System.currentTimeMillis();
		int numberOfPrimeNumbers = 0;
		for(int i=2; i<=1000000; i++){
			if(isPrimeByCheckingEachValue(i)){
				System.out.println(i);
				numberOfPrimeNumbers++;
				
			}
		}
		System.out.println("Total prime numbers up to this point: " + numberOfPrimeNumbers);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}
	public static boolean isPrimeByCheckingEachValue(int n){
		for (int i=2; i<n; i++){
			if(n%i==0)
				return false;
		}
	  return true;
	}
	public static boolean isPrimeByCheckingCube(int n){
		if(n%2==0) return false;
		for (int i=3; i*i<=n; i+=2){
			if(n%i==0)
				return false;
		}
	  return true;
	}


}
