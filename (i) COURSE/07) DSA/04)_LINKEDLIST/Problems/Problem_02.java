public class Problem_02 {
    // Merge two sorted MyLinkedList objects
    public static MyLinkedList mergeList(MyLinkedList first, MyLinkedList second) {
        MyLinkedList.Node temp1 = first.head;
        MyLinkedList.Node temp2 = second.head;

        MyLinkedList ans = new MyLinkedList();

        while (temp1 != null && temp2 != null) {
            if (temp1.value < temp2.value) {
                ans.insertLast(temp1.value);
                temp1 = temp1.next;
            } else {
                ans.insertLast(temp2.value);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            ans.insertLast(temp1.value);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ans.insertLast(temp2.value);
            temp2 = temp2.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        MyLinkedList first = new MyLinkedList();
        MyLinkedList second = new MyLinkedList();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        MyLinkedList answer = mergeList(first, second);
        answer.display();
    }
}
