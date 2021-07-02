package stack;

public class ArraySrackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.pushArray(1);
        arrayStack.pushArray(2);
        arrayStack.pushArray(3);
        arrayStack.pushArray(4);
        arrayStack.pushArray(5);

        System.out.println(arrayStack.popArray());
        System.out.println(arrayStack.popArray());
        System.out.println(arrayStack.popArray());
        System.out.println(arrayStack.popArray());
        System.out.println(arrayStack.popArray());



    }
}
