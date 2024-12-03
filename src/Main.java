public class Main {
    public static void main(String[] args) {
        // Create a linked list for Integer values
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        System.out.println("Integer Linked List:");
        intList.display();

        // Remove an element and display again
        intList.remove(200);
        intList.display();

        // Create a linked list for String values
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Helloo");
        stringList.add("World");
        System.out.println("\nString Linked List:");
        stringList.display();

        // Remove an element and display again
        stringList.remove("Helloo");
        stringList.display();
    }
}