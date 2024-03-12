package hard;

import java.util.Scanner;

/**
 * BD1 罪犯转移
 * @author d3y1
 */
public class BD1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 动态规划
     *
     * dp[i]表示前i个罪犯的罪行值之和
     *
     * 关系式:
     * dp[i+c]-dp[i] <= t
     *
     * @param in
     */
    private static void solution(Scanner in){
        int n = in.nextInt();
        int t = in.nextInt();
        int c = in.nextInt();

        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            dp[i] = dp[i-1] + in.nextInt();
        }

        int result = 0;
        for(int i=0; i+c<=n; i++){
            if(dp[i+c]-dp[i] <= t){
                result++;
            }
        }

        System.out.println(result);
    }
}