import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
                
        char[] arrA = a.toCharArray();
        for (int i = 0; i < arrA.length; i++) {
            if (Character.isLowerCase(arrA[i])) {
                arrA[i] = Character.toUpperCase(arrA[i]);
            } else {
                arrA[i] = Character.toLowerCase(arrA[i]);
            }
        }
        
        System.out.println(arrA);
    }
}