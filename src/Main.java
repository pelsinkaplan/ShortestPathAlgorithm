public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(3, 7);
        node.data = 0.0;
        node.appendToEnd(1, 10);
        node.appendToEnd(1, 4);
        node.appendToEnd(2, 1);
        node.appendToEnd(5, 2);
        node.appendToEnd(6, 5);
        node.appendToEnd(8, 4);
        node.appendToEnd(8, 9);
        node.appendToEnd(9, 2);
        System.out.println(node.printNodes());
        // End of Example
    }
}
