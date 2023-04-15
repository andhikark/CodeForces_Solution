import java.util.Scanner;
public class YesYes {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];
		String check = "YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
		for(int i = 0;i < n;i++){
		    str[i] = scan.next();
		   
		}
		for(String a: str){
		    if (check.contains(a)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
        scan.close();
	}
}