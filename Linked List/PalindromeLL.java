public class PalindromeLL{
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
    public Node findMid(){
        // we used slow and fast pointer approach here
        //in which slow pointer (turtle) will incr by 1 
        // and fast pointer (hare) will incr by 2
        Node slow =head;
        Node fast =head;
        while(fast != null && fast.next != null){// for both odd and even case
slow = slow.next;
fast = fast.next.next;
    }
    return slow; 
    }
    public boolean palindrome(){
        if (head.next == null || head == null){
            return true;
        }
Node mid = findMid();
Node prev=null;
Node curr=mid;
Node next;
while(curr!= null){
  next =  curr.next ;
  curr.next=prev;
  prev =curr;
   curr=next;
}
Node left =head;
Node right = prev;
while(right != null){
    if(left.data != right.data){
        return false;
    }
    right=right.next;
prev = prev.next;
}
return true;
    }
    public void print(){
        Node temp =head;
        while(temp != null){
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }
    
    public static void main(String args[]){
        PalindromeLL ll = new PalindromeLL();
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(3);
        ll.print();
        System.out.println( ll.palindrome());

    }
}