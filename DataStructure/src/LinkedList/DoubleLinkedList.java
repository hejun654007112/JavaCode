package LinkedList;

/*
    双向单链表：在单向单链表的基础上增加增加一个前指针pre，指向节点的前一个节点
    分析 双向链表的遍历，添加，修改，删除的操作思路===》
    代码实现 1) 遍历 方和 单链表一样，只是可以向前，也可以向后查找
    2) 添加 (默认添加到双向链表的最后) (1) 先找到双向链表的最后这个节点 (2) temp.next = newHeroNode (3) newHeroNode.pre = temp;
    3) 修改 思路和 原来的单向链表一样.
    4) 删除 (1) 因为是双向链表，因此，我们可以实现自我删除某个节点 (2) 直接找到要删除的这个节点，
    比如 temp (3) temp.pre.next = temp.next (4) temp.next.pre = temp.pre;
 */
public class DoubleLinkedList {
    //头结点
    private DoubleHeroNode doubleHead;

    public DoubleLinkedList() {
        this.doubleHead = new DoubleHeroNode(0, "", "");
    }

    //遍历双向链表
    public void showDoubleList() {

        if (doubleHead.getNext() == null) {
            System.out.println("链表为空~~~");
            return;
        }
        DoubleHeroNode temp = doubleHead.getNext();
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
    //添加 (默认添加到双向链表的最后)
    public void addByEnd(DoubleHeroNode doubleHeroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        DoubleHeroNode temp = doubleHead;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        temp.setNext(doubleHeroNode);
        doubleHeroNode.setPre(temp);
    }
    //修改节点信息
    public void update(DoubleHeroNode doubleHeroNode){
        //遍历找到要修改数据的节点
        DoubleHeroNode temp = doubleHead.getNext();
        while (true){
            if (temp.getNo() == doubleHeroNode.getNo()){
                break;
            }
            temp = temp.getNext();
        }
        temp.setName(doubleHeroNode.getName());
        temp.setNickName(doubleHeroNode.getNickName());
    }

    //删除节点，自我删除
    public void del(int num){
        //遍历找到要删除数据的节点
        DoubleHeroNode temp = doubleHead.getNext();
        boolean flag = false;
        while (true){
            if (temp.getNo() == num){

                break;
            }
            temp = temp.getNext();
        }
        temp.getPre().setNext(temp.getNext());
        if (temp.getNext() != null){
            temp.getNext().setPre(temp.getPre());
        }

    }

}
