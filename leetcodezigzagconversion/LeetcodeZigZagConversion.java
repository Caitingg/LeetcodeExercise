/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodezigzagconversion;

import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class LeetcodeZigZagConversion {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=  sc.nextLine();
        System.out.println("Enter the number of rows : ");
        int numRows=sc.nextInt();
        
        System.out.println("Output is : "+ convert(s,numRows));
    }
    public static String convert(String s, int numRows){
        int n=s.length();
        StringBuffer[] arr=new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]=new StringBuffer();
        }
        
        int i=0;
        while(i<n){
            //vertically downward
            for(int j=0;j<numRows && i<n;j++){
                arr[j].append(s.charAt(i++));
            }
         
            //bent upward
            for(int j=numRows-2;j>0&&i<n;j--){
                arr[j].append(s.charAt(i++));
                
            }
            
        }
        StringBuffer ans = new StringBuffer();
        for(StringBuffer result:arr){
            ans.append(result);
        }
        return ans.toString();
    }
    
}

    

