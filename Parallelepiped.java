//https://codeforces.com/problemset/problem/224/A

import java.util.Scanner;

public class Parallelepiped
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		int c  = sc.nextInt();
		
		int ans = (int) (4*(Math.sqrt(a * b / c) +  Math.sqrt(c * a / b)  + Math.sqrt(c * b / a)));
        System.out.print(ans);
        sc.close();
        }
	}
