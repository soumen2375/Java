// Find a maximum number in array 
public class Problem_02 {
    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6};
        System.out.println(maxArray(number));
    }
    
    public static int maxArray(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
