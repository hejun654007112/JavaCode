package LinkedList;

public class DoubleLinkListDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();


        DoubleHeroNode doubleHeroNode1 = new DoubleHeroNode(1,"林冲","豹子头");
        DoubleHeroNode doubleHeroNode2 = new DoubleHeroNode(2,"卢俊义","玉麒麟");
        DoubleHeroNode doubleHeroNode3 = new DoubleHeroNode(4,"吴用","智多星");
        DoubleHeroNode doubleHeroNode4 = new DoubleHeroNode(5,"鲁智深","花和尚");

        doubleLinkedList.addByEnd(doubleHeroNode1);
        doubleLinkedList.addByEnd(doubleHeroNode2);
        doubleLinkedList.addByEnd(doubleHeroNode3);
        doubleLinkedList.addByEnd(doubleHeroNode4);
        doubleLinkedList.showDoubleList();
        System.out.println("------------------------------------");
        DoubleHeroNode doubleHeroNode5 = new DoubleHeroNode(5,"jun","修仙者");
        doubleLinkedList.update(doubleHeroNode5);
        doubleLinkedList.showDoubleList();
        System.out.println("------------------------------------");
        doubleLinkedList.del(5);
        doubleLinkedList.showDoubleList();
    }
}
