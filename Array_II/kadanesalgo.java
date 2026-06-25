// Program: Find the Maximum Subarray Sum using Kadane's Algorithm.
// Explanation: Kadane's Algorithm efficiently finds the maximum sum of a
// contiguous subarray by maintaining a current sum and a maximum sum.
// If the current sum becomes negative, it is reset to 0.
//
// Output Example:
// our max subarray sum is: 7
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class kadanesalgo {
    public static void kadanes(int arr[]){
       int ms=Integer.MIN_VALUE;
       int cs =0;
      for(int i=0; i<arr.length; i++){
        cs=cs+arr[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
       }
       System.out.println("our max subarray sum is:"+ms);
    }
   public static void main(String[] args) {
       int arr[]={-2,-3,4,-1,-2,1,5,-3};
       kadanes(arr);
   }
 }

