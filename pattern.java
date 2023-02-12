import java.util.*;

// Pattern class with main function and solve function...
public class pattern{

// Solve function for printing the desired pattern -> 12 9 6 3 0 3 6 9 12 
public static void solve(int n , int m){
  if(n <= 0){
    System.out.print(n + " ");
    return;
  }
  System.out.print(n + " ");
  solve(n - m, m);
  System.out.print(n + " ");

}

// Main function takes two number from user and then call solve function with n and m as parameters...
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First and Second : ");
  int n = sc.nextInt();
  int m = sc.nextInt();
  solve(n, m);
}
}