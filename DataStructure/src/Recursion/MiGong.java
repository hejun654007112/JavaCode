package Recursion;
//使用递归实现走迷宫
public class MiGong {

    //加载地图
    public static int[][] setMap(){
        //使用二维数组定义迷宫地图
        int[][] map = new int[10][10];
        //用数字1表示墙
        for (int i = 0; i < map.length; i++) {
            map[0][i] = 1;
            map[9][i] = 1;
            map[i][0] = 1;
            map[i][9] = 1;
        }
        //设定随机8堵墙
        for (int i = 0; i < 8; i++) {
            int random1 = (int)(Math.random()*8 + 1);
            int random2 = (int)(Math.random()*8 + 1);
            map[random1][random2] = 1;
        }
        return map;
    }
    //查看地图，遍历二维数组
    public static void seeMap(int[][] arr){
        for (int[] item:arr){
            System.out.println();
            for (int num:item){
                System.out.print(num + "\t");
            }
        }
    }
    //走迷宫,数字0表示还没走过 数字1表示墙 数字2表示走的路，数字3表示此路不通
    public static boolean goOut(int[][] arr,int num1,int num2,int[] end){
        if (num1 == end[0]&&num2==end[1]){
            return true;
        }else {
            if (arr[num1][num2] == 0){
                arr[num1][num2] = 2;
                if (goOut(arr,num1 + 1,num2,end)){
                        return true;
                }
                else if (goOut(arr,num1  ,num2+1,end)){
                    return true;
                }
                else if (goOut(arr,num1 - 1,num2,end)){
                    return true;
                }
                else if (goOut(arr,num1 ,num2-1,end)){
                    return true;
                }else {
                    arr[num1][num2] = 3;
                    return false;
                }

            }else {
                return false;
            }

        }

    }



    public static void main(String[] args) {
        int[] end = {9,8};
        int[][] map = setMap();
        goOut(map,1,1,end);
        seeMap(map);
    }
}
