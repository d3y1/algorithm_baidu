package hard;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BD16 浇花
 * @author d3y1
 */
public class BD16{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 排序: 贪心
     * @param in
     */
    private static void solution(Scanner in){
        int n = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        long[][] dist = new long[n][2];

        long x,y;
        for(int i=0; i<n; i++){
            x = in.nextInt();
            y = in.nextInt();
            dist[i][0] = (x1-x)*(x1-x) + (y1-y)*(y1-y);
            dist[i][1] = (x2-x)*(x2-x) + (y2-y)*(y2-y);
        }

        // 到喷泉(x1,y1)距离降序
//            Arrays.sort(dist, (o1, o2) -> o2[0]>o1[0]?1:-1);
        Arrays.sort(dist, (o1, o2) -> Long.compare(o2[0], o1[0]));

        long squareR1 = 0;
        long squareR2 = 0;
        long result = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            squareR1 = dist[i][0];
            result = Math.min(result, squareR1+squareR2);
            squareR2 = Math.max(squareR2, dist[i][1]);
        }
        // 全部花由 喷泉(x2,y2)浇水
        result = Math.min(result, 0+squareR2);

        System.out.println(result);
    }
}