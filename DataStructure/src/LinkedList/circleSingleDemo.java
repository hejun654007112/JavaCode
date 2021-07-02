package LinkedList;

public class circleSingleDemo {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();

        SingleHeroNode singleHeroNode1 = new SingleHeroNode(1,"林冲","豹子头");
        SingleHeroNode singleHeroNode2 = new SingleHeroNode(2,"卢俊义","玉麒麟");
        SingleHeroNode singleHeroNode3 = new SingleHeroNode(3,"吴用","智多星");
        SingleHeroNode singleHeroNode4 = new SingleHeroNode(4,"鲁智深","花和尚");
        SingleHeroNode singleHeroNode5 = new SingleHeroNode(5,"秦明","霹雳火");

        circleSingleLinkedList.addEle(singleHeroNode1);
        circleSingleLinkedList.addEle(singleHeroNode2);
        circleSingleLinkedList.addEle(singleHeroNode3);
        circleSingleLinkedList.addEle(singleHeroNode4);
        circleSingleLinkedList.addEle(singleHeroNode5);
        circleSingleLinkedList.show();
        System.out.println("------------------------------------");
        circleSingleLinkedList.leave(1,2);

    }
}
