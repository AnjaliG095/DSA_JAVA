package DSA_Java.Array_II;
// Program: Find the Maximum Subarray Sum using the Brute Force approach.
// Output Example: Maximum Sum = 37
//
// Time Complexity: O(n³)
// Space Complexity: O(1)

public class MaxsubarraySum{ 
   public static void  maxSubarraySum(int arr[]) {
   
           int maxsum = Integer.MIN_VALUE; //-infintiy
          for(int i =0;i<arr.length;i++){
            int start=i;
           
          for(int j=i; j<arr.length; j++){ 
                int end =j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                sum=sum+arr[k];
                   
            }
            
            System.out.println("Sum="+sum);
            if(sum>maxsum){
                maxsum=sum;
            }
          }
        
   }
        System.out.println("Maximum Sum = " + maxsum);
   }
   public static void main(String[] args) {
       int arr[]= {2,4,6,8,8,9};
       maxSubarraySum(arr);
   }
}
    

