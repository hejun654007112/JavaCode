package LinkedList;
/*
    双向链表实体类：在单向单链表的基础上增加增加一个前指针pre，指向节点的前一个节点
 */
public class DoubleHeroNode {
    //人物的编号
    private int no;
    //人物的名字
    private  String name;
    //人物的昵称
    private  String nickName;
    //下一个节点
    private DoubleHeroNode next;
    //前一个节点
    private DoubleHeroNode pre;

    public DoubleHeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public DoubleHeroNode getNext() {
        return next;
    }

    public void setNext(DoubleHeroNode next) {
        this.next = next;
    }

    public DoubleHeroNode getPre() {
        return pre;
    }

    public void setPre(DoubleHeroNode pre) {
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "DoubleHeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
