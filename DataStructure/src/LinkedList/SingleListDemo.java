package LinkedList;

public class SingleListDemo {
    public static void main(String[] args) {

        //创建单链表
        HeroNodeSingleList singleList = new HeroNodeSingleList();


        SingleHeroNode singleHeroNode1 = new SingleHeroNode(1,"林冲","豹子头");
        SingleHeroNode singleHeroNode2 = new SingleHeroNode(2,"卢俊义","玉麒麟");
        SingleHeroNode singleHeroNode3 = new SingleHeroNode(4,"吴用","智多星");
        SingleHeroNode singleHeroNode4 = new SingleHeroNode(7,"鲁智深","花和尚");
        singleList.addByEnd(singleHeroNode1);
        singleList.addByEnd(singleHeroNode2);
        singleList.addByEnd(singleHeroNode3);
        singleList.addByEnd(singleHeroNode4);
        singleList.showSingleList();
        System.out.println("------------------------------------");
        SingleHeroNode singleHeroNode5 = new SingleHeroNode(0,"秦明","霹雳火");
        singleList.addByNum(singleHeroNode5);
        singleList.showSingleList();
        System.out.println("------------------------------------");
////        SingleHeroNode singleHeroNode6 = new SingleHeroNode(0,"jun","修仙者");
////        singleList.updateByNum(singleHeroNode6);
////        singleList.showSingleList();
//        System.out.println("------------------------------------");
////        singleList.deleteByNum(4);
////        singleList.deleteByNum(2);
//        singleList.showSingleList();
//        System.out.println("有效数据个数为：" + singleList.getCount());
//        System.out.println(singleList.findIndex(0));
//        System.out.println("------------------------------------");
////        singleList.reverseList();
////        singleList.showSingleList();
//        System.out.println("------------------------------------");
//        singleList.reverseListByStack();
//        System.out.println("------------------------------------");
//        singleList.remove(singleList.getListHead(),4);
//        singleList.showSingleList();
    }
}
