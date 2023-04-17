import java.util.Scanner;
public class Borze
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String result = "";
		int i = 0;
		while(i < n.length()){
		    if(n.charAt(i) == '.'){
		        result+= "0";
		        i++;
		    }else if(n.charAt(i) == '-' && n.charAt(i+1) == '-'){
		        result += "2";
		        i+=2;
		    }else if(n.charAt(i) == '-' && n.charAt(i+1) == '.') {
		        result += "1";
		        i+=2;
		    }
		}
		
		System.out.print(result);
        scan.close();
	}
}
