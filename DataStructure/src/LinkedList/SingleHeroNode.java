package LinkedList;
/*
    单向链表实体类
 */
public class SingleHeroNode {
    //人物的编号
    private int no;
    //人物的名字
    private  String name;
    //人物的昵称
    private  String nickName;
    //下一个节点
    private SingleHeroNode next;

    public SingleHeroNode() {
    }

    public SingleHeroNode(int no, String name, String nickName) {
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

    public SingleHeroNode getNext() {
        return next;
    }

    public void setNext(SingleHeroNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

}
