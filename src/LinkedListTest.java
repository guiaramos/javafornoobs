public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        list.prepend(3);

        System.out.println(list.toString());
    }
}


