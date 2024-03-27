/*fddf fr df fdxc*f/f/d//d/df9
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/System**********----------------------------------------------------------------------------------------------------------------------------------------------- FileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodesudokusolver;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class LeetcodeSudokuSolver {

    public static void main(String[] args) {
        Sudoku sudoku= new Sudoku();
        Scanner sc= new Scanner(System.in);
        char[][]board= new char[9][9];
        System.out.println("Enter the Sudoku board (use '.' for empty cells):");
        for(int i=0;i<9;i++){
            String input= sc.nextLine();
           for(int j=0;j<9;j++){
               board[i][j]=input.charAt(j);
           }
       }
        sudoku.solve(board);
    }
    
}
class Sudoku{
    public void solve (char[][]board){
       solve(board,0,0);
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[i].length;j++){
               System.out.print(board[i][j]+ " ");
           }
           System.out.println();
       }
    }
    
    private boolean solve(char[][]board,int row,int col){
        if(row==board.length){
            return true;
        }
        
        if(col==board[0].length){
            return solve(board,row+1,0);
        }
        
        if(board[row][col]!= '.'){
            return solve(board,row,col+1);
        }
        
        for(char num='1';num<='9';num++){
            if(isValidPlacement(board,row,col,num)){
                board[row][col]=num;
            
            if(solve(board,row,col+1)){
                return true;
            }
            
            board[row][col]='.';
            }
        }
        return false;
    }
    private boolean isValidPlacement(char [][]board, int row, int col,char num){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
            
            if(board[row][i]==num){
                return false;
            }
            
            int subgridRow=3 * (row/3)+ i/3;
            int subgridCol=3 * (col /3)+ i/3;
            
            if(board[subgridRow][subgridCol]==num){
                return false;
            }
        }
        return true;
    }
}
