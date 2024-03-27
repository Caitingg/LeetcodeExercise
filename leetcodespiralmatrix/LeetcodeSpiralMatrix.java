/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodespiralmatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class LeetcodeSpiralMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Solution m= new Solution();
        List<Integer> result= new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=input.nextInt();
        int[][]matrix= new int[n-1][n];
        System.out.println("Enter matrix : ");
        
         for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
         
        result=m.spiralMatrix(matrix);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+ " ");
        }
        System.out.println();
    }
    
}
class Solution{
    public List<Integer> spiralMatrix(int[][]matrix){
        List<Integer> list=new ArrayList<>();
        
        if(matrix==null || matrix.length==0){
            return list;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return list;
    }
}*/
        
  int number = 5;

        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
