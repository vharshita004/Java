import java.util.*;
class array1{
    public static void main(String[] args){
      Scanner o = new Scanner(System.in);
      System.out.println("enter size of arrn:");
      int n = o.nextInt();
      int arr[] = new int[n];
      System.out.println("enter value of arr : ");
      for(int i=0;i<n;i++){
        arr[i]= o.nextInt();
      }
      for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
      }
    }
}