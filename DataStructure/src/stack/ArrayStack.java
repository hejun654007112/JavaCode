package stack;
/*
        1) 栈的英文为(stack)
        2) 栈是一个先入后出(FILO-First In Last Out)的有序列表。
        3) 栈(stack)是限制线性表中元素的插入和删除只能在线性表的同一端进行的一种特殊线性表。允许插入和删除的 一端，为变化的一端，称为栈顶(Top)，另一端为固定的一端，称为栈底(Bottom)。
        4) 根据栈的定义可知，最先放入栈中元素在栈底，最后放入的元素在栈顶，而删除元素刚好相反，最后放入的元 素最先删除，最先放入的元素最后删除
        5) 图解方式说明出栈(pop)和入栈(push)的概念
        用数组模拟栈的使用，由于栈是一种有序列表，当然可以使用数组的结构来储存栈的数据内容， 下面我们就用数组模拟栈的出栈，入栈等操作
        思路：定义一个top表示栈顶初始值为-1，
                入栈 添加一个数据 top++ stack[top] = value;
                出栈 删除数据 value = stack[top]；top-- return value
* */
public class ArrayStack {
    private int[] arr;
    private int maxSize;
    private int top;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.top =-1;
        this.arr = new int[maxSize];
    }
    //是否栈满
    public void isFull(){
        if (top >= maxSize - 1){
            System.out.println("栈满");
            return;
        }
    }
    //是否栈空
    public void isEmpert(){
        if (top < 0){
            System.out.println("栈空");
            return ;
        }
    }

    //入栈
    public void pushArray(int num){
        if (top >= maxSize - 1){
            throw new RuntimeException("栈满");
        }
        top++;
        arr[top] = num;
    }

    //出栈
    public int popArray(){
        if (top < 0){
          throw new RuntimeException("栈空");
        }
        return arr[top--];
    }

}
