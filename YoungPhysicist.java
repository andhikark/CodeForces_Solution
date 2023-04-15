import java.util.Scanner;

public class YoungPhysicist{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 0;
        int y = 0; 
        int z = 0;
        
        for(int i = 0; i < n;i++){
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int z1 = scan.nextInt();
            
            x += x1;
            y += y1;
            z += z1;
        }
        
        if(x == 0 && y == 0 && z == 0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        scan.close();
    }
}