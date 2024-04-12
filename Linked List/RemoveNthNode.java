//Removing nth node from end 
public class RemoveNthNode{
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
    public int size(){
        if(head == null){
            return -1;
        }
        int sz=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            sz++;
        }
        return sz;
    }
    public void remove (int n){
        int sz = size();
        if (n == sz){
            head = head.next;
            return;
        }
        
        int a=0;
        Node prev=head;
        while (a != sz -n-1){
          prev=prev.next;
          a++;  
        }
    if(n==1){
        tail=prev; 
        prev.next=prev.next.next;
        return;
    }
        prev.next=prev.next.next;


    }
    public void print(){
        Node temp =head;
        while(temp != null){
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }
    
    public static void main(String args[]){
        RemoveNthNode ll = new RemoveNthNode();
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(0);
        System.out.println("Link list before reversing  :  ");
ll.print();
System.out.println("Link list after removing nth node  :  ");
ll.remove(1);
ll.print();
    }
}
