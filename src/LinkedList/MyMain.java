package LinkedList;

public class MyMain {
    static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);
        n1.next=n2;
        n2.next=n3;
        printLL(n1);
    }
}
