package HW_2_1;

public class Node<E> {

    Node<E> next;
    Node<E> prev;
    E data;

    public Node(Node<E> prev, E data, Node<E> next) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public Node() {

    }
}
