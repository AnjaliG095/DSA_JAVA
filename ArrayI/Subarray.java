// Program: Print all possible subarrays of an array.
// Output Example:
// 2
// 2 4
// 2 4 6
// ...
//
// Time Complexity: O(n³)
// Space Complexity: O(1)

public class Subarray{ 
   public static void subarray(int arr[]){
          for(int i =0;i<arr.length;i++){
            int start=i;
           for(int j=i;j<arr.length; j++){ 
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] + " ");
            }
            System.out.println("");
          }
        
   }

   }
   public static void main(String[] args) {
       int arr[]= {2,4,6,8,8,9};
       subarray(arr);
   }
}


    

