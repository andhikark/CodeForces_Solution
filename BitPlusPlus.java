// https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

public class BitPlusPlus
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int count = 0;
		
		for(int i = 0; i < n;i++){
		    String s = sc.next();
		    
		    if(s.contains("+")){
		        count++;
		    }else if (s.contains("-")){
		        count--;
		    }
		}
		
		System.out.print(count);
        sc.close(); 
	}
}
