
import java.util.Scanner;
public class NearlyLuckyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int lucky = 0;
        
        while(n > 0){
            if(n % 10 == 7 || n % 10 == 4){
                lucky++;
            }
            n/=10;
        }
       
       if(lucky == 7 || lucky == 4){
           System.out.print("YES");
       }else{
           System.out.print("NO");
       }
       
    }
}
