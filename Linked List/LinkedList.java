public class LinkedList{
  public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
    
    }
    public void addAtIndex(int index, int data){
        Node newNode=new Node (data);
    // when we insert at head
        if(index == 0){
    //         newNode.next=head;
    // head=newNode;
    addFirst(data);
    return;
        }
        int i = 0;
        Node a= head;
        
        while(i != index-1){
            i++;
            a=a.next;
          
        }
        //when we insert at end
        if(a.next == null){
        //     tail.next=newNode;
        // tail = newNode;
        addLast(data);
            return;
        }
        newNode.next = a.next;
        a.next = newNode;
        

    }
    public int deleteFirst(){
        if(head == null){
            System.out.println("Link list is empty!!");
            return -1;
        }
        // size is 1
       else if(head.next == null){
int val =head.data;
head=tail=null;
 return val;
        }
        int val =head.data;
        head=head.next;
        return val;
    }
    public int deleteLast(){
        if(tail==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        else if (head.next == null){
            int val= tail.data;
            head=tail=null;
            return val;
        }
        Node n=head;
        while (n.next != tail){
            n=n.next;
        }
    
        int val =tail.data;
n.next =null;
       tail = n;
       System.out.println("Tail is "+ tail.data);
        return val;

    }
    public int search (int key){
        if(head.data==key){
            return 0;
        }
        Node a =head;
        int i=0;
        while(a!=null){
            if (a.data == key){
                return i;
            }
            else{
                i++;
                a=a.next;
            }
        }
        return -1;
    }
    public static void llTraversal(Node head){// TC = O(n) -- linear TC
        Node a =head;
        if(a == null){
            System.out.println("Link List is empty!!");
        }
        while(a != null){
            System.out.println(a.data);
            a=a.next;
        }
        System.out.println("null");
    }
    // public int searchRec(Node a,int key,int ind){//TC= O(n) and SC=O(n) as call stack 
    // //will occupy the space
    
    //     if(a == null){
    //         return -1;
    //     }
    //     if (a.data == key){
    //         return ind;
    //     }
    //     else {
    //         //  return searchRec(a.next,key,ind++); -- will give 0 as output
    //         return searchRec(a.next,key,++ind);
    //     }
    // }
    //Approach 2 for recursion using helper function TC and SC will be the same in this case also
    public int helper(Node head , int key){
        if(head== null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int ind =helper(head.next,key);
        if(ind == -1){
            return -1;
        }
        return ind +1;
    }
    public int recSearch(Node head, int key){
        return helper(head,key);
    }
    public static void main(String args[]){
       LinkedList ll = new LinkedList();
       ll.addFirst(9);
       ll.addFirst(7);
       ll.addLast(8);
       ll.addLast(5); 
       llTraversal(head);//it is optional to take head as an argument
       // code will work fine ll.addAtIndex(0,45);
       ll.addAtIndex(0,45);
       ll.addAtIndex(5,45);
       ll.addAtIndex(2,45);
       llTraversal(head);
       System.out.println("Deleting first node " + ll.deleteFirst());
       System.out.println("Deleting last node "+ ll.deleteLast());
       llTraversal(head);
       System.out.println("key found at index : " + ll.search(5));
    // System.out.println("Key found at index : "+ ll.searchRec(head,5,0)+ " using recursion");
 System.out.println("Key found at index : "+ ll.recSearch(head,5)+ " using recursion");
    }
}