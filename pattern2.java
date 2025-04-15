import java.util.*;
class pattern2{
    public static void main(String[] args){
          Scanner u = new Scanner(System.in);
          System.out.println("Enter a no.");
          int n = u.nextInt();
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print('*');
          } 
        System.out.println("\n");
        }
          
    }
}