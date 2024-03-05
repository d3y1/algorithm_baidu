package middle;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BD10 字符覆盖
 * @author d3y1
 */
public class BD10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 模拟法: 双指针
     * @param in
     */
    private static void solution(Scanner in){
        StringBuilder s = new StringBuilder(in.nextLine());
        String t = in.nextLine();

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        int sLen = s.length();
        int tLen = t.length();
        int i = tLen-1;
        int j = 0;
        while(i>=0 && j<sLen){
            if(tChars[i] > s.charAt(j)){
                s.setCharAt(j,tChars[i]);
                j++;
                i--;
            }else{
                j++;
            }
        }

        System.out.println(s);
    }
}