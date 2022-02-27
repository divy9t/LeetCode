package BinarySearch;

public class Sqrt {


    public static void main(String[] args) {
        System.out.println(linearMethod(36000000));
        System.out.println("---------");
        System.out.println(binarySearchMethod(36000000));
    }

    public static int linearMethod(int x) {
        long start = System.nanoTime();
        long end = System.nanoTime();

        int range = x / 2;


        for (int i = 2; i < range - 1; i++) {


            if ((i+1) * (i+1) > x) {
                end = System.nanoTime();
                System.out.println("Linear System execution time " + (end - start));
                return i;
            }
        }

        System.out.println("Linear System execution time " + (end - start));

        return 0;

    }

    public static long binarySearchMethod(int x) {
        long start = System.nanoTime();
        long end;

        long left = 0, right = x;
        long ans = 0;
        while (left < right) {
            long mid = (left + (right - left) / 2);
            long square = mid * mid;

            if (square == x) {
                end = System.nanoTime();
                System.out.println("Binary Search System execution time " + (end - start));
                return mid;
            }

            if (square > x) right = mid - 1;
            if (square < x) {
                ans = mid;
                left = mid + 1;
            }


        }

        end = System.nanoTime();
        System.out.println("Binary Search System execution time " + (end - start));
        return ans;

    }

}