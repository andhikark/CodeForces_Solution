//https://codeforces.com/problemset/problem/266/A 
import java.util.Scanner;

public class StonesOnTheTable
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String stone = scan.next();
		char[] ch = stone.toCharArray();
		int count = 0;
		
		for(int i = 0; i < n - 1;i++){
		    if(ch[i] == ch[i + 1]){
		        count++;
		    }
		}
		
		System.out.print(count);
		scan.close();
	}
}
