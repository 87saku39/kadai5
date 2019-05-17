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
    	}else if(20 <= n && n < 100){
    		
    	final String[] eNum10={
    			"twenty", "thirty", "forty", "fifty", "sixty",
    			"seventy", "eighty", "ninety"};
    	
    	//String n1=String.valueOf(n);
    	number=new StringBuffer(eNum10[(n/10)-2] + " " + eNum1[n%10]);
    	
    	}else if(100 <= n && n < 1000){
    		String h = "hundred";
    		String[] eNum100={
    				"one", "two", "three", "four",
        			"five", "six", "seven", "eight", "nine"
    		};
    		
    		number=new StringBuffer(eNum100[(n/100)-1] + eNum10[n/10)%10] + " " + eNum1[n%10]);
    	
    	
    	}
    	
        return number.toString();


}
}

