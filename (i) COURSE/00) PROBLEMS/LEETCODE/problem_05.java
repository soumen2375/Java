// Merge Intervals
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem_05 {
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        List <int[]> list = new ArrayList<>();
 
        for(int i=1;i<intervals.length;i++){
            int s = intervals[i][0];
            int e = intervals[i][1];

            if(s <= end){
                end = Math.max(end, e);
            } else{
                list.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[list.size()][]);     
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } }; // Output: [[1,7],[8,10],[15,18]] 
        merge(intervals);
    }
}
