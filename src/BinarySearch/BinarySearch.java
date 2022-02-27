package BinarySearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};


        for (int i=0;i<nums.length;i++){
            int target = 13;

            Boolean index = binarySearchBoolean(nums, target);

            if (index){
                System.out.println(target + " exists. ");
            }else{
                System.out.println(target + " does not exist. ");
            }

            System.out.println(search(nums,target));

            System.out.println("--------------------");


        }



    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    static Boolean binarySearchBoolean(int[] nums, Integer target){

        if (nums.length == 0){
            return false;
        }

        int mid = nums.length / 2;

        if (nums[mid] == target){
            return true;
        }

        if (nums[mid] > target){
            return binarySearchBoolean(Arrays.copyOfRange(nums, 0, mid), target);
        }else{
            return binarySearchBoolean(Arrays.copyOfRange(nums, mid + 1, nums.length), target);
        }
    }

}
