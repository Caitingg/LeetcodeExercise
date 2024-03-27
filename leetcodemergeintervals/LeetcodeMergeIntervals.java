/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodemergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Huawei
 */
public class LeetcodeMergeIntervals {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        //int [][]array={{1,3},{2,6},{8,10},{15,18}};
        int [][]array={{1,4},{4,5}};
        int[][]merge=merge(array);
        System.out.print("[");
         for(int i=0;i<merge.length;i++){
                System.out.print(Arrays.toString(merge[i]));
                if(i<merge.length-1){
                    System.out.print(",");
                }
                
            }
         System.out.print("]\n");
         
    }*/
    public static void main(String[] args) {
        //int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] array = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] merge = insertInterval(array, newInterval);

        System.out.print("[");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(Arrays.toString(merge[i]));
            if (i < merge.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
    
   /* public static int[][]merge(int [][]array){
        if(array==null||array.length==0){
            return array;
        }
        
        Arrays.sort(array, (a,b)->Integer.compare(a[0], b[0]));
        
        List<int[]>list= new ArrayList<>();
        int []currentInterval=array[0];
        
        for(int i=0;i<array.length;i++){
            if(currentInterval[1]>=array[i][0]){
                currentInterval[1]=Math.max(currentInterval[1], array[i][1]);
            }else{
                list.add(currentInterval);
                currentInterval=array[i];
            }
        }
        list.add(currentInterval);
        return list.toArray(new int[list.size()][]);
    }*/
    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }

        List<int[]> list = new ArrayList<>();
        int i = 0;

        // Add intervals before the new interval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }
        System.out.println(i);
        
        // Merge overlapping intervals with the new interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        list.add(newInterval);

        // Add intervals after the new interval
        while (i < intervals.length) {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);

    }
}

