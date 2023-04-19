
import java.util.Scanner;

public class UltraFastMathematician
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int p = 0;
		String result = "";
		
		while(p < ch1.length){
		    if(ch1[p] == ch2[p]){
		        result += "0";
		    }else{
		        result += "1";
		    }
		    
		    p++;
		}
		
		
		System.out.print(result);
		scan.close();
	}
}
