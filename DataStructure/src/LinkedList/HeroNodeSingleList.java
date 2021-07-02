package LinkedList;

import java.util.Stack;

/*
    以带有头结点的单链表的形式存储Person人物信息

 */
public class HeroNodeSingleList {
    //创建头结点
    private SingleHeroNode listHead;

    public HeroNodeSingleList() {
        listHead = new SingleHeroNode(0, "", "");
    }

    public SingleHeroNode getListHead() {
        return listHead;
    }

    //遍历单链表
    public void showSingleList() {

        if (listHead.getNext() == null) {
            System.out.println("链表为空~~~");
            return;
        }
        SingleHeroNode temp = listHead.getNext();
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    //直接在链表的尾部添加元素
    //思路：需要定义一个辅助指针，让他指向链表的最后
    public void addByEnd(SingleHeroNode singleHeroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        SingleHeroNode temp = listHead;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        temp.setNext(singleHeroNode);
    }

    //按序号添加元素,定义辅助指针，指向要添加元素的前一个位置
    public void addByNum(SingleHeroNode singleHeroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        SingleHeroNode temp = listHead;
        while (true) {
            if (temp.getNext() == null) {
                temp.setNext(singleHeroNode);
                return;
            }
            if (singleHeroNode.getNo() >= temp.getNo() && singleHeroNode.getNo() < temp.getNext().getNo()) {
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        singleHeroNode.setNext(temp.getNext());
        temp.setNext(singleHeroNode);
    }

    //按序号修改英雄信息
    public void updateByNum(SingleHeroNode singleHeroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        SingleHeroNode temp = listHead.getNext();
        while (true) {
            if (temp.getNo() == singleHeroNode.getNo()) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setName(singleHeroNode.getName());
        temp.setNickName(singleHeroNode.getNickName());
    }

    //通过序号删除英雄元素
    //辅助指针temp,指向要删除元素的前一个位置
    public void deleteByNum(int num) {
        //定义一个辅助指针temp，初始化指向head节点
        SingleHeroNode temp = listHead;
        while (true) {
            if (temp.getNext().getNo() == num) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
    }

    //需求；求单链表中有效节点的个数，不包含头结点
    //思路：遍历单向链表，创建计数器计数,返回计数器结果
    public int getCount() {
        //定义遍历辅助指针
        SingleHeroNode temp = listHead;
        //计数器
        int count = 0;
        if (temp.getNext() == null) {
            return count;
        }
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
            count++;
        }
        return count;
    }

    //查找单链表中的倒数第 k 个结点
    //思路：获取链表中有效节点的个数size，用size - k 获的要查找的节点位置
    public SingleHeroNode findIndex(int num) {
        int size = getCount() - num;
        if (size <= 0) {
            return null;
        }
        SingleHeroNode temp = listHead.getNext();
        for (int i = 0; i < size; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    //单链表的反转
    //创建新的头结点reverseHead，遍历原来的单链表，依次拿出元素添加到新链表的最前端,弊端，改变了链表原来的结构
    public void reverseList() {
        //判断链表是否是0和1个数据元素，不需要反转，直接返回
        if (listHead.getNext() == null || listHead.getNext().getNext() == null) {
            return;
        }
        //定义一个辅助变量遍历原来链表
        SingleHeroNode cur = listHead.getNext();
        SingleHeroNode next = null;// 指向当前节点[cur]的下一个节点
        SingleHeroNode reverseHead = new SingleHeroNode(0, "", "");
        //遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表 reverseHead 的最前端
        while (cur != null) {
            next = cur.getNext();
            //将cur的下一个节点指向新链表的最前端
            cur.setNext(reverseHead.getNext());
            reverseHead.setNext(cur);
            cur = next;
        }
        listHead.setNext(reverseHead.getNext());
    }
    //单链表的反转
    //利用栈Stack 先进后出的原则实现单链表的反转
    public void reverseListByStack(){
        if (listHead.getNext() == null || listHead.getNext().getNext() == null) {
            return;
        }
        Stack stack = new Stack();
        //遍历链表依次进栈
        SingleHeroNode temp = listHead.getNext();
        while (true){
            if (temp == null){
                break;
            }
            stack.add(temp);
            temp = temp.getNext();
        }
        //遍历出栈
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
    //使用递归删除制定编号元素
    public SingleHeroNode remove(SingleHeroNode head,int val){
        if (head==null){
            return head;
        }
        head.setNext(remove(head.getNext(),val));
        return head.getNo() == val?head.getNext():head;
    }
}
