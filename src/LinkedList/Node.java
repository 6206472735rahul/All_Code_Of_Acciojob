package LinkedList;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }


    public static void main(String[] args) {
        Node n1= new Node(1);
       // System.out.print(n1.data+" "+n1.next); 1 null
        Node n2= new Node(2);
        Node n3= new Node(3);
        n1.next=n2;
        n2.next=n3;
        System.out.println(n1.data+" "+n1.next.data);// 1 2
        System.out.println(n1.data+" "+n1.next);//  1 LinkedList.Node@12edcd21
        System.out.println(n1.data+" "+n1.next.data+" "+ n1.next.next.data);//1 2 3
    }
}
