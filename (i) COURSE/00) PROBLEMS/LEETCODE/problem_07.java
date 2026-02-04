// Min & Max Element in Array using Min number of Comparisons
public class problem_07 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
