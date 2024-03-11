package simple;

import java.util.Scanner;

/**
 * BD13 正三角形的顶点位置
 * @author d3y1
 */
public class BD13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 数学法: 向量
     * 正三角形 -> 等边三角形(角60度)
     * @param in
     */
    private static void solution(Scanner in){
        int T = in.nextInt();

        double radians;
        double dx,dy;
        double x1,y1,x2,y2,x3,y3,x4,y4;
        for(int i=1; i<=T; i++){
            x1 = in.nextDouble();
            y1 = in.nextDouble();
            x2 = in.nextDouble();
            y2 = in.nextDouble();

            dx = x2 - x1;
            dy = y2 - y1;

            // 第一组解
            radians = Math.toRadians(60.0);
            x3 = x1 + Math.cos(radians) * dx + Math.sin(radians) * dy;
            y3 = y1 - Math.sin(radians) * dx + Math.cos(radians) * dy;

            // 第二组解
            radians = Math.toRadians(-60.0);
            x4 = x1 + Math.cos(radians) * dx + Math.sin(radians) * dy;
            y4 = y1 - Math.sin(radians) * dx + Math.cos(radians) * dy;

            if(x3<x4 || (x3==x4&&y3<y4)){
                System.out.println(String.format("%.2f",x3)+" "+String.format("%.2f",y3)+" "+String.format("%.2f",x4)+" "+String.format("%.2f",y4));
            }else{
                System.out.println(String.format("%.2f",x4)+" "+String.format("%.2f",y4)+" "+String.format("%.2f",x3)+" "+String.format("%.2f",y3));
            }
        }
    }
}