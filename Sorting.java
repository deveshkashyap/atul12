import java.util.*;

public class Sorting{

public static void sortScore(int [] arr){
    int n = arr.length;
    for (int i = 0; i < n-1; i++)
        {
        int min_idx = i;
        for (int j = i+1; j < n; j++){
            if (arr[j] < arr[min_idx]){
                min_idx = j;
            }
        }
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
        }
}
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter n in the array : ");
  int n = sc.nextInt();
  int[] arr = new int[n];
  System.out.println("Enter element in the array : ");
  for(int i=0; i<arr.length; i++){
    arr[i] = sc.nextInt();
  }
    System.out.println("Elements before sort \n");
  for(int i=0; i<arr.length; i++){
    System.out.println("Element of the array " + i + " : " + arr[i]);
  } 
  sortScore(arr);
    System.out.println("Elements After sort \n");

    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }

}

}