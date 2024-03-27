/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcodegroupanagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class LeetcodeGroupAnagram {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[]str = {"eat","tea","tan","ate","nat","bat"};
        //String[]str ={"a"};
        List<List<String>> answer=solution.groupAnagrams(str);
        
        System.out.print("[");
        for(int i=0;i<answer.size();i++){
            System.out.print(answer.get(i));
            
            if(i<answer.size()-1){
                System.out.print(",");
            }else{
                System.out.print("]");
            }
  
        }
        System.out.println();
    }
    
}
class Solution{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map= new HashMap<>();
        
        for(String str: strs){
            char[]ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedWords= new String(ch);
            
            if(!map.containsKey(sortedWords)){
                map.put(sortedWords,new ArrayList<>());
            }
            
            map.get(sortedWords).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
