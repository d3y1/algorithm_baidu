package hard;

import java.util.Scanner;

/**
 * BD18 猜数
 * @author d3y1
 */
public class BD18{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution(in);
        }
    }

    /**
     * 数学法
     * 举例子找规律
     * @param in
     */
    private static void solution(Scanner in){
        long x = in.nextLong();
        long y = in.nextLong();

        long half = y/2;
        long result = 0;
        if(x > half){
            if(x < y){
                result = x-half;
            }else{
                // 再减1 多了0+y这个组合
                result = y-half-1;
            }
        }

        System.out.println(result);
    }
}