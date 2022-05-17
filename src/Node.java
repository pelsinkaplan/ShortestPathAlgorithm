public class Node {

    Node following = null;
    double data;
    double x;
    double y;

    public Node(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void appendToEnd(int x, int y) {
        Node end = new Node(x, y); // added node
        Node n = this; // head node
        end.data = Math.sqrt(Math.pow((n.x - x), 2) + Math.pow((n.y - y), 2));

        while (n.following != null) {
            n = n.following;
        }
        n.following = end;
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    public String printNodes() {
        StringBuilder shortestPath = new StringBuilder("Factory(3, 7)");
        Node head = this;

        Node tempNode = head.following;
        while (tempNode != null) {
            String stringPath = String.format("%.5f", tempNode.data);
            shortestPath.append("\nCustomer(").append(tempNode.x).append(", ").append(tempNode.y).append(") -> ").append(stringPath).append(")");
            tempNode = tempNode.following;
        }
        return shortestPath.toString() + "\n" + sumOfNodes();
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    int length() {
        int length = 0;
        Node tempNode = this;
        while (tempNode != null) {
            length++;
            tempNode = tempNode.following;
        }
        return length;
    }

    // TODO:: Implement to return the sum of the Nodes
    double sumOfNodes() {
        double sumOfNodes = 0.0;
        Node tempNode = this;
        while (tempNode != null) {
            sumOfNodes += tempNode.data;
            tempNode = tempNode.following;
        }
        return sumOfNodes;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.following;
        }
        // TODO:: Implement the proper loop in order to remove given data

        //
        return head;
    }
}