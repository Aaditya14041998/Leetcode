package dsa;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 1111111;
		boolean Happy= isHappy(n);
		System.out.println(Happy);

	}
	
	    public static boolean isHappy(int n) {
	       int sumOfDigit = 0;
	       int temp = n;

	       while(temp!=0){
	           int digit = temp%10;
	           sumOfDigit+=digit*digit;
	           temp /=10; 
	       }

	       if(sumOfDigit == 1){
	           return true;
	       }else if(sumOfDigit<10){
	           return false;
	       }else{
	          return isHappy(sumOfDigit);
	       }
	        
	    }
	}


