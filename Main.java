import java.util.*;

public class Main{

public static void pattern(int n , int m){
  if(n <= 0){
    return;
  }
  System.out.print(n + " ");
  pattern(n - m, m);
  pattern(n + m, m);
}

public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First and Second : ");
  int n = sc.nextInt();
  int m = sc.nextInt();
  pattern(n, m);
  // int[] arr = new int[n];
  // // arr[0] = 1;
  // // arr[1] = 21;
  // // arr[2] = 13;
  // // arr[3] = 14;
  // // arr[4] = 16;
  // System.out.println("Enter element in the array : ");
  // for(int i=0; i<arr.length; i++){
  //   arr[i] = sc.nextInt();
  //   // System.out.println(arr[i]);
  // }

  // for(int i=0; i<arr.length; i++){
  //   // arr[i] = sc.nextInt();
  //   System.out.println("Element of the array " + i + " : " + arr[i]);
  // } 

}

}



    // int resCount;
    // public void test(){
    //     for(int i=0; i<10; i++){
    //         resCount = 0;
    //         pow(i);
    //         System.out.print(resCount + ",");
    //     }
    //     System.out.println();
    // }
    // public int pow(int n, int[] dp){
    //     resCount = resCount + 1;
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(dp[n] != -1){
    //         return dp[n];
    //     }
    //     return dp[n] = pow(n-1, dp) + pow(n-1, dp);
    // }