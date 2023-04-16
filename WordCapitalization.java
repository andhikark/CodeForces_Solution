//https://codeforces.com/contest/281/problem/A

import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.print(str.substring(0,1).toUpperCase() + str.substring(1));
        scan.close();
    }
}