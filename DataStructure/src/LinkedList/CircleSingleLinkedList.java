package LinkedList;

public class CircleSingleLinkedList {
    //first指针，指向第一个数据
    SingleHeroNode first;
    //最后
    SingleHeroNode last;
    int size;
    public CircleSingleLinkedList() {
        this.first = new SingleHeroNode(0,"","");
        this.last = first;
        this.size = 0;
    }

    //构建环形链表，添加数据
    public void addEle(SingleHeroNode singleHeroNode){
        size++;
        if (first.getNo() == 0){
            singleHeroNode.setNext(singleHeroNode);
            first = singleHeroNode;
            last = singleHeroNode;
            return;
        }
        last.setNext(singleHeroNode);
        singleHeroNode.setNext(first);
        last = singleHeroNode;


    }
    //遍历环形链表
    public void show(){
        SingleHeroNode temp = first;
        while (true){
            System.out.println(temp);
            if (temp.getNext() == first){
                break;
            }
            temp = temp.getNext();
        }
    }
    //约定编号为 k（1<=k<=n）的人从 1 开始报数，数到 m 的那个人出列，它的下一位又从 1 开始报数，数到 m 的那个人又出列
    public void leave(int k,int m){
        //first last  移动k-1 个位置 移动到开始报数的位置
        for (int i = 0; i < k - 1; i++) {
            first = first.getNext();
            last = last.getNext();
        }


        while (true){
            if (size == 0){
                break;
            }
            //开始报数从自身开始m个数
            for (int i = 0; i < m - 1; i++) {
                first = first.getNext();
                last = last.getNext();
            }
            System.out.println(first);
            first = first.getNext();
            last.setNext(first);
            size--;
        }


    }
}
