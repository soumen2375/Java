// Maximum Subarray
public class problem_04 {

    public static int Brute_force(int[] arr) {
        int sum = 0;
        int final_value = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

            }

            if (final_value < sum) {
                final_value = sum;
            }
            sum = 0;
        }

        return final_value;
    }

    //  Kadane's Algorithm
    public static int Kadane_algo(int[] arr){
        int curr_max = arr[0];
        int final_max = arr[0];

        for(int i = 1; i<arr.length; i++){
            curr_max = Math.max(arr[i], arr[i] + curr_max);
            final_max = Math.max(curr_max, final_max);
        }

        return final_max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4 };
        System.out.println( Kadane_algo(arr));

    }
}
