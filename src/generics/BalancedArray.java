package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BalancedArray {
    public static int balancedSum(List<Integer> arr) {
        int right_sum = 0, left_sum = 0;

        int i = -1, j = -1;

        for (i = 0, j = arr.size() - 1; i < j; i++, j--) {
            left_sum += arr.get(i);
            right_sum += arr.get(i);

            if (left_sum < right_sum) {
                i++;
                left_sum += arr.get(i);
            }

            if (right_sum < left_sum && i < j) {
                j--;
                right_sum += arr.get(i);
            }
        }
        if (left_sum == right_sum && i == j)
            return arr.get(i);
        else
            return -1;
    }

    static int findElement(List<Integer> arr)
    {
        int right_sum = 0, left_sum = 0;
        left_sum = 0;

        right_sum=0;
        int i = -1, j = -1;

        for( i = 0, j = arr.size()-1 ; i < j ; i++, j-- ){
            left_sum += arr.get(i);
            right_sum += arr.get(i);

            while(left_sum < right_sum && i < j){
                i++;
                left_sum += arr.get(i);
            }
            while(right_sum < left_sum && i < j){
                j--;
                right_sum += arr.get(i);
            }
        }
        if(left_sum == right_sum && i == j)
            return arr.get(i);
        else
            return -1;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        System.out.println(balancedSum(arr));
        System.out.println(findElement(arr));
    }
}
