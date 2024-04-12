public class ReverseLL{
    public static class Node {
        int data ;
        Node next;
        Node(int data){
            this.data= data;
            this.next =null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;
        }
tail.next = newNode;
tail=newNode;

    }
    public void print(){
        Node temp =head;
        while(temp != null){
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }
    public void reverse(){
        Node prev = null;
        Node curr=tail= head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;

        }
        head =prev;
    }
    public static void main(String args[]){
        ReverseLL ll = new ReverseLL();
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(0);
        System.out.println("Link list before reversing  :  ");
ll.print();
System.out.println("Link list after reversing  :  ");
ll.reverse();
ll.print();
    }
}