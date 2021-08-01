package binarysorttree;

public class BinarySortTreeDemo {

    public static void main(String[] args) {
        int[] arr = {7, 3, 10, 12, 5, 1, 9, 2};
        BinarySortTree binarySortTree = new BinarySortTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            binarySortTree.add(new Node(arr[i]));
        }

//        binarySortTree.inOrder();
        binarySortTree.delNode(12);
        binarySortTree.delNode(5);
        binarySortTree.delNode(10);
        binarySortTree.delNode(2);
//        binarySortTree.delNode(3);
//        binarySortTree.delNode(9);
//        binarySortTree.delNode(1);
//        binarySortTree.delNode(7);
        binarySortTree.inOrder();
    }

}
