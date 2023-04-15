import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < n;i++){
		    arr[i] = scan.next();
		}
		
		for(int i = 0; i < n;i++){
		    if(arr[i].length() <= 10){
		        System.out.println(arr[i]);
		    }else{
		        int b = arr[i].length() - 2;
		        String x = String.valueOf(b);
		        System.out.println(arr[i].charAt(0) + x + arr[i].charAt(arr[i].length() - 1));
		    }
		}
        scan.close();
	}
}