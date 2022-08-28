package HW_2_1;

public class MyLinkedList<E> {
    private Node first; //первый э-нт
    private Node last; // последний э-нт

    public MyLinkedList() {
    }

    private void linkToFirstElement(E data){
        final Node<E> first1 = first;
        final Node<E> newNode = new Node(null, data, first1);
        first = newNode;
        if (first1 == null){
            last = newNode;
        }else {
            first1.prev = newNode;
        }
    }

    private void linkToLastElement(E data){
        final Node<E> last1 = last;
        final Node<E> newNode = new Node<>(last1, data, null);
        last = newNode;
        if (last1 == null){
            first = newNode;
        } else {
            last1.next = newNode;
        }
    }

    public void add(E data){
        Node node = new Node();
        node.data = data;
        if(last == null){
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void printList(){
        Node t = this.first;
        while(t != null){
            System.out.println(t.data+" ");
            t = t.next;
        }
        System.out.println();
    }

    public void delete(E data){
        if (first == null){
            return;
        }
        if (first==last){
            first=null;
            last=null;
            return;
        }
        if (first.data == data){
            first=first.next;
            return;
        }
        Node t = this.first;
        while (t.next != null){
            if (t.next.data == data){
                if (last==t.next){
                    last=t;
                }
                t.next=t.next.next;
                return;
            }
            t=t.next;
        }
    }


}

