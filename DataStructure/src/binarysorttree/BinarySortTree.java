package binarysorttree;

public class BinarySortTree {
    private Node root;

    public void add(Node node){
        if (root == null){
            root = node;
        }else {
            root.add(node);
        }
    }

    //中序遍历
    public void inOrder(){
        if (root == null){
            System.out.println("树为空~~~");
        }else {
            root.inOrder();
        }
    }

    //删除该节点下的最小子节点
    public Node delMinNode(Node node){
        Node min = node;
        if (min.left !=null){
            min = min.left;
        }
        delNode(min.value);
        return min;
    }

    //删除节点
    public void delNode(int value){
        if (root == null){
            return;
        }else {
            //获取删除结点
            Node targetNode = root.getTargetNode(value);
            //判断是否存在删除结点
            if (targetNode == null){
                return;
            }
            //判断删除结点是否为根结点
            if (root.left == null && root.right==null){
                root =null;
                return;
            }
            //获取删除结点的父结点
            Node parent = root.getParent(value);
            //1.删除叶子节点
            if (targetNode.left == null && targetNode.right == null){
                if (parent.left !=null &&parent.left.value == value){
                    parent.left = null;
                }else if (parent.right !=null && parent.right.value == value){
                    parent.right = null;
                }
            }else if (targetNode.left !=null && targetNode.right !=null){ //删除有两个节点的数
                Node minNode = delMinNode(targetNode.right);
                targetNode.value = minNode.value;
            }else {
                //删除只有一个子节点的树
                if (targetNode.left != null){
                    if (parent != null){
                        if (parent.left.value == value){
                            parent.left = targetNode.left;
                        }else {
                            parent.right = targetNode.left;
                        }
                    }else {
                        root = targetNode.left;
                    }
                }

                if (targetNode.right != null){
                    if (parent != null){
                        if (parent.right.value == value){
                            parent.right = targetNode.right;
                        }else {
                            parent.right = targetNode.right;
                        }
                    }else {
                        root = targetNode.right;
                    }
                }
            }
        }
    }

}

/**
 * 结点类
 */
class Node {
    //结点的值
    int value;
    //左子结点
    Node left;
    //右子节点
    Node right;

    public Node(int value) {
        this.value = value;
    }

    //获取要删除的节点
    public Node getTargetNode(int value){
        //判断删除结点是否为当前结点
        if (this.value == value){
            return this;
        }
        //如何value的值小于当前结点的值,向左递归查找,否则,向右递归
        if (value < this.value){
            //如果当前结点的左子结点为空,说明左子树查找完毕,没有找到
            if (this.left == null){
                return null;
            }
            //向左递归查找
            return this.left.getTargetNode(value);
        }else {
            //右子树查找完毕,没有找到
            if (this.right == null){
                return null;
            }
            //右递归查找
            return this.right.getTargetNode(value);
        }
    }
    //获取待删除节点的父节点
    public Node getParent(int value){
        //判断当前结点是否为删除结点的父结点,否则递归查找,没找打返回null
        if ((this.left != null && this.left.value == value )||
                (this.right!=null&&this.right.value == value)){
            return this;
        }else {
            if (this.value > value && this.left != null){
                return this.left.getParent(value);
            }else if (this.value <= value && this.right!=null){
                return this.right.getParent(value);
            }else {
                return null;
            }
        }
    }

    //添加节点
    public void add(Node node) {
        //添加规则:比父结点小的结点挂在左子树,大的节点挂在右子树
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    //中序遍历,即从小到大输出
    public void inOrder() {
        if (this.left != null) {
            this.left.inOrder();
        }

        System.out.println(this);

        if (this.right != null) {
            this.right.inOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
