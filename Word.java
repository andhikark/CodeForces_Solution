//https://codeforces.com/problemset/problem/59/A
import java.util.Scanner;
public class Word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int upper = 0,lower = 0;
        
        for(int i = 0 ; i < s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                lower++;
            }else{
                upper++;
            }
        }
        
        if(upper > lower){
            System.out.print(s.toUpperCase());
        }else{
            System.out.print(s.toLowerCase());
        }
        
        sc.close();
    }
}
