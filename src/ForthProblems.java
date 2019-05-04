public class ForthProblems {

    public static void main(String[] args) {

        //array
        int [] arr = {1,5,7,15,24,12,14,13,4,2,23};

        // a) calculate the sum of even numbers
        System.out.println("The sum of even numbers is " + evenSum(arr));

        // b) calculate the sum of odd numbers
        System.out.println("The sum of odd number is " + oddSum(arr));

        // c) find the min and max number of the array
        System.out.println("The min number of the array is " + findMin(arr));
        System.out.println("The max number of the array is " + findMax(arr));

        // d) find the min and max number of even and odds numbers
        if (hasEven(arr)){
            System.out.println("The min even number is " + findMinEven(arr));
            System.out.println("The max even number is " + findMaxEven(arr));
        } else
            System.out.println("There is no even number");

        if (hasOdd(arr)){
            System.out.println("The min odd number is " + findMinOdd(arr));
            System.out.println("The max odd number is " + findMaxOdd(arr));
        } else
            System.out.println("There is no odd number");

    }

    public static int evenSum(int [] arr){
        int sum = 0;

        for (int i = 0; i < arr.length;i++){
            if (arr[i] % 2 == 0)
                sum = sum + arr[i];
        }
        return sum;
    }

    public static int oddSum(int [] arr){
        int sum = 0;

        for (int i = 0;i < arr.length;i++){
            if (arr[i] % 2 == 1)
                sum = sum + arr[i];
        }
        return sum;

    }

    public static int findMin(int [] arr){
         int min = arr[0];
         for (int i = 0;i < arr.length;i++){
             if (arr[i] < min)
                 min = arr[i];
         }

        return min;
    }

    public static int findMax(int [] arr){
        int max = arr[0];
        for (int i = 0;i < arr.length;i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static boolean hasEven(int [] arr){
        for (int i = 0;i < arr.length;i++){
            if (arr[i] % 2 == 1 )
                return true;
        }
        return false;
    }

    public static boolean hasOdd(int [] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1)
                return true;
        }
        return false;
    }

    public static int findMinEven(int [] arr){
        boolean flag = false;
        int min = 0;
        for (int i = 0;i < arr.length;i++){
            if (flag == false){
                if (arr[i] % 2 == 0){
                    min = arr[i];
                    flag = true;
                }
            } else if (arr[i] % 2 == 0 && arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int findMaxEven(int [] arr){
        boolean flag = false;
        int min = 0;
        for (int i = 0;i < arr.length;i++){
            if (flag == false){
                if (arr[i] % 2 == 0){
                    min = arr[i];
                    flag = true;
                }
            } else if (arr[i] % 2 == 0 && arr[i] > min)
                min = arr[i];
        }
        return min;
    }
    public static int findMinOdd(int [] arr){
        boolean flag = false;
        int min = 0;
        for (int i = 0;i < arr.length;i++){
            if (flag == false) {
                if (arr[i] % 2 == 1) {
                    min = arr[i];
                    flag = true;
                }
            }else if (arr[i] % 2 == 1 && arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int findMaxOdd(int [] arr) {
        boolean flag = false;
        int min = 0;
        for (int i = 0;i < arr.length;i++){
            if (flag == false){
                if (arr[i] % 2 == 1){
                    min = arr[i];
                    flag = true;
                }
            } else if (arr[i] % 2 == 1 && arr[i] > min)
                min = arr[i];
        }
        return min;
    }
}