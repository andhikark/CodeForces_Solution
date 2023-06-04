// https://codeforces.com/problemset/problem/133/A

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.contains("H") || s.contains("Q") || s.contains("9")){
		    System.out.print("YES");
		}else{
		     System.out.print("NO");
		}

        sc.close();
	}
}
