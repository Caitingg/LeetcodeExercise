/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode48rotateimage;

import java.util.Scanner;

public class Leetcode48RotateImage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix : ");
        int N=sc.nextInt();
        int[][]matrix=new int[N][N];
        System.out.println("Enter the matrix : ");
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        rotate(matrix);
    }
    
    /*public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the Matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse Each Row
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;

        while (start < end) {
            // Swap row[start] with row[end]
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;

            start++;
            end--;
        }
    }
    */
    public static void rotate(int[][]matrix) {
        //rotate 90 degree clockwise
        /*int[][] newArr = new int[matrix.length][matrix.length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1;j>=0;j--){
                newArr[i][count]= matrix[j][i];
                
                if(count<matrix.length-1){
                    count++;
                }
            }
            count=0;
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = newArr[i][j];
            }
        }
        */
        
         // rotate 90 degree anticlockwise
         int n= matrix.length;
         
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp= matrix[i][j];
                 matrix[i][j]= matrix[j][i];
                 matrix[j][i]=temp;
            }
        }
     
     for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp= matrix[i][j];
                 matrix[i][j]= matrix[i][n-1-j];
                 matrix[i][n-1-j]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
   
    
    
