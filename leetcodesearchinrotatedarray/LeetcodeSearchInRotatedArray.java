/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodesearchinrotatedarray;

/**
 *
 * @author Huawei
 */
public class LeetcodeSearchInRotatedArray {

    public static void main(String[] args) {
       SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(solution.search(nums, target));  // Output: 4

        target = 3;
        System.out.println(solution.search(nums, target));  // Output: -1
     
    }
    
    
}
class SearchInRotatedSortedArray{
    public int search(int []num, int target) {
        int left =0;
        int right=num.length-1;
        
        while(left<=right){
            int mid= (left + right) /2;
            
            if(num[mid]==target){
                return num[mid];
            }
            
            if(num[left]<=num[mid]){
                    if(num[left]<=target && num[mid]>target){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }else{
                    if(num[right]>=target && num[mid]<target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
            }
            return -1;
    }

}
