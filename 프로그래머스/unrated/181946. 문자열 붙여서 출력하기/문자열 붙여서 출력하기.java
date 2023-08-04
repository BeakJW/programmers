import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String A = a.replaceAll(" ", "");
        String B = b.replaceAll(" ", "");
        
        System.out.printf(A);
        System.out.printf(B);
    }
}