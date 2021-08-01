package binarytree;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");

        binaryTree.setRoot(root);

        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node5);
        node3.setRight(node4);

        binaryTree.remove(5);
        binaryTree.preOder();
    }

    public static void test01() {
        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");

        binaryTree.setRoot(root);

        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node5);
        node3.setRight(node4);

        //遍历
        root.preOrder();
        System.out.println("============================");
        root.inOrder();
        System.out.println("============================");
        root.postOrder();

        //查找
        System.out.println("============================");
        HeroNode heroNode = binaryTree.preSearch(15);
        if (heroNode != null) {
            System.out.println(heroNode);
        } else {
            System.out.println("没有找到");
        }

        System.out.println("============================");
        HeroNode heroNode2 = binaryTree.inSearch(15);
        if (heroNode2 != null) {
            System.out.println(heroNode2);
        } else {
            System.out.println("没有找到");
        }

        System.out.println("============================");
        HeroNode heroNode3 = binaryTree.postSearch(15);
        if (heroNode3 != null) {
            System.out.println(heroNode3);
        } else {
            System.out.println("没有找到");
        }
    }
}

class BinaryTree {
    //根节点
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    //删除
    public void remove(int no) {
        if (root != null) {
            root.remove(no);
        } else {
            System.out.println("树为空");
        }
    }

    //前序遍历
    public void preOder() {
        if (root != null) {
            root.preOrder();
        } else {
            System.out.println("树为空");
        }
    }

    //前序遍历
    public void inOder() {
        if (root != null) {
            root.inOrder();
        } else {
            System.out.println("树为空");
        }
    }

    //前序遍历
    public void postOder() {
        if (root != null) {
            root.postOrder();
        } else {
            System.out.println("树为空");
        }
    }

    //前序查找
    public HeroNode preSearch(int no) {
        if (root != null) {
            return root.preSearch(no);
        } else {

            return null;
        }
    }

    //中序查找
    public HeroNode inSearch(int no) {
        if (root != null) {
            return root.inSearch(no);
        } else {

            return null;
        }
    }

    //前序查找
    public HeroNode postSearch(int no) {
        if (root != null) {
            return root.postSearch(no);
        } else {

            return null;
        }
    }
}

class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //删除规则
    //1.如果删除的节点是叶子节点，则删除该节点
    // 2.如果删除的节点是非叶子节点，则删除该子树
    public void remove(int no) {
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }
        if (this.left != null) {
            this.left.remove(no);
        }

        if (this.right != null) {
            this.right.remove(no);
        }

    }

    //前序遍历
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }

        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //中序遍历
    public void inOrder() {

        if (this.left != null) {
            this.left.inOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.inOrder();
        }
    }

    //后序遍历
    public void postOrder() {

        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    //前序查找
    public HeroNode preSearch(int no) {
        HeroNode res = null;

        if (this.no == no) {
            return this;
        }

        if (this.left != null) {
            res = this.left.preSearch(no);
        }
        if (res != null) {
            return res;
        }

        if (this.right != null) {
            res = this.right.preSearch(no);
        }

        return res;
    }

    //中序查找
    public HeroNode inSearch(int no) {
        HeroNode res = null;

        if (this.left != null) {
            res = this.left.inSearch(no);
        }
        if (res != null) {
            return res;
        }
        if (this.no == no) {
            return this;
        }
        if (this.right != null) {
            res = this.right.inSearch(no);
        }

        return res;
    }

    //后序查找
    public HeroNode postSearch(int no) {
        HeroNode res = null;

        if (this.left != null) {
            res = this.left.postSearch(no);
        }
        if (res != null) {
            return res;
        }
        if (this.right != null) {
            res = this.right.postSearch(no);
        }
        if (res != null) {
            return res;
        } else if (this.no == no) {
            return this;
        } else {
            return null;
        }


    }
}