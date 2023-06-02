//https://codeforces.com/contest/263/problem/A

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main (String[] args)
	{
		try (// Input
		Scanner sc = new Scanner(System.in)) {
			int i = 0;
			int j = 0;
			for (i = 0; i < 5; i++) {
				if (sc.nextInt() == 1) {
					break;
				}

				if (i == 4) {
					j++;
					i = -1;
				}
			}

			System.out.println(Math.abs(i-2)+Math.abs(j-2));
			sc.close();
		}
	}
}
