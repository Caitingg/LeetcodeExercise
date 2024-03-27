/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodecombinationsum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LeetcodeCombinationSum {

    public static void main(String[] args) {
        Solution sum=new Solution();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=input.nextInt();
        int[]candidates= new int[n];
        System.out.println("Enter the candidates : ");
        
        for(int i=0;i<candidates.length;i++){
            candidates[i]=input.nextInt();
        }
        
        System.out.println("Enter target : ");
        int target=input.nextInt();
        
        List<List<Integer>> result=sum.combinationSum(candidates, target);
        
        for(List<Integer> num: result){
            System.out.print("[ ");
            for(int i=0;i<num.size();i++){
                System.out.print(num.get(i));
                if(i<num.size()-1){
                    System.out.print(" , ");
                }
            }
            System.out.println(" ] ");
        }
    }
    
}
class Solution{
    public List<List<Integer>> combinationSum(int[]candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        boolean []used= new boolean[candidates.length];// All the numbers in the array only can be used once
        findCombinations(candidates, target, 0, currentList, result,used);
        return result;
        
    }
    
    private void findCombinations(int[]candidates, int target,int start, List<Integer> currentList,List<List<Integer>> result,boolean[]used){
        if(target==0){
            result.add(new ArrayList<>(currentList));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(i>0 && candidates[i]== candidates[i-1]&& !used[i-1]){
                continue;
            }
            if(candidates[i]<=target && !used[i]){
                currentList.add(candidates[i]);
                used[i] =true;
                findCombinations(candidates,target-candidates[i],i, currentList, result,used);
                used[i]=false;
                currentList.remove(currentList.size()-1);
            }
            
        }
        
        
    }
}
