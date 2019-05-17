package kadai5;

import java.util.Scanner;

public class IntToEng {

    private static Scanner sc;

	// メインメソッド

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("入力 : ");
        int input = sc.nextInt();
        System.out.println("出力 : "+translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	StringBuffer number = null;
    	final String[] eNum1={
    			"zero", "one", "two", "three", "four",
    			"five", "six", "seven", "eight", "nine",
    			"ten","eleven", "twelve", "thirteen", "fourteen",
    			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    	if(n<20){
    		number=new StringBuffer(eNum1[n]);
    	}else{
    		
    	final String[] eNum10={
    			"twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	String n1=n.toString();
    	number=new StringBuffer(eNum10[n.charAt(0)]+eNum1[n.charAt(1)]);
    	
    	
    		
    	
    
      	

        return number.toString();

    }

}

