package binarytree;

/**
 * 1) n 个结点的二叉链表中含有 n+1 【公式 2n-(n-1)=n+1】 个空指针域。
 * 利用二叉链表中的空指针域，存放指向 该结点在某种遍历次序下的前驱和后继结点的指针（这种附加的指针称为"线索"）
 * 2) 这种加上了线索的二叉链表称为线索链表，相应的二叉树称为线索二叉树(Threaded BinaryTree)。
 * 根据线索性质 的不同，线索二叉树可分为前序线索二叉树、中序线索二叉树和后序线索二叉树三种
 * 3) 一个结点的前一个结点，称为前驱结点
 * 4) 一个结点的后一个结点，称为后继结点
 */
public class ThreadedBinaryTreeDemo {
    public static void main(String[] args) {
        HeroNode1 root = new HeroNode1(1, "tom");
        HeroNode1 node2 = new HeroNode1(3, "jack");
        HeroNode1 node3 = new HeroNode1(6, "smith");
        HeroNode1 node4 = new HeroNode1(8, "mary");
        HeroNode1 node5 = new HeroNode1(10, "king");
        HeroNode1 node6 = new HeroNode1(14, "dim");

        root.left = (node2);
        root.right = (node3);
        node2.left = (node4);
        node2.right = (node5);
        node3.left = (node6);

        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();
        threadedBinaryTree.threadedNodes(root);

        HeroNode1 leftNode = node5.left;
        HeroNode1 rightNode = node5.right;
        System.out.println("10 号结点的前驱结点是 =" + leftNode); //3
        System.out.println("10 号结点的后继结点是=" + rightNode); //1

        threadedBinaryTree.threadedList(root); // 8, 3, 10, 1, 14, 6
    }
}

//前序二叉树的创建
class ThreadedBinaryTree {
    //记录前驱节点
    HeroNode1 pre;

    //中序遍历,线索化二叉树
    public void threadedNodes(HeroNode1 node) {
        if (node == null) {
            return;
        }

        //线索化左子结点
        threadedNodes(node.left);

        //线索化当前节点
        if (node.left == null) {
            node.left = pre;
            node.leftType = 1;
        }

        if (pre != null && pre.right==null) {
            pre.right = node;
            pre.rightType = 1;
        }

        pre = node;


        //线索化右子节点
        threadedNodes(node.right);
    }

    //遍历线索化二叉树的方法 ,不需要递归,直接循环遍历即可
    public void threadedList(HeroNode1 root) {
        HeroNode1 node = root;
        while (node != null) {
            while (node.leftType == 0) {
                node = node.left;
            }

            //直到找到线索化节点
            System.out.println(node);

            while (node.rightType == 1) {
                node = node.right;
                System.out.println(node);

            }
            node = node.right;
        }
    }
}

//节点类
class HeroNode1 {
    int no;
    //英雄的姓名
    String name;
    //左子结点
    HeroNode1 left;
    //右子节点
    HeroNode1 right;
    //1. 如果 leftType == 0 表示指向的是左子树, 如果 1 则表示指向前驱结点
    // 2. 如果 rightType == 0 表示指向是右子树, 如果 1 表示指向后继结点
    int leftType;
    int rightType;

    public HeroNode1(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void preOrder(HeroNode1 node1) {
        System.out.println(node1);
        if (node1.left != null) {
            preOrder(node1.left);
        }
        if (node1.right != null) {
            preOrder(node1.right);
        }
    }

    @Override
    public String toString() {
        return "HeroNode1{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
