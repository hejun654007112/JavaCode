package circlearray;

public class CirclrArrayDemo {
    public static void main(String[] args) {
        CircleArray circleArray = new CircleArray(4);
        circleArray.add(2);
        circleArray.add(3);
        circleArray.add(4);
        circleArray.show();
        System.out.println("----------------");
        System.out.println(circleArray.get());
        System.out.println(circleArray.get());
        System.out.println("----------------");
        circleArray.add(5);
        circleArray.add(6);
        circleArray.show();
    }
}
