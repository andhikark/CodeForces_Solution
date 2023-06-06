import java.util.Scanner;
import java.util.Arrays;
public class HelpfulMaths
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] numbers = s.split("\\+"); 
        int[] arr = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]); 
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < numbers.length;i++){
            if(i != numbers.length - 1){
            System.out.print(arr[i]+"+");
            }else{
             System.out.print(arr[i]);  
            }
        }
        sc.close();
	}
}
