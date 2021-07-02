package circlearray;
/*
    环形数组实现队列
    思路: 在数组中预留一个位置  使用指针front指向第一个元素   指针real指向最后一个元素的下一个位置
          假设:数组 maxSize = 4   即数组长度为4的一个数组,预留一个位置的思想,该数组最多能存储3个数据
          假设该数组已经存放了两个数据 arr[0] = 1   arr[1] = 1; 此时front = 0; real = 2 最后一个元素的下一个位置;

           判断数组为空思路: front == real
           判断数组满了思路: (real + 1) % maxSize == front;
 */
public class CircleArray {
    private int[] arr;
    //定义环形数组 第一个元素的位置
    private int front;
    //定义环形数组 最后一个元素的后一个位置 即预留的位置
    private  int real;
    //数组的最大size
    private int maxSize;

    public CircleArray(int maxSize) {
        this.arr = new int[maxSize];
        this.maxSize = maxSize;
        front = 0;
        real = 0;
    }

    //向数组中添加元素
    public void add(int n){
        //判断数组是否满了
        if ((real + 1) % maxSize ==front){
            throw new  RuntimeException("数组满了,不能添加");
        }
        arr[real] = n;
        real = (real + 1) % maxSize;
    }
    //从数组中拿出元素,先入先出
    public int get(){
        //判断数组是否为空
        if (front == real){
            throw new  RuntimeException("数组为空");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }
    //遍历数组元素
    public void show(){
        for (int i = front ; i < front + data() ; i++) {
            System.out.printf("arr[%d] = %d\n",i %maxSize,arr[i %maxSize]);
        }
    }
    //获取数组的有效数据的个数
    public int data(){
        return (real + maxSize -front)%maxSize;
    }
}
