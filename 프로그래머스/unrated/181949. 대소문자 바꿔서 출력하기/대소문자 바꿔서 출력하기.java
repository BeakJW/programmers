import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution A  = new Solution();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(A.change(a));
    }
    
    public String change(String a){
        String answer = "";
        for(char x : a.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
            
        }
        
        return answer;
    }
}