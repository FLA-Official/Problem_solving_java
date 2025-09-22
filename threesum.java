import java.util.*;
class Checker {
    public List<List<Integer>> duplicate(List<List<Integer>> result){
        List<List<Integer>> normalised = new ArrayList<>();
        // Sorting out the inner list in case of examples like [[1,2,3], [3,2,1]]
        // both will count as duplicate after sorting it out below
        for(List<Integer> inner: result){
            List<Integer> copy = new ArrayList<>(inner);
            Collections.sort(copy);
            normalised.add(copy);
        }
        //Removing duplicate using LinkedHashSet (Also Keeps Order of the list)
        Set<List<Integer>> unique = new LinkedHashSet<>(normalised);
        // Converting back to List<List<Integer>> as required
        List<List<Integer>> final_result = new ArrayList<>(unique);

        return final_result;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Checker check = new Checker();
        Arrays.sort(arr);
        List<List <Integer>> result = new ArrayList<>();
        for (int i = 0; i < (arr.length) - 2; i++) {
            int target = 0; // as by default
            if(i>0 && arr[i] == arr[i-1])continue;
            int left = i + 1; //taking imidiate next value of the array from the iteration
            int right = (arr.length) - 1; // taking the last value of the array from the iteration
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right]; //adding three values
                //checking if the sum is equal to 0 or not. if it is it will be added in the list as list converted from array.
                if (sum == target) {
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            
        }
        // removing duplicate list.
        result = check.duplicate(result);
        
        return result;
    }
}

public class threesum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int number_array = sc.nextInt();
        sc.nextLine();
        int [] numbers = new int[number_array];

        for(int i=0 ; i<number_array; i++){
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
       
        List<List<Integer>> triplets = new ArrayList<>();

        Solution sol = new Solution();
        // passing the array to function threeSum in Solution Class
        triplets = sol.threeSum(numbers);
        
        System.out.println(triplets);

        sc.close();
    }
}
