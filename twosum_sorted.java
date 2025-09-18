import java.util.*;

class Solution {
    int[] twoSum(int[] arr, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int complement = t - arr[i];

            if (map.containsKey(complement)) {
                result[0] = map.get(complement)+1;
                result[1] = i+1;
                Arrays.sort(result);
                return result;
            }
            map.put(arr[i], i);
        }

        return result;
    }
}

public class twosum_sorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution sol_obj = new Solution();

        int array_size = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(numbers);
        int target = sc.nextInt();
        sc.nextLine();

        int[] answer = new int[2];
        answer = sol_obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(answer));

        sc.close();
    }

}
