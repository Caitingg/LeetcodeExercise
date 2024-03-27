/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodejumpgameii;

import java.util.Arrays;

/**
 *
 * @author Huawei
 */
public class LeetcodeJumpGameII {

    public static void main(String[] args) {
        int []nums={2,3,1,1,4};
        int possibleJUMP=jump(nums);
        System.out.println(possibleJUMP);
    }
    
    /*public static int finder(int[]num,int index,int[]dp){
        if(index==num.length-1){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        
        int npick=Integer.MAX_VALUE;
        for(int i=1;i<=num[index];i++){
            int pick=Integer.MAX_VALUE;
            if(i+index<num.length){
                pick=finder(num,i+index,dp);
                if(pick!=Integer.MAX_VALUE){
                    npick=Math.min(pick+1, npick);
                }
            }
        }
        return dp[index]=npick;
    }
    public static int jump(int []nums){
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);
        return finder(nums,0,dp);
    }
    */
    public static int jump(int[] nums) {
    int n = nums.length;
    int currentPos = 0;//current Position
    int maxReach = 0;
    int jumps = 0;

   for(int i=0;i<n-1;i++){
       maxReach=Math.max(maxReach, i+nums[i]);
   
   if(maxReach>n-1){
       jumps++;
       break;
   }
   if(i==currentPos){//make jumps here when i = to the position where the last jump was
       currentPos=maxReach;
       jumps++;
   }
}
   return jumps;
    }
}
