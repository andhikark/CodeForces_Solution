//https://codeforces.com/contest/1154/problem/A
import java.util.Scanner;
import java.util.Arrays;
public class RestoringThreeNumber
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[4];
		
		for(int i = 0; i < 4;i++){
		    num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		for(int i = 0 ; i < 3;i++){
		    System.out.print((num[3] - num[i]) + " ");
		}
		scan.close();
	}
}