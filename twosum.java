import java.util.Scanner;
import java.util.Arrays;

class Solution {
    int[] twoSum(int[] arr, int t){
        int[] result = new int [2];
        for(int i =0 ; i<arr.length ; i++){
            for(int j=i+1; j<=arr.length - 1; j++){
                 if(arr[i]+arr[j]==t)
                {
                    result[0] = i;
                    result[1] = j;
                    
                }
            }
           
        }
        return result;
    }
}

public class twosum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution sol_obj = new Solution();

        int array_size = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[array_size];

        for (int i=0 ; i<array_size; i++){
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }

        int target = sc.nextInt();
        sc.nextLine();
       

       

        // int[] numbers = { 2, 7, 11, 15 };
        // int target = 26;
        int [] answer = new int[2];
        answer = sol_obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(answer));

        sc.close();
    }

}
