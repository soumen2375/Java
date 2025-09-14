package Linkedlist.Concepts;
class Main {
    public static void main(String[] args) {
        // Singlylinkedlist list = new Singlylinkedlist();
        // list.insertFirst(5);
        // list.insertFirst(14);
        // list.insertFirst(98);
        // list.insertFirst(74);
        // list.insertFirst(12);
        // list.insertLast(20);
        // list.insertAny(45, 1 );
        // list.display();

       // System.out.println("Deleting item = " + list.deletingFirst());
       // System.out.println("Deleting item = " + list.deletingLast());
       // System.out.println("Deleting item = " + list.deletingAny(2));
      // System.out.println("Find " + list.findNode(980));

      //Doubly LinkedList
    //    Doublylinkedlist dlist = new Doublylinkedlist();
    //     dlist.insertFirst(74);
    //     dlist.insertFirst(12);
    //     dlist.insertFirst(20);
    //     dlist.insertFirst(25);
    //     dlist.insertFirst(5);
    //     dlist.insertLast(100);
    //     dlist.insertAny(500, 2);
    //     dlist.display();
    //

    // Circular LinkedList
    Circularlinkedlist clist = new Circularlinkedlist();
    clist.insertLast(25);
    clist.insertLast(80);
    clist.insertLast(45);
    clist.insertLast(8);
    clist.insertFirst(74);
    clist.insertAny(100, 10);

    clist.display();

    }
}