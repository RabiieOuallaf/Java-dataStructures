// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //new StackDS();
        //new QueueDS();
        //new LinkedListDS();
        DynamicArrayDS dynamicArray = new DynamicArrayDS();
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        dynamicArray.insert(0,"x");

        System.out.println(dynamicArray);

    }
}