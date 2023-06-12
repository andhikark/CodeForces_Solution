import java.util.Scanner;
public class Football
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String c = "";
		int count = 1;
		for(int i = 0; i < n - 1;i++){
		    String  x = sc.next();
		    if(s.equals(x)){
		        count++;
		    }else{
		        c = x;
		    }
		}
		
		if(n == 1 || count > n - count){
		    System.out.print(s);
		}else{
		    System.out.print(c);
		}
        sc.close();
	}
}
