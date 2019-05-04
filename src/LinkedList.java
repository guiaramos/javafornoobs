public class LinkedList {

    private Node header;
    private Node lastNode;
    private int size;

    public LinkedList (){
        header = new Node();
        lastNode = header;
    }

    public void prepend(int data){
        Node n = new Node(data);
        if (size == 0){
            header.next = n;
            lastNode = n;
            size++;
        } else{
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    }

    public String toString(){
        Node n = header.next;
        String temp = "";
        while (n != null){
            temp = temp + n.data;
            n = n.next;
        }
        return temp;
    }

    public int getSize(){
        return size;
    }
}
