// Program: Find the Maximum Subarray Sum using the Prefix Sum technique.
// Explanation: A prefix array stores cumulative sums, allowing each subarray sum
// to be calculated in O(1) time instead of summing elements repeatedly.
// Output Example:
// Sum=2
// Sum=6
// Sum=12
// ...
// Maximum Sum = 37
public class  Prefixarray{ 
    public static void  maxSubarraySum(int arr[]) {
          int sum=0;
           int maxsum = Integer.MIN_VALUE; //-infintiy
           int prefix[]=new int[arr.length];

           prefix[0]=arr[0];
           //calculate prefix array
           for(int i=1;i<prefix.length;i++){ 
    prefix[i]=prefix[i-1] + arr[i];
}
          for(int i =0;i<arr.length;i++){
            int start=i;

          for(int j=i; j<arr.length; j++){ 
                int end =j;
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
    
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
