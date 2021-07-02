package Recursion;

/*
    八皇后问题，是一个古老而著名的问题，是回溯算法的典型案例。该问题是国际西洋棋棋手马克斯·贝瑟尔于 1848 年提出：
    在 8×8 格的国际象棋上摆放八个皇后，使其不能互相攻击，即：任意两个皇后都不能处于同一行、 同一列或同一斜线上，问有多少种摆法(92)。
*/
public class Queen8 {
    int max = 8;//定义有多少个皇后
    int[] array = new int[max];//定义数组表示皇后的位置
    //统计次数
    static int  count = 0;

    //摆放皇后
    public void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n+1 );
            }
        }

    }

    //判断第n个位置能否相互攻击，一个需要判断n-1次
    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    //打印皇后位置
    public void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        queen8.check(0);
        System.out.printf("共有%d种解法~",count);
    }
}
