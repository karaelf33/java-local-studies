import java.util.*;

public class TwoSum {
    // input [2,3,7,4,8] target =7 output =>3+4=7

    public static int badWayCalculate(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] + input[j] == 7) {
                    System.out.println(i + "<=index" + " input=>" + input[i]);
                    System.out.println(j + "<=index" + " input=>" + input[j]);
                    return i + j;
                }
            }
        }
        return 0;
    }

    public static int[] goodWayCalculate(int[] input, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int delta = target - input[i];
            if (visitedNumbers.containsKey(delta)) {
                return new int[]{i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(input[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 7, 4, 8};
        int target = 7;
        badWayCalculate(input, target);
        System.out.println("*********************");
        int[] result=goodWayCalculate(input, target);
        System.out.println(result[0]+"--"+result[1]);
    }

}
