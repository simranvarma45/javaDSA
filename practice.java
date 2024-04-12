import java.util.Scanner;
public class practice{

public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
public static Node insertAtStart(Node node){
    Node newNode= new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}

public static void main(String args[]){


}        

}
