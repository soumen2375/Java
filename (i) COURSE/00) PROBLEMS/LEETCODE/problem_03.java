// Single non-repeating element in an array 
public class problem_03 {

    // Using Brute-Force
    public static void bruteforce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Single non-repeating element: " + arr[i]);
                break; // only one such element exists
            }
        }
    }

    // Using XOR
    public static int xor(int[] arr){
        int single_num = arr[0];

        for(int i=1;i<arr.length; i++){
            single_num = single_num ^ arr[i]; // XOR opearations -> 1XOR1 = 0
        }

        return single_num;
    }


    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 2, 7, 4, 1 };

        bruteforce(arr);
        System.out.println("Single non-repeating element: " + xor(arr));

        
    }
}
