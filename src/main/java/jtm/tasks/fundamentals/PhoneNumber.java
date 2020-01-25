package jtm.tasks.fundamentals;

public class PhoneNumber {

    /*
    TODO

    Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers
    in the form of a phone number.

    Example:
    createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

    The returned format must be correct in order to complete this challenge.
    Don't forget the space after the closing parentheses!
     */

    public static String createPhoneNumber(int[] numbers) {
    	/*String a ="aaa";
    	a=a+1; // the result will be "aaa1"
    	String str="";
    	for (int i=0;i<numbers.length;i++){
    		str=str+1;
    	}*/
    	
    	String phoneNumber="(";
    	phoneNumber=phoneNumber + numbers[0]+ numbers[1] + numbers[2]+ ") "+ numbers[3];
    /*	for (int i=0;i<numbers.length;i++){
    		if (i==2){
    			phoneNumber=phoneNumber+numbers[i]+") ";
    	} else if (i==5){
    		phoneNumber=phoneNumber+numbers[i]+"-";
    	}
    		phoneNumber=phoneNumber+numbers[i];
    	}*/
    	System.out.println(phoneNumber);
    	
      return phoneNumber;
    }
}
