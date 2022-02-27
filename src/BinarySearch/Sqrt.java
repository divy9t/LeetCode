package BinarySearch;

public class Sqrt {


    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(linearMethod(x));
        System.out.println("---------");
        System.out.println(binarySearchMethod(x));
    }

    public static int linearMethod(int x) {
        long start = System.nanoTime();
        long end = System.nanoTime();



        for (int i = 2; i < x; i++) {


            if ((i+1) * (i+1) > x) {
                end = System.nanoTime();
                System.out.println("Linear System execution time " + (end - start));
                return i;
            }
        }

        System.out.println("Linear System execution time " + (end - start));

        return 0;

    }

    public static int binarySearchMethod(int x) {
        long start = System.nanoTime();
        long end;

        long left = 0, right = x;
        long ans = 0;
        while (left <= right) {
            long mid = (left + (right - left) / 2);
            long square = mid * mid;

            if (square == x) {
                end = System.nanoTime();
                System.out.println("Binary Search System execution time " + (end - start));
                return (int)mid;
            }

            if (square > x) right = mid - 1;
            if (square < x) {
                ans = mid;
                left = mid + 1;
            }


        }

        end = System.nanoTime();
        System.out.println("Binary Search System execution time " + (end - start));
        return (int) ans;

    }

}