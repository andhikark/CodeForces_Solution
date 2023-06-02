//https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;
public class QueueAtSchool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        char[] ch = s.toCharArray();
        
        for(int j = 0; j < x;j++){
            for(int i = 0; i < ch.length;i++){
                if(ch[i] == 'B' && i != ch.length - 1 && ch[i + 1] != 'B'){
                    char temp = ch[i];
                    ch[i] = ch[i + 1];
                    ch[i + 1] = temp;
                    ++i;
                }
            }
        }
        
        for(char a : ch){
            System.out.print(a);
        }
    }
}
