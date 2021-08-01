package binarytree;

/**
 * 数组二叉树,又叫顺序二叉树
 * 从数据存储来看，数组存储方式和树的存储方式可以相互转换，即数组可以转换成树，树也可以转换成数组，
 * 顺序存储二叉树的特点: 1) 顺序二叉树通常只考虑完全二叉树
 * 2) 第 n 个元素的左子节点为 2 * n + 1
 * 3) 第 n 个元素的右子节点为 2 * n + 2
 * 4) 第 n 个元素的父节点为 (n-1) / 2
 * 5) n : 表示二叉树中的第几个元素(按 0 开始编号)
 */
public class ArrBinaryTreeDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //创建一个 ArrBinaryTree
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        //0是根节点索引
        arrBinaryTree.preOrder(0); // 1,2,4,5,3,6,7
    }
}

class ArrBinaryTree {
    private int[] arr;//存放数组的二叉树

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    //编写一个方法，完成顺序存储二叉树的前序遍历
    public void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("数组为空");
        }
        System.out.println(arr[index]);
        //通过索引不小于数组长度作为递归的条件
        //左递归
        if (index * 2 + 1 < arr.length) {
            preOrder(index * 2 + 1);
        }

        //右递归
        if (index * 2 + 2 < arr.length) {
            preOrder(index * 2 + 2);
        }
    }
}
